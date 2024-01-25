import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "Lclient!nba;")
	public static Class5_Sub2_Sub13 aClass5_Sub2_Sub13_2;

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!pb;")
	public static final Class267 aClass267_4 = new Class267("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!gv", name = "u", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_42 = new Class187(19, 4);

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)I")
	public static int method2866() {
		@Pc(6) int local6;
		if (Static655.aClass5_Sub36_29.aClass2_Sub9_1.method3783() == 0) {
			for (local6 = 0; local6 < Static358.anInt6287; local6++) {
				if (Static90.anInterface18Array1[local6].method5313() == 's' || Static90.anInterface18Array1[local6].method5313() == 'S') {
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub9_1, 1);
					Static44.aBoolean31 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static400.aClass247_3 == Static382.aClass247_2) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local53 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static124.method1947();
			if (Static326.aLong167 == 0L) {
				Static326.aLong167 = local56;
			}
			if (local53 > 16384 && local56 - Static326.aLong167 < 5000L) {
				if (local56 - Static30.aLong31 > 1000L) {
					System.gc();
					Static30.aLong31 = local56;
				}
				return 0;
			}
		}
		if (Static400.aClass247_4 == Static382.aClass247_2) {
			if (Static469.aClass291_1 == null) {
				Static469.aClass291_1 = new Class291(Static589.aClass288_3, Static280.aClass52_2, Static390.aBigInteger8, Static145.aBigInteger1);
			}
			if (!Static469.aClass291_1.method7095()) {
				return 0;
			}
			Static72.method7647(0, true, (String) null);
			Static551.aBoolean652 = !Static408.method5963();
			Static494.aClass50_147 = Static46.method623(false, 1, Static551.aBoolean652 ? 34 : 32);
			Static190.aClass50_49 = Static46.method623(false, 1, 33);
			Static253.aClass50_66 = Static46.method623(false, 1, 13);
		}
		@Pc(150) boolean local150;
		if (Static382.aClass247_2 == Static400.aClass247_5) {
			local150 = Static190.aClass50_49.method898();
			local53 = Static366.aClass7_Sub1Array2[33].method160();
			local53 += Static366.aClass7_Sub1Array2[Static551.aBoolean652 ? 34 : 32].method160();
			local53 += Static366.aClass7_Sub1Array2[13].method160();
			local53 += local150 ? 100 : Static190.aClass50_49.method921();
			if (local53 != 400) {
				return local53 / 4;
			}
			Static219.anInt3473 = Static494.aClass50_147.method923();
			Static181.anInt2988 = Static190.aClass50_49.method923();
			Static388.method5674(Static494.aClass50_147);
			@Pc(215) int local215 = Static655.aClass5_Sub36_29.aClass2_Sub29_1.method8772();
			Static13.aClass337_1 = new Class337(Static591.aClass174_7, Static259.anInt4113, Static190.aClass50_49);
			@Pc(227) int[] local227 = Static13.aClass337_1.method7819(local215);
			if (local227.length == 0) {
				local227 = Static13.aClass337_1.method7819(0);
			}
			@Pc(241) Class356 local241 = new Class356(Static494.aClass50_147, Static253.aClass50_66);
			if (local227.length > 0) {
				Static603.anInterface7Array1 = new Interface7[local227.length];
				for (@Pc(253) int local253 = 0; local253 < Static603.anInterface7Array1.length; local253++) {
					Static603.anInterface7Array1[local253] = new Class379(Static13.aClass337_1.method7815(local227[local253]), local241);
				}
			}
		}
		if (Static382.aClass247_2 == Static400.aClass247_6) {
			Static449.method6670(Static30.method394(), Static253.aClass50_66, Static494.aClass50_147);
		}
		if (Static400.aClass247_7 == Static382.aClass247_2) {
			local6 = Static49.method728();
			local53 = Static653.method8581();
			if (local6 < local53) {
				return local6 * 100 / local53;
			}
		}
		if (Static382.aClass247_2 == Static400.aClass247_8) {
			if (Static603.anInterface7Array1 != null && Static603.anInterface7Array1.length > 0) {
				if (Static603.anInterface7Array1[0].method8440() < 100) {
					return 0;
				}
				if (Static603.anInterface7Array1.length > 1 && Static13.aClass337_1.method7814() && Static603.anInterface7Array1[1].method8440() < 100) {
					return 0;
				}
			}
			Static209.method2989(Static563.aClass143_13);
			Static11.method173(Static563.aClass143_13);
			Static42.method560(1);
		}
		if (Static400.aClass247_9 == Static382.aClass247_2) {
			for (local6 = 0; local6 < 4; local6++) {
				Static137.aClass234Array1[local6] = Static255.method3586(Static124.anInt2150, Static64.anInt1015);
			}
		}
		if (Static400.aClass247_10 == Static382.aClass247_2) {
			Static471.aClass50_136 = Static46.method623(false, 1, 8);
			Static269.aClass50_71 = Static46.method623(false, 1, 0);
			Static119.aClass50_34 = Static46.method623(false, 1, 1);
			Static238.aClass50_62 = Static46.method623(false, 1, 2);
			Static76.aClass50_19 = Static46.method623(false, 1, 3);
			Static647.aClass50_113 = Static46.method623(false, 1, 4);
			Static570.aClass50_162 = Static46.method623(true, 1, 5);
			Static449.aClass50_129 = Static46.method623(true, 1, 6);
			Static392.aClass50_114 = Static46.method623(false, 1, 7);
			Static538.aClass50_156 = Static46.method623(false, 1, 9);
			Static425.aClass50_121 = Static46.method623(false, 1, 10);
			Static537.aClass50_186 = Static46.method623(false, 1, 11);
			Static427.aClass50_189 = Static46.method623(false, 1, 12);
			Static2.aClass50_3 = Static46.method623(false, 1, 14);
			Static491.aClass50_146 = Static46.method623(false, 1, 15);
			Static207.aClass50_54 = Static46.method623(false, 1, 16);
			Static85.aClass50_23 = Static46.method623(false, 1, 17);
			Static356.aClass50_101 = Static46.method623(false, 1, 18);
			Static655.aClass50_185 = Static46.method623(false, 1, 19);
			Static125.aClass50_35 = Static46.method623(false, 1, 20);
			Static7.aClass50_5 = Static46.method623(false, 1, 21);
			Static81.aClass50_20 = Static46.method623(false, 1, 22);
			Static418.aClass50_119 = Static46.method623(true, 1, 23);
			Static103.aClass50_30 = Static46.method623(false, 1, 24);
			Static335.aClass50_95 = Static46.method623(false, 1, 25);
			Static524.aClass50_124 = Static46.method623(true, 1, 26);
			Static22.aClass50_6 = Static46.method623(false, 1, 27);
			Static613.aClass50_172 = Static46.method623(true, 1, 28);
			Static633.aClass50_176 = Static46.method623(false, 1, 29);
			Static596.aClass50_167 = Static46.method623(true, 1, 30);
			Static498.aClass50_149 = Static46.method623(true, 1, 31);
			Static484.aClass50_141 = Static46.method623(true, 2, 36);
		}
		if (Static382.aClass247_2 == Static400.aClass247_11) {
			local6 = 0;
			for (local53 = 0; local53 < 37; local53++) {
				if (Static366.aClass7_Sub1Array2[local53] != null) {
					local6 += Static366.aClass7_Sub1Array2[local53].method160() * Static60.anIntArray60[local53] / 100;
				}
			}
			if (local6 != 100) {
				if (Static667.anInt10411 < 0) {
					Static667.anInt10411 = local6;
				}
				return (local6 - Static667.anInt10411) * 100 / (100 - Static667.anInt10411);
			}
			Static544.method7521(Static471.aClass50_136);
			Static449.method6670(Static30.method394(), Static253.aClass50_66, Static471.aClass50_136);
		}
		if (Static382.aClass247_2 == Static400.aClass247_12) {
			if (Static377.anInt6578 == -1) {
				Static377.anInt6578 = Static449.aClass50_129.method900("scape main");
			}
			Static34.method451();
			Static42.method560(2);
		}
		if (Static382.aClass247_2 == Static400.aClass247_13) {
			Static518.method7709(Static596.aClass50_167, Static150.aClass202_2);
		}
		if (Static400.aClass247_14 == Static382.aClass247_2) {
			local6 = Static158.method2384();
			if (local6 < 100) {
				return local6;
			}
			Static675.method8822(Static613.aClass50_172.method915(1));
			Static173.method2558(Static613.aClass50_172.method915(3));
			Static18.aClass145_1 = new Class145(Static613.aClass50_172);
		}
		if (Static400.aClass247_15 == Static382.aClass247_2) {
			if (Static50.anInt772 != -1 && !Static392.aClass50_114.method901(0, Static50.anInt772)) {
				return 99;
			}
			Static218.anInterface3_3 = new Class384(Static524.aClass50_124, Static538.aClass50_156, Static471.aClass50_136);
			Static522.aClass282_2 = new Class282(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static233.aClass172_1 = new Class172(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static18.aClass145_1);
			Static205.aClass363_1 = new Class363(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static471.aClass50_136);
			Static429.aClass309_1 = new Class309(Static591.aClass174_7, Static259.anInt4113, Static85.aClass50_23);
			Static404.aClass3_6 = new Class3(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static247.aClass269_3 = new Class269(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static239.aClass115_2 = new Class115(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static471.aClass50_136);
			Static670.aClass83_2 = new Class83(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static392.aClass50_114);
			Static347.aClass268_1 = new Class268(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static80.aClass118_1 = new Class118(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static400.aClass140_4 = new Class140(Static591.aClass174_7, Static259.anInt4113, true, Static207.aClass50_54, Static392.aClass50_114);
			Static299.aClass218_1 = new Class218(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static471.aClass50_136);
			Static40.aClass161_1 = new Class161(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62, Static471.aClass50_136);
			Static58.aClass230_1 = new Class230(Static591.aClass174_7, Static259.anInt4113, true, Static356.aClass50_101, Static392.aClass50_114);
			Static259.aClass135_1 = new Class135(Static591.aClass174_7, Static259.anInt4113, true, Static522.aClass282_2, Static655.aClass50_185, Static392.aClass50_114);
			Static135.aClass250_1 = new Class250(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static459.aClass128_2 = new Class128(Static591.aClass174_7, Static259.anInt4113, Static125.aClass50_35, Static269.aClass50_71, Static119.aClass50_34);
			Static117.aClass64_1 = new Class64(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static1.aClass286_5 = new Class286(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static312.aClass179_1 = new Class179(Static591.aClass174_7, Static259.anInt4113, Static7.aClass50_5, Static392.aClass50_114);
			Static402.aClass290_1 = new Class290(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static510.aClass175_1 = new Class175(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static634.aClass144_1 = new Class144(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static480.aClass298_2 = new Class298(Static591.aClass174_7, Static259.anInt4113, Static81.aClass50_20);
			Static532.aClass260_1 = new Class260(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static126.aClass388_1 = new Class388(Static591.aClass174_7, Static259.anInt4113, Static238.aClass50_62);
			Static488.method7148(Static392.aClass50_114, Static253.aClass50_66, Static471.aClass50_136, Static76.aClass50_19);
			Static432.method6484(Static633.aClass50_176);
			Static94.aClass236_1 = new Class236(Static259.anInt4113, Static103.aClass50_30, Static335.aClass50_95);
			Static62.aClass100_2 = new Class100(Static259.anInt4113, Static103.aClass50_30, Static335.aClass50_95, new Class16());
			Static669.method8720();
			Static400.aClass140_4.method2841(Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0);
			Static413.aClass63_1 = new Class63();
			Static523.method8754();
			Static601.method8108(Static22.aClass50_6);
			Static520.method7347(Static218.anInterface3_3, Static392.aClass50_114);
			@Pc(981) Class211 local981 = new Class211(Static425.aClass50_121.method892("huffman", ""));
			Static594.method8046(local981);
			try {
				jagmisc.init();
			} catch (@Pc(988) Throwable local988) {
			}
			Static409.aClass13_1 = Static11.method176();
			Static87.aClass5_Sub30_1 = new Class5_Sub30(true, Static150.aClass202_2);
		}
		if (Static400.aClass247_17 == Static382.aClass247_2) {
			local6 = Static151.method7370(Static471.aClass50_136) + Static268.method4051(true);
			local53 = Static443.method6608() + Static653.method8581();
			if (local53 > local6) {
				return local6 * 100 / local53;
			}
		}
		if (Static400.aClass247_18 == Static382.aClass247_2) {
			Static407.method5501(Static418.aClass50_119, Static404.aClass3_6, Static247.aClass269_3, Static400.aClass140_4, Static299.aClass218_1, Static40.aClass161_1, Static413.aClass63_1);
		}
		if (Static382.aClass247_2 == Static400.aClass247_19) {
			Static205.anIntArray184 = new int[Static634.aClass144_1.anInt3335];
			Static401.aStringArray26 = new String[Static510.aClass175_1.anInt4214];
			Static155.aBooleanArray3 = new boolean[Static634.aClass144_1.anInt3335];
			for (local6 = 0; local6 < Static634.aClass144_1.anInt3335; local6++) {
				if (Static634.aClass144_1.method2993(local6).anInt8852 == 0) {
					Static155.aBooleanArray3[local6] = true;
					Static132.anInt2227++;
				}
				Static205.anIntArray184[local6] = -1;
			}
			Static6.method144();
			Static646.anInt10216 = Static76.aClass50_19.method900("loginscreen");
			Static267.anInt4238 = Static76.aClass50_19.method900("lobbyscreen");
			Static570.aClass50_162.method911(false);
			Static449.aClass50_129.method911(true);
			Static471.aClass50_136.method911(true);
			Static253.aClass50_66.method911(true);
			Static425.aClass50_121.method911(true);
			Static76.aClass50_19.method911(true);
			Static661.aBoolean757 = true;
			Static238.aClass50_62.anInt990 = 2;
			Static85.aClass50_23.anInt990 = 2;
			Static207.aClass50_54.anInt990 = 2;
			Static356.aClass50_101.anInt990 = 2;
			Static655.aClass50_185.anInt990 = 2;
			Static125.aClass50_35.anInt990 = 2;
			Static7.aClass50_5.anInt990 = 2;
		}
		if (Static382.aClass247_2 == Static400.aClass247_20) {
			if (!Static175.method2576(Static646.anInt10216)) {
				return 0;
			}
			local150 = true;
			for (local53 = 0; local53 < Static227.aClass394ArrayArray2[Static646.anInt10216].length; local53++) {
				@Pc(1188) Class394 local1188 = Static227.aClass394ArrayArray2[Static646.anInt10216][local53];
				if (local1188.anInt10479 == 5 && local1188.anInt10517 != -1 && !Static471.aClass50_136.method901(0, local1188.anInt10517)) {
					local150 = false;
				}
			}
			if (!local150) {
				return 0;
			}
		}
		if (Static382.aClass247_2 == Static400.aClass247_21) {
			Static508.method7313(true);
		}
		if (Static382.aClass247_2 == Static400.aClass247_22) {
			Static459.aClass204_1.method4779();
			try {
				Static405.aThread6.join();
			} catch (@Pc(1236) InterruptedException local1236) {
				return 0;
			}
			Static13.aClass337_1 = null;
			Static190.aClass50_49 = null;
			Static405.aThread6 = null;
			Static459.aClass204_1 = null;
			Static603.anInterface7Array1 = null;
			Static494.aClass50_147 = null;
			Static249.method3519();
			Static445.aBoolean569 = Static655.aClass5_Sub36_29.aClass2_Sub9_1.method3783() == 1;
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub9_1, 1);
			if (Static445.aBoolean569) {
				Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 0);
			} else if (Static655.aClass5_Sub36_29.aClass2_Sub23_2.aBoolean681 && Static87.aClass5_Sub30_1.anInt4369 < 512 && Static87.aClass5_Sub30_1.anInt4369 != 0) {
				Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 0);
			}
			Static185.method2703();
			if (Static445.aBoolean569) {
				Static75.method1101(false, 0);
			} else {
				Static75.method1101(false, Static655.aClass5_Sub36_29.aClass2_Sub23_2.method7836());
			}
			Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
			Static209.method2989(Static563.aClass143_13);
			Static11.method173(Static563.aClass143_13);
			Static286.method3963(Static563.aClass143_13, Static471.aClass50_136);
			Static375.method5528(Static166.aClass59Array5);
		}
		return Static235.method3366();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)I")
	public static int method2867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static317.aByteArrayArrayArray13[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static317.aByteArrayArrayArray13[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BII)I")
	public static int method2868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) byte local21;
		if (arg0 > 20000) {
			Static544.method7520();
			local21 = 4;
		} else if (arg0 > 10000) {
			local21 = 3;
			Static325.method5073();
		} else if (arg0 <= 5000) {
			local21 = 1;
			Static46.method621();
		} else {
			Static204.method2850();
			local21 = 2;
		}
		if (arg1 != Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836()) {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, arg1);
			Static75.method1101(false, arg1);
		}
		Static185.method2703();
		return local21;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIZ)V")
	public static void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static175.method2576(arg0)) {
			Static327.method5092(arg1, arg2, arg3, Static227.aClass394ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V")
	public static void method2872(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(7, (long) arg0);
		local9.method2440();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	public static void method2873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static358.aClass198_7.method4076(Static49.aClass42_24.method730(Static259.anInt4113));
		@Pc(54) int local54;
		@Pc(27) int local27;
		if (Static530.aBoolean634) {
			for (@Pc(18) Class5_Sub2_Sub5 local18 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local18 != null; local18 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
				if (local18.anInt2821 == 1) {
					local27 = Static637.method8446((Class5_Sub2_Sub13) local18.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67);
				} else {
					local27 = Static61.method7529(local18);
				}
				if (local11 < local27) {
					local11 = local27;
				}
			}
			local54 = Static150.anInt2471 * 16 + 21;
			Static575.anInt9376 = (Static530.aBoolean635 ? 26 : 22) + Static150.anInt2471 * 16;
			local11 += 8;
		} else {
			for (@Pc(71) Class5_Sub2_Sub13 local71 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local71 != null; local71 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
				local27 = Static637.method8446(local71);
				if (local11 < local27) {
					local11 = local27;
				}
			}
			Static575.anInt9376 = (Static530.aBoolean635 ? 26 : 22) + Static223.anInt3566 * 16;
			local11 += 8;
			local54 = Static223.anInt3566 * 16 + 21;
		}
		@Pc(121) int local121 = arg0 - local11 / 2;
		if (Static563.anInt9176 < local121 + local11) {
			local121 = Static563.anInt9176 - local11;
		}
		if (local121 < 0) {
			local121 = 0;
		}
		local27 = arg1;
		if (Static316.anInt8165 < local54 + arg1) {
			local27 = Static316.anInt8165 - local54;
		}
		Static73.anInt1175 = local121;
		if (local27 < 0) {
			local27 = 0;
		}
		Static423.aBoolean549 = true;
		Static676.anInt9309 = local27;
		Static342.anInt6177 = local11;
	}
}
