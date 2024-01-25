import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_7 = null;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "([[BILclient!tha;)V")
	public static void method4484(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class132_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt9342; local14++) {
			Static14.method8598();
			for (local20 = 0; local20 < Static394.anInt7540 >> 3; local20++) {
				for (local24 = 0; local24 < Static462.anInt8391 >> 3; local24++) {
					local34 = Static27.anIntArrayArrayArray1[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean787 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static475.anIntArray531.length; local78++) {
								if (local76 == Static475.anIntArray531[local78] && arg0[local78] != null) {
									@Pc(100) Class3_Sub15 local100 = new Class3_Sub15(arg0[local78]);
									arg1.method7702(local60, local43, local54, local24 * 8, Static334.aClass291Array20, local14, local66, local100, local20 * 8);
									arg1.method7719(local24 * 8, local100, local60, Static47.aClass33_3, local66, local12[0] == -1 ? local12 : null, local43, local20 * 8, local14, local54);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt9342; local20++) {
			Static14.method8598();
			for (local24 = 0; local24 < Static394.anInt7540 >> 3; local24++) {
				for (local34 = 0; local34 < Static462.anInt8391 >> 3; local34++) {
					local43 = Static27.anIntArrayArrayArray1[local20][local24][local34];
					if (local43 == -1) {
						arg1.method7704(8, local34 * 8, local24 * 8, local20, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static278.aClass147_5 = Static20.aClass202_1.method5434(local12[2], local12[3], local12[0], local12[1], Static57.aClass265_33);
			Static530.anInt9140 = local12[4];
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIILclient!gaa;)V")
	public static void method4485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class108 arg2) {
		if (Static82.aBoolean192) {
			@Pc(14) Class140 local14 = Static159.anInt3866 == -1 ? null : Static513.aClass49_2.method1857(Static159.anInt3866);
			if (Static71.method1836(arg2).method1189() && (Static607.anInt10027 & 0x20) != 0 && (local14 == null || arg2.method3527(local14.anInt5140, Static159.anInt3866) != local14.anInt5140)) {
				Static512.method7408(11, Static275.aString60 + " -> " + arg2.aString37, arg2.anInt4059, true, (long) (arg2.anInt4043 | arg2.anInt4083 << 0), Static330.aString71, 0L, false, arg2.anInt4083, arg2.anInt4043, false, Static287.anInt5894);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static623.method8479(local78, arg2);
			if (local85 != null) {
				Static512.method7408(1011, arg2.aString37, arg2.anInt4059, true, (long) (arg2.anInt4043 | arg2.anInt4083 << 0), local85, (long) (local78 + 1), false, arg2.anInt4083, arg2.anInt4043, false, Static601.method8190(local78, arg2));
			}
		}
		local85 = Static351.method5755(arg2);
		if (local85 != null) {
			Static512.method7408(30, arg2.aString37, arg2.anInt4059, true, (long) (arg2.anInt4083 << 0 | arg2.anInt4043), local85, 0L, false, arg2.anInt4083, arg2.anInt4043, false, arg2.anInt4047);
		}
		for (@Pc(168) int local168 = 4; local168 >= 0; local168--) {
			@Pc(175) String local175 = Static623.method8479(local168, arg2);
			if (local175 != null) {
				Static512.method7408(21, arg2.aString37, arg2.anInt4059, true, (long) (arg2.anInt4083 << 0 | arg2.anInt4043), local175, (long) (local168 + 1), false, arg2.anInt4083, arg2.anInt4043, false, Static601.method8190(local168, arg2));
			}
		}
		if (!Static71.method1836(arg2).method1186()) {
			return;
		}
		if (arg2.aString36 == null) {
			Static512.method7408(59, "", arg2.anInt4059, true, (long) (arg2.anInt4083 << 0 | arg2.anInt4043), Static287.aClass176_9.method4986(Static380.anInt7247), 0L, false, arg2.anInt4083, arg2.anInt4043, false, -1);
		} else {
			Static512.method7408(59, "", arg2.anInt4059, true, (long) (arg2.anInt4083 << 0 | arg2.anInt4043), arg2.aString36, 0L, false, arg2.anInt4083, arg2.anInt4043, false, -1);
		}
	}
}
