import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
	public static int anInt2694;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!qb;")
	public static Class58 aClass58_60 = new Class58();

	@OriginalMember(owner = "client!r", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_791 = Static129.method2060("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "Lclient!ge;")
	public static Class29 aClass29_23 = new Class29(100);

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "Lclient!r;")
	public static Class61 aClass61_792 = Static129.method2060("ams");

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "Lclient!r;")
	private static Class61 aClass61_793 = Static129.method2060("Welcome to RuneScape");

	@OriginalMember(owner = "client!r", name = "db", descriptor = "Lclient!r;")
	private static Class61 aClass61_794 = Static129.method2060("Malformed login packet)3");

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_795 = aClass61_794;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "Lclient!r;")
	public static Class61 aClass61_796 = Static129.method2060("Null");

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_797 = aClass61_793;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
	public static int anInt2695 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
	public static int method1707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub15 local14 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg1);
		if (local14 == null) {
			return 0;
		} else if (arg0 >= 0 && local14.anIntArray297.length > arg0) {
			return local14.anIntArray297[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	public static void method1725() {
		Static38.aClass29_16.method765();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public static void method1735() {
		aClass61_791 = null;
		aClass61_797 = null;
		aClass61_795 = null;
		aClass61_793 = null;
		Class61.anIntArray331 = null;
		aClass61_792 = null;
		aClass61_794 = null;
		aClass58_60 = null;
		aClass61_796 = null;
		aClass29_23 = null;
	}
}
