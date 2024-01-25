import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray119;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!pi;)V")
	public static void method5925(@OriginalArg(0) Class284 arg0) {
		Static667.aClass284_3 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static15.aClass230Array1[Static318.anInt5491++] = new Class230(4, arg6, arg2, arg0, arg0, arg2, arg5, arg3, arg3, arg5, arg4, arg4, arg1, arg1);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V")
	public static void method5927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg1 | (long) arg0 << 32, 19);
		local14.method2038();
	}
}
