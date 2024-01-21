import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!da", name = "yb", descriptor = "I")
	public static int anInt656;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_326 = Static56.method816("Could not complete login)3");

	@OriginalMember(owner = "client!da", name = "T", descriptor = "Lclient!ic;")
	public static Class34 aClass34_324 = aClass34_326;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public static int anInt639 = -1;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "[I")
	public static int[] anIntArray70 = new int[200];

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_325 = Static56.method816("hel");

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "[I")
	public static int[] anIntArray71 = new int[500];

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!da", name = "vb", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!da", name = "wb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_327 = Static56.method816("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!da", name = "xb", descriptor = "[[[Lclient!m;")
	public static Class49[][][] aClass49ArrayArrayArray1 = new Class49[4][104][104];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V")
	public static void method380(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static112.aBooleanArray19[arg0]) {
			return;
		}
		Static14.aClass14_3.method1163(arg0);
		if (Static44.aClass8_Sub24ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(33) int local33 = 0; local33 < Static44.aClass8_Sub24ArrayArray1[arg0].length; local33++) {
			if (Static44.aClass8_Sub24ArrayArray1[arg0][local33] != null) {
				if (Static44.aClass8_Sub24ArrayArray1[arg0][local33].anInt3145 == 2) {
					local26 = false;
				} else {
					Static44.aClass8_Sub24ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local26) {
			Static44.aClass8_Sub24ArrayArray1[arg0] = null;
		}
		Static112.aBooleanArray19[arg0] = false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ic;B)Z")
	public static boolean method383(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static69.anInt1679; local16++) {
			if (arg0.method806(Static80.aClass34Array15[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
	public static int method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void method385() {
		aClass34_325 = null;
		aClass49ArrayArrayArray1 = null;
		aClass8_Sub1_Sub3_Sub2Array1 = null;
		aClass34_324 = null;
		anIntArray70 = null;
		aCRC32_1 = null;
		anIntArray71 = null;
		aClass34_327 = null;
		aClass34_326 = null;
	}
}
