import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!op;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_95 = new Class21("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public static void method4738() {
		Static352.anInt6233 = 0;
		Static289.aClass91_31.method2582();
		Static289.aClass91_31.method2587(Static24.aClass4_Sub14_1);
		Static352.anInt6233++;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!eu;)Ljava/lang/String;")
	public static String method4739(@OriginalArg(1) Class4_Sub14 arg0) {
		return arg0.aString13 == null || arg0.aString13.length() <= 0 ? arg0.aString14 : arg0.aString14 + Static287.aClass21_88.method362(Static168.anInt3290) + arg0.aString13;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)I")
	public static int method4741(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
