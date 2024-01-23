import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!wf;")
	public static Class189 aClass189_11;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt4112 = 0;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString239 = "K";

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString240 = "Loaded title screen";

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int anInt4120 = 127;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method3409(@OriginalArg(1) int arg0) {
		@Pc(4) Class4_Sub3_Sub9 local4 = Static43.method2329(1, arg0);
		local4.method1519();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method3413() {
		if (Static195.aClass189_10 != null || (Static35.aClass189_1 != null || Static39.anInt640 > 0)) {
			return;
		}
		@Pc(22) int local22 = Static252.anInt4803;
		@Pc(105) int local105;
		@Pc(99) int local99;
		if (!Static18.aBoolean17) {
			if (local22 == 1 && Static300.anInt5638 > 0) {
				@Pc(47) short local47 = Static262.aShortArray100[Static300.anInt5638 - 1];
				if (local47 == 30 || local47 == 20 || local47 == 13 || local47 == 2 || local47 == 49 || local47 == 58 || local47 == 35 || local47 == 17 || local47 == 10 || local47 == 51 || local47 == 9 || local47 == 1001) {
					local99 = Static262.anIntArray543[Static300.anInt5638 - 1];
					local105 = Static73.anIntArray117[Static300.anInt5638 - 1];
					@Pc(109) Class189 local109 = Static114.method1814(local99);
					@Pc(112) Class4_Sub21 local112 = Static41.method687(local109);
					if (local112.method3282() || local112.method3292()) {
						Static65.anInt1267 = 0;
						Static201.aBoolean276 = false;
						if (Static195.aClass189_10 != null) {
							Static205.method3283(Static195.aClass189_10);
						}
						Static195.aClass189_10 = Static114.method1814(local99);
						Static34.anInt547 = Static79.anInt1797;
						Static5.anInt91 = local105;
						Static42.anInt789 = Static278.anInt5313;
						Static205.method3283(Static195.aClass189_10);
						return;
					}
				}
			}
			if (local22 == 1 && (Static107.anInt5401 == 1 && Static300.anInt5638 > 2 || Static60.method1005(Static300.anInt5638 - 1))) {
				local22 = 2;
			}
			if (local22 == 2 && Static300.anInt5638 > 0 || Static83.anInt1940 == 1) {
				Static244.method3820();
			}
			if (local22 == 1 && Static300.anInt5638 > 0 || Static83.anInt1940 == 2) {
				Static312.method4821();
			}
			return;
		}
		@Pc(200) int local200;
		if (local22 != 1) {
			local200 = Static286.anInt5358;
			local105 = Static312.anInt6042;
			if (local200 < Static201.anInt3890 - 10 || local200 > Static234.anInt4441 + Static201.anInt3890 + 10 || local105 < Static181.anInt3455 - 10 || Static122.anInt2394 + Static181.anInt3455 + 10 < local105) {
				Static18.aBoolean17 = false;
				Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
			}
		}
		if (local22 != 1) {
			return;
		}
		local200 = Static201.anInt3890;
		local105 = Static181.anInt3455;
		@Pc(255) int local255 = Static79.anInt1797;
		@Pc(257) int local257 = Static278.anInt5313;
		local99 = Static234.anInt4441;
		@Pc(261) int local261 = -1;
		for (@Pc(263) int local263 = 0; local263 < Static300.anInt5638; local263++) {
			@Pc(281) int local281;
			if (Static300.aBoolean390) {
				local281 = (Static300.anInt5638 - local263 - 1) * 15 + local105 + 33;
				if (local200 < local255 && local99 + local200 > local255 && local281 - 13 < local257 && local281 + 3 > local257) {
					local261 = local263;
				}
			} else {
				local281 = (Static300.anInt5638 - local263 - 1) * 15 + local105 + 31;
				if (local200 < local255 && local99 + local200 > local255 && local281 - 13 < local257 && local281 + 3 > local257) {
					local261 = local263;
				}
			}
		}
		if (local261 != -1) {
			Static280.method664(local261);
		}
		Static18.aBoolean17 = false;
		Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
	}
}
