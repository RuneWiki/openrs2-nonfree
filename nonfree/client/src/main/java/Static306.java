import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Lclient!nd;")
	public static Class104_Sub1 aClass104_Sub1_1;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_190 = new Class67(67, 6);

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public static int anInt5095 = 2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([IB[ILclient!ir;[I)V")
	public static void method4066(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class11_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) int local16 = arg0[local10];
			@Pc(20) int local20 = arg3[local10];
			@Pc(24) int local24 = arg1[local10];
			for (@Pc(26) int local26 = 0; local20 != 0 && local26 < arg2.aClass9Array3.length; local26++) {
				if ((local20 & 0x1) != 0) {
					if (local16 == -1) {
						arg2.aClass9Array3[local26] = null;
					} else {
						@Pc(40) Class64 local40 = Static402.aClass37_2.method665(local16);
						@Pc(43) int local43 = local40.anInt1204;
						@Pc(48) Class9 local48 = arg2.aClass9Array3[local26];
						if (local48 != null) {
							if (local16 == local48.anInt104) {
								if (local43 == 0) {
									local48 = arg2.aClass9Array3[local26] = null;
								} else if (local43 == 1) {
									local48.anInt108 = 1;
									local48.anInt105 = 0;
									local48.anInt109 = 0;
									local48.anInt107 = 0;
									local48.anInt103 = local24;
									Static379.method131(0, arg2.anInt6428, local40, arg2.aByte90, arg2 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg2.anInt6430);
								} else if (local43 == 2) {
									local48.anInt107 = 0;
								}
							} else if (local40.anInt1199 >= Static402.aClass37_2.method665(local48.anInt104).anInt1199) {
								local48 = arg2.aClass9Array3[local26] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass9Array3[local26] = new Class9();
							local48.anInt108 = 1;
							local48.anInt109 = 0;
							local48.anInt107 = 0;
							local48.anInt103 = local24;
							local48.anInt104 = local16;
							local48.anInt105 = 0;
							Static379.method131(0, arg2.anInt6428, local40, arg2.aByte90, arg2 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg2.anInt6430);
						}
					}
				}
				local20 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lclient!mk;")
	public static Class158 method4067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class158 local7 = new Class158();
		local7.anInt4546 = arg1 + 1 + 5;
		local7.anInt4542 = -1;
		local7.anInt4537 = arg0 + 5 + 1;
		local7.anInt4550 = -1;
		local7.anIntArrayArray39 = new int[local7.anInt4537][local7.anInt4546];
		local7.method3624();
		return local7;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public static void method4068(@OriginalArg(1) int arg0) {
		Static85.anInt6282 = arg0;
		Static282.aClass77_36.method1395();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BII)V")
	public static void method4069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static218.anInt3990 != arg1) {
			Static434.anIntArray495 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static434.anIntArray495[local13] = (local13 << 12) / arg1;
			}
			Static218.anInt3990 = arg1;
			Static147.anInt2302 = arg1 - 1;
			Static319.anInt5269 = arg1 * 32;
		}
		if (Static54.anInt778 == arg0) {
			return;
		}
		if (Static218.anInt3990 == arg0) {
			Static258.anIntArray335 = Static434.anIntArray495;
		} else {
			Static258.anIntArray335 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static258.anIntArray335[local13] = (local13 << 12) / arg0;
			}
		}
		Static54.anInt778 = arg0;
		Static464.anInt6761 = arg0 - 1;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = Static103.anInt6434;
		@Pc(9) int[] local9 = Static56.anIntArray110;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class11_Sub1_Sub3_Sub2 local21 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static94.aClass11_Sub1_Sub3_Sub2_1 && local21.aString32 != null && local21.aString32.equalsIgnoreCase(arg1)) {
				local11 = true;
				if (arg0 == 1) {
					Static178.method2589(Static135.aClass242_39);
					Static426.aClass1_Sub19_Sub2_2.method2894(local9[local13]);
					Static426.aClass1_Sub19_Sub2_2.method2933(0);
				} else if (arg0 == 4) {
					Static178.method2589(Static324.aClass242_85);
					Static426.aClass1_Sub19_Sub2_2.method2879(0);
					Static426.aClass1_Sub19_Sub2_2.method2894(local9[local13]);
				} else if (arg0 == 5) {
					Static178.method2589(Static39.aClass242_9);
					Static426.aClass1_Sub19_Sub2_2.method2894(local9[local13]);
					Static426.aClass1_Sub19_Sub2_2.method2879(0);
				} else if (arg0 == 6) {
					Static178.method2589(Static188.aClass242_51);
					Static426.aClass1_Sub19_Sub2_2.method2898(0);
					Static426.aClass1_Sub19_Sub2_2.method2930(local9[local13]);
				} else if (arg0 == 7) {
					Static178.method2589(Static180.aClass242_48);
					Static426.aClass1_Sub19_Sub2_2.method2879(0);
					Static426.aClass1_Sub19_Sub2_2.method2889(local9[local13]);
				}
				break;
			}
		}
		if (!local11) {
			Static246.method3498(Static207.aClass142_50.method3118(Static63.anInt981) + arg1);
		}
	}
}
