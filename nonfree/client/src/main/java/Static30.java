import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array2;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_3;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Lclient!fc;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public static int anInt836 = 0;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
	public static int[] anIntArray65 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_337 = Static121.method2047("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_338 = Static121.method2047("T");

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Lclient!qc;")
	public static Class60 aClass60_339 = Static121.method2047("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public static int anInt839 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)I")
	public static int method589(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method590() {
		aClass60_337 = null;
		aClass60_338 = null;
		aClass22_1 = null;
		aClass4_Sub17_3 = null;
		anIntArray65 = null;
		aClass60_339 = null;
		aClass4_Sub4_Sub3_Sub2Array2 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method591(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) Static109.aClass66_11.method1838(); local10 != null; local10 = (Class4_Sub5) Static109.aClass66_11.method1831()) {
			if ((local10.aLong100 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method2124();
			}
		}
	}
}
