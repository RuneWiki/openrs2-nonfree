import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!ii;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_5 = new Class277(12, 4);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method2654(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub6_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class115 local8 = Static432.aClass115Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static255.anInt5209; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static10.anInt812; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static392.anInt3635;
							@Pc(32) int local32 = local12 << Static392.anInt3635;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class115 local41 = Static432.aClass115Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8055(local12, local15) - local41.method8055(local12, local15);
									@Pc(71) int local71 = local8.method8055(local12, local15 + 1) - local41.method8055(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8055(local12 + 1, local15 + 1) - local41.method8055(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8055(local12 + 1, local15) - local41.method8055(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method2656() {
		@Pc(9) int local9 = Static549.aClass4_Sub13_Sub2_2.method7035();
		@Pc(13) int local13 = Static549.aClass4_Sub13_Sub2_2.method7004();
		Static343.anInt6623 = Static549.aClass4_Sub13_Sub2_2.method6987();
		@Pc(21) int local21 = Static549.aClass4_Sub13_Sub2_2.method6995();
		@Pc(32) boolean local32 = Static549.aClass4_Sub13_Sub2_2.method7009() == 1;
		Static325.method5024();
		Static278.method4469(local13);
		Static549.aClass4_Sub13_Sub2_2.method7063();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static338.anInt6508 >> 3; local50++) {
				for (local54 = 0; local54 < Static390.anInt7654 >> 3; local54++) {
					local61 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
					if (local61 == 1) {
						Static119.anIntArrayArrayArray4[local46][local50][local54] = Static549.aClass4_Sub13_Sub2_2.method7065(26);
					} else {
						Static119.anIntArrayArrayArray4[local46][local50][local54] = -1;
					}
				}
			}
		}
		Static549.aClass4_Sub13_Sub2_2.method7062();
		local50 = (Static488.anInt9250 - Static549.aClass4_Sub13_Sub2_2.anInt9170) / 16;
		Static366.anIntArrayArray36 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static366.anIntArrayArray36[local54][local61] = Static549.aClass4_Sub13_Sub2_2.method6990();
			}
		}
		Static154.anIntArray163 = new int[local50];
		Static322.anIntArray351 = new int[local50];
		Static72.aByteArrayArray7 = null;
		Static470.anIntArray520 = new int[local50];
		Static151.anIntArray158 = new int[local50];
		Static106.aByteArrayArray10 = new byte[local50][];
		Static559.anIntArray589 = new int[local50];
		Static33.aByteArrayArray1 = new byte[local50][];
		Static286.aByteArrayArray21 = new byte[local50][];
		Static238.anIntArray272 = null;
		Static466.aByteArrayArray26 = new byte[local50][];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(188) int local188 = 0; local188 < Static338.anInt6508 >> 3; local188++) {
				for (@Pc(192) int local192 = 0; local192 < Static390.anInt7654 >> 3; local192++) {
					@Pc(202) int local202 = Static119.anIntArrayArrayArray4[local61][local188][local192];
					if (local202 != -1) {
						@Pc(211) int local211 = local202 >> 14 & 0x3FF;
						@Pc(217) int local217 = local202 >> 3 & 0x7FF;
						@Pc(227) int local227 = (local211 / 8 << 8) + local217 / 8;
						for (@Pc(229) int local229 = 0; local229 < local50; local229++) {
							if (Static322.anIntArray351[local229] == local227) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static322.anIntArray351[local50] = local227;
							@Pc(266) int local266 = local227 >> 8 & 0xFF;
							@Pc(270) int local270 = local227 & 0xFF;
							Static151.anIntArray158[local50] = Static46.aClass348_22.method7966("m" + local266 + "_" + local270);
							Static154.anIntArray163[local50] = Static46.aClass348_22.method7966("l" + local266 + "_" + local270);
							Static559.anIntArray589[local50] = Static46.aClass348_22.method7966("um" + local266 + "_" + local270);
							Static470.anIntArray520[local50] = Static46.aClass348_22.method7966("ul" + local266 + "_" + local270);
							local50++;
						}
					}
				}
			}
		}
		Static564.method7994(11, local32, local9, local21);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
	public static boolean method2658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static579.method8125(arg1, arg0) | (arg1 & 0x800) != 0 || Static276.method4454(arg1, arg0);
	}
}
