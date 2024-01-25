import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public static int anInt6050;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt6051;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public static int anInt6056;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt6052 = 0;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "[I")
	public static final int[] anIntArray517 = new int[25];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
	public static void method5390(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local11 = 1;
			local9 = Static49.aByteArrayArray4;
		} else {
			local9 = Static129.aByteArrayArray6;
			local11 = 4;
		}
		@Pc(20) int local20 = local9.length;
		@Pc(36) int local36;
		@Pc(49) int local49;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local9[local22];
			local36 = Static338.anIntArray283[local22] >> 8;
			@Pc(42) int local42 = Static338.anIntArray283[local22] & 0xFF;
			local49 = local36 * 64 - Static263.anInt5063;
			@Pc(56) int local56 = local42 * 64 - Static28.anInt773;
			if (local30 != null) {
				Static153.method2894();
				local26 = Static49.method1098(local11, local30, arg0, local56, Static263.anInt5063, Static15.aClass59_1, Static117.aClass49Array1, Static28.anInt773, local49);
			}
			if (!arg0 && local36 == Static63.anInt1492 / 8 && local42 == Static1.anInt3 / 8) {
				if (local26 == null) {
					Static34.aClass129_1 = null;
				} else {
					Static34.aClass129_1 = Static268.method5800(local26[2], local26[1], local26[3], local26[0]);
					Static135.anInt2760 = local26[4];
				}
			}
		}
		for (@Pc(122) int local122 = 0; local122 < local20; local122++) {
			@Pc(135) int local135 = (Static338.anIntArray283[local122] >> 8) * 64 - Static263.anInt5063;
			local36 = (Static338.anIntArray283[local122] & 0xFF) * 64 - Static28.anInt773;
			@Pc(150) byte[] local150 = local9[local122];
			if (local150 == null && Static1.anInt3 < 800) {
				Static153.method2894();
				for (local49 = 0; local49 < local11; local49++) {
					Static335.method5598(64, local49, local135, 64, local36);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V")
	public static void method5391(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub9_Sub16 local16 = Static239.method4052(3, arg0);
		local16.method4138();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5392(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static31.anInt829 >= 100 && !Static73.aBoolean122 || Static31.anInt829 >= 200) {
			Static217.method3824(Static344.aString62);
			return;
		}
		@Pc(26) String local26 = Static334.method5595(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static31.anInt829; local31++) {
			@Pc(39) String local39 = Static334.method5595(Static61.aStringArray8[local31]);
			if (local39 != null && local39.equals(local26)) {
				Static217.method3824(arg0 + Static91.aString127);
				return;
			}
			if (Static72.aStringArray9[local31] != null) {
				local66 = Static334.method5595(Static72.aStringArray9[local31]);
				if (local66 != null && local66.equals(local26)) {
					Static217.method3824(arg0 + Static91.aString127);
					return;
				}
			}
		}
		for (@Pc(89) int local89 = 0; local89 < Static32.anInt859; local89++) {
			local66 = Static334.method5595(Static31.aStringArray1[local89]);
			if (local66 != null && local66.equals(local26)) {
				Static217.method3824(Static64.aString92 + arg0 + Static162.aString200);
				return;
			}
			if (Static44.aStringArray25[local89] != null) {
				@Pc(126) String local126 = Static334.method5595(Static44.aStringArray25[local89]);
				if (local126 != null && local126.equals(local26)) {
					Static217.method3824(Static64.aString92 + arg0 + Static162.aString200);
					return;
				}
			}
		}
		if (Static334.method5595(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237).equals(local26)) {
			Static217.method3824(Static202.aString232);
		} else {
			Static335.aClass5_Sub1_Sub1_3.method174(177);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0));
			Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)V")
	public static void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (Static15.anInt493 != arg0) {
			Static257.anIntArray386 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static257.anIntArray386[local13] = (local13 << 12) / arg0;
			}
			Static301.anInt5983 = arg0 * 32;
			Static15.anInt493 = arg0;
			Static317.anInt6151 = arg0 - 1;
		}
		if (Static88.anInt1584 == arg1) {
			return;
		}
		if (Static15.anInt493 == arg1) {
			Static287.anIntArray413 = Static257.anIntArray386;
		} else {
			Static287.anIntArray413 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static287.anIntArray413[local13] = (local13 << 12) / arg1;
			}
		}
		Static88.anInt1584 = arg1;
		Static19.anInt547 = arg1 - 1;
	}
}
