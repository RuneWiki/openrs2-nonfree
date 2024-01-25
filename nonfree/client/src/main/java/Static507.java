import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "[Lclient!iba;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "Lclient!lm;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_159 = new Class73(9, -1);

	@OriginalMember(owner = "client!th", name = "B", descriptor = "S")
	public static short aShort107 = 320;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
	public static void method7061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static13.anInt7634 && arg0 <= Static461.anInt7899 && arg3 >= Static583.anInt9478 && arg4 <= Static415.anInt9494) {
			Static592.method7816(arg3, arg1, arg2, arg4, arg0);
		} else {
			Static499.method6760(arg1, arg2, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I")
	public static int method7062() {
		return 19;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBII)V")
	public static void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg1, 8);
		local8.method2582();
		local8.anInt2942 = arg2;
		local8.anInt2947 = arg3;
		local8.anInt2944 = arg0;
	}
}
