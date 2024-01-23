import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public static int anInt4868;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[I")
	public static int[] anIntArray440 = new int[100];

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "[S")
	public static short[] aShortArray77 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "[I")
	public static int[] anIntArray441 = new int[500];

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
	public static boolean aBoolean348 = true;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILclient!gi;Lclient!id;)V")
	public static void method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub10 arg2, @OriginalArg(4) Class81 arg3) {
		@Pc(18) int local18;
		if (arg3.anIntArray186 != null) {
			@Pc(14) int[] local14 = new int[arg3.anIntArray186.length];
			@Pc(16) boolean local16 = false;
			for (local18 = 0; local18 < local14.length / 2; local18++) {
				@Pc(41) int local41 = arg2.anInt1630 - arg3.anIntArray186[local18 * 2 + 1];
				@Pc(52) int local52 = arg3.anIntArray186[local18 * 2] + arg2.anInt1633;
				@Pc(74) int local74 = local14[local18 * 2] = Static58.anInt2568 + (Static58.anInt2569 - Static58.anInt2568) * (local52 - Static58.anInt2570) / (Static58.anInt2565 - Static58.anInt2570);
				@Pc(97) int local97 = local14[local18 * 2 + 1] = (local41 - Static58.anInt2564) * (Static58.anInt2566 - Static58.anInt2567) / (Static58.anInt2571 - Static58.anInt2564) + Static58.anInt2567;
				if (Static58.anInt2568 < local74 && Static58.anInt2569 > local74 && local97 > Static58.anInt2567 && Static58.anInt2566 > local97) {
					local16 = true;
				}
			}
			if (!local16) {
				return;
			}
			Static65.method1105(local14, arg3.anInt2191, arg3.anInt2191 >>> 24);
			for (local18 = 0; local18 < local14.length / 2 - 1; local18++) {
				Static41.method753(local14[local18 * 2], local14[local18 * 2 + 1], local14[(local18 + 1) * 2], local14[local18 * 2 + 1 + 2], arg3.anInt2203, arg3.anInt2203 >>> 24);
			}
			Static41.method753(local14[local14.length - 2], local14[local14.length - 1], local14[0], local14[1], arg3.anInt2203, arg3.anInt2203 >>> 24);
		} else if (arg2.aBoolean127) {
			return;
		}
		@Pc(228) Class1_Sub11 local228 = new Class1_Sub11(arg2);
		@Pc(236) Class103_Sub2 local236 = null;
		if (arg3.anInt2196 != -1) {
			if (arg2.aBoolean126 && arg3.anInt2211 != -1) {
				local236 = (Class103_Sub2) arg3.method1805(true, true);
			} else {
				local236 = (Class103_Sub2) arg3.method1805(false, true);
			}
			if (local236 != null) {
				if (Static137.anInt2704 > 0 && (Static283.anInt5402 != -1 && arg2.anInt1638 == Static283.anInt5402 || Static299.anInt5666 != -1 && Static299.anInt5666 == arg3.anInt2195)) {
					if (Static314.anInt5911 <= 50) {
						local18 = Static314.anInt5911 * 3;
					} else {
						local18 = (100 - Static314.anInt5911) * 3;
					}
					Static41.method749(arg2.anInt1632, arg2.anInt1637, local236.anInt5857 / 2 + 7, 16776960, local18);
					Static41.method749(arg2.anInt1632, arg2.anInt1637, local236.anInt5857 / 2 + 5, 16776960, local18);
					Static41.method749(arg2.anInt1632, arg2.anInt1637, local236.anInt5857 / 2 + 3, 16776960, local18);
					Static41.method749(arg2.anInt1632, arg2.anInt1637, local236.anInt5857 / 2 + 1, 16776960, local18);
					Static41.method749(arg2.anInt1632, arg2.anInt1637, local236.anInt5857 / 2, 16776960, local18);
				}
				local236.method4594(arg2.anInt1632 - (local236.anInt5857 >> 1), arg2.anInt1637 - (local236.anInt5858 >> 1));
				local228.anInt1107 = arg2.anInt1632 + arg0 + (local236.anInt5857 >> 1);
				local228.anInt1110 = arg0 + arg2.anInt1632 - (local236.anInt5857 >> 1);
				local228.anInt1108 = arg2.anInt1637 + arg1 + (local236.anInt5858 >> 1);
				local228.anInt1105 = arg2.anInt1637 + arg1 - (local236.anInt5858 >> 1);
			}
		}
		if (arg3.aString84 != null) {
			if (local236 == null) {
				Static49.method855(arg0, 0, arg1, arg3, true, local228, arg2);
			} else {
				Static49.method855(arg0, (local236.anInt5858 >> 1) + 5, arg1, arg3, false, local228, arg2);
			}
		}
		if (local228.method977(Static152.anInt3132, Static300.anInt5678) && arg3.aStringArray21 != null) {
			if (arg3.aStringArray21[4] != null) {
				Static59.method1004((short) 1012, arg3.aStringArray21[4], -1, arg3.anInt2195, arg3.aString85, 0, (long) arg2.anInt1638);
			}
			if (arg3.aStringArray21[3] != null) {
				Static59.method1004((short) 1009, arg3.aStringArray21[3], -1, arg3.anInt2195, arg3.aString85, 0, (long) arg2.anInt1638);
			}
			if (arg3.aStringArray21[2] != null) {
				Static59.method1004((short) 1005, arg3.aStringArray21[2], -1, arg3.anInt2195, arg3.aString85, 0, (long) arg2.anInt1638);
			}
			if (arg3.aStringArray21[1] != null) {
				Static59.method1004((short) 1011, arg3.aStringArray21[1], -1, arg3.anInt2195, arg3.aString85, 0, (long) arg2.anInt1638);
			}
			if (arg3.aStringArray21[0] != null) {
				Static59.method1004((short) 1010, arg3.aStringArray21[0], -1, arg3.anInt2195, arg3.aString85, 0, (long) arg2.anInt1638);
			}
		}
		Static234.aClass24_23.method473(local228);
	}
}
