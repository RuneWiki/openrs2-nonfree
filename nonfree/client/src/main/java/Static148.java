import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sg", name = "mb", descriptor = "[[Lclient!ef;")
	public static Class20[][] aClass20ArrayArray1;

	@OriginalMember(owner = "client!sg", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1045 = Static8.method128("weiss:");

	@OriginalMember(owner = "client!sg", name = "lb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1050 = Static8.method128("Players");

	@OriginalMember(owner = "client!sg", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1046 = aClass18_1050;

	@OriginalMember(owner = "client!sg", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1047 = Static8.method128("Mem:");

	@OriginalMember(owner = "client!sg", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1048 = Static8.method128("scrollbar");

	@OriginalMember(owner = "client!sg", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1049 = Static8.method128("Mitglieder)2Welt");

	@OriginalMember(owner = "client!sg", name = "ib", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array21 = new Class18[100];

	@OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
	public static volatile int anInt4093 = 0;

	@OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
	public static int anInt4096 = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V")
	public static void method2800() {
		Static31.aClass66_5.method2604();
	}

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
	public static void method2801() {
		aClass18_1046 = null;
		aClass20ArrayArray1 = null;
		aClass18_1045 = null;
		aClass18_1050 = null;
		aClass18_1048 = null;
		aClass18_1047 = null;
		aClass18_1049 = null;
		aClass18Array21 = null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method2802() {
		for (@Pc(10) Class1_Sub1_Sub5_Sub7 local10 = (Class1_Sub1_Sub5_Sub7) Static45.aClass59_25.method2417(); local10 != null; local10 = (Class1_Sub1_Sub5_Sub7) Static45.aClass59_25.method2424()) {
			if (local10.anInt4254 != Static9.anInt295 || local10.aBoolean188) {
				local10.method3198();
			} else if (Static41.anInt1322 >= local10.anInt4246) {
				local10.method2899(Static180.anInt4776);
				if (local10.aBoolean188) {
					local10.method3198();
				} else {
					Static87.aClass68_1.method2656(local10.anInt4254, local10.anInt4248, local10.anInt4255, local10.anInt4256, 60, local10, 0, -1, false);
				}
			}
		}
	}
}
