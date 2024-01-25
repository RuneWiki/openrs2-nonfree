import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static int anInt7924 = 0;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt7926 = 1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZIZIIIJILjava/lang/String;Ljava/lang/String;)V")
	public static void method6150(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) String arg9) {
		if (!Static96.aBoolean151 && Static126.anInt2794 < 500) {
			@Pc(16) int local16 = arg3 == -1 ? Static49.anInt1209 : arg3;
			@Pc(30) Class1_Sub35 local30 = new Class1_Sub35(arg8, arg9, local16, arg0, arg4, arg6, arg7, arg5, arg1, arg2);
			Static401.aClass203_47.method4551(local30);
			Static126.anInt2794++;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void method6151() {
		if (Static282.aString42.toLowerCase().indexOf("microsoft") != -1) {
			Static212.anIntArray411[189] = 26;
			Static212.anIntArray411[222] = 59;
			Static212.anIntArray411[219] = 42;
			Static212.anIntArray411[191] = 73;
			Static212.anIntArray411[187] = 27;
			Static212.anIntArray411[188] = 71;
			Static212.anIntArray411[190] = 72;
			Static212.anIntArray411[192] = 58;
			Static212.anIntArray411[223] = 28;
			Static212.anIntArray411[221] = 43;
			Static212.anIntArray411[186] = 57;
			Static212.anIntArray411[220] = 74;
			return;
		}
		Static212.anIntArray411[47] = 73;
		if (Static282.aMethod2 == null) {
			Static212.anIntArray411[192] = 58;
			Static212.anIntArray411[222] = 59;
		} else {
			Static212.anIntArray411[222] = 58;
			Static212.anIntArray411[192] = 28;
			Static212.anIntArray411[520] = 59;
		}
		Static212.anIntArray411[92] = 74;
		Static212.anIntArray411[61] = 27;
		Static212.anIntArray411[44] = 71;
		Static212.anIntArray411[91] = 42;
		Static212.anIntArray411[45] = 26;
		Static212.anIntArray411[59] = 57;
		Static212.anIntArray411[46] = 72;
		Static212.anIntArray411[93] = 43;
	}
}
