import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "J")
	public static long aLong158;

	@OriginalMember(owner = "client!ln", name = "Z", descriptor = "Lclient!nk;")
	public static Class2_Sub3_Sub5 aClass2_Sub3_Sub5_1;

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
	public static int anInt3232;

	@OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
	public static int anInt3237 = 10;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V")
	public static void method2645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
		Static95.aClass2_Sub26_Sub1_1.method4239(20);
		Static95.aClass2_Sub26_Sub1_1.method4239(arg3);
		Static95.aClass2_Sub26_Sub1_1.method4239(arg2);
		Static95.aClass2_Sub26_Sub1_1.method4231(arg1);
		Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		Static184.anInt3908 = -3;
		Static217.anInt4539 = 0;
		Static134.anInt2735 = 0;
		Static260.anInt5416 = 1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(JI)V")
	public static void method2646(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static151.anInt3192 >= 100 && !Static260.aBoolean435 || Static151.anInt3192 >= 200) {
			Static173.method2979("", Static279.aString278, 0);
			return;
		}
		@Pc(31) String local31 = Static77.method1383(arg0);
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static151.anInt3192; local33++) {
			if (arg0 == Static67.aLongArray25[local33]) {
				Static173.method2979("", local31 + Static63.aString74, 0);
				return;
			}
		}
		for (local33 = 0; local33 < Static11.anInt296; local33++) {
			if (arg0 == Static281.aLongArray23[local33]) {
				Static173.method2979("", Static289.aString292 + local31 + Static164.aString167, 0);
				return;
			}
		}
		if (local31.equals(Static111.aClass36_Sub3_Sub2_1.aString249)) {
			Static173.method2979("", Static191.aString41, 0);
			return;
		}
		Static56.aStringArray5[Static151.anInt3192] = local31;
		Static67.aLongArray25[Static151.anInt3192] = arg0;
		Static18.anIntArray29[Static151.anInt3192] = 0;
		Static124.aStringArray10[Static151.anInt3192] = "";
		Static264.anIntArray482[Static151.anInt3192] = 0;
		Static299.aBooleanArray13[Static151.anInt3192] = false;
		Static151.anInt3192++;
		Static184.anInt3910 = Static13.anInt334;
		Static95.aClass2_Sub26_Sub1_1.method4287(45);
		Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)V")
	public static void method2647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg4; local7++) {
			Static133.method2321(arg3, arg2, Static274.anIntArrayArray50[local7], arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)V")
	public static void method2649(@OriginalArg(1) int arg0) {
		Static295.method4895();
		Static274.method4581();
		@Pc(12) int local12 = Static105.method1956(arg0).anInt4464;
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static249.anIntArray446[arg0];
		if (local12 == 6) {
			Static157.anInt3296 = local24;
		}
		if (local12 == 9) {
			Static87.anInt1922 = local24;
		}
		if (local12 == 5) {
			Static109.anInt2341 = local24;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!mn;I)Lclient!mn;")
	public static Class115 method2650(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115 local6 = Static35.method707(arg0);
		if (local6 == null) {
			local6 = arg0.aClass115_11;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)V")
	public static void method2652() {
		@Pc(6) Class162 local6 = Static19.aClass162_1;
		synchronized (Static19.aClass162_1) {
			Static279.anInt5824 = Static166.anInt3486;
			Static86.anInt1911 = Static297.anInt6210;
			Static185.anInt3926++;
			Static238.anInt4852 = Static176.anInt3782;
			Static246.anInt5126 = Static63.anInt1423;
			Static199.anInt4139 = Static81.anInt1782;
			Static122.anInt2587 = Static229.anInt5467;
			Static277.aLong296 = Static155.aLong316;
			Static63.anInt1423 = 0;
		}
	}
}
