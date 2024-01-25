import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array22;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public static int anInt8139;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 512 || arg2 < 512 || Static500.anInt6888 * 512 - 1024 < arg5 || Static573.anInt9325 * 512 - 1024 < arg2) {
			Static480.anIntArray537[0] = Static480.anIntArray537[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static122.method2103(arg3, arg5, arg2) - arg0;
		Static583.aClass209_6.U(arg1, 0, 0);
		Static136.aClass12_8.method6471(Static583.aClass209_6);
		Static136.aClass12_8.AA(arg5, local49, arg2, Static480.anIntArray537);
		Static583.aClass209_6.U(-arg1, 0, 0);
		Static136.aClass12_8.method6471(Static583.aClass209_6);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static511.aByteArrayArrayArray19[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static511.aByteArrayArrayArray19[arg2][arg3][arg1] & 0x10) == 0) {
			return Static515.method7047(arg3, arg2, arg1) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	public static int method6768() {
		return Static341.anInt6056;
	}
}
