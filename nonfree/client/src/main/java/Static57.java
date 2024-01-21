import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "Lclient!kb;")
	private static Class46 aClass46_517 = Static65.method1172("The server is being updated)3");

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_516 = aClass46_517;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
	public static int anInt1542 = 1;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "[I")
	public static int[] anIntArray149 = new int[32];

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_518 = Static65.method1172("mapdots");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
	public static boolean method1063(@OriginalArg(1) int arg0) {
		if (Static123.aBooleanArray16[arg0]) {
			return true;
		} else if (Static18.aClass44_4.method1611(arg0)) {
			@Pc(28) int local28 = Static18.aClass44_4.method1619(arg0);
			if (local28 == 0) {
				Static123.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static26.aClass33ArrayArray1[arg0] == null) {
				Static26.aClass33ArrayArray1[arg0] = new Class33[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static26.aClass33ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static18.aClass44_4.method1624(arg0, local50);
					if (local64 != null) {
						Static26.aClass33ArrayArray1[arg0][local50] = new Class33();
						Static26.aClass33ArrayArray1[arg0][local50].anInt1434 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							Static26.aClass33ArrayArray1[arg0][local50].method1030(new Class3_Sub4(local64));
						} else {
							Static26.aClass33ArrayArray1[arg0][local50].method1035(new Class3_Sub4(local64));
						}
					}
				}
			}
			Static123.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method1064() {
		for (@Pc(12) int local12 = 0; local12 < Static108.anInt2585; local12++) {
			@Pc(18) int local18 = Static14.anIntArray25[local12];
			@Pc(22) Class3_Sub2_Sub1_Sub1_Sub2 local22 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static49.aClass3_Sub4_Sub1_2.method191();
			if ((local26 & 0x8) != 0) {
				local22.anInt1718 = Static49.aClass3_Sub4_Sub1_2.method174();
				local22.anInt1708 = Static49.aClass3_Sub4_Sub1_2.method171();
			}
			if ((local26 & 0x1) != 0) {
				local22.aClass46_590 = Static49.aClass3_Sub4_Sub1_2.method172();
				local22.anInt1730 = 100;
			}
			if ((local26 & 0x2) != 0) {
				local22.aClass3_Sub2_Sub16_1 = Static176.method2828(Static49.aClass3_Sub4_Sub1_2.method174());
				local22.anInt1713 = local22.aClass3_Sub2_Sub16_1.anInt3803;
				local22.anInt1710 = local22.aClass3_Sub2_Sub16_1.anInt3798;
				local22.anInt1697 = local22.aClass3_Sub2_Sub16_1.anInt3815;
				local22.anInt1699 = local22.aClass3_Sub2_Sub16_1.anInt3810;
				local22.anInt1712 = local22.aClass3_Sub2_Sub16_1.anInt3814;
				local22.anInt1737 = local22.aClass3_Sub2_Sub16_1.anInt3812;
				local22.anInt1714 = local22.aClass3_Sub2_Sub16_1.anInt3805;
				local22.anInt1683 = local22.aClass3_Sub2_Sub16_1.anInt3820;
				local22.anInt1682 = local22.aClass3_Sub2_Sub16_1.anInt3808;
			}
			@Pc(121) int local121;
			@Pc(127) int local127;
			if ((local26 & 0x10) != 0) {
				local121 = Static49.aClass3_Sub4_Sub1_2.method205();
				local127 = Static49.aClass3_Sub4_Sub1_2.method191();
				local22.method1164(local127, local121, Static20.anInt512);
				local22.anInt1721 = Static20.anInt512 + 300;
				local22.anInt1704 = Static49.aClass3_Sub4_Sub1_2.method191();
			}
			if ((local26 & 0x80) != 0) {
				local22.anInt1707 = Static49.aClass3_Sub4_Sub1_2.method171();
				local121 = Static49.aClass3_Sub4_Sub1_2.method207();
				local22.anInt1728 = 0;
				local22.anInt1722 = Static20.anInt512 + (local121 & 0xFFFF);
				local22.anInt1717 = local121 >> 16;
				if (local22.anInt1707 == 65535) {
					local22.anInt1707 = -1;
				}
				local22.anInt1687 = 0;
				if (Static20.anInt512 < local22.anInt1722) {
					local22.anInt1687 = -1;
				}
			}
			if ((local26 & 0x4) != 0) {
				local121 = Static49.aClass3_Sub4_Sub1_2.method174();
				local127 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (local121 == 65535) {
					local121 = -1;
				}
				if (local121 == local22.anInt1738 && local121 != -1) {
					@Pc(234) int local234 = Static35.method628(local121).anInt941;
					if (local234 == 1) {
						local22.anInt1681 = 0;
						local22.anInt1726 = local127;
						local22.anInt1731 = 0;
						local22.anInt1706 = 0;
					}
					if (local234 == 2) {
						local22.anInt1731 = 0;
					}
				} else if (local121 == -1 || local22.anInt1738 == -1 || Static35.method628(local121).anInt943 >= Static35.method628(local22.anInt1738).anInt943) {
					local22.anInt1726 = local127;
					local22.anInt1681 = 0;
					local22.anInt1706 = 0;
					local22.anInt1738 = local121;
					local22.anInt1731 = 0;
					local22.anInt1715 = local22.anInt1724;
				}
			}
			if ((local26 & 0x40) != 0) {
				local121 = Static49.aClass3_Sub4_Sub1_2.method205();
				local127 = Static49.aClass3_Sub4_Sub1_2.method205();
				local22.method1164(local127, local121, Static20.anInt512);
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt1723 = Static49.aClass3_Sub4_Sub1_2.method174();
				if (local22.anInt1723 == 65535) {
					local22.anInt1723 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1067(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(22) RuntimeException_Sub1 local22 = (RuntimeException_Sub1) arg0;
			local17 = local22.aString2 + " | ";
			arg0 = local22.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(39) StringWriter local39 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local39);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local39.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local17 + "| " + local63;
				}
				@Pc(72) int local72 = local66.indexOf(40);
				@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(93) String local93 = local66.substring(local72 + 1, local79);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local17 = local17 + local93 + ' ';
						continue;
					}
					local66 = local66.substring(0, local72);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local17 = local17 + local66 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)Lclient!kb;")
	public static Class46 method1068(@OriginalArg(1) int arg0) {
		return Static73.method1240(false, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method1069() {
		anIntArray149 = null;
		aClass46_516 = null;
		aClass46_518 = null;
		aBigInteger1 = null;
		aClass46_517 = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method1071() {
		@Pc(9) int local9 = Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method813(Static143.aClass46_1140);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static87.anInt2129; local11++) {
			local19 = Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method813(Static178.method2859(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static33.anInt924 = Static87.anInt2129 * 15 + 22;
		Static105.aBoolean103 = true;
		local9 += 8;
		Static39.anInt3979 = local9;
		local19 = Static87.anInt2129 * 15 + 21;
		@Pc(61) int local61 = Static77.anInt1923 - local9 / 2;
		@Pc(63) int local63 = Static48.anInt1329;
		if (local9 + local61 > 765) {
			local61 = 765 - local9;
		}
		if (local19 + local63 > 503) {
			local63 = 503 - local19;
		}
		if (local61 < 0) {
			local61 = 0;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		Static163.anInt3620 = local61;
		Static56.anInt1516 = local63;
	}
}
