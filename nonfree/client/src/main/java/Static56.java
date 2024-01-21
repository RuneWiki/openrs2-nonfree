import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!n;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!ea;")
	private static Class18 aClass18_539 = Static8.method128("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_537 = aClass18_539;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_538 = Static8.method128("Passwort: ");

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
	public static int anInt2222 = 0;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "Lclient!ea;")
	public static Class18 aClass18_540 = Static8.method128("Lade)3)3)3");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public static void method1567(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray248.length; local17++) {
				local12.anIntArray248[local17] = -1;
				local12.anIntArray247[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method1568() {
		aClass18_539 = null;
		aClass18_538 = null;
		aClass18_540 = null;
		aClass43_3 = null;
		aClass18_537 = null;
	}
}
