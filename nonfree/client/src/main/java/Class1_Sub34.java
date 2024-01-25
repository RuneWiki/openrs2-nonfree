import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
	private int anInt6483;

	@OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
	private int anInt6487;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Lclient!sb;")
	private final Class10_Sub3 aClass10_Sub3_3;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!nm;")
	private final Class1_Sub27 aClass1_Sub27_3;

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_31;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	private final int anInt6478;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
	private final int anInt6479;

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
	private final int anInt6484;

	@OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
	private final int anInt6488;

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Lclient!mj;")
	private final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "Lclient!sp;")
	private final Interface16 anInterface16_3;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Lclient!maa;")
	private final Class188 aClass188_5;

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!maa;")
	private final Class188 aClass188_6;

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "Lclient!gw;")
	private Class1_Sub13 aClass1_Sub13_6;

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "Lclient!eo;")
	private Class1_Sub13_Sub1 aClass1_Sub13_Sub1_2;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "Lclient!lb;")
	private Class174 aClass174_23;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!te;Lclient!sb;Lclient!nm;[I)V")
	public Class1_Sub34(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class10_Sub3 arg1, @OriginalArg(2) Class1_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass10_Sub3_3 = arg1;
		this.aClass1_Sub27_3 = arg2;
		this.aClass9_Sub3_31 = arg0;
		@Pc(22) int local22 = this.aClass1_Sub27_3.method5496() - (arg1.anInt7410 >> 1);
		this.anInt6478 = this.aClass1_Sub27_3.method5493() - local22 >> arg1.anInt7411;
		this.anInt6479 = this.aClass1_Sub27_3.method5493() + local22 >> arg1.anInt7411;
		this.anInt6484 = this.aClass1_Sub27_3.method5495() - local22 >> arg1.anInt7411;
		this.anInt6488 = this.aClass1_Sub27_3.method5495() + local22 >> arg1.anInt7411;
		@Pc(77) int local77 = this.anInt6479 + 1 - this.anInt6478;
		@Pc(85) int local85 = this.anInt6488 + 1 - this.anInt6484;
		this.aFloatArrayArray12 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt6484 + local114;
			if (local121 > 0 && this.aClass10_Sub3_3.anInt7409 - 1 > local121) {
				for (local135 = 0; local135 <= local77; local135++) {
					local142 = local135 + this.anInt6478;
					if (local142 > 0 && local142 < this.aClass10_Sub3_3.anInt7412 - 1) {
						local170 = arg1.ba(local142 + 1, local121) - arg1.ba(local142 - 1, local121);
						local184 = arg1.ba(local142, local121 + 1) - arg1.ba(local142, local121 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local184 * local184 + 65536)));
						this.aFloatArrayArray10[local135][local114] = (float) local170 * local200;
						this.aFloatArrayArray12[local135][local114] = -256.0F * local200;
						this.aFloatArrayArray11[local135][local114] = local200 * (float) local184;
					}
				}
			}
		}
		local121 = 0;
		local135 = 0;
		for (local142 = this.anInt6484; local142 <= this.anInt6488; local142++) {
			if (local142 >= 0 && local142 < arg1.anInt7409) {
				for (local170 = this.anInt6478; local170 <= this.anInt6479; local170++) {
					if (local170 >= 0 && arg1.anInt7412 > local170) {
						local184 = arg3[local135];
						@Pc(296) int[] local296 = arg1.anIntArrayArrayArray19[local170][local142];
						if (local296 != null && local184 != 0) {
							if (local184 == 1) {
								local121 += local296.length;
							} else {
								local121 += 3;
							}
						}
					}
					local135++;
				}
			} else {
				local135 += this.anInt6479 - this.anInt6478;
			}
		}
		if (local121 <= 0) {
			this.anInterface7_3 = null;
			this.anInterface16_3 = null;
			this.aClass188_5 = null;
			this.aClass188_6 = null;
		} else {
			this.aClass1_Sub13_6 = new Class1_Sub13(local121 * 2);
			this.aClass1_Sub13_Sub1_2 = new Class1_Sub13_Sub1(local121 * 16);
			this.aClass174_23 = new Class174(Static117.method2662(local121));
			local170 = 0;
			local135 = 0;
			for (local184 = this.anInt6484; local184 <= this.anInt6488; local184++) {
				if (local184 >= 0 && local184 < arg1.anInt7409) {
					@Pc(393) int local393 = 0;
					for (@Pc(396) int local396 = this.anInt6478; local396 <= this.anInt6479; local396++) {
						if (local396 >= 0 && local396 < arg1.anInt7412) {
							@Pc(412) int local412 = arg3[local135];
							@Pc(419) int[] local419 = arg1.anIntArrayArrayArray19[local396][local184];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray16[local396][local184];
							if (local419 != null && local412 != 0) {
								if (local412 == 1) {
									for (@Pc(582) int local582 = 0; local582 < local419.length; local582++) {
										this.method5632(local426[local582], local419[local582], local184, local393, local396, local170);
									}
								} else if (local412 == 3) {
									this.method5632(0, 0, local184, local393, local396, local170);
									this.method5632(0, arg1.anInt7410, local184, local393, local396, local170);
									this.method5632(arg1.anInt7410, 0, local184, local393, local396, local170);
								} else if (local412 == 2) {
									this.method5632(0, arg1.anInt7410, local184, local393, local396, local170);
									this.method5632(arg1.anInt7410, arg1.anInt7410, local184, local393, local396, local170);
									this.method5632(0, 0, local184, local393, local396, local170);
								} else if (local412 == 5) {
									this.method5632(arg1.anInt7410, arg1.anInt7410, local184, local393, local396, local170);
									this.method5632(arg1.anInt7410, 0, local184, local393, local396, local170);
									this.method5632(0, arg1.anInt7410, local184, local393, local396, local170);
								} else if (local412 == 4) {
									this.method5632(arg1.anInt7410, 0, local184, local393, local396, local170);
									this.method5632(0, 0, local184, local393, local396, local170);
									this.method5632(arg1.anInt7410, arg1.anInt7410, local184, local393, local396, local170);
								}
							}
						}
						local135++;
						local393++;
					}
				} else {
					local135 += this.anInt6479 - this.anInt6478;
				}
				local170++;
			}
			this.anInterface7_3 = this.aClass9_Sub3_31.method6687(this.aClass1_Sub13_6.aByteArray45, this.aClass1_Sub13_6.anInt3400, false);
			this.anInterface16_3 = this.aClass9_Sub3_31.method6729(this.aClass1_Sub13_Sub1_2.aByteArray45, false, this.aClass1_Sub13_Sub1_2.anInt3400, 16);
			this.aClass188_6 = new Class188(this.anInterface16_3, 5126, 3, 0);
			this.aClass188_5 = new Class188(this.anInterface16_3, 5121, 4, 12);
		}
		this.aClass1_Sub13_6 = null;
		this.aClass174_23 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray12 = this.aFloatArrayArray11 = null;
		this.aClass1_Sub13_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII)V")
	private void method5632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg4 << this.aClass10_Sub3_3.anInt7411);
		@Pc(25) int local25 = arg0 + (arg2 << this.aClass10_Sub3_3.anInt7411);
		@Pc(31) int local31 = this.aClass10_Sub3_3.aa(local16, local25);
		if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | ((long) local25 & 0xFFFFL) << 16;
			@Pc(63) Class1 local63 = this.aClass174_23.method4422(local7);
			if (local63 != null) {
				this.method5634(((Class1_Sub7) local63).aShort16);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt6487++;
		if (local7 != -1L) {
			this.aClass174_23.method4420(new Class1_Sub7(local81), local7);
		}
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(122) float local122;
		@Pc(228) float local228;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(266) float local266;
		@Pc(275) float local275;
		@Pc(317) float local317;
		if (arg1 == 0 && arg0 == 0) {
			local108 = this.aFloatArrayArray12[arg3][arg5];
			local115 = this.aFloatArrayArray10[arg3][arg5];
			local122 = this.aFloatArrayArray11[arg3][arg5];
		} else if (arg1 == this.aClass10_Sub3_3.anInt7410 && arg0 == 0) {
			local108 = this.aFloatArrayArray12[arg3 + 1][arg5];
			local115 = this.aFloatArrayArray10[arg3 + 1][arg5];
			local122 = this.aFloatArrayArray11[arg3 + 1][arg5];
		} else if (arg1 == this.aClass10_Sub3_3.anInt7410 && arg0 == this.aClass10_Sub3_3.anInt7410) {
			local122 = this.aFloatArrayArray11[arg3 + 1][arg5 + 1];
			local108 = this.aFloatArrayArray12[arg3 + 1][arg5 + 1];
			local115 = this.aFloatArrayArray10[arg3 + 1][arg5 + 1];
		} else if (arg1 == 0 && arg0 == this.aClass10_Sub3_3.anInt7410) {
			local108 = this.aFloatArrayArray12[arg3][arg5 + 1];
			local115 = this.aFloatArrayArray10[arg3][arg5 + 1];
			local122 = this.aFloatArrayArray11[arg3][arg5 + 1];
		} else {
			local228 = (float) arg1 / (float) this.aClass10_Sub3_3.anInt7410;
			local236 = (float) arg0 / (float) this.aClass10_Sub3_3.anInt7410;
			local243 = this.aFloatArrayArray10[arg3][arg5];
			local250 = this.aFloatArrayArray12[arg3][arg5];
			local257 = this.aFloatArrayArray11[arg3][arg5];
			local266 = this.aFloatArrayArray10[arg3 + 1][arg5];
			local275 = this.aFloatArrayArray12[arg3 + 1][arg5];
			@Pc(290) float local290 = local250 + local228 * (this.aFloatArrayArray12[arg3][arg5 + 1] - local250);
			@Pc(308) float local308 = local275 + (this.aFloatArrayArray12[arg3 + 1][arg5 + 1] - local275) * local228;
			local317 = this.aFloatArrayArray11[arg3 + 1][arg5];
			@Pc(332) float local332 = local257 + local228 * (this.aFloatArrayArray11[arg3][arg5 + 1] - local257);
			@Pc(349) float local349 = local266 + local228 * (this.aFloatArrayArray10[arg3 + 1][arg5 + 1] - local266);
			@Pc(364) float local364 = local243 + local228 * (this.aFloatArrayArray10[arg3][arg5 + 1] - local243);
			local115 = local236 * (local349 - local364) + local364;
			@Pc(390) float local390 = local317 + local228 * (this.aFloatArrayArray11[arg3 + 1][arg5 + 1] - local317);
			local108 = local290 + local236 * (local308 - local290);
			local122 = local236 * (local390 - local332) + local332;
		}
		local228 = this.aClass1_Sub27_3.method5493() - local16;
		local236 = this.aClass1_Sub27_3.method5487() - local31;
		local243 = this.aClass1_Sub27_3.method5495() - local25;
		local250 = (float) Math.sqrt((double) (local243 * local243 + local236 * local236 + local228 * local228));
		local257 = 1.0F / local250;
		local236 *= local257;
		local228 *= local257;
		local243 *= local257;
		local266 = local250 / (float) this.aClass1_Sub27_3.method5496();
		local275 = 1.0F - local266 * local266;
		if (local275 < 0.0F) {
			local275 = 0.0F;
		}
		local317 = local122 * local243 + local115 * local228 + local236 * local108;
		if (local317 < 0.0F) {
			local317 = 0.0F;
		}
		@Pc(545) float local545 = local275 * local317 * 2.0F;
		if (local545 > 1.0F) {
			local545 = 1.0F;
		}
		@Pc(556) int local556 = this.aClass1_Sub27_3.method5488();
		@Pc(566) int local566 = (int) (local545 * (float) (local556 >> 16 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local556 >> 8 & 0xFF) * local545);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(599) int local599 = (int) (local545 * (float) (local556 & 0xFF));
		if (local599 > 255) {
			local599 = 255;
		}
		if (this.aClass9_Sub3_31.aBoolean523) {
			this.aClass1_Sub13_Sub1_2.method2612((float) local16);
			this.aClass1_Sub13_Sub1_2.method2612((float) local31);
			this.aClass1_Sub13_Sub1_2.method2612((float) local25);
		} else {
			this.aClass1_Sub13_Sub1_2.method2611((float) local16);
			this.aClass1_Sub13_Sub1_2.method2611((float) local31);
			this.aClass1_Sub13_Sub1_2.method2611((float) local25);
		}
		this.aClass1_Sub13_Sub1_2.method3060(local566);
		this.aClass1_Sub13_Sub1_2.method3060(local586);
		this.aClass1_Sub13_Sub1_2.method3060(local599);
		this.aClass1_Sub13_Sub1_2.method3060(255);
		this.method5634(local81);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BS)V")
	private void method5634(@OriginalArg(1) short arg0) {
		if (this.aClass9_Sub3_31.aBoolean523) {
			this.aClass1_Sub13_6.method3038(arg0);
		} else {
			this.aClass1_Sub13_6.method3068(arg0);
		}
		this.anInt6483++;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I[[ZBII)V")
	public void method5635(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface7_3 == null || (arg0 + arg3 < this.anInt6478 || (arg3 - arg0 > this.anInt6479 || (arg2 + arg0 < this.anInt6484 || arg2 - arg0 > this.anInt6488)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt6484; local62 <= this.anInt6488; local62++) {
			for (@Pc(67) int local67 = this.anInt6478; local67 <= this.anInt6479; local67++) {
				@Pc(74) int local74 = local67 - arg3;
				@Pc(78) int local78 = local62 - arg2;
				if (local74 > -arg0 && local74 < arg0 && -arg0 < local78 && local78 < arg0 && arg1[local74 + arg0][arg0 + local78]) {
					this.aClass9_Sub3_31.method6664((int) (this.aClass1_Sub27_3.method5486() * 255.0F) << 24);
					this.aClass9_Sub3_31.method6713(null, this.aClass188_6, null, this.aClass188_5);
					this.aClass9_Sub3_31.method6719(0, this.anInt6483, this.anInterface7_3);
					return;
				}
			}
		}
	}
}
