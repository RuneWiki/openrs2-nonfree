import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString199 = "yellow:";

	@OriginalMember(owner = "client!o", name = "i", descriptor = "[J")
	public static long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt5752 = 0;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[8];

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public static int anInt5754 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 >= Static173.anInt3481 && arg3 <= Static121.anInt2460 && Static173.anInt3481 <= arg2 && arg2 <= Static121.anInt2460 && Static173.anInt3481 <= arg6 && arg6 <= Static121.anInt2460 && arg7 >= Static173.anInt3481 && Static121.anInt2460 >= arg7 && Static293.anInt5688 <= arg1 && Static100.anInt1982 >= arg1 && Static293.anInt5688 <= arg8 && arg8 <= Static100.anInt1982 && arg4 >= Static293.anInt5688 && arg4 <= Static100.anInt1982 && arg0 >= Static293.anInt5688 && Static100.anInt1982 >= arg0) {
			Static88.method1489(arg6, arg4, arg1, arg2, arg0, arg7, arg8, arg5, arg3);
		} else {
			Static181.method4701(arg7, arg6, arg2, arg1, arg3, arg8, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([II[I[ILclient!u;)V")
	public static void method4643(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class13_Sub5_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(15) int local15 = arg0[local3];
			@Pc(19) int local19 = arg1[local3];
			@Pc(23) int local23 = arg2[local3];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg3.aClass170Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg3.aClass170Array3[local25] = null;
					} else {
						@Pc(56) Class186 local56 = Static51.method992(local15);
						@Pc(59) int local59 = local56.anInt5814;
						@Pc(64) Class170 local64 = arg3.aClass170Array3[local25];
						if (local64 != null) {
							if (local64.anInt5446 == local15) {
								if (local59 == 0) {
									local64 = arg3.aClass170Array3[local25] = null;
								} else if (local59 == 1) {
									local64.anInt5445 = 0;
									local64.anInt5442 = local23;
									local64.anInt5443 = 0;
									local64.anInt5448 = 0;
									local64.anInt5447 = 1;
									Static229.method3598(false, arg3.anInt5294, local56, arg3.anInt5334, 0);
								} else if (local59 == 2) {
									local64.anInt5448 = 0;
								}
							} else if (local56.anInt5807 >= Static51.method992(local64.anInt5446).anInt5807) {
								local64 = arg3.aClass170Array3[local25] = null;
							}
						}
						if (local64 == null) {
							local64 = arg3.aClass170Array3[local25] = new Class170();
							local64.anInt5446 = local15;
							local64.anInt5447 = 1;
							local64.anInt5448 = 0;
							local64.anInt5442 = local23;
							local64.anInt5443 = 0;
							local64.anInt5445 = 0;
							Static229.method3598(false, arg3.anInt5294, local56, arg3.anInt5334, 0);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!uk;IIIII)V")
	public static void method4644(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static139.anInt2755) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static246.anInt4853) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static64.anInt1393 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class4_Sub21 local71 = Static261.aClass4_Sub21ArrayArrayArray4[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static154.anIntArrayArrayArray5[local17][local28][local39] + Static154.anIntArrayArrayArray5[local17][local28 + 1][local39] + Static154.anIntArrayArrayArray5[local17][local28][local39 + 1] + Static154.anIntArrayArrayArray5[local17][local28 + 1][local39 + 1]) / 4 - (Static154.anIntArrayArrayArray5[arg1][arg2][arg3] + Static154.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + Static154.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + Static154.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class181 local161 = local71.aClass181_1;
									if (local161 != null) {
										if (local161.aClass13_9.method4264()) {
											arg0.method4261(local161.aClass13_9, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass13_10 != null && local161.aClass13_10.method4264()) {
											arg0.method4261(local161.aClass13_10, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt2694; local232++) {
										@Pc(241) Class99 local241 = local71.aClass99Array19[local232];
										if (local241 != null && local241.aClass13_4.method4264() && (local28 == local241.anInt3225 || local28 == local3) && (local39 == local241.anInt3222 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt3223 + 1 - local241.anInt3225;
											@Pc(278) int local278 = local241.anInt3221 + 1 - local241.anInt3222;
											arg0.method4261(local241.aClass13_4, (local241.anInt3225 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt3222 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
