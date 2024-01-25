import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "[I")
	public static int[] anIntArray647;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	public static int anInt5738 = 0;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString264 = null;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Z")
	public static final boolean aBoolean387 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Lclient!ec;B)I")
	public static int method5206(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub10 arg1) {
		@Pc(6) int local6 = arg1.anInt4188;
		@Pc(15) byte[] local15 = Static178.method3317(arg0);
		arg1.method3983(local15.length);
		arg1.anInt4188 += Static310.aClass190_1.method5112(local15, local15.length, 0, arg1.anInt4188, arg1.aByteArray67);
		return arg1.anInt4188 - local6;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static90.anIntArrayArrayArray2[arg0][local16][local20] == -Static318.anInt5896) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static203.aClass106Array3[arg0].method5720(arg1, arg3) + arg5;
			if (!Static151.method3070(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static151.method3070(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static151.method3070(local20, local151, local177)) {
				return false;
			} else if (Static151.method3070(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static198.method3634(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static151.method3070(local16 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg3) + arg5, local20 + 1) && Static151.method3070(local16 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg3) + arg5, local20 + 1) && Static151.method3070(local16 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static151.method3070(local16 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!bc;IZI)V")
	public static void method5208(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static139.aClass14ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	public static void method5210() {
		Static98.aClass10_1.method3298();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static283.aLongArray8[local10] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static110.aLongArray2[local26] = 0L;
		}
		Static253.anInt4716 = 0;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)[Lclient!t;")
	public static Class189[] method5211() {
		if (Static142.aClass189Array1 == null) {
			@Pc(12) Class189[] local12 = Static279.method4822(Static308.aClass206_5);
			@Pc(16) Class189[] local16 = new Class189[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(70) int local70;
			@Pc(76) Class189 local76;
			label63: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(26) Class189 local26 = local12[local20];
				if ((local26.anInt5583 <= 0 || local26.anInt5583 >= 24) && local26.anInt5577 >= 800 && local26.anInt5580 >= 600 && (Static183.anInt3439 >= 96 || Static13.anInt232 != 0 || local26.anInt5577 <= 1024 && local26.anInt5580 <= 768)) {
					for (local70 = 0; local70 < local18; local70++) {
						local76 = local16[local70];
						if (local76.anInt5577 == local26.anInt5577 && local26.anInt5580 == local76.anInt5580) {
							if (local76.anInt5583 < local26.anInt5583) {
								local16[local70] = local26;
							}
							continue label63;
						}
					}
					local16[local18] = local26;
					local18++;
				}
			}
			Static142.aClass189Array1 = new Class189[local18];
			Static358.method952(local16, 0, Static142.aClass189Array1, 0, local18);
			@Pc(140) int[] local140 = new int[Static142.aClass189Array1.length];
			for (local70 = 0; local70 < Static142.aClass189Array1.length; local70++) {
				local76 = Static142.aClass189Array1[local70];
				local140[local70] = local76.anInt5577 * local76.anInt5580;
			}
			Static190.method3565(local140, Static142.aClass189Array1);
		}
		return Static142.aClass189Array1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZILclient!ja;IZILclient!pi;)V")
	public static void method5212(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5) {
		if (arg3) {
			Static172.aClass40_10.method5077((Static209.anInt3815 - Static172.aClass40_10.method5083()) / 2, (Static94.anInt1731 - Static172.aClass40_10.method5084()) / 2);
			Static2.aClass40_1.method5077((Static209.anInt3815 - Static2.aClass40_1.method5083()) / 2, 18);
		}
		arg5.method5333(arg4, Static209.anInt3815 / 2, Static105.anInt1941 == 1 ? Static312.aString269 : Static334.aString295, -1, Static94.anInt1731 / 2 - 26);
		@Pc(59) int local59 = Static94.anInt1731 / 2 - 18;
		arg1.method2992(Static209.anInt3815 / 2 - 152, local59, 304, 34, arg0, 0);
		arg1.method2992(Static209.anInt3815 / 2 - 151, local59 + 1, 302, 32, 0, 0);
		arg1.method2962(Static209.anInt3815 / 2 - 150, local59 + 2, Static161.anInt3047 * 3, 30, arg2, 0);
		arg1.method2962(Static209.anInt3815 / 2 + Static161.anInt3047 * 3 - 150, local59 + 2, 300 - Static161.anInt3047 * 3, 30, 0, 0);
		arg5.method5333(arg4, Static209.anInt3815 / 2, Static143.aString122, -1, Static94.anInt1731 / 2 + 4);
	}
}
