import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread5;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
	public static int anInt6388 = 0;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "[I")
	public static final int[] anIntArray503 = new int[8];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5662(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(BI)V")
	public static void method5663(@OriginalArg(1) int arg0) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub9_1.method2421() == 0) {
			arg0 = -1;
		}
		if (Static46.anInt747 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(31) Class256 local31 = Static398.aClass102_1.method2072(arg0);
			@Pc(35) Class176 local35 = local31.method6182();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static214.aClass192_1.method4341(Static181.aCanvas3, local35.method4053(), new Point(local31.anInt6934, local31.anInt6939), local35.method4055(), local35.method4047());
				Static46.anInt747 = arg0;
			}
		}
		if (arg0 == -1 && Static46.anInt747 != -1) {
			Static214.aClass192_1.method4341(Static181.aCanvas3, -1, new Point(), -1, (int[]) null);
			Static46.anInt747 = -1;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!kf;[Lclient!tn;)V")
	public static void method5664(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class5_Sub27[] arg1) {
		@Pc(6) int local6;
		if (Static237.aBoolean328) {
			local6 = arg0.method7990(arg1);
			Static480.aClass126_12.method7026(local6, arg1);
		}
		if (Static327.aClass40Array2 == Static299.aClass40Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class14_Sub1_Sub1) {
				local6 = ((Class14_Sub1_Sub1) arg0).aShort74;
				local28 = ((Class14_Sub1_Sub1) arg0).aShort71;
			} else {
				local6 = arg0.anInt9317 >> Static162.anInt2830;
				local28 = arg0.anInt9315 >> Static162.anInt2830;
			}
			Static480.aClass126_12.EA(Static492.aClass40Array3[0].method8447(arg0.anInt9317, arg0.anInt9315), Static649.method8909(local6, local28), Static40.method722(local6, local28), Static585.method8205(local6, local28));
		}
		@Pc(64) Class14_Sub10 local64 = arg0.method8002(Static480.aClass126_12);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean759) {
			@Pc(72) Class14_Sub9[] local72 = local64.aClass14_Sub9Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class14_Sub9 local79 = local72[local74];
				if (local79.aBoolean809) {
					Static354.method5603(local79.anInt9896 + local79.anInt9895, local79.anInt9898 - local79.anInt9895, local79.anInt9894 + local79.anInt9895, local79.anInt9897 - local79.anInt9895);
				}
			}
		}
		if (local64.aBoolean845) {
			local64.aClass14_Sub1_23 = arg0;
			if (Static425.aBoolean601) {
				@Pc(119) Class43 local119 = Static599.aClass43_3;
				synchronized (Static599.aClass43_3) {
					Static599.aClass43_3.method868(local64);
					return;
				}
			}
			Static599.aClass43_3.method868(local64);
			return;
		}
		Static435.method6488(local64);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
	public static void method5666() {
		Static233.method6780(false);
		Static564.anInt9281 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static112.aByteArrayArray4.length; local14++) {
			if (Static462.anIntArray542[local14] != -1 && Static112.aByteArrayArray4[local14] == null) {
				Static112.aByteArrayArray4[local14] = Static342.aClass384_86.method8885(Static462.anIntArray542[local14], 0);
				if (Static112.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static564.anInt9281++;
				}
			}
			if (Static379.anIntArray680[local14] != -1 && Static610.aByteArrayArray26[local14] == null) {
				Static610.aByteArrayArray26[local14] = Static342.aClass384_86.method8874(Static141.anIntArrayArray12[local14], 0, Static379.anIntArray680[local14]);
				if (Static610.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static564.anInt9281++;
				}
			}
			if (Static28.anIntArray43[local14] != -1 && Static343.aByteArrayArray10[local14] == null) {
				Static343.aByteArrayArray10[local14] = Static342.aClass384_86.method8885(Static28.anIntArray43[local14], 0);
				if (Static343.aByteArrayArray10[local14] == null) {
					Static564.anInt9281++;
					local12 = false;
				}
			}
			if (Static322.anIntArray403[local14] != -1 && Static310.aByteArrayArray9[local14] == null) {
				Static310.aByteArrayArray9[local14] = Static342.aClass384_86.method8885(Static322.anIntArray403[local14], 0);
				if (Static310.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static564.anInt9281++;
				}
			}
			if (Static587.anIntArray777 != null && Static503.aByteArrayArray8[local14] == null && Static587.anIntArray777[local14] != -1) {
				Static503.aByteArrayArray8[local14] = Static342.aClass384_86.method8874(Static141.anIntArrayArray12[local14], 0, Static587.anIntArray777[local14]);
				if (Static503.aByteArrayArray8[local14] == null) {
					Static564.anInt9281++;
					local12 = false;
				}
			}
		}
		if (Static173.aClass383_3 == null) {
			if (Static573.aClass5_Sub4_Sub1_3 == null || !Static280.aClass384_71.method8876(Static573.aClass5_Sub4_Sub1_3.aString11 + "_staticelements")) {
				Static173.aClass383_3 = new Class383(0);
			} else if (Static280.aClass384_71.method8894(Static573.aClass5_Sub4_Sub1_3.aString11 + "_staticelements")) {
				Static173.aClass383_3 = Static119.method1739(Static202.aBoolean294, Static280.aClass384_71, Static573.aClass5_Sub4_Sub1_3.aString11 + "_staticelements");
			} else {
				Static564.anInt9281++;
				local12 = false;
			}
		}
		if (!local12) {
			Static220.anInt3794 = 1;
			return;
		}
		Static69.anInt1100 = 0;
		local12 = true;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static112.aByteArrayArray4.length; local250++) {
			@Pc(256) byte[] local256 = Static610.aByteArrayArray26[local250];
			if (local256 != null) {
				local269 = (Static594.anIntArray784[local250] >> 8) * 64 - Static113.anInt1785;
				local279 = (Static594.anIntArray784[local250] & 0xFF) * 64 - Static622.anInt10087;
				if (Static466.anInt7862 != 0) {
					local269 = 10;
					local279 = 10;
				}
				local12 &= Static510.method7374(Static111.anInt1752, local269, local279, local256, Static279.anInt4567);
			}
			local256 = Static310.aByteArrayArray9[local250];
			if (local256 != null) {
				local269 = (Static594.anIntArray784[local250] >> 8) * 64 - Static113.anInt1785;
				local279 = (Static594.anIntArray784[local250] & 0xFF) * 64 - Static622.anInt10087;
				if (Static466.anInt7862 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static510.method7374(Static111.anInt1752, local269, local279, local256, Static279.anInt4567);
			}
		}
		if (!local12) {
			Static220.anInt3794 = 2;
			return;
		}
		if (Static220.anInt3794 != 0) {
			Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_13.method1237(Static321.anInt5554) + "<br>(100%)");
		}
		Static439.method6528();
		Static587.method8245();
		Static515.method7421();
		@Pc(384) boolean local384 = false;
		if (Static485.aClass126_17.method7016() && Static627.aClass5_Sub46_31.aClass11_Sub23_1.method7462() == 2) {
			for (local269 = 0; local269 < Static112.aByteArrayArray4.length; local269++) {
				if (Static310.aByteArrayArray9[local269] != null || Static343.aByteArrayArray10[local269] != null) {
					local384 = true;
					break;
				}
			}
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub28_1.method8173() == 1) {
			local269 = Static425.anIntArray577[Static292.anInt4716];
		} else {
			local269 = Static336.anIntArray435[Static292.anInt4716];
		}
		if (Static485.aClass126_17.method7001()) {
			local269++;
		}
		Static92.method8486(Static485.aClass126_17, Static296.anInt4746, Static111.anInt1752, Static279.anInt4567, local269, local384, Static485.aClass126_17.method7032() > 0);
		Static45.method765(Static619.anInt10049);
		if (Static619.anInt10049 == 0) {
			Static449.method6676((Class6) null);
		} else {
			Static449.method6676(Static288.aClass6_8);
		}
		for (local279 = 0; local279 < 4; local279++) {
			Static308.aClass182Array1[local279].method4162();
		}
		Static648.method8902();
		Static77.method1244(false);
		Static1.method5728();
		Static374.aClass218_1 = null;
		Static54.aBoolean64 = false;
		Static439.method6528();
		System.gc();
		Static233.method6780(true);
		Static273.method4148();
		Static514.anInt8604 = Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195();
		Static595.aBoolean786 = Static125.anInt2059 >= 96;
		Static505.aBoolean502 = Static627.aClass5_Sub46_31.aClass11_Sub23_1.method7462() == 2;
		Static132.aBoolean176 = Static627.aClass5_Sub46_31.aClass11_Sub11_1.method2927() == 1;
		Static74.anInt1254 = Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 1 ? -1 : Static315.anInt5514;
		Static584.aBoolean769 = Static627.aClass5_Sub46_31.aClass11_Sub25_1.method7702() == 1;
		Static322.aBoolean469 = Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8541() == 1;
		Static121.aClass15_Sub1_2 = new Class15_Sub1(4, Static111.anInt1752, Static279.anInt4567, false);
		if (Static466.anInt7862 == 0) {
			Static282.method4238(Static121.aClass15_Sub1_2, Static112.aByteArrayArray4);
		} else {
			Static632.method8759(Static121.aClass15_Sub1_2, Static112.aByteArrayArray4);
		}
		Static221.method3414(Static279.anInt4567 >> 4, Static111.anInt1752 >> 4);
		Static383.method5943();
		if (local384) {
			Static113.method1651(true);
			Static30.aClass15_Sub1_1 = new Class15_Sub1(1, Static111.anInt1752, Static279.anInt4567, true);
			if (Static466.anInt7862 == 0) {
				Static282.method4238(Static30.aClass15_Sub1_1, Static343.aByteArrayArray10);
				Static233.method6780(true);
			} else {
				Static632.method8759(Static30.aClass15_Sub1_1, Static343.aByteArrayArray10);
				Static233.method6780(true);
			}
			Static30.aClass15_Sub1_1.method390(Static121.aClass15_Sub1_2.anIntArrayArrayArray2[0]);
			Static30.aClass15_Sub1_1.method381((int[][][]) null, Static485.aClass126_17, (Class182[]) null);
			Static113.method1651(false);
		}
		Static121.aClass15_Sub1_2.method381(local384 ? Static30.aClass15_Sub1_1.anIntArrayArrayArray2 : null, Static485.aClass126_17, Static308.aClass182Array1);
		if (Static466.anInt7862 == 0) {
			Static233.method6780(true);
			Static95.method1436(Static610.aByteArrayArray26, Static121.aClass15_Sub1_2);
			if (Static503.aByteArrayArray8 != null) {
				Static142.method7402();
			}
		} else {
			Static233.method6780(true);
			Static126.method1888(Static121.aClass15_Sub1_2, Static610.aByteArrayArray26);
		}
		Static587.method8245();
		if (Static125.anInt2059 < 96) {
			Static393.method6104();
		}
		Static233.method6780(true);
		Static121.aClass15_Sub1_2.method391((Class40) null, Static485.aClass126_17, local384 ? Static327.aClass40Array2[0] : null);
		Static121.aClass15_Sub1_2.method395(false, Static485.aClass126_17);
		Static233.method6780(true);
		if (local384) {
			Static113.method1651(true);
			Static233.method6780(true);
			if (Static466.anInt7862 == 0) {
				Static95.method1436(Static310.aByteArrayArray9, Static30.aClass15_Sub1_1);
			} else {
				Static126.method1888(Static30.aClass15_Sub1_1, Static310.aByteArrayArray9);
			}
			Static587.method8245();
			Static233.method6780(true);
			Static30.aClass15_Sub1_1.method391(Static492.aClass40Array3[0], Static485.aClass126_17, (Class40) null);
			Static30.aClass15_Sub1_1.method395(true, Static485.aClass126_17);
			Static233.method6780(true);
			Static113.method1651(false);
		}
		Static398.method6171();
		@Pc(776) int local776 = Static121.aClass15_Sub1_2.anInt357;
		if (Static299.anInt4751 < local776) {
			local776 = Static299.anInt4751;
		}
		if (Static299.anInt4751 - 1 > local776) {
			local776 = Static299.anInt4751 - 1;
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0) {
			Static227.method3573(local776);
		} else {
			Static227.method3573(0);
		}
		@Pc(814) int local814;
		@Pc(818) int local818;
		for (@Pc(810) int local810 = 0; local810 < 4; local810++) {
			for (local814 = 0; local814 < Static111.anInt1752; local814++) {
				for (local818 = 0; local818 < Static279.anInt4567; local818++) {
					Static292.method4306(local814, local810, local818);
				}
			}
		}
		Static283.method4242();
		Static439.method6528();
		Static186.method2986();
		Static587.method8245();
		Static587.method8249();
		@Pc(869) Class5_Sub40 local869;
		if (Static510.aFrame2 != null && Static487.aClass30_2 != null && Static469.anInt7883 == 11) {
			local869 = Static25.method507(Static98.aClass208_2, Static232.aClass181_36);
			local869.aClass5_Sub12_Sub2_2.method8622(1057001181);
			Static612.method8496(local869);
		}
		if (Static466.anInt7862 == 0) {
			local814 = (Static261.anInt4343 - (Static111.anInt1752 >> 4)) / 8;
			local818 = ((Static111.anInt1752 >> 4) + Static261.anInt4343) / 8;
			@Pc(909) int local909 = (Static237.anInt4007 - (Static279.anInt4567 >> 4)) / 8;
			@Pc(917) int local917 = (Static237.anInt4007 + (Static279.anInt4567 >> 4)) / 8;
			for (@Pc(921) int local921 = local814 - 1; local921 <= local818 + 1; local921++) {
				for (@Pc(927) int local927 = local909 - 1; local927 <= local917 + 1; local927++) {
					if (local921 < local814 || local818 < local921 || local927 < local909 || local917 < local927) {
						Static342.aClass384_86.method8886("m" + local921 + "_" + local927);
						Static342.aClass384_86.method8886("l" + local921 + "_" + local927);
					}
				}
			}
		}
		if (Static469.anInt7883 == 4) {
			Static214.method3254(3);
		} else if (Static469.anInt7883 == 8) {
			Static214.method3254(7);
		} else {
			Static214.method3254(10);
			if (Static487.aClass30_2 != null) {
				local869 = Static25.method507(Static98.aClass208_2, Static387.aClass181_53);
				Static612.method8496(local869);
			}
		}
		Static88.method1387();
		Static439.method6528();
		Static619.method8532();
		Static367.aBoolean541 = true;
		if (Static554.aBoolean741) {
			Static177.method2690("Took: " + (Static205.method3179() - Static408.aLong191) + "ms");
			Static554.aBoolean741 = false;
		}
	}
}
