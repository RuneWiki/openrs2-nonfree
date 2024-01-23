import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public static int anInt4256;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
	public static int[] anIntArray416 = new int[100];

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!l;")
	public static Class101 aClass101_17 = new Class101(16);

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString143 = "rating: ";

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)I")
	public static int method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(19) int local19 = local12 < 8 ? arg0 : arg3;
		@Pc(40) int local40 = local12 < 4 ? arg3 : local12 == 12 || local12 == 14 ? arg0 : arg1;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!je;BZ)V")
	public static void method3459(@OriginalArg(0) Class2_Sub8_Sub5 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (Static116.aBoolean184 || arg1) {
			local9 = Static120.anInt2649;
			@Pc(15) int local15 = local9 * 956 / 503;
			Static119.aClass2_Sub8_Sub1_13.method4365((Static60.anInt1510 - local15) / 2, 0, local15, local9);
			Static263.aClass93_1.method3562(Static60.anInt1510 / 2 - Static263.aClass93_1.anInt4355 / 2, 18);
		}
		arg0.method1230(Static162.anInt3614 == 1 ? Static108.aString89 : Static189.aString133, Static60.anInt1510 / 2, Static120.anInt2649 / 2 - 26, 16777215, -1);
		local9 = Static120.anInt2649 / 2 - 18;
		if (Static116.aBoolean184) {
			Static111.method1897(Static60.anInt1510 / 2 - 152, local9, 304, 34, 9179409);
			Static111.method1897(Static60.anInt1510 / 2 - 151, local9 + 1, 302, 32, 0);
			Static111.method1888(Static60.anInt1510 / 2 - 150, local9 + 2, Static78.anInt438 * 3, 30, 9179409);
			Static111.method1888(Static78.anInt438 * 3 + Static60.anInt1510 / 2 - 150, local9 + 2, 300 - Static78.anInt438 * 3, 30, 0);
		} else {
			Static77.method1457(Static60.anInt1510 / 2 - 152, local9, 304, 34, 9179409);
			Static77.method1457(Static60.anInt1510 / 2 - 151, local9 + 1, 302, 32, 0);
			Static77.method1447(Static60.anInt1510 / 2 - 150, local9 + 2, Static78.anInt438 * 3, 30, 9179409);
			Static77.method1447(Static60.anInt1510 / 2 + Static78.anInt438 * 3 - 150, local9 + 2, 300 - Static78.anInt438 * 3, 30, 0);
		}
		arg0.method1230(Static293.aString201, Static60.anInt1510 / 2, Static120.anInt2649 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lclient!wg;")
	public static Class2_Sub8_Sub24 method3460(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub8_Sub24 local10 = (Class2_Sub8_Sub24) Static256.aClass106_9.method2986((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static278.aClass42_99.method1256(11, arg0);
		local10 = new Class2_Sub8_Sub24();
		if (local21 != null) {
			local10.method4693(new Class2_Sub16(local21));
		}
		Static256.aClass106_9.method2990((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3462(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static75.aStringArray13.length; local12++) {
			if (Static75.aStringArray13[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
