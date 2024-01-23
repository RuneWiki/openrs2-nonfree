import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[[Lclient!jb;")
	public static Class1_Sub15[][] aClass1_Sub15ArrayArray30;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	public static int anInt4306;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 aClass1_Sub5_Sub6_Sub1_4;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString151 = "rating: ";

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
	public static boolean aBoolean388 = true;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	public static int anInt4307 = 0;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	public static void method3682() {
		Static176.aClass157ArrayArray1 = new Class157[Static273.aClass119_85.method3234()][];
		Static196.aBooleanArray16 = new boolean[Static273.aClass119_85.method3234()];
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)Lclient!bn;")
	public static Class18 method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class18 local14 = local7.aClass18_1;
			local7.aClass18_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
	public static void method3684() {
		if (!Static187.aBoolean318) {
			return;
		}
		@Pc(11) Class157 local11 = Static209.method3469(Static315.anInt5631, Static75.anInt1991);
		if (local11 != null && local11.anObjectArray8 != null) {
			@Pc(22) Class1_Sub29 local22 = new Class1_Sub29();
			local22.aClass157_13 = local11;
			local22.anObjectArray2 = local11.anObjectArray8;
			Static5.method104(local22);
		}
		Static293.anInt5296 = -1;
		Static187.aBoolean318 = false;
		Static224.method3621(local11);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class171 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class171(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass171_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class171(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass171_1 = local12;
		} else {
			@Pc(134) Class131 local134 = new Class131(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static254.aClass1_Sub16ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass131_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method3686() {
		Static155.anInt3106 = 0;
		@Pc(8) int local8 = (Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7) + Static38.anInt714;
		@Pc(15) int local15 = Static135.anInt2659 + (Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7);
		if (local8 >= 3053 && local8 <= 3156 && local15 >= 3056 && local15 <= 3136) {
			Static155.anInt3106 = 1;
		}
		if (local8 >= 3072 && local8 <= 3118 && local15 >= 9492 && local15 <= 9535) {
			Static155.anInt3106 = 1;
		}
		if (Static155.anInt3106 == 1 && local8 >= 3139 && local8 <= 3199 && local15 >= 3008 && local15 <= 3062) {
			Static155.anInt3106 = 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3687(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
