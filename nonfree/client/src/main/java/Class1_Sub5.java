import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!gk;")
	private final Class96_Sub1 aClass96_Sub1_1;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!ja;")
	private final Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_7;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	private final int anInt594;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	private final int anInt593;

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
	private final int anInt602;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	private final int anInt595;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!oi;")
	private final Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!ig;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "Lclient!nn;")
	private final Class179 aClass179_6;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "Lclient!nn;")
	private final Class179 aClass179_5;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!ia;")
	private Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Lclient!ct;")
	private Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!bu;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!ih;Lclient!gk;Lclient!ja;[I)V")
	public Class1_Sub5(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class96_Sub1 arg1, @OriginalArg(2) Class1_Sub4 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass96_Sub1_1 = arg1;
		this.aClass1_Sub4_1 = arg2;
		this.aClass106_Sub2_7 = arg0;
		@Pc(22) int local22 = this.aClass1_Sub4_1.method3805() - (arg1.anInt5778 >> 1);
		this.anInt594 = this.aClass1_Sub4_1.method3813() - local22 >> arg1.anInt5779;
		this.anInt593 = local22 + this.aClass1_Sub4_1.method3813() >> arg1.anInt5779;
		this.anInt602 = this.aClass1_Sub4_1.method3809() - local22 >> arg1.anInt5779;
		this.anInt595 = this.aClass1_Sub4_1.method3809() + local22 >> arg1.anInt5779;
		@Pc(76) int local76 = this.anInt593 + 1 - this.anInt594;
		@Pc(85) int local85 = this.anInt595 + 1 - this.anInt602;
		this.aFloatArrayArray1 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(168) int local168;
		@Pc(183) int local183;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt602;
			if (local121 > 0 && this.aClass96_Sub1_1.anInt5775 - 1 > local121) {
				for (local132 = 0; local132 <= local76; local132++) {
					local140 = local132 + this.anInt594;
					if (local140 > 0 && this.aClass96_Sub1_1.anInt5777 - 1 > local140) {
						local168 = arg1.ua(local140 + 1, local121) - arg1.ua(local140 - 1, local121);
						local183 = arg1.ua(local140, local121 + 1) - arg1.ua(local140, local121 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local183 * local183 + 65536)));
						this.aFloatArrayArray2[local132][local114] = (float) local168 * local199;
						this.aFloatArrayArray1[local132][local114] = -256.0F * local199;
						this.aFloatArrayArray3[local132][local114] = local199 * (float) local183;
					}
				}
			}
		}
		local121 = 0;
		local132 = 0;
		for (local140 = this.anInt602; local140 <= this.anInt595; local140++) {
			if (local140 >= 0 && arg1.anInt5775 > local140) {
				for (local168 = this.anInt594; local168 <= this.anInt593; local168++) {
					if (local168 >= 0 && local168 < arg1.anInt5777) {
						local183 = arg3[local132];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray4[local168][local140];
						if (local295 != null && local183 != 0) {
							if (local183 == 1) {
								local121 += local295.length;
							} else {
								local121 += 3;
							}
						}
					}
					local132++;
				}
			} else {
				local132 += this.anInt593 - this.anInt594;
			}
		}
		if (local121 <= 0) {
			this.anInterface10_2 = null;
			this.anInterface3_2 = null;
			this.aClass179_6 = null;
			this.aClass179_5 = null;
		} else {
			this.aClass1_Sub3_1 = new Class1_Sub3(local121 * 2);
			this.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(local121 * 16);
			this.aClass38_2 = new Class38(Static427.method5762(local121));
			local168 = 0;
			local132 = 0;
			for (local183 = this.anInt602; local183 <= this.anInt595; local183++) {
				if (local183 >= 0 && arg1.anInt5775 > local183) {
					@Pc(400) int local400 = 0;
					for (@Pc(403) int local403 = this.anInt594; local403 <= this.anInt593; local403++) {
						if (local403 >= 0 && local403 < arg1.anInt5777) {
							@Pc(419) int local419 = arg3[local132];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray4[local403][local183];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray9[local403][local183];
							if (local426 != null && local419 != 0) {
								if (local419 == 1) {
									for (@Pc(587) int local587 = 0; local587 < local426.length; local587++) {
										this.method495(local433[local587], local168, local403, local426[local587], local400, local183);
									}
								} else if (local419 == 3) {
									this.method495(0, local168, local403, 0, local400, local183);
									this.method495(0, local168, local403, arg1.anInt5778, local400, local183);
									this.method495(arg1.anInt5778, local168, local403, 0, local400, local183);
								} else if (local419 == 2) {
									this.method495(0, local168, local403, arg1.anInt5778, local400, local183);
									this.method495(arg1.anInt5778, local168, local403, arg1.anInt5778, local400, local183);
									this.method495(0, local168, local403, 0, local400, local183);
								} else if (local419 == 5) {
									this.method495(arg1.anInt5778, local168, local403, arg1.anInt5778, local400, local183);
									this.method495(arg1.anInt5778, local168, local403, 0, local400, local183);
									this.method495(0, local168, local403, arg1.anInt5778, local400, local183);
								} else if (local419 == 4) {
									this.method495(arg1.anInt5778, local168, local403, 0, local400, local183);
									this.method495(0, local168, local403, 0, local400, local183);
									this.method495(arg1.anInt5778, local168, local403, arg1.anInt5778, local400, local183);
								}
							}
						}
						local400++;
						local132++;
					}
				} else {
					local132 += this.anInt593 - this.anInt594;
				}
				local168++;
			}
			this.anInterface10_2 = this.aClass106_Sub2_7.method2921(this.aClass1_Sub3_1.aByteArray14, false, this.aClass1_Sub3_1.anInt1710);
			this.anInterface3_2 = this.aClass106_Sub2_7.method2883(false, this.aClass1_Sub3_Sub2_1.anInt1710, this.aClass1_Sub3_Sub2_1.aByteArray14, 16);
			this.aClass179_6 = new Class179(this.anInterface3_2, 5126, 3, 0);
			this.aClass179_5 = new Class179(this.anInterface3_2, 5121, 4, 12);
		}
		this.aClass38_2 = null;
		this.aClass1_Sub3_Sub2_1 = null;
		this.aClass1_Sub3_1 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IS)V")
	private void method491(@OriginalArg(1) short arg0) {
		if (this.aClass106_Sub2_7.aBoolean227) {
			this.aClass1_Sub3_1.method1227(arg0);
		} else {
			this.aClass1_Sub3_1.method1199(arg0);
		}
		this.anInt603++;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII[[Z)V")
	public void method494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface10_2 == null || (this.anInt594 > arg2 + arg1 || (arg1 - arg2 > this.anInt593 || (this.anInt602 > arg2 + arg0 || this.anInt595 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt602; local50 <= this.anInt595; local50++) {
			for (@Pc(55) int local55 = this.anInt594; local55 <= this.anInt593; local55++) {
				@Pc(62) int local62 = local55 - arg1;
				@Pc(67) int local67 = local50 - arg0;
				if (local62 > -arg2 && arg2 > local62 && local67 > -arg2 && arg2 > local67 && arg3[local62 + arg2][local67 + arg2]) {
					this.aClass106_Sub2_7.method2868((int) (this.aClass1_Sub4_1.method3811() * 255.0F) << 24);
					this.aClass106_Sub2_7.method2847(null, null, this.aClass179_5, this.aClass179_6);
					this.aClass106_Sub2_7.method2848(this.anInt603, this.anInterface10_2, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBIII)V")
	private void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = -1L;
		@Pc(19) int local19 = (arg2 << this.aClass96_Sub1_1.anInt5779) + arg3;
		@Pc(27) int local27 = (arg5 << this.aClass96_Sub1_1.anInt5779) + arg0;
		@Pc(33) int local33 = this.aClass96_Sub1_1.ca(local19, local27);
		if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local11 = (long) local19 & 0xFFFFL | ((long) local27 & 0xFFFFL) << 16;
			@Pc(65) Class1 local65 = this.aClass38_2.method765(local11);
			if (local65 != null) {
				this.method491(((Class1_Sub32) local65).aShort78);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt592++;
		if (local11 != -1L) {
			this.aClass38_2.method766(new Class1_Sub32(local83), local11);
		}
		@Pc(124) float local124;
		@Pc(117) float local117;
		@Pc(110) float local110;
		@Pc(236) float local236;
		@Pc(244) float local244;
		@Pc(251) float local251;
		@Pc(258) float local258;
		@Pc(265) float local265;
		@Pc(274) float local274;
		@Pc(283) float local283;
		@Pc(307) float local307;
		if (arg3 == 0 && arg0 == 0) {
			local110 = this.aFloatArrayArray3[arg4][arg1];
			local117 = this.aFloatArrayArray1[arg4][arg1];
			local124 = this.aFloatArrayArray2[arg4][arg1];
		} else if (this.aClass96_Sub1_1.anInt5778 == arg3 && arg0 == 0) {
			local124 = this.aFloatArrayArray2[arg4 + 1][arg1];
			local117 = this.aFloatArrayArray1[arg4 + 1][arg1];
			local110 = this.aFloatArrayArray3[arg4 + 1][arg1];
		} else if (this.aClass96_Sub1_1.anInt5778 == arg3 && this.aClass96_Sub1_1.anInt5778 == arg0) {
			local117 = this.aFloatArrayArray1[arg4 + 1][arg1 + 1];
			local110 = this.aFloatArrayArray3[arg4 + 1][arg1 + 1];
			local124 = this.aFloatArrayArray2[arg4 + 1][arg1 + 1];
		} else if (arg3 == 0 && this.aClass96_Sub1_1.anInt5778 == arg0) {
			local117 = this.aFloatArrayArray1[arg4][arg1 + 1];
			local110 = this.aFloatArrayArray3[arg4][arg1 + 1];
			local124 = this.aFloatArrayArray2[arg4][arg1 + 1];
		} else {
			local236 = (float) arg3 / (float) this.aClass96_Sub1_1.anInt5778;
			local244 = (float) arg0 / (float) this.aClass96_Sub1_1.anInt5778;
			local251 = this.aFloatArrayArray2[arg4][arg1];
			local258 = this.aFloatArrayArray1[arg4][arg1];
			local265 = this.aFloatArrayArray3[arg4][arg1];
			local274 = this.aFloatArrayArray2[arg4 + 1][arg1];
			local283 = this.aFloatArrayArray1[arg4 + 1][arg1];
			@Pc(298) float local298 = local265 + local236 * (this.aFloatArrayArray3[arg4][arg1 + 1] - local265);
			local307 = this.aFloatArrayArray3[arg4 + 1][arg1];
			@Pc(324) float local324 = local274 + (this.aFloatArrayArray2[arg4 + 1][arg1 + 1] - local274) * local236;
			@Pc(341) float local341 = local283 + (this.aFloatArrayArray1[arg4 + 1][arg1 + 1] - local283) * local236;
			@Pc(357) float local357 = local258 + local236 * (this.aFloatArrayArray1[arg4][arg1 + 1] - local258);
			@Pc(372) float local372 = local251 + (this.aFloatArrayArray2[arg4][arg1 + 1] - local251) * local236;
			local117 = local357 + local244 * (local341 - local357);
			local124 = local372 + local244 * (local324 - local372);
			@Pc(406) float local406 = local307 + local236 * (this.aFloatArrayArray3[arg4 + 1][arg1 + 1] - local307);
			local110 = local298 + local244 * (local406 - local298);
		}
		local236 = this.aClass1_Sub4_1.method3813() - local19;
		local244 = this.aClass1_Sub4_1.method3810() - local33;
		local251 = this.aClass1_Sub4_1.method3809() - local27;
		local258 = (float) Math.sqrt((double) (local251 * local251 + local244 * local244 + local236 * local236));
		local265 = 1.0F / local258;
		local251 *= local265;
		local244 *= local265;
		local236 *= local265;
		local274 = local258 / (float) this.aClass1_Sub4_1.method3805();
		local283 = 1.0F - local274 * local274;
		if (local283 < 0.0F) {
			local283 = 0.0F;
		}
		local307 = local124 * local236 + local117 * local244 + local110 * local251;
		if (local307 < 0.0F) {
			local307 = 0.0F;
		}
		@Pc(546) float local546 = local283 * 2.0F * local307;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass1_Sub4_1.method3808();
		@Pc(567) int local567 = (int) ((float) (local557 >> 16 & 0xFF) * local546);
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(582) int local582 = (int) ((float) (local557 >> 8 & 0xFF) * local546);
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(597) int local597 = (int) (local546 * (float) (local557 & 0xFF));
		if (this.aClass106_Sub2_7.aBoolean227) {
			this.aClass1_Sub3_Sub2_1.method1228((float) local19);
			this.aClass1_Sub3_Sub2_1.method1228((float) local33);
			this.aClass1_Sub3_Sub2_1.method1228((float) local27);
		} else {
			this.aClass1_Sub3_Sub2_1.method1232((float) local19);
			this.aClass1_Sub3_Sub2_1.method1232((float) local33);
			this.aClass1_Sub3_Sub2_1.method1232((float) local27);
		}
		if (local597 > 255) {
			local597 = 255;
		}
		this.aClass1_Sub3_Sub2_1.method1208(local567);
		this.aClass1_Sub3_Sub2_1.method1208(local582);
		this.aClass1_Sub3_Sub2_1.method1208(local597);
		this.aClass1_Sub3_Sub2_1.method1208(255);
		this.method491(local83);
	}
}
