import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_178 = Static121.method2047("You have only just left another world)3");

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_179 = Static121.method2047("Passwort: ");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_180 = Static121.method2047("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_181 = Static121.method2047("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_182 = aClass60_178;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_183 = Static121.method2047("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Lclient!qc;")
	public static Class60 aClass60_184 = Static121.method2047("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	public static int anInt528 = 0;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Lclient!qc;")
	public static Class60 aClass60_185 = Static121.method2047("<col=00ffff>");

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array5 = new Class60[100];

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_186 = null;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method321() {
		aClass60Array5 = null;
		aClass60_185 = null;
		aClass60_179 = null;
		aClass60_186 = null;
		aClass60_181 = null;
		aClass60_183 = null;
		aClass60_184 = null;
		aClass60_180 = null;
		aClass60_178 = null;
		aClass60_182 = null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 method322() {
		@Pc(9) Class4_Sub4_Sub3_Sub2 local9 = new Class4_Sub4_Sub3_Sub2();
		local9.anInt1269 = Static46.anInt1202;
		local9.anInt1272 = Static76.anIntArray193[0];
		@Pc(26) byte[] local26 = Static105.aByteArrayArray8[0];
		local9.anInt1271 = Static113.anIntArray299[0];
		local9.anInt1268 = Static61.anIntArray166[0];
		local9.anInt1267 = Static31.anInt850;
		local9.anInt1270 = Static102.anIntArray279[0];
		@Pc(50) int local50 = local9.anInt1270 * local9.anInt1272;
		local9.anIntArray121 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local9.anIntArray121[local56] = Static56.anIntArray146[local26[local56] & 0xFF];
		}
		Static131.method2144();
		return local9;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
	public static boolean method323(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
	public static int method330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
