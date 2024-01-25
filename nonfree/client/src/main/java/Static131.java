import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray96 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!jh;")
	public static final Class6_Sub10_Sub1 aClass6_Sub10_Sub1_2 = new Class6_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public static int anInt2393 = -1;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!mb;IIIIIII)V")
	public static void method2541(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static36.aBoolean51) {
			Static263.anInt4786 = 32;
		} else {
			Static263.anInt4786 = 0;
		}
		Static36.aBoolean51 = false;
		@Pc(141) int local141;
		if (Static193.anInt3653 != 0) {
			if (arg4 >= arg2 && arg2 + 16 > arg4 && arg5 <= arg1 && arg5 + 16 > arg1) {
				arg0.anInt3578 -= 4;
				Static298.method5108(arg0);
			} else if (arg4 >= arg2 && arg4 < arg2 + 16 && arg3 + arg5 - 16 <= arg1 && arg1 < arg3 + arg5) {
				arg0.anInt3578 += 4;
				Static298.method5108(arg0);
			} else if (arg2 - Static263.anInt4786 <= arg4 && arg4 < Static263.anInt4786 + arg2 + 16 && arg5 + 16 <= arg1 && arg3 + arg5 - 16 > arg1) {
				local141 = arg3 * (arg3 - 32) / arg6;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(158) int local158 = arg1 - local141 / 2 - arg5 - 16;
				@Pc(165) int local165 = arg3 - local141 - 32;
				arg0.anInt3578 = local158 * (arg6 - arg3) / local165;
				Static298.method5108(arg0);
				Static36.aBoolean51 = true;
			}
		}
		if (Static346.anInt6269 == 0) {
			return;
		}
		local141 = arg0.anInt3507;
		if (arg4 >= arg2 - local141 && arg5 <= arg1 && arg4 < arg2 + 16 && arg1 <= arg5 + arg3) {
			arg0.anInt3578 += Static346.anInt6269 * 45;
			Static298.method5108(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Lclient!ho;")
	public static Class94 method2542() {
		try {
			return (Class94) Class.forName("Class94_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2543(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(23) short[] local23 = new short[16];
		@Pc(25) int local25 = 0;
		@Pc(31) int local31 = arg0 ? 32768 : 0;
		@Pc(40) int local40 = local31 + (arg0 ? Static104.anInt1920 : Static340.anInt655);
		for (@Pc(42) int local42 = local31; local42 < local40; local42++) {
			@Pc(48) Class6_Sub2_Sub7 local48 = Static333.method5536(local42);
			if (local48.aBoolean171 && local48.method2160().toLowerCase().indexOf(local8) != -1) {
				if (local25 >= 50) {
					Static322.anInt5280 = -1;
					Static283.aShortArray108 = null;
					return;
				}
				if (local23.length <= local25) {
					@Pc(83) short[] local83 = new short[local23.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local25; local85++) {
						local83[local85] = local23[local85];
					}
					local23 = local83;
				}
				local23[local25++] = (short) local42;
			}
		}
		Static283.aShortArray108 = local23;
		Static72.anInt1350 = 0;
		Static322.anInt5280 = local25;
		@Pc(118) String[] local118 = new String[Static322.anInt5280];
		for (@Pc(120) int local120 = 0; local120 < Static322.anInt5280; local120++) {
			local118[local120] = Static333.method5536(local23[local120]).method2160();
		}
		Static103.method2108(local118, Static283.aShortArray108);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ja;Lclient!nf;III)V")
	public static void method2544(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class187 local12;
		if (arg3 < Static310.anInt5828) {
			local12 = Static39.aClass187ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass44_Sub3_1 != null && local12.aClass44_Sub3_1.method5783()) {
				arg1.method5780(0, true, 128, 0, local12.aClass44_Sub3_1, arg0);
			}
		}
		if (arg4 < Static310.anInt5828) {
			local12 = Static39.aClass187ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass44_Sub3_1 != null && local12.aClass44_Sub3_1.method5783()) {
				arg1.method5780(0, true, 0, 128, local12.aClass44_Sub3_1, arg0);
			}
		}
		if (arg3 < Static310.anInt5828 && arg4 < Static163.anInt3084) {
			local12 = Static39.aClass187ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass44_Sub3_1 != null && local12.aClass44_Sub3_1.method5783()) {
				arg1.method5780(0, true, 128, 128, local12.aClass44_Sub3_1, arg0);
			}
		}
		if (arg3 < Static310.anInt5828 && arg4 > 0) {
			local12 = Static39.aClass187ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass44_Sub3_1 != null && local12.aClass44_Sub3_1.method5783()) {
				arg1.method5780(0, true, 128, -128, local12.aClass44_Sub3_1, arg0);
			}
		}
	}
}
