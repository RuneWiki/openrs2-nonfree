import java.awt.Color;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public static int anInt1452;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "J")
	public static long aLong50 = 0L;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public static int anInt1450 = -1;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public static int anInt1455 = 1;

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public static void method1348() {
		Static279.aClass18_33 = new Class18();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILclient!ah;Lclient!e;II)V")
	public static void method1349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(6) int arg5) {
		if (Static315.anInt6452 < 100) {
			Static140.method2816(arg4, arg3);
		}
		arg4.method5172(arg2, arg1, arg0 + arg2, arg5 + arg1);
		@Pc(33) int local33;
		@Pc(44) int local44;
		if (Static315.anInt6452 < 100) {
			local33 = arg0 / 2 + arg2;
			local44 = arg5 / 2 + arg1 - 18 - 20;
			arg4.method5110(arg2, arg1, arg0, arg5, -16777216, 0);
			arg4.method5143(local33 - 152, local44, 304, 34, Static309.aColorArray2[Static81.anInt2000].getRGB(), 0);
			arg4.method5110(local33 - 150, local44 + 2, Static315.anInt6452 * 3, 30, aColorArray1[Static81.anInt2000].getRGB(), 0);
			Static164.aClass30_5.method5584(Static183.aString133, -1, local44 + 20, local33, Static353.aColorArray3[Static81.anInt2000].getRGB());
			return;
		}
		@Pc(105) int local105 = Static297.anInt5698 - (int) ((float) arg0 / Static241.aFloat108);
		local33 = Static41.anInt983 + (int) ((float) arg5 / Static241.aFloat108);
		local44 = (int) ((float) arg0 / Static241.aFloat108) + Static297.anInt5698;
		@Pc(131) int local131 = Static41.anInt983 - (int) ((float) arg5 / Static241.aFloat108);
		Static258.anInt4910 = (int) ((float) (arg0 * 2) / Static241.aFloat108);
		Static107.anInt2397 = Static41.anInt983 - (int) ((float) arg5 / Static241.aFloat108);
		Static330.anInt6364 = Static297.anInt5698 - (int) ((float) arg0 / Static241.aFloat108);
		Static331.anInt6401 = (int) ((float) (arg5 * 2) / Static241.aFloat108);
		Static241.method5062(Static241.anInt5683 + local105, local33 - -Static241.anInt5684, local44 + Static241.anInt5683, local131 - -Static241.anInt5684, arg2, arg1, arg2 + arg0, arg5 + 1 + arg1);
		Static241.method5050(arg4);
		@Pc(195) Class18 local195 = Static241.method5055(arg4);
		Static201.method3730(arg4, local195);
		if (Static28.anInt659 > 0) {
			Static331.anInt6398--;
			if (Static331.anInt6398 == 0) {
				Static28.anInt659--;
				Static331.anInt6398 = 20;
			}
		}
		if (!Static66.aBoolean104) {
			return;
		}
		@Pc(226) int local226 = arg2 + arg0 - 5;
		@Pc(232) int local232 = arg1 + arg5 - 8;
		Static245.aClass30_7.method5587("Fps:" + Static116.anInt2558, local232, local226, 16776960);
		@Pc(247) int local247 = local232 - 15;
		@Pc(249) Runtime local249 = Runtime.getRuntime();
		@Pc(258) int local258 = (int) ((local249.totalMemory() - local249.freeMemory()) / 1024L);
		@Pc(260) int local260 = 16776960;
		if (local258 > 65536) {
			local260 = 16711680;
		}
		Static245.aClass30_7.method5587("Mem:" + local258 + "k", local247, local226, local260);
		local232 = local247 - 15;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
	public static void method1351() {
		Static256.aClass11_110.method213();
	}
}
