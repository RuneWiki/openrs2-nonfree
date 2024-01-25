import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_79 = new Class230(68, -1);

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[200];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Lclient!dda;")
	public static Class3_Sub4_Sub6 method6642() {
		@Pc(13) Class3_Sub4_Sub6 local13 = (Class3_Sub4_Sub6) Static539.aClass39_10.method1270();
		if (local13 != null) {
			local13.method8412();
			local13.method8309();
			return local13;
		}
		do {
			local13 = (Class3_Sub4_Sub6) Static321.aClass39_4.method1270();
			if (local13 == null) {
				return null;
			}
			if (local13.method1892() > Static376.method6088()) {
				return null;
			}
			local13.method8412();
			local13.method8309();
		} while ((Long.MIN_VALUE & local13.aLong259) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)V")
	public static void method6644(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static533.aFloat188 = local7;
		if (Static267.anInt5668 == 2) {
			Static235.anInt4860 = 0;
			Static522.anInt9554 = local15;
			Static104.anInt2511 = local7;
		}
		Static170.aFloat181 = local15;
		Static109.method2281();
		Static151.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)V")
	public static void method6645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static329.aClass335_3 == Static581.aClass335_4) {
			if (Static85.method1895(0, -2, false, arg0, arg1, 1, 1, 0)) {
				return;
			}
			Static85.method1895(0, -3, false, arg0, arg1, 1, 1, 0);
		} else if (Static85.method1895(0, -3, false, arg0, arg1, 1, 1, 0)) {
			return;
		} else {
			Static85.method1895(0, -2, false, arg0, arg1, 1, 1, 0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	public static int method6646(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
