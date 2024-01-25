import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public static int anInt2342 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	public static void method1852(@OriginalArg(0) int arg0) {
		Static107.anInt2008 = -1;
		Static202.anInt3606 = -1;
		Static54.anInt860 = arg0;
		Static447.method5934();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method1853() {
		if (Static368.aClass135_11 != null) {
			Static368.aClass135_11.method5332();
			Static179.aClass123_5 = null;
			Static368.aClass135_11 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILclient!ya;Lclient!ub;)V")
	public static void method1855(@OriginalArg(3) Class135 arg0, @OriginalArg(4) Class244 arg1) {
		Static100.aClass244_9.method5264();
		if (Static149.aBoolean187) {
			return;
		}
		for (@Pc(16) Class4_Sub12 local16 = (Class4_Sub12) arg1.method5263(); local16 != null; local16 = (Class4_Sub12) arg1.method5271()) {
			@Pc(24) Class100 local24 = Static292.aClass235_4.method4957(local16.anInt1566);
			if (Static173.method2397(local24)) {
				@Pc(36) boolean local36 = Static122.method1729(local16, arg0, local24);
				if (local36) {
					Static16.method220(local24, arg0, local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)Z")
	public static boolean method1856(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
