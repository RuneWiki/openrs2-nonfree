import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array7;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt1908 = 0;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!qc;")
	private static Class60 aClass60_754 = Static121.method2047("Loaded config");

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_753 = aClass60_754;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public static int anInt1909 = 0;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_755 = Static121.method2047(")1p");

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_756 = Static121.method2047("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V")
	public static void method1422(@OriginalArg(1) boolean arg0) {
		if (Static71.aClass78_4 == null) {
			return;
		}
		try {
			@Pc(11) Class4_Sub13 local11 = new Class4_Sub13(4);
			local11.method1209(arg0 ? 2 : 3);
			local11.method1245(0);
			Static71.aClass78_4.method2081(local11.aByteArray68, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				Static71.aClass78_4.method2085();
			} catch (@Pc(45) Exception local45) {
			}
			Static11.anInt250++;
			Static71.aClass78_4 = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1423() {
		aClass60_756 = null;
		aClass4_Sub4_Sub3_Sub2Array7 = null;
		aClass60_753 = null;
		aClass60_754 = null;
		aClass60_755 = null;
	}
}
