import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cd", name = "Fc", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!cd", name = "Gc", descriptor = "Lclient!qp;")
	public static Class171 aClass171_2;

	@OriginalMember(owner = "client!cd", name = "Wc", descriptor = "[Lclient!ch;")
	public static Class7_Sub2_Sub1_Sub1[] aClass7_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!cd", name = "Sc", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!cd", name = "Uc", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_2 = new Class14();

	@OriginalMember(owner = "client!cd", name = "bd", descriptor = "I")
	public static int anInt877 = -1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V")
	public static void method678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class172 local14 = Static89.aClass172ArrayArray1[arg0][arg1];
		Static62.method5785(local14 == null ? Static64.aClass172_1 : local14, 5000);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method681(@OriginalArg(1) String arg0) {
		return Static163.method2865(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)V")
	public static void method683() {
		@Pc(8) int local8 = Static346.method5792();
		if (local8 == 0) {
			Static263.aByteArrayArrayArray9 = null;
			Static39.method785(0);
		} else if (local8 == 1) {
			Static63.method2279((byte) 0);
			Static39.method785(512);
			if (Static291.aByteArrayArrayArray11 != null) {
				Static55.method1100();
			}
		} else {
			Static63.method2279((byte) (Static2.anInt30 - 4 & 0xFF));
			Static39.method785(2);
		}
		Static285.anInt5731 = Static127.anInt2487;
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "(I)V")
	public static void method685() {
		Static223.aClass37_30.method914();
	}
}
