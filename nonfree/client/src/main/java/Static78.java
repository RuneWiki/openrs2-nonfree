import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ih", name = "wb", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_57;

	@OriginalMember(owner = "client!ih", name = "jb", descriptor = "[I")
	public static int[] anIntArray191 = new int[4000];

	@OriginalMember(owner = "client!ih", name = "kb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!ih", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1185 = Static107.method1838("T");

	@OriginalMember(owner = "client!ih", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1186 = Static107.method1838("hitmarks");

	@OriginalMember(owner = "client!ih", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1187 = Static107.method1838(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ih", name = "sb", descriptor = "Lclient!bh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB[B[Lclient!ie;I)V")
	public static void method1406(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class36[] arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class2_Sub2 local15 = new Class2_Sub2(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method1679();
			if (local21 == 0) {
				return;
			}
			@Pc(25) int local25 = 0;
			local17 += local21;
			while (true) {
				@Pc(35) int local35 = local15.method1679();
				if (local35 == 0) {
					break;
				}
				local25 += local35 - 1;
				@Pc(50) int local50 = local25 >> 12;
				@Pc(54) int local54 = local15.method1698();
				@Pc(60) int local60 = local25 >> 6 & 0x3F;
				@Pc(64) int local64 = local25 & 0x3F;
				@Pc(68) int local68 = local54 >> 2;
				@Pc(72) int local72 = local54 & 0x3;
				@Pc(76) int local76 = arg0 + local60;
				@Pc(80) int local80 = local64 + arg3;
				if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
					@Pc(97) int local97 = local50;
					@Pc(99) Class36 local99 = null;
					if ((Static49.aByteArrayArrayArray4[1][local76][local80] & 0x2) == 2) {
						local97 = local50 - 1;
					}
					if (local97 >= 0) {
						local99 = arg2[local97];
					}
					Static170.method2899(local80, local50, local76, local72, local17, local68, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	public static void method1407() {
		aClass28_1185 = null;
		aClass28_1186 = null;
		anIntArray191 = null;
		anIntArrayArrayArray6 = null;
		aClass28_1187 = null;
		aClass40_Sub1_57 = null;
	}
}
