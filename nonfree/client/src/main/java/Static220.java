import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "[Lclient!s;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
	public static int anInt3575 = 1;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
	public static int anInt3580 = 0;

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "[I")
	public static final int[] anIntArray205 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B[[[Lclient!iia;)V")
	public static void method3147(@OriginalArg(1) Class174[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(12) Class174[][] local12 = arg0[local3];
			for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
				for (@Pc(18) int local18 = 0; local18 < local12[local14].length; local18++) {
					@Pc(26) Class174 local26 = local12[local14][local18];
					if (local26 != null) {
						if (local26.aClass8_Sub1_Sub1_1 instanceof Interface16) {
							((Interface16) local26.aClass8_Sub1_Sub1_1).method8093();
						}
						if (local26.aClass8_Sub1_Sub2_1 instanceof Interface16) {
							((Interface16) local26.aClass8_Sub1_Sub2_1).method8093();
						}
						if (local26.aClass8_Sub1_Sub2_2 instanceof Interface16) {
							((Interface16) local26.aClass8_Sub1_Sub2_2).method8093();
						}
						if (local26.aClass8_Sub1_Sub4_2 instanceof Interface16) {
							((Interface16) local26.aClass8_Sub1_Sub4_2).method8093();
						}
						if (local26.aClass8_Sub1_Sub4_1 instanceof Interface16) {
							((Interface16) local26.aClass8_Sub1_Sub4_1).method8093();
						}
						for (@Pc(88) Class273 local88 = local26.aClass273_67; local88 != null; local88 = local88.aClass273_114) {
							@Pc(93) Class8_Sub1_Sub3 local93 = local88.aClass8_Sub1_Sub3_1;
							if (local93 instanceof Interface16) {
								((Interface16) local93).method8093();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 < 1 || arg5 < 1 || arg2 > Static544.anInt9261 - 2 || Static282.anInt4887 - 2 < arg5) {
			return;
		}
		@Pc(43) int local43 = arg3;
		if (arg3 < 3 && Static90.method1353(1, arg5, arg2)) {
			local43 = arg3 + 1;
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0 && !Static602.method8660(local43, arg5, Static559.anInt9430, arg2)) {
			return;
		}
		if (Static260.aClass174ArrayArrayArray2 == null) {
			return;
		}
		Static38.aClass153_Sub1_1.method3027(arg3, Static670.aClass88Array1[arg3], Static457.aClass57_11, arg2, arg0, arg5);
		if (arg7 < 0) {
			return;
		}
		@Pc(94) int local94 = Static637.aClass5_Sub20_31.aClass24_Sub18_1.method6492();
		Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub18_1);
		Static38.aClass153_Sub1_1.method3028(Static457.aClass57_11, Static670.aClass88Array1[arg3], arg4, arg5, arg1, arg2, local43, arg6, arg7, arg3);
		Static637.aClass5_Sub20_31.method3194(local94, Static637.aClass5_Sub20_31.aClass24_Sub18_1);
		return;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBILclient!ev;I)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub15 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg0 << 28 | arg1 << 14);
		@Pc(30) Class5_Sub25 local30 = (Class5_Sub25) Static466.aClass291_33.method6993(local16, 1);
		if (local30 == null) {
			local30 = new Class5_Sub25();
			Static466.aClass291_33.method6984(local16, local30);
			local30.aClass102_34.method1921(arg2);
			return;
		}
		@Pc(53) Class204 local53 = Static201.aClass127_1.method2501(arg2.anInt2420);
		@Pc(56) int local56 = local53.anInt5683;
		if (local53.anInt5690 == 1) {
			local56 *= arg2.anInt2422 + 1;
		}
		for (@Pc(73) Class5_Sub15 local73 = (Class5_Sub15) local30.aClass102_34.method1916(); local73 != null; local73 = (Class5_Sub15) local30.aClass102_34.method1915()) {
			local53 = Static201.aClass127_1.method2501(local73.anInt2420);
			@Pc(84) int local84 = local53.anInt5683;
			if (local53.anInt5690 == 1) {
				local84 *= local73.anInt2422 + 1;
			}
			if (local84 < local56) {
				Static297.method4390(local73, arg2);
				return;
			}
		}
		local30.aClass102_34.method1921(arg2);
	}

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "(I)V")
	public static void method3152() {
		Static341.aClass134Array8 = null;
		Static130.aClass134Array3 = null;
		Static441.aClass134Array11 = null;
		Static673.aClass134Array16 = null;
		Static264.aClass134_25 = null;
		Static271.aClass134Array6 = null;
		Static488.aClass134Array12 = null;
		Static350.aClass134Array9 = null;
		Static41.aClass80_2 = null;
		Static533.aClass80_10 = null;
		Static582.aClass80_12 = null;
		Static575.aClass134Array15 = null;
		Static530.aClass134Array14 = null;
		Static56.aClass134Array10 = null;
		Static34.aClass134Array1 = null;
		Static318.aClass134_28 = null;
		Static300.aClass134Array7 = null;
		Static131.aClass134Array4 = null;
	}
}
