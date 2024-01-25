import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	public int anInt4016;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	private int anInt4021;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	private int anInt4022;

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
	private int anInt4023;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	private int anInt4024;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	private int anInt4025;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	private int anInt4026;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	private int anInt4019 = 0;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!fw;")
	public Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!fw;")
	private Class118 aClass118_2 = new Class118();

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "J")
	private final long aLong127;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Lclient!l;")
	public final Class14_Sub8 aClass14_Sub8_6;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!cm;")
	public final Class57 aClass57_2;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!fga;")
	public Class107 aClass107_1;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!vm;")
	public final Class363 aClass363_5;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ha;Lclient!cm;Lclient!l;J)V")
	public Class14_Sub7(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class14_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aLong127 = arg3;
		this.aClass14_Sub8_6 = arg2;
		this.aClass57_2 = arg1;
		this.aClass107_1 = this.aClass57_2.method1232();
		if (!arg0.method6977() && this.aClass107_1.anInt2474 != -1) {
			this.aClass107_1 = Static599.method8374(this.aClass107_1.anInt2474);
		}
		this.aClass363_5 = new Class363();
		this.anInt4019 = (int) ((double) this.anInt4019 + Math.random() * 64.0D);
		this.method3650();
		this.aClass118_2.anInt3105 = this.aClass118_1.anInt3105;
		this.aClass118_2.anInt3096 = this.aClass118_1.anInt3096;
		this.aClass118_2.anInt3091 = this.aClass118_1.anInt3091;
		this.aClass118_2.anInt3098 = this.aClass118_1.anInt3098;
		this.aClass118_2.anInt3106 = this.aClass118_1.anInt3106;
		this.aClass118_2.anInt3090 = this.aClass118_1.anInt3090;
		this.aClass118_2.anInt3095 = this.aClass118_1.anInt3095;
		this.aClass118_2.anInt3094 = this.aClass118_1.anInt3094;
		this.aClass118_2.anInt3102 = this.aClass118_1.anInt3102;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!ha;ZJ)V")
	public void method3648(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(4) long arg3) {
		@Pc(34) int local34;
		if (this.aBoolean331) {
			arg1 = false;
		} else if (this.aClass107_1.anInt2452 > Static210.anInt3641) {
			arg1 = false;
		} else if (Static591.anInt9680 > Static617.anIntArray807[Static210.anInt3641]) {
			arg1 = false;
		} else if (this.aBoolean332) {
			arg1 = false;
		} else if (this.aClass107_1.lb != -1) {
			local34 = (int) (arg3 - this.aLong127);
			if (this.aClass107_1.aBoolean209 || local34 <= this.aClass107_1.lb) {
				local34 %= this.aClass107_1.lb;
			} else {
				arg1 = false;
			}
			if (!this.aClass107_1.aBoolean205 && local34 < this.aClass107_1.anInt2457) {
				arg1 = false;
			}
			if (this.aClass107_1.aBoolean205 && local34 >= this.aClass107_1.anInt2457) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static308.anInt4876++;
			local34 = (this.aClass118_1.anInt3098 + this.aClass118_1.anInt3090 + this.aClass118_1.anInt3106) / 3;
			@Pc(137) int local137 = (this.aClass118_1.anInt3095 + this.aClass118_1.anInt3091 + this.aClass118_1.anInt3096) / 3;
			@Pc(151) int local151 = (this.aClass118_1.anInt3105 + this.aClass118_1.anInt3102 + this.aClass118_1.anInt3094) / 3;
			@Pc(191) int local191;
			@Pc(200) int local200;
			@Pc(208) int local208;
			@Pc(217) int local217;
			@Pc(226) int local226;
			@Pc(234) int local234;
			@Pc(339) int local339;
			@Pc(392) int local392;
			@Pc(413) int local413;
			if (this.aClass118_1.anInt3097 != local34 || this.aClass118_1.anInt3092 != local137 || local151 != this.aClass118_1.anInt3100) {
				this.aClass118_1.anInt3100 = local151;
				this.aClass118_1.anInt3092 = local137;
				this.aClass118_1.anInt3097 = local34;
				local191 = this.aClass118_1.anInt3090 - this.aClass118_1.anInt3106;
				local200 = this.aClass118_1.anInt3091 - this.aClass118_1.anInt3096;
				local208 = this.aClass118_1.anInt3094 - this.aClass118_1.anInt3102;
				local217 = this.aClass118_1.anInt3098 - this.aClass118_1.anInt3106;
				local226 = this.aClass118_1.anInt3095 - this.aClass118_1.anInt3096;
				local234 = this.aClass118_1.anInt3105 - this.aClass118_1.anInt3102;
				this.anInt4026 = local200 * local234 - local208 * local226;
				this.anInt4021 = local191 * local226 - local217 * local200;
				this.anInt4023 = local208 * local217 - local191 * local234;
				while (true) {
					if (this.anInt4026 <= 32767 && this.anInt4023 <= 32767 && this.anInt4021 <= 32767 && this.anInt4026 >= -32767 && this.anInt4023 >= -32767 && this.anInt4021 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt4023 * this.anInt4023 + this.anInt4026 * this.anInt4026 + this.anInt4021 * this.anInt4021));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt4026 = this.anInt4026 * 32767 / local339;
						this.anInt4023 = this.anInt4023 * 32767 / local339;
						this.anInt4021 = this.anInt4021 * 32767 / local339;
						if (this.aClass107_1.aShort34 > 0 || this.aClass107_1.aShort35 > 0) {
							local392 = (int) (Math.atan2((double) this.anInt4021, (double) this.anInt4026) * 2607.5945876176133D);
							local413 = (int) (Math.atan2((double) this.anInt4023, Math.sqrt((double) (this.anInt4021 * this.anInt4021 + this.anInt4026 * this.anInt4026))) * 2607.5945876176133D);
							this.anInt4027 = this.aClass107_1.aShort34 - this.aClass107_1.aShort37;
							this.anInt4024 = this.aClass107_1.aShort37 + local392 - (this.anInt4027 >> 1);
							this.anInt4022 = this.aClass107_1.aShort35 - this.aClass107_1.aShort36;
							this.anInt4025 = local413 + this.aClass107_1.aShort36 - (this.anInt4022 >> 1);
						}
						break;
					}
					this.anInt4023 >>= 0x1;
					this.anInt4026 >>= 0x1;
					this.anInt4021 >>= 0x1;
				}
			}
			this.anInt4019 += (int) ((double) arg0 * ((double) (this.aClass107_1.anInt2494 - this.aClass107_1.anInt2489) * Math.random() + (double) this.aClass107_1.anInt2489));
			if (this.anInt4019 > 63) {
				local191 = this.anInt4019 >> 6;
				this.anInt4019 &= 0x3F;
				for (local226 = 0; local226 < local191; local226++) {
					@Pc(565) int local565;
					@Pc(569) int local569;
					if (this.aClass107_1.aShort34 <= 0 && this.aClass107_1.aShort35 <= 0) {
						local217 = this.anInt4021;
						local200 = this.anInt4026;
						local208 = this.anInt4023;
					} else {
						local234 = this.anInt4024 + (int) (Math.random() * (double) this.anInt4027);
						local234 &= 0x3FFF;
						local339 = Class5_Sub12_Sub1.anIntArray748[local234];
						local392 = Class5_Sub12_Sub1.anIntArray749[local234];
						local413 = (int) (Math.random() * (double) this.anInt4022) + this.anInt4025;
						local413 &= 0x1FFF;
						local565 = Class5_Sub12_Sub1.anIntArray748[local413];
						local569 = Class5_Sub12_Sub1.anIntArray749[local413];
						local208 = (local569 << 1) * -1;
						local200 = local392 * local565 >> 13;
						local217 = local339 * local565 >> 13;
					}
					@Pc(592) float local592 = (float) Math.random();
					@Pc(595) float local595 = (float) Math.random();
					if (local595 + local592 > 1.0F) {
						local595 = 1.0F - local595;
						local592 = 1.0F - local592;
					}
					@Pc(617) float local617 = 1.0F - local595 - local592;
					local413 = (int) (local595 * (float) this.aClass118_1.anInt3090 + (float) this.aClass118_1.anInt3106 * local592 + (float) this.aClass118_1.anInt3098 * local617);
					local565 = (int) ((float) this.aClass118_1.anInt3095 * local617 + local595 * (float) this.aClass118_1.anInt3091 + (float) this.aClass118_1.anInt3096 * local592);
					local569 = (int) ((float) this.aClass118_1.anInt3102 * local592 + (float) this.aClass118_1.anInt3094 * local595 + (float) this.aClass118_1.anInt3105 * local617);
					@Pc(705) int local705 = (int) ((float) this.aClass118_2.anInt3090 * local595 + local592 * (float) this.aClass118_2.anInt3106 + (float) this.aClass118_2.anInt3098 * local617);
					@Pc(727) int local727 = (int) ((float) this.aClass118_2.anInt3096 * local592 + (float) this.aClass118_2.anInt3091 * local595 + (float) this.aClass118_2.anInt3095 * local617);
					@Pc(749) int local749 = (int) (local617 * (float) this.aClass118_2.anInt3105 + (float) this.aClass118_2.anInt3102 * local592 + (float) this.aClass118_2.anInt3094 * local595);
					@Pc(754) int local754 = local413 - local705;
					@Pc(759) int local759 = local565 - local727;
					@Pc(764) int local764 = local569 - local749;
					@Pc(773) int local773 = (int) ((double) local754 * Math.random() + (double) local705);
					@Pc(782) int local782 = (int) ((double) local727 + Math.random() * (double) local759);
					@Pc(791) int local791 = (int) (Math.random() * (double) local764 + (double) local749);
					@Pc(808) int local808 = (int) ((double) (this.aClass107_1.anInt2464 - this.aClass107_1.anInt2473) * Math.random()) + this.aClass107_1.anInt2473;
					@Pc(825) int local825 = (int) (Math.random() * (double) (this.aClass107_1.anInt2493 - this.aClass107_1.anInt2465)) + this.aClass107_1.anInt2465;
					@Pc(841) int local841 = (int) ((double) (this.aClass107_1.anInt2486 - this.aClass107_1.anInt2481) * Math.random()) + this.aClass107_1.anInt2481;
					@Pc(905) int local905;
					if (this.aClass107_1.aBoolean210) {
						@Pc(847) double local847 = Math.random();
						local905 = (int) ((double) this.aClass107_1.anInt2455 + Math.random() * (double) this.aClass107_1.anInt2450) << 24 | (int) ((double) this.aClass107_1.anInt2458 + (double) this.aClass107_1.anInt2447 * local847) << 16 | (int) ((double) this.aClass107_1.anInt2484 + (double) this.aClass107_1.anInt2469 * local847) << 8 | (int) ((double) this.aClass107_1.anInt2449 * local847 + (double) this.aClass107_1.anInt2479);
					} else {
						local905 = (int) (Math.random() * (double) this.aClass107_1.anInt2450 + (double) this.aClass107_1.anInt2455) << 24 | (int) (Math.random() * (double) this.aClass107_1.anInt2449 + (double) this.aClass107_1.anInt2479) | (int) ((double) this.aClass107_1.anInt2469 * Math.random() + (double) this.aClass107_1.anInt2484) << 8 | (int) ((double) this.aClass107_1.anInt2458 + Math.random() * (double) this.aClass107_1.anInt2447) << 16;
					}
					@Pc(969) int local969 = this.aClass107_1.anInt2485;
					if (!arg2.method6977() && !this.aClass107_1.aBoolean206) {
						local969 = -1;
					}
					if (Static225.anInt3890 == Static372.anInt6543) {
						new Class14_Sub2_Sub2_Sub1(this, local773, local782, local791, local200, local208, local217, local808, local825, local905, local841, local969, this.aClass107_1.aBoolean207, this.aClass107_1.aBoolean202);
					} else {
						@Pc(985) Class14_Sub2_Sub2_Sub1 local985 = Static580.aClass14_Sub2_Sub2_Sub1Array13[Static372.anInt6543];
						Static372.anInt6543 = Static372.anInt6543 + 1 & 0x3FF;
						local985.method3783(this, local773, local782, local791, local200, local208, local217, local808, local825, local905, local841, local969, this.aClass107_1.aBoolean207, this.aClass107_1.aBoolean202);
					}
				}
			}
		}
		if (!this.aClass118_1.method2644(this.aClass118_2)) {
			@Pc(1053) Class118 local1053 = this.aClass118_2;
			this.aClass118_2 = this.aClass118_1;
			this.aClass118_1 = local1053;
			this.aClass118_1.anInt3091 = this.aClass57_2.anInt1266;
			this.aClass118_1.anInt3095 = this.aClass57_2.anInt1257;
			this.aClass118_1.anInt3100 = this.aClass118_2.anInt3100;
			this.aClass118_1.anInt3096 = this.aClass57_2.anInt1272;
			this.aClass118_1.anInt3106 = this.aClass57_2.anInt1262;
			this.aClass118_1.anInt3098 = this.aClass57_2.anInt1255;
			this.aClass118_1.anInt3105 = this.aClass57_2.anInt1269;
			this.aClass118_1.anInt3092 = this.aClass118_2.anInt3092;
			this.aClass118_1.anInt3090 = this.aClass57_2.anInt1267;
			this.aClass118_1.anInt3094 = this.aClass57_2.anInt1256;
			this.aClass118_1.anInt3102 = this.aClass57_2.anInt1271;
			this.aClass118_1.anInt3097 = this.aClass118_2.anInt3097;
		}
		this.anInt4016 = 0;
		for (@Pc(1141) Class14_Sub2_Sub2_Sub1 local1141 = (Class14_Sub2_Sub2_Sub1) this.aClass363_5.method8484(); local1141 != null; local1141 = (Class14_Sub2_Sub2_Sub1) this.aClass363_5.method8478()) {
			local1141.method3782(arg3, arg0);
			this.anInt4016++;
		}
		Static647.anInt10483 += this.anInt4016;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(JILclient!ha;)V")
	public void method3649(@OriginalArg(0) long arg0, @OriginalArg(2) Class126 arg1) {
		for (@Pc(7) Class14_Sub2_Sub2_Sub1 local7 = (Class14_Sub2_Sub2_Sub1) this.aClass363_5.method8484(); local7 != null; local7 = (Class14_Sub2_Sub2_Sub1) this.aClass363_5.method8478()) {
			local7.method3781(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public void method3650() {
		this.aClass118_1.anInt3102 = this.aClass57_2.anInt1271;
		this.aClass118_1.anInt3105 = this.aClass57_2.anInt1269;
		this.aClass118_1.anInt3091 = this.aClass57_2.anInt1266;
		this.aClass118_1.anInt3090 = this.aClass57_2.anInt1267;
		this.aClass118_1.anInt3096 = this.aClass57_2.anInt1272;
		this.aClass118_1.anInt3094 = this.aClass57_2.anInt1256;
		this.aClass118_1.anInt3106 = this.aClass57_2.anInt1262;
		this.aClass118_1.anInt3098 = this.aClass57_2.anInt1255;
		this.aClass118_1.anInt3095 = this.aClass57_2.anInt1257;
		if (this.aClass118_1.anInt3090 == this.aClass118_1.anInt3106 && this.aClass118_1.anInt3098 == this.aClass118_1.anInt3090 && this.aClass118_1.anInt3091 == this.aClass118_1.anInt3096 && this.aClass118_1.anInt3095 == this.aClass118_1.anInt3091 && this.aClass118_1.anInt3094 == this.aClass118_1.anInt3102 && this.aClass118_1.anInt3094 == this.aClass118_1.anInt3105) {
			this.aBoolean332 = true;
		} else if (this.aBoolean332) {
			this.aClass118_2.anInt3105 = this.aClass118_1.anInt3105;
			this.aClass118_2.anInt3102 = this.aClass118_1.anInt3102;
			this.aClass118_2.anInt3094 = this.aClass118_1.anInt3094;
			this.aClass118_2.anInt3098 = this.aClass118_1.anInt3098;
			this.aClass118_2.anInt3091 = this.aClass118_1.anInt3091;
			this.aClass118_2.anInt3096 = this.aClass118_1.anInt3096;
			this.aClass118_2.anInt3106 = this.aClass118_1.anInt3106;
			this.aBoolean332 = false;
			this.aClass118_2.anInt3090 = this.aClass118_1.anInt3090;
			this.aClass118_2.anInt3095 = this.aClass118_1.anInt3095;
		}
	}
}
