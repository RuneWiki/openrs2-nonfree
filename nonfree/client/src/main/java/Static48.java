import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[Lclient!hj;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!rg;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1156 = 0;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_345 = Static64.method1101("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method832(@OriginalArg(1) int arg0) {
		Static41.anInt977 = -1;
		Static150.anInt3286 = arg0;
		Static41.anInt977 = -1;
		Static220.method3635();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg7 && arg1 == arg0 && arg3 == arg5 && arg4 == arg8) {
			Static103.method3803(arg8, arg7, arg1, arg6, arg5);
			return;
		}
		@Pc(31) int local31 = arg1;
		@Pc(33) int local33 = arg7;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(66) int local66 = local37 + arg5 - local45 - arg7;
		@Pc(76) int local76 = arg8 + local53 - arg1 - local57;
		@Pc(86) int local86 = local49 + local45 - local37 - local37;
		@Pc(96) int local96 = local57 + local41 - local53 - local53;
		@Pc(101) int local101 = local37 - local49;
		@Pc(106) int local106 = local53 - local41;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local122 * local76;
			@Pc(130) int local130 = local66 * local122;
			@Pc(134) int local134 = local116 * local86;
			@Pc(138) int local138 = local96 * local116;
			@Pc(142) int local142 = local108 * local101;
			@Pc(146) int local146 = local106 * local108;
			@Pc(157) int local157 = arg7 + (local142 + local130 + local134 >> 12);
			@Pc(168) int local168 = (local146 + local126 + local138 >> 12) + arg1;
			Static103.method3803(local168, local33, local31, arg6, local157);
			local33 = local157;
			local31 = local168;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method834(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static158.anInt3442 > 0) {
			local19 = Static169.aByteArrayArray11[--Static158.anInt3442];
			Static169.aByteArrayArray11[Static158.anInt3442] = null;
			return local19;
		} else if (arg0 == 5000 && Static45.anInt1101 > 0) {
			local19 = Static57.aByteArrayArray3[--Static45.anInt1101];
			Static57.aByteArrayArray3[Static45.anInt1101] = null;
			return local19;
		} else if (arg0 == 30000 && Static164.anInt3643 > 0) {
			local19 = Static135.aByteArrayArray8[--Static164.anInt3643];
			Static135.aByteArrayArray8[Static164.anInt3643] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
