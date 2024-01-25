import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class4_Sub43 extends Class4 {

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
	private int anInt6822;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
	private int anInt6823;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!fs;")
	private final Class4_Sub12 aClass4_Sub12_1;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Lclient!ge;")
	private final Class26_Sub1 aClass26_Sub1_3;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_41;

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
	private final int anInt6821;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
	private final int anInt6818;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	private final int anInt6819;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
	private final int anInt6820;

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "Lclient!bb;")
	private final Class19 aClass19_16;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "Lclient!bb;")
	private final Class19 aClass19_17;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!cl;")
	private final Interface3 anInterface3_6;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Lclient!ip;")
	private final Interface6 anInterface6_6;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "Lclient!tq;")
	private Class4_Sub7 aClass4_Sub7_8;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "Lclient!hn;")
	private Class4_Sub7_Sub2 aClass4_Sub7_Sub2_3;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "Lclient!uc;")
	private Class198 aClass198_37;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ql;Lclient!ge;Lclient!fs;[I)V")
	public Class4_Sub43(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) Class4_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub12_1 = arg2;
		this.aClass26_Sub1_3 = arg1;
		this.aClass92_Sub2_41 = arg0;
		@Pc(20) int local20 = this.aClass4_Sub12_1.anInt6083 - (arg1.anInt2238 >> 1);
		this.anInt6821 = this.aClass4_Sub12_1.anInt6082 - local20 >> arg1.anInt2239;
		this.anInt6818 = local20 + this.aClass4_Sub12_1.anInt6082 >> arg1.anInt2239;
		this.anInt6819 = this.aClass4_Sub12_1.anInt6081 - local20 >> arg1.anInt2239;
		this.anInt6820 = this.aClass4_Sub12_1.anInt6081 + local20 >> arg1.anInt2239;
		@Pc(71) int local71 = this.anInt6818 + 1 - this.anInt6821;
		@Pc(80) int local80 = this.anInt6820 + 1 - this.anInt6819;
		this.aFloatArrayArray8 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray6 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray7 = new float[local71 + 1][local80 + 1];
		@Pc(109) int local109;
		@Pc(122) int local122;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(174) int local174;
		@Pc(189) int local189;
		for (local109 = 0; local109 <= local80; local109++) {
			local122 = local109 + this.anInt6819;
			if (local122 > 0 && this.aClass26_Sub1_3.anInt5936 - 1 > local122) {
				for (local139 = 0; local139 <= local71; local139++) {
					local147 = local139 + this.anInt6821;
					if (local147 > 0 && local147 < this.aClass26_Sub1_3.anInt5941 - 1) {
						local174 = arg1.method4996(local147 + 1, local122) - arg1.method4996(local147 - 1, local122);
						local189 = arg1.method4996(local147, local122 + 1) - arg1.method4996(local147, local122 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local189 * local189 + 65536)));
						this.aFloatArrayArray7[local139][local109] = local205 * (float) local174;
						this.aFloatArrayArray6[local139][local109] = local205 * -256.0F;
						this.aFloatArrayArray8[local139][local109] = local205 * (float) local189;
					}
				}
			}
		}
		local109 = 0;
		local122 = 0;
		for (local139 = this.anInt6819; local139 <= this.anInt6820; local139++) {
			if (local139 >= 0 && local139 < arg1.anInt5936) {
				for (local147 = this.anInt6821; local147 <= this.anInt6818; local147++) {
					if (local147 >= 0 && arg1.anInt5941 > local147) {
						local174 = arg3[local122];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray11[local147][local139];
						if (local303 != null && local174 != 0) {
							if (local174 == 1) {
								local109 += local303.length;
							} else {
								local109 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt6818 - this.anInt6821;
			}
		}
		if (local109 <= 0) {
			this.aClass19_16 = null;
			this.aClass19_17 = null;
			this.anInterface3_6 = null;
			this.anInterface6_6 = null;
		} else {
			this.aClass4_Sub7_8 = new Class4_Sub7(local109 * 2);
			this.aClass4_Sub7_Sub2_3 = new Class4_Sub7_Sub2(local109 * 16);
			this.aClass198_37 = new Class198(Static338.method4468(local109));
			local122 = 0;
			local139 = 0;
			for (local147 = this.anInt6819; local147 <= this.anInt6820; local147++) {
				if (local147 >= 0 && arg1.anInt5936 > local147) {
					local174 = 0;
					for (local189 = this.anInt6821; local189 <= this.anInt6818; local189++) {
						if (local189 >= 0 && local189 < arg1.anInt5941) {
							@Pc(406) int local406 = arg3[local122];
							@Pc(413) int[] local413 = arg1.anIntArrayArrayArray11[local189][local147];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray8[local189][local147];
							if (local413 != null && local406 != 0) {
								if (local406 == 1) {
									for (@Pc(429) int local429 = 0; local429 < local413.length; local429++) {
										this.method5665(local189, local174, local413[local429], local147, local420[local429], local139);
									}
								} else if (local406 == 3) {
									this.method5665(local189, local174, 0, local147, 0, local139);
									this.method5665(local189, local174, arg1.anInt2238, local147, 0, local139);
									this.method5665(local189, local174, 0, local147, arg1.anInt2238, local139);
								} else if (local406 == 2) {
									this.method5665(local189, local174, arg1.anInt2238, local147, 0, local139);
									this.method5665(local189, local174, arg1.anInt2238, local147, arg1.anInt2238, local139);
									this.method5665(local189, local174, 0, local147, 0, local139);
								} else if (local406 == 5) {
									this.method5665(local189, local174, arg1.anInt2238, local147, arg1.anInt2238, local139);
									this.method5665(local189, local174, 0, local147, arg1.anInt2238, local139);
									this.method5665(local189, local174, arg1.anInt2238, local147, 0, local139);
								} else if (local406 == 4) {
									this.method5665(local189, local174, 0, local147, arg1.anInt2238, local139);
									this.method5665(local189, local174, 0, local147, 0, local139);
									this.method5665(local189, local174, arg1.anInt2238, local147, arg1.anInt2238, local139);
								}
							}
						}
						local174++;
						local122++;
					}
				} else {
					local122 += this.anInt6818 - this.anInt6821;
				}
				local139++;
			}
			this.anInterface3_6 = this.aClass92_Sub2_41.method4589(this.aClass4_Sub7_8.aByteArray42, this.aClass4_Sub7_8.anInt2667, false);
			this.anInterface6_6 = this.aClass92_Sub2_41.method4550(16, this.aClass4_Sub7_Sub2_3.aByteArray42, this.aClass4_Sub7_Sub2_3.anInt2667, false);
			this.aClass19_16 = new Class19(this.aClass92_Sub2_41, this.anInterface6_6, 5126, 3, 0);
			this.aClass19_17 = new Class19(this.aClass92_Sub2_41, this.anInterface6_6, 5121, 4, 12);
		}
		this.aClass4_Sub7_Sub2_3 = null;
		this.aClass198_37 = null;
		this.aClass4_Sub7_8 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII[[Z)V")
	public void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface3_6 == null || (this.anInt6821 > arg2 + arg1 || (arg2 - arg1 > this.anInt6818 || (arg1 + arg0 < this.anInt6819 || arg0 - arg1 > this.anInt6820)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt6819; local51 <= this.anInt6820; local51++) {
			for (@Pc(58) int local58 = this.anInt6821; local58 <= this.anInt6818; local58++) {
				@Pc(70) int local70 = local58 - arg2;
				@Pc(75) int local75 = local51 - arg0;
				if (local70 > -arg1 && local70 < arg1 && -arg1 < local75 && arg1 > local75 && arg3[local70 + arg1][local75 + arg1]) {
					this.aClass92_Sub2_41.method4590((int) (this.aClass4_Sub12_1.aFloat72 * 255.0F) << 24);
					this.aClass92_Sub2_41.method4553(this.aClass19_16);
					this.aClass92_Sub2_41.method4595(this.aClass19_17);
					this.aClass92_Sub2_41.method4601();
					this.aClass92_Sub2_41.method4557(this.anInterface3_6, 0, this.anInt6823);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(SB)V")
	private void method5664(@OriginalArg(0) short arg0) {
		if (this.aClass92_Sub2_41.aBoolean459) {
			this.aClass4_Sub7_8.method2376(arg0);
		} else {
			this.aClass4_Sub7_8.method2400(arg0);
		}
		this.anInt6823++;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	private void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg0 << this.aClass26_Sub1_3.anInt2239) + arg2;
		@Pc(17) int local17 = arg4 + (arg3 << this.aClass26_Sub1_3.anInt2239);
		@Pc(23) int local23 = this.aClass26_Sub1_3.method4990(local9, local17);
		if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local1 = (long) local9 & 0xFFFFL | ((long) local17 & 0xFFFFL) << 16;
			@Pc(55) Class4 local55 = this.aClass198_37.method5261(local1);
			if (local55 != null) {
				this.method5664(((Class4_Sub11) local55).aShort39);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt6822++;
		if (local1 != -1L) {
			this.aClass198_37.method5267(local1, new Class4_Sub11(local73));
		}
		@Pc(137) float local137;
		@Pc(128) float local128;
		@Pc(146) float local146;
		@Pc(180) float local180;
		@Pc(188) float local188;
		@Pc(195) float local195;
		@Pc(202) float local202;
		@Pc(209) float local209;
		@Pc(218) float local218;
		@Pc(227) float local227;
		@Pc(316) float local316;
		if (arg2 == 0 && arg4 == 0) {
			local128 = this.aFloatArrayArray6[arg1][arg5];
			local137 = this.aFloatArrayArray7[arg1][arg5];
			local146 = this.aFloatArrayArray8[arg1][arg5];
		} else if (arg2 == this.aClass26_Sub1_3.anInt2238 && arg4 == 0) {
			local128 = this.aFloatArrayArray6[arg1 + 1][arg5];
			local137 = this.aFloatArrayArray7[arg1 + 1][arg5];
			local146 = this.aFloatArrayArray8[arg1 + 1][arg5];
		} else if (arg2 == this.aClass26_Sub1_3.anInt2238 && this.aClass26_Sub1_3.anInt2238 == arg4) {
			local128 = this.aFloatArrayArray6[arg1 + 1][arg5 + 1];
			local146 = this.aFloatArrayArray8[arg1 + 1][arg5 + 1];
			local137 = this.aFloatArrayArray7[arg1 + 1][arg5 + 1];
		} else if (arg2 == 0 && arg4 == this.aClass26_Sub1_3.anInt2238) {
			local137 = this.aFloatArrayArray7[arg1][arg5 + 1];
			local128 = this.aFloatArrayArray6[arg1][arg5 + 1];
			local146 = this.aFloatArrayArray8[arg1][arg5 + 1];
		} else {
			local180 = (float) arg2 / (float) this.aClass26_Sub1_3.anInt2238;
			local188 = (float) arg4 / (float) this.aClass26_Sub1_3.anInt2238;
			local195 = this.aFloatArrayArray7[arg1][arg5];
			local202 = this.aFloatArrayArray6[arg1][arg5];
			local209 = this.aFloatArrayArray8[arg1][arg5];
			local218 = this.aFloatArrayArray7[arg1 + 1][arg5];
			local227 = this.aFloatArrayArray6[arg1 + 1][arg5];
			@Pc(245) float local245 = local227 + (this.aFloatArrayArray6[arg1 + 1][arg5 + 1] - local227) * local180;
			@Pc(262) float local262 = local218 + local180 * (this.aFloatArrayArray7[arg1 + 1][arg5 + 1] - local218);
			@Pc(277) float local277 = local209 + (this.aFloatArrayArray8[arg1][arg5 + 1] - local209) * local180;
			@Pc(292) float local292 = local202 + (this.aFloatArrayArray6[arg1][arg5 + 1] - local202) * local180;
			@Pc(307) float local307 = local195 + (this.aFloatArrayArray7[arg1][arg5 + 1] - local195) * local180;
			local316 = this.aFloatArrayArray8[arg1 + 1][arg5];
			@Pc(333) float local333 = local316 + (this.aFloatArrayArray8[arg1 + 1][arg5 + 1] - local316) * local180;
			local128 = local292 + (local245 - local292) * local188;
			local137 = local188 * (local262 - local307) + local307;
			local146 = local188 * (local333 - local277) + local277;
		}
		local180 = this.aClass4_Sub12_1.anInt6082 - local9;
		local188 = this.aClass4_Sub12_1.anInt6079 - local23;
		local195 = this.aClass4_Sub12_1.anInt6081 - local17;
		local202 = (float) Math.sqrt((double) (local195 * local195 + local188 * local188 + local180 * local180));
		local209 = 1.0F / local202;
		local188 *= local209;
		local180 *= local209;
		local195 *= local209;
		local218 = local202 / (float) this.aClass4_Sub12_1.anInt6083;
		local227 = 1.0F - local218 * local218;
		if (local227 < 0.0F) {
			local227 = 0.0F;
		}
		local316 = local146 * local195 + local188 * local128 + local180 * local137;
		if (local316 < 0.0F) {
			local316 = 0.0F;
		}
		@Pc(542) float local542 = local316 * local227 * 2.0F;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass4_Sub12_1.anInt6078;
		@Pc(563) int local563 = (int) ((float) (local553 >> 16 & 0xFF) * local542);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(594) int local594 = (int) ((float) (local553 & 0xFF) * local542);
		if (local594 > 255) {
			local594 = 255;
		}
		if (this.aClass92_Sub2_41.aBoolean459) {
			this.aClass4_Sub7_Sub2_3.method2423((float) local9);
			this.aClass4_Sub7_Sub2_3.method2423((float) local23);
			this.aClass4_Sub7_Sub2_3.method2423((float) local17);
		} else {
			this.aClass4_Sub7_Sub2_3.method2422((float) local9);
			this.aClass4_Sub7_Sub2_3.method2422((float) local23);
			this.aClass4_Sub7_Sub2_3.method2422((float) local17);
		}
		this.aClass4_Sub7_Sub2_3.method2416(local563);
		this.aClass4_Sub7_Sub2_3.method2416(local580);
		this.aClass4_Sub7_Sub2_3.method2416(local594);
		this.aClass4_Sub7_Sub2_3.method2416(255);
		this.method5664(local73);
	}
}
