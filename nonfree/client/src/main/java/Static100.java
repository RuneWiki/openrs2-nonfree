import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_18;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!lf;")
	public static Class48 aClass48_45 = new Class48(64);

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1103 = Static56.method816("Your account has been disabled)3");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1102 = aClass34_1103;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1104 = Static56.method816("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1105 = Static56.method816("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1455(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local6];
		Static140.method1345(arg0, 0, local17, 0, local6);
		return local17;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1456() {
		aClass14_Sub1_18 = null;
		aClass34_1102 = null;
		aClass34_1105 = null;
		aClass34_1104 = null;
		anIntArray324 = null;
		aCRC32_2 = null;
		aClass34_1103 = null;
		aClass48_45 = null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method1457() {
		if (Static31.anInt863 > 0) {
			Static10.method111();
		} else {
			Static82.method1201(40);
			Static49.aClass25_3 = Static93.aClass25_4;
			Static93.aClass25_4 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Z")
	public static boolean method1458(@OriginalArg(0) int arg0) {
		if (Static112.aBooleanArray19[arg0]) {
			return true;
		} else if (Static14.aClass14_3.method1150(arg0)) {
			@Pc(23) int local23 = Static14.aClass14_3.method1144(arg0);
			if (local23 == 0) {
				Static112.aBooleanArray19[arg0] = true;
				return true;
			}
			if (Static44.aClass8_Sub24ArrayArray1[arg0] == null) {
				Static44.aClass8_Sub24ArrayArray1[arg0] = new Class8_Sub24[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static44.aClass8_Sub24ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static14.aClass14_3.method1156(local42, arg0);
					if (local56 != null) {
						Static44.aClass8_Sub24ArrayArray1[arg0][local42] = new Class8_Sub24();
						Static44.aClass8_Sub24ArrayArray1[arg0][local42].anInt3124 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static44.aClass8_Sub24ArrayArray1[arg0][local42].method2024(new Class8_Sub20(local56));
						} else {
							Static44.aClass8_Sub24ArrayArray1[arg0][local42].method2019(new Class8_Sub20(local56));
						}
					}
				}
			}
			Static112.aBooleanArray19[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
