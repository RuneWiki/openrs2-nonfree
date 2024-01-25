import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
	public static int anInt7640;

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Z")
	public static final boolean aBoolean550 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIZ)V")
	public static void method6359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 < 1 || arg7 < 1 || Static459.anInt7799 - 2 < arg5 || Static482.anInt7990 - 2 < arg7) {
			return;
		}
		@Pc(27) int local27 = arg6;
		if (arg6 < 3 && Static505.method7002(arg7, arg5)) {
			local27 = arg6 + 1;
		}
		if (!Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861) && !Static371.method5719(local27, arg7, arg5, Static206.anInt4061)) {
			return;
		}
		if (Static242.aClass255ArrayArrayArray2 == null) {
			return;
		}
		Static367.aClass149_Sub1_2.method3879(arg5, Static86.aClass91Array1[arg6], Static513.aClass122_10, arg7, arg6, arg4);
		if (arg3 >= 0) {
			@Pc(70) boolean local70 = Static544.aClass1_Sub22_Sub1_1.aBoolean380;
			Static544.aClass1_Sub22_Sub1_1.aBoolean380 = true;
			Static367.aClass149_Sub1_2.method3884(arg1, arg2, Static86.aClass91Array1[arg6], Static513.aClass122_10, arg3, local27, arg0, arg7, arg6, arg5);
			Static544.aClass1_Sub22_Sub1_1.aBoolean380 = local70;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIB[B)V")
	public static void method6361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		arg1 += arg2;
		@Pc(24) int local24 = arg0 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg0 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg1 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}
