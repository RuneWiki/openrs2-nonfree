import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
	public static int anInt933 = 0;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BLclient!wc;Z)V")
	public static void method1043(@OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static450.anInt7444 >= 400) {
			return;
		}
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 != arg0) {
			@Pc(168) String local168;
			if (arg0.anInt10503 == 0) {
				@Pc(63) boolean local63 = true;
				if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10510 != -1 && arg0.anInt10510 != -1) {
					@Pc(83) int local83 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10510 >= arg0.anInt10510 ? arg0.anInt10510 : Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10510;
					@Pc(90) int local90 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514 - arg0.anInt10514;
					if (local90 < 0) {
						local90 = -local90;
					}
					if (local83 < local90) {
						local63 = false;
					}
				}
				@Pc(120) String local120 = Static68.aClass118_3 == Static55.aClass118_2 ? Static601.aClass346_32.method8440(Static609.anInt9834) : Static601.aClass346_30.method8440(Static609.anInt9834);
				if (arg0.anInt10514 < arg0.anInt10500) {
					local168 = arg0.method9103() + (local63 ? Static76.method1428(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514, arg0.anInt10514) : "<col=ffffff>") + " (" + local120 + arg0.anInt10514 + "+" + (arg0.anInt10500 - arg0.anInt10514) + ")";
				} else {
					local168 = arg0.method9103() + (local63 ? Static76.method1428(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514, arg0.anInt10514) : "<col=ffffff>") + " (" + local120 + arg0.anInt10514 + ")";
				}
			} else if (arg0.anInt10503 == -1) {
				local168 = arg0.method9103();
			} else {
				local168 = arg0.method9103() + " (" + Static601.aClass346_31.method8440(Static609.anInt9834) + arg0.anInt10503 + ")";
			}
			if (Static624.aBoolean698 && !arg1 && (Static173.anInt3449 & 0x8) != 0) {
				Static303.method4660(false, Static90.aString119, false, -1, Static103.aString17 + " -> <col=ffffff>" + local168, true, 0, 49, (long) arg0.anInt10762, 0, Static463.anInt7620, (long) arg0.anInt10762);
			}
			if (arg1) {
				Static303.method4660(true, "<col=cccccc>" + local168, false, 0, "", false, 0, -1, (long) arg0.anInt10762, 0, -1, 0L);
			} else {
				for (@Pc(282) int local282 = 7; local282 >= 0; local282--) {
					if (Static183.aStringArray9[local282] != null) {
						@Pc(290) short local290 = 0;
						if (Static438.aClass118_6 == Static55.aClass118_2 && Static183.aStringArray9[local282].equalsIgnoreCase(Static601.aClass346_25.method8440(Static609.anInt9834))) {
							if (Static654.aBoolean796 && arg0.anInt10514 > Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514) {
								local290 = 2000;
							}
							if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10518 == 0 || arg0.anInt10518 == 0) {
								if (arg0.aBoolean793) {
									local290 = 2000;
								}
							} else if (arg0.anInt10518 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10518) {
								local290 = 2000;
							} else {
								local290 = 0;
							}
						} else if (Static163.aBooleanArray17[local282]) {
							local290 = 2000;
						}
						@Pc(361) short local361 = (short) (local290 + Static660.aShortArray156[local282]);
						@Pc(373) int local373 = Static19.anIntArray25[local282] == -1 ? Static209.anInt4029 : Static19.anIntArray25[local282];
						Static303.method4660(false, Static183.aStringArray9[local282], false, -1, "<col=ffffff>" + local168, true, 0, local361, (long) arg0.anInt10762, 0, local373, (long) arg0.anInt10762);
					}
				}
			}
			if (!arg1) {
				for (@Pc(437) Class3_Sub11_Sub14 local437 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local437 != null; local437 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
					if (local437.anInt6738 == 51) {
						local437.aString66 = "<col=ffffff>" + local168;
						return;
					}
				}
			}
		} else if (Static624.aBoolean698 && (Static173.anInt3449 & 0x10) != 0) {
			Static303.method4660(false, Static90.aString119, false, -1, Static103.aString17 + " -> <col=ffffff>" + Static601.aClass346_39.method8440(Static609.anInt9834), true, 0, 60, (long) arg0.anInt10762, 0, Static463.anInt7620, 0L);
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)Lclient!lda;")
	public static Class98_Sub1 method1044() {
		Static128.anInt2638 = 0;
		return Static60.method1286();
	}
}
