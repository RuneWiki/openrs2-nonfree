import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
	public static int anInt2732;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_815 = Static181.method2795("Login limit exceeded)3");

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_812 = aClass83_815;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_813 = Static181.method2795("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!dg;IIIIII)V")
	public static void method2081(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) long local5 = 0L;
		if (arg4 == 0) {
			local5 = Static213.method3230(arg3, arg2, arg5);
		}
		if (arg4 == 1) {
			local5 = Static58.method1122(arg3, arg2, arg5);
		}
		if (arg4 == 2) {
			local5 = Static175.method2694(arg3, arg2, arg5);
		}
		if (arg4 == 3) {
			local5 = Static93.method1604(arg3, arg2, arg5);
		}
		if (local5 == 0L) {
			return;
		}
		@Pc(63) int local63 = (int) local5 >> 14 & 0x1F;
		@Pc(70) int local70 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
		@Pc(77) int local77 = (int) local5 >> 20 & 0x3;
		@Pc(81) Class2_Sub2_Sub20 local81 = Static99.method1689(local70);
		if (arg4 == 0) {
			Static96.method1643(arg3, arg2, arg5);
			if (local81.anInt2671 != 0) {
				arg0.method724(arg2, local77, local63, local81.aBoolean134, arg5);
			}
		}
		if (arg4 == 1) {
			Static3.method61(arg3, arg2, arg5);
		}
		if (arg4 == 2) {
			Static101.method1743(arg3, arg2, arg5);
			if (local81.anInt2671 != 0 && local81.anInt2670 + arg2 < 104 && arg5 + local81.anInt2670 < 104 && arg2 + local81.anInt2665 < 104 && local81.anInt2665 + arg5 < 104) {
				arg0.method735(local81.anInt2665, arg2, arg5, local81.aBoolean134, local81.anInt2670, local77);
			}
		}
		if (arg4 != 3) {
			return;
		}
		Static64.method1211(arg3, arg2, arg5);
		if (local81.anInt2671 == 1) {
			arg0.method732(arg5, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
	public static int method2082(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2083(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3(arg0);
		@Pc(17) int local17 = local9.method260();
		@Pc(21) int local21 = local9.method248();
		if (local21 < 0 || Static181.anInt3677 != 0 && Static181.anInt3677 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(89) byte[] local89 = new byte[local21];
			local9.method271(local21, local89);
			return local89;
		} else {
			@Pc(44) int local44 = local9.method248();
			if (local44 < 0 || Static181.anInt3677 != 0 && Static181.anInt3677 < local44) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local44];
			if (local17 == 1) {
				Static122.method2090(local65, local44, arg0, local21);
			} else {
				Static138.aClass31_1.method1047(local65, local9);
			}
			return local65;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ae;IIIBLclient!nb;I)V")
	public static void method2084(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub2_Sub17 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static124.anInt2528 + Static210.anInt4184 & 0x7FF;
		@Pc(20) int local20 = arg5 * arg5 + arg1 * arg1;
		@Pc(37) int local37 = Math.max(arg0.anInt157 / 2, arg0.anInt100 / 2) + 10;
		if (local37 * local37 < local20) {
			return;
		}
		@Pc(51) int local51 = Class16.anIntArray44[local12];
		@Pc(59) int local59 = local51 * 256 / (Static59.anInt1449 + 256);
		@Pc(63) int local63 = Class16.anIntArray39[local12];
		@Pc(71) int local71 = local63 * 256 / (Static59.anInt1449 + 256);
		@Pc(82) int local82 = arg1 * local71 - arg5 * local59 >> 16;
		@Pc(92) int local92 = local71 * arg5 + local59 * arg1 >> 16;
		((Class2_Sub2_Sub17_Sub1) arg4).method1929(arg2 + arg0.anInt157 / 2 + local92 - arg4.anInt2525 / 2, -local82 + arg0.anInt100 / 2 + (arg3 - arg4.anInt2519 / 2), arg0.anIntArray16, arg0.anIntArray6);
	}
}
