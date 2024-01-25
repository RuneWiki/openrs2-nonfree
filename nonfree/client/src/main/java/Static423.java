import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public static int anInt7531;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "J")
	public static long aLong224;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)[Lclient!ep;")
	public static Class103[] method6422() {
		return new Class103[] { Static58.aClass103_1, Static359.aClass103_4, Static196.aClass103_2 };
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5) {
		Static272.method3804(arg2, arg5, arg4, arg3, arg0, -1, arg1, (String) null);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method6424() {
		Static226.method3207();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
	public static void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static380.anInt6585 < arg4 || arg2 < Static128.anInt2200) {
			return;
		}
		@Pc(25) boolean local25;
		if (arg1 < Static361.anInt6317) {
			local25 = false;
			arg1 = Static361.anInt6317;
		} else if (Static651.anInt10267 < arg1) {
			local25 = false;
			arg1 = Static651.anInt10267;
		} else {
			local25 = true;
		}
		@Pc(47) boolean local47;
		if (arg3 < Static361.anInt6317) {
			local47 = false;
			arg3 = Static361.anInt6317;
		} else if (arg3 <= Static651.anInt10267) {
			local47 = true;
		} else {
			arg3 = Static651.anInt10267;
			local47 = false;
		}
		if (arg4 < Static128.anInt2200) {
			arg4 = Static128.anInt2200;
		} else {
			Static343.method5202(arg1, Static286.anIntArrayArray42[arg4++], arg0, arg3);
		}
		if (Static380.anInt6585 >= arg2) {
			Static343.method5202(arg1, Static286.anIntArrayArray42[arg2--], arg0, arg3);
		} else {
			arg2 = Static380.anInt6585;
		}
		@Pc(97) int local97;
		if (local25 && local47) {
			for (local97 = arg4; local97 <= arg2; local97++) {
				@Pc(102) int[] local102 = Static286.anIntArrayArray42[local97];
				local102[arg1] = local102[arg3] = arg0;
			}
		} else if (local25) {
			for (local97 = arg4; local97 <= arg2; local97++) {
				Static286.anIntArrayArray42[local97][arg1] = arg0;
			}
		} else if (local47) {
			for (local97 = arg4; local97 <= arg2; local97++) {
				Static286.anIntArrayArray42[local97][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I")
	public static int method6426(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
