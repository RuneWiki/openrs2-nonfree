import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "Lclient!f;")
	public static Class13 aClass13_9;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_644 = Static122.method531(")1j");

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_645 = Static122.method531("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_646 = Static122.method531("rot:");

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "[S")
	public static short[] aShortArray2 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Lclient!sd;")
	public static Class73 aClass73_647 = Static122.method531("Mem:");

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "Lclient!sd;")
	public static Class73 aClass73_648 = Static122.method531("mapscene");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static119.aClass35_1.method1149(arg2, arg1, arg4);
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (local11 != 0) {
			local20 = Static119.aClass35_1.method1130(arg2, arg1, arg4, local11);
			local26 = local20 >> 6 & 0x3;
			local30 = local20 & 0x1F;
			local32 = arg0;
			if (local11 > 0) {
				local32 = arg3;
			}
			@Pc(42) int[] local42 = Static8.aClass3_Sub1_Sub3_Sub4_3.anIntArray336;
			local57 = (52736 - arg4 * 512) * 4 + arg1 * 4 + 24624;
			local63 = local11 >> 14 & 0x7FFF;
			@Pc(67) Class3_Sub1_Sub15 local67 = Static151.method2466(local63);
			if (local67.anInt3015 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						local42[local57] = local32;
						local42[local57 + 512] = local32;
						local42[local57 + 1024] = local32;
						local42[local57 + 1536] = local32;
					} else if (local26 == 1) {
						local42[local57] = local32;
						local42[local57 + 1] = local32;
						local42[local57 + 2] = local32;
						local42[local57 + 3] = local32;
					} else if (local26 == 2) {
						local42[local57 + 3] = local32;
						local42[local57 + 512 + 3] = local32;
						local42[local57 + 1027] = local32;
						local42[local57 + 1539] = local32;
					} else if (local26 == 3) {
						local42[local57 + 1536] = local32;
						local42[local57 + 1 + 1536] = local32;
						local42[local57 + 2 + 1536] = local32;
						local42[local57 + 1536 + 3] = local32;
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						local42[local57] = local32;
					} else if (local26 == 1) {
						local42[local57 + 3] = local32;
					} else if (local26 == 2) {
						local42[local57 + 3 + 1536] = local32;
					} else if (local26 == 3) {
						local42[local57 + 1536] = local32;
					}
				}
				if (local30 == 2) {
					if (local26 == 3) {
						local42[local57] = local32;
						local42[local57 + 512] = local32;
						local42[local57 + 1024] = local32;
						local42[local57 + 1536] = local32;
					} else if (local26 == 0) {
						local42[local57] = local32;
						local42[local57 + 1] = local32;
						local42[local57 + 2] = local32;
						local42[local57 + 3] = local32;
					} else if (local26 == 1) {
						local42[local57 + 3] = local32;
						local42[local57 + 3 + 512] = local32;
						local42[local57 + 3 + 1024] = local32;
						local42[local57 + 1536 + 3] = local32;
					} else if (local26 == 2) {
						local42[local57 + 1536] = local32;
						local42[local57 + 1 + 1536] = local32;
						local42[local57 + 2 + 1536] = local32;
						local42[local57 + 3 + 1536] = local32;
					}
				}
			} else {
				@Pc(383) Class3_Sub1_Sub3_Sub3 local383 = Static170.aClass3_Sub1_Sub3_Sub3Array44[local67.anInt3015];
				if (local383 != null) {
					@Pc(396) int local396 = (local67.anInt3014 * 4 - local383.anInt1914) / 2;
					@Pc(407) int local407 = (local67.anInt3012 * 4 - local383.anInt1917) / 2;
					local383.method1493(arg1 * 4 + local407 + 48, local396 + (-local67.anInt3014 + -arg4 + 104) * 4 + 48);
				}
			}
		}
		local11 = Static119.aClass35_1.method1174(arg2, arg1, arg4);
		if (local11 != 0) {
			local20 = Static119.aClass35_1.method1130(arg2, arg1, arg4, local11);
			local26 = local20 >> 6 & 0x3;
			local30 = local20 & 0x1F;
			local32 = local11 >> 14 & 0x7FFF;
			@Pc(470) Class3_Sub1_Sub15 local470 = Static151.method2466(local32);
			@Pc(503) int local503;
			if (local470.anInt3015 != -1) {
				@Pc(480) Class3_Sub1_Sub3_Sub3 local480 = Static170.aClass3_Sub1_Sub3_Sub3Array44[local470.anInt3015];
				if (local480 != null) {
					local63 = (local470.anInt3012 * 4 - local480.anInt1917) / 2;
					local503 = (local470.anInt3014 * 4 - local480.anInt1914) / 2;
					local480.method1493(local63 + arg1 * 4 + 48, (-arg4 + 104 - local470.anInt3014) * 4 + 48 + local503);
				}
			} else if (local30 == 9) {
				local57 = 15658734;
				if (local11 > 0) {
					local57 = 15597568;
				}
				local503 = arg1 * 4 + (-(arg4 * 512) + 52736) * 4 + 24624;
				@Pc(558) int[] local558 = Static8.aClass3_Sub1_Sub3_Sub4_3.anIntArray336;
				if (local26 == 0 || local26 == 2) {
					local558[local503 + 1536] = local57;
					local558[local503 + 1 + 1024] = local57;
					local558[local503 + 2 + 512] = local57;
					local558[local503 + 3] = local57;
				} else {
					local558[local503] = local57;
					local558[local503 + 1 + 512] = local57;
					local558[local503 + 1024 + 2] = local57;
					local558[local503 + 3 + 1536] = local57;
				}
			}
		}
		local11 = Static119.aClass35_1.method1154(arg2, arg1, arg4);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(644) Class3_Sub1_Sub15 local644 = Static151.method2466(local20);
		if (local644.anInt3015 == -1) {
			return;
		}
		@Pc(653) Class3_Sub1_Sub3_Sub3 local653 = Static170.aClass3_Sub1_Sub3_Sub3Array44[local644.anInt3015];
		if (local653 != null) {
			local32 = (local644.anInt3012 * 4 - local653.anInt1917) / 2;
			@Pc(676) int local676 = (local644.anInt3014 * 4 - local653.anInt1914) / 2;
			local653.method1493(arg1 * 4 + local32 + 48, local676 + (-arg4 + 104 + -local644.anInt3014) * 4 + 48);
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	public static void method876() {
		aClass73_645 = null;
		aClass73_646 = null;
		aShortArray2 = null;
		aClass73_647 = null;
		aClass73_648 = null;
		aClass73_644 = null;
		aClass13_9 = null;
	}
}
