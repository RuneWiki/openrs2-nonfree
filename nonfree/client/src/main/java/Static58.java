import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!qf;")
	private static Class60 aClass60_801 = Static59.method1195("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_798 = aClass60_801;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_799 = Static59.method1195("This world is full)3");

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int anInt1794 = 0;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_800 = aClass60_799;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!wd;")
	public static Class82 aClass82_6 = new Class82(4096);

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public static int anInt1802 = 0;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!qf;")
	public static Class60 aClass60_802 = Static59.method1195("sl_button");

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array7 = new Class60[100];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public static int anInt1807 = 127;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!qf;")
	public static Class60 aClass60_803 = Static59.method1195("null");

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!qf;")
	public static Class60 aClass60_804 = Static59.method1195("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_805 = Static59.method1195("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!qf;")
	public static Class60 aClass60_806 = Static59.method1195("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public static int anInt1808 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!mf;)Lclient!qf;")
	public static Class60 method1170(@OriginalArg(1) Class3_Sub15 arg0) {
		if (Static57.method2266(Static33.method751(arg0)) == 0) {
			return null;
		} else if (arg0.aClass60_967 == null || arg0.aClass60_967.method1827().method1836() == 0) {
			return Static118.aBoolean116 ? Static78.aClass60_1035 : null;
		} else {
			return arg0.aClass60_967;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1171() {
		aClass60_799 = null;
		aClass60_801 = null;
		aClass60_806 = null;
		aClass60_803 = null;
		aClass82_6 = null;
		aClass60_802 = null;
		aClass3_Sub1_Sub2_Sub4Array5 = null;
		aClass60_805 = null;
		aClass60_800 = null;
		anIntArray201 = null;
		aClass60_804 = null;
		aClass60_798 = null;
		aClass60Array7 = null;
	}
}
