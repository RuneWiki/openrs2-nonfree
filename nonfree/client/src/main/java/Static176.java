import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString117 = "flash2:";

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean235 = true;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "J")
	public static long aLong147 = 0L;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static175.anInt3267 <= arg7 && Static204.anInt4020 >= arg7 && Static175.anInt3267 <= arg2 && Static204.anInt4020 >= arg2 && Static175.anInt3267 <= arg5 && arg5 <= Static204.anInt4020 && arg8 >= Static175.anInt3267 && arg8 <= Static204.anInt4020 && arg0 >= Static245.anInt6027 && arg0 <= Static111.anInt2039 && arg1 >= Static245.anInt6027 && Static111.anInt2039 >= arg1 && Static245.anInt6027 <= arg3 && Static111.anInt2039 >= arg3 && Static245.anInt6027 <= arg4 && Static111.anInt2039 >= arg4) {
			Static262.method4362(arg6, arg8, arg7, arg0, arg1, arg4, arg2, arg3, arg5);
		} else {
			Static286.method4488(arg7, arg8, arg1, arg5, arg4, arg0, arg3, arg6, arg2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public static void method2888() {
		Static42.method630();
		Static42.method623();
		Static42.method621();
		Static42.method618();
		Static42.method619();
		Static42.method622();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)Lclient!tb;")
	public static Class167 method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(36) long local36 = ((long) arg3 & 0xFFFFL) << 32 | ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(42) Class167 local42 = (Class167) Static218.aClass98_38.method2570(local36);
		if (local42 != null) {
			return local42;
		}
		@Pc(51) Class59 local51 = Static56.method914(arg0);
		@Pc(53) Class118[] local53 = null;
		if (local51.anIntArray158 != null) {
			local53 = new Class118[local51.anIntArray158.length];
			for (@Pc(64) int local64 = 0; local64 < local53.length; local64++) {
				@Pc(81) Class32 local81 = Static15.method3532(local51.anIntArray158[local64]);
				local53[local64] = new Class118(local81.anInt955, local81.anInt958, local81.anInt952, local81.anInt960, local81.anInt956, local81.anInt950, local81.anInt951, local81.aBoolean76);
			}
		}
		local42 = new Class167(local51.anInt1665, local53, local51.anInt1667, arg1, arg3, arg2);
		Static218.aClass98_38.method2568(local42, local36);
		return local42;
	}
}
