import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "[I")
	public static final int[] anIntArray130 = new int[32];

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
	public static int anInt2917 = 0;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
	public static final int anInt2926 = 0;

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "Lclient!em;")
	public static final Class83 aClass83_66 = new Class83(106, 8);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!hb;BZ)V")
	public static void method2539(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static22.anInt572 >= 400) {
			return;
		}
		if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 != arg0) {
			@Pc(169) String local169;
			@Pc(95) int local95;
			if (arg0.anInt3583 == 0) {
				@Pc(52) boolean local52 = true;
				if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3584 != -1 && arg0.anInt3584 != -1) {
					@Pc(72) int local72 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580 <= arg0.anInt3580 ? arg0.anInt3580 : Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580;
					@Pc(83) int local83 = arg0.anInt3584 <= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3584 ? arg0.anInt3584 : Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3584;
					local95 = local72 * 10 / 100 + local83 + 5;
					@Pc(102) int local102 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580 - arg0.anInt3580;
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local95 < local102) {
						local52 = false;
					}
				}
				@Pc(125) String local125 = Static110.aClass42_2 == Static101.aClass42_1 ? Static375.aClass253_34.method5453(Static161.anInt3095) : Static375.aClass253_32.method5453(Static161.anInt3095);
				if (arg0.anInt3578 > arg0.anInt3580) {
					local169 = arg0.method2947() + (local52 ? Static590.method7875(arg0.anInt3580, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580) : "<col=ffffff>") + " (" + local125 + arg0.anInt3580 + "+" + (arg0.anInt3578 - arg0.anInt3580) + ")";
				} else {
					local169 = arg0.method2947() + (local52 ? Static590.method7875(arg0.anInt3580, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580) : "<col=ffffff>") + " (" + local125 + arg0.anInt3580 + ")";
				}
			} else if (arg0.anInt3583 == -1) {
				local169 = arg0.method2947();
			} else {
				local169 = arg0.method2947() + " (" + Static375.aClass253_33.method5453(Static161.anInt3095) + arg0.anInt3583 + ")";
			}
			if (Static563.aBoolean697 && !arg1 && (Static420.anInt7401 & 0x8) != 0) {
				Static385.method5573(21, 0, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> <col=ffffff>" + local169, (long) arg0.anInt7524, 0, -1);
			}
			if (arg1) {
				Static385.method5573(-1, 0, "<col=cccccc>" + local169, -1, true, false, "", 0L, 0, 0);
			} else {
				for (@Pc(296) int local296 = 7; local296 >= 0; local296--) {
					if (Static490.aStringArray33[local296] != null) {
						@Pc(304) short local304 = 0;
						if (Static101.aClass42_1 == Static354.aClass42_4 && Static490.aStringArray33[local296].equalsIgnoreCase(Static375.aClass253_27.method5453(Static161.anInt3095))) {
							if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580 < arg0.anInt3580) {
								local304 = 2000;
							}
							if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3612 != 0 && arg0.anInt3612 != 0) {
								if (arg0.anInt3612 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3612) {
									local304 = 2000;
								} else {
									local304 = 0;
								}
							}
						} else if (Static563.aBooleanArray39[local296]) {
							local304 = 2000;
						}
						@Pc(362) short local362 = (short) (local304 + Static115.aShortArray13[local296]);
						local95 = Static498.anIntArray38[local296] == -1 ? Static133.anInt2655 : Static498.anIntArray38[local296];
						Static385.method5573(local362, 0, Static490.aStringArray33[local296], local95, false, true, "<col=ffffff>" + local169, (long) arg0.anInt7524, 0, -1);
					}
				}
			}
			if (!arg1) {
				for (@Pc(412) Class1_Sub40 local412 = (Class1_Sub40) Static166.aClass111_49.method2547(); local412 != null; local412 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
					if (local412.anInt7819 == 23) {
						local412.aString89 = "<col=ffffff>" + local169;
						break;
					}
				}
			}
		} else if (Static563.aBoolean697 && (Static420.anInt7401 & 0x10) != 0) {
			Static385.method5573(12, 0, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> <col=ffffff>" + Static375.aClass253_41.method5453(Static161.anInt3095), 0L, 0, -1);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
	public static void method2540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1004) {
			Static451.method6304(Static43.aClass84_1, arg2, arg1);
		} else if (arg0 == 1009) {
			Static451.method6304(Static315.aClass84_5, arg2, arg1);
		} else if (arg0 == 1001) {
			Static451.method6304(Static275.aClass84_4, arg2, arg1);
		} else if (arg0 == 1008) {
			Static451.method6304(Static95.aClass84_2, arg2, arg1);
		} else if (arg0 == 1002) {
			Static451.method6304(Static339.aClass84_6, arg2, arg1);
		}
	}
}
