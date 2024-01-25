import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!ia;")
	public static Class106 aClass106_5;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray130;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_185 = new Class92(38, 7);

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[S")
	public static short[] aShortArray73 = new short[256];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIII)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(17) int local17 = arg0 - 334;
		if (local17 < 0) {
			local17 = 0;
		} else if (local17 > 100) {
			local17 = 100;
		}
		@Pc(41) int local41 = Static399.aShort211 + (Static63.aShort198 - Static399.aShort211) * local17 / 100;
		if (Static166.aShort102 > local41) {
			local41 = Static166.aShort102;
		} else if (Static381.aShort90 < local41) {
			local41 = Static381.aShort90;
		}
		@Pc(70) int local70 = arg0 * local41 * 512 / (arg2 * 334);
		@Pc(103) int local103;
		@Pc(110) int local110;
		@Pc(78) short local78;
		if (Static228.aShort235 > local70) {
			local78 = Static228.aShort235;
			local41 = arg2 * 334 * local78 / (arg0 * 512);
			if (Static381.aShort90 < local41) {
				local41 = Static381.aShort90;
				local103 = arg0 * 512 * local41 / (local78 * 334);
				local110 = (arg2 - local103) / 2;
				if (arg1) {
					Static266.aClass75_7.va();
					Static266.aClass75_7.method2600(arg0, arg3, local110, arg4, -16777216);
					Static266.aClass75_7.method2600(arg0, arg2 + arg3 - local110, local110, arg4, -16777216);
				}
				arg3 += local110;
				arg2 -= local110 * 2;
			}
		} else if (local70 > Static308.aShort165) {
			local78 = Static308.aShort165;
			local41 = local78 * 334 * arg2 / (arg0 * 512);
			if (local41 < Static166.aShort102) {
				local41 = Static166.aShort102;
				local103 = local78 * 334 * arg2 / (local41 * 512);
				local110 = (arg0 - local103) / 2;
				if (arg1) {
					Static266.aClass75_7.va();
					Static266.aClass75_7.method2600(local110, arg3, arg2, arg4, -16777216);
					Static266.aClass75_7.method2600(local110, arg3, arg2, arg0 + arg4 - local110, -16777216);
				}
				arg0 -= local110 * 2;
				arg4 += local110;
			}
		}
		Static15.anInt485 = arg0 * local41 / 334;
		Static444.anInt7527 = (short) arg0;
		Static375.anInt6613 = arg4;
		Static450.anInt7598 = arg3;
		Static390.anInt6741 = (short) arg2;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
	public static void method4511(@OriginalArg(1) int arg0) {
		Static379.anInt2075 = arg0;
		@Pc(7) Class5 local7 = Static227.aClass5_49;
		synchronized (Static227.aClass5_49) {
			Static227.aClass5_49.method116();
		}
		local7 = Static122.aClass5_23;
		synchronized (Static122.aClass5_23) {
			Static122.aClass5_23.method116();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method4512(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static428.method5676(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Lclient!v;")
	public static Class244 method4514(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static210.aFloat97 == 3.0D) {
				return Static140.aClass244_6;
			}
			if ((double) Static210.aFloat97 == 4.0D) {
				return Static20.aClass244_3;
			}
			if ((double) Static210.aFloat97 == 6.0D) {
				return Static265.aClass244_12;
			}
			if ((double) Static210.aFloat97 >= 8.0D) {
				return Static353.aClass244_15;
			}
		} else if (arg0 == 1) {
			if ((double) Static210.aFloat97 == 3.0D) {
				return Static265.aClass244_12;
			}
			if ((double) Static210.aFloat97 == 4.0D) {
				return Static353.aClass244_15;
			}
			if ((double) Static210.aFloat97 == 6.0D) {
				return Static255.aClass244_9;
			}
			if ((double) Static210.aFloat97 >= 8.0D) {
				return Static451.aClass244_16;
			}
		} else if (arg0 == 2) {
			if ((double) Static210.aFloat97 == 3.0D) {
				return Static255.aClass244_9;
			}
			if ((double) Static210.aFloat97 == 4.0D) {
				return Static451.aClass244_16;
			}
			if ((double) Static210.aFloat97 == 6.0D) {
				return Static286.aClass244_14;
			}
			if ((double) Static210.aFloat97 >= 8.0D) {
				return Static192.aClass244_7;
			}
		}
		return null;
	}
}
