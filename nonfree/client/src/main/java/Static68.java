import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Lclient!tk;")
	public static Class159 aClass159_7 = null;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public static int anInt1687 = 0;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(BI)I")
	public static int method1239(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) Class8_Sub9 local5 = null;
		for (@Pc(18) Class8_Sub9 local18 = (Class8_Sub9) Static84.aClass182_10.method4319(); local18 != null; local18 = (Class8_Sub9) Static84.aClass182_10.method4329()) {
			if (local18.anInt1250 == arg0 && local18.anInt1249 == arg1 && arg8 == local18.anInt1251 && arg2 == local18.anInt1243) {
				local5 = local18;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class8_Sub9();
			local5.anInt1250 = arg0;
			local5.anInt1243 = arg2;
			local5.anInt1251 = arg8;
			local5.anInt1249 = arg1;
			Static122.method1968(local5);
			Static84.aClass182_10.method4328(local5);
		}
		local5.anInt1248 = arg7;
		local5.anInt1241 = arg5;
		local5.anInt1239 = arg4;
		local5.anInt1245 = arg3;
		local5.anInt1240 = arg6;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method1241() {
		Static7.method63();
		Static295.method2910();
		Static91.method1477();
		Static292.method4270();
		Static24.method427();
		Static93.method1491();
		Static59.method930();
		Static189.method2953();
		Static64.method988();
		Static4.method39();
		Static133.method2170();
		Static284.method4237();
		Static221.method3445();
		Static79.method1283();
		Static72.method1145();
		Static271.method4040();
		Static70.method1138();
		Static70.method1140();
		Static135.method2191();
		Static128.method2079();
		Static66.aClass61_39.method1381(5);
		Static107.aClass61_16.method1381(5);
	}
}
