import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!kp;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt1237;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt1239;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	public static int anInt1240;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	public static final int[] anIntArray60 = new int[14];

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_22 = new Class96("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!tn;I)Ljava/lang/String;")
	public static String method1006(@OriginalArg(1) Class229 arg0, @OriginalArg(2) int arg1) {
		if (!Static51.method751(arg0).method961(arg1) && arg0.anObjectArray14 == null) {
			return null;
		} else if (arg0.aStringArray39 == null || arg0.aStringArray39.length <= arg1 || arg0.aStringArray39[arg1] == null || arg0.aStringArray39[arg1].trim().length() == 0) {
			return Static424.aBoolean633 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray39[arg1];
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1007() {
		if (Static48.aString14.toLowerCase().indexOf("microsoft") != -1) {
			Static442.anIntArray574[222] = 59;
			Static442.anIntArray574[223] = 28;
			Static442.anIntArray574[191] = 73;
			Static442.anIntArray574[186] = 57;
			Static442.anIntArray574[190] = 72;
			Static442.anIntArray574[220] = 74;
			Static442.anIntArray574[219] = 42;
			Static442.anIntArray574[187] = 27;
			Static442.anIntArray574[192] = 58;
			Static442.anIntArray574[221] = 43;
			Static442.anIntArray574[189] = 26;
			Static442.anIntArray574[188] = 71;
			return;
		}
		Static442.anIntArray574[93] = 43;
		Static442.anIntArray574[61] = 27;
		Static442.anIntArray574[45] = 26;
		Static442.anIntArray574[91] = 42;
		Static442.anIntArray574[47] = 73;
		Static442.anIntArray574[44] = 71;
		Static442.anIntArray574[92] = 74;
		Static442.anIntArray574[59] = 57;
		if (Static48.aMethod1 == null) {
			Static442.anIntArray574[192] = 58;
			Static442.anIntArray574[222] = 59;
		} else {
			Static442.anIntArray574[192] = 28;
			Static442.anIntArray574[520] = 59;
			Static442.anIntArray574[222] = 58;
		}
		Static442.anIntArray574[46] = 72;
	}
}
