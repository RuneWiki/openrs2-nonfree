import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_161 = new Class211(95, 2);

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt6301 = -1;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Z")
	public static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
	public static void method5474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		Static382.method5419(Static369.anIntArrayArray35[arg3], arg1 - arg2, arg2 + arg1, arg0);
		@Pc(35) int local35 = -1;
		while (local15 < local17) {
			local35 += 2;
			local15++;
			local20 += local35;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(58) int[] local58 = Static369.anIntArrayArray35[arg3 + local17];
				@Pc(65) int[] local65 = Static369.anIntArrayArray35[arg3 - local17];
				@Pc(69) int local69 = local15 + arg1;
				@Pc(74) int local74 = arg1 - local15;
				Static382.method5419(local58, local74, local69, arg0);
				Static382.method5419(local65, local74, local69, arg0);
			}
			@Pc(90) int local90 = local17 + arg1;
			@Pc(94) int local94 = arg1 - local17;
			@Pc(100) int[] local100 = Static369.anIntArrayArray35[local15 + arg3];
			@Pc(107) int[] local107 = Static369.anIntArrayArray35[arg3 - local15];
			Static382.method5419(local100, local94, local90, arg0);
			Static382.method5419(local107, local94, local90, arg0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!bg;ZI)V")
	public static void method5476(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static215.anInt3678 >= 400 || arg0 == Static321.aClass25_Sub1_Sub1_Sub1_2) {
			return;
		}
		@Pc(147) String local147;
		@Pc(66) int local66;
		if (arg0.anInt602 == 0) {
			@Pc(21) boolean local21 = true;
			if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt584 != -1 && arg0.anInt584 != -1) {
				@Pc(45) int local45 = arg0.anInt607 >= Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607 ? arg0.anInt607 : Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607;
				@Pc(56) int local56 = arg0.anInt584 > Static321.aClass25_Sub1_Sub1_Sub1_2.anInt584 ? Static321.aClass25_Sub1_Sub1_Sub1_2.anInt584 : arg0.anInt584;
				local66 = local56 + local45 * 10 / 100 + 5;
				@Pc(73) int local73 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607 - arg0.anInt607;
				if (local73 < 0) {
					local73 = -local73;
				}
				if (local73 > local66) {
					local21 = false;
				}
			}
			@Pc(103) String local103 = Static360.aClass94_7 == Static313.aClass94_8 ? Static379.aClass169_331.method3680(Static48.anInt952) : Static145.aClass169_130.method3680(Static48.anInt952);
			if (arg0.anInt601 > arg0.anInt607) {
				local147 = arg0.method462() + (local21 ? Static280.method4288(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607, arg0.anInt607) : "<col=ffffff>") + " (" + local103 + arg0.anInt607 + "+" + (arg0.anInt601 - arg0.anInt607) + ")";
			} else {
				local147 = arg0.method462() + (local21 ? Static280.method4288(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607, arg0.anInt607) : "<col=ffffff>") + " (" + local103 + arg0.anInt607 + ")";
			}
		} else {
			local147 = arg0.method462() + " (" + Static172.aClass169_161.method3680(Static48.anInt952) + arg0.anInt602 + ")";
		}
		if (Static90.aBoolean144) {
			if (!arg1 && (Static176.anInt3186 & 0x8) != 0) {
				Static337.method4814((long) arg0.anInt2331, 5, true, Static215.anInt3687, Static28.aString7 + " -> <col=ffffff>" + local147, Static114.aString18, 0, -1, false, 0);
			}
		} else if (arg1) {
			Static337.method4814(0L, -1, false, -1, "", "<col=cccccc>" + local147, 0, 0, true, 0);
		} else {
			for (@Pc(244) int local244 = 7; local244 >= 0; local244--) {
				if (Static134.aStringArray38[local244] != null) {
					@Pc(252) short local252 = 0;
					if (Static313.aClass94_8 == Static59.aClass94_3 && Static134.aStringArray38[local244].equalsIgnoreCase(Static38.aClass169_31.method3680(Static48.anInt952))) {
						if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607 < arg0.anInt607) {
							local252 = 2000;
						}
						if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt594 != 0 && arg0.anInt594 != 0) {
							if (arg0.anInt594 == Static321.aClass25_Sub1_Sub1_Sub1_2.anInt594) {
								local252 = 2000;
							} else {
								local252 = 0;
							}
						}
					} else if (Static90.aBooleanArray8[local244]) {
						local252 = 2000;
					}
					@Pc(313) short local313 = (short) (Static334.aShortArray98[local244] + local252);
					local66 = Static303.anIntArray611[local244] == -1 ? Static260.anInt4514 : Static303.anIntArray611[local244];
					Static337.method4814((long) arg0.anInt2331, local313, true, local66, "<col=ffffff>" + local147, Static134.aStringArray38[local244], 0, -1, false, 0);
				}
			}
		}
		if (arg1) {
			return;
		}
		for (@Pc(389) Class1_Sub40 local389 = (Class1_Sub40) Static358.aClass17_66.method202(); local389 != null; local389 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			if (local389.anInt5411 == 51) {
				local389.aString63 = "<col=ffffff>" + local147;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
	public static boolean method5477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static65.aBoolean115) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static137.aClass117ArrayArray1[local13] == null || Static137.aClass117ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(43) Class117 local43 = Static137.aClass117ArrayArray1[local13][local17];
		@Pc(55) Class1_Sub40 local55;
		if (arg0 == -1 && local43.anInt3108 == 0) {
			for (local55 = (Class1_Sub40) Static358.aClass17_66.method202(); local55 != null; local55 = (Class1_Sub40) Static358.aClass17_66.method207()) {
				if (local55.anInt5411 == 46 || local55.anInt5411 == 1006 || local55.anInt5411 == 30 || local55.anInt5411 == 50 || local55.anInt5411 == 13) {
					for (@Pc(84) Class117 local84 = Static13.method107(local55.anInt5413); local84 != null; local84 = Static258.method3962(local84)) {
						if (local43.anInt3093 == local84.anInt3093) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class1_Sub40) Static358.aClass17_66.method202(); local55 != null; local55 = (Class1_Sub40) Static358.aClass17_66.method207()) {
				if (local55.anInt5414 == arg0 && local55.anInt5413 == local43.anInt3093 && (local55.anInt5411 == 46 || local55.anInt5411 == 1006 || local55.anInt5411 == 30 || local55.anInt5411 == 50 || local55.anInt5411 == 13)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5478(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static404.method4337(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
