import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_10;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!q;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	public static int anInt1646;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public static int anInt1648;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_803 = Static69.method1231(": ");

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!je;")
	private static Class40 aClass40_809 = Static69.method1231("Walk here");

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_804 = aClass40_809;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_805 = Static69.method1231("Texturen geladen)3");

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!je;")
	private static Class40 aClass40_806 = Static69.method1231("Loaded input handler");

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_807 = Static69.method1231("Null");

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt1649 = 1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_808 = aClass40_806;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method1093() {
		aClass40_809 = null;
		anIntArray166 = null;
		aClass2_Sub13_10 = null;
		aClass40_807 = null;
		aClass59_2 = null;
		aClass40_808 = null;
		aClass40_806 = null;
		aClass40_803 = null;
		aClass40_804 = null;
		aClass40_805 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!kc;IZI)V")
	public static void method1095(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static38.aClass2_Sub13_5 != null || Static8.aBoolean21 || (arg0 == null || Static47.method867(arg0) == null)) {
			return;
		}
		Static38.aClass2_Sub13_5 = arg0;
		Static65.aClass2_Sub13_11 = Static47.method867(arg0);
		Static122.anInt2859 = arg2;
		Static114.anInt2620 = 0;
		Static19.anInt615 = arg1;
		Static45.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIZZZ)Lclient!ua;")
	public static Class24_Sub1 method1096(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class29 local10 = null;
		if (Static18.aClass82_1 != null) {
			local10 = new Class29(arg0, Static18.aClass82_1, Static43.aClass82Array1[arg0], 1000000);
		}
		return new Class24_Sub1(local10, Static110.aClass29_3, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void method1097(@OriginalArg(1) int arg0) {
		if (!Static112.method1873(arg0)) {
			return;
		}
		@Pc(19) Class2_Sub13[] local19 = Static45.aClass2_Sub13ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class2_Sub13 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt1595 = 0;
				local27.anInt1582 = 0;
			}
		}
	}
}
