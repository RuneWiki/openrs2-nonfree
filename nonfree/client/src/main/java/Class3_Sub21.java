import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	private int anInt2168;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private int anInt2170;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!dn;")
	private final Class3_Sub13 aClass3_Sub13_1;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_15;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!sb;")
	private final Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	private final int anInt2172;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	private final int anInt2171;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
	private final int anInt2173;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	private final int anInt2169;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "Lclient!fb;")
	private Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "Lclient!ap;")
	private Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Lclient!bo;")
	private Class24 aClass24_10;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "Lclient!rd;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Lclient!mp;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!kr;")
	private final Class117 aClass117_3;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!kr;")
	private final Class117 aClass117_2;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!se;Lclient!sb;Lclient!dn;[I)V")
	public Class3_Sub21(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class22_Sub2 arg1, @OriginalArg(2) Class3_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub13_1 = arg2;
		this.aClass122_Sub2_15 = arg0;
		this.aClass22_Sub2_3 = arg1;
		@Pc(20) int local20 = this.aClass3_Sub13_1.anInt6661 - (arg1.anInt5581 >> 1);
		this.anInt2172 = this.aClass3_Sub13_1.anInt6662 - local20 >> arg1.anInt5580;
		this.anInt2171 = this.aClass3_Sub13_1.anInt6662 + local20 >> arg1.anInt5580;
		this.anInt2173 = this.aClass3_Sub13_1.anInt6666 - local20 >> arg1.anInt5580;
		this.anInt2169 = this.aClass3_Sub13_1.anInt6666 + local20 >> arg1.anInt5580;
		@Pc(70) int local70 = this.anInt2171 + 1 - this.anInt2172;
		@Pc(78) int local78 = this.anInt2169 + 1 - this.anInt2173;
		this.aFloatArrayArray2 = new float[local70 + 1][local78 + 1];
		this.aFloatArrayArray1 = new float[local70 + 1][local78 + 1];
		this.aFloatArrayArray3 = new float[local70 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(120) int local120;
		@Pc(138) int local138;
		@Pc(150) int local150;
		@Pc(179) int local179;
		@Pc(194) int local194;
		for (local107 = 0; local107 <= local78; local107++) {
			local120 = local107 + this.anInt2173;
			if (local120 > 0 && local120 < this.aClass22_Sub2_3.anInt5577 - 1) {
				for (local138 = 0; local138 <= local70; local138++) {
					local150 = local138 + this.anInt2172;
					if (local150 > 0 && local150 < this.aClass22_Sub2_3.anInt5574 - 1) {
						local179 = arg1.method4672(local150 + 1, local120) - arg1.method4672(local150 - 1, local120);
						local194 = arg1.method4672(local150, local120 + 1) - arg1.method4672(local150, local120 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local194 * local194 + local179 * local179 + 65536)));
						this.aFloatArrayArray3[local138][local107] = (float) local179 * local209;
						this.aFloatArrayArray2[local138][local107] = -256.0F * local209;
						this.aFloatArrayArray1[local138][local107] = (float) local194 * local209;
					}
				}
			}
		}
		local107 = 0;
		local120 = 0;
		for (local138 = this.anInt2173; local138 <= this.anInt2169; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt5577) {
				for (local150 = this.anInt2172; local150 <= this.anInt2171; local150++) {
					if (local150 >= 0 && arg1.anInt5574 > local150) {
						local179 = arg3[local120];
						@Pc(311) int[] local311 = arg1.anIntArrayArrayArray8[local150][local138];
						if (local311 != null && local179 != 0) {
							if (local179 == 1) {
								local107 += local311.length;
							} else {
								local107 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt2171 - this.anInt2172;
			}
		}
		if (local107 > 0) {
			this.aClass3_Sub4_2 = new Class3_Sub4(local107 * 2);
			this.aClass3_Sub4_Sub1_1 = new Class3_Sub4_Sub1(local107 * 16);
			this.aClass24_10 = new Class24(Static83.method1300(local107));
			local120 = 0;
			local138 = 0;
			for (local150 = this.anInt2173; local150 <= this.anInt2169; local150++) {
				if (local150 >= 0 && local150 < arg1.anInt5577) {
					local179 = 0;
					for (local194 = this.anInt2172; local194 <= this.anInt2171; local194++) {
						if (local194 >= 0 && arg1.anInt5574 > local194) {
							@Pc(410) int local410 = arg3[local120];
							@Pc(417) int[] local417 = arg1.anIntArrayArrayArray8[local194][local150];
							@Pc(424) int[] local424 = arg1.anIntArrayArrayArray7[local194][local150];
							if (local417 != null && local410 != 0) {
								if (local410 == 1) {
									for (@Pc(436) int local436 = 0; local436 < local417.length; local436++) {
										this.method1761(local138, local417[local436], local150, local194, local179, local424[local436]);
									}
								} else if (local410 == 3) {
									this.method1761(local138, 0, local150, local194, local179, 0);
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, 0);
									this.method1761(local138, 0, local150, local194, local179, arg1.anInt5581);
								} else if (local410 == 2) {
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, 0);
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, arg1.anInt5581);
									this.method1761(local138, 0, local150, local194, local179, 0);
								} else if (local410 == 5) {
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, arg1.anInt5581);
									this.method1761(local138, 0, local150, local194, local179, arg1.anInt5581);
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, 0);
								} else if (local410 == 4) {
									this.method1761(local138, 0, local150, local194, local179, arg1.anInt5581);
									this.method1761(local138, 0, local150, local194, local179, 0);
									this.method1761(local138, arg1.anInt5581, local150, local194, local179, arg1.anInt5581);
								}
							}
						}
						local179++;
						local120++;
					}
				} else {
					local120 += this.anInt2171 - this.anInt2172;
				}
				local138++;
			}
			this.anInterface8_1 = this.aClass122_Sub2_15.method4831(this.aClass3_Sub4_2.aByteArray70, this.aClass3_Sub4_2.anInt4268, false);
			this.anInterface6_1 = this.aClass122_Sub2_15.method4883(16, this.aClass3_Sub4_Sub1_1.aByteArray70, this.aClass3_Sub4_Sub1_1.anInt4268, false);
			this.aClass117_3 = new Class117(this.aClass122_Sub2_15, this.anInterface6_1, 5126, 3, 0);
			this.aClass117_2 = new Class117(this.aClass122_Sub2_15, this.anInterface6_1, 5121, 4, 12);
		} else {
			this.anInterface6_1 = null;
			this.anInterface8_1 = null;
			this.aClass117_3 = null;
			this.aClass117_2 = null;
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass3_Sub4_Sub1_1 = null;
		this.aClass24_10 = null;
		this.aClass3_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BS)V")
	private void method1759(@OriginalArg(1) short arg0) {
		if (this.aClass122_Sub2_15.aBoolean363) {
			this.aClass3_Sub4_2.method3660(arg0);
		} else {
			this.aClass3_Sub4_2.method3616(arg0);
		}
		this.anInt2170++;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[[ZI)V")
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface8_1 == null || (this.anInt2172 > arg2 + arg0 || (this.anInt2171 < arg0 - arg2 || (this.anInt2173 > arg2 + arg1 || arg1 - arg2 > this.anInt2169)))) {
			return;
		}
		for (@Pc(48) int local48 = this.anInt2173; local48 <= this.anInt2169; local48++) {
			for (@Pc(55) int local55 = this.anInt2172; local55 <= this.anInt2171; local55++) {
				@Pc(64) int local64 = local55 - arg0;
				@Pc(69) int local69 = local48 - arg1;
				if (local64 > -arg2 && arg2 > local64 && local69 > -arg2 && arg2 > local69 && arg3[local64 + arg2][arg2 + local69]) {
					this.aClass122_Sub2_15.method4872((int) (this.aClass3_Sub13_1.aFloat77 * 255.0F) << 24);
					this.aClass122_Sub2_15.method4832(this.aClass117_3);
					this.aClass122_Sub2_15.method4851(this.aClass117_2);
					this.aClass122_Sub2_15.method4879();
					this.aClass122_Sub2_15.method4840(this.anInterface8_1, 0, this.anInt2170);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	private void method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg1 + (arg3 << this.aClass22_Sub2_3.anInt5580);
		@Pc(18) int local18 = (arg2 << this.aClass22_Sub2_3.anInt5580) + arg5;
		@Pc(24) int local24 = this.aClass22_Sub2_3.method4678(local10, local18);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = (long) local10 & 0xFFFFL | ((long) local18 & 0xFFFFL) << 16;
			@Pc(56) Class3 local56 = this.aClass24_10.method609(local1);
			if (local56 != null) {
				this.method1759(((Class3_Sub9) local56).aShort4);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt2168++;
		if (local1 != -1L) {
			this.aClass24_10.method598(local1, new Class3_Sub9(local76));
		}
		@Pc(106) float local106;
		@Pc(120) float local120;
		@Pc(113) float local113;
		@Pc(257) float local257;
		@Pc(265) float local265;
		@Pc(272) float local272;
		@Pc(279) float local279;
		@Pc(286) float local286;
		@Pc(295) float local295;
		@Pc(304) float local304;
		@Pc(313) float local313;
		if (arg1 == 0 && arg5 == 0) {
			local106 = this.aFloatArrayArray3[arg4][arg0];
			local113 = this.aFloatArrayArray1[arg4][arg0];
			local120 = this.aFloatArrayArray2[arg4][arg0];
		} else if (this.aClass22_Sub2_3.anInt5581 == arg1 && arg5 == 0) {
			local120 = this.aFloatArrayArray2[arg4 + 1][arg0];
			local113 = this.aFloatArrayArray1[arg4 + 1][arg0];
			local106 = this.aFloatArrayArray3[arg4 + 1][arg0];
		} else if (this.aClass22_Sub2_3.anInt5581 == arg1 && this.aClass22_Sub2_3.anInt5581 == arg5) {
			local120 = this.aFloatArrayArray2[arg4 + 1][arg0 + 1];
			local106 = this.aFloatArrayArray3[arg4 + 1][arg0 + 1];
			local113 = this.aFloatArrayArray1[arg4 + 1][arg0 + 1];
		} else if (arg1 == 0 && this.aClass22_Sub2_3.anInt5581 == arg5) {
			local113 = this.aFloatArrayArray1[arg4][arg0 + 1];
			local106 = this.aFloatArrayArray3[arg4][arg0 + 1];
			local120 = this.aFloatArrayArray2[arg4][arg0 + 1];
		} else {
			local257 = (float) arg1 / (float) this.aClass22_Sub2_3.anInt5581;
			local265 = (float) arg5 / (float) this.aClass22_Sub2_3.anInt5581;
			local272 = this.aFloatArrayArray3[arg4][arg0];
			local279 = this.aFloatArrayArray2[arg4][arg0];
			local286 = this.aFloatArrayArray1[arg4][arg0];
			local295 = this.aFloatArrayArray3[arg4 + 1][arg0];
			local304 = this.aFloatArrayArray2[arg4 + 1][arg0];
			local313 = this.aFloatArrayArray1[arg4 + 1][arg0];
			@Pc(331) float local331 = local295 + local257 * (this.aFloatArrayArray3[arg4 + 1][arg0 + 1] - local295);
			@Pc(347) float local347 = local279 + local257 * (this.aFloatArrayArray2[arg4][arg0 + 1] - local279);
			@Pc(362) float local362 = local286 + (this.aFloatArrayArray1[arg4][arg0 + 1] - local286) * local257;
			@Pc(378) float local378 = local272 + local257 * (this.aFloatArrayArray3[arg4][arg0 + 1] - local272);
			@Pc(396) float local396 = local304 + (this.aFloatArrayArray2[arg4 + 1][arg0 + 1] - local304) * local257;
			@Pc(414) float local414 = local313 + local257 * (this.aFloatArrayArray1[arg4 + 1][arg0 + 1] - local313);
			local106 = local378 + local265 * (local331 - local378);
			local120 = (local396 - local347) * local265 + local347;
			local113 = local265 * (local414 - local362) + local362;
		}
		local257 = this.aClass3_Sub13_1.anInt6662 - local10;
		local265 = this.aClass3_Sub13_1.anInt6667 - local24;
		local272 = this.aClass3_Sub13_1.anInt6666 - local18;
		local279 = (float) Math.sqrt((double) (local272 * local272 + local257 * local257 + local265 * local265));
		local286 = 1.0F / local279;
		local257 *= local286;
		local272 *= local286;
		local265 *= local286;
		local295 = local279 / (float) this.aClass3_Sub13_1.anInt6661;
		local304 = 1.0F - local295 * local295;
		if (local304 < 0.0F) {
			local304 = 0.0F;
		}
		local313 = local106 * local257 + local265 * local120 + local113 * local272;
		if (local313 < 0.0F) {
			local313 = 0.0F;
		}
		@Pc(539) float local539 = local313 * local304 * 2.0F;
		if (local539 > (float) 1) {
			local539 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass3_Sub13_1.anInt6665;
		@Pc(561) int local561 = (int) ((float) (local551 >> 16 & 0xFF) * local539);
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(577) int local577 = (int) (local539 * (float) (local551 >> 8 & 0xFF));
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(590) int local590 = (int) (local539 * (float) (local551 & 0xFF));
		if (local590 > 255) {
			local590 = 255;
		}
		if (this.aClass122_Sub2_15.aBoolean363) {
			this.aClass3_Sub4_Sub1_1.method382((float) local10);
			this.aClass3_Sub4_Sub1_1.method382((float) local24);
			this.aClass3_Sub4_Sub1_1.method382((float) local18);
		} else {
			this.aClass3_Sub4_Sub1_1.method383((float) local10);
			this.aClass3_Sub4_Sub1_1.method383((float) local24);
			this.aClass3_Sub4_Sub1_1.method383((float) local18);
		}
		this.aClass3_Sub4_Sub1_1.method3614(local561);
		this.aClass3_Sub4_Sub1_1.method3614(local577);
		this.aClass3_Sub4_Sub1_1.method3614(local590);
		this.aClass3_Sub4_Sub1_1.method3614(255);
		this.method1759(local76);
	}
}
