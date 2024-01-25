import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!er;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "J")
	public static long aLong195 = 20000000L;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method6402() {
		for (@Pc(13) Class1_Sub50 local13 = (Class1_Sub50) Static475.aClass38_69.method1419(); local13 != null; local13 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			if (Static141.method2964(local13.anInt8983)) {
				Static3.method195(local13);
			}
		}
		if (Static267.anInt5167 == 1) {
			Static73.method1943();
			return;
		}
		Static520.method7425(Static504.anInt8565, Static380.anInt6684, Static186.anInt3939, Static85.anInt2199);
		@Pc(55) int local55 = Static159.aClass177_3.method4664(Static514.aClass114_164.method3330(Static315.anInt5993));
		for (@Pc(60) Class1_Sub50 local60 = (Class1_Sub50) Static475.aClass38_69.method1419(); local60 != null; local60 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			@Pc(65) int local65 = Static526.method7501(local60);
			if (local55 < local65) {
				local55 = local65;
			}
		}
		Static186.anInt3939 = Static267.anInt5167 * 16 + (Static536.aBoolean650 ? 26 : 22);
		Static85.anInt2199 = local55 + 8;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z")
	public static boolean method6404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
