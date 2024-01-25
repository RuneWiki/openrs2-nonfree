import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!qj;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
	public static final int[] anIntArray168 = new int[14];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZI)I")
	public static int method1670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static410.method5574(arg1 - 1, arg0 - 1) + Static410.method5574(arg1 - 1, arg0 + 1) + Static410.method5574(arg1 + 1, arg0 + -1) + Static410.method5574(arg1 + 1, arg0 + 1);
		@Pc(79) int local79 = Static410.method5574(arg1, arg0 - 1) + Static410.method5574(arg1, arg0 + 1) + Static410.method5574(arg1 - 1, arg0) + Static410.method5574(arg1 - -1, arg0);
		@Pc(84) int local84 = Static410.method5574(arg1, arg0);
		return local84 / 4 + local41 / 16 + local79 / 8;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!hd;II)V")
	public static void method1671(@OriginalArg(1) Class110 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static70.aBoolean94) {
			@Pc(179) Class247 local179 = Static134.anInt2452 == -1 ? null : Static435.aClass240_2.method5128(Static134.anInt2452);
			if (Static55.method752(arg0).method2793() && (Static115.anInt2115 & 0x20) != 0 && (local179 == null || arg0.method2065(Static134.anInt2452, local179.anInt6901) != local179.anInt6901)) {
				Static391.method5158(0L, arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, Static111.anInt2085, Static368.aString66 + " -> " + arg0.aString18, 58, false, Static304.aString54, true);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static14.method168(arg0, local5);
			if (local12 != null) {
				Static391.method5158((long) (local5 + 1), arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, Static196.method2805(local5, arg0), arg0.aString18, 1012, false, local12, true);
			}
		}
		local12 = Static106.method1587(arg0);
		if (local12 != null) {
			Static391.method5158(0L, arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, arg0.anInt2602, arg0.aString18, 12, false, local12, true);
		}
		for (@Pc(75) int local75 = 4; local75 >= 0; local75--) {
			@Pc(84) String local84 = Static14.method168(arg0, local75);
			if (local84 != null) {
				Static391.method5158((long) (local75 + 1), arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, Static196.method2805(local75, arg0), arg0.aString18, 47, false, local84, true);
			}
		}
		if (!Static55.method752(arg0).method2795()) {
			return;
		}
		if (arg0.aString20 == null) {
			Static391.method5158(0L, arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, -1, "", 4, false, Static57.aClass15_17.method180(Static429.anInt6999), true);
		} else {
			Static391.method5158(0L, arg0.anInt2588, arg0.anInt2675, arg0.anInt2585, -1, "", 4, false, arg0.aString20, true);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public static void method1672() {
		if (Static165.aBoolean224) {
			return;
		}
		if (Static413.aClass49_Sub1_1.aBoolean230) {
			Static439.aFloat99 = (int) Static439.aFloat99 - 17 & 0xFFFFFFF0;
		} else {
			Static390.aFloat102 += (-12.0F - Static390.aFloat102) / 2.0F;
		}
		Static333.aBoolean386 = true;
		Static165.aBoolean224 = true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1676(@OriginalArg(0) String arg0) {
		return Static420.method5666(arg0, 10);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZI)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local39);
		Static70.method1164(local39, true);
	}
}
