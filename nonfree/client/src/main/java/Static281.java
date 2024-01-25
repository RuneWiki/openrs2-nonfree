import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!nb;")
	public static final Class217 aClass217_4 = new Class217("stellardawn", 1);

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray12 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_3 = new Class165("", 15);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ln;BI[II[I)Lclient!jh;")
	public static Class1_Sub2 method4756(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (!arg0.method3874(Static526.aClass366_11, Static258.aClass160_9)) {
			@Pc(79) int[] local79 = new int[arg1 * arg3];
			for (local29 = 0; local29 < arg1; local29++) {
				local39 = arg3 * local29 + arg4[local29];
				for (local41 = 0; local41 < arg2[local29]; local41++) {
					local79[local39++] = -16777216;
				}
			}
			return new Class1_Sub2(arg0, arg3, arg1, local79);
		}
		@Pc(27) byte[] local27 = new byte[arg1 * arg3];
		for (local29 = 0; local29 < arg1; local29++) {
			local39 = local29 * arg3 + arg4[local29];
			for (local41 = 0; local41 < arg2[local29]; local41++) {
				local27[local39++] = -1;
			}
		}
		return new Class1_Sub2(arg0, arg3, arg1, local27);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
	public static boolean method4757(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/lang/String;IZLjava/lang/String;BZ)V")
	public static void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(6) boolean arg5) {
		Static31.aClass237_10.anInt7642 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg2 != -1) {
			@Pc(27) Class82 local27 = Static144.aClass274_1.method6933(arg2);
			if (local27 == null || local27.method2612() != arg3) {
				return;
			}
			if (local27.method2612()) {
				local18 = local27.aString33;
			} else {
				local16 = local27.anInt3023;
			}
		}
		@Pc(57) int local57 = 0;
		for (@Pc(59) int local59 = 0; local59 < Static497.aClass258_21.anInt8017; local59++) {
			@Pc(66) Class284 local66 = Static497.aClass258_21.method6652(local59);
			if ((!arg5 || local66.aBoolean605) && local66.anInt8566 == -1 && local66.anInt8555 == -1 && local66.anInt8525 == 0 && local66.aString88.toLowerCase().indexOf(local11) != -1) {
				if (arg2 != -1) {
					if (arg3) {
						if (!arg1.equals(local66.method7056(local18, arg2))) {
							continue;
						}
					} else if (arg0 != local66.method7058(arg2, local16)) {
						continue;
					}
				}
				if (local57 >= 250) {
					Static474.anInt8507 = -1;
					Static621.aShortArray148 = null;
					return;
				}
				if (local57 >= local14.length) {
					@Pc(134) short[] local134 = new short[local14.length * 2];
					for (@Pc(136) int local136 = 0; local136 < local57; local136++) {
						local134[local136] = local14[local136];
					}
					local14 = local134;
				}
				local14[local57++] = (short) local59;
			}
		}
		Static474.anInt8507 = local57;
		Static621.aShortArray148 = local14;
		Static169.anInt4129 = 0;
		@Pc(174) String[] local174 = new String[Static474.anInt8507];
		for (@Pc(176) int local176 = 0; local176 < Static474.anInt8507; local176++) {
			local174[local176] = Static497.aClass258_21.method6652(local14[local176]).aString88;
		}
		Static290.method4842(Static621.aShortArray148, local174);
		Static31.aClass237_10.method6325();
		Static31.aClass237_10.anInt7642 = 2;
	}
}
