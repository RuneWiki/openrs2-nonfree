import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public static int anInt8762;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Lclient!hba;")
	public static Class115 aClass115_9;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
	public static int[] anIntArray448 = new int[1];

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_47 = new Class94(64);

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	public static int anInt8764 = -1;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIII)V")
	public static void method7276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static389.anInt7300 < arg2 || arg0 < Static633.anInt10644) {
			return;
		}
		@Pc(20) boolean local20;
		if (Static309.anInt6227 > arg1) {
			local20 = false;
			arg1 = Static309.anInt6227;
		} else if (Static7.anInt464 >= arg1) {
			local20 = true;
		} else {
			arg1 = Static7.anInt464;
			local20 = false;
		}
		@Pc(40) boolean local40;
		if (arg3 < Static309.anInt6227) {
			local40 = false;
			arg3 = Static309.anInt6227;
		} else if (arg3 <= Static7.anInt464) {
			local40 = true;
		} else {
			arg3 = Static7.anInt464;
			local40 = false;
		}
		if (arg2 < Static633.anInt10644) {
			arg2 = Static633.anInt10644;
		} else {
			Static571.method7990(arg4, Static173.anIntArrayArray15[arg2++], arg1, arg3);
		}
		if (arg0 > Static389.anInt7300) {
			arg0 = Static389.anInt7300;
		} else {
			Static571.method7990(arg4, Static173.anIntArrayArray15[arg0--], arg1, arg3);
		}
		@Pc(97) int local97;
		if (local20 && local40) {
			for (local97 = arg2; local97 <= arg0; local97++) {
				@Pc(103) int[] local103 = Static173.anIntArrayArray15[local97];
				local103[arg1] = local103[arg3] = arg4;
			}
		} else if (local20) {
			for (local97 = arg2; local97 <= arg0; local97++) {
				Static173.anIntArrayArray15[local97][arg1] = arg4;
			}
		} else if (local40) {
			for (local97 = arg2; local97 <= arg0; local97++) {
				Static173.anIntArrayArray15[local97][arg3] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public static void method7277() {
		if (Static96.anInt2771 < 0) {
			return;
		}
		@Pc(7) long local7 = Static582.method8056();
		Static96.anInt2771 = (int) ((long) Static96.anInt2771 + Static207.aLong128 - local7);
		if (Static96.anInt2771 <= 0) {
			Static99.anInt2817 = Static1.aClass40_6.anInt1880;
			Static299.aFloat127 = Static1.aClass40_6.aFloat60;
			Static384.aFloat141 = Static1.aClass40_6.aFloat62;
			Static465.anInt8296 = Static1.aClass40_6.anInt1876;
			Static273.aFloat124 = Static1.aClass40_6.aFloat61;
			Static96.anInt2771 = -1;
			Static539.anInt9345 = Static1.aClass40_6.anInt1879;
			Static95.aFloat69 = Static1.aClass40_6.aFloat64;
			Static70.aClass31_2 = Static1.aClass40_6.aClass31_1;
			Static461.aFloat161 = Static1.aClass40_6.aFloat65;
			Static173.aFloat75 = Static1.aClass40_6.aFloat63;
		} else {
			@Pc(58) int local58 = (Static96.anInt2771 << 8) / Static502.anInt7209;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			@Pc(72) float local72 = 1.0F - local68;
			Static99.anInt2817 = (local58 * (Static56.anInt1870 & 0xFF00) + local63 * (Static1.aClass40_6.anInt1880 & 0xFF00) & 0xFF0000) + (local63 * (Static1.aClass40_6.anInt1880 & 0xFF00FF) + (Static56.anInt1870 & 0xFF00FF) * local58 & 0xFF00FF00) >>> 8;
			Static95.aFloat69 = local72 * (Static1.aClass40_6.aFloat64 - Static631.aFloat189) + Static631.aFloat189;
			Static384.aFloat141 = Static7.aFloat22 + local72 * (Static1.aClass40_6.aFloat62 - Static7.aFloat22);
			Static173.aFloat75 = Static298.aFloat126 + local72 * (Static1.aClass40_6.aFloat63 - Static298.aFloat126);
			Static461.aFloat161 = (Static1.aClass40_6.aFloat65 - Static589.aFloat183) * local72 + Static589.aFloat183;
			Static299.aFloat127 = (Static1.aClass40_6.aFloat60 - Static260.aFloat123) * local72 + Static260.aFloat123;
			Static539.anInt9345 = (local58 * (Static302.anInt6140 & 0xFF00) + local63 * (Static1.aClass40_6.anInt1879 & 0xFF00) & 0xFF0000) + ((Static302.anInt6140 & 0xFF00FF) * local58 + (Static1.aClass40_6.anInt1879 & 0xFF00FF) * local63 & 0xFF00FF00) >>> 8;
			Static465.anInt8296 = local58 * Static139.anInt3315 + Static1.aClass40_6.anInt1876 * local63 >> 8;
			Static273.aFloat124 = Static415.aFloat155 + (Static1.aClass40_6.aFloat61 - Static415.aFloat155) * local72;
			if (Static1.aClass40_6.aClass31_1 != Static272.aClass31_3) {
				Static70.aClass31_2 = Static443.aClass5_12.method6132(Static272.aClass31_3, Static1.aClass40_6.aClass31_1, local72, Static70.aClass31_2);
			}
		}
		Static207.aLong128 = local7;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)I")
	public static int method7278() {
		return Static272.aClass61_1.method2367();
	}
}
