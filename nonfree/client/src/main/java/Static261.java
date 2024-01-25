import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!hp;")
	public static Class110 aClass110_3;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!hm;")
	public static Class107 aClass107_12 = null;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg2, 10);
		local8.method384();
		local8.anInt387 = arg3;
		local8.anInt381 = arg0;
		local8.anInt384 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IIIII)V")
	public static void method3637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static126.aClass19_Sub1_1.anInt4226 != 0 && arg0 != 0 && Static249.anInt4440 < 50 && arg1 != -1) {
			Static234.aClass43Array1[Static249.anInt4440++] = new Class43((byte) 2, arg1, arg0, arg3, arg2, 0);
		}
	}
}
