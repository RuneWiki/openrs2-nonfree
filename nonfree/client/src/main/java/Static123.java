import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!qe;")
	private static Class78 aClass78_566 = Static199.method3560("Loaded sprites");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_564 = aClass78_566;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_565 = Static199.method3560("<col=00ff80>");

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[I")
	public static int[] anIntArray461 = new int[100];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public static void method2217(@OriginalArg(0) int arg0) {
		Static4.anInt123 = -1;
		Static4.anInt123 = -1;
		if (arg0 == 37) {
			Static165.aDouble10 = 3.0D;
		} else if (arg0 == 50) {
			Static165.aDouble10 = 4.0D;
		} else if (arg0 == 75) {
			Static165.aDouble10 = 6.0D;
		} else {
			Static165.aDouble10 = 8.0D;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!og;B)V")
	public static void method2218(@OriginalArg(0) Class5_Sub2 arg0) {
		if (anInt2808 == arg0.anInt1867 || arg0.anInt1873 == -1 || arg0.anInt1831 != 0 || arg0.anInt1835 + 1 > Static187.method3447(arg0.anInt1873).anIntArray77[arg0.anInt1848]) {
			@Pc(43) int local43 = arg0.anInt1867 - arg0.anInt1871;
			@Pc(54) int local54 = arg0.anInt1828 * 128 + arg0.anInt1832 * 64;
			@Pc(60) int local60 = anInt2808 - arg0.anInt1871;
			@Pc(71) int local71 = arg0.anInt1868 * 128 + arg0.anInt1832 * 64;
			@Pc(81) int local81 = arg0.anInt1832 * 64 + arg0.anInt1860 * 128;
			arg0.anInt1827 = (local81 * local60 + (local43 - local60) * local71) / local43;
			@Pc(105) int local105 = arg0.anInt1832 * 64 + arg0.anInt1837 * 128;
			arg0.anInt1849 = (local105 * local60 + local54 * (local43 - local60)) / local43;
		}
		if (arg0.anInt1839 == 0) {
			arg0.anInt1852 = 1024;
		}
		if (arg0.anInt1839 == 1) {
			arg0.anInt1852 = 1536;
		}
		arg0.anInt1833 = 0;
		if (arg0.anInt1839 == 2) {
			arg0.anInt1852 = 0;
		}
		if (arg0.anInt1839 == 3) {
			arg0.anInt1852 = 512;
		}
		arg0.anInt1853 = arg0.anInt1852;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lclient!vd;")
	public static Class106 method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class106 local14 = local7.aClass106_1;
			local7.aClass106_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)[Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1[] method2221() {
		@Pc(4) Class2_Sub3_Sub8_Sub1[] local4 = new Class2_Sub3_Sub8_Sub1[Static113.anInt2492];
		for (@Pc(10) int local10 = 0; local10 < Static113.anInt2492; local10++) {
			@Pc(16) byte[] local16 = Static31.aByteArrayArray3[local10];
			@Pc(24) int local24 = Static113.anIntArray423[local10] * Static131.anIntArray489[local10];
			@Pc(27) int[] local27 = new int[local24];
			for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
				local27[local29] = Static198.anIntArray725[local16[local29] & 0xFF];
			}
			local4[local10] = new Class2_Sub3_Sub8_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local10], Static37.anIntArray108[local10], Static113.anIntArray423[local10], Static131.anIntArray489[local10], local27);
		}
		Static28.method365();
		return local4;
	}
}
