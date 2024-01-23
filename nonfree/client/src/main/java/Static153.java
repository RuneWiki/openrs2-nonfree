import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_42;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1179 = Static64.method1101("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public static int[] anIntArray226 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method2618(@OriginalArg(1) int arg0) {
		Static77.anInt1721 = arg0;
		if (Static47.anInt1142 == 40) {
			Static142.method2482(8);
		} else {
			Static142.method2482(10);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILclient!me;ILclient!te;)V")
	public static void method2620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub2_Sub1 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(26) int local26 = arg1 * arg1 + arg4 * arg4;
		@Pc(32) int local32 = Static45.anInt1100 + Static16.anInt379 & 0x7FF;
		@Pc(44) int local44 = Math.max(arg3.anInt2802 / 2, arg3.anInt2835 / 2) + 10;
		if (local44 * local44 < local26) {
			return;
		}
		@Pc(58) int local58 = Class94.anIntArray277[local32];
		@Pc(62) int local62 = Class94.anIntArray278[local32];
		@Pc(70) int local70 = local58 * 256 / (Static151.anInt3331 + 256);
		@Pc(78) int local78 = local62 * 256 / (Static151.anInt3331 + 256);
		@Pc(89) int local89 = local70 * arg4 - local78 * arg1 >> 16;
		@Pc(99) int local99 = local70 * arg1 + local78 * arg4 >> 16;
		((Class1_Sub2_Sub1_Sub1) arg5).method2083(arg0 + arg3.anInt2802 / 2 + local99 - arg5.anInt2635 / 2, -local89 + arg2 + arg3.anInt2835 / 2 + -(arg5.anInt2638 / 2), arg3.anIntArray186, arg3.anIntArray182);
	}
}
