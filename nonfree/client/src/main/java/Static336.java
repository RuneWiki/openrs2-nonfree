import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public static int anInt5747;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_93 = new Class217(23, 7);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLclient!at;)V")
	public static void method4490(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class7_Sub2_Sub3_Sub1 arg1) {
		if (Static158.anInt3162 >= 400) {
			return;
		}
		@Pc(12) Class47 local12 = arg1.aClass47_1;
		if (local12.anIntArray94 != null) {
			local12 = local12.method1251(Static85.aClass49_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean134) {
			return;
		}
		@Pc(30) String local30 = local12.aString7;
		if (local12.anInt1611 != 0) {
			@Pc(48) String local48 = Static57.aClass183_3 == Static297.aClass183_4 ? Static28.aClass189_24.method4262(Static53.anInt1454) : Static17.aClass189_10.method4262(Static53.anInt1454);
			local30 = local30 + Static379.method4942(local12.anInt1611, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414) + " (" + local48 + local12.anInt1611 + ")";
		}
		if (!Static446.aBoolean648) {
			if (!arg0) {
				@Pc(138) String[] local138 = local12.aStringArray9;
				if (Static432.aBoolean627) {
					local138 = Static139.method5915(local138);
				}
				@Pc(148) int local148;
				if (local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && (Static57.aClass183_3 != Static300.aClass183_5 || !local138[local148].equalsIgnoreCase(Static408.aClass189_221.method4262(Static53.anInt1454)))) {
							@Pc(168) byte local168 = 0;
							@Pc(170) int local170 = Static366.anInt6171;
							if (local148 == 0) {
								local168 = 19;
							}
							if (local148 == 1) {
								local168 = 58;
							}
							if (local148 == 2) {
								local168 = 51;
							}
							if (local148 == 3) {
								local168 = 18;
							}
							if (local148 == 4) {
								local168 = 25;
							}
							if (local12.anInt1607 == local148) {
								local170 = local12.anInt1622;
							}
							if (local12.anInt1608 == local148) {
								local170 = local12.anInt1614;
							}
							Static102.method1792("<col=ffff00>" + local30, (long) arg1.anInt4391, local170, 0, true, local138[local148], false, 0, -1, local168);
						}
					}
				}
				if (Static300.aClass183_5 == Static57.aClass183_3 && local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && local138[local148].equalsIgnoreCase(Static408.aClass189_221.method4262(Static53.anInt1454))) {
							@Pc(270) short local270 = 0;
							if (local12.anInt1611 > Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414) {
								local270 = 2000;
							}
							@Pc(279) short local279 = 0;
							if (local148 == 0) {
								local279 = 19;
							}
							if (local148 == 1) {
								local279 = 58;
							}
							if (local148 == 2) {
								local279 = 51;
							}
							if (local148 == 3) {
								local279 = 18;
							}
							if (local148 == 4) {
								local279 = 25;
							}
							if (local279 != 0) {
								local279 += local270;
							}
							Static102.method1792("<col=ffff00>" + local30, (long) arg1.anInt4391, local12.anInt1615, 0, true, local138[local148], false, 0, -1, local279);
						}
					}
				}
			}
			Static102.method1792("<col=ffff00>" + local30, (long) arg1.anInt4391, Static103.anInt2338, 0, true, Static267.aClass189_158.method4262(Static53.anInt1454), arg0, 0, -1, 1004);
		} else if (!arg0) {
			@Pc(86) Class224 local86 = Static96.anInt2198 == -1 ? null : Static318.aClass26_5.method691(Static96.anInt2198);
			if ((Static279.anInt4322 & 0x2) != 0 && (local86 == null || local12.method1245(local86.anInt6133, Static96.anInt2198) != local86.anInt6133)) {
				Static102.method1792(Static415.aString62 + " -> <col=ffff00>" + local30, (long) arg1.anInt4391, Static141.anInt2928, 0, true, Static189.aString34, false, 0, -1, 49);
			}
		}
	}
}
