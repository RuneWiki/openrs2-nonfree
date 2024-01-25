import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Z")
	public static boolean aBoolean55;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public static int anInt604;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
	public static void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 + Static541.anInt9058;
		@Pc(13) int local13 = Static116.anInt2289 + arg0;
		if (Static292.aClass39ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static71.anInt1410 || arg0 >= Static471.anInt8012 || !Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) && arg1 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123) {
			return;
		}
		@Pc(54) long local54 = (long) (local9 | arg1 << 28 | local13 << 14);
		@Pc(60) Class1_Sub28 local60 = (Class1_Sub28) Static19.aClass187_3.method3797(local54);
		if (local60 == null) {
			Static316.method4382(arg1, arg2, arg0);
			return;
		}
		@Pc(74) Class1_Sub40 local74 = (Class1_Sub40) local60.aClass353_28.method7677();
		if (local74 == null) {
			Static316.method4382(arg1, arg2, arg0);
			return;
		}
		@Pc(88) Class8_Sub3_Sub5_Sub1 local88 = (Class8_Sub3_Sub5_Sub1) Static316.method4382(arg1, arg2, arg0);
		if (local88 == null) {
			local88 = new Class8_Sub3_Sub5_Sub1(arg2 << 9, Static199.aClass47Array1[arg1].method7545(arg2, arg0), arg0 << 9, arg1, arg1);
		} else {
			local88.anInt8967 = local88.anInt8972 = -1;
		}
		local88.anInt8978 = local74.anInt7304;
		local88.anInt8976 = local74.anInt7305;
		label56: while (true) {
			@Pc(131) Class1_Sub40 local131 = (Class1_Sub40) local60.aClass353_28.method7687();
			if (local131 == null) {
				break;
			}
			if (local88.anInt8978 != local131.anInt7304) {
				local88.anInt8967 = local131.anInt7304;
				local88.anInt8982 = local131.anInt7305;
				while (true) {
					@Pc(158) Class1_Sub40 local158 = (Class1_Sub40) local60.aClass353_28.method7687();
					if (local158 == null) {
						break label56;
					}
					if (local88.anInt8978 != local158.anInt7304 && local158.anInt7304 != local88.anInt8967) {
						local88.anInt8972 = local158.anInt7304;
						local88.anInt8970 = local158.anInt7305;
					}
				}
			}
		}
		@Pc(200) int local200 = Static66.method1191((arg2 << 9) + 256, arg1, (arg0 << 9) + 256);
		local88.anInt9370 = arg0 << 9;
		local88.anInt9361 = local200;
		local88.anInt9365 = arg2 << 9;
		local88.aByte124 = (byte) arg1;
		local88.aByte123 = (byte) arg1;
		if (Static466.method6426(arg0, arg2)) {
			local88.aByte124++;
		}
		Static19.method186(arg1, arg2, arg0, local200, local88);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public static void method541() {
		if (!Static324.aBoolean441) {
			return;
		}
		while (true) {
			while (Static436.aClass317_Sub1Array2.length > Static355.anInt5920) {
				@Pc(25) Class317_Sub1 local25 = Static436.aClass317_Sub1Array2[Static355.anInt5920];
				if (local25 != null && local25.anInt9114 == -1) {
					if (Static375.aClass1_Sub34_2 == null) {
						Static375.aClass1_Sub34_2 = Static102.aClass216_1.method4340(local25.aString90);
					}
					@Pc(49) int local49 = Static375.aClass1_Sub34_2.anInt5530;
					if (local49 == -1) {
						return;
					}
					Static375.aClass1_Sub34_2 = null;
					Static355.anInt5920++;
					local25.anInt9114 = local49;
				} else {
					Static355.anInt5920++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method542() {
		Static203.anInt4033 = 0;
		Static444.anInt5035 = 0;
		Static519.anInt8802 = 0;
		Static345.anInt5746 = 0;
	}
}
