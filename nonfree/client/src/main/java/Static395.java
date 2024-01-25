import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "Lclient!bga;")
	public static Class31 aClass31_8;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public static int anInt6894;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!rga;)V")
	public static void method5455(@OriginalArg(0) Class8_Sub3 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static11.anIntArray12[local4]; local7++) {
				if (Static34.aClass8_Sub3ArrayArray4[local4][local7] == arg0) {
					Static598.method1175(Static34.aClass8_Sub3ArrayArray4[local4], local7 + 1, Static34.aClass8_Sub3ArrayArray4[local4], local7, Static11.anIntArray12[local4] - local7 - 1);
					local37 = Static11.anIntArray12[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static437.anIntArray588[local4]; local49++) {
				if (Static471.aClass8_Sub3ArrayArray3[local4][local49] == arg0) {
					Static598.method1175(Static471.aClass8_Sub3ArrayArray3[local4], local49 + 1, Static471.aClass8_Sub3ArrayArray3[local4], local49, Static437.anIntArray588[local4] - local49 - 1);
					local37 = Static437.anIntArray588[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static583.anIntArray731[local4]; local91++) {
				if (Static88.aClass8_Sub3ArrayArray2[local4][local91] == arg0) {
					Static598.method1175(Static88.aClass8_Sub3ArrayArray2[local4], local91 + 1, Static88.aClass8_Sub3ArrayArray2[local4], local91, Static583.anIntArray731[local4] - local91 - 1);
					local37 = Static583.anIntArray731[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5456(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static233.anInt7999 >= 100) {
			Static571.method7692(Static568.aClass351_43.method7651(Static307.anInt5279));
			return;
		}
		@Pc(23) String local23 = Static442.method6116(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(33) int local33 = 0; local33 < Static233.anInt7999; local33++) {
			@Pc(41) String local41 = Static442.method6116(Static29.aStringArray4[local33]);
			if (local41 != null && local41.equals(local23)) {
				Static571.method7692(arg0 + Static568.aClass351_44.method7651(Static307.anInt5279));
				return;
			}
			if (Static534.aStringArray37[local33] != null) {
				local72 = Static442.method6116(Static534.aStringArray37[local33]);
				if (local72 != null && local72.equals(local23)) {
					Static571.method7692(arg0 + Static568.aClass351_44.method7651(Static307.anInt5279));
					return;
				}
			}
		}
		for (@Pc(99) int local99 = 0; local99 < Static281.anInt4916; local99++) {
			local72 = Static442.method6116(Static308.aStringArray24[local99]);
			if (local72 != null && local72.equals(local23)) {
				Static571.method7692(Static568.aClass351_49.method7651(Static307.anInt5279) + arg0 + Static568.aClass351_50.method7651(Static307.anInt5279));
				return;
			}
			if (Static98.aStringArray29[local99] != null) {
				@Pc(143) String local143 = Static442.method6116(Static98.aStringArray29[local99]);
				if (local143 != null && local143.equals(local23)) {
					Static571.method7692(Static568.aClass351_49.method7651(Static307.anInt5279) + arg0 + Static568.aClass351_50.method7651(Static307.anInt5279));
					return;
				}
			}
		}
		if (Static442.method6116(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16).equals(local23)) {
			Static571.method7692(Static568.aClass351_46.method7651(Static307.anInt5279));
			return;
		}
		@Pc(197) Class1_Sub11 local197 = Static276.method3885(Static229.aClass70_42, Static481.aClass276_2);
		local197.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0) + 1);
		local197.aClass1_Sub35_Sub2_1.method5761(arg0);
		local197.aClass1_Sub35_Sub2_1.method5777(arg1 ? 1 : 0);
		Static48.method743(local197);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	public static void method5457() {
		for (@Pc(3) int local3 = 0; local3 < Static204.aClass119ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static204.aClass119ArrayArray1[local3].length; local7++) {
				Static204.aClass119ArrayArray1[local3][local7] = Static436.aClass119_3;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BD)V")
	public static void method5459(@OriginalArg(1) double arg0) {
		if (arg0 == Static508.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static287.anIntArray387[local11] = local23 <= 255 ? local23 : 255;
		}
		Static508.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V")
	public static void method5460(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static422.anInt7311 != -1) {
				Static546.method7464(Static422.anInt7311);
			}
			for (@Pc(15) Class1_Sub44 local15 = (Class1_Sub44) Static78.aClass187_8.method3799(); local15 != null; local15 = (Class1_Sub44) Static78.aClass187_8.method3805()) {
				if (!local15.method7856()) {
					local15 = (Class1_Sub44) Static78.aClass187_8.method3799();
					if (local15 == null) {
						break;
					}
				}
				Static157.method2283(false, true, local15);
			}
			Static422.anInt7311 = -1;
			Static78.aClass187_8 = new Class187(8);
			Static361.method4889();
			Static422.anInt7311 = Static69.anInt1393;
			Static482.method6526(false);
			Static164.method7470();
			Static80.method1459(Static422.anInt7311);
		}
		Static399.aString69 = "";
		Static157.aString27 = "";
		Static468.aBoolean615 = false;
		Static548.method7014();
		Static447.anInt7729 = -1;
		Static411.method5664(Static196.anInt3665);
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 = new Class8_Sub3_Sub3_Sub1_Sub1();
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 = Static471.anInt8012 * 512 / 2;
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] = Static71.anInt1410 / 2;
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 = Static71.anInt1410 * 512 / 2;
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] = Static471.anInt8012 / 2;
		Static59.anInt1132 = 0;
		Static405.anInt7085 = 0;
		if (Static340.anInt5707 == 2) {
			Static59.anInt1132 = Static458.anInt7890 << 9;
			Static405.anInt7085 = Static373.anInt6267 << 9;
		} else {
			Static554.method7559();
		}
		Static475.method6481();
	}
}
