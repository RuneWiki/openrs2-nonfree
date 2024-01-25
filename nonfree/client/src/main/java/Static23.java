import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
	public static int anInt564;

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
	public static int anInt567;

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_20 = new Class179(12, 4);

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_5 = new Class289(10, 16);

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public static void method580() {
		if (Static128.aClass283ArrayArray1 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < Static128.aClass283ArrayArray1.length; local10++) {
			for (@Pc(14) int local14 = 0; local14 < Static128.aClass283ArrayArray1[local10].length; local14++) {
				Static128.aClass283ArrayArray1[local10][local14] = Static508.aClass283_36;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!aaa;Z)Z")
	public static boolean method582(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static289.aClass12Array3 == Static68.aClass12Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8465();
		if (arg0.aShort118 < 0 || arg0.aShort121 < 0 || arg0.aShort119 >= Static209.anInt3602 || arg0.aShort120 >= Static245.anInt4308) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort118; local36 <= arg0.aShort119; local36++) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort120; local40++) {
				@Pc(47) Class351 local47 = Static31.method714(arg0.aByte140, local36, local40);
				if (local47 != null) {
					@Pc(53) Class67 local53 = Static11.method409(arg0);
					@Pc(56) Class67 local56 = local47.aClass67_3;
					if (local56 == null) {
						local47.aClass67_3 = local53;
					} else {
						while (local56.aClass67_1 != null) {
							local56 = local56.aClass67_1;
						}
						local56.aClass67_1 = local53;
					}
					if (local6 && (Static161.anIntArrayArray14[local36][local40] & 0xFF000000) != 0) {
						local8 = Static161.anIntArrayArray14[local36][local40];
						local10 = Static225.aShortArrayArray13[local36][local40];
						local12 = Static312.aByteArrayArray25[local36][local40];
					}
					if (!arg1 && local47.aClass2_Sub1_Sub3_1 != null && local47.aClass2_Sub1_Sub3_1.aShort61 > local33) {
						local33 = local47.aClass2_Sub1_Sub3_1.aShort61;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort118; local40 <= arg0.aShort119; local40++) {
				for (@Pc(136) int local136 = arg0.aShort121; local136 <= arg0.aShort120; local136++) {
					if ((Static161.anIntArrayArray14[local40][local136] & 0xFF000000) == 0) {
						Static161.anIntArrayArray14[local40][local136] = local8;
						Static225.aShortArrayArray13[local40][local136] = local10;
						Static312.aByteArrayArray25[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static493.aClass2_Sub1_Sub1Array1[Static25.anInt3151++] = arg0;
		} else {
			local40 = Static289.aClass12Array3 == Static68.aClass12Array2 ? 1 : 0;
			if (!arg0.method8447()) {
				arg0.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local40];
				Static512.aClass2_Sub1Array4[local40] = arg0;
			} else if (arg0.method8446()) {
				arg0.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local40];
				Static643.aClass2_Sub1Array5[local40] = arg0;
			} else {
				arg0.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local40];
				Static229.aClass2_Sub1Array2[local40] = arg0;
				Static119.aBoolean126 = true;
			}
		}
		if (arg1) {
			arg0.anInt10004 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B[[[Lclient!ug;)V")
	public static void method583(@OriginalArg(1) Class351[][][] arg0) {
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class351[][] local20 = arg0[local14];
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				for (@Pc(26) int local26 = 0; local26 < local20[local22].length; local26++) {
					@Pc(34) Class351 local34 = local20[local22][local26];
					if (local34 != null) {
						if (local34.aClass2_Sub1_Sub3_1 instanceof Interface18) {
							((Interface18) local34.aClass2_Sub1_Sub3_1).method8475();
						}
						if (local34.aClass2_Sub1_Sub4_2 instanceof Interface18) {
							((Interface18) local34.aClass2_Sub1_Sub4_2).method8475();
						}
						if (local34.aClass2_Sub1_Sub4_1 instanceof Interface18) {
							((Interface18) local34.aClass2_Sub1_Sub4_1).method8475();
						}
						if (local34.aClass2_Sub1_Sub2_2 instanceof Interface18) {
							((Interface18) local34.aClass2_Sub1_Sub2_2).method8475();
						}
						if (local34.aClass2_Sub1_Sub2_1 instanceof Interface18) {
							((Interface18) local34.aClass2_Sub1_Sub2_1).method8475();
						}
						for (@Pc(84) Class67 local84 = local34.aClass67_3; local84 != null; local84 = local84.aClass67_1) {
							@Pc(89) Class2_Sub1_Sub1 local89 = local84.aClass2_Sub1_Sub1_1;
							if (local89 instanceof Interface18) {
								((Interface18) local89).method8475();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
	public static int method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static225.aShortArrayArray13 == null ? 0 : Static225.aShortArrayArray13[arg0][arg1] & 0xFFFF;
	}
}
