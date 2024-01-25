import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cu", name = "Pc", descriptor = "I")
	public static int anInt1659;

	@OriginalMember(owner = "client!cu", name = "Qc", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!cu", name = "Uc", descriptor = "I")
	public static int anInt1662;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ts;BI)V")
	public static void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte100 == 0) {
			arg1.anInt6905 = arg1.anInt6918;
		} else if (arg1.aByte100 == 1) {
			arg1.anInt6905 = arg1.anInt6918 + (arg0 - arg1.anInt6899) / 2;
		} else if (arg1.aByte100 == 2) {
			arg1.anInt6905 = arg0 - arg1.anInt6899 - arg1.anInt6918;
		} else if (arg1.aByte100 == 3) {
			arg1.anInt6905 = arg1.anInt6918 * arg0 >> 14;
		} else if (arg1.aByte100 == 4) {
			arg1.anInt6905 = (arg0 - arg1.anInt6899) / 2 + (arg0 * arg1.anInt6918 >> 14);
		} else {
			arg1.anInt6905 = arg0 - (arg1.anInt6918 * arg0 >> 14) - arg1.anInt6899;
		}
		if (arg1.aByte98 == 0) {
			arg1.anInt6922 = arg1.anInt6951;
		} else if (arg1.aByte98 == 1) {
			arg1.anInt6922 = (arg2 - arg1.anInt6898) / 2 + arg1.anInt6951;
		} else if (arg1.aByte98 == 2) {
			arg1.anInt6922 = arg2 - arg1.anInt6951 - arg1.anInt6898;
		} else if (arg1.aByte98 == 3) {
			arg1.anInt6922 = arg2 * arg1.anInt6951 >> 14;
		} else if (arg1.aByte98 == 4) {
			arg1.anInt6922 = (arg2 * arg1.anInt6951 >> 14) + (arg2 - arg1.anInt6898) / 2;
		} else {
			arg1.anInt6922 = arg2 - arg1.anInt6898 - (arg1.anInt6951 * arg2 >> 14);
		}
		if (!Static27.aBoolean39 || Static50.method1150(arg1).anInt1492 == 0 && arg1.anInt6900 != 0) {
			return;
		}
		if (arg1.anInt6922 < 0) {
			arg1.anInt6922 = 0;
		} else if (arg2 < arg1.anInt6898 + arg1.anInt6922) {
			arg1.anInt6922 = arg2 - arg1.anInt6898;
		}
		if (arg1.anInt6905 < 0) {
			arg1.anInt6905 = 0;
		} else if (arg1.anInt6905 + arg1.anInt6899 > arg0) {
			arg1.anInt6905 = arg0 - arg1.anInt6899;
			return;
		}
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(B)V")
	public static void method1319() {
		@Pc(5) Class44 local5 = Static79.aClass44_6;
		synchronized (Static79.aClass44_6) {
			Static79.aClass44_6.method1351();
		}
		local5 = Static415.aClass44_53;
		synchronized (Static415.aClass44_53) {
			Static415.aClass44_53.method1351();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[FB)[F")
	public static float[] method1321(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static459.method6343(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
