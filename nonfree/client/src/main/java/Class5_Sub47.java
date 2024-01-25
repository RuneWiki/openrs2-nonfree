import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class5_Sub47 extends Class5 {

	@OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
	private int anInt7526;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "Lclient!ih;")
	private final Class5_Sub12 aClass5_Sub12_3;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_35;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Lclient!dl;")
	private final Class84_Sub1 aClass84_Sub1_3;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
	private final int anInt7524;

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
	private final int anInt7523;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
	private final int anInt7525;

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
	private final int anInt7531;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
	private int anInt7532;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!kn;")
	private final Class207 aClass207_14;

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "Lclient!ika;")
	private final Interface17 anInterface17_5;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "Lclient!bv;")
	private final Interface6 anInterface6_4;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!kn;")
	private final Class207 aClass207_13;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "Lclient!wq;")
	private Class5_Sub36 aClass5_Sub36_6;

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "Lclient!mka;")
	private Class5_Sub36_Sub1 aClass5_Sub36_Sub1_2;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!qr;")
	private Class306 aClass306_34;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!vf;Lclient!dl;Lclient!ih;[I)V")
	public Class5_Sub47(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class5_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub12_3 = arg2;
		this.aClass100_Sub3_35 = arg0;
		this.aClass84_Sub1_3 = arg1;
		@Pc(23) int local23 = this.aClass5_Sub12_3.method4531() - (arg1.anInt8881 >> 1);
		this.anInt7524 = this.aClass5_Sub12_3.method4537() - local23 >> arg1.anInt8885;
		this.anInt7523 = this.aClass5_Sub12_3.method4537() + local23 >> arg1.anInt8885;
		this.anInt7525 = this.aClass5_Sub12_3.method4534() - local23 >> arg1.anInt8885;
		this.anInt7531 = this.aClass5_Sub12_3.method4534() + local23 >> arg1.anInt8885;
		@Pc(79) int local79 = this.anInt7523 + 1 - this.anInt7524;
		@Pc(87) int local87 = this.anInt7531 + 1 - this.anInt7525;
		this.aFloatArrayArray13 = new float[local79 + 1][local87 + 1];
		this.aFloatArrayArray14 = new float[local79 + 1][local87 + 1];
		this.aFloatArrayArray15 = new float[local79 + 1][local87 + 1];
		@Pc(124) int local124;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(180) int local180;
		@Pc(197) int local197;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local124 = local116 + this.anInt7525;
			if (local124 > 0 && local124 < this.aClass84_Sub1_3.anInt8878 - 1) {
				for (local137 = 0; local137 <= local79; local137++) {
					local145 = local137 + this.anInt7524;
					if (local145 > 0 && this.aClass84_Sub1_3.anInt8883 - 1 > local145) {
						local180 = arg1.method7620(local124, local145 + 1) - arg1.method7620(local124, local145 - 1);
						local197 = arg1.method7620(local124 + 1, local145) - arg1.method7620(local124 - 1, local145);
						@Pc(212) float local212 = (float) (1.0D / Math.sqrt((double) (local197 * local197 + local180 * local180 + 65536)));
						this.aFloatArrayArray15[local137][local116] = (float) local180 * local212;
						this.aFloatArrayArray14[local137][local116] = local212 * -256.0F;
						this.aFloatArrayArray13[local137][local116] = local212 * (float) local197;
					}
				}
			}
		}
		local124 = 0;
		@Pc(339) int local339;
		for (local137 = this.anInt7525; local137 <= this.anInt7531; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt8878) {
				for (local145 = this.anInt7524; local145 <= this.anInt7523; local145++) {
					if (local145 >= 0 && arg1.anInt8883 > local145) {
						local180 = arg3[local124];
						@Pc(314) int[] local314 = arg1.anIntArrayArrayArray3[local145][local137];
						if (local314 != null && local180 != 0) {
							if (local180 == 1) {
								local339 = 0;
								while (local314.length > local339) {
									if (local314[local339++] != -1 && local314[local339++] != -1 && local314[local339++] != -1) {
										this.anInt7532 += 3;
									}
								}
							} else {
								this.anInt7532 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt7523 - this.anInt7524;
			}
		}
		if (this.anInt7532 <= 0) {
			this.aClass207_14 = null;
			this.anInterface17_5 = null;
			this.anInterface6_4 = null;
			this.aClass207_13 = null;
		} else {
			this.aClass5_Sub36_6 = new Class5_Sub36(this.anInt7532 * 2);
			this.aClass5_Sub36_Sub1_2 = new Class5_Sub36_Sub1(this.anInt7532 * 16);
			this.aClass306_34 = new Class306(Static146.method2737(this.anInt7532));
			local145 = 0;
			local124 = 0;
			for (local180 = this.anInt7525; local180 <= this.anInt7531; local180++) {
				if (local180 >= 0 && arg1.anInt8878 > local180) {
					local197 = 0;
					for (local339 = this.anInt7524; local339 <= this.anInt7523; local339++) {
						if (local339 >= 0 && local339 < arg1.anInt8883) {
							@Pc(497) int local497 = arg3[local124];
							@Pc(504) int[] local504 = arg1.anIntArrayArrayArray3[local339][local180];
							if (local504 != null && local497 != 0) {
								if (local497 == 1) {
									@Pc(689) int[] local689 = arg1.anIntArrayArrayArray8[local339][local180];
									@Pc(696) int[] local696 = arg1.anIntArrayArrayArray7[local339][local180];
									@Pc(698) int local698 = 0;
									label104: while (true) {
										while (true) {
											if (local504.length <= local698) {
												break label104;
											}
											if (local504[local698] == -1 || local504[local698 + 1] == -1 || local504[local698 + 2] == -1) {
												local698 += 3;
											} else {
												this.method6550(local339, local696[local698], local197, local145, local180, local689[local698]);
												local698++;
												this.method6550(local339, local696[local698], local197, local145, local180, local689[local698]);
												local698++;
												this.method6550(local339, local696[local698], local197, local145, local180, local689[local698]);
												local698++;
											}
										}
									}
								} else if (local497 == 3) {
									this.method6550(local339, 0, local197, local145, local180, 0);
									this.method6550(local339, 0, local197, local145, local180, arg1.anInt8881);
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, 0);
								} else if (local497 == 2) {
									this.method6550(local339, 0, local197, local145, local180, arg1.anInt8881);
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, arg1.anInt8881);
									this.method6550(local339, 0, local197, local145, local180, 0);
								} else if (local497 == 5) {
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, arg1.anInt8881);
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, 0);
									this.method6550(local339, 0, local197, local145, local180, arg1.anInt8881);
								} else if (local497 == 4) {
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, 0);
									this.method6550(local339, 0, local197, local145, local180, 0);
									this.method6550(local339, arg1.anInt8881, local197, local145, local180, arg1.anInt8881);
								}
							}
						}
						local124++;
						local197++;
					}
				} else {
					local124 += this.anInt7523 - this.anInt7524;
				}
				local145++;
			}
			this.anInterface6_4 = this.aClass100_Sub3_35.method8711(false, this.aClass5_Sub36_6.anInt8456, this.aClass5_Sub36_6.aByteArray89);
			this.anInterface17_5 = this.aClass100_Sub3_35.method8734(this.aClass5_Sub36_Sub1_2.anInt8456, this.aClass5_Sub36_Sub1_2.aByteArray89, 16, false);
			this.aClass207_14 = new Class207(this.anInterface17_5, 5126, 3, 0);
			this.aClass207_13 = new Class207(this.anInterface17_5, 5121, 4, 12);
		}
		this.aFloatArrayArray15 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aClass5_Sub36_6 = null;
		this.aClass5_Sub36_Sub1_2 = null;
		this.aClass306_34 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[[ZIII)V")
	public void method6549(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface6_4 == null || (this.anInt7524 > arg0 + arg3 || (arg3 - arg0 > this.anInt7523 || (this.anInt7525 > arg0 + arg2 || this.anInt7531 < arg2 - arg0)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt7525; local59 <= this.anInt7531; local59++) {
			for (@Pc(64) int local64 = this.anInt7524; local64 <= this.anInt7523; local64++) {
				@Pc(71) int local71 = local64 - arg3;
				@Pc(76) int local76 = local59 - arg2;
				if (local71 > -arg0 && arg0 > local71 && -arg0 < local76 && local76 < arg0 && arg1[local71 + arg0][arg0 + local76]) {
					this.aClass100_Sub3_35.method8704((int) (this.aClass5_Sub12_3.method4536() * 255.0F) << 24);
					this.aClass100_Sub3_35.method8727(this.aClass207_13, (Class207) null, this.aClass207_14, (Class207) null);
					this.aClass100_Sub3_35.method8707(this.anInterface6_4, 0, this.anInt7532);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
	private void method6550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass84_Sub1_3.anInt8885) + arg5;
		@Pc(23) int local23 = (arg4 << this.aClass84_Sub1_3.anInt8885) + arg1;
		@Pc(30) int local30 = this.aClass84_Sub1_3.method7625(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(58) Class5 local58 = this.aClass306_34.method6943(local7);
			if (local58 != null) {
				this.method6553(((Class5_Sub54) local58).aShort127);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt7526++;
		if (local7 != -1L) {
			this.aClass306_34.method6944(new Class5_Sub54(local77), local7, -12002);
		}
		@Pc(112) float local112;
		@Pc(126) float local126;
		@Pc(119) float local119;
		@Pc(215) float local215;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(244) float local244;
		@Pc(253) float local253;
		@Pc(262) float local262;
		@Pc(352) float local352;
		if (arg5 == 0 && arg1 == 0) {
			local112 = this.aFloatArrayArray15[arg2][arg3];
			local119 = this.aFloatArrayArray13[arg2][arg3];
			local126 = this.aFloatArrayArray14[arg2][arg3];
		} else if (this.aClass84_Sub1_3.anInt8881 == arg5 && arg1 == 0) {
			local126 = this.aFloatArrayArray14[arg2 + 1][arg3];
			local119 = this.aFloatArrayArray13[arg2 + 1][arg3];
			local112 = this.aFloatArrayArray15[arg2 + 1][arg3];
		} else if (arg5 == this.aClass84_Sub1_3.anInt8881 && arg1 == this.aClass84_Sub1_3.anInt8881) {
			local112 = this.aFloatArrayArray15[arg2 + 1][arg3 + 1];
			local126 = this.aFloatArrayArray14[arg2 + 1][arg3 + 1];
			local119 = this.aFloatArrayArray13[arg2 + 1][arg3 + 1];
		} else if (arg5 == 0 && arg1 == this.aClass84_Sub1_3.anInt8881) {
			local119 = this.aFloatArrayArray13[arg2][arg3 + 1];
			local112 = this.aFloatArrayArray15[arg2][arg3 + 1];
			local126 = this.aFloatArrayArray14[arg2][arg3 + 1];
		} else {
			local215 = (float) arg5 / (float) this.aClass84_Sub1_3.anInt8881;
			local223 = (float) arg1 / (float) this.aClass84_Sub1_3.anInt8881;
			local230 = this.aFloatArrayArray15[arg2][arg3];
			local237 = this.aFloatArrayArray14[arg2][arg3];
			local244 = this.aFloatArrayArray13[arg2][arg3];
			local253 = this.aFloatArrayArray15[arg2 + 1][arg3];
			local262 = this.aFloatArrayArray14[arg2 + 1][arg3];
			@Pc(279) float local279 = local253 + local215 * (this.aFloatArrayArray15[arg2 + 1][arg3 + 1] - local253);
			@Pc(296) float local296 = local262 + (this.aFloatArrayArray14[arg2 + 1][arg3 + 1] - local262) * local215;
			@Pc(312) float local312 = local230 + local215 * (this.aFloatArrayArray15[arg2][arg3 + 1] - local230);
			@Pc(327) float local327 = local244 + local215 * (this.aFloatArrayArray13[arg2][arg3 + 1] - local244);
			@Pc(343) float local343 = local237 + (this.aFloatArrayArray14[arg2][arg3 + 1] - local237) * local215;
			local352 = this.aFloatArrayArray13[arg2 + 1][arg3];
			@Pc(370) float local370 = local352 + (this.aFloatArrayArray13[arg2 + 1][arg3 + 1] - local352) * local215;
			local126 = local343 + (local296 - local343) * local223;
			local112 = (local279 - local312) * local223 + local312;
			local119 = (local370 - local327) * local223 + local327;
		}
		local215 = (float) (this.aClass5_Sub12_3.method4537() - local15);
		local223 = (float) (this.aClass5_Sub12_3.method4533() - local30);
		local230 = (float) (this.aClass5_Sub12_3.method4534() - local23);
		local237 = (float) Math.sqrt((double) (local230 * local230 + local223 * local223 + local215 * local215));
		local244 = 1.0F / local237;
		local223 *= local244;
		local215 *= local244;
		local230 *= local244;
		local253 = local237 / (float) this.aClass5_Sub12_3.method4531();
		local262 = 1.0F - local253 * local253;
		if (local262 < 0.0F) {
			local262 = 0.0F;
		}
		local352 = local230 * local119 + local215 * local112 + local223 * local126;
		if ((float) 0 > local352) {
			local352 = 0.0F;
		}
		@Pc(557) float local557 = local352 * local262 * 2.0F;
		if (local557 > 1.0F) {
			local557 = 1.0F;
		}
		@Pc(568) int local568 = this.aClass5_Sub12_3.method4530();
		@Pc(578) int local578 = (int) ((float) (local568 >> 16 & 0xFF) * local557);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local568 >> 8 & 0xFF) * local557);
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(608) int local608 = (int) ((float) (local568 & 0xFF) * local557);
		if (this.aClass100_Sub3_35.aBoolean735) {
			this.aClass5_Sub36_Sub1_2.method5494((float) local15);
			this.aClass5_Sub36_Sub1_2.method5494((float) local30);
			this.aClass5_Sub36_Sub1_2.method5494((float) local23);
		} else {
			this.aClass5_Sub36_Sub1_2.method5496((float) local15);
			this.aClass5_Sub36_Sub1_2.method5496((float) local30);
			this.aClass5_Sub36_Sub1_2.method5496((float) local23);
		}
		if (local608 > 255) {
			local608 = 255;
		}
		this.aClass5_Sub36_Sub1_2.method7324(local578);
		this.aClass5_Sub36_Sub1_2.method7324(local595);
		this.aClass5_Sub36_Sub1_2.method7324(local608);
		this.aClass5_Sub36_Sub1_2.method7324(255);
		this.method6553(local77);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SZ)V")
	private void method6553(@OriginalArg(0) short arg0) {
		if (this.aClass100_Sub3_35.aBoolean735) {
			this.aClass5_Sub36_6.method7296(arg0);
		} else {
			this.aClass5_Sub36_6.method7279(arg0);
		}
	}
}
