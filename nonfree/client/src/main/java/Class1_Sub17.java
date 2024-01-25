import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	private int anInt2842;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!lg;")
	private final Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_17;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "Lclient!ma;")
	private final Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	private final int anInt2844;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
	private final int anInt2841;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private final int anInt2840;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private final int anInt2843;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "Lclient!re;")
	private Class1_Sub33 aClass1_Sub33_4;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!ob;")
	private Class1_Sub33_Sub1 aClass1_Sub33_Sub1_2;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!fa;")
	private Class77 aClass77_23;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "Lclient!gs;")
	private final Interface5 anInterface5_2;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!ec;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "Lclient!jt;")
	private final Class126 aClass126_6;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!jt;")
	private final Class126 aClass126_5;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!nm;Lclient!lg;Lclient!ma;[I)V")
	public Class1_Sub17(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class42_Sub1 arg1, @OriginalArg(2) Class1_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass42_Sub1_1 = arg1;
		this.aClass164_Sub1_17 = arg0;
		this.aClass1_Sub27_1 = arg2;
		@Pc(20) int local20 = this.aClass1_Sub27_1.anInt3868 - (arg1.anInt3584 >> 1);
		this.anInt2844 = this.aClass1_Sub27_1.anInt3874 - local20 >> arg1.anInt3582;
		this.anInt2841 = this.aClass1_Sub27_1.anInt3874 + local20 >> arg1.anInt3582;
		this.anInt2840 = this.aClass1_Sub27_1.anInt3873 - local20 >> arg1.anInt3582;
		this.anInt2843 = this.aClass1_Sub27_1.anInt3873 + local20 >> arg1.anInt3582;
		@Pc(72) int local72 = this.anInt2841 + 1 - this.anInt2844;
		@Pc(81) int local81 = this.anInt2843 + 1 - this.anInt2840;
		this.aFloatArrayArray1 = new float[local72 + 1][local81 + 1];
		this.aFloatArrayArray3 = new float[local72 + 1][local81 + 1];
		this.aFloatArrayArray2 = new float[local72 + 1][local81 + 1];
		@Pc(110) int local110;
		@Pc(118) int local118;
		@Pc(132) int local132;
		@Pc(144) int local144;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (local110 = 0; local110 <= local81; local110++) {
			local118 = local110 + this.anInt2840;
			if (local118 > 0 && local118 < this.aClass42_Sub1_1.anInt3742 - 1) {
				for (local132 = 0; local132 <= local72; local132++) {
					local144 = this.anInt2844 + local132;
					if (local144 > 0 && local144 < this.aClass42_Sub1_1.anInt3739 - 1) {
						local170 = arg1.method3060(local144 + 1, local118) - arg1.method3060(local144 - 1, local118);
						local184 = arg1.method3060(local144, local118 + 1) - arg1.method3060(local144, local118 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + local170 * local170 + 65536)));
						this.aFloatArrayArray1[local132][local110] = (float) local170 * local199;
						this.aFloatArrayArray3[local132][local110] = local199 * -256.0F;
						this.aFloatArrayArray2[local132][local110] = local199 * (float) local184;
					}
				}
			}
		}
		local110 = 0;
		local118 = 0;
		for (local132 = this.anInt2840; local132 <= this.anInt2843; local132++) {
			if (local132 >= 0 && arg1.anInt3742 > local132) {
				for (local144 = this.anInt2844; local144 <= this.anInt2841; local144++) {
					if (local144 >= 0 && arg1.anInt3739 > local144) {
						local170 = arg3[local118];
						@Pc(281) int[] local281 = arg1.anIntArrayArrayArray6[local144][local132];
						if (local281 != null && local170 != 0) {
							if (local170 == 1) {
								local110 += local281.length;
							} else {
								local110 += 3;
							}
						}
					}
					local118++;
				}
			} else {
				local118 += this.anInt2841 - this.anInt2844;
			}
		}
		if (local110 > 0) {
			this.aClass1_Sub33_4 = new Class1_Sub33(local110 * 2);
			this.aClass1_Sub33_Sub1_2 = new Class1_Sub33_Sub1(local110 * 16);
			this.aClass77_23 = new Class77(Static183.method1325(local110));
			local118 = 0;
			local132 = 0;
			for (local144 = this.anInt2840; local144 <= this.anInt2843; local144++) {
				if (local144 >= 0 && arg1.anInt3742 > local144) {
					local170 = 0;
					for (local184 = this.anInt2844; local184 <= this.anInt2841; local184++) {
						if (local184 >= 0 && local184 < arg1.anInt3739) {
							@Pc(396) int local396 = arg3[local118];
							@Pc(403) int[] local403 = arg1.anIntArrayArrayArray6[local184][local144];
							@Pc(410) int[] local410 = arg1.anIntArrayArrayArray5[local184][local144];
							if (local403 != null && local396 != 0) {
								if (local396 == 1) {
									for (@Pc(558) int local558 = 0; local558 < local403.length; local558++) {
										this.method2342(local132, local184, local410[local558], local144, local403[local558], local170);
									}
								} else if (local396 == 3) {
									this.method2342(local132, local184, 0, local144, 0, local170);
									this.method2342(local132, local184, 0, local144, arg1.anInt3584, local170);
									this.method2342(local132, local184, arg1.anInt3584, local144, 0, local170);
								} else if (local396 == 2) {
									this.method2342(local132, local184, 0, local144, arg1.anInt3584, local170);
									this.method2342(local132, local184, arg1.anInt3584, local144, arg1.anInt3584, local170);
									this.method2342(local132, local184, 0, local144, 0, local170);
								} else if (local396 == 5) {
									this.method2342(local132, local184, arg1.anInt3584, local144, arg1.anInt3584, local170);
									this.method2342(local132, local184, arg1.anInt3584, local144, 0, local170);
									this.method2342(local132, local184, 0, local144, arg1.anInt3584, local170);
								} else if (local396 == 4) {
									this.method2342(local132, local184, arg1.anInt3584, local144, 0, local170);
									this.method2342(local132, local184, 0, local144, 0, local170);
									this.method2342(local132, local184, arg1.anInt3584, local144, arg1.anInt3584, local170);
								}
							}
						}
						local118++;
						local170++;
					}
				} else {
					local118 += this.anInt2841 - this.anInt2844;
				}
				local132++;
			}
			this.anInterface5_2 = this.aClass164_Sub1_17.method3620(this.aClass1_Sub33_4.aByteArray86, this.aClass1_Sub33_4.lb, false);
			this.anInterface3_2 = this.aClass164_Sub1_17.method3594(16, this.aClass1_Sub33_Sub1_2.aByteArray86, this.aClass1_Sub33_Sub1_2.lb, false);
			this.aClass126_6 = new Class126(this.aClass164_Sub1_17, this.anInterface3_2, 5126, 3, 0);
			this.aClass126_5 = new Class126(this.aClass164_Sub1_17, this.anInterface3_2, 5121, 4, 12);
		} else {
			this.aClass126_6 = null;
			this.anInterface3_2 = null;
			this.aClass126_5 = null;
			this.anInterface5_2 = null;
		}
		this.aClass1_Sub33_4 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass77_23 = null;
		this.aClass1_Sub33_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III[[ZB)V")
	public void method2341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface5_2 == null || (arg2 + arg1 < this.anInt2844 || (arg1 - arg2 > this.anInt2841 || (this.anInt2840 > arg0 + arg2 || this.anInt2843 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(43) int local43 = this.anInt2840; local43 <= this.anInt2843; local43++) {
			for (@Pc(62) int local62 = this.anInt2844; local62 <= this.anInt2841; local62++) {
				@Pc(70) int local70 = local62 - arg1;
				@Pc(75) int local75 = local43 - arg0;
				if (-arg2 < local70 && arg2 > local70 && local75 > -arg2 && local75 < arg2 && arg3[local70 + arg2][local75 + arg2]) {
					this.aClass164_Sub1_17.method3627((int) (this.aClass1_Sub27_1.aFloat25 * 255.0F) << 24);
					this.aClass164_Sub1_17.method3624(this.aClass126_6, null, this.aClass126_5, null);
					this.aClass164_Sub1_17.method3614(this.anInterface5_2, 0, this.anInt2842);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBIIII)V")
	private void method2342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg4 + (arg1 << this.aClass42_Sub1_1.anInt3582);
		@Pc(18) int local18 = arg2 + (arg3 << this.aClass42_Sub1_1.anInt3582);
		@Pc(24) int local24 = this.aClass42_Sub1_1.method3043(local10, local18);
		if ((arg4 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local18 & 0xFFFFL) << 16 | (long) local10 & 0xFFFFL;
			@Pc(52) Class1 local52 = this.aClass77_23.method1368(local1);
			if (local52 != null) {
				this.method2343(((Class1_Sub41) local52).aShort84);
				return;
			}
		}
		@Pc(71) short local71 = (short) this.anInt2839++;
		if (local1 != -1L) {
			this.aClass77_23.method1370(local1, new Class1_Sub41(local71));
		}
		@Pc(102) float local102;
		@Pc(95) float local95;
		@Pc(109) float local109;
		@Pc(181) float local181;
		@Pc(189) float local189;
		@Pc(196) float local196;
		@Pc(203) float local203;
		@Pc(210) float local210;
		@Pc(219) float local219;
		@Pc(228) float local228;
		@Pc(319) float local319;
		if (arg4 == 0 && arg2 == 0) {
			local95 = this.aFloatArrayArray3[arg5][arg0];
			local102 = this.aFloatArrayArray1[arg5][arg0];
			local109 = this.aFloatArrayArray2[arg5][arg0];
		} else if (arg4 == this.aClass42_Sub1_1.anInt3584 && arg2 == 0) {
			local102 = this.aFloatArrayArray1[arg5 + 1][arg0];
			local109 = this.aFloatArrayArray2[arg5 + 1][arg0];
			local95 = this.aFloatArrayArray3[arg5 + 1][arg0];
		} else if (arg4 == this.aClass42_Sub1_1.anInt3584 && this.aClass42_Sub1_1.anInt3584 == arg2) {
			local95 = this.aFloatArrayArray3[arg5 + 1][arg0 + 1];
			local109 = this.aFloatArrayArray2[arg5 + 1][arg0 + 1];
			local102 = this.aFloatArrayArray1[arg5 + 1][arg0 + 1];
		} else if (arg4 == 0 && this.aClass42_Sub1_1.anInt3584 == arg2) {
			local95 = this.aFloatArrayArray3[arg5][arg0 + 1];
			local109 = this.aFloatArrayArray2[arg5][arg0 + 1];
			local102 = this.aFloatArrayArray1[arg5][arg0 + 1];
		} else {
			local181 = (float) arg4 / (float) this.aClass42_Sub1_1.anInt3584;
			local189 = (float) arg2 / (float) this.aClass42_Sub1_1.anInt3584;
			local196 = this.aFloatArrayArray1[arg5][arg0];
			local203 = this.aFloatArrayArray3[arg5][arg0];
			local210 = this.aFloatArrayArray2[arg5][arg0];
			local219 = this.aFloatArrayArray1[arg5 + 1][arg0];
			local228 = this.aFloatArrayArray3[arg5 + 1][arg0];
			@Pc(243) float local243 = local196 + local181 * (this.aFloatArrayArray1[arg5][arg0 + 1] - local196);
			@Pc(258) float local258 = local203 + local181 * (this.aFloatArrayArray3[arg5][arg0 + 1] - local203);
			@Pc(274) float local274 = local210 + local181 * (this.aFloatArrayArray2[arg5][arg0 + 1] - local210);
			@Pc(292) float local292 = local219 + local181 * (this.aFloatArrayArray1[arg5 + 1][arg0 + 1] - local219);
			@Pc(310) float local310 = local228 + local181 * (this.aFloatArrayArray3[arg5 + 1][arg0 + 1] - local228);
			local319 = this.aFloatArrayArray2[arg5 + 1][arg0];
			@Pc(337) float local337 = local319 + (this.aFloatArrayArray2[arg5 + 1][arg0 + 1] - local319) * local181;
			local95 = local189 * (local310 - local258) + local258;
			local102 = local243 + local189 * (local292 - local243);
			local109 = local189 * (local337 - local274) + local274;
		}
		local181 = this.aClass1_Sub27_1.anInt3874 - local10;
		local189 = this.aClass1_Sub27_1.anInt3876 - local24;
		local196 = this.aClass1_Sub27_1.anInt3873 - local18;
		local203 = (float) Math.sqrt((double) (local196 * local196 + local181 * local181 + local189 * local189));
		local210 = 1.0F / local203;
		local189 *= local210;
		local196 *= local210;
		local181 *= local210;
		local219 = local203 / (float) this.aClass1_Sub27_1.anInt3868;
		local228 = 1.0F - local219 * local219;
		if (local228 < 0.0F) {
			local228 = 0.0F;
		}
		local319 = local95 * local189 + local102 * local181 + local109 * local196;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(523) float local523 = local319 * local228 * 2.0F;
		if (local523 > 1.0F) {
			local523 = 1.0F;
		}
		@Pc(533) int local533 = this.aClass1_Sub27_1.anInt3869;
		@Pc(543) int local543 = (int) ((float) (local533 >> 16 & 0xFF) * local523);
		if (local543 > 255) {
			local543 = 255;
		}
		@Pc(561) int local561 = (int) ((float) (local533 >> 8 & 0xFF) * local523);
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(583) int local583 = (int) (local523 * (float) (local533 & 0xFF));
		if (local583 > 255) {
			local583 = 255;
		}
		if (this.aClass164_Sub1_17.aBoolean413) {
			this.aClass1_Sub33_Sub1_2.method3828((float) local10);
			this.aClass1_Sub33_Sub1_2.method3828((float) local24);
			this.aClass1_Sub33_Sub1_2.method3828((float) local18);
		} else {
			this.aClass1_Sub33_Sub1_2.method3827((float) local10);
			this.aClass1_Sub33_Sub1_2.method3827((float) local24);
			this.aClass1_Sub33_Sub1_2.method3827((float) local18);
		}
		this.aClass1_Sub33_Sub1_2.method5165(local543);
		this.aClass1_Sub33_Sub1_2.method5165(local561);
		this.aClass1_Sub33_Sub1_2.method5165(local583);
		this.aClass1_Sub33_Sub1_2.method5165(255);
		this.method2343(local71);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BS)V")
	private void method2343(@OriginalArg(1) short arg0) {
		if (this.aClass164_Sub1_17.aBoolean413) {
			this.aClass1_Sub33_4.method5138(arg0);
		} else {
			this.aClass1_Sub33_4.method5169(arg0);
		}
		this.anInt2842++;
	}
}
