import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public static int anInt1776;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Lclient!hi;")
	public static Class61 aClass61_3 = new Class61();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBILclient!ff;I)V")
	public static void method1380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) int arg3) {
		if (Static134.anInt2945 >= 400) {
			return;
		}
		if (arg2.anIntArray148 != null) {
			arg2 = arg2.method1283();
		}
		if (arg2 == null || !arg2.aBoolean111) {
			return;
		}
		@Pc(40) String local40 = arg2.aString89;
		if (arg2.anInt1535 != 0) {
			@Pc(54) String local54 = Static87.anInt1946 == 1 ? Static146.aString185 : Static25.aString37;
			local40 = local40 + Static207.method3774(arg2.anInt1535, Static197.aClass14_Sub2_Sub1_2.anInt1719) + " (" + local54 + arg2.anInt1535 + ")";
		}
		if (Static191.anInt3934 == 1) {
			Static181.method3039((short) 57, Static162.anInt3469, Static163.aString203, arg0, (long) arg1, Static194.aString237 + " -> <col=ffff00>" + local40, arg3);
		} else if (Static125.aBoolean209) {
			@Pc(334) Class1_Sub2_Sub12 local334 = Static13.anInt260 == -1 ? null : Static31.method645(Static13.anInt260);
			if ((Static10.anInt246 & 0x2) != 0 && (local334 == null || arg2.method1279(Static13.anInt260, local334.anInt2582) != local334.anInt2582)) {
				Static181.method3039((short) 49, Static54.anInt1188, Static8.aString15, arg0, (long) arg1, Static170.aString213 + " -> <col=ffff00>" + local40, arg3);
			}
		} else {
			@Pc(91) String[] local91 = arg2.aStringArray21;
			if (Static21.aBoolean33) {
				local91 = Static191.method3156(local91);
			}
			@Pc(101) int local101;
			if (local91 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local91[local101] != null && (Static87.anInt1946 != 0 || !local91[local101].equalsIgnoreCase(Static141.aString177))) {
						@Pc(124) int local124 = -1;
						@Pc(126) byte local126 = 0;
						if (arg2.anInt1568 == local101) {
							local124 = arg2.anInt1565;
						}
						if (local101 == 0) {
							local126 = 8;
						}
						if (arg2.anInt1552 == local101) {
							local124 = arg2.anInt1544;
						}
						if (local101 == 1) {
							local126 = 7;
						}
						if (local101 == 2) {
							local126 = 35;
						}
						if (local101 == 3) {
							local126 = 3;
						}
						if (local101 == 4) {
							local126 = 12;
						}
						Static181.method3039(local126, local124, local91[local101], arg0, (long) arg1, "<col=ffff00>" + local40, arg3);
					}
				}
			}
			if (Static87.anInt1946 == 0 && local91 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local91[local101] != null && local91[local101].equalsIgnoreCase(Static141.aString177)) {
						@Pc(232) short local232 = 0;
						@Pc(234) short local234 = 0;
						if (local101 == 0) {
							local234 = 8;
						}
						if (Static197.aClass14_Sub2_Sub1_2.anInt1719 < arg2.anInt1535) {
							local232 = 2000;
						}
						if (local101 == 1) {
							local234 = 7;
						}
						if (local101 == 2) {
							local234 = 35;
						}
						if (local101 == 3) {
							local234 = 3;
						}
						if (local101 == 4) {
							local234 = 12;
						}
						if (local234 != 0) {
							local234 += local232;
						}
						Static181.method3039(local234, arg2.anInt1541, local91[local101], arg0, (long) arg1, "<col=ffff00>" + local40, arg3);
					}
				}
			}
			Static181.method3039((short) 1007, Static151.anInt5601, Static176.aString219, arg0, (long) arg1, "<col=ffff00>" + local40, arg3);
		}
	}
}
