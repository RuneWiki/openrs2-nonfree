import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dq", name = "Y", descriptor = "Lclient!oh;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!dq", name = "Fb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!dq", name = "Ib", descriptor = "Lclient!ja;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!dq", name = "Jb", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!dq", name = "Hb", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_26 = new Class57("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!dq", name = "Kb", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method1187(@OriginalArg(0) int arg0) {
		Static294.anInt5083 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt791; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static103.anInt2050; local6++) {
				if (Static69.aClass48ArrayArrayArray1[arg0][local3][local6] == null) {
					Static69.aClass48ArrayArrayArray1[arg0][local3][local6] = new Class48(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIZI)I")
	public static int method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(B)V")
	public static void method1197() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static109.aBooleanArray45[local7] = true;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)I")
	public static int method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg2 : arg0;
		@Pc(37) int local37 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg0 : arg1;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local37 : -local37);
	}
}
