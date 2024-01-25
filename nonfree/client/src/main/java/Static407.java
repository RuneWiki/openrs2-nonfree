import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "[I")
	public static int[] anIntArray569 = new int[1];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)V")
	public static void method5933(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg0, 10);
		local8.method770();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
	public static void method5937() {
		for (@Pc(8) int local8 = 0; local8 < Static82.aClass171ArrayArray1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static82.aClass171ArrayArray1[local8].length; local12++) {
				Static82.aClass171ArrayArray1[local8][local12] = Static295.aClass171_2;
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)Z")
	public static boolean method5938(@OriginalArg(0) int arg0) {
		Static138.anInt2445 = arg0 + 1 & 0xFFFF;
		Static136.aBoolean168 = true;
		return true;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)Z")
	public static boolean method5945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static98.method1512(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static188.anInt3275;
			@Pc(14) int local14 = arg2 << Static188.anInt3275;
			return Static236.method3450(local10 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static236.method3450(local10 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static236.method3450(local10 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static57.anInt953 - 1) && Static236.method3450(local10 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static57.anInt953 - 1);
		} else {
			return false;
		}
	}
}
