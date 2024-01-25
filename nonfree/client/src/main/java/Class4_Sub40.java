import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	private int anInt6012;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	private int anInt6014;

	@OriginalMember(owner = "client!tn", name = "G", descriptor = "Lclient!er;")
	private final Class60_Sub1 aClass60_Sub1_2;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "Lclient!pc;")
	private final Class4_Sub33 aClass4_Sub33_1;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_35;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private final int anInt6011;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	private final int anInt6010;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private final int anInt6015;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
	private final int anInt6013;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Lclient!lf;")
	private Class4_Sub11 aClass4_Sub11_8;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "Lclient!lb;")
	private Class4_Sub11_Sub2 aClass4_Sub11_Sub2_3;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!dj;")
	private Class43 aClass43_31;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "Lclient!is;")
	private final Interface6 anInterface6_5;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!mp;")
	private final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "Lclient!wi;")
	private final Class217 aClass217_13;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "Lclient!wi;")
	private final Class217 aClass217_14;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ig;Lclient!er;Lclient!pc;[I)V")
	public Class4_Sub40(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class60_Sub1 arg1, @OriginalArg(2) Class4_Sub33 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass60_Sub1_2 = arg1;
		this.aClass4_Sub33_1 = arg2;
		this.aClass47_Sub2_35 = arg0;
		@Pc(20) int local20 = this.aClass4_Sub33_1.anInt5292 - (arg1.anInt2106 >> 1);
		this.anInt6011 = this.aClass4_Sub33_1.anInt5295 - local20 >> arg1.anInt2110;
		this.anInt6010 = this.aClass4_Sub33_1.anInt5295 + local20 >> arg1.anInt2110;
		this.anInt6015 = this.aClass4_Sub33_1.anInt5298 - local20 >> arg1.anInt2110;
		this.anInt6013 = this.aClass4_Sub33_1.anInt5298 + local20 >> arg1.anInt2110;
		@Pc(73) int local73 = this.anInt6010 + 1 - this.anInt6011;
		@Pc(82) int local82 = this.anInt6013 + 1 - this.anInt6015;
		this.aFloatArrayArray5 = new float[local73 + 1][local82 + 1];
		this.aFloatArrayArray7 = new float[local73 + 1][local82 + 1];
		this.aFloatArrayArray6 = new float[local73 + 1][local82 + 1];
		@Pc(111) int local111;
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(166) int local166;
		@Pc(181) int local181;
		for (local111 = 0; local111 <= local82; local111++) {
			local123 = local111 + this.anInt6015;
			if (local123 > 0 && local123 < this.aClass60_Sub1_2.anInt2564 - 1) {
				for (local134 = 0; local134 <= local73; local134++) {
					local142 = this.anInt6011 + local134;
					if (local142 > 0 && local142 < this.aClass60_Sub1_2.anInt2567 - 1) {
						local166 = arg1.method2264(local142 + 1, local123) - arg1.method2264(local142 - 1, local123);
						local181 = arg1.method2264(local142, local123 + 1) - arg1.method2264(local142, local123 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local181 * local181 + local166 * local166 + 65536)));
						this.aFloatArrayArray7[local134][local111] = local196 * (float) local166;
						this.aFloatArrayArray6[local134][local111] = local196 * -256.0F;
						this.aFloatArrayArray5[local134][local111] = (float) local181 * local196;
					}
				}
			}
		}
		local111 = 0;
		local123 = 0;
		for (local134 = this.anInt6015; local134 <= this.anInt6013; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt2564) {
				for (local142 = this.anInt6011; local142 <= this.anInt6010; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt2567) {
						local166 = arg3[local123];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray6[local142][local134];
						if (local291 != null && local166 != 0) {
							if (local166 == 1) {
								local111 += local291.length;
							} else {
								local111 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt6010 - this.anInt6011;
			}
		}
		if (local111 > 0) {
			this.aClass4_Sub11_8 = new Class4_Sub11(local111 * 2);
			this.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(local111 * 16);
			this.aClass43_31 = new Class43(Static28.method5505(local111));
			local134 = 0;
			local123 = 0;
			for (local142 = this.anInt6015; local142 <= this.anInt6013; local142++) {
				if (local142 >= 0 && arg1.anInt2564 > local142) {
					local166 = 0;
					for (local181 = this.anInt6011; local181 <= this.anInt6010; local181++) {
						if (local181 >= 0 && local181 < arg1.anInt2567) {
							@Pc(384) int local384 = arg3[local123];
							@Pc(391) int[] local391 = arg1.anIntArrayArrayArray6[local181][local142];
							@Pc(398) int[] local398 = arg1.anIntArrayArrayArray8[local181][local142];
							if (local391 != null && local384 != 0) {
								if (local384 == 1) {
									for (@Pc(557) int local557 = 0; local557 < local391.length; local557++) {
										this.method5107(local391[local557], local181, local134, local142, local166, local398[local557]);
									}
								} else if (local384 == 3) {
									this.method5107(0, local181, local134, local142, local166, 0);
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, 0);
									this.method5107(0, local181, local134, local142, local166, arg1.anInt2106);
								} else if (local384 == 2) {
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, 0);
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, arg1.anInt2106);
									this.method5107(0, local181, local134, local142, local166, 0);
								} else if (local384 == 5) {
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, arg1.anInt2106);
									this.method5107(0, local181, local134, local142, local166, arg1.anInt2106);
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, 0);
								} else if (local384 == 4) {
									this.method5107(0, local181, local134, local142, local166, arg1.anInt2106);
									this.method5107(0, local181, local134, local142, local166, 0);
									this.method5107(arg1.anInt2106, local181, local134, local142, local166, arg1.anInt2106);
								}
							}
						}
						local123++;
						local166++;
					}
				} else {
					local123 += this.anInt6010 - this.anInt6011;
				}
				local134++;
			}
			this.anInterface6_5 = this.aClass47_Sub2_35.method2819(this.aClass4_Sub11_8.aByteArray55, this.aClass4_Sub11_8.anInt3768, false);
			this.anInterface8_5 = this.aClass47_Sub2_35.method2783(16, this.aClass4_Sub11_Sub2_3.aByteArray55, this.aClass4_Sub11_Sub2_3.anInt3768, false);
			this.aClass217_13 = new Class217(this.aClass47_Sub2_35, this.anInterface8_5, 5126, 3, 0);
			this.aClass217_14 = new Class217(this.aClass47_Sub2_35, this.anInterface8_5, 5121, 4, 12);
		} else {
			this.aClass217_13 = null;
			this.aClass217_14 = null;
			this.anInterface8_5 = null;
			this.anInterface6_5 = null;
		}
		this.aClass43_31 = null;
		this.aClass4_Sub11_Sub2_3 = null;
		this.aClass4_Sub11_8 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII)V")
	private void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(2) long local2 = (long) -1;
		@Pc(10) int local10 = (arg1 << this.aClass60_Sub1_2.anInt2110) + arg0;
		@Pc(19) int local19 = arg5 + (arg3 << this.aClass60_Sub1_2.anInt2110);
		@Pc(25) int local25 = this.aClass60_Sub1_2.method2270(local10, local19);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local2 = (long) local10 & 0xFFFFL | ((long) local19 & 0xFFFFL) << 16;
			@Pc(53) Class4 local53 = this.aClass43_31.method1273(local2);
			if (local53 != null) {
				this.method5109(((Class4_Sub38) local53).aShort87);
				return;
			}
		}
		@Pc(71) short local71 = (short) this.anInt6012++;
		if (local2 != -1L) {
			this.aClass43_31.method1276(new Class4_Sub38(local71), local2);
		}
		@Pc(111) float local111;
		@Pc(129) float local129;
		@Pc(120) float local120;
		@Pc(230) float local230;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(303) float local303;
		if (arg0 == 0 && arg5 == 0) {
			local111 = this.aFloatArrayArray7[arg4][arg2];
			local129 = this.aFloatArrayArray6[arg4][arg2];
			local120 = this.aFloatArrayArray5[arg4][arg2];
		} else if (arg0 == this.aClass60_Sub1_2.anInt2106 && arg5 == 0) {
			local111 = this.aFloatArrayArray7[arg4 + 1][arg2];
			local120 = this.aFloatArrayArray5[arg4 + 1][arg2];
			local129 = this.aFloatArrayArray6[arg4 + 1][arg2];
		} else if (this.aClass60_Sub1_2.anInt2106 == arg0 && arg5 == this.aClass60_Sub1_2.anInt2106) {
			local120 = this.aFloatArrayArray5[arg4 + 1][arg2 + 1];
			local129 = this.aFloatArrayArray6[arg4 + 1][arg2 + 1];
			local111 = this.aFloatArrayArray7[arg4 + 1][arg2 + 1];
		} else if (arg0 == 0 && this.aClass60_Sub1_2.anInt2106 == arg5) {
			local129 = this.aFloatArrayArray6[arg4][arg2 + 1];
			local111 = this.aFloatArrayArray7[arg4][arg2 + 1];
			local120 = this.aFloatArrayArray5[arg4][arg2 + 1];
		} else {
			local230 = (float) arg0 / (float) this.aClass60_Sub1_2.anInt2106;
			local238 = (float) arg5 / (float) this.aClass60_Sub1_2.anInt2106;
			local245 = this.aFloatArrayArray7[arg4][arg2];
			local252 = this.aFloatArrayArray6[arg4][arg2];
			local259 = this.aFloatArrayArray5[arg4][arg2];
			local268 = this.aFloatArrayArray7[arg4 + 1][arg2];
			local277 = this.aFloatArrayArray6[arg4 + 1][arg2];
			@Pc(294) float local294 = local277 + (this.aFloatArrayArray6[arg4 + 1][arg2 + 1] - local277) * local230;
			local303 = this.aFloatArrayArray5[arg4 + 1][arg2];
			@Pc(319) float local319 = local245 + local230 * (this.aFloatArrayArray7[arg4][arg2 + 1] - local245);
			@Pc(334) float local334 = local252 + local230 * (this.aFloatArrayArray6[arg4][arg2 + 1] - local252);
			@Pc(352) float local352 = local268 + (this.aFloatArrayArray7[arg4 + 1][arg2 + 1] - local268) * local230;
			@Pc(368) float local368 = local259 + local230 * (this.aFloatArrayArray5[arg4][arg2 + 1] - local259);
			local111 = local319 + (local352 - local319) * local238;
			@Pc(393) float local393 = local303 + local230 * (this.aFloatArrayArray5[arg4 + 1][arg2 + 1] - local303);
			local129 = local334 + local238 * (local294 - local334);
			local120 = local238 * (local393 - local368) + local368;
		}
		local230 = this.aClass4_Sub33_1.anInt5295 - local10;
		local238 = this.aClass4_Sub33_1.anInt5294 - local25;
		local245 = this.aClass4_Sub33_1.anInt5298 - local19;
		local252 = (float) Math.sqrt((double) (local230 * local230 + local238 * local238 + local245 * local245));
		local259 = 1.0F / local252;
		local245 *= local259;
		local230 *= local259;
		local238 *= local259;
		local268 = local252 / (float) this.aClass4_Sub33_1.anInt5292;
		local277 = 1.0F - local268 * local268;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		local303 = local230 * local111 + local238 * local129 + local120 * local245;
		if (local303 < 0.0F) {
			local303 = 0.0F;
		}
		@Pc(529) float local529 = local277 * 2.0F * local303;
		if (local529 > 1.0F) {
			local529 = 1.0F;
		}
		@Pc(540) int local540 = this.aClass4_Sub33_1.anInt5293;
		@Pc(550) int local550 = (int) ((float) (local540 >> 16 & 0xFF) * local529);
		if (local550 > 255) {
			local550 = 255;
		}
		@Pc(566) int local566 = (int) ((float) (local540 >> 8 & 0xFF) * local529);
		if (local566 > 255) {
			local566 = 255;
		}
		@Pc(579) int local579 = (int) ((float) (local540 & 0xFF) * local529);
		if (local579 > 255) {
			local579 = 255;
		}
		if (this.aClass47_Sub2_35.aBoolean235) {
			this.aClass4_Sub11_Sub2_3.method3463((float) local10);
			this.aClass4_Sub11_Sub2_3.method3463((float) local25);
			this.aClass4_Sub11_Sub2_3.method3463((float) local19);
		} else {
			this.aClass4_Sub11_Sub2_3.method3462((float) local10);
			this.aClass4_Sub11_Sub2_3.method3462((float) local25);
			this.aClass4_Sub11_Sub2_3.method3462((float) local19);
		}
		this.aClass4_Sub11_Sub2_3.method3434(local550);
		this.aClass4_Sub11_Sub2_3.method3434(local566);
		this.aClass4_Sub11_Sub2_3.method3434(local579);
		this.aClass4_Sub11_Sub2_3.method3434(255);
		this.method5109(local71);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[[ZII)V")
	public void method5108(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface6_5 == null || (arg0 + arg3 < this.anInt6011 || (this.anInt6010 < arg3 - arg0 || (arg0 + arg2 < this.anInt6015 || arg2 - arg0 > this.anInt6013)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt6015; local51 <= this.anInt6013; local51++) {
			for (@Pc(58) int local58 = this.anInt6011; local58 <= this.anInt6010; local58++) {
				@Pc(71) int local71 = local58 - arg3;
				@Pc(75) int local75 = local51 - arg2;
				if (local71 > -arg0 && local71 < arg0 && -arg0 < local75 && local75 < arg0 && arg1[local71 + arg0][arg0 + local75]) {
					this.aClass47_Sub2_35.method2820((int) (this.aClass4_Sub33_1.aFloat85 * 255.0F) << 24);
					this.aClass47_Sub2_35.method2805(this.aClass217_13, null, this.aClass217_14, null);
					this.aClass47_Sub2_35.method2818(this.anInterface6_5, 0, this.anInt6014);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(SZ)V")
	private void method5109(@OriginalArg(0) short arg0) {
		if (this.aClass47_Sub2_35.aBoolean235) {
			this.aClass4_Sub11_8.method3402(arg0);
		} else {
			this.aClass4_Sub11_8.method3430(arg0);
		}
		this.anInt6014++;
	}
}
