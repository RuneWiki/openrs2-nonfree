import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt7465;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)Lclient!rea;")
	public static Class2_Sub40 method6314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub40 local5 = null;
		if (arg0 == 0) {
			local5 = Static464.method6285(Static251.aClass131_1, Static232.aClass179_53);
		}
		if (arg0 == 1) {
			local5 = Static464.method6285(Static251.aClass131_1, Static365.aClass179_77);
		}
		local5.aClass2_Sub22_Sub2_2.method8507(arg1 + Static132.anInt2246);
		local5.aClass2_Sub22_Sub2_2.method8528(arg2 + Static123.anInt2176);
		local5.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
		Static507.anInt8466 = arg2;
		Static643.aBoolean747 = false;
		Static621.anInt9980 = arg1;
		Static46.method751();
		return local5;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method6315() {
		if (Static192.aClass95_4.method6945()) {
			Static192.aClass95_4.method6978(Static504.aCanvas11);
			Static96.method1495();
			if (Static319.aBoolean356) {
				Static452.method6142(Static504.aCanvas11);
			} else {
				@Pc(23) Dimension local23 = Static504.aCanvas11.getSize();
				Static192.aClass95_4.method6984(Static504.aCanvas11, local23.width, local23.height);
			}
			Static192.aClass95_4.method7002(Static504.aCanvas11);
		} else {
			Static317.method4257(false, Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280());
		}
		Static32.method574();
		Static116.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIILclient!wp;)V")
	public static void method6316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13_Sub1_Sub5 arg4) {
		@Pc(4) Class53 local4 = Static435.method2767(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10090 = (arg1 << Static609.anInt9827) + Static427.anInt6729;
		arg4.anInt10097 = arg3;
		arg4.anInt10089 = (arg2 << Static609.anInt9827) + Static427.anInt6729;
		local4.aClass13_Sub1_Sub5_1 = arg4;
		@Pc(33) int local33 = Static314.aClass76Array2 == Static313.aClass76Array1 ? 1 : 0;
		if (arg4.method8408()) {
			if (arg4.method8413()) {
				Static417.aClass13_Sub1ArrayArray2[local33][Static28.anIntArray63[local33]++] = arg4;
				return;
			}
			Static597.aClass13_Sub1ArrayArray3[local33][Static369.anIntArray426[local33]++] = arg4;
			Static116.aBoolean155 = true;
			return;
		}
		Static139.aClass13_Sub1ArrayArray1[local33][Static497.anIntArray571[local33]++] = arg4;
	}
}
