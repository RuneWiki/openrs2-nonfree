import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lclient!df;")
	public static Class16 aClass16_14;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "Lclient!kd;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "Lclient!qb;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!qf;")
	private static Class60 aClass60_173 = Static59.method1195("Loaded fonts");

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int anInt400 = -1;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "Lclient!qf;")
	private static Class60 aClass60_176 = Static59.method1195("Continue");

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Lclient!qf;")
	public static Class60 aClass60_174 = aClass60_176;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public static int anInt404 = 0;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "Lclient!qf;")
	public static Class60 aClass60_175 = aClass60_173;

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
	public static int anInt407 = 0;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_177 = Static59.method1195("::gc");

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method353() {
		aClass60_177 = null;
		aClass16_14 = null;
		aClass38_1 = null;
		aClass60_175 = null;
		aClass60_176 = null;
		aClass58_1 = null;
		anIntArray54 = null;
		aClass60_173 = null;
		aClass60_174 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!Static21.method563(arg1)) {
			return false;
		}
		Static31.aClass3_Sub15Array1 = null;
		@Pc(25) boolean local25 = Static85.method1670(arg2, arg3, -1, 0, Static120.aClass3_Sub15ArrayArray1[arg1], 0, 0, arg0, 0);
		if (Static31.aClass3_Sub15Array1 != null) {
			Static85.method1670(arg2, arg3, -1412584499, 0, Static31.aClass3_Sub15Array1, Static46.anInt1448, Static86.anInt1612, arg0, 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BILclient!ha;)V")
	public static void method355(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub1 arg1) {
		if (Static63.aClass3_Sub12_6 == null) {
			Static67.method1379(255, true, 0, (byte) 0, null, 255);
			Static63.aClass25_Sub1Array2[arg0] = arg1;
		} else {
			Static63.aClass3_Sub12_6.anInt2886 = arg0 * 8 + 5;
			@Pc(24) int local24 = Static63.aClass3_Sub12_6.method1920();
			@Pc(28) int local28 = Static63.aClass3_Sub12_6.method1920();
			arg1.method944(local28, local24);
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
	public static void method356() {
		Static51.aClass5_12 = new Class5();
	}
}
