import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!xa;")
	public static Class37 aClass37_37;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt8597;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_120 = new Class276(0, 0);

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	public static int anInt8598 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZIIII)V")
	public static void method7039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static535.anInt9696 <= arg0 && arg1 <= Static35.anInt993 && arg4 >= Static55.anInt1303 && arg3 <= Static208.anInt4309) {
			Static202.method3380(arg3, arg2, arg0, arg4, arg1);
		} else {
			Static391.method6249(arg3, arg2, arg0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method7040() {
		return Static256.aBoolean474 || Static201.aClass3_Sub40_3 == null ? "" : Static201.aClass3_Sub40_3.aString87;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIIIIII)V")
	public static void method7041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static455.aClass3_Sub27_Sub1_1.anInt4799 != 0 && arg0 != 0 && Static228.anInt4641 < 50 && arg1 != -1) {
			Static200.aClass64Array1[Static228.anInt4641++] = new Class64((byte) 2, arg1, arg0, arg3, arg4, arg2);
		}
	}
}
