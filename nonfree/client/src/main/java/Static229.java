import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "Lclient!jj;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1412 = Static186.method3527("::qa_op_test");

	@OriginalMember(owner = "client!we", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray13 = new byte[1000][];

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1413 = Static186.method3527("hint_mapedge");

	@OriginalMember(owner = "client!we", name = "db", descriptor = "[Lclient!kh;")
	public static Class64[] aClass64Array1 = new Class64[4];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIILclient!ta;IJZ)Z")
	public static boolean method3476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static99.method3532(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Lclient!wj;")
	public static Class1_Sub1_Sub19 method3477(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub19 local10 = (Class1_Sub1_Sub19) Static71.aClass4_3.method81((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static213.aClass86_77.method3325(26, arg0);
		local10 = new Class1_Sub1_Sub19();
		if (local20 != null) {
			local10.method3536(new Class1_Sub17(local20));
		}
		Static71.aClass4_3.method83(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Lclient!a;")
	public static Class1_Sub1_Sub1 method3480(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub1 local12 = (Class1_Sub1_Sub1) Static153.aClass4_8.method81((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static197.aClass86_Sub1_43.method3325(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub1_Sub1();
		@Pc(35) Class1_Sub17 local35 = new Class1_Sub17(local22);
		local35.anInt2656 = local35.aByteArray40.length - 2;
		@Pc(48) int local48 = local35.method2178();
		@Pc(56) int local56 = local35.aByteArray40.length - local48 - 14;
		local35.anInt2656 = local56;
		@Pc(63) int local63 = local35.method2140();
		local12.anInt36 = local35.method2178();
		local12.anInt37 = local35.method2178();
		local12.anInt38 = local35.method2178();
		local12.anInt34 = local35.method2178();
		@Pc(89) int local89 = local35.method2142();
		@Pc(100) int local100;
		@Pc(106) int local106;
		if (local89 > 0) {
			local12.aClass90Array1 = new Class90[local89];
			for (local100 = 0; local100 < local89; local100++) {
				local106 = local35.method2178();
				@Pc(113) Class90 local113 = new Class90(Static194.method3146(local106));
				local12.aClass90Array1[local100] = local113;
				while (local106-- > 0) {
					@Pc(124) int local124 = local35.method2140();
					@Pc(128) int local128 = local35.method2140();
					local113.method2817(new Class1_Sub5(local128), (long) local124);
				}
			}
		}
		local35.anInt2656 = 0;
		local100 = 0;
		local12.aClass50_17 = local35.method2180();
		local12.aClass50Array1 = new Class50[local63];
		local12.anIntArray9 = new int[local63];
		local12.anIntArray8 = new int[local63];
		while (local35.anInt2656 < local56) {
			local106 = local35.method2178();
			if (local106 == 3) {
				local12.aClass50Array1[local100] = local35.method2125();
			} else if (local106 >= 100 || local106 == 21 || local106 == 38 || local106 == 39) {
				local12.anIntArray9[local100] = local35.method2142();
			} else {
				local12.anIntArray9[local100] = local35.method2140();
			}
			local12.anIntArray8[local100++] = local106;
		}
		Static153.aClass4_8.method83(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IZ)V")
	public static void method3481(@OriginalArg(0) int arg0) {
		if (arg0 == Static220.anInt4304) {
			return;
		}
		if (Static220.anInt4304 == 0) {
			Static205.method3251();
		}
		if (arg0 == 40) {
			Static57.method839(Static7.aClass50_68, Static7.aClass50_67, Static22.anInt427);
		}
		if (arg0 != 40 && Static212.aClass26_3 != null) {
			Static212.aClass26_3.method776();
			Static212.aClass26_3 = null;
		}
		@Pc(55) boolean local55 = arg0 == 5 || arg0 == 10;
		if (arg0 == 25) {
			Static114.anInt2290 = 0;
			Static78.anInt1572 = 0;
			Static157.anInt3238 = 1;
			Static75.anInt1527 = 0;
			Static100.anInt2018 = 1;
			Static129.method2047();
		}
		if (arg0 == 5) {
			Static71.method1019(Static141.aClass86_Sub1_33);
		} else {
			Static20.method299();
		}
		@Pc(98) boolean local98 = Static220.anInt4304 == 5 || Static220.anInt4304 == 10 || Static220.anInt4304 == 28;
		if (local55 != local98) {
			if (local55) {
				Static35.anInt737 = Static71.anInt1332;
				if (Static152.anInt3168 == 0) {
					Static56.method819();
				} else {
					Static74.method1094(Static71.anInt1332, Static58.aClass86_Sub1_9, 255);
				}
				Static106.method1638(false);
			} else {
				Static56.method819();
				Static106.method1638(true);
			}
		}
		Static220.anInt4304 = arg0;
	}
}
