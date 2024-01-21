import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1882 = Static122.method531("Freie Welt");

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1883 = Static122.method531("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static volatile int anInt3463 = 0;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
	public static int anInt3464 = 0;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1884 = Static122.method531("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1885 = Static122.method531("mapback");

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method2515() {
		for (@Pc(14) Class3_Sub10 local14 = (Class3_Sub10) Static29.aClass72_11.method2401(); local14 != null; local14 = (Class3_Sub10) Static29.aClass72_11.method2407()) {
			if (local14.anInt989 > 0) {
				local14.anInt989--;
			}
			if (local14.anInt989 != 0) {
				if (local14.anInt997 > 0) {
					local14.anInt997--;
				}
				if (local14.anInt997 == 0 && local14.anInt998 >= 1 && local14.anInt996 >= 1 && local14.anInt998 <= 102 && local14.anInt996 <= 102 && (local14.anInt994 < 0 || Static20.method399(local14.anInt994, local14.anInt1004))) {
					Static179.method2756(local14.anInt998, local14.anInt1001, local14.anInt995, local14.anInt996, local14.anInt1002, local14.anInt994, local14.anInt1004);
					local14.anInt997 = -1;
					if (local14.anInt993 == local14.anInt994 && local14.anInt993 == -1) {
						local14.method2783();
					} else if (local14.anInt994 == local14.anInt993 && local14.anInt1000 == local14.anInt1001 && local14.anInt1003 == local14.anInt1004) {
						local14.method2783();
					}
				}
			} else if (local14.anInt993 < 0 || Static20.method399(local14.anInt993, local14.anInt1003)) {
				Static179.method2756(local14.anInt998, local14.anInt1000, local14.anInt995, local14.anInt996, local14.anInt1002, local14.anInt993, local14.anInt1003);
				local14.method2783();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!h;")
	public static Class3_Sub1_Sub9 method2516(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub1_Sub9 local17 = (Class3_Sub1_Sub9) Static33.aClass7_7.method183((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static90.aClass13_16.method348(3, arg0);
		local17 = new Class3_Sub1_Sub9();
		if (local27 != null) {
			local17.method1019(new Class3_Sub12(local27));
		}
		Static33.aClass7_7.method186(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method2517() {
		anIntArray372 = null;
		aClass73_1882 = null;
		aClass73_1883 = null;
		aClass73_1884 = null;
		aShortArrayArray5 = null;
		aClass73_1885 = null;
	}
}
