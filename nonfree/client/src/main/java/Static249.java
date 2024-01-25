import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt4739;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([IBII[J)V")
	public static void method3736(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg2; local56++) {
			if ((long) (local54 & local56) + local20 > arg3[local56]) {
				@Pc(77) long local77 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16] = local77;
				@Pc(91) int local91 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local91;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method3736(arg0, arg1, local16 - 1, arg3);
		method3736(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3737(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local6 + local8);
		for (@Pc(40) int local40 = 0; local40 < local6; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local45 == '<') {
				local38.append("<lt>");
			} else if (local45 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local45);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ln;Z)V")
	public static void method3738(@OriginalArg(1) Class7_Sub2_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static158.anInt3162 >= 400) {
			return;
		}
		if (arg0 != Static379.aClass7_Sub2_Sub3_Sub2_2) {
			@Pc(174) String local174;
			@Pc(107) int local107;
			if (arg0.anInt4408 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4440 != -1 && arg0.anInt4440 != -1) {
					@Pc(86) int local86 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414 > arg0.anInt4414 ? Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414 : arg0.anInt4414;
					@Pc(97) int local97 = arg0.anInt4440 > Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4440 ? Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4440 : arg0.anInt4440;
					local107 = local86 * 10 / 100 + local97 + 5;
					@Pc(113) int local113 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414 - arg0.anInt4414;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local107 < local113) {
						local61 = false;
					}
				}
				@Pc(139) String local139 = Static57.aClass183_3 == Static297.aClass183_4 ? Static28.aClass189_24.method4262(Static53.anInt1454) : Static17.aClass189_10.method4262(Static53.anInt1454);
				if (arg0.anInt4410 <= arg0.anInt4414) {
					local174 = arg0.method3525() + (local61 ? Static379.method4942(arg0.anInt4414, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414) : "<col=ffffff>") + " (" + local139 + arg0.anInt4414 + ")";
				} else {
					local174 = arg0.method3525() + (local61 ? Static379.method4942(arg0.anInt4414, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414) : "<col=ffffff>") + " (" + local139 + arg0.anInt4414 + "+" + (arg0.anInt4410 - arg0.anInt4414) + ")";
				}
			} else {
				local174 = arg0.method3525() + " (" + Static419.aClass189_226.method4262(Static53.anInt1454) + arg0.anInt4408 + ")";
			}
			if (Static446.aBoolean648) {
				if (!arg1 && (Static279.anInt4322 & 0x8) != 0) {
					Static102.method1792(Static415.aString62 + " -> <col=ffffff>" + local174, (long) arg0.anInt4391, Static141.anInt2928, 0, true, Static189.aString34, false, 0, -1, 6);
				}
			} else if (arg1) {
				Static102.method1792("", 0L, -1, 0, false, "<col=cccccc>" + local174, true, 0, 0, -1);
			} else {
				for (@Pc(245) int local245 = 7; local245 >= 0; local245--) {
					if (Static430.aStringArray31[local245] != null) {
						@Pc(253) short local253 = 0;
						if (Static300.aClass183_5 == Static57.aClass183_3 && Static430.aStringArray31[local245].equalsIgnoreCase(Static408.aClass189_221.method4262(Static53.anInt1454))) {
							if (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414 < arg0.anInt4414) {
								local253 = 2000;
							}
							if (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4439 != 0 && arg0.anInt4439 != 0) {
								if (arg0.anInt4439 == Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4439) {
									local253 = 2000;
								} else {
									local253 = 0;
								}
							}
						} else if (Static32.aBooleanArray7[local245]) {
							local253 = 2000;
						}
						@Pc(306) short local306 = (short) (local253 + Static163.aShortArray126[local245]);
						local107 = Static455.anIntArray535[local245] == -1 ? Static366.anInt6171 : Static455.anIntArray535[local245];
						Static102.method1792("<col=ffffff>" + local174, (long) arg0.anInt4391, local107, 0, true, Static430.aStringArray31[local245], false, 0, -1, local306);
					}
				}
			}
			if (!arg1) {
				for (@Pc(409) Class3_Sub14 local409 = (Class3_Sub14) Static184.aClass243_21.method5208(); local409 != null; local409 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
					if (local409.anInt2182 == 16) {
						local409.aString12 = "<col=ffffff>" + local174;
						return;
					}
				}
			}
		} else if (Static446.aBoolean648 && (Static279.anInt4322 & 0x10) != 0) {
			Static102.method1792(Static415.aString62 + " -> <col=ffffff>" + Static208.aClass189_128.method4262(Static53.anInt1454), 0L, Static141.anInt2928, 0, true, Static189.aString34, false, 0, -1, 57);
		}
	}
}
