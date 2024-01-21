import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "Lclient!re;")
	public static Class9 aClass9_59;

	@OriginalMember(owner = "client!we", name = "db", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!we", name = "pb", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
	public static volatile int anInt2896 = 0;

	@OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
	public static int anInt2898 = 0;

	@OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!we", name = "mb", descriptor = "Lclient!r;")
	public static Class2_Sub10_Sub1 aClass2_Sub10_Sub1_3 = new Class2_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!we", name = "nb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1739 = Static72.method1077("scrollen:");

	@OriginalMember(owner = "client!we", name = "ob", descriptor = "Lclient!u;")
	private static Class74 aClass74_1740 = Static72.method1077("Accept trade");

	@OriginalMember(owner = "client!we", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1741 = Static72.method1077("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!we", name = "sb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1743 = Static72.method1077("Sorry invited players only)3");

	@OriginalMember(owner = "client!we", name = "rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1742 = aClass74_1743;

	@OriginalMember(owner = "client!we", name = "tb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1744 = aClass74_1740;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method1938(@OriginalArg(0) Class2_Sub16 arg0) {
		arg0.aBoolean131 = false;
		if (arg0.aClass2_Sub14_5 != null) {
			arg0.aClass2_Sub14_5.anInt1407 = 0;
		}
		for (@Pc(22) Class2_Sub16 local22 = arg0.method1912(); local22 != null; local22 = arg0.method1911()) {
			method1938(local22);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!pe;Lclient!ud;I)V")
	public static void method1939(@OriginalArg(1) Class26_Sub1 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) byte[] local13 = null;
		@Pc(15) Class13 local15 = Static19.aClass13_17;
		synchronized (Static19.aClass13_17) {
			for (@Pc(22) Class2_Sub19 local22 = (Class2_Sub19) Static19.aClass13_17.method415(); local22 != null; local22 = (Class2_Sub19) Static19.aClass13_17.method414()) {
				if ((long) arg2 == local22.aLong96 && local22.aClass77_4 == arg1 && local22.anInt2409 == 0) {
					local13 = local22.aByteArray29;
					break;
				}
			}
		}
		if (local13 == null) {
			@Pc(73) byte[] local73 = arg1.method1762(arg2);
			arg0.method1376(arg2, arg1, true, local73);
		} else {
			arg0.method1376(arg2, arg1, true, local13);
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	public static void method1940() {
		aClass9_59 = null;
		aClass74_1743 = null;
		aClass74_1744 = null;
		aClass2_Sub10_Sub1_3 = null;
		aClass74_1739 = null;
		aClass74_1741 = null;
		anIntArray418 = null;
		aClass74_1742 = null;
		anIntArray416 = null;
		aClass74_1740 = null;
	}
}
