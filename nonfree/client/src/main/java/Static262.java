import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public static int anInt2349;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public static int anInt2348 = 20;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg5);
		@Pc(24) int local24 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg6);
		@Pc(30) int local30 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg4);
		@Pc(36) int local36 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3);
		@Pc(44) int local44 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg1 + arg5);
		@Pc(53) int local53 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg6 - arg1);
		@Pc(55) int local55;
		for (local55 = local18; local55 < local44; local55++) {
			Static109.method1795(local30, Static51.anIntArrayArray1[local55], local36, arg2);
		}
		for (local55 = local24; local55 > local53; local55--) {
			Static109.method1795(local30, Static51.anIntArrayArray1[local55], local36, arg2);
		}
		@Pc(94) int local94 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg4 + arg1);
		@Pc(102) int local102 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 - arg1);
		for (local55 = local44; local55 <= local53; local55++) {
			@Pc(111) int[] local111 = Static51.anIntArrayArray1[local55];
			Static109.method1795(local30, local111, local94, arg2);
			Static109.method1795(local94, local111, local102, arg0);
			Static109.method1795(local102, local111, local36, arg2);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!mn;")
	public static Class1_Sub1_Sub14 method1884(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub14 local15 = (Class1_Sub1_Sub14) Static313.aClass58_15.method1233((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = Static209.aClass138_57.method3346(arg0, 0);
		if (local26 == null || local26.length <= 1) {
			return null;
		} else {
			local15 = Static145.method2304(local26);
			Static313.aClass58_15.method1229((long) arg0, local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I")
	public static int method1890(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public static void method1891() {
		Static242.aClass169_131.method4018();
		Static270.aClass169_141.method4018();
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V")
	public static void method1893() {
		Static245.aClass169_67.method4014();
		Static212.aClass169_115.method4014();
		Static47.aClass169_34.method4014();
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V")
	public static void method1894() {
		Static79.aClass169_54.method4018();
	}
}
