import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "Kh", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!ad", name = "Ug", descriptor = "Z")
	public static final boolean aBoolean65 = false;

	@OriginalMember(owner = "client!ad", name = "Fh", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_1 = new Class90(114, -2);

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "(I)V")
	public static void method633() {
		if (Static446.anInt8493 == -1) {
			return;
		}
		@Pc(17) int local17 = Static294.aClass83_1.method6895();
		@Pc(21) int local21 = Static294.aClass83_1.method6896();
		@Pc(26) Class4_Sub24 local26 = (Class4_Sub24) Static36.aClass22_13.method895();
		if (local26 != null) {
			local17 = local26.method6394();
			local21 = local26.method6390();
		}
		Static424.method6350(0, local21, 0, Static71.anInt1872, 0, Static123.anInt9150, 0, Static446.anInt8493, local17);
		if (Static571.aClass155_17 != null) {
			Static527.method7457(local21, local17);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!sj;)V")
	public static void method634(@OriginalArg(1) Class4_Sub13_Sub2 arg0) {
		arg0.method7032(Static388.aClass348_95.method7974());
		arg0.method7032(Static42.aClass348_21.method7974());
		arg0.method7032(Static196.aClass348_49.method7974());
		arg0.method7032(Static414.aClass348_98.method7974());
		arg0.method7032(Static518.aClass348_118.method7974());
		arg0.method7032(Static46.aClass348_22.method7974());
		arg0.method7032(Static326.aClass348_69.method7974());
		arg0.method7032(Static383.aClass348_91.method7974());
		arg0.method7032(Static159.aClass348_38.method7974());
		arg0.method7032(Static580.aClass348_84.method7974());
		arg0.method7032(Static26.aClass348_12.method7974());
		arg0.method7032(Static84.aClass348_28.method7974());
		arg0.method7032(Static75.aClass348_26.method7974());
		arg0.method7032(Static478.aClass348_114.method7974());
		arg0.method7032(Static19.aClass348_11.method7974());
		arg0.method7032(Static359.aClass348_76.method7974());
		arg0.method7032(Static7.aClass348_6.method7974());
		arg0.method7032(Static364.aClass348_77.method7974());
		arg0.method7032(Static249.aClass348_41.method7974());
		arg0.method7032(Static384.aClass348_92.method7974());
		arg0.method7032(Static377.aClass348_85.method7974());
		arg0.method7032(Static325.aClass348_68.method7974());
		arg0.method7032(Static506.aClass348_117.method7974());
		arg0.method7032(Static272.aClass348_136.method7974());
		arg0.method7032(Static390.aClass348_96.method7974());
		arg0.method7032(Static417.aClass348_56.method7974());
		arg0.method7032(Static453.aClass348_104.method7974());
		arg0.method7032(Static277.aClass348_62.method7974());
		arg0.method7032(Static459.aClass348_101.method7974());
		arg0.method7032(Static175.aClass348_44.method7974());
		arg0.method7032(Static131.aClass348_30.method7974());
		arg0.method7032(Static18.aClass348_10.method7974());
		arg0.method7032(Static523.method7404());
		arg0.method7032(Static172.method2866());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([[BLclient!n;I)V")
	public static void method638(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class123_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class4_Sub13 local35 = new Class4_Sub13(local28);
				local41 = Static322.anIntArray351[local22] >> 8;
				@Pc(47) int local47 = Static322.anIntArray351[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static242.anInt10133;
				@Pc(61) int local61 = local47 * 64 - Static157.anInt3323;
				Static487.method7088();
				arg1.method5157(local61, local35, local54, Static526.aClass232Array1, Static157.anInt3323, Static242.anInt10133);
				arg1.method5173(local61, local35, local17, Static39.aClass7_2, local54);
				if (!arg1.aBoolean443 && Static173.anInt3656 / 8 == local41 && Static560.anInt10211 / 8 == local47 && local17[0] != -1) {
					Static357.aClass260_1 = Static145.aClass56_1.method1554(local17[2], local17[0], local17[3], Static240.aClass175_1, local17[1]);
					Static280.anInt5804 = local17[4];
				}
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local20; local139++) {
			@Pc(152) int local152 = (Static322.anIntArray351[local139] >> 8) * 64 - Static242.anInt10133;
			local41 = (Static322.anIntArray351[local139] & 0xFF) * 64 - Static157.anInt3323;
			@Pc(167) byte[] local167 = arg0[local139];
			if (local167 == null && Static560.anInt10211 < 800) {
				Static487.method7088();
				arg1.method5154(local152, local41);
			}
		}
	}
}
