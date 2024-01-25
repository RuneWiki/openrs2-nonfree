import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "[I")
	public static int[] anIntArray290 = new int[1];

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
	public static int anInt5425 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	public static void method4648() {
		Static520.method7890(Static74.aClass2_Sub13_5.aClass14_Sub14_1.method5289());
		@Pc(20) int local20 = (Static135.anInt3347 >> 12) + (Static84.anInt2565 >> 3);
		@Pc(28) int local28 = (Static32.anInt723 >> 3) + (Static621.anInt10870 >> 12);
		Static12.anInt172 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 = 0;
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5219(8, 8);
		Static8.anIntArray10 = new int[18];
		Static85.aByteArrayArray5 = new byte[18][];
		Static296.anIntArrayArray31 = new int[18][4];
		Static9.anIntArray11 = new int[18];
		Static557.aByteArrayArray24 = new byte[18][];
		Static431.anIntArray533 = new int[18];
		Static475.anIntArray654 = new int[18];
		Static619.anIntArray701 = new int[18];
		Static123.aByteArrayArray10 = new byte[18][];
		Static300.anIntArray106 = new int[18];
		Static268.aByteArrayArray14 = new byte[18][];
		Static377.aByteArrayArray17 = new byte[18][];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local20 - (Static47.anInt1794 >> 4)) / 8; local93 <= (local20 + (Static47.anInt1794 >> 4)) / 8; local93++) {
			for (local104 = (local28 - (Static209.anInt4742 >> 4)) / 8; local104 <= (local28 + (Static209.anInt4742 >> 4)) / 8; local104++) {
				@Pc(112) int local112 = local104 + (local93 << 8);
				Static431.anIntArray533[local84] = local112;
				Static9.anIntArray11[local84] = Static316.aClass157_158.method4571("m" + local93 + "_" + local104);
				Static300.anIntArray106[local84] = Static316.aClass157_158.method4571("l" + local93 + "_" + local104);
				Static8.anIntArray10[local84] = Static316.aClass157_158.method4571("n" + local93 + "_" + local104);
				Static619.anIntArray701[local84] = Static316.aClass157_158.method4571("um" + local93 + "_" + local104);
				Static475.anIntArray654[local84] = Static316.aClass157_158.method4571("ul" + local93 + "_" + local104);
				if (Static8.anIntArray10[local84] == -1) {
					Static9.anIntArray11[local84] = -1;
					Static300.anIntArray106[local84] = -1;
					Static619.anIntArray701[local84] = -1;
					Static475.anIntArray654[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static8.anIntArray10.length; local104++) {
			Static8.anIntArray10[local104] = -1;
			Static9.anIntArray11[local104] = -1;
			Static300.anIntArray106[local104] = -1;
			Static619.anIntArray701[local104] = -1;
			Static475.anIntArray654[local104] = -1;
		}
		@Pc(282) byte local282;
		if (Static529.anInt9623 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static562.method8437(local28, local20, local282, false);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([Lclient!mi;I)V")
	public static void method4656(@OriginalArg(0) Class46[] arg0) {
		Static15.anInt272 = arg0.length;
		Static437.anIntArray536 = new int[Static15.anInt272 + 10];
		Static117.aClass46Array5 = new Class46[Static15.anInt272 + 10];
		Static653.method7721(arg0, 0, Static117.aClass46Array5, 0, Static15.anInt272);
		for (@Pc(26) int local26 = 0; local26 < Static15.anInt272; local26++) {
			Static437.anIntArray536[local26] = Static117.aClass46Array5[local26].method6219();
		}
		for (@Pc(50) int local50 = Static15.anInt272; local50 < Static117.aClass46Array5.length; local50++) {
			Static437.anIntArray536[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!qo;III)Lclient!eba;")
	public static Class85_Sub1_Sub1 method4659(@OriginalArg(1) Class20_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean620 || Static468.method7401(arg2) && Static468.method7401(arg3)) {
			return new Class85_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3);
		} else if (arg0.aBoolean629) {
			return new Class85_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3);
		} else {
			return new Class85_Sub1_Sub1(arg0, arg1, arg2, arg3, Static231.method4407(arg2), Static231.method4407(arg3));
		}
	}

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "(I)V")
	public static void method4664() {
		if (!Static604.aBoolean726) {
			return;
		}
		while (true) {
			while (Static281.aClass206_Sub1Array1.length > Static498.anInt9231) {
				@Pc(25) Class206_Sub1 local25 = Static281.aClass206_Sub1Array1[Static498.anInt9231];
				if (local25 != null && local25.anInt6907 == -1) {
					if (Static439.aClass2_Sub36_2 == null) {
						Static439.aClass2_Sub36_2 = Static305.aClass262_1.method6849(local25.aString75);
					}
					@Pc(50) int local50 = Static439.aClass2_Sub36_2.anInt6974;
					if (local50 == -1) {
						return;
					}
					local25.anInt6907 = local50;
					Static498.anInt9231++;
					Static439.aClass2_Sub36_2 = null;
				} else {
					Static498.anInt9231++;
				}
			}
			return;
		}
	}
}
