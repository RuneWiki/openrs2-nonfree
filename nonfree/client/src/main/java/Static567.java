import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "[I")
	public static final int[] anIntArray587 = new int[8];

	@OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
	public static int anInt9650 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BII)V")
	public static void method7976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 5);
		local8.method8631();
		local8.anInt10489 = arg1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIZ)V")
	public static void method7978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static493.aClass307_47.method7424((long) arg0) != null) {
			return;
		}
		if (Static116.aBoolean240) {
			@Pc(26) Class3_Sub24 local26 = new Class3_Sub24(arg0, new Class187_Sub1(4096, Static515.aClass181_107, arg0), arg1, arg2);
			local26.aClass187_Sub1_1.method5763(Static62.aStringArray7[Static380.anInt7247]);
			Static493.aClass307_47.method7425((long) arg0, local26);
		} else {
			Static315.method5367(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLclient!tn;)Lclient!uu;")
	public static Class3_Sub2 method7979(@OriginalArg(1) Class3_Sub15 arg0) {
		arg0.method8401();
		@Pc(18) int local18 = arg0.method8401();
		@Pc(22) Class3_Sub2 local22 = Static569.method7992(local18);
		local22.anInt10146 = arg0.method8401();
		@Pc(31) int local31 = arg0.method8401();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method8401();
			local22.method8335(local39, arg0);
		}
		local22.method8332();
		return local22;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIZIII)V")
	public static void method7984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg2 < 1 || Static394.anInt7540 - 2 < arg3 || arg2 > Static462.anInt8391 - 2) {
			return;
		}
		@Pc(33) int local33 = arg6;
		if (arg6 < 3 && Static525.method7485(arg2, arg3)) {
			local33 = arg6 + 1;
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0 && !Static394.method6311(arg3, Static630.anInt10396, local33, arg2)) {
			return;
		}
		if (Static170.aClass106ArrayArrayArray1 == null) {
			return;
		}
		Static593.aClass132_Sub1_2.method7717(arg5, arg2, Static334.aClass291Array20[arg6], arg3, Static47.aClass33_3, arg6);
		if (arg7 < 0) {
			return;
		}
		@Pc(82) int local82 = Static552.aClass3_Sub48_30.aClass23_Sub12_1.method3750();
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub12_1, 1);
		Static593.aClass132_Sub1_2.method7721(Static47.aClass33_3, arg7, local33, arg2, arg0, arg4, arg1, arg3, Static334.aClass291Array20[arg6], arg6);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub12_1, local82);
		return;
	}
}
