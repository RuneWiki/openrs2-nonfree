import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ou", name = "hb", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ou", name = "ac", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!ou", name = "hc", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_27 = new Class158("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg2 < 1 || Static209.anInt4283 - 2 < arg1 || arg2 > Static211.anInt4295 - 2) {
			return;
		}
		@Pc(31) int local31 = arg7;
		if (arg7 < 3 && Static457.method6172(arg2, arg1)) {
			local31 = arg7 + 1;
		}
		if (!Static12.aClass34_Sub1_1.method5471(Static262.anInt2805) && !Static318.method4536(local31, arg1, Static313.anInt5847, arg2)) {
			return;
		}
		if (Static67.aClass252ArrayArrayArray2 == null) {
			return;
		}
		Static349.aClass29_Sub1_5.method1553(Static30.aClass106_3, arg4, arg1, Static19.aClass120Array1[arg7], arg2, arg7);
		if (arg3 < 0) {
			return;
		}
		@Pc(74) boolean local74 = Static12.aClass34_Sub1_1.aBoolean455;
		Static12.aClass34_Sub1_1.aBoolean455 = true;
		Static349.aClass29_Sub1_5.method1555(arg7, arg3, arg0, arg5, arg6, arg2, Static30.aClass106_3, arg1, Static19.aClass120Array1[arg7], local31);
		Static12.aClass34_Sub1_1.aBoolean455 = local74;
		return;
	}

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "(I)V")
	public static void method951(@OriginalArg(0) int arg0) {
		Static307.anInt5772 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static216.anInt4346; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static198.anInt7949; local6++) {
				if (Static67.aClass252ArrayArrayArray2[arg0][local3][local6] == null) {
					Static67.aClass252ArrayArrayArray2[arg0][local3][local6] = new Class252(arg0, local3, local6);
				}
			}
		}
	}
}
