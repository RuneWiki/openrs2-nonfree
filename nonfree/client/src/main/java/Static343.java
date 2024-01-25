import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_101 = new Class183(73, 7);

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method5493() {
		Static243.anInt4781 = 0;
		Static333.anInt6170 = 0;
		Static7.anInt170 = -1;
		Static147.anInt3137 = 1;
		Static302.anInt5607 = 0;
		Static218.aBoolean316 = false;
		Static228.anInt4595 = -3;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BZIILclient!cj;)V")
	public static void method5494(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class1_Sub2_Sub1_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray466[0];
		@Pc(15) int local15 = arg2.anIntArray465[0];
		if (local10 < 0 || local10 >= Static89.anInt1891 || local15 < 0 || Static85.anInt1839 <= local15 || (arg1 < 0 || arg1 >= Static89.anInt1891 || arg0 < 0 || arg0 >= Static85.anInt1839)) {
			return;
		}
		@Pc(89) int local89 = Static40.method572(Static165.aClass178Array1[arg2.aByte73], 0, 0, 0, 0, local15, arg1, local10, true, arg2.method4792(), -4, Static132.anIntArray219, arg0, Static365.anIntArray570);
		if (local89 >= 1) {
			for (@Pc(97) int local97 = 0; local97 < local89 - 1; local97++) {
				arg2.method704((byte) 2, Static132.anIntArray219[local97], Static365.anIntArray570[local97]);
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!hu;ZIIIZI)V")
	public static void method5495(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static277.anInt5160 >= 50 || (arg0 == null || arg0.anIntArrayArray14 == null || arg3 >= arg0.anIntArrayArray14.length || arg0.anIntArrayArray14[arg3] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray14[arg3][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg0.anIntArrayArray14[arg3].length > 1) {
			local63 = (int) ((double) arg0.anIntArrayArray14[arg3].length * Math.random());
			if (local63 > 0) {
				local38 = arg0.anIntArrayArray14[arg3][local63];
			}
		}
		@Pc(76) int local76 = local34 & 0x1F;
		if (local76 == 0) {
			if (arg1) {
				Static88.method1493(0, local38, local44, 255);
			}
		} else if (Static107.anInt2388 != 0) {
			Static104.anIntArray191[Static277.anInt5160] = local38;
			Static145.anIntArray459[Static277.anInt5160] = local44;
			Static321.anIntArray511[Static277.anInt5160] = 0;
			Static349.aClass80Array1[Static277.anInt5160] = null;
			Static55.anIntArray87[Static277.anInt5160] = 255;
			local63 = (arg2 - 64) / 128;
			@Pc(127) int local127 = (arg4 - 64) / 128;
			Static283.anIntArray454[Static277.anInt5160] = (arg5 << 24) + ((local63 << 16) - (-(local127 << 8) - local76));
			Static277.anInt5160++;
		}
	}
}
