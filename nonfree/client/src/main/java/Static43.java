import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!pc;")
	public static Class196 aClass196_6;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!qn;")
	public static Class211 aClass211_55;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!ae;")
	public static final Class6 aClass6_6 = new Class6("runescape", 0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
	public static final int[] anIntArray271 = new int[8];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBILclient!bf;ILclient!bf;III)V")
	public static void method2900(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class8_Sub3_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class8_Sub3_Sub1 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(21) int local21 = arg2.method5897();
		if (local21 == -1) {
			return;
		}
		@Pc(35) Class95 local35 = (Class95) Static82.aClass137_12.method2744((long) local21);
		if (local35 == null) {
			@Pc(42) Class216[] local42 = Static465.method4468(Static13.aClass211_11, local21);
			if (local42 == null) {
				return;
			}
			local35 = Static39.aClass135_1.method5379(local42[0]);
			Static82.aClass137_12.method2732((long) local21, local35);
		}
		Static176.method2475(arg4.anInt7339, arg3 >> 1, 0, arg5 >> 1, arg4.method5894() * 64, arg4.aByte99, arg4.anInt7343);
		@Pc(91) int local91 = arg6 + Static73.anIntArray111[0] - 18;
		@Pc(101) int local101 = arg1 + Static73.anIntArray111[1] - 54 - 16;
		@Pc(109) int local109 = local91 + arg0 / 4 * 18;
		@Pc(117) int local117 = local101 + arg0 % 4 * 18;
		local35.method5821(local109, local117);
		if (arg2 == arg4) {
			Static39.aClass135_1.method5369(local109 - 1, 18, -256, 18, local117 - 1);
		}
		@Pc(139) Class20_Sub7 local139 = Static121.method1717();
		local139.anInt4943 = local109;
		local139.anInt4945 = local117 + 16;
		local139.anInt4942 = local117;
		local139.anInt4946 = local109 + 16;
		local139.aClass8_Sub3_Sub1_1 = arg2;
		Static26.aClass248_2.method5585(local139);
	}
}
