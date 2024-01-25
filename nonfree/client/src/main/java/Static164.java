import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public static int anInt3376 = 0;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[I")
	public static final int[] anIntArray216 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public static void method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub4_Sub12 local10 = Static393.method5080(arg2, 9);
		local10.method3248();
		local10.anInt4063 = arg1;
		local10.anInt4060 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method2714() {
		for (@Pc(8) Class3_Sub14 local8 = (Class3_Sub14) Static184.aClass243_21.method5208(); local8 != null; local8 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			if (Static123.method1983(local8.anInt2182)) {
				Static8.method4686(local8);
			}
		}
		if (Static158.anInt3162 == 1) {
			Static438.aBoolean636 = false;
			Static313.method4344(Static126.anInt2657, Static242.anInt4631, Static124.anInt7631, Static442.anInt7488);
			return;
		}
		Static313.method4344(Static126.anInt2657, Static242.anInt4631, Static124.anInt7631, Static442.anInt7488);
		@Pc(60) int local60 = Static269.aClass70_27.method1759(Static7.aClass189_5.method4262(Static53.anInt1454));
		for (@Pc(65) Class3_Sub14 local65 = (Class3_Sub14) Static184.aClass243_21.method5208(); local65 != null; local65 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			@Pc(70) int local70 = Static177.method2819(local65);
			if (local60 < local70) {
				local60 = local70;
			}
		}
		Static126.anInt2657 = local60 + 8;
		Static242.anInt4631 = (Static378.aBoolean550 ? 26 : 22) + Static158.anInt3162 * 16;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
	public static boolean method2715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
