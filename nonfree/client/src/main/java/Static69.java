import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!em", name = "J", descriptor = "Lclient!pk;")
	public static Class132 aClass132_26;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "[[Lclient!td;")
	public static Class8_Sub29[][] aClass8_Sub29ArrayArray3;

	@OriginalMember(owner = "client!em", name = "M", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!em", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!em", name = "U", descriptor = "[I")
	public static int[] anIntArray105 = new int[1000];

	@OriginalMember(owner = "client!em", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString58 = "wave:";

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!pk;Lclient!pk;Lclient!pk;Lclient!pk;)V")
	public static void method1130(@OriginalArg(1) Class132 arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) Class132 arg2, @OriginalArg(4) Class132 arg3) {
		Static35.aClass132_12 = arg1;
		Static171.aClass132_60 = arg2;
		Static109.aClass132_41 = arg3;
		Static41.aClass132_14 = arg0;
		Static210.aClass159ArrayArray6 = new Class159[Static171.aClass132_60.method3193()][];
		Static10.aBooleanArray1 = new boolean[Static171.aClass132_60.method3193()];
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Z")
	public static boolean method1133(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(III)I")
	public static int method1134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!mf;IIIIIB)V")
	public static void method1135(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) long local12 = 0L;
		if (arg1 == 0) {
			local12 = Static153.method2452(arg2, arg4, arg5);
		} else if (arg1 == 1) {
			local12 = Static24.method424(arg2, arg4, arg5);
		} else if (arg1 == 2) {
			local12 = Static136.method2197(arg2, arg4, arg5);
		} else if (arg1 == 3) {
			local12 = Static210.method3402(arg2, arg4, arg5);
		}
		@Pc(66) int local66 = Integer.MAX_VALUE & (int) (local12 >>> 32);
		@Pc(77) int local77 = (int) local12 >> 14 & 0x1F;
		@Pc(81) Class70 local81 = Static235.method3578(local66);
		if (local81.method1588()) {
			Static15.method280(local81, arg2, arg4, arg5);
		}
		@Pc(100) int local100 = (int) local12 >> 20 & 0x3;
		if (local12 == 0L) {
			return;
		}
		@Pc(109) Class36 local109 = null;
		@Pc(111) Class36 local111 = null;
		if (arg1 == 0) {
			@Pc(228) Class134 local228 = Static163.method3408(arg2, arg4, arg5);
			if (local228 != null) {
				local111 = local228.aClass36_7;
				local109 = local228.aClass36_6;
			}
			if (local81.anInt2064 != 0) {
				arg0.method2543(arg5, !local81.aBoolean157, local81.aBoolean158, local77, arg4, local100);
			}
		} else if (arg1 == 1) {
			@Pc(124) Class141 local124 = Static135.method2194(arg2, arg4, arg5);
			if (local124 != null) {
				local111 = local124.aClass36_9;
				local109 = local124.aClass36_8;
			}
		} else if (arg1 == 2) {
			@Pc(168) Class170 local168 = Static256.method3843(arg2, arg4, arg5);
			if (local168 != null) {
				local109 = local168.aClass36_10;
			}
			if (local81.anInt2064 != 0 && local81.anInt2065 + arg4 < 104 && local81.anInt2065 + arg5 < 104 && arg4 + local81.anInt2063 < 104 && local81.anInt2063 + arg5 < 104) {
				arg0.method2542(local100, arg5, !local81.aBoolean157, local81.anInt2065, arg4, local81.aBoolean158, local81.anInt2063);
			}
		} else if (arg1 == 3) {
			@Pc(146) Class120 local146 = Static240.method3616(arg2, arg4, arg5);
			if (local146 != null) {
				local109 = local146.aClass36_5;
			}
			if (local81.anInt2064 == 1) {
				arg0.method2547(arg5, arg4);
			}
		}
		if (local81.anIntArray145 != null) {
			local81 = local81.method1575();
		}
		if (!Static116.aBoolean188 || local81 == null || !local81.aBoolean154) {
			return;
		}
		if (local77 == 2) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(0, arg3, 0, arg4, local81, arg5, local77, local100 + 4);
			}
			if (local111 instanceof Class36_Sub4) {
				((Class36_Sub4) local111).method2667();
			} else {
				Static147.method2394(0, arg3, 0, arg4, local81, arg5, local77, local100 + 1 & 0x3);
			}
		} else if (local77 == 5) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(Static64.anIntArray97[local100] * 8, arg3, Static288.anIntArray94[local100] * 8, arg4, local81, arg5, 4, local100);
			}
		} else if (local77 == 6) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(Static76.anIntArray111[local100] * 8, arg3, Static63.anIntArray96[local100] * 8, arg4, local81, arg5, 4, local100 + 4);
			}
		} else if (local77 == 7) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(0, arg3, 0, arg4, local81, arg5, 4, (local100 + 2 & 0x3) + 4);
			}
		} else if (local77 == 8) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(Static76.anIntArray111[local100] * 8, arg3, Static63.anIntArray96[local100] * 8, arg4, local81, arg5, 4, local100 + 4);
			}
			if (local111 instanceof Class36_Sub4) {
				((Class36_Sub4) local111).method2667();
			} else {
				Static147.method2394(Static76.anIntArray111[local100] * 8, arg3, Static63.anIntArray96[local100] * 8, arg4, local81, arg5, 4, (local100 + 2 & 0x3) + 4);
			}
		} else if (local77 == 11) {
			if (local109 instanceof Class36_Sub4) {
				((Class36_Sub4) local109).method2667();
			} else {
				Static147.method2394(0, arg3, 0, arg4, local81, arg5, 10, local100 + 4);
			}
		} else if (local109 instanceof Class36_Sub4) {
			((Class36_Sub4) local109).method2667();
		} else {
			Static147.method2394(0, arg3, 0, arg4, local81, arg5, local77, local100);
		}
	}
}
