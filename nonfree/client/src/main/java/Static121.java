import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public static int anInt7696;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "Lclient!gm;")
	public static Class87 aClass87_9;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "[Lclient!af;")
	public static Class7[] aClass7Array2 = new Class7[50];

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray154 = new boolean[200];

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[4];

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIBII)V")
	public static void method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static458.method6215(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static400.anIntArrayArray54[arg5];
		@Pc(46) int local46 = arg0 - local15;
		Static236.method3990(local46, arg0 - arg2, local42, arg4);
		@Pc(58) int local58 = local15 + arg0;
		Static236.method3990(local58, local46, local42, arg3);
		Static236.method3990(arg0 + arg2, local58, local42, arg4);
		while (local26 > local10) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static418.anIntArray250[local31] = local10;
				local31--;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(139) int local139;
			@Pc(143) int local143;
			@Pc(183) int local183;
			@Pc(187) int local187;
			@Pc(192) int local192;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local15 <= local26) {
					local127 = Static400.anIntArrayArray54[arg5 + local26];
					local134 = Static400.anIntArrayArray54[arg5 - local26];
					local139 = arg0 + local10;
					local143 = arg0 - local10;
					Static236.method3990(local139, local143, local127, arg4);
					Static236.method3990(local139, local143, local134, arg4);
				} else {
					local127 = Static400.anIntArrayArray54[local26 + arg5];
					local134 = Static400.anIntArrayArray54[arg5 - local26];
					local139 = Static418.anIntArray250[local26];
					local143 = local10 + arg0;
					local183 = arg0 - local10;
					local187 = local139 + arg0;
					local192 = arg0 - local139;
					Static236.method3990(local192, local183, local127, arg4);
					Static236.method3990(local187, local192, local127, arg3);
					Static236.method3990(local143, local187, local127, arg4);
					Static236.method3990(local192, local183, local134, arg4);
					Static236.method3990(local187, local192, local134, arg3);
					Static236.method3990(local143, local187, local134, arg4);
				}
			}
			local127 = Static400.anIntArrayArray54[arg5 + local10];
			local134 = Static400.anIntArrayArray54[arg5 - local10];
			local139 = local26 + arg0;
			local143 = arg0 - local26;
			if (local10 < local15) {
				local183 = local10 <= local31 ? local31 : Static418.anIntArray250[local10];
				local187 = arg0 + local183;
				local192 = arg0 - local183;
				Static236.method3990(local192, local143, local127, arg4);
				Static236.method3990(local187, local192, local127, arg3);
				Static236.method3990(local139, local187, local127, arg4);
				Static236.method3990(local192, local143, local134, arg4);
				Static236.method3990(local187, local192, local134, arg3);
				Static236.method3990(local139, local187, local134, arg4);
			} else {
				Static236.method3990(local139, local143, local127, arg4);
				Static236.method3990(local139, local143, local134, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)Z")
	public static boolean method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface12 local9 = (Interface12) Static278.method4397(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static124.method2327(local9) & true;
		}
		local9 = (Interface12) Static422.method5870(arg0, arg1, arg2, wo.class);
		if (local9 != null) {
			local11 &= Static124.method2327(local9);
		}
		local9 = (Interface12) Static241.method4021(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static124.method2327(local9);
		}
		return local11;
	}
}
