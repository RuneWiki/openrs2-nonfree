import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
	public static int[] anIntArray178 = new int[100];

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!oh;")
	public static Class99 aClass99_6 = new Class99();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
	public static void method1835(@OriginalArg(0) int arg0) {
		if (!Static188.aBoolean205) {
			arg0 = -1;
		}
		if (Static10.anInt388 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class13 local25 = Static32.method594(arg0);
			@Pc(29) Class1_Sub2_Sub4_Sub1 local29 = local25.method239();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static38.aClass28_1.method725(Static98.aCanvas1, local29.anInt1289, new Point(local25.anInt512, local25.anInt513), local29.method907(), local29.anInt1280);
				Static10.anInt388 = arg0;
			}
		}
		if (arg0 == -1 && Static10.anInt388 != -1) {
			Static38.aClass28_1.method725(Static98.aCanvas1, -1, new Point(), null, -1);
			Static10.anInt388 = -1;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
	public static int method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
