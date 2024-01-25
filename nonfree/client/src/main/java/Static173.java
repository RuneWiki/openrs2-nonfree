import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!nq;")
	public static Class202_Sub1 aClass202_Sub1_1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIB)Lclient!dga;")
	public static Class65 method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg1 * 986053L ^ (long) arg0 * 475427L ^ (long) arg5 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 32147369L;
		@Pc(44) Class65 local44 = (Class65) Static242.aClass245_39.method6082(local33);
		if (local44 == null) {
			local44 = Static101.aClass9_4.method5442(arg3, arg5, arg0, arg1, arg2, arg4);
			Static242.aClass245_39.method6075(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
	public static void method3499() {
		Static419.method6518(Static104.aClass6_Sub6_Sub1_4.aBoolean122);
		Static87.aClass6_Sub10_Sub1_1 = new Class6_Sub10_Sub1();
		Static87.aClass6_Sub10_Sub1_1.method1531();
		Static581.aClass196_2 = Static34.method1032(Static38.aCanvas4, Static414.aClass246_5, 0, 22050);
		Static581.aClass196_2.method6407(Static87.aClass6_Sub10_Sub1_1);
		Static441.method6735(Static87.aClass6_Sub10_Sub1_1, Static487.aClass168_112, Static215.aClass168_53, Static128.aClass168_35);
		Static423.aClass196_1 = Static34.method1032(Static38.aCanvas4, Static414.aClass246_5, 1, 2048);
		Static35.aClass6_Sub10_Sub3_1 = new Class6_Sub10_Sub3();
		Static423.aClass196_1.method6407(Static35.aClass6_Sub10_Sub3_1);
		Static184.aClass151_1 = new Class151(22050, Static77.anInt1912);
		Static422.anInt7840 = Static378.aClass168_88.method4432("scape main");
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static190.anInt4121; local3++) {
			@Pc(9) Rectangle local9 = Class93.aRectangleArray2[local3];
			if (local9.x + local9.width > arg3 && arg3 + arg2 > local9.x && local9.height + local9.y > arg1 && local9.y < arg1 + arg0) {
				Static3.aBooleanArray22[local3] = true;
			}
		}
	}
}
