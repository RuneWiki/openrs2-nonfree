import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!kh;")
	public static Class60 aClass60_439 = Static200.method3116("Fertigkeit)2");

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "[S")
	public static short[] aShortArray16 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Lclient!kh;")
	private static Class60 aClass60_440 = Static200.method3116("Loaded textures");

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Lclient!kh;")
	public static Class60 aClass60_441 = aClass60_440;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "Lclient!kh;")
	public static Class60 aClass60_442 = Static200.method3116("auf der Hautpseite)3");

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_443 = Static200.method3116("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILclient!dd;IJZ)Z")
	public static boolean method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static152.method2597(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)Lclient!mi;")
	public static Class1_Sub1_Sub15 method1051(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub15 local10 = (Class1_Sub1_Sub15) Static190.aClass39_22.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static24.aClass7_5.method3242(Static107.method1858(arg0), Static47.method807(arg0));
		local10 = new Class1_Sub1_Sub15();
		if (local24 != null) {
			local10.method2124(new Class1_Sub9(local24));
		}
		Static190.aClass39_22.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	public static void method1052() {
		Static45.aClass39_7.method1158();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	public static int method1053(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local30 < local14) {
			local32 = local30;
		}
		@Pc(40) double local40 = 0.0D;
		@Pc(42) double local42 = local14;
		if (local32 > local21) {
			local32 = local21;
		}
		if (local30 > local14) {
			local42 = local30;
		}
		@Pc(56) double local56 = 0.0D;
		if (local21 > local42) {
			local42 = local21;
		}
		@Pc(76) double local76 = (local42 + local32) / 2.0D;
		if (local42 != local32) {
			if (local76 < 0.5D) {
				local56 = (local42 - local32) / (local42 + local32);
			}
			if (local76 >= 0.5D) {
				local56 = (local42 - local32) / (2.0D - local42 - local32);
			}
			if (local14 == local42) {
				local40 = (local30 - local21) / (-local32 + local42);
			} else if (local30 == local42) {
				local40 = (local21 - local14) / (-local32 + local42) + 2.0D;
			} else if (local42 == local21) {
				local40 = (local14 - local30) / (-local32 + local42) + 4.0D;
			}
		}
		@Pc(163) int local163 = (int) (local56 * 256.0D);
		local40 /= 6.0D;
		@Pc(172) int local172 = (int) (local40 * 256.0D);
		@Pc(177) int local177 = (int) (local76 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local177 > 243) {
			local163 >>= 0x4;
		} else if (local177 > 217) {
			local163 >>= 0x3;
		} else if (local177 > 192) {
			local163 >>= 0x2;
		} else if (local177 > 179) {
			local163 >>= 0x1;
		}
		return (local163 >> 5 << 7) + (local172 >> 2 << 10) + (local177 >> 1);
	}
}
