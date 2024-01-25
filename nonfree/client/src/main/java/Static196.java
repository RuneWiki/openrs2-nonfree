import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!bk;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "[I")
	public static final int[] anIntArray176 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
	public static int[] anIntArray177 = new int[2];

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!ep;")
	public static final Class103 aClass103_2 = new Class103("WIP", 2);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIIILclient!bn;FIFFIFI[BI)V")
	public static void method2770(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(10) float arg7, @OriginalArg(12) byte[] arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(57) int local57;
		@Pc(71) int local71;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			arg3.method3086(0, arg7 / (float) 16, arg2, arg4 * 127.0F, arg0 / (float) 128, arg5 / (float) 128, local10);
			local57 = arg1;
			arg5 *= 2.0F;
			arg7 *= 2.0F;
			arg4 *= arg6;
			for (local71 = 0; local71 < 16384; local71++) {
				arg8[local57] = (byte) (int) ((float) arg8[local57] + local10[local71]);
				local57++;
			}
			arg0 *= 2.0F;
		}
		local57 = arg1;
		for (local71 = 0; local71 < 16384; local71++) {
			arg8[local57] = (byte) (arg8[local57] + 127);
			local57++;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIII)Z")
	public static boolean method2772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static649.aBoolean743 || !Static662.aBoolean761) {
			return false;
		} else if (Static309.anInt5508 < 100) {
			return false;
		} else if (Static103.method1741(arg3, arg2, arg1)) {
			@Pc(28) int local28 = arg1 << Static138.anInt2287;
			@Pc(32) int local32 = arg2 << Static138.anInt2287;
			if (Static87.method1315(Static108.anInt1949, Static298.aClass88Array3[arg3].method8749(arg1, arg2), local32, arg0, local28, Static108.anInt1949)) {
				Static423.anInt7531++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
