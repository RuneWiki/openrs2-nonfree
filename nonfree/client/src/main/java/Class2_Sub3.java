import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!bia", name = "v", descriptor = "I")
	public int anInt1002;

	@OriginalMember(owner = "client!bia", name = "G", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!bia", name = "H", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!bia", name = "I", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!bia", name = "J", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!bia", name = "K", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!bia", name = "M", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!bia", name = "N", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!bia", name = "u", descriptor = "I")
	private int anInt1001 = 0;

	@OriginalMember(owner = "client!bia", name = "o", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bia", name = "s", descriptor = "Lclient!tea;")
	public Class334 aClass334_1 = new Class334();

	@OriginalMember(owner = "client!bia", name = "D", descriptor = "Lclient!tea;")
	private Class334 aClass334_2 = new Class334();

	@OriginalMember(owner = "client!bia", name = "L", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bia", name = "w", descriptor = "J")
	private final long aLong28;

	@OriginalMember(owner = "client!bia", name = "q", descriptor = "Lclient!ju;")
	public final Class2_Sub8 aClass2_Sub8_1;

	@OriginalMember(owner = "client!bia", name = "p", descriptor = "Lclient!fba;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!bia", name = "x", descriptor = "Lclient!gda;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!bia", name = "n", descriptor = "Lclient!bt;")
	public final Class43 aClass43_1;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!ha;Lclient!fba;Lclient!ju;J)V")
	public Class2_Sub3(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class2_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aLong28 = arg3;
		this.aClass2_Sub8_1 = arg2;
		this.aClass100_1 = arg1;
		this.aClass117_1 = this.aClass100_1.method2132();
		if (!arg0.method7433() && this.aClass117_1.anInt2956 != -1) {
			this.aClass117_1 = Static169.method2432(this.aClass117_1.anInt2956);
		}
		this.aClass43_1 = new Class43();
		this.anInt1001 = (int) ((double) this.anInt1001 + Math.random() * 64.0D);
		this.method953();
		this.aClass334_2.anInt9371 = this.aClass334_1.anInt9371;
		this.aClass334_2.anInt9373 = this.aClass334_1.anInt9373;
		this.aClass334_2.anInt9372 = this.aClass334_1.anInt9372;
		this.aClass334_2.anInt9383 = this.aClass334_1.anInt9383;
		this.aClass334_2.anInt9374 = this.aClass334_1.anInt9374;
		this.aClass334_2.anInt9380 = this.aClass334_1.anInt9380;
		this.aClass334_2.anInt9379 = this.aClass334_1.anInt9379;
		this.aClass334_2.anInt9376 = this.aClass334_1.anInt9376;
		this.aClass334_2.anInt9385 = this.aClass334_1.anInt9385;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
	public void method953() {
		this.aClass334_1.anInt9383 = this.aClass100_1.anInt2502;
		this.aClass334_1.anInt9379 = this.aClass100_1.anInt2512;
		this.aClass334_1.anInt9380 = this.aClass100_1.anInt2513;
		this.aClass334_1.anInt9385 = this.aClass100_1.anInt2498;
		this.aClass334_1.anInt9371 = this.aClass100_1.anInt2504;
		this.aClass334_1.anInt9374 = this.aClass100_1.anInt2509;
		this.aClass334_1.anInt9373 = this.aClass100_1.anInt2501;
		this.aClass334_1.anInt9376 = this.aClass100_1.anInt2505;
		this.aClass334_1.anInt9372 = this.aClass100_1.anInt2500;
		if (this.aClass334_1.anInt9371 == this.aClass334_1.anInt9380 && this.aClass334_1.anInt9371 == this.aClass334_1.anInt9372 && this.aClass334_1.anInt9383 == this.aClass334_1.anInt9379 && this.aClass334_1.anInt9383 == this.aClass334_1.anInt9374 && this.aClass334_1.anInt9373 == this.aClass334_1.anInt9376 && this.aClass334_1.anInt9376 == this.aClass334_1.anInt9385) {
			this.aBoolean48 = true;
		} else if (this.aBoolean48) {
			this.aClass334_2.anInt9372 = this.aClass334_1.anInt9372;
			this.aClass334_2.anInt9373 = this.aClass334_1.anInt9373;
			this.aClass334_2.anInt9379 = this.aClass334_1.anInt9379;
			this.aClass334_2.anInt9385 = this.aClass334_1.anInt9385;
			this.aClass334_2.anInt9374 = this.aClass334_1.anInt9374;
			this.aClass334_2.anInt9383 = this.aClass334_1.anInt9383;
			this.aClass334_2.anInt9371 = this.aClass334_1.anInt9371;
			this.aClass334_2.anInt9376 = this.aClass334_1.anInt9376;
			this.aBoolean48 = false;
			this.aClass334_2.anInt9380 = this.aClass334_1.anInt9380;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IJLclient!ha;ZB)V")
	public void method954(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(37) int local37;
		if (this.aBoolean46) {
			arg3 = false;
		} else if (Static27.anInt7651 < this.aClass117_1.anInt2914) {
			arg3 = false;
		} else if (Static88.anInt1693 > Static283.anIntArray275[Static27.anInt7651]) {
			arg3 = false;
		} else if (this.aBoolean48) {
			arg3 = false;
		} else if (this.aClass117_1.anInt2964 != -1) {
			local37 = (int) (arg1 - this.aLong28);
			if (this.aClass117_1.aBoolean177 || this.aClass117_1.anInt2964 >= local37) {
				local37 %= this.aClass117_1.anInt2964;
			} else {
				arg3 = false;
			}
			if (!this.aClass117_1.aBoolean178 && this.aClass117_1.anInt2949 > local37) {
				arg3 = false;
			}
			if (this.aClass117_1.aBoolean178 && local37 >= this.aClass117_1.anInt2949) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static568.anInt9425++;
			local37 = (this.aClass334_1.anInt9372 + this.aClass334_1.anInt9380 + this.aClass334_1.anInt9371) / 3;
			@Pc(146) int local146 = (this.aClass334_1.anInt9379 + this.aClass334_1.anInt9383 + this.aClass334_1.anInt9374) / 3;
			@Pc(160) int local160 = (this.aClass334_1.anInt9385 + this.aClass334_1.anInt9373 + this.aClass334_1.anInt9376) / 3;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(218) int local218;
			@Pc(227) int local227;
			@Pc(236) int local236;
			@Pc(245) int local245;
			@Pc(347) int local347;
			@Pc(397) int local397;
			@Pc(418) int local418;
			if (local37 != this.aClass334_1.anInt9375 || this.aClass334_1.anInt9381 != local146 || local160 != this.aClass334_1.anInt9377) {
				this.aClass334_1.anInt9381 = local146;
				this.aClass334_1.anInt9377 = local160;
				this.aClass334_1.anInt9375 = local37;
				local200 = this.aClass334_1.anInt9371 - this.aClass334_1.anInt9380;
				local209 = this.aClass334_1.anInt9383 - this.aClass334_1.anInt9379;
				local218 = this.aClass334_1.anInt9376 - this.aClass334_1.anInt9373;
				local227 = this.aClass334_1.anInt9372 - this.aClass334_1.anInt9380;
				local236 = this.aClass334_1.anInt9374 - this.aClass334_1.anInt9379;
				local245 = this.aClass334_1.anInt9385 - this.aClass334_1.anInt9373;
				this.anInt1011 = local236 * local200 - local227 * local209;
				this.anInt1008 = local245 * local209 - local218 * local236;
				this.anInt1010 = local227 * local218 - local245 * local200;
				while (true) {
					if (this.anInt1008 <= 32767 && this.anInt1010 <= 32767 && this.anInt1011 <= 32767 && this.anInt1008 >= -32767 && this.anInt1010 >= -32767 && this.anInt1011 >= -32767) {
						local347 = (int) Math.sqrt((double) (this.anInt1008 * this.anInt1008 + this.anInt1010 * this.anInt1010 + this.anInt1011 * this.anInt1011));
						if (local347 <= 0) {
							local347 = 1;
						}
						this.anInt1008 = this.anInt1008 * 32767 / local347;
						this.anInt1011 = this.anInt1011 * 32767 / local347;
						this.anInt1010 = this.anInt1010 * 32767 / local347;
						if (this.aClass117_1.aShort47 > 0 || this.aClass117_1.aShort44 > 0) {
							local397 = (int) (Math.atan2((double) this.anInt1011, (double) this.anInt1008) * 2607.5945876176133D);
							local418 = (int) (Math.atan2((double) this.anInt1010, Math.sqrt((double) (this.anInt1011 * this.anInt1011 + this.anInt1008 * this.anInt1008))) * 2607.5945876176133D);
							this.anInt1012 = this.aClass117_1.aShort47 - this.aClass117_1.aShort45;
							this.anInt1006 = this.aClass117_1.aShort44 - this.aClass117_1.aShort46;
							this.anInt1009 = local397 + this.aClass117_1.aShort45 - (this.anInt1012 >> 1);
							this.anInt1007 = this.aClass117_1.aShort46 + local418 - (this.anInt1006 >> 1);
						}
						break;
					}
					this.anInt1008 >>= 0x1;
					this.anInt1011 >>= 0x1;
					this.anInt1010 >>= 0x1;
				}
			}
			this.anInt1001 += (int) ((double) arg0 * ((double) this.aClass117_1.anInt2936 + (double) (this.aClass117_1.anInt2953 - this.aClass117_1.anInt2936) * Math.random()));
			if (this.anInt1001 > 63) {
				local200 = this.anInt1001 >> 6;
				this.anInt1001 &= 0x3F;
				for (local236 = 0; local236 < local200; local236++) {
					@Pc(562) int local562;
					@Pc(566) int local566;
					if (this.aClass117_1.aShort47 <= 0 && this.aClass117_1.aShort44 <= 0) {
						local209 = this.anInt1008;
						local218 = this.anInt1010;
						local227 = this.anInt1011;
					} else {
						local245 = this.anInt1009 + (int) ((double) this.anInt1012 * Math.random());
						local245 &= 0x3FFF;
						local347 = Class6_Sub1_Sub3.anIntArray56[local245];
						local397 = Class6_Sub1_Sub3.anIntArray58[local245];
						local418 = this.anInt1007 + (int) ((double) this.anInt1006 * Math.random());
						local418 &= 0x1FFF;
						local562 = Class6_Sub1_Sub3.anIntArray56[local418];
						local566 = Class6_Sub1_Sub3.anIntArray58[local418];
						local209 = local562 * local397 >> 13;
						local218 = (local566 << 1) * -1;
						local227 = local347 * local562 >> 13;
					}
					@Pc(600) float local600 = (float) Math.random();
					@Pc(603) float local603 = (float) Math.random();
					if (local600 + local603 > 1.0F) {
						local603 = 1.0F - local603;
						local600 = 1.0F - local600;
					}
					@Pc(623) float local623 = 1.0F - local600 - local603;
					local418 = (int) ((float) this.aClass334_1.anInt9372 * local623 + local600 * (float) this.aClass334_1.anInt9380 + (float) this.aClass334_1.anInt9371 * local603);
					local562 = (int) ((float) this.aClass334_1.anInt9383 * local603 + local600 * (float) this.aClass334_1.anInt9379 + (float) this.aClass334_1.anInt9374 * local623);
					local566 = (int) ((float) this.aClass334_1.anInt9376 * local603 + local600 * (float) this.aClass334_1.anInt9373 + local623 * (float) this.aClass334_1.anInt9385);
					@Pc(711) int local711 = (int) ((float) this.aClass334_2.anInt9372 * local623 + (float) this.aClass334_2.anInt9371 * local603 + (float) this.aClass334_2.anInt9380 * local600);
					@Pc(733) int local733 = (int) (local600 * (float) this.aClass334_2.anInt9379 + local603 * (float) this.aClass334_2.anInt9383 + local623 * (float) this.aClass334_2.anInt9374);
					@Pc(755) int local755 = (int) ((float) this.aClass334_2.anInt9376 * local603 + local600 * (float) this.aClass334_2.anInt9373 + (float) this.aClass334_2.anInt9385 * local623);
					@Pc(760) int local760 = local418 - local711;
					@Pc(765) int local765 = local562 - local733;
					@Pc(769) int local769 = local566 - local755;
					@Pc(778) int local778 = (int) ((double) local711 + Math.random() * (double) local760);
					@Pc(787) int local787 = (int) ((double) local733 + (double) local765 * Math.random());
					@Pc(796) int local796 = (int) (Math.random() * (double) local769 + (double) local755);
					@Pc(813) int local813 = (int) (Math.random() * (double) (this.aClass117_1.anInt2929 - this.aClass117_1.anInt2958)) + this.aClass117_1.anInt2958;
					@Pc(830) int local830 = (int) (Math.random() * (double) (this.aClass117_1.anInt2927 - this.aClass117_1.anInt2930)) + this.aClass117_1.anInt2930;
					@Pc(846) int local846 = (int) ((double) (this.aClass117_1.anInt2939 - this.aClass117_1.lb) * Math.random()) + this.aClass117_1.lb;
					@Pc(908) int local908;
					if (this.aClass117_1.aBoolean180) {
						@Pc(912) double local912 = Math.random();
						local908 = (int) ((double) this.aClass117_1.anInt2924 * Math.random() + (double) this.aClass117_1.anInt2943) << 24 | (int) ((double) this.aClass117_1.anInt2910 + local912 * (double) this.aClass117_1.anInt2913) << 8 | (int) (local912 * (double) this.aClass117_1.anInt2945 + (double) this.aClass117_1.anInt2917) << 16 | (int) ((double) this.aClass117_1.anInt2941 * local912 + (double) this.aClass117_1.anInt2937);
					} else {
						local908 = (int) ((double) this.aClass117_1.anInt2924 * Math.random() + (double) this.aClass117_1.anInt2943) << 24 | (int) (Math.random() * (double) this.aClass117_1.anInt2913 + (double) this.aClass117_1.anInt2910) << 8 | (int) ((double) this.aClass117_1.anInt2917 + Math.random() * (double) this.aClass117_1.anInt2945) << 16 | (int) ((double) this.aClass117_1.anInt2941 * Math.random() + (double) this.aClass117_1.anInt2937);
					}
					@Pc(974) int local974 = this.aClass117_1.anInt2920;
					if (!arg2.method7433() && !this.aClass117_1.aBoolean176) {
						local974 = -1;
					}
					if (Static304.anInt5175 == Static69.anInt1273) {
						new Class2_Sub6_Sub1_Sub1(this, local778, local787, local796, local209, local218, local227, local813, local830, local908, local846, local974, this.aClass117_1.aBoolean182, this.aClass117_1.aBoolean184);
					} else {
						@Pc(994) Class2_Sub6_Sub1_Sub1 local994 = Static143.aClass2_Sub6_Sub1_Sub1Array1[Static304.anInt5175];
						Static304.anInt5175 = Static304.anInt5175 + 1 & 0x3FF;
						local994.method2280(this, local778, local787, local796, local209, local218, local227, local813, local830, local908, local846, local974, this.aClass117_1.aBoolean182, this.aClass117_1.aBoolean184);
					}
				}
			}
		}
		if (!this.aClass334_1.method7909(this.aClass334_2)) {
			@Pc(1062) Class334 local1062 = this.aClass334_2;
			this.aClass334_2 = this.aClass334_1;
			this.aClass334_1 = local1062;
			this.aClass334_1.anInt9373 = this.aClass100_1.anInt2501;
			this.aClass334_1.anInt9385 = this.aClass100_1.anInt2498;
			this.aClass334_1.anInt9380 = this.aClass100_1.anInt2513;
			this.aClass334_1.anInt9375 = this.aClass334_2.anInt9375;
			this.aClass334_1.anInt9372 = this.aClass100_1.anInt2500;
			this.aClass334_1.anInt9374 = this.aClass100_1.anInt2509;
			this.aClass334_1.anInt9377 = this.aClass334_2.anInt9377;
			this.aClass334_1.anInt9376 = this.aClass100_1.anInt2505;
			this.aClass334_1.anInt9383 = this.aClass100_1.anInt2502;
			this.aClass334_1.anInt9379 = this.aClass100_1.anInt2512;
			this.aClass334_1.anInt9381 = this.aClass334_2.anInt9381;
			this.aClass334_1.anInt9371 = this.aClass100_1.anInt2504;
		}
		this.anInt1002 = 0;
		for (@Pc(1158) Class2_Sub6_Sub1_Sub1 local1158 = (Class2_Sub6_Sub1_Sub1) this.aClass43_1.method1087(); local1158 != null; local1158 = (Class2_Sub6_Sub1_Sub1) this.aClass43_1.method1088()) {
			local1158.method2277(arg1, arg0);
			this.anInt1002++;
		}
		Static594.anInt9687 += this.anInt1002;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IJLclient!ha;)V")
	public void method957(@OriginalArg(1) long arg0, @OriginalArg(2) Class132 arg1) {
		for (@Pc(7) Class2_Sub6_Sub1_Sub1 local7 = (Class2_Sub6_Sub1_Sub1) this.aClass43_1.method1087(); local7 != null; local7 = (Class2_Sub6_Sub1_Sub1) this.aClass43_1.method1088()) {
			local7.method2276(arg1, arg0);
		}
	}
}
