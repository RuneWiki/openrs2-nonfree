import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rp", name = "cb", descriptor = "I")
	public static int anInt5547;

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "Lclient!cr;")
	public static Class37 aClass37_88 = new Class37(64);

	@OriginalMember(owner = "client!rp", name = "X", descriptor = "Lclient!ps;")
	public static Class163 aClass163_17 = null;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(III)I")
	public static int method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBILclient!ii;ILclient!ls;II)Lclient!cq;")
	public static Class8 method4846(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class136 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static248.aClass19_2.anInt387 = arg5;
		Static248.aClass19_2.anInt392 = arg1;
		Static248.aClass19_2.anInt395 = arg3;
		Static248.aClass19_2.anInt397 = arg6;
		Static248.aClass19_2.aBoolean30 = arg4 != null;
		Static248.aClass19_2.anInt391 = arg0;
		Static248.aClass19_2.anInt394 = arg2.anInt4861;
		return (Class8) Static61.aClass75_1.method1466(Static248.aClass19_2);
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V")
	public static void method4847() {
		for (@Pc(12) int local12 = 0; local12 < Static89.aClass172ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static89.aClass172ArrayArray1[local12].length; local16++) {
				Static89.aClass172ArrayArray1[local12][local16] = Static64.aClass172_1;
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)V")
	public static void method4848() {
		if (Static244.aBoolean511) {
			return;
		}
		Static244.aBoolean511 = true;
		if (Static317.aBoolean521) {
			Static318.aFloat77 = (int) Static318.aFloat77 + 47 & 0xFFFFFFF0;
		} else {
			Static81.aFloat8 += (12.0F - Static81.aFloat8) / 2.0F;
		}
		Static209.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)I")
	public static int method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!va;)V")
	public static void method4851(@OriginalArg(0) Class10_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort94; local2 <= arg0.aShort93; local2++) {
			for (@Pc(6) int local6 = arg0.aShort91; local6 <= arg0.aShort92; local6++) {
				@Pc(16) Class83 local16 = Static347.aClass83ArrayArrayArray3[arg0.aByte73][local2][local6];
				if (local16 != null) {
					@Pc(21) Class59 local21 = local16.aClass59_2;
					@Pc(23) Class59 local23 = null;
					while (local21 != null) {
						if (local21.aClass10_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass59_2 = local21.aClass59_1;
							} else {
								local23.aClass59_1 = local21.aClass59_1;
							}
							local21.method1257();
							break;
						}
						local23 = local21;
						local21 = local21.aClass59_1;
					}
					local16.aByte32 = 0;
					for (@Pc(56) Class59 local56 = local16.aClass59_2; local56 != null; local56 = local56.aClass59_1) {
						local16.aByte32 = (byte) (local16.aByte32 | local56.anInt1496);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "(I)V")
	public static void method4852() {
		for (@Pc(6) Class1_Sub12 local6 = (Class1_Sub12) Static58.aClass14_4.method302(); local6 != null; local6 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			if (Static286.method5009(local6.anInt1409)) {
				Static311.method5341(local6);
			}
		}
		if (Static61.anInt1413 == 1) {
			Static308.aBoolean499 = false;
			Static177.method3159(Static298.anInt6013, Static145.anInt3038, Static148.anInt3051, Static228.anInt4754);
			return;
		}
		Static177.method3159(Static298.anInt6013, Static145.anInt3038, Static148.anInt3051, Static228.anInt4754);
		@Pc(51) int local51 = Static81.aClass34_4.method796(Static148.aString111);
		for (@Pc(56) Class1_Sub12 local56 = (Class1_Sub12) Static58.aClass14_4.method302(); local56 != null; local56 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			@Pc(62) int local62 = Static250.method4493(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static145.anInt3038 = (Static345.aBoolean548 ? 26 : 22) + Static61.anInt1413 * 16;
		Static228.anInt4754 = local51 + 8;
	}
}
