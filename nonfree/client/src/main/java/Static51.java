import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!rb;")
	public static Class3_Sub1_Sub14 aClass3_Sub1_Sub14_1;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!md;")
	public static Class30 aClass30_9;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public static int anInt1495 = -1;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_844 = Static33.method650("Welt");

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_845 = Static33.method650("blinken3:");

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_846 = Static33.method650("::fpson");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!oa;ILclient!tb;Lclient!oa;)Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 method978(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(4) int local4 = arg1.method1148(arg2);
		@Pc(19) int local19 = arg1.method1136(arg0, local4);
		return Static75.method1347(arg1, local19, local4);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method979() {
		aClass56_844 = null;
		aClass56_845 = null;
		aClass30_9 = null;
		aClass56_846 = null;
		anIntArray103 = null;
		aClass3_Sub1_Sub14_1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BJ)V")
	public static void method980(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static42.anInt1124 >= 100 && Static48.anInt1397 != 1 || Static42.anInt1124 >= 200) {
			Static75.method1348(0, Static99.aClass56_481, Static122.aClass56_1633);
			return;
		}
		@Pc(35) Class56 local35 = Static16.method342(arg0).method1421();
		for (@Pc(45) int local45 = 0; local45 < Static42.anInt1124; local45++) {
			if (arg0 == Static3.aLongArray36[local45]) {
				Static75.method1348(0, Static84.method1524(new Class56[] { local35, Static19.aClass56_281 }), Static122.aClass56_1633);
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static63.anInt1820; local80++) {
			if (arg0 == Static84.aLongArray24[local80]) {
				Static75.method1348(0, Static84.method1524(new Class56[] { Static110.aClass56_1518, local35, Static73.aClass56_1078 }), Static122.aClass56_1633);
				return;
			}
		}
		if (local35.method1437(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764)) {
			return;
		}
		Static113.aClass56Array15[Static42.anInt1124] = local35;
		Static3.aLongArray36[Static42.anInt1124] = arg0;
		Static86.anIntArray195[Static42.anInt1124] = 0;
		Static59.anIntArray133[Static42.anInt1124] = 0;
		Static115.aBoolean157 = true;
		Static5.anInt69 = Static98.anInt2566 + 1;
		Static42.anInt1124++;
		Static111.aClass3_Sub2_Sub1_4.method325(127);
		Static111.aClass3_Sub2_Sub1_4.method300(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method981(@OriginalArg(1) int arg0) {
		if (!Static19.method398(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub16[] local14 = Static31.aClass3_Sub1_Sub16ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class3_Sub1_Sub16 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2815 = 0;
				local22.anInt2803 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method982() {
		Static70.method1286();
		Static127.method2043();
		Static94.method1662();
		Static95.method1667();
		Static113.method1864();
		Static102.method2051();
		Static54.method1009();
		Static80.method1408();
		Static118.method1921();
		Static36.method680();
		Static115.method1905();
		Static81.method1447();
		((Class21) Static55.anInterface2_1).method574();
		Static67.aClass52_45.method1346();
		Static111.aClass44_Sub1_74.method1139();
		Static106.aClass44_Sub1_67.method1139();
		Static11.aClass44_Sub1_13.method1139();
		Static12.aClass44_Sub1_15.method1139();
		Static2.aClass44_Sub1_2.method1139();
		Static100.aClass44_Sub1_65.method1139();
		Static21.aClass44_Sub1_20.method1139();
		Static114.aClass44_Sub1_75.method1139();
		Static49.aClass44_Sub1_41.method1139();
		Static111.aClass44_Sub1_73.method1139();
		Static2.aClass44_Sub1_1.method1139();
		Static102.aClass44_Sub1_83.method1139();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!id;III)V")
	public static void method983(@OriginalArg(0) Class3_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
		if (local15 <= 4225 || local15 >= 90000) {
			Static24.method494(arg1, arg2, arg0);
			return;
		}
		@Pc(32) int local32 = Static22.anInt686 + Static18.anInt493 & 0x7FF;
		@Pc(36) int local36 = Class3_Sub1_Sub1_Sub3.anIntArray115[local32];
		@Pc(44) int local44 = local36 * 256 / (Static62.anInt1804 + 256);
		@Pc(48) int local48 = Class3_Sub1_Sub1_Sub3.anIntArray116[local32];
		@Pc(56) int local56 = local48 * 256 / (Static62.anInt1804 + 256);
		@Pc(66) int local66 = local44 * arg2 + arg1 * local56 >> 16;
		@Pc(77) int local77 = local44 * arg1 - local56 * arg2 >> 16;
		@Pc(83) double local83 = Math.atan2((double) local66, (double) local77);
		@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
		@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
		Static122.aClass3_Sub1_Sub1_Sub2_6.method963(local89 + 4 + 94 - 10, -local95 + 83 + -20, local83);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII[Lclient!oa;)Lclient!oa;")
	public static Class56 method984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg2[arg0 + local9] == null) {
				arg2[local9 + arg0] = Static27.aClass56_405;
			}
			local7 += arg2[arg0 + local9].anInt2171;
		}
		@Pc(41) byte[] local41 = new byte[local7];
		@Pc(51) int local51 = 0;
		@Pc(62) Class56 local62;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			local62 = arg2[arg0 + local53];
			Static128.method140(local62.aByteArray29, 0, local41, local51, local62.anInt2171);
			local51 += local62.anInt2171;
		}
		local62 = new Class56();
		local62.aByteArray29 = local41;
		local62.anInt2171 = local7;
		return local62;
	}
}
