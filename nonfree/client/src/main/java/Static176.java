import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "[[Lclient!si;")
	public static Class157[][] aClass157ArrayArray1;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString112 = "shake:";

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString113 = null;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Z")
	public static boolean aBoolean298 = true;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString114 = "Loaded defaults";

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
	public static void method3006() {
		if (Static129.anInt2552 == 5) {
			Static129.anInt2552 = 6;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method3008() {
		if (Static138.aClass11_Sub4_Sub1_3 != null && Static138.aClass11_Sub4_Sub1_3.anInt3865 - (Static138.aClass11_Sub4_Sub1_3.method3347() - 1) * 64 >> 7 == Static24.anInt490 && Static138.aClass11_Sub4_Sub1_3.anInt3856 + 64 - Static138.aClass11_Sub4_Sub1_3.method3347() * 64 >> 7 == Static261.anInt4835) {
			Static24.anInt490 = 0;
		}
		@Pc(55) int local55;
		for (local55 = 0; local55 < 104; local55++) {
			for (@Pc(60) int local60 = 0; local60 < 104; local60++) {
				Static287.anIntArrayArray39[local55][local60] = 0;
			}
		}
		for (local55 = 0; local55 < Static275.anInt5043; local55++) {
			@Pc(92) Class11_Sub4_Sub1 local92 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local55]];
			if (local92 != null) {
				local92.aBoolean333 = false;
			}
		}
		for (local55 = 0; local55 < Static1.anInt48; local55++) {
			@Pc(111) Class11_Sub4_Sub2 local111 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local55]];
			if (local111 != null) {
				local111.aBoolean333 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V")
	public static void method3009() {
		Static69.anIntArray119 = null;
		Static206.anIntArray419 = null;
		Static192.anIntArray398 = null;
		Static173.anIntArray353 = null;
		Static5.anIntArray17 = null;
		Static25.aByteArrayArray19 = null;
	}
}
