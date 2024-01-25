import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!cf;")
	public static final Class47 aClass47_2 = new Class47(false);

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!cf;")
	public static Class47 aClass47_3 = aClass47_2;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!fv;")
	public static final Class117 aClass117_8 = new Class117();

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
	public static final int[] anIntArray486 = new int[16];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method6833() {
		for (@Pc(10) Class3_Sub7_Sub13 local10 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local10 != null; local10 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
			if (local10.anInt4660 > 1) {
				local10.anInt4660 = 0;
				Static614.aClass136_70.method3135(local10, ((Class3_Sub7_Sub19) local10.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63).aLong228);
				local10.aClass363_21.method8419();
			}
		}
		Static285.anInt7798 = 0;
		Static334.anInt6266 = 0;
		Static544.aClass216_66.method5454();
		Static166.aClass25_17.method433();
		Static561.aClass363_53.method8419();
		Static253.aBoolean362 = false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public static boolean method6834(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class3_Sub7_Sub19 local10 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local10 != null; local10 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
			if (Static580.method8102(local10.anInt8564) && local10.aLong229 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method6836(@OriginalArg(2) String arg0) {
		return Static377.method5950(16, arg0);
	}
}
