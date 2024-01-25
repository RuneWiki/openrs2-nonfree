import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public int anInt3082;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
	private int anInt3089;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	private int anInt3092;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Z")
	public boolean aBoolean252 = false;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	private int anInt3080 = 0;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "Lclient!vj;")
	public Class350 aClass350_1 = new Class350();

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!vj;")
	private Class350 aClass350_2 = new Class350();

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "J")
	private final long aLong90;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!tk;")
	public final Class323 aClass323_1;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!gp;")
	public final Class9_Sub6 aClass9_Sub6_4;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!wf;")
	public Class361 aClass361_1;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "Lclient!sk;")
	public final Class309 aClass309_6;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!r;Lclient!tk;Lclient!gp;J)V")
	public Class9_Sub3(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class323 arg1, @OriginalArg(2) Class9_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aLong90 = arg3;
		this.aClass323_1 = arg1;
		this.aClass9_Sub6_4 = arg2;
		this.aClass361_1 = this.aClass323_1.method6829();
		if (!arg0.method7211() && this.aClass361_1.anInt9287 != -1) {
			this.aClass361_1 = Static90.method2037(this.aClass361_1.anInt9287);
		}
		this.aClass309_6 = new Class309();
		this.anInt3080 = (int) ((double) this.anInt3080 + Math.random() * 64.0D);
		this.method2760();
		this.aClass350_2.anInt9018 = this.aClass350_1.anInt9018;
		this.aClass350_2.anInt9021 = this.aClass350_1.anInt9021;
		this.aClass350_2.anInt9019 = this.aClass350_1.anInt9019;
		this.aClass350_2.anInt9015 = this.aClass350_1.anInt9015;
		this.aClass350_2.anInt9012 = this.aClass350_1.anInt9012;
		this.aClass350_2.anInt9016 = this.aClass350_1.anInt9016;
		this.aClass350_2.anInt9023 = this.aClass350_1.anInt9023;
		this.aClass350_2.anInt9017 = this.aClass350_1.anInt9017;
		this.aClass350_2.anInt9010 = this.aClass350_1.anInt9010;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method2760() {
		this.aClass350_1.anInt9019 = this.aClass323_1.anInt8093;
		this.aClass350_1.anInt9015 = this.aClass323_1.anInt8094;
		this.aClass350_1.anInt9017 = this.aClass323_1.anInt8107;
		this.aClass350_1.anInt9012 = this.aClass323_1.anInt8108;
		this.aClass350_1.anInt9016 = this.aClass323_1.anInt8098;
		this.aClass350_1.anInt9010 = this.aClass323_1.anInt8109;
		this.aClass350_1.anInt9023 = this.aClass323_1.anInt8092;
		this.aClass350_1.anInt9021 = this.aClass323_1.anInt8104;
		this.aClass350_1.anInt9018 = this.aClass323_1.anInt8101;
		if (this.aClass350_1.anInt9017 == this.aClass350_1.anInt9018 && this.aClass350_1.anInt9023 == this.aClass350_1.anInt9018 && this.aClass350_1.anInt9015 == this.aClass350_1.anInt9016 && this.aClass350_1.anInt9012 == this.aClass350_1.anInt9015 && this.aClass350_1.anInt9010 == this.aClass350_1.anInt9019 && this.aClass350_1.anInt9010 == this.aClass350_1.anInt9021) {
			this.aBoolean253 = true;
		} else if (this.aBoolean253) {
			this.aClass350_2.anInt9010 = this.aClass350_1.anInt9010;
			this.aClass350_2.anInt9021 = this.aClass350_1.anInt9021;
			this.aClass350_2.anInt9019 = this.aClass350_1.anInt9019;
			this.aClass350_2.anInt9015 = this.aClass350_1.anInt9015;
			this.aClass350_2.anInt9018 = this.aClass350_1.anInt9018;
			this.aClass350_2.anInt9012 = this.aClass350_1.anInt9012;
			this.aBoolean253 = false;
			this.aClass350_2.anInt9023 = this.aClass350_1.anInt9023;
			this.aClass350_2.anInt9017 = this.aClass350_1.anInt9017;
			this.aClass350_2.anInt9016 = this.aClass350_1.anInt9016;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!r;BJ)V")
	public void method2763(@OriginalArg(0) Class43 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(11) Class9_Sub8_Sub2_Sub1 local11 = (Class9_Sub8_Sub2_Sub1) this.aClass309_6.method6590(); local11 != null; local11 = (Class9_Sub8_Sub2_Sub1) this.aClass309_6.method6594()) {
			local11.method5343(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZJILclient!r;I)V")
	public void method2764(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3) {
		@Pc(33) int local33;
		if (this.aBoolean252) {
			arg0 = false;
		} else if (Static190.anInt3685 < this.aClass361_1.anInt9244) {
			arg0 = false;
		} else if (Static32.anInt719 > Static467.anIntArray592[Static190.anInt3685]) {
			arg0 = false;
		} else if (this.aBoolean253) {
			arg0 = false;
		} else if (this.aClass361_1.anInt9293 != -1) {
			local33 = (int) (arg1 - this.aLong90);
			if (this.aClass361_1.aBoolean718 || local33 <= this.aClass361_1.anInt9293) {
				local33 %= this.aClass361_1.anInt9293;
			} else {
				arg0 = false;
			}
			if (!this.aClass361_1.aBoolean715 && local33 < this.aClass361_1.anInt9250) {
				arg0 = false;
			}
			if (this.aClass361_1.aBoolean715 && this.aClass361_1.anInt9250 <= local33) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static573.anInt9160++;
			local33 = (this.aClass350_1.anInt9017 + this.aClass350_1.anInt9018 + this.aClass350_1.anInt9023) / 3;
			@Pc(137) int local137 = (this.aClass350_1.anInt9012 + this.aClass350_1.anInt9016 + this.aClass350_1.anInt9015) / 3;
			@Pc(151) int local151 = (this.aClass350_1.anInt9019 + this.aClass350_1.anInt9010 + this.aClass350_1.anInt9021) / 3;
			@Pc(187) int local187;
			@Pc(196) int local196;
			@Pc(205) int local205;
			@Pc(214) int local214;
			@Pc(222) int local222;
			@Pc(231) int local231;
			@Pc(334) int local334;
			@Pc(387) int local387;
			@Pc(408) int local408;
			if (this.aClass350_1.anInt9022 != local33 || this.aClass350_1.anInt9013 != local137 || local151 != this.aClass350_1.anInt9014) {
				this.aClass350_1.anInt9022 = local33;
				this.aClass350_1.anInt9013 = local137;
				this.aClass350_1.anInt9014 = local151;
				local187 = this.aClass350_1.anInt9018 - this.aClass350_1.anInt9017;
				local196 = this.aClass350_1.anInt9015 - this.aClass350_1.anInt9016;
				local205 = this.aClass350_1.anInt9010 - this.aClass350_1.anInt9019;
				local214 = this.aClass350_1.anInt9023 - this.aClass350_1.anInt9017;
				local222 = this.aClass350_1.anInt9012 - this.aClass350_1.anInt9016;
				local231 = this.aClass350_1.anInt9021 - this.aClass350_1.anInt9019;
				this.anInt3089 = local187 * local222 - local196 * local214;
				this.anInt3088 = local214 * local205 - local231 * local187;
				this.anInt3092 = local231 * local196 - local222 * local205;
				while (true) {
					if (this.anInt3092 <= 32767 && this.anInt3088 <= 32767 && this.anInt3089 <= 32767 && this.anInt3092 >= -32767 && this.anInt3088 >= -32767 && this.anInt3089 >= -32767) {
						local334 = (int) Math.sqrt((double) (this.anInt3089 * this.anInt3089 + this.anInt3092 * this.anInt3092 + this.anInt3088 * this.anInt3088));
						if (local334 <= 0) {
							local334 = 1;
						}
						this.anInt3088 = this.anInt3088 * 32767 / local334;
						this.anInt3089 = this.anInt3089 * 32767 / local334;
						this.anInt3092 = this.anInt3092 * 32767 / local334;
						if (this.aClass361_1.aShort122 > 0 || this.aClass361_1.aShort121 > 0) {
							local387 = (int) (Math.atan2((double) this.anInt3089, (double) this.anInt3092) * 2607.5945876176133D);
							local408 = (int) (Math.atan2((double) this.anInt3088, Math.sqrt((double) (this.anInt3089 * this.anInt3089 + this.anInt3092 * this.anInt3092))) * 2607.5945876176133D);
							this.anInt3094 = this.aClass361_1.aShort122 - this.aClass361_1.aShort124;
							this.anInt3090 = local387 + this.aClass361_1.aShort124 - (this.anInt3094 >> 1);
							this.anInt3093 = this.aClass361_1.aShort121 - this.aClass361_1.aShort123;
							this.anInt3091 = this.aClass361_1.aShort123 + local408 - (this.anInt3093 >> 1);
						}
						break;
					}
					this.anInt3092 >>= 0x1;
					this.anInt3089 >>= 0x1;
					this.anInt3088 >>= 0x1;
				}
			}
			this.anInt3080 += (int) (((double) (this.aClass361_1.anInt9269 - this.aClass361_1.anInt9278) * Math.random() + (double) this.aClass361_1.anInt9278) * (double) arg2);
			if (this.anInt3080 > 63) {
				local187 = this.anInt3080 >> 6;
				this.anInt3080 &= 0x3F;
				for (local222 = 0; local222 < local187; local222++) {
					@Pc(553) int local553;
					@Pc(557) int local557;
					if (this.aClass361_1.aShort122 <= 0 && this.aClass361_1.aShort121 <= 0) {
						local214 = this.anInt3089;
						local205 = this.anInt3088;
						local196 = this.anInt3092;
					} else {
						local231 = (int) (Math.random() * (double) this.anInt3094) + this.anInt3090;
						local231 &= 0x3FFF;
						local334 = Class3_Sub17.anIntArray175[local231];
						local387 = Class3_Sub17.anIntArray177[local231];
						local408 = (int) (Math.random() * (double) this.anInt3093) + this.anInt3091;
						local408 &= 0x1FFF;
						local553 = Class3_Sub17.anIntArray175[local408];
						local557 = Class3_Sub17.anIntArray177[local408];
						local205 = (local557 << 1) * -1;
						local196 = local553 * local387 >> 13;
						local214 = local334 * local553 >> 13;
					}
					@Pc(591) float local591 = (float) Math.random();
					@Pc(594) float local594 = (float) Math.random();
					if (local591 + local594 > 1.0F) {
						local591 = 1.0F - local591;
						local594 = 1.0F - local594;
					}
					@Pc(616) float local616 = 1.0F - local594 - local591;
					local408 = (int) ((float) this.aClass350_1.anInt9023 * local616 + (float) this.aClass350_1.anInt9018 * local594 + local591 * (float) this.aClass350_1.anInt9017);
					local553 = (int) ((float) this.aClass350_1.anInt9015 * local594 + local591 * (float) this.aClass350_1.anInt9016 + local616 * (float) this.aClass350_1.anInt9012);
					local557 = (int) (local594 * (float) this.aClass350_1.anInt9010 + local591 * (float) this.aClass350_1.anInt9019 + local616 * (float) this.aClass350_1.anInt9021);
					@Pc(704) int local704 = (int) (local616 * (float) this.aClass350_2.anInt9023 + (float) this.aClass350_2.anInt9017 * local591 + local594 * (float) this.aClass350_2.anInt9018);
					@Pc(726) int local726 = (int) ((float) this.aClass350_2.anInt9012 * local616 + local591 * (float) this.aClass350_2.anInt9016 + (float) this.aClass350_2.anInt9015 * local594);
					@Pc(748) int local748 = (int) (local616 * (float) this.aClass350_2.anInt9021 + local591 * (float) this.aClass350_2.anInt9019 + local594 * (float) this.aClass350_2.anInt9010);
					@Pc(753) int local753 = local408 - local704;
					@Pc(758) int local758 = local553 - local726;
					@Pc(762) int local762 = local557 - local748;
					@Pc(771) int local771 = (int) ((double) local753 * Math.random() + (double) local704);
					@Pc(780) int local780 = (int) ((double) local726 + (double) local758 * Math.random());
					@Pc(789) int local789 = (int) ((double) local748 + (double) local762 * Math.random());
					@Pc(805) int local805 = (int) (Math.random() * (double) (this.aClass361_1.anInt9243 - this.aClass361_1.anInt9279)) + this.aClass361_1.anInt9279;
					@Pc(823) int local823 = this.aClass361_1.anInt9242 + (int) ((double) (this.aClass361_1.anInt9262 - this.aClass361_1.anInt9242) * Math.random());
					@Pc(841) int local841 = this.aClass361_1.anInt9289 + (int) (Math.random() * (double) (this.aClass361_1.anInt9267 - this.aClass361_1.anInt9289));
					@Pc(905) int local905;
					if (this.aClass361_1.aBoolean717) {
						@Pc(847) double local847 = Math.random();
						local905 = (int) ((double) this.aClass361_1.anInt9257 + local847 * (double) this.aClass361_1.anInt9275) << 16 | (int) ((double) this.aClass361_1.anInt9266 + (double) this.aClass361_1.anInt9274 * local847) << 8 | (int) ((double) this.aClass361_1.anInt9280 + local847 * (double) this.aClass361_1.anInt9253) | (int) ((double) this.aClass361_1.anInt9264 * Math.random() + (double) this.aClass361_1.anInt9296) << 24;
					} else {
						local905 = (int) ((double) this.aClass361_1.anInt9296 + (double) this.aClass361_1.anInt9264 * Math.random()) << 24 | (int) (Math.random() * (double) this.aClass361_1.anInt9275 + (double) this.aClass361_1.anInt9257) << 16 | (int) ((double) this.aClass361_1.anInt9274 * Math.random() + (double) this.aClass361_1.anInt9266) << 8 | (int) (Math.random() * (double) this.aClass361_1.anInt9253 + (double) this.aClass361_1.anInt9280);
					}
					@Pc(969) int local969 = this.aClass361_1.anInt9249;
					if (!arg3.method7211() && !this.aClass361_1.aBoolean719) {
						local969 = -1;
					}
					if (Static193.anInt3727 == Static374.anInt6347) {
						new Class9_Sub8_Sub2_Sub1(this, local771, local780, local789, local196, local205, local214, local805, local823, local905, local841, local969, this.aClass361_1.aBoolean720, this.aClass361_1.aBoolean716);
					} else {
						@Pc(989) Class9_Sub8_Sub2_Sub1 local989 = Static574.aClass9_Sub8_Sub2_Sub1Array2[Static193.anInt3727];
						Static193.anInt3727 = Static193.anInt3727 + 1 & 0x3FF;
						local989.method5340(this, local771, local780, local789, local196, local205, local214, local805, local823, local905, local841, local969, this.aClass361_1.aBoolean720, this.aClass361_1.aBoolean716);
					}
				}
			}
		}
		if (!this.aClass350_1.method7495(this.aClass350_2)) {
			@Pc(1057) Class350 local1057 = this.aClass350_2;
			this.aClass350_2 = this.aClass350_1;
			this.aClass350_1 = local1057;
			this.aClass350_1.anInt9018 = this.aClass323_1.anInt8101;
			this.aClass350_1.anInt9023 = this.aClass323_1.anInt8092;
			this.aClass350_1.anInt9012 = this.aClass323_1.anInt8108;
			this.aClass350_1.anInt9019 = this.aClass323_1.anInt8093;
			this.aClass350_1.anInt9021 = this.aClass323_1.anInt8104;
			this.aClass350_1.anInt9016 = this.aClass323_1.anInt8098;
			this.aClass350_1.anInt9015 = this.aClass323_1.anInt8094;
			this.aClass350_1.anInt9010 = this.aClass323_1.anInt8109;
			this.aClass350_1.anInt9017 = this.aClass323_1.anInt8107;
		}
		this.anInt3082 = 0;
		for (@Pc(1127) Class9_Sub8_Sub2_Sub1 local1127 = (Class9_Sub8_Sub2_Sub1) this.aClass309_6.method6590(); local1127 != null; local1127 = (Class9_Sub8_Sub2_Sub1) this.aClass309_6.method6594()) {
			local1127.method5339(arg1, arg2);
			this.anInt3082++;
		}
		Static135.anInt2895 += this.anInt3082;
	}
}
