import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fha", name = "O", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!fha", name = "G", descriptor = "[S")
	private static final short[] aShortArray35 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fha", name = "I", descriptor = "[S")
	private static final short[] aShortArray36 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!fha", name = "M", descriptor = "[S")
	private static final short[] aShortArray37 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fha", name = "H", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { aShortArray35, aShortArray36, aShortArray37 };

	@OriginalMember(owner = "client!fha", name = "N", descriptor = "I")
	public static int anInt3361 = 0;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IILclient!jha;I)V")
	public static void method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28_Sub1_Sub4_Sub2_Sub2 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static686.method4970(local6, 0, local6.length, arg0);
		Static433.method6363(local6, arg1, arg2);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!el;[[BI)V")
	public static void method2939(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.anInt2904; local15++) {
			Static250.method3863();
			for (@Pc(21) int local21 = 0; local21 < Static201.anInt3834 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static626.anInt10238 >> 3; local25++) {
					@Pc(35) int local35 = Static396.anIntArrayArrayArray33[local15][local21][local25];
					if (local35 != -1) {
						@Pc(44) int local44 = local35 >> 24 & 0x3;
						if (!arg0.aBoolean248 || local44 == 0) {
							@Pc(55) int local55 = local35 >> 1 & 0x3;
							@Pc(61) int local61 = local35 >> 14 & 0x3FF;
							@Pc(67) int local67 = local35 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static611.anIntArray552.length; local79++) {
								if (Static611.anIntArray552[local79] == local77 && arg1[local79] != null) {
									arg0.method2602(Static208.aClass65_7, arg1[local79], local21 * 8, local25 * 8, local55, Static275.aClass106Array1, local15, local44, (local61 & 0x7) * 8, (local67 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2940(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static79.method1039(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static253.anInt4604; local29++) {
			@Pc(34) String local34 = Static326.aStringArray31[local29];
			if (local34.startsWith("*")) {
				local34 = local34.substring(1);
			}
			local34 = Static79.method1039(local34);
			if (local34 != null && local34.equals(local24)) {
				Static253.anInt4604--;
				for (@Pc(58) int local58 = local29; local58 < Static253.anInt4604; local58++) {
					Static326.aStringArray31[local58] = Static326.aStringArray31[local58 + 1];
					Static558.aStringArray43[local58] = Static558.aStringArray43[local58 + 1];
					Static592.anIntArray538[local58] = Static592.anIntArray538[local58 + 1];
					Static178.aStringArray23[local58] = Static178.aStringArray23[local58 + 1];
					Static297.anIntArray320[local58] = Static297.anIntArray320[local58 + 1];
					Static292.aBooleanArray23[local58] = Static292.aBooleanArray23[local58 + 1];
				}
				Static467.anInt7868 = Static370.anInt8567;
				@Pc(126) Class5_Sub21 local126 = Static64.method905(Static263.aClass49_1, Static657.aClass305_104);
				local126.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg0));
				local126.aClass5_Sub41_Sub2_1.method7854(arg0);
				Static495.method7092(local126);
				return;
			}
		}
	}
}
