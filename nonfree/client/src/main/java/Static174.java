import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "Lclient!ah;")
	public static Class7 aClass7_66;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	public static int anInt4183;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1460 = Static170.method3101("mapscene");

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1461 = Static170.method3101("Enter your username (V password)3");

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	public static int anInt4176 = 0;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1462 = aClass28_1461;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method3155(@OriginalArg(1) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)I")
	public static int method3156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static46.method1100(arg0 - 1, arg1 + -1) + Static46.method1100(arg0 + 1, arg1 + -1) + Static46.method1100(arg0 - 1, arg1 + 1) + Static46.method1100(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static46.method1100(arg0 - 1, arg1) + Static46.method1100(arg0 + 1, arg1) + Static46.method1100(arg0, arg1 + -1) + Static46.method1100(arg0, arg1 + 1);
		@Pc(84) int local84 = Static46.method1100(arg0, arg1);
		return local41 / 16 + local72 / 8 + local84 / 4;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method3157() {
		aClass7_66 = null;
		aClass28_1460 = null;
		aClass28_1462 = null;
		aClass28_1461 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = 2048 - arg1 & 0x7FF;
		@Pc(13) int local13 = 2048 - arg4 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg5;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local6 != 0) {
			local29 = Class3_Sub2_Sub2_Sub2.anIntArray129[local6];
			local33 = Class3_Sub2_Sub2_Sub2.anIntArray127[local6];
			local44 = local29 * 0 - arg5 * local33 >> 16;
			local21 = local33 * 0 + local29 * arg5 >> 16;
			local23 = local44;
		}
		if (local13 != 0) {
			local29 = Class3_Sub2_Sub2_Sub2.anIntArray129[local13];
			local33 = Class3_Sub2_Sub2_Sub2.anIntArray127[local13];
			local44 = local21 * local33 + local29 * 0 >> 16;
			local21 = local29 * local21 - local33 * 0 >> 16;
			local19 = local44;
		}
		Static169.anInt683 = arg1;
		Static163.anInt3970 = arg0 - local23;
		Static44.anInt3941 = arg4;
		Static85.anInt2512 = arg2 - local21;
		Static28.anInt900 = arg3 - local19;
	}
}
