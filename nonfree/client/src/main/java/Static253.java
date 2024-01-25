import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!is", name = "w", descriptor = "Lclient!np;")
	public static Class258 aClass258_3;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_83 = new Class156(33, 28);

	@OriginalMember(owner = "client!is", name = "t", descriptor = "[I")
	public static final int[] anIntArray251 = new int[32];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static230.anInt3962 <= arg7 && Static463.anInt7530 >= arg7 && arg3 >= Static230.anInt3962 && Static463.anInt7530 >= arg3 && arg5 >= Static230.anInt3962 && arg5 <= Static463.anInt7530 && Static230.anInt3962 <= arg1 && arg1 <= Static463.anInt7530 && arg6 >= Static573.anInt8986 && Static319.anInt5445 >= arg6 && arg4 >= Static573.anInt8986 && Static319.anInt5445 >= arg4 && Static573.anInt8986 <= arg2 && arg2 <= Static319.anInt5445 && arg0 >= Static573.anInt8986 && arg0 <= Static319.anInt5445) {
			Static618.method8480(arg3, arg2, arg8, arg4, arg1, arg0, arg7, arg5, arg6);
		} else {
			Static553.method7509(arg3, arg7, arg8, arg4, arg5, arg0, arg6, arg2, 14091, arg1);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/lang/String;Lclient!wq;)I")
	public static int method4125(@OriginalArg(1) String arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		@Pc(6) int local6 = arg1.anInt8456;
		@Pc(10) byte[] local10 = Static73.method1219(arg0);
		arg1.method7319(local10.length);
		arg1.anInt8456 += Static209.aClass311_1.method7023(local10, 0, arg1.anInt8456, local10.length, arg1.aByteArray89);
		return arg1.anInt8456 - local6;
	}
}
