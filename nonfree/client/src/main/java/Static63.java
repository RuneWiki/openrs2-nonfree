import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!pe;")
	private static Class65 aClass65_664 = Static119.method1462("wave:");

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_663 = aClass65_664;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!pe;")
	private static Class65 aClass65_665 = Static119.method1462("Walk here");

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_666 = aClass65_664;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!pe;")
	public static Class65 aClass65_667 = aClass65_665;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!pe;")
	public static Class65 aClass65_668 = Static119.method1462("http:)4)4");

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 method1131() {
		@Pc(7) Class2_Sub1_Sub4_Sub2 local7 = new Class2_Sub1_Sub4_Sub2();
		local7.anInt1372 = Static88.anIntArray256[0];
		local7.aByteArray21 = Static76.aByteArrayArray6[0];
		local7.anInt1370 = Static45.anIntArray130[0];
		local7.anInt1369 = Static19.anInt471;
		local7.anInt1371 = Static128.anIntArray359[0];
		local7.anInt1368 = Static47.anInt1144;
		local7.anInt1367 = Static100.anIntArray294[0];
		local7.anIntArray167 = Static110.anIntArray328;
		Static37.method655();
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method1132() {
		Static108.anInt2425 = -1;
		Static133.anInt2917 = -1;
		Static44.anInt1080 = 1;
		Static79.anInt1731 = 2;
		Static39.anInt839 = 0;
		Static121.aBoolean105 = false;
		Static78.aClass56_26 = null;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1133() {
		aClass65_665 = null;
		aClass65_666 = null;
		aClass65_663 = null;
		aClass65_664 = null;
		aClass65_667 = null;
		aClass65_668 = null;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
	public static boolean method1134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
