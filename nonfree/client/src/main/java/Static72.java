import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array5;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!pr;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Drop";

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lclient!ti;")
	public static Class5_Sub1 method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub1_2;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
	public static int method1424(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	public static int method1425() {
		return 2;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method1426(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static48.method1105(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static void method1427(@OriginalArg(0) int arg0) {
		if (arg0 == Static239.anInt4649) {
			return;
		}
		if (Static239.anInt4649 == 0) {
			Static70.method1416();
		}
		if (arg0 == 40) {
			Static138.method2659();
		}
		if (arg0 != 40 && Static268.aClass158_3 != null) {
			Static268.aClass158_3.method4339();
			Static268.aClass158_3 = null;
		}
		if (Static239.anInt4649 == 25 || Static239.anInt4649 == 28) {
			Static324.aClass165_98.anInt4890 = 2;
			Static285.aClass165_85.anInt4890 = 2;
			Static68.aClass165_24.anInt4890 = 2;
			Static57.aClass165_22.anInt4890 = 2;
			Static240.aClass165_73.anInt4890 = 2;
			Static194.aClass165_61.anInt4890 = 2;
			Static34.aClass165_13.anInt4890 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static185.anInt1069 = 0;
			Static108.anInt2195 = 0;
			Static285.anInt5517 = 0;
			Static235.anInt4616 = 1;
			Static111.anInt2268 = 1;
			Static317.method5332(true);
			Static324.aClass165_98.anInt4890 = 1;
			Static285.aClass165_85.anInt4890 = 1;
			Static68.aClass165_24.anInt4890 = 1;
			Static57.aClass165_22.anInt4890 = 1;
			Static240.aClass165_73.anInt4890 = 1;
			Static194.aClass165_61.anInt4890 = 1;
			Static34.aClass165_13.anInt4890 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static192.method5708();
		}
		if (arg0 == 5) {
			Static46.method1034(Static297.aClass165_88, Static34.aClass2_6);
		} else {
			Static77.method1482();
		}
		@Pc(152) boolean local152 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(167) boolean local167 = Static239.anInt4649 == 5 || Static239.anInt4649 == 10 || Static239.anInt4649 == 28;
		if (local152 != local167) {
			if (local152) {
				Static43.anInt2906 = Static183.anInt3794;
				if (Static211.anInt4208 == 0) {
					Static316.method5326();
				} else {
					Static181.method3546(Static242.aClass165_74, 255, Static183.anInt3794);
				}
				Static253.aClass205_3.method5351(false);
			} else {
				Static316.method5326();
				Static253.aClass205_3.method5351(true);
				if (Static198.aClass216_1 != null) {
					Static198.aClass216_1.method5617();
					Static198.aClass216_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static34.aClass2_6.method3331();
		}
		Static239.anInt4649 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
	public static void method1432() {
		Static24.aClass37_1.method3580();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static125.aLongArray6[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static49.aLongArray1[local24] = 0L;
		}
		Static54.anInt3489 = 0;
	}
}
