import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	public static int anInt4498;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1285 = Static158.method3034(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1286 = Static158.method3034("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIII)V")
	public static void method3455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static84.anInt2513 == 1) {
			Static160.aClass2_Sub1_Sub7_Sub4Array7[Static10.anInt346 / 100].method2151(Static89.anInt2602 - 8, Static7.anInt4637 + -8);
		}
		if (Static84.anInt2513 == 2) {
			Static160.aClass2_Sub1_Sub7_Sub4Array7[Static10.anInt346 / 100 + 4].method2151(Static89.anInt2602 - 8, Static7.anInt4637 + -8);
		}
		Static19.method2420();
		if (!Static105.aBoolean136) {
			return;
		}
		@Pc(53) int local53 = arg3 + 512 - 5;
		@Pc(57) int local57 = arg1 + 20;
		Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1800(Static193.method3536(new Class60[] { Static162.aClass60_1103, Static72.method1661(Static41.anInt1303) }), local53, local57, 16776960, -1);
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(80) int local80 = local57 + 15;
		@Pc(90) int local90 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		@Pc(92) int local92 = 16776960;
		if (local90 > 32768 && Static8.aBoolean3) {
			local92 = 16711680;
		}
		if (local90 > 65536 && !Static8.aBoolean3) {
			local92 = 16711680;
		}
		Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1800(Static193.method3536(new Class60[] { Static184.aClass60_1273, Static72.method1661(local90), Static56.aClass60_406 }), local53, local80, local92, -1);
		local57 = local80 + 15;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method3456(@OriginalArg(1) KeyEvent arg0) {
		@Pc(13) int local13 = arg0.getKeyChar();
		if (local13 == 8364) {
			return 128;
		} else {
			if (local13 <= 0 || local13 >= 256) {
				local13 = -1;
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg6 && arg3 == arg5 && arg0 == arg1 && arg2 == arg7) {
			Static184.method3426(arg4, arg3, arg7, arg0, arg6);
			return;
		}
		@Pc(28) int local28 = arg6;
		@Pc(32) int local32 = arg6 * 3;
		@Pc(36) int local36 = arg3 * 3;
		@Pc(38) int local38 = arg3;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(65) int local65 = arg0 + local42 - arg6 - local50;
		@Pc(74) int local74 = local46 + arg7 - local54 - arg3;
		@Pc(83) int local83 = local36 + local54 - local46 - local46;
		@Pc(92) int local92 = local32 + local50 - local42 - local42;
		@Pc(97) int local97 = local42 - local32;
		@Pc(102) int local102 = local46 - local36;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local112 * local104 >> 12;
			@Pc(122) int local122 = local118 * local65;
			@Pc(126) int local126 = local118 * local74;
			@Pc(130) int local130 = local112 * local83;
			@Pc(134) int local134 = local97 * local104;
			@Pc(138) int local138 = local112 * local92;
			@Pc(142) int local142 = local104 * local102;
			@Pc(153) int local153 = arg3 + (local142 + local130 + local126 >> 12);
			@Pc(164) int local164 = (local134 + local122 + local138 >> 12) + arg6;
			Static184.method3426(arg4, local38, local153, local164, local28);
			local38 = local153;
			local28 = local164;
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method3458() {
		Static8.aBoolean3 = true;
		Static29.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIII)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static64.anInt1962 <= arg4 && Static123.anInt3379 >= arg3 && arg1 >= Static36.anInt1076 && arg2 <= Static117.anInt951) {
			Static72.method1660(arg3, arg0, arg1, arg4, arg2);
		} else {
			Static187.method3553(arg2, arg4, arg0, arg1, arg3);
		}
	}
}
