import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 aClass3_Sub2_Sub2_Sub3_3;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_7;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!kf;")
	public static Class3_Sub3_Sub2 aClass3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1307 = Static170.method3101("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1303 = aClass28_1307;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
	public static int anInt3879 = 0;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1306 = Static170.method3101("");

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1304 = aClass28_1306;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1305 = Static170.method3101("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBI)I")
	public static int method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class3_Sub2_Sub2_Sub2.anIntArray129[arg2 * 1024 / arg3] >> 1;
		return (local16 * arg0 >> 16) + ((65536 - local16) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method2960() {
		aClass3_Sub2_Sub2_Sub3_3 = null;
		aClass28_1304 = null;
		aClass3_Sub3_Sub2_2 = null;
		aClass28_1303 = null;
		aClass28_1305 = null;
		aClass3_Sub2_Sub2_Sub4_7 = null;
		aClass28_1306 = null;
		aClass28_1307 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
	public static int method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray473.length > arg1) {
			return local10.anIntArray473[arg1];
		} else {
			return -1;
		}
	}
}
