import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!c", name = "G", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_68 = new Class179(31, 7);

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_185 = new Class288(22, 4);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Lclient!ei;")
	public static Class89_Sub1 method4530(@OriginalArg(0) int arg0) {
		return Static507.aBoolean634 && Static169.anInt3008 <= arg0 && arg0 <= Static57.anInt1132 ? Static363.aClass89_Sub1Array4[arg0 - Static169.anInt3008] : null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
	public static boolean method4531(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 30 || arg0 == 3 || arg0 == 13 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static379.anInt5914 <= arg0 && Static624.anInt10032 >= arg0 && arg5 >= Static379.anInt5914 && Static624.anInt10032 >= arg5 && arg4 >= Static379.anInt5914 && arg4 <= Static624.anInt10032 && arg2 >= Static379.anInt5914 && arg2 <= Static624.anInt10032 && arg7 >= Static257.anInt4068 && arg7 <= Static67.anInt1214 && arg1 >= Static257.anInt4068 && Static67.anInt1214 >= arg1 && Static257.anInt4068 <= arg8 && arg8 <= Static67.anInt1214 && arg3 >= Static257.anInt4068 && Static67.anInt1214 >= arg3) {
			Static290.method4015(arg6, arg2, arg5, arg1, arg0, arg4, arg3, arg8, arg7);
		} else {
			Static146.method2198(arg0, arg8, arg2, arg1, arg6, arg7, arg3, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)Z")
	public static boolean method4534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
