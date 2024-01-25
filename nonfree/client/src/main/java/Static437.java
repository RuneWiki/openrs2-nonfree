import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt7251;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
	public static final int[] anIntArray550 = new int[13];

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_260 = new Class56(95, 3);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt7254 = 2;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)[B")
	public static byte[] method5813(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static461.method1985(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5814(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static438.anInt2796;
		@Pc(13) int[] local13 = Static78.anIntArray114;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class8_Sub3_Sub1_Sub1 local25 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local13[local17]];
			if (local25 != null && Static401.aClass8_Sub3_Sub1_Sub1_2 != local25 && local25.aString60 != null && local25.aString60.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static448.method5935(Static68.aClass146_27);
					Static247.aClass4_Sub9_Sub2_2.method5018(local13[local17]);
					Static247.aClass4_Sub9_Sub2_2.method4999(0);
				} else if (arg1 == 4) {
					Static448.method5935(Static16.aClass146_11);
					Static247.aClass4_Sub9_Sub2_2.method4999(0);
					Static247.aClass4_Sub9_Sub2_2.method5029(local13[local17]);
				} else if (arg1 == 5) {
					Static448.method5935(Static325.aClass146_72);
					Static247.aClass4_Sub9_Sub2_2.method5029(local13[local17]);
					Static247.aClass4_Sub9_Sub2_2.method5058(0);
				} else if (arg1 == 6) {
					Static448.method5935(Static297.aClass146_67);
					Static247.aClass4_Sub9_Sub2_2.method5029(local13[local17]);
					Static247.aClass4_Sub9_Sub2_2.method5035(0);
				} else if (arg1 == 7) {
					Static448.method5935(Static237.aClass146_83);
					Static247.aClass4_Sub9_Sub2_2.method5018(local13[local17]);
					Static247.aClass4_Sub9_Sub2_2.method4996(0);
				}
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static392.method5198(Static9.aClass15_86.method180(Static429.anInt6999) + arg0);
		}
	}
}
