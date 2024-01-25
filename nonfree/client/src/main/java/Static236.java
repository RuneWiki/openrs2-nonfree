import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public static void method3586() {
		if (Static34.aBoolean56) {
			return;
		}
		if (Static399.aClass167_Sub1_1.aBoolean480) {
			Static328.aFloat179 = (int) Static328.aFloat179 + 47 & 0xFFFFFFF0;
		} else {
			Static317.aFloat171 += (12.0F - Static317.aFloat171) / 2.0F;
		}
		Static34.aBoolean56 = true;
		Static18.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
	public static void method3587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg2, 9);
		local12.method434();
		local12.anInt656 = arg0;
		local12.anInt657 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public static void method3588() {
		Static256.aClass59_1.method4363();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static348.aLongArray7[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static130.aLongArray2[local22] = 0L;
		}
		Static351.anInt6168 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!qa;ILclient!us;I)V")
	public static void method3589(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class250 arg3, @OriginalArg(5) int arg4) {
		@Pc(17) Class99 local17 = Static325.aClass221_4.method5014(arg3.anInt7168);
		if (local17.anInt2694 == -1) {
			return;
		}
		if (arg3.aBoolean607) {
			@Pc(35) int local35 = arg4 + arg3.anInt7144;
			arg4 = local35 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(47) Class76 local47 = local17.method2011(arg3.aBoolean614, arg1, arg4);
		if (local47 == null) {
			return;
		}
		@Pc(53) int local53 = arg3.anInt7185;
		@Pc(56) int local56 = arg3.anInt7150;
		if ((arg4 & 0x1) == 1) {
			local53 = arg3.anInt7150;
			local56 = arg3.anInt7185;
		}
		@Pc(72) int local72 = local47.ja();
		@Pc(75) int local75 = local47.JA();
		if (local17.aBoolean239) {
			local75 = local56 * 4;
			local72 = local53 * 4;
		}
		if (local17.anInt2699 == 0) {
			local47.method6093(arg2, arg0 - (local56 - 1) * 4, local72, local75);
		} else {
			local47.M(arg2, arg0 - (local56 - 1) * 4, local72, local75, 0, local17.anInt2699 | 0xFF000000, 1);
		}
	}
}
