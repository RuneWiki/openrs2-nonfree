import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
	public static int anInt6570;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "[I")
	public static final int[] anIntArray371 = new int[3];

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "[I")
	public static final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIII)V")
	public static void method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static384.anInt6641 && Static191.anInt4134 >= arg2 && arg0 >= Static112.anInt2687 && arg4 <= Static333.anInt6022) {
			Static42.method1091(arg2, arg0, arg4, arg3, arg1);
		} else {
			Static480.method6557(arg1, arg0, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
	public static void method5295() {
		if (Static338.aClass106_24 != null) {
			Static372.aClass163_1 = new Class163();
			Static372.aClass163_1.method4032(Static338.aClass106_24.anInt3505, Static338.aClass106_24, Static57.aLong23, Static338.aClass106_24.aClass350_2.method7730(Static201.anInt4321));
			Static431.aThread5 = new Thread(Static372.aClass163_1, "");
			Static431.aThread5.start();
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(JIII)V")
	public static void method5296(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static546.method7486(arg1, 0, arg2, 0, local22, local10, 0, true);
			return;
		}
		@Pc(59) Class194 local59 = Static536.aClass146_4.method3721(local29);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local22 == 0 || local22 == 2) {
			local70 = local59.anInt5830;
			local73 = local59.anInt5845;
		} else {
			local70 = local59.anInt5845;
			local73 = local59.anInt5830;
		}
		@Pc(84) int local84 = local59.anInt5825;
		if (local22 != 0) {
			local84 = (local84 << local22 & 0xF) + (local84 >> 4 - local22);
		}
		Static546.method7486(arg1, local70, arg2, local73, 0, 0, local84, true);
	}
}
