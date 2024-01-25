import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kq", name = "mb", descriptor = "Lclient!ml;")
	public static Class156 aClass156_3;

	@OriginalMember(owner = "client!kq", name = "nb", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!kq", name = "ob", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V")
	public static void method3178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = Static453.aClass136_Sub1_1.anInt4444 * arg1 >> 8;
		if (arg0 == -1 && !Static328.aBoolean637) {
			Static34.method492();
		} else if (arg0 != -1 && (Static143.anInt2345 != arg0 || !Static171.method5258()) && local18 != 0 && !Static328.aBoolean637) {
			Static137.method2090(local18, arg2, Static447.aClass82_54, arg0);
		}
		Static143.anInt2345 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V")
	public static void method3181() {
		Static421.method5595();
		Static392.aClass3_3 = null;
		Static456.aClass3_4 = null;
		Static322.aClass3_2 = null;
		Static383.aClass109ArrayArray1 = null;
		Static383.aClass34_11 = null;
	}
}
