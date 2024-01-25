import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public static int anInt1070;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!bi;")
	public static Class26 aClass26_10;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public static int anInt1075;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt1072 = 20;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_12 = new Class103(5);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!cc;)V")
	public static void method879(@OriginalArg(1) Class22_Sub2_Sub1_Sub1 arg0) {
		@Pc(18) Class7_Sub26 local18 = (Class7_Sub26) Static141.aClass10_24.method163((long) arg0.anInt5115);
		if (local18 == null) {
			Static339.method5516(null, arg0.anIntArray666[0], Static168.anInt3508, arg0, null, arg0.anIntArray665[0], 0);
		} else {
			local18.method3578();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
	public static void method881(@OriginalArg(0) boolean arg0) {
		Static336.aBoolean324 = arg0;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(34) boolean local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(173) int local173;
		@Pc(183) int local183;
		@Pc(191) int local191;
		if (!Static336.aBoolean324) {
			local19 = Static200.aClass7_Sub3_Sub2_3.method2739();
			local25 = Static200.aClass7_Sub3_Sub2_3.method2784();
			local34 = Static200.aClass7_Sub3_Sub2_3.method2751() == 1;
			local38 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local42 = Static200.aClass7_Sub3_Sub2_3.method2736();
			local46 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local50 = Static200.aClass7_Sub3_Sub2_3.method2763();
			local57 = (Static54.anInt1421 - Static200.aClass7_Sub3_Sub2_3.anInt3005) / 16;
			Static154.anIntArrayArray25 = new int[local57][4];
			for (local63 = 0; local63 < local57; local63++) {
				for (local67 = 0; local67 < 4; local67++) {
					Static154.anIntArrayArray25[local63][local67] = Static200.aClass7_Sub3_Sub2_3.method2743();
				}
			}
			Static89.method1860(local46);
			Static54.anIntArray214 = new int[local57];
			Static5.aByteArrayArray3 = null;
			Static228.anIntArray614 = new int[local57];
			Static222.anIntArray601 = new int[local57];
			Static58.aByteArrayArray6 = new byte[local57][];
			Static321.anIntArray779 = new int[local57];
			Static75.aByteArrayArray7 = new byte[local57][];
			Static94.anIntArray311 = new int[local57];
			Static121.aByteArrayArray8 = new byte[local57][];
			Static65.anIntArray235 = null;
			Static248.aByteArrayArray16 = new byte[local57][];
			@Pc(127) boolean local127 = false;
			if ((local42 / 8 == 48 || local42 / 8 == 49) && local25 / 8 == 48) {
				local127 = true;
			}
			if (local42 / 8 == 48 && local25 / 8 == 148) {
				local127 = true;
			}
			local57 = 0;
			for (local173 = (local42 - (Static15.anInt287 >> 4)) / 8; local173 <= (local42 + (Static15.anInt287 >> 4)) / 8; local173++) {
				for (local183 = (local25 - (Static325.anInt6173 >> 4)) / 8; local183 <= (local25 + (Static325.anInt6173 >> 4)) / 8; local183++) {
					local191 = local183 + (local173 << 8);
					if (local127 && (local183 == 49 || local183 == 149 || local183 == 147 || local173 == 50 || local173 == 49 && local183 == 47)) {
						Static94.anIntArray311[local57] = local191;
						Static54.anIntArray214[local57] = -1;
						Static222.anIntArray601[local57] = -1;
						Static321.anIntArray779[local57] = -1;
						Static228.anIntArray614[local57] = -1;
					} else {
						Static94.anIntArray311[local57] = local191;
						Static54.anIntArray214[local57] = Static87.aClass180_80.method4570("m" + local173 + "_" + local183);
						Static222.anIntArray601[local57] = Static87.aClass180_80.method4570("l" + local173 + "_" + local183);
						Static321.anIntArray779[local57] = Static87.aClass180_80.method4570("um" + local173 + "_" + local183);
						Static228.anIntArray614[local57] = Static87.aClass180_80.method4570("ul" + local173 + "_" + local183);
					}
					local57++;
				}
			}
			Static120.method2555(local38, false, local34, local25, local42, local50, local19);
			return;
		}
		local19 = Static200.aClass7_Sub3_Sub2_3.method2764();
		local25 = Static200.aClass7_Sub3_Sub2_3.method2739();
		local34 = Static200.aClass7_Sub3_Sub2_3.method2751() == 1;
		local38 = Static200.aClass7_Sub3_Sub2_3.method2751();
		local42 = Static200.aClass7_Sub3_Sub2_3.method2739();
		local46 = Static200.aClass7_Sub3_Sub2_3.method2764();
		local50 = Static200.aClass7_Sub3_Sub2_3.method2740();
		Static89.method1860(local38);
		Static200.aClass7_Sub3_Sub2_3.method2808();
		for (local57 = 0; local57 < 4; local57++) {
			for (local63 = 0; local63 < Static15.anInt287 >> 3; local63++) {
				for (local67 = 0; local67 < Static325.anInt6173 >> 3; local67++) {
					local173 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
					if (local173 == 1) {
						Static142.anIntArrayArrayArray10[local57][local63][local67] = Static200.aClass7_Sub3_Sub2_3.method2806(26);
					} else {
						Static142.anIntArrayArrayArray10[local57][local63][local67] = -1;
					}
				}
			}
		}
		Static200.aClass7_Sub3_Sub2_3.method2805();
		local63 = (Static54.anInt1421 - Static200.aClass7_Sub3_Sub2_3.anInt3005) / 16;
		Static154.anIntArrayArray25 = new int[local63][4];
		for (local67 = 0; local67 < local63; local67++) {
			for (local173 = 0; local173 < 4; local173++) {
				Static154.anIntArrayArray25[local67][local173] = Static200.aClass7_Sub3_Sub2_3.method2767();
			}
		}
		Static321.anIntArray779 = new int[local63];
		Static58.aByteArrayArray6 = new byte[local63][];
		Static248.aByteArrayArray16 = new byte[local63][];
		Static121.aByteArrayArray8 = new byte[local63][];
		Static65.anIntArray235 = null;
		Static94.anIntArray311 = new int[local63];
		Static222.anIntArray601 = new int[local63];
		Static75.aByteArrayArray7 = new byte[local63][];
		Static228.anIntArray614 = new int[local63];
		Static5.aByteArrayArray3 = null;
		Static54.anIntArray214 = new int[local63];
		local63 = 0;
		for (local173 = 0; local173 < 4; local173++) {
			for (local183 = 0; local183 < Static15.anInt287 >> 3; local183++) {
				for (local191 = 0; local191 < Static325.anInt6173 >> 3; local191++) {
					@Pc(548) int local548 = Static142.anIntArrayArrayArray10[local173][local183][local191];
					if (local548 != -1) {
						@Pc(558) int local558 = local548 >> 14 & 0x3FF;
						@Pc(564) int local564 = local548 >> 3 & 0x7FF;
						@Pc(574) int local574 = local564 / 8 + (local558 / 8 << 8);
						for (@Pc(576) int local576 = 0; local576 < local63; local576++) {
							if (Static94.anIntArray311[local576] == local574) {
								local574 = -1;
								break;
							}
						}
						if (local574 != -1) {
							Static94.anIntArray311[local63] = local574;
							@Pc(605) int local605 = local574 >> 8 & 0xFF;
							@Pc(609) int local609 = local574 & 0xFF;
							Static54.anIntArray214[local63] = Static87.aClass180_80.method4570("m" + local605 + "_" + local609);
							Static222.anIntArray601[local63] = Static87.aClass180_80.method4570("l" + local605 + "_" + local609);
							Static321.anIntArray779[local63] = Static87.aClass180_80.method4570("um" + local605 + "_" + local609);
							Static228.anIntArray614[local63] = Static87.aClass180_80.method4570("ul" + local605 + "_" + local609);
							local63++;
						}
					}
				}
			}
		}
		Static120.method2555(local46, false, local34, local19, local25, local50, local42);
	}
}
