import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public static int anInt599;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!sc;")
	public static Class102 aClass102_3 = new Class102(32);

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!sf;")
	public static Class105 aClass105_3 = new Class105();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!qe;IIB)V")
	public static void method473(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt3585 == arg2 && arg2 != -1) {
			@Pc(19) Class40 local19 = Static32.method546(arg2);
			@Pc(22) int local22 = local19.anInt1245;
			if (local22 == 1) {
				arg0.anInt3583 = 0;
				arg0.anInt3599 = arg1;
				arg0.anInt3595 = 0;
				arg0.anInt3576 = 0;
				Static79.method1375(arg0.anInt3598, false, arg0.anInt3576, local19, arg0.anInt3624);
			}
			if (local22 == 2) {
				arg0.anInt3583 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt3585 == -1 || Static32.method546(arg2).anInt1246 >= Static32.method546(arg0.anInt3585).anInt1246) {
			arg0.anInt3585 = arg2;
			arg0.anInt3599 = arg1;
			arg0.anInt3595 = 0;
			arg0.anInt3576 = 0;
			arg0.anInt3583 = 0;
			arg0.anInt3619 = arg0.anInt3603;
			if (arg0.anInt3585 != -1) {
				Static79.method1375(arg0.anInt3598, false, arg0.anInt3576, Static32.method546(arg0.anInt3585), arg0.anInt3624);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		@Pc(38) int local38;
		if (!Static112.method1883() && (Static150.aByteArrayArrayArray9[0][arg2][arg6] & 0x2) == 0) {
			local38 = arg1;
			if ((Static150.aByteArrayArrayArray9[arg1][arg2][arg6] & 0x8) != 0) {
				local38 = 0;
			}
			if (Static158.anInt3438 != local38) {
				return;
			}
		}
		local38 = arg1;
		if (arg1 < 3 && (Static150.aByteArrayArrayArray9[1][arg2][arg6] & 0x2) == 2) {
			local38 = arg1 + 1;
		}
		Static182.method3082(arg6, arg2, local38, Static228.aClass90Array1[arg1], arg5, arg1);
		if (arg0 < 0) {
			return;
		}
		@Pc(91) boolean local91 = Static107.aBoolean98;
		Static107.aBoolean98 = true;
		Static169.method2898(Static228.aClass90Array1[arg1], arg4, false, arg1, arg2, arg6, local38, arg3, arg0);
		Static107.aBoolean98 = local91;
		return;
	}
}
