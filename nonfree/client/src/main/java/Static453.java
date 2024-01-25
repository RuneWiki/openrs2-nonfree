import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public static int anInt1589;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
	private static int anInt1626;

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
	private static int anInt1627;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "Z")
	private static boolean aBoolean99;

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
	private static int anInt1628;

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
	private static int anInt1629;

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
	private static int anInt1630;

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
	private static int anInt1631;

	@OriginalMember(owner = "client!pj", name = "bb", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!pj", name = "cb", descriptor = "Z")
	private static boolean aBoolean103;

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "Z")
	private static boolean aBoolean104;

	@OriginalMember(owner = "client!pj", name = "eb", descriptor = "Z")
	private static boolean aBoolean105;

	@OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
	private static int anInt1632;

	@OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
	private static int anInt1633;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
	public static final int[] anIntArray89 = new int[1];

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	public static int anInt1620 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([ILclient!ib;[I[IZ)V")
	public static void method1426(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) int local21 = arg0[local15];
			@Pc(25) int local25 = arg2[local15];
			@Pc(29) int local29 = arg3[local15];
			for (@Pc(31) int local31 = 0; local25 != 0 && arg1.aClass245Array3.length > local31; local31++) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg1.aClass245Array3[local31] = null;
					} else {
						@Pc(53) Class119 local53 = Static334.aClass268_2.method6469(local21);
						@Pc(56) int local56 = local53.anInt3012;
						@Pc(61) Class245 local61 = arg1.aClass245Array3[local31];
						if (local61 != null) {
							if (local61.anInt6821 == local21) {
								if (local56 == 0) {
									local61 = arg1.aClass245Array3[local31] = null;
								} else if (local56 == 1) {
									local61.anInt6824 = 1;
									local61.anInt6825 = 0;
									local61.anInt6823 = local29;
									local61.anInt6819 = 0;
									local61.anInt6818 = 0;
									if (!arg1.aBoolean329) {
										Static658.method8966(arg1, 0, local53);
									}
								} else if (local56 == 2) {
									local61.anInt6825 = 0;
								}
							} else if (local53.anInt3004 >= Static334.aClass268_2.method6469(local61.anInt6821).anInt3004) {
								local61 = arg1.aClass245Array3[local31] = null;
							}
						}
						if (local61 == null) {
							local61 = arg1.aClass245Array3[local31] = new Class245();
							local61.anInt6825 = 0;
							local61.anInt6818 = 0;
							local61.anInt6823 = local29;
							local61.anInt6819 = 0;
							local61.anInt6821 = local21;
							local61.anInt6824 = 1;
							if (!arg1.aBoolean329) {
								Static658.method8966(arg1, 0, local53);
							}
						}
					}
				}
				local25 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!ib;[I)V")
	public static void method1443(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(18) boolean local18;
		@Pc(20) int local20;
		if (arg1.anIntArray296 != null) {
			local18 = true;
			for (local20 = 0; local20 < arg1.anIntArray296.length; local20++) {
				if (arg2[local20] != arg1.anIntArray296[local20]) {
					local18 = false;
					break;
				}
			}
			if (local18 && arg1.anInt5077 != -1) {
				@Pc(53) Class119 local53 = Static334.aClass268_2.method6469(arg1.anInt5077);
				@Pc(56) int local56 = local53.anInt3012;
				if (local56 == 1) {
					arg1.anInt5065 = arg0;
					arg1.anInt5054 = 0;
					arg1.anInt5090 = 0;
					arg1.anInt5115 = 0;
					arg1.anInt5049 = 1;
					if (!arg1.aBoolean329) {
						Static658.method8966(arg1, arg1.anInt5115, local53);
					}
				}
				if (local56 == 2) {
					arg1.anInt5090 = 0;
				}
			}
		}
		local18 = true;
		for (local20 = 0; local20 < arg2.length; local20++) {
			if (arg2[local20] != -1) {
				local18 = false;
			}
			if (arg1.anIntArray296 == null || arg1.anIntArray296[local20] == -1 || Static334.aClass268_2.method6469(arg2[local20]).anInt3004 >= Static334.aClass268_2.method6469(arg1.anIntArray296[local20]).anInt3004) {
				arg1.anIntArray296 = arg2;
				arg1.anInt5065 = arg0;
				break;
			}
		}
		if (local18) {
			arg1.anInt5065 = arg0;
			arg1.anIntArray296 = arg2;
		}
	}
}
