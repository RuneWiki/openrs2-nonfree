import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ql;IIII[[I[[II)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([IILclient!jb;I[I[II[I)V")
	private void method2117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(17) Class97 local17 = super.aClass97ArrayArray3[arg1][arg5];
		@Pc(35) int local35;
		@Pc(45) int local45;
		@Pc(225) int local225;
		@Pc(284) int local284;
		@Pc(342) int local342;
		@Pc(418) int local418;
		@Pc(429) int local429;
		@Pc(213) int local213;
		@Pc(273) int local273;
		@Pc(320) int local320;
		@Pc(378) int local378;
		@Pc(244) int local244;
		@Pc(302) int local302;
		@Pc(360) int local360;
		@Pc(407) int local407;
		@Pc(87) int local87;
		@Pc(114) int local114;
		@Pc(143) int local143;
		@Pc(167) int local167;
		@Pc(467) int local467;
		@Pc(255) int local255;
		@Pc(331) int local331;
		@Pc(390) int local390;
		if (local17 == null) {
			@Pc(1129) Class281 local1129 = super.aClass281ArrayArray3[arg1][arg5];
			if (local1129 != null) {
				@Pc(1154) short local1154;
				if (super.anInt2336 == -1) {
					for (local418 = 0; local418 < local1129.aShort103; local418++) {
						local35 = local1129.aShortArray123[local418] + (arg1 << super.anInt10463);
						local1154 = local1129.aShortArray129[local418];
						local45 = local1129.aShortArray124[local418] + (arg5 << super.anInt10463);
						local342 = super.anInt2332 + (super.anInt2339 * local45 + super.anInt2344 * local35 + local1154 * super.anInt2333 >> 14);
						if (super.aClass15_Sub1_4.anInt5035 >= local342) {
							return;
						}
						local225 = super.anInt2343 + (super.anInt2335 * local45 + super.anInt2337 * local1154 + local35 * super.anInt2338 >> 14);
						local284 = super.anInt2340 + (local45 * super.anInt2342 + super.anInt2341 * local35 + local1154 * super.anInt2334 >> 14);
						arg4[local418] = arg2.anInt4834 + local225 * super.aClass15_Sub1_4.anInt5032 / local342;
						arg3[local418] = arg2.anInt4831 + super.aClass15_Sub1_4.anInt5040 * local284 / local342;
						arg6[local418] = local342;
					}
				} else {
					for (local418 = 0; local418 < local1129.aShort103; local418++) {
						local35 = local1129.aShortArray123[local418] + (arg1 << super.anInt10463);
						local1154 = local1129.aShortArray129[local418];
						local45 = local1129.aShortArray124[local418] + (arg5 << super.anInt10463);
						local284 = (super.anInt2342 * local45 + local1154 * super.anInt2334 + local35 * super.anInt2341 >> 14) + super.anInt2340;
						local225 = (super.anInt2338 * local35 + local1154 * super.anInt2337 + local45 * super.anInt2335 >> 14) + super.anInt2343;
						arg4[local418] = arg2.anInt4834 + local225 * super.aClass15_Sub1_4.anInt5032 / super.anInt2336;
						arg3[local418] = arg2.anInt4831 + local284 * super.aClass15_Sub1_4.anInt5040 / super.anInt2336;
						arg6[local418] = super.anInt2336;
					}
				}
				if (local1129.aShortArray127 == null) {
					for (local418 = 0; local418 < local1129.aShort102; local418++) {
						@Pc(1843) short local1843 = local1129.aShortArray125[local418];
						@Pc(1848) short local1848 = local1129.aShortArray126[local418];
						@Pc(1853) short local1853 = local1129.aShortArray122[local418];
						local429 = arg4[local1843];
						local213 = arg4[local1848];
						local273 = arg4[local1853];
						local320 = arg3[local1843];
						local378 = arg3[local1848];
						local244 = arg3[local1853];
						if ((local429 - local213) * (-local378 + local244) - (local273 - local213) * (local320 + -local378) > 0) {
							local302 = local1129.anIntArray523[local418];
							if (local302 != -1) {
								arg2.aBoolean408 = local429 < 0 || local213 < 0 || local273 < 0 || local429 > arg2.anInt4833 || arg2.anInt4833 < local213 || arg2.anInt4833 < local273;
								arg2.method4062(local320, local378, local244, local429, local213, local273, arg6[local1843], arg6[local1848], arg6[local1853], Static593.method8378(local302, local1129.aShortArray128[local1843]), Static593.method8378(local302, local1129.aShortArray128[local1848]), Static593.method8378(local302, local1129.aShortArray128[local1853]));
							}
						}
					}
				} else {
					local418 = super.anIntArrayArray20[arg1][arg5];
					local255 = super.anIntArrayArray20[arg1 + 1][arg5];
					local331 = super.anIntArrayArray20[arg1][arg5 + 1];
					local390 = super.anInt10458 * arg1;
					local429 = local390 + super.anInt10458;
					local213 = arg5 * super.anInt10458;
					local273 = super.anInt10458 + local213;
					local320 = super.anInt2343 + (local213 * super.anInt2335 + super.anInt2338 * local390 + local418 * super.anInt2337 >> 14);
					local378 = super.anInt2340 + (local213 * super.anInt2342 + local418 * super.anInt2334 + local390 * super.anInt2341 >> 14);
					local244 = super.anInt2332 + (super.anInt2333 * local418 + local390 * super.anInt2344 + super.anInt2339 * local213 >> 14);
					local302 = (local213 * super.anInt2335 + local255 * super.anInt2337 + super.anInt2338 * local429 >> 14) + super.anInt2343;
					local360 = super.anInt2340 + (super.anInt2334 * local255 + super.anInt2341 * local429 + super.anInt2342 * local213 >> 14);
					local407 = (local255 * super.anInt2333 + local429 * super.anInt2344 + local213 * super.anInt2339 >> 14) + super.anInt2332;
					local87 = (super.anInt2337 * local331 + super.anInt2338 * local390 + super.anInt2335 * local273 >> 14) + super.anInt2343;
					local114 = super.anInt2340 + (local331 * super.anInt2334 + super.anInt2341 * local390 + super.anInt2342 * local273 >> 14);
					local143 = super.anInt2332 + (super.anInt2339 * local273 + local331 * super.anInt2333 + local390 * super.anInt2344 >> 14);
					for (local167 = 0; local167 < local1129.aShort102; local167++) {
						@Pc(1630) short local1630 = local1129.aShortArray125[local167];
						@Pc(1635) short local1635 = local1129.aShortArray126[local167];
						@Pc(1640) short local1640 = local1129.aShortArray122[local167];
						local467 = arg4[local1630];
						@Pc(1648) int local1648 = arg4[local1635];
						@Pc(1652) int local1652 = arg4[local1640];
						@Pc(1656) int local1656 = arg3[local1630];
						@Pc(1660) int local1660 = arg3[local1635];
						@Pc(1664) int local1664 = arg3[local1640];
						if (-((local1656 - local1660) * (local1652 + -local1648)) + (local467 - local1648) * (-local1660 + local1664) > 0) {
							arg2.aBoolean408 = local467 < 0 || local1648 < 0 || local1652 < 0 || arg2.anInt4833 < local467 || arg2.anInt4833 < local1648 || arg2.anInt4833 < local1652;
							@Pc(1719) short local1719 = local1129.aShortArray127[local167];
							if (local1719 == -1) {
								@Pc(1727) int local1727 = local1129.anIntArray523[local167];
								if (local1727 != -1) {
									arg2.method4062(local1656, local1660, local1664, local467, local1648, local1652, arg6[local1630], arg6[local1635], arg6[local1640], Static593.method8378(local1727, local1129.aShortArray128[local1630]), Static593.method8378(local1727, local1129.aShortArray128[local1635]), Static593.method8378(local1727, local1129.aShortArray128[local1640]));
								}
							} else {
								if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local1719).aByte54)) {
									arg2.anInt4832 = 100;
								}
								arg2.method4078(local1656, local1660, local1664, local467, local1648, local1652, arg6[local1630], arg6[local1635], arg6[local1640], local1129.aShortArray128[local1630], local1129.aShortArray128[local1635], local1129.aShortArray128[local1640], local320, local302, local87, local378, local360, local114, local244, local407, local143, local1719);
								arg2.anInt4832 = 0;
							}
						}
					}
				}
			}
		} else if ((local17.aByte29 & 0x2) == 0) {
			@Pc(30) int local30 = super.anInt10458 * arg1;
			local35 = local30 + super.anInt10458;
			@Pc(40) int local40 = super.anInt10458 * arg5;
			local45 = super.anInt10458 + local40;
			@Pc(60) int local60;
			@Pc(70) int local70;
			@Pc(196) int local196;
			if ((local17.aByte29 & 0x1) == 0) {
				local60 = super.anIntArrayArray20[arg1][arg5];
				local70 = super.anIntArrayArray20[arg1 + 1][arg5];
				local196 = super.anIntArrayArray20[arg1 + 1][arg5 + 1];
				local467 = super.anIntArrayArray20[arg1][arg5 + 1];
				if (super.anInt2336 == -1) {
					local87 = super.anInt2332 + (local40 * super.anInt2339 + local30 * super.anInt2344 + local60 * super.anInt2333 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local87) {
						return;
					}
					local114 = super.anInt2332 + (local40 * super.anInt2339 + super.anInt2333 * local70 + super.anInt2344 * local35 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local114) {
						return;
					}
					local143 = super.anInt2332 + (local35 * super.anInt2344 + local196 * super.anInt2333 + super.anInt2339 * local45 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local143) {
						return;
					}
					local167 = (super.anInt2339 * local45 + super.anInt2344 * local30 + super.anInt2333 * local467 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local167) {
						return;
					}
				} else {
					local167 = super.anInt2336;
					local143 = super.anInt2336;
					local114 = super.anInt2336;
					local87 = super.anInt2336;
				}
				local213 = (super.anInt2337 * local60 + super.anInt2338 * local30 + local40 * super.anInt2335 >> 14) + super.anInt2343;
				local225 = local213 * super.aClass15_Sub1_4.anInt5032 / local87 + arg2.anInt4834;
				local244 = (super.anInt2342 * local40 + super.anInt2334 * local60 + super.anInt2341 * local30 >> 14) + super.anInt2340;
				local255 = arg2.anInt4831 + local244 * super.aClass15_Sub1_4.anInt5040 / local87;
				local273 = (local40 * super.anInt2335 + super.anInt2338 * local35 + local70 * super.anInt2337 >> 14) + super.anInt2343;
				local284 = super.aClass15_Sub1_4.anInt5032 * local273 / local114 + arg2.anInt4834;
				local302 = (super.anInt2334 * local70 + super.anInt2341 * local35 + super.anInt2342 * local40 >> 14) + super.anInt2340;
				local320 = (local45 * super.anInt2335 + local35 * super.anInt2338 + local196 * super.anInt2337 >> 14) + super.anInt2343;
				local331 = local302 * super.aClass15_Sub1_4.anInt5040 / local114 + arg2.anInt4831;
				local342 = arg2.anInt4834 + local320 * super.aClass15_Sub1_4.anInt5032 / local143;
				local360 = super.anInt2340 + (local35 * super.anInt2341 + local196 * super.anInt2334 + super.anInt2342 * local45 >> 14);
				local390 = local360 * super.aClass15_Sub1_4.anInt5040 / local143 + arg2.anInt4831;
				local378 = (local467 * super.anInt2337 + super.anInt2338 * local30 + super.anInt2335 * local45 >> 14) + super.anInt2343;
				local407 = super.anInt2340 + (local30 * super.anInt2341 + local467 * super.anInt2334 + local45 * super.anInt2342 >> 14);
				local418 = arg2.anInt4834 + super.aClass15_Sub1_4.anInt5032 * local378 / local167;
				local429 = arg2.anInt4831 + local407 * super.aClass15_Sub1_4.anInt5040 / local167;
			} else {
				local60 = super.anIntArrayArray20[arg1][arg5];
				if (super.anInt2336 == -1) {
					local70 = super.anInt2333 * local60;
					local87 = (super.anInt2339 * local40 + local70 + super.anInt2344 * local30 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local87) {
						return;
					}
					local114 = (super.anInt2339 * local40 + local70 + super.anInt2344 * local35 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local114) {
						return;
					}
					local143 = super.anInt2332 + (super.anInt2339 * local45 + super.anInt2344 * local35 + local70 >> 14);
					if (local143 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local167 = (super.anInt2339 * local45 + local30 * super.anInt2344 + local70 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local167) {
						return;
					}
				} else {
					local167 = super.anInt2336;
					local143 = super.anInt2336;
					local114 = super.anInt2336;
					local87 = super.anInt2336;
				}
				local70 = super.anInt2337 * local60;
				local196 = super.anInt2334 * local60;
				local213 = (super.anInt2335 * local40 + local70 + local30 * super.anInt2338 >> 14) + super.anInt2343;
				local225 = arg2.anInt4834 + local213 * super.aClass15_Sub1_4.anInt5032 / local87;
				local244 = super.anInt2340 + (local30 * super.anInt2341 + local196 + local40 * super.anInt2342 >> 14);
				local255 = arg2.anInt4831 + local244 * super.aClass15_Sub1_4.anInt5040 / local87;
				local273 = (local35 * super.anInt2338 + local70 + super.anInt2335 * local40 >> 14) + super.anInt2343;
				local284 = super.aClass15_Sub1_4.anInt5032 * local273 / local114 + arg2.anInt4834;
				local302 = (super.anInt2342 * local40 + local35 * super.anInt2341 + local196 >> 14) + super.anInt2340;
				local320 = super.anInt2343 + (super.anInt2335 * local45 + super.anInt2338 * local35 + local70 >> 14);
				local331 = arg2.anInt4831 + local302 * super.aClass15_Sub1_4.anInt5040 / local114;
				local342 = local320 * super.aClass15_Sub1_4.anInt5032 / local143 + arg2.anInt4834;
				local360 = (local196 + local35 * super.anInt2341 + local45 * super.anInt2342 >> 14) + super.anInt2340;
				local378 = super.anInt2343 + (super.anInt2335 * local45 + super.anInt2338 * local30 + local70 >> 14);
				local390 = arg2.anInt4831 + super.aClass15_Sub1_4.anInt5040 * local360 / local143;
				local407 = (local45 * super.anInt2342 + local196 + super.anInt2341 * local30 >> 14) + super.anInt2340;
				local418 = local378 * super.aClass15_Sub1_4.anInt5032 / local167 + arg2.anInt4834;
				local429 = arg2.anInt4831 + super.aClass15_Sub1_4.anInt5040 * local407 / local167;
			}
			if (-((local390 - local429) * (-local418 + local284)) + (local342 - local418) * (local331 - local429) > 0) {
				arg2.aBoolean408 = local342 < 0 || local418 < 0 || local284 < 0 || arg2.anInt4833 < local342 || arg2.anInt4833 < local418 || local284 > arg2.anInt4833;
				if (local17.aShort39 < 0) {
					arg2.method4062(local390, local429, local331, local342, local418, local284, local143, local167, local114, local17.aShort38 & 0xFFFF, local17.aShort41 & 0xFFFF, local17.aShort40 & 0xFFFF);
				} else {
					if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local17.aShort39).aByte54)) {
						arg2.anInt4832 = 100;
					}
					arg2.method4078(local390, local429, local331, local342, local418, local284, local143, local167, local114, local17.aShort38 & 0xFFFF, local17.aShort41 & 0xFFFF, local17.aShort40 & 0xFFFF, local213, local273, local378, local244, local302, local407, local87, local114, local167, local17.aShort39);
					arg2.anInt4832 = 0;
				}
			}
			if (-((local255 - local331) * (-local284 + local418)) + (local225 - local284) * (-local331 + local429) > 0) {
				arg2.aBoolean408 = local225 < 0 || local284 < 0 || local418 < 0 || local225 > arg2.anInt4833 || arg2.anInt4833 < local284 || arg2.anInt4833 < local418;
				if (local17.aShort39 >= 0) {
					if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local17.aShort39).aByte54)) {
						arg2.anInt4832 = 100;
					}
					arg2.method4078(local255, local331, local429, local225, local284, local418, local87, local114, local167, local17.aShort42 & 0xFFFF, local17.aShort40 & 0xFFFF, local17.aShort41 & 0xFFFF, local213, local273, local378, local244, local302, local407, local87, local114, local167, local17.aShort39);
					arg2.anInt4832 = 0;
					return;
				}
				arg2.method4062(local255, local331, local429, local225, local284, local418, local87, local114, local167, local17.aShort42 & 0xFFFF, local17.aShort40 & 0xFFFF, local17.aShort41 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(9) Class255_Sub2 local9 = super.aClass15_Sub1_4.aClass255_Sub2_7;
		super.anInt2336 = -1;
		super.anInt2340 = local9.anInt9122;
		super.anInt2344 = local9.anInt9116;
		super.anInt2339 = local9.anInt9120;
		super.anInt2343 = local9.anInt9124;
		super.anInt2335 = local9.anInt9123;
		super.anInt2332 = local9.anInt9126;
		super.anInt2341 = local9.anInt9125;
		super.anInt2338 = local9.anInt9117;
		super.anInt2334 = local9.anInt9127;
		super.anInt2342 = local9.anInt9119;
		super.anInt2337 = local9.anInt9121;
		super.anInt2333 = local9.anInt9118;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(82) int local82 = arg0 + local62 - arg2;
					@Pc(89) int local89 = local66 + arg1 - arg2;
					if (local82 >= 0 && super.anInt10461 > local82 && local89 >= 0 && local89 < super.anInt10459) {
						this.method8442(local82, local89);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[IIZILclient!jb;[[ZII[II)V")
	private void method2118(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class165 arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int[] arg7) {
		@Pc(14) int local14 = (arg2 - arg6) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class15_Sub1_Sub2) super.aClass15_Sub1_4).aBoolean430;
		super.aClass15_Sub1_4.method5336(false);
		arg3.aBoolean406 = false;
		arg3.aBoolean405 = false;
		@Pc(35) int local35 = 0;
		@Pc(40) int local40 = local14;
		for (@Pc(42) int local42 = arg1; local42 < arg5; local42++) {
			for (@Pc(46) int local46 = arg6; local46 < arg2; local46++) {
				if (arg4[local42 - arg1][local46 - arg6]) {
					@Pc(92) int local92;
					if (super.aClass295ArrayArray3[local42][local46] != null) {
						@Pc(74) Class295 local74 = super.aClass295ArrayArray3[local42][local46];
						if (local74.aShort115 != -1 && (local74.aByte95 & 0x2) == 0 && local74.anInt8879 == 0) {
							local92 = super.aClass15_Sub1_4.method4278(local74.aShort115);
							arg3.method4062(local40 - 4, local40 + -4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, Static593.method8378(local92, local74.anInt8875), Static593.method8378(local92, local74.anInt8878), Static593.method8378(local92, local74.anInt8876));
							arg3.method4062(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, Static593.method8378(local92, local74.anInt8877), Static593.method8378(local92, local74.anInt8876), Static593.method8378(local92, local74.anInt8878));
						} else if (local74.anInt8879 == 0) {
							arg3.method4066(local40 - 4, local40 - 4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, local74.anInt8875, local74.anInt8878, local74.anInt8876);
							arg3.method4066(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, local74.anInt8877, local74.anInt8876, local74.anInt8878);
						} else {
							local92 = local74.anInt8879;
							arg3.method4066(local40 - 4, local40 - 4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, Static364.method6010(local74.anInt8875 & 0xFF000000, local92), Static364.method6010(local74.anInt8878 & 0xFF000000, local92), Static364.method6010(local74.anInt8876 & 0xFF000000, local92));
							arg3.method4066(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, Static364.method6010(local74.anInt8877 & 0xFF000000, local92), Static364.method6010(local74.anInt8876 & 0xFF000000, local92), Static364.method6010(local74.anInt8878 & 0xFF000000, local92));
						}
					} else if (super.aClass330ArrayArray3[local42][local46] != null) {
						@Pc(315) Class330 local315 = super.aClass330ArrayArray3[local42][local46];
						for (local92 = 0; local92 < local315.aShort124; local92++) {
							arg7[local92] = local315.aShortArray150[local92] * 4 / super.anInt10458 + local35;
							arg0[local92] = local40 - local315.aShortArray149[local92] * 4 / super.anInt10458;
						}
						for (@Pc(354) int local354 = 0; local354 < local315.aShort125; local354++) {
							@Pc(360) int local360 = local354 * 3;
							@Pc(364) int local364 = local360 + 1;
							@Pc(368) int local368 = local364 + 1;
							@Pc(372) int local372 = arg7[local360];
							@Pc(376) int local376 = arg7[local364];
							@Pc(380) int local380 = arg7[local368];
							@Pc(384) int local384 = arg0[local360];
							@Pc(388) int local388 = arg0[local364];
							@Pc(392) int local392 = arg0[local368];
							@Pc(454) int local454;
							if (local315.anIntArray646 != null && local315.anIntArray646[local354] != 0 && (local315.aShortArray152 == null || local315.aShortArray152 != null && local315.aShortArray152[local354] == -1)) {
								local454 = local315.anIntArray646[local354];
								arg3.method4066(local384, local388, local392, local372, local376, local380, 100, 100, 100, Static364.method6010(-(local315.anIntArray647[local360] & 0xFF000000) - 16777216, local454), Static364.method6010(-(local315.anIntArray647[local364] & 0xFF000000) - 16777216, local454), Static364.method6010(-(local315.anIntArray647[local368] & 0xFF000000) - 16777216, local454));
							} else if (local315.aShortArray152 == null || local315.aShortArray152[local354] == -1) {
								arg3.method4066(local384, local388, local392, local372, local376, local380, 100, 100, 100, local315.anIntArray647[local360], local315.anIntArray647[local364], local315.anIntArray647[local368]);
							} else {
								local454 = super.aClass15_Sub1_4.method4278(local315.aShortArray152[local354]);
								arg3.method4062(local384, local388, local392, local372, local376, local380, 100, 100, 100, local454, local454, local454);
							}
						}
					}
				}
				local40 -= 4;
			}
			local35 += 4;
			local40 = local14;
		}
		arg3.aBoolean406 = true;
		super.aClass15_Sub1_4.method5336(local23);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class91_Sub2 local9 = (Class91_Sub2) super.aClass15_Sub1_4.method4266(Thread.currentThread());
		local9.aClass165_1.anInt4832 = 0;
		if (super.aClass295ArrayArray3 != null) {
			this.method2122(arg0, local9.aClass165_1, local9.anIntArray253, local9.anIntArray243, super.aClass15_Sub1_4.aBoolean427, arg1, local9.anIntArray258, local9.anIntArray260);
		} else if (super.aClass97ArrayArray3 != null) {
			this.method2117(local9.anIntArray253, arg0, local9.aClass165_1, local9.anIntArray258, local9.anIntArray243, arg1, local9.anIntArray260);
			return;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[IIBI[[ZLclient!jb;[III)V")
	private void method2120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class165 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int arg7) {
		@Pc(14) int local14 = (arg0 - arg7) * 1024 / 256;
		@Pc(31) boolean local31 = ((Class15_Sub1_Sub2) super.aClass15_Sub1_4).aBoolean430;
		super.aClass15_Sub1_4.method5336(false);
		arg5.aBoolean405 = false;
		arg5.aBoolean406 = false;
		@Pc(43) int local43 = 0;
		@Pc(47) int local47 = local14;
		for (@Pc(49) int local49 = arg3; local49 < arg1; local49++) {
			for (@Pc(53) int local53 = arg7; local53 < arg0; local53++) {
				if (arg4[local49 - arg3][local53 - arg7]) {
					@Pc(90) int local90;
					if (super.aClass97ArrayArray3[local49][local53] != null) {
						@Pc(323) Class97 local323 = super.aClass97ArrayArray3[local49][local53];
						if (local323.aShort39 != -1 && (local323.aByte29 & 0x2) == 0 && local323.anInt3194 == -1) {
							local90 = super.aClass15_Sub1_4.method4278(local323.aShort39);
							arg5.method4062(local47 - 4, local47 - 4, local47, local43 + 4, local43, local43 + 4, 100, 100, 100, Static593.method8378(local90, local323.aShort38 & 0xFFFF), Static593.method8378(local90, local323.aShort41 & 0xFFFF), Static593.method8378(local90, local323.aShort40 & 0xFFFF));
							arg5.method4062(local47, local47, local47 - 4, local43, local43 + 4, local43, 100, 100, 100, Static593.method8378(local90, local323.aShort42 & 0xFFFF), Static593.method8378(local90, local323.aShort40 & 0xFFFF), Static593.method8378(local90, local323.aShort41 & 0xFFFF));
						} else if (local323.anInt3194 == -1) {
							arg5.method4062(local47 - 4, local47 + -4, local47, local43 + 4, local43, local43 + 4, 100, 100, 100, local323.aShort38 & 0xFFFF, local323.aShort41 & 0xFFFF, local323.aShort40 & 0xFFFF);
							arg5.method4062(local47, local47, local47 - 4, local43, local43 + 4, local43, 100, 100, 100, local323.aShort42 & 0xFFFF, local323.aShort40 & 0xFFFF, local323.aShort41 & 0xFFFF);
						} else {
							local90 = local323.anInt3194;
							arg5.method4062(local47 - 4, local47 + -4, local47, local43 + 4, local43, local43 + 4, 100, 100, 100, local90, local90, local90);
							arg5.method4062(local47, local47, local47 - 4, local43, local43 + 4, local43, 100, 100, 100, local90, local90, local90);
						}
					} else if (super.aClass281ArrayArray3[local49][local53] != null) {
						@Pc(88) Class281 local88 = super.aClass281ArrayArray3[local49][local53];
						for (local90 = 0; local90 < local88.aShort103; local90++) {
							arg2[local90] = local88.aShortArray123[local90] * 4 / super.anInt10458 + local43;
							arg6[local90] = local47 - local88.aShortArray124[local90] * 4 / super.anInt10458;
						}
						for (@Pc(131) int local131 = 0; local131 < local88.aShort102; local131++) {
							@Pc(138) short local138 = local88.aShortArray125[local131];
							@Pc(143) short local143 = local88.aShortArray126[local131];
							@Pc(148) short local148 = local88.aShortArray122[local131];
							@Pc(152) int local152 = arg2[local138];
							@Pc(156) int local156 = arg2[local143];
							@Pc(160) int local160 = arg2[local148];
							@Pc(164) int local164 = arg6[local138];
							@Pc(168) int local168 = arg6[local143];
							@Pc(172) int local172 = arg6[local148];
							@Pc(199) int local199;
							if (local88.anIntArray524 != null && local88.anIntArray524[local131] != -1) {
								local199 = local88.anIntArray524[local131];
								arg5.method4062(local164, local168, local172, local152, local156, local160, 100, 100, 100, Static593.method8378(local199, local88.aShortArray128[local138]), Static593.method8378(local199, local88.aShortArray128[local143]), Static593.method8378(local199, local88.aShortArray128[local148]));
							} else if (local88.aShortArray127 == null || local88.aShortArray127[local131] == -1) {
								local199 = local88.anIntArray523[local131];
								arg5.method4062(local164, local168, local172, local152, local156, local160, 100, 100, 100, Static593.method8378(local199, local88.aShortArray128[local138]), Static593.method8378(local199, local88.aShortArray128[local143]), Static593.method8378(local199, local88.aShortArray128[local148]));
							} else {
								local199 = super.aClass15_Sub1_4.method4278(local88.aShortArray127[local131]);
								arg5.method4062(local164, local168, local172, local152, local156, local160, 100, 100, 100, Static593.method8378(local199, local88.aShortArray128[local138]), Static593.method8378(local199, local88.aShortArray128[local143]), Static593.method8378(local199, local88.aShortArray128[local148]));
							}
						}
					}
				}
				local47 -= 4;
			}
			local43 += 4;
			local47 = local14;
		}
		arg5.aBoolean406 = true;
		super.aClass15_Sub1_4.method5336(local31);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!jb;I[I[IZI[I[I)V")
	private void method2122(@OriginalArg(0) int arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7) {
		@Pc(17) Class295 local17 = super.aClass295ArrayArray3[arg0][arg5];
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(314) int local314;
		@Pc(375) int local375;
		@Pc(452) int local452;
		@Pc(510) int local510;
		@Pc(345) int local345;
		@Pc(423) int local423;
		@Pc(463) int local463;
		@Pc(521) int local521;
		@Pc(303) int local303;
		@Pc(363) int local363;
		@Pc(412) int local412;
		@Pc(480) int local480;
		@Pc(333) int local333;
		@Pc(395) int local395;
		@Pc(441) int local441;
		@Pc(499) int local499;
		@Pc(89) int local89;
		@Pc(88) int local88;
		@Pc(86) int local86;
		@Pc(84) int local84;
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(209) int local209;
		@Pc(75) int local75;
		@Pc(96) int local96;
		@Pc(285) int local285;
		@Pc(559) int local559;
		@Pc(789) int local789;
		if (local17 == null) {
			@Pc(1635) Class330 local1635 = super.aClass330ArrayArray3[arg0][arg5];
			if (local1635 != null) {
				if (super.anInt2336 == -1) {
					for (local510 = 0; local510 < local1635.aShort124; local510++) {
						local39 = local1635.aShortArray150[local510] + (arg0 << super.anInt10463);
						local44 = local1635.aShortArray148[local510];
						local50 = local1635.aShortArray149[local510] + (arg5 << super.anInt10463);
						local452 = super.anInt2332 + (local44 * super.anInt2333 + local39 * super.anInt2344 + local50 * super.anInt2339 >> 14);
						if (local452 <= super.aClass15_Sub1_4.anInt5035) {
							return;
						}
						arg2[local510] = 0;
						if (arg4) {
							local345 = local452 - super.aClass15_Sub1_4.anInt5027;
							if (local345 > 255) {
								local345 = 255;
							}
							if (local345 > 0) {
								arg2[local510] = local345;
								local423 = local345 * local1635.aShortArray151[local510] / 255;
								if (local423 > 0) {
									local44 -= local423;
								}
							}
						} else if (super.aClass15_Sub1_4.aBoolean429) {
							local345 = local452 - super.aClass15_Sub1_4.anInt5027;
							if (local345 > 0) {
								arg2[local510] = local345;
								if (arg2[local510] > 255) {
									arg2[local510] = 255;
								}
							}
						}
						local314 = super.anInt2343 + (local44 * super.anInt2337 + local39 * super.anInt2338 + super.anInt2335 * local50 >> 14);
						local375 = super.anInt2340 + (local50 * super.anInt2342 + super.anInt2334 * local44 + super.anInt2341 * local39 >> 14);
						arg3[local510] = super.aClass15_Sub1_4.anInt5032 * local314 / local452 + arg1.anInt4834;
						arg6[local510] = super.aClass15_Sub1_4.anInt5040 * local375 / local452 + arg1.anInt4831;
						arg7[local510] = local452;
					}
				} else {
					for (local510 = 0; local510 < local1635.aShort124; local510++) {
						local39 = local1635.aShortArray150[local510] + (arg0 << super.anInt10463);
						local44 = local1635.aShortArray148[local510];
						local50 = local1635.aShortArray149[local510] + (arg5 << super.anInt10463);
						arg2[local510] = 0;
						if (arg4) {
							local345 = super.anInt2336 - super.aClass15_Sub1_4.anInt5027;
							if (local345 > 255) {
								local345 = 255;
							}
							if (local345 > 0) {
								arg2[local510] = local345;
								local423 = local345 * local1635.aShortArray151[local510] / 255;
								if (local423 > 0) {
									local44 -= local423;
								}
							}
						} else if (super.aClass15_Sub1_4.aBoolean429) {
							local345 = -super.aClass15_Sub1_4.anInt5027 + super.anInt2336;
							if (local345 > 0) {
								arg2[local510] = local345;
								if (arg2[local510] > 255) {
									arg2[local510] = 255;
								}
							}
						}
						local375 = super.anInt2340 + (super.anInt2334 * local44 + local39 * super.anInt2341 + super.anInt2342 * local50 >> 14);
						local314 = super.anInt2343 + (super.anInt2337 * local44 + local39 * super.anInt2338 + super.anInt2335 * local50 >> 14);
						arg3[local510] = super.aClass15_Sub1_4.anInt5032 * local314 / super.anInt2336 + arg1.anInt4834;
						arg6[local510] = local375 * super.aClass15_Sub1_4.anInt5040 / super.anInt2336 + arg1.anInt4831;
						arg7[local510] = super.anInt2336;
					}
				}
				if (local1635.aShortArray152 == null) {
					for (local510 = 0; local510 < local1635.aShort125; local510++) {
						local345 = local510 * 3;
						local423 = local345 + 1;
						local463 = local423 + 1;
						local521 = arg3[local345];
						local303 = arg3[local423];
						local363 = arg3[local463];
						local412 = arg6[local345];
						local480 = arg6[local423];
						local333 = arg6[local463];
						local395 = arg2[local423] + arg2[local345] + arg2[local463];
						if (-((local363 - local303) * (local412 + -local480)) + (local333 - local480) * (local521 - local303) > 0) {
							arg1.aBoolean408 = local521 < 0 || local303 < 0 || local363 < 0 || local521 > arg1.anInt4833 || arg1.anInt4833 < local303 || local363 > arg1.anInt4833;
							if (local395 >= 765) {
								arg1.method4064(local412, local480, local333, local521, local303, local363, arg7[local345], arg7[local423], arg7[local463], super.aClass15_Sub1_4.anInt5044);
							} else if (local395 <= 0) {
								if ((local1635.anIntArray647[local345] & 0xFFFFFF) != 0) {
									arg1.method4066(local412, local480, local333, local521, local303, local363, arg7[local345], arg7[local423], arg7[local463], local1635.anIntArray647[local345], local1635.anIntArray647[local423], local1635.anIntArray647[local463]);
								}
							} else if ((local1635.anIntArray647[local345] & 0xFFFFFF) != 0) {
								arg1.method4066(local412, local480, local333, local521, local303, local363, arg7[local345], arg7[local423], arg7[local463], Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg2[local345], local1635.anIntArray647[local345]), Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg2[local423], local1635.anIntArray647[local423]), Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg2[local463], local1635.anIntArray647[local463]));
							}
						}
					}
				} else {
					local510 = super.anIntArrayArray20[arg0][arg5];
					local345 = super.anIntArrayArray20[arg0 + 1][arg5];
					local423 = super.anIntArrayArray20[arg0][arg5 + 1];
					local463 = arg0 * super.anInt10458;
					local521 = local463 + super.anInt10458;
					local303 = super.anInt10458 * arg5;
					local363 = super.anInt10458 + local303;
					local412 = super.anInt2343 + (local303 * super.anInt2335 + super.anInt2337 * local510 + local463 * super.anInt2338 >> 14);
					local480 = super.anInt2340 + (local303 * super.anInt2342 + super.anInt2341 * local463 + super.anInt2334 * local510 >> 14);
					local333 = (local510 * super.anInt2333 + local463 * super.anInt2344 + super.anInt2339 * local303 >> 14) + super.anInt2332;
					local395 = (local303 * super.anInt2335 + super.anInt2338 * local521 + super.anInt2337 * local345 >> 14) + super.anInt2343;
					local441 = super.anInt2340 + (super.anInt2342 * local303 + local345 * super.anInt2334 + super.anInt2341 * local521 >> 14);
					local499 = (local303 * super.anInt2339 + local345 * super.anInt2333 + local521 * super.anInt2344 >> 14) + super.anInt2332;
					local89 = (local363 * super.anInt2335 + super.anInt2338 * local463 + local423 * super.anInt2337 >> 14) + super.anInt2343;
					local88 = super.anInt2340 + (local463 * super.anInt2341 + local423 * super.anInt2334 + local363 * super.anInt2342 >> 14);
					local86 = super.anInt2332 + (local363 * super.anInt2339 + super.anInt2333 * local423 + super.anInt2344 * local463 >> 14);
					for (local84 = 0; local84 < local1635.aShort125; local84++) {
						local52 = local84 * 3;
						local54 = local52 + 1;
						local56 = local54 + 1;
						local58 = arg3[local52];
						local209 = arg3[local54];
						local75 = arg3[local56];
						local96 = arg6[local52];
						local285 = arg6[local54];
						local559 = arg6[local56];
						local789 = arg2[local56] + arg2[local54] + arg2[local52];
						if ((local559 - local285) * (local58 - local209) - (local96 - local285) * (-local209 + local75) > 0) {
							arg1.aBoolean408 = local58 < 0 || local209 < 0 || local75 < 0 || local58 > arg1.anInt4833 || local209 > arg1.anInt4833 || arg1.anInt4833 < local75;
							@Pc(2383) short local2383 = local1635.aShortArray152[local84];
							if (local789 >= 765) {
								arg1.method4064(local96, local285, local559, local58, local209, local75, arg7[local52], arg7[local54], arg7[local56], super.aClass15_Sub1_4.anInt5044);
							} else {
								if (local2383 != -1 && this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local2383).aByte54)) {
									arg1.anInt4832 = 100;
								}
								if (local789 <= 0) {
									if (local2383 != -1) {
										arg1.method4078(local96, local285, local559, local58, local209, local75, arg7[local52], arg7[local54], arg7[local56], local1635.anIntArray647[local52], local1635.anIntArray647[local54], local1635.anIntArray647[local56], local412, local395, local89, local480, local441, local88, local333, local499, local86, local2383);
									} else if ((local1635.anIntArray647[local52] & 0xFFFFFF) != 0) {
										arg1.method4066(local96, local285, local559, local58, local209, local75, arg7[local52], arg7[local54], arg7[local56], local1635.anIntArray647[local52], local1635.anIntArray647[local54], local1635.anIntArray647[local56]);
									}
								} else if (local2383 != -1) {
									arg1.method4079(local96, local285, local559, local58, local209, local75, arg7[local52], arg7[local54], arg7[local56], super.aClass15_Sub1_4.anInt5044, arg2[local52], arg2[local54], arg2[local56], local1635.anIntArray647[local52], local1635.anIntArray647[local54], local1635.anIntArray647[local56], local412, local395, local89, local480, local441, local88, local333, local499, local86, local2383);
								} else if ((local1635.anIntArray647[local52] & 0xFFFFFF) != 0) {
									arg1.method4066(local96, local285, local559, local58, local209, local75, arg7[local52], arg7[local54], arg7[local56], Static364.method6010(arg2[local52] << 24 | super.aClass15_Sub1_4.anInt5044, local1635.anIntArray647[local52]), Static364.method6010(arg2[local54] << 24 | super.aClass15_Sub1_4.anInt5044, local1635.anIntArray647[local54]), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | arg2[local56] << 24, local1635.anIntArray647[local56]));
								}
								arg1.anInt4832 = 0;
							}
						}
					}
				}
			}
		} else if ((local17.aByte95 & 0x2) == 0) {
			@Pc(33) int local33 = arg0 * super.anInt10458;
			local39 = local33 + super.anInt10458;
			local44 = arg5 * super.anInt10458;
			local50 = local44 + super.anInt10458;
			local52 = 0;
			local54 = 0;
			local56 = 0;
			local58 = 0;
			if ((local17.aByte95 & 0x1) == 0 || arg4) {
				local75 = super.anIntArrayArray20[arg0][arg5];
				local96 = super.anIntArrayArray20[arg0 + 1][arg5];
				local285 = super.anIntArrayArray20[arg0 + 1][arg5 + 1];
				local559 = super.anIntArrayArray20[arg0][arg5 + 1];
				if (super.anInt2336 == -1) {
					local89 = super.anInt2332 + (super.anInt2344 * local33 + super.anInt2333 * local75 + super.anInt2339 * local44 >> 14);
					if (local89 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local88 = super.anInt2332 + (super.anInt2333 * local96 + super.anInt2344 * local39 + local44 * super.anInt2339 >> 14);
					if (local88 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local86 = super.anInt2332 + (super.anInt2339 * local50 + super.anInt2333 * local285 + super.anInt2344 * local39 >> 14);
					if (local86 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local84 = (local50 * super.anInt2339 + super.anInt2344 * local33 + super.anInt2333 * local559 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local84) {
						return;
					}
				} else {
					local84 = super.anInt2336;
					local86 = super.anInt2336;
					local88 = super.anInt2336;
					local89 = super.anInt2336;
				}
				if (arg4) {
					local209 = local89 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 255) {
						local209 = 255;
					}
					if (local209 > 0) {
						local52 = local209;
						local789 = local17.aShort114 * local209 / 255;
						if (local789 > 0) {
							local75 -= local789;
						}
					}
					local209 = local88 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 255) {
						local209 = 255;
					}
					if (local209 > 0) {
						local54 = local209;
						local789 = local209 * local17.aShort112 / 255;
						if (local789 > 0) {
							local96 -= local789;
						}
					}
					local209 = local86 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 255) {
						local209 = 255;
					}
					if (local209 > 0) {
						local56 = local209;
						local789 = local209 * local17.aShort113 / 255;
						if (local789 > 0) {
							local285 -= local789;
						}
					}
					local209 = local84 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 255) {
						local209 = 255;
					}
					if (local209 > 0) {
						local58 = local209;
						local789 = local17.aShort116 * local209 / 255;
						if (local789 > 0) {
							local559 -= local789;
						}
					}
				} else if (super.aClass15_Sub1_4.aBoolean429) {
					local209 = local89 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local52 = local209;
						if (local209 > 255) {
							local52 = 255;
						}
					}
					local209 = local88 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local54 = local209;
						if (local209 > 255) {
							local54 = 255;
						}
					}
					local209 = local86 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local56 = local209;
						if (local209 > 255) {
							local56 = 255;
						}
					}
					local209 = local84 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local58 = local209;
						if (local209 > 255) {
							local58 = 255;
						}
					}
				}
				local303 = super.anInt2343 + (super.anInt2338 * local33 + local75 * super.anInt2337 + local44 * super.anInt2335 >> 14);
				local333 = (local33 * super.anInt2341 + local75 * super.anInt2334 + local44 * super.anInt2342 >> 14) + super.anInt2340;
				local314 = arg1.anInt4834 + super.aClass15_Sub1_4.anInt5032 * local303 / local89;
				local363 = (local44 * super.anInt2335 + super.anInt2338 * local39 + super.anInt2337 * local96 >> 14) + super.anInt2343;
				local345 = arg1.anInt4831 + local333 * super.aClass15_Sub1_4.anInt5040 / local89;
				local375 = local363 * super.aClass15_Sub1_4.anInt5032 / local88 + arg1.anInt4834;
				local395 = (super.anInt2342 * local44 + super.anInt2341 * local39 + super.anInt2334 * local96 >> 14) + super.anInt2340;
				local412 = super.anInt2343 + (super.anInt2335 * local50 + local39 * super.anInt2338 + super.anInt2337 * local285 >> 14);
				local423 = arg1.anInt4831 + local395 * super.aClass15_Sub1_4.anInt5040 / local88;
				local441 = super.anInt2340 + (super.anInt2341 * local39 + local285 * super.anInt2334 + local50 * super.anInt2342 >> 14);
				local452 = arg1.anInt4834 + super.aClass15_Sub1_4.anInt5032 * local412 / local86;
				local463 = local441 * super.aClass15_Sub1_4.anInt5040 / local86 + arg1.anInt4831;
				local480 = super.anInt2343 + (local33 * super.anInt2338 + local559 * super.anInt2337 + local50 * super.anInt2335 >> 14);
				local499 = super.anInt2340 + (local33 * super.anInt2341 + local559 * super.anInt2334 + local50 * super.anInt2342 >> 14);
				local510 = super.aClass15_Sub1_4.anInt5032 * local480 / local84 + arg1.anInt4834;
				local521 = super.aClass15_Sub1_4.anInt5040 * local499 / local84 + arg1.anInt4831;
			} else {
				local75 = super.anIntArrayArray20[arg0][arg5];
				if (super.anInt2336 == -1) {
					local96 = local75 * super.anInt2333;
					local89 = (super.anInt2344 * local33 + local96 + local44 * super.anInt2339 >> 14) + super.anInt2332;
					if (local89 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local88 = super.anInt2332 + (super.anInt2339 * local44 + local96 + local39 * super.anInt2344 >> 14);
					if (local88 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local86 = super.anInt2332 + (super.anInt2339 * local50 + super.anInt2344 * local39 + local96 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local86) {
						return;
					}
					local84 = super.anInt2332 + (super.anInt2344 * local33 + local96 + super.anInt2339 * local50 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local84) {
						return;
					}
				} else {
					local84 = super.anInt2336;
					local86 = super.anInt2336;
					local88 = super.anInt2336;
					local89 = super.anInt2336;
				}
				if (super.aClass15_Sub1_4.aBoolean429) {
					local209 = local89 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local52 = local209;
						if (local209 > 255) {
							local52 = 255;
						}
					}
					local209 = local88 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local54 = local209;
						if (local209 > 255) {
							local54 = 255;
						}
					}
					local209 = local86 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local56 = local209;
						if (local209 > 255) {
							local56 = 255;
						}
					}
					local209 = local84 - super.aClass15_Sub1_4.anInt5027;
					if (local209 > 0) {
						local58 = local209;
						if (local209 > 255) {
							local58 = 255;
						}
					}
				}
				local96 = local75 * super.anInt2337;
				local285 = super.anInt2334 * local75;
				local303 = (local33 * super.anInt2338 + local96 + local44 * super.anInt2335 >> 14) + super.anInt2343;
				local314 = super.aClass15_Sub1_4.anInt5032 * local303 / local89 + arg1.anInt4834;
				local333 = super.anInt2340 + (local285 + super.anInt2341 * local33 + super.anInt2342 * local44 >> 14);
				local345 = arg1.anInt4831 + super.aClass15_Sub1_4.anInt5040 * local333 / local89;
				local363 = super.anInt2343 + (super.anInt2335 * local44 + local96 + super.anInt2338 * local39 >> 14);
				local375 = arg1.anInt4834 + local363 * super.aClass15_Sub1_4.anInt5032 / local88;
				local395 = super.anInt2340 + (super.anInt2341 * local39 + local285 + super.anInt2342 * local44 >> 14);
				local412 = (local50 * super.anInt2335 + local96 + local39 * super.anInt2338 >> 14) + super.anInt2343;
				local423 = local395 * super.aClass15_Sub1_4.anInt5040 / local88 + arg1.anInt4831;
				local441 = (local285 + local39 * super.anInt2341 + local50 * super.anInt2342 >> 14) + super.anInt2340;
				local452 = arg1.anInt4834 + super.aClass15_Sub1_4.anInt5032 * local412 / local86;
				local463 = super.aClass15_Sub1_4.anInt5040 * local441 / local86 + arg1.anInt4831;
				local480 = super.anInt2343 + (local50 * super.anInt2335 + local96 + local33 * super.anInt2338 >> 14);
				local499 = super.anInt2340 + (super.anInt2341 * local33 + local285 + super.anInt2342 * local50 >> 14);
				local510 = arg1.anInt4834 + super.aClass15_Sub1_4.anInt5032 * local480 / local84;
				local521 = super.aClass15_Sub1_4.anInt5040 * local499 / local84 + arg1.anInt4831;
			}
			@Pc(1175) boolean local1175 = local17.aShort115 != -1 && this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local17.aShort115).aByte54);
			local96 = local56 + local54 + local58;
			if (-((local463 - local521) * (local375 - local510)) + (local452 - local510) * (-local521 + local423) > 0) {
				arg1.aBoolean408 = local452 < 0 || local510 < 0 || local375 < 0 || arg1.anInt4833 < local452 || arg1.anInt4833 < local510 || local375 > arg1.anInt4833;
				if (local96 < 765) {
					if (local1175) {
						arg1.anInt4832 = 100;
					}
					if (local96 <= 0) {
						if (local17.aShort115 >= 0) {
							arg1.method4078(local463, local521, local423, local452, local510, local375, local86, local84, local88, local17.anInt8875, local17.anInt8878, local17.anInt8876, local412, local480, local363, local441, local499, local395, local86, local84, local88, local17.aShort115);
						} else {
							arg1.method4066(local463, local521, local423, local452, local510, local375, local86, local84, local88, local17.anInt8875, local17.anInt8878, local17.anInt8876);
						}
					} else if (local17.aShort115 >= 0) {
						arg1.method4079(local463, local521, local423, local452, local510, local375, local86, local84, local88, super.aClass15_Sub1_4.anInt5044, local56, local58, local54, local17.anInt8875, local17.anInt8878, local17.anInt8876, local412, local480, local363, local441, local499, local395, local86, local84, local88, local17.aShort115);
					} else {
						arg1.method4066(local463, local521, local423, local452, local510, local375, local86, local84, local88, Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local56 << 24, local17.anInt8875), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local58 << 24, local17.anInt8878), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local54 << 24, local17.anInt8876));
					}
					arg1.anInt4832 = 0;
				} else {
					arg1.method4064(local463, local521, local423, local452, local510, local375, local86, local84, local88, super.aClass15_Sub1_4.anInt5044);
				}
			}
			local96 = local52 + local54 + local58;
			if (-((local345 - local423) * (local510 + -local375)) + (local314 - local375) * (-local423 + local521) > 0) {
				arg1.aBoolean408 = local314 < 0 || local375 < 0 || local510 < 0 || arg1.anInt4833 < local314 || arg1.anInt4833 < local375 || local510 > arg1.anInt4833;
				if (local96 >= 765) {
					arg1.method4064(local345, local423, local521, local314, local375, local510, local89, local88, local84, super.aClass15_Sub1_4.anInt5044);
					return;
				}
				if (local1175) {
					arg1.anInt4832 = 100;
				}
				if (local96 <= 0) {
					if (local17.aShort115 >= 0) {
						arg1.method4078(local345, local423, local521, local314, local375, local510, local89, local88, local84, local17.anInt8877, local17.anInt8876, local17.anInt8878, local303, local363, local480, local333, local395, local499, local89, local88, local84, local17.aShort115);
					} else {
						arg1.method4066(local345, local423, local521, local314, local375, local510, local89, local88, local84, local17.anInt8877, local17.anInt8876, local17.anInt8878);
					}
				} else if (local17.aShort115 < 0) {
					arg1.method4066(local345, local423, local521, local314, local375, local510, local89, local88, local84, Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local52 << 24, local17.anInt8877), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local54 << 24, local17.anInt8876), Static364.method6010(local58 << 24 | super.aClass15_Sub1_4.anInt5044, local17.anInt8878));
				} else {
					arg1.method4079(local345, local423, local521, local314, local375, local510, local89, local88, local84, super.aClass15_Sub1_4.anInt5044, local52, local54, local58, local17.anInt8877, local17.anInt8876, local17.anInt8878, local303, local363, local480, local333, local395, local499, local89, local88, local84, local17.aShort115);
				}
				arg1.anInt4832 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class91_Sub2 local9 = (Class91_Sub2) super.aClass15_Sub1_4.method4266(Thread.currentThread());
		@Pc(12) Class165 local12 = local9.aClass165_1;
		local12.aBoolean408 = false;
		local12.anInt4832 = 0;
		super.aClass15_Sub1_4.method5342();
		if (super.aClass295ArrayArray3 != null) {
			this.method2118(local9.anIntArray258, arg0, arg3, local12, arg4, arg2, arg1, local9.anIntArray243);
		} else if (super.aClass97ArrayArray3 != null) {
			this.method2120(arg3, arg2, local9.anIntArray243, arg0, arg4, local12, local9.anIntArray258, arg1);
		}
	}
}
