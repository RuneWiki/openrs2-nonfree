import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[Lclient!sha;")
	public static Class321[] aClass321Array2;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V")
	public static void method8977(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static441.aClass351ArrayArrayArray1 == null) {
			Static546.aClass132_13.method7512(arg3, arg2, arg4, arg0, -16777216);
		} else if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >= 0 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 < Static491.anInt9856 * 512 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >= 0 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 < Static393.anInt6574 * 512) {
			Static61.anInt1167++;
			if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 != null && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 - (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() - 1) * 256 >> 9 == Static566.anInt9418 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 + 256 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() * 256 >> 9 == Static508.anInt9992) {
				Static566.anInt9418 = -1;
				Static508.anInt9992 = -1;
				Static493.method7104();
			}
			Static525.method7371();
			if (!arg1) {
				Static270.method4001();
			}
			Static646.method8806();
			Static579.method8046(true, arg2, arg0, arg3, arg4);
			@Pc(112) int local112 = Static24.anInt590;
			@Pc(114) int local114 = Static305.anInt5198;
			Static472.anInt8136 = Static472.anInt8141;
			@Pc(118) int local118 = Static598.anInt9789;
			@Pc(120) int local120 = Static111.anInt6761;
			@Pc(133) int local133;
			@Pc(174) int local174;
			if (Static407.anInt6820 == 1) {
				local133 = (int) Static132.aFloat14;
				if (local133 < Static536.anInt8763 >> 8) {
					local133 = Static536.anInt8763 >> 8;
				}
				if (Static542.aBooleanArray30[4] && Static615.anIntArray665[4] + 128 > local133) {
					local133 = Static615.anIntArray665[4] + 128;
				}
				local174 = (int) Static228.aFloat26 + Static424.anInt7319 & 0x3FFF;
				Static508.method8439(Static162.anInt2757, local174, local133, Static674.anInt9799, local120, Static284.method4118(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006, Static253.anInt4353, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001) - 200, (local133 >> 3) * 3 + 600 << 2);
			} else if (Static407.anInt6820 == 4) {
				local133 = (int) Static132.aFloat14;
				if (local133 < Static536.anInt8763 >> 8) {
					local133 = Static536.anInt8763 >> 8;
				}
				if (Static542.aBooleanArray30[4] && Static615.anIntArray665[4] + 128 > local133) {
					local133 = Static615.anIntArray665[4] + 128;
				}
				local174 = (int) Static228.aFloat26 & 0x3FFF;
				Static508.method8439(Static162.anInt2757, local174, local133, Static674.anInt9799, local120, Static284.method4118(Static555.anInt9303, Static253.anInt4353, Static502.anInt8454) - 200, (local133 >> 3) * 3 + 600 << 2);
			} else if (Static407.anInt6820 == 5) {
				Static554.method7831(local120);
			}
			local133 = Static23.anInt564;
			local174 = Static170.anInt2855;
			@Pc(283) int local283 = Static542.anInt9140;
			@Pc(285) int local285 = Static598.anInt9788;
			@Pc(287) int local287 = Static672.anInt10375;
			@Pc(331) int local331;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static542.aBooleanArray30[local289]) {
					local331 = (int) ((double) -Static502.anIntArray552[local289] + (double) (Static502.anIntArray552[local289] * 2 + 1) * Math.random() + Math.sin((double) Static464.anIntArray527[local289] * ((double) Static31.anIntArray49[local289] / 100.0D)) * (double) Static615.anIntArray665[local289]);
					if (local289 == 1) {
						Static170.anInt2855 += local331 << 2;
					}
					if (local289 == 4) {
						Static598.anInt9788 += local331;
						if (Static598.anInt9788 < 1024) {
							Static598.anInt9788 = 1024;
						} else if (Static598.anInt9788 > 3072) {
							Static598.anInt9788 = 3072;
						}
					}
					if (local289 == 2) {
						Static542.anInt9140 += local331 << 2;
					}
					if (local289 == 0) {
						Static23.anInt564 += local331 << 2;
					}
					if (local289 == 3) {
						Static672.anInt10375 = Static672.anInt10375 + local331 & 0x3FFF;
					}
				}
			}
			if (Static23.anInt564 < 0) {
				Static23.anInt564 = 0;
			}
			if (Static23.anInt564 > (Static209.anInt3602 << 9) - 1) {
				Static23.anInt564 = (Static209.anInt3602 << 9) - 1;
			}
			if (Static542.anInt9140 < 0) {
				Static542.anInt9140 = 0;
			}
			if ((Static245.anInt4308 << 9) - 1 < Static542.anInt9140) {
				Static542.anInt9140 = (Static245.anInt4308 << 9) - 1;
			}
			Static178.method2507();
			Static355.method5138();
			Static546.aClass132_13.KA(local114, local118, local112 + local114, local118 - -local120);
			Static340.method5000(true);
			if (Static594.aBoolean693) {
				Static393.method5574(Static355.anInt6039);
				if (Static472.anInt8136 != Static228.anInt3895) {
					Static119.aBoolean126 = true;
				}
				Static228.anInt3895 = Static472.anInt8136;
			} else {
				Static546.aClass132_13.ya();
				local331 = Static355.anInt6039;
				if (Static312.aClass93_2 == null) {
					Static546.aClass132_13.GA(local331);
				} else {
					Static312.aClass93_2.method2056(local114, local118, local112, local331, Static546.aClass132_13, Static598.anInt9788, local120, Static672.anInt10375, Static428.anInt7354 << 3);
				}
			}
			Static35.method857();
			Static185.aClass207_13.method8201(Static23.anInt564, Static170.anInt2855, Static542.anInt9140, -Static598.anInt9788 & 0x3FFF, -Static672.anInt10375 & 0x3FFF, -Static536.anInt8770 & 0x3FFF);
			Static546.aClass132_13.method7517(Static185.aClass207_13);
			Static546.aClass132_13.DA(local114 + local112 / 2, local120 / 2 + local118, Static3.anInt1080 << 1, Static3.anInt1080 << 1);
			Static433.method6414(local118 + local120 / 2, Static3.anInt1080 << 1, Static3.anInt1080 << 1, local114 + local112 / 2);
			Static17.method470(-Static672.anInt10375 & 0x3FFF, Static170.anInt2855, -Static536.anInt8770 & 0x3FFF, Static542.anInt9140, Static23.anInt564, -Static598.anInt9788 & 0x3FFF);
			@Pc(578) byte local578 = Static96.aClass6_Sub22_7.aClass29_Sub29_2.method9003() == 2 ? (byte) Static61.anInt1167 : 1;
			if (Static594.aBoolean693) {
				Static432.method6399(-Static672.anInt10375 & 0x3FFF, -Static598.anInt9788 & 0x3FFF, -Static536.anInt8770 & 0x3FFF);
				Static9.method372(Static666.anIntArray708, Static75.aByteArrayArrayArray1, Static96.aClass6_Sub22_7.aClass29_Sub10_1.method2893() == 0, Static201.anIntArray601, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 + 1, Static170.anInt2855, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9, Static23.anInt564, Static542.anInt9140, Static357.anIntArray361, Static90.anInt1698, local578, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9, Static472.anInt8136, Static163.anIntArray155, Static53.anIntArray62);
			} else {
				Static420.method6264(Static90.anInt1698, Static23.anInt564, Static170.anInt2855, Static542.anInt9140, Static75.aByteArrayArrayArray1, Static357.anIntArray361, Static53.anIntArray62, Static201.anIntArray601, Static163.anIntArray155, Static666.anIntArray708, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 + 1, local578, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9, Static96.aClass6_Sub22_7.aClass29_Sub10_1.method2893() == 0, Static487.aBoolean565 ? Static472.anInt8136 : -1, 0, false);
			}
			Static35.method857();
			if (Static556.anInt9319 == 10) {
				Static500.method7183(local112, local114, local120, local118);
				Static662.method9002(local120, local112, local114, local118);
				Static268.method3980(local118, local114, local120, local112);
				Static587.method8143(local118, local114, local112, local120);
			}
			Static246.method3614();
			Static542.anInt9140 = local283;
			Static23.anInt564 = local133;
			Static598.anInt9788 = local285;
			Static170.anInt2855 = local174;
			Static672.anInt10375 = local287;
			if (Static46.aBoolean47 && Static424.aClass73_2.method1813() == 0) {
				Static46.aBoolean47 = false;
			}
			if (Static46.aBoolean47) {
				Static546.aClass132_13.method7512(local120, local112, local114, local118, -16777216);
				Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, false, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077));
			}
			Static340.method5000(false);
		} else {
			Static546.aClass132_13.method7512(arg3, arg2, arg4, arg0, -16777216);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!vt;II)Ljava/awt/Frame;")
	public static Frame method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class380 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method8819()) {
			return null;
		}
		@Pc(17) Class382[] local17 = Static524.method7857(arg2);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt10494 == arg1 && local17[local25].anInt10491 == arg0 && (!local23 || arg3 < local17[local25].anInt10499)) {
				local23 = true;
				arg3 = local17[local25].anInt10499;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(87) Class103 local87 = arg2.method8807(arg1, arg0, arg3);
		while (local87.anInt2541 == 0) {
			Static520.method7923(10L);
		}
		@Pc(99) Frame local99 = (Frame) local87.anObject9;
		if (local99 == null) {
			return null;
		} else if (local87.anInt2541 == 2) {
			Static179.method2534(arg2, local99);
			return null;
		} else {
			return local99;
		}
	}
}
