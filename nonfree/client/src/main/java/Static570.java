import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "Lclient!cb;")
	public static Class50 aClass50_162;

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
	public static int anInt9346;

	@OriginalMember(owner = "client!tia", name = "r", descriptor = "I")
	public static int anInt9347;

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
	public static int anInt9348;

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_90 = new Class187(41, 3);

	@OriginalMember(owner = "client!tia", name = "q", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_288 = new Class196(43, -2);

	@OriginalMember(owner = "client!tia", name = "t", descriptor = "Z")
	public static boolean aBoolean678 = false;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!pi;IIIIZ)V")
	public static void method7811(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class5_Sub47 local5 = null;
		for (@Pc(10) Class5_Sub47 local10 = (Class5_Sub47) Static227.aClass124_36.method2572(); local10 != null; local10 = (Class5_Sub47) Static227.aClass124_36.method2569()) {
			if (arg1 == local10.anInt9032 && local10.anInt9036 == arg4 && arg3 == local10.anInt9031 && arg2 == local10.anInt9033) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class5_Sub47();
			local5.anInt9036 = arg4;
			local5.anInt9031 = arg3;
			local5.anInt9032 = arg1;
			local5.anInt9033 = arg2;
			Static227.aClass124_36.method2574(local5);
		}
		local5.aClass272_2 = arg0;
		local5.aBoolean651 = false;
		local5.aBoolean650 = true;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIB)V")
	public static void method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class378 local16 = Static322.aClass378ArrayArray1[arg0][arg1];
		if (local16 != null) {
			Static55.anInt889 = local16.anInt10124;
			Static505.anInt8570 = local16.anInt10121;
			Static113.anInt2004 = local16.anInt10128;
		}
		Static255.method3588();
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V")
	public static void method7816() {
		Static404.aClass3_6.method44();
		Static247.aClass269_3.method6620();
		Static670.aClass83_2.method1832();
		Static400.aClass140_4.method2849();
		Static58.aClass230_1.method5290();
		Static259.aClass135_1.method2771();
		Static459.aClass128_2.method2685();
		Static312.aClass179_1.method3799();
		Static480.aClass298_2.method7198();
		Static532.aClass260_1.method6452();
		Static126.aClass388_1.method8590();
		Static233.aClass172_1.method3620();
		Static299.aClass218_1.method5164();
		Static40.aClass161_1.method3450();
		Static522.aClass282_2.method6905();
		Static135.aClass250_1.method5942();
		Static117.aClass64_1.method1289();
		Static1.aClass286_5.method7023();
		Static80.aClass118_1.method2464();
		Static205.aClass363_1.method8242();
		Static402.aClass290_1.method7067();
		Static239.aClass115_2.method2370();
		Static464.method6872();
		Static539.method7461();
		Static352.method5231();
		Static205.method2852();
		Static338.method7921();
		Static405.aClass265_44.method6570(5);
		Static395.aClass265_41.method6570(5);
		Static301.aClass265_28.method6570(5);
		Static35.aClass265_2.method6570(5);
		Static497.aClass265_56.method6570(5);
	}

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)V")
	public static void method7817() {
		Static515.aClass178Array2 = new Class178[50];
		Static331.anInt6013 = 0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method7818(@OriginalArg(1) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(24) byte[] local24 = new byte[arg0 * arg0];
		@Pc(26) int local26 = 0;
		@Pc(31) int local31;
		for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
			for (local31 = 0; local31 < arg0; local31++) {
				if (local31 <= local28) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[0][0] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(72) int local72;
		for (local31 = arg0 - 1; local31 >= 0; local31--) {
			for (local72 = 0; local72 < arg0; local72++) {
				if (local72 <= local31) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[0][1] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(106) int local106;
		for (local72 = 0; local72 < arg0; local72++) {
			for (local106 = 0; local106 < arg0; local106++) {
				if (local72 <= local106) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[0][2] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(151) int local151;
		for (local106 = arg0 - 1; local106 >= 0; local106--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local106 <= local151) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[0][3] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(191) int local191;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local191 = 0; local191 < arg0; local191++) {
				if (local151 >> 1 >= local191) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[1][0] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(234) int local234;
		for (local191 = 0; local191 < arg0; local191++) {
			for (local234 = 0; local234 < arg0; local234++) {
				if (local26 >= 0 && local26 < local24.length) {
					if (local191 << 1 <= local234) {
						local24[local26] = -1;
					}
					local26++;
				} else {
					local26++;
				}
			}
		}
		local7[1][1] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(293) int local293;
		for (local234 = 0; local234 < arg0; local234++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local293 <= local234 >> 1) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[1][2] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(341) int local341;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local341 = arg0 - 1; local341 >= 0; local341--) {
				if (local341 >= local293 << 1) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[1][3] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(380) int local380;
		for (local341 = arg0 - 1; local341 >= 0; local341--) {
			for (local380 = arg0 - 1; local380 >= 0; local380--) {
				if (local380 <= local341 >> 1) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[2][0] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(420) int local420;
		for (local380 = arg0 - 1; local380 >= 0; local380--) {
			for (local420 = 0; local420 < arg0; local420++) {
				if (local380 << 1 <= local420) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[2][1] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(463) int local463;
		for (local420 = 0; local420 < arg0; local420++) {
			for (local463 = 0; local463 < arg0; local463++) {
				if (local420 >> 1 >= local463) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[2][2] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(506) int local506;
		for (local463 = 0; local463 < arg0; local463++) {
			for (local506 = arg0 - 1; local506 >= 0; local506--) {
				if (local463 << 1 <= local506) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[2][3] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(551) int local551;
		for (local506 = arg0 - 1; local506 >= 0; local506--) {
			for (local551 = 0; local551 < arg0; local551++) {
				if (local506 >> 1 <= local551) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[3][0] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(594) int local594;
		for (local551 = 0; local551 < arg0; local551++) {
			for (local594 = 0; local594 < arg0; local594++) {
				if (local551 << 1 >= local594) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[3][1] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(633) int local633;
		for (local594 = 0; local594 < arg0; local594++) {
			for (local633 = arg0 - 1; local633 >= 0; local633--) {
				if (local594 >> 1 <= local633) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[3][2] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(680) int local680;
		for (local633 = arg0 - 1; local633 >= 0; local633--) {
			for (local680 = arg0 - 1; local680 >= 0; local680--) {
				if (local680 <= local633 << 1) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[3][3] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(729) int local729;
		for (local680 = arg0 - 1; local680 >= 0; local680--) {
			for (local729 = arg0 - 1; local729 >= 0; local729--) {
				if (local680 >> 1 <= local729) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[4][0] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(769) int local769;
		for (local729 = arg0 - 1; local729 >= 0; local729--) {
			for (local769 = 0; local769 < arg0; local769++) {
				if (local729 << 1 >= local769) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[4][1] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(808) int local808;
		for (local769 = 0; local769 < arg0; local769++) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local808 >= local769 >> 1) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[4][2] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(855) int local855;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local855 = arg0 - 1; local855 >= 0; local855--) {
				if (local808 << 1 >= local855) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[4][3] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(902) int local902;
		for (local855 = 0; local855 < arg0; local855++) {
			for (local902 = 0; local902 < arg0; local902++) {
				if (arg0 / 2 >= local902) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[5][0] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(943) int local943;
		for (local902 = 0; local902 < arg0; local902++) {
			for (local943 = 0; local943 < arg0; local943++) {
				if (arg0 / 2 >= local902) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[5][1] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(984) int local984;
		for (local943 = 0; local943 < arg0; local943++) {
			for (local984 = 0; local984 < arg0; local984++) {
				if (arg0 / 2 <= local984) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[5][2] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(1029) int local1029;
		for (local984 = 0; local984 < arg0; local984++) {
			for (local1029 = 0; local1029 < arg0; local1029++) {
				if (local984 >= arg0 / 2) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[5][3] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(1066) int local1066;
		for (local1029 = 0; local1029 < arg0; local1029++) {
			for (local1066 = 0; local1066 < arg0; local1066++) {
				if (local1066 <= local1029 - arg0 / 2) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[6][0] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(1120) int local1120;
		for (local1066 = arg0 - 1; local1066 >= 0; local1066--) {
			for (local1120 = 0; local1120 < arg0; local1120++) {
				if (local1066 - arg0 / 2 >= local1120) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[6][1] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(1170) int local1170;
		for (local1120 = arg0 - 1; local1120 >= 0; local1120--) {
			for (local1170 = arg0 - 1; local1170 >= 0; local1170--) {
				if (local1120 - arg0 / 2 >= local1170) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[6][2] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(1216) int local1216;
		for (local1170 = 0; local1170 < arg0; local1170++) {
			for (local1216 = arg0 - 1; local1216 >= 0; local1216--) {
				if (local1216 <= local1170 - arg0 / 2) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[6][3] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(1266) int local1266;
		for (local1216 = 0; local1216 < arg0; local1216++) {
			for (local1266 = 0; local1266 < arg0; local1266++) {
				if (local1266 >= local1216 - arg0 / 2) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[7][0] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		@Pc(1316) int local1316;
		for (local1266 = arg0 - 1; local1266 >= 0; local1266--) {
			for (local1316 = 0; local1316 < arg0; local1316++) {
				if (local1266 - arg0 / 2 <= local1316) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[7][1] = local24;
		local24 = new byte[arg0 * arg0];
		local26 = 0;
		@Pc(1359) int local1359;
		for (local1316 = arg0 - 1; local1316 >= 0; local1316--) {
			for (local1359 = arg0 - 1; local1359 >= 0; local1359--) {
				if (local1316 - arg0 / 2 <= local1359) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[7][2] = local24;
		local26 = 0;
		local24 = new byte[arg0 * arg0];
		for (local1359 = 0; local1359 < arg0; local1359++) {
			for (@Pc(1406) int local1406 = arg0 - 1; local1406 >= 0; local1406--) {
				if (local1406 >= local1359 - arg0 / 2) {
					local24[local26] = -1;
				}
				local26++;
			}
		}
		local7[7][3] = local24;
		return local7;
	}
}
