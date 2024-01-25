import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_2 = new Class307(9, 2);

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_23 = new Class173(61, -1);

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
	public static void method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static60.aClass53ArrayArrayArray1[0][arg1][arg2] != null && Static60.aClass53ArrayArrayArray1[0][arg1][arg2].aClass53_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static60.aClass53ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class53 local44 = Static60.aClass53ArrayArrayArray1[local22][arg1][arg2] = new Class53(local22);
				if (local20) {
					local44.aByte13++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	public static int method1213() {
		@Pc(10) int local10;
		if (!Static214.aClass4_Sub19_Sub1_1.aBoolean263) {
			for (local10 = 0; local10 < Static114.anInt9774; local10++) {
				if (Static84.anInterface2Array2[local10].method5851() == 's' || Static84.anInterface2Array2[local10].method5851() == 'S') {
					Static214.aClass4_Sub19_Sub1_1.aBoolean263 = true;
					break;
				}
			}
		}
		@Pc(51) int local51;
		if (Static129.aClass96_1 == Static141.aClass96_23) {
			@Pc(42) Runtime local42 = Runtime.getRuntime();
			local51 = (int) ((local42.totalMemory() - local42.freeMemory()) / 1024L);
			@Pc(54) long local54 = Static574.method8210();
			if (Static139.aLong70 == 0L) {
				Static139.aLong70 = local54;
			}
			if (local51 > 16384 && local54 - Static139.aLong70 < 5000L) {
				if (local54 - Static363.aLong179 > 1000L) {
					System.gc();
					Static363.aLong179 = local54;
				}
				return 0;
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_2) {
			if (Static413.aClass195_5 == null) {
				Static413.aClass195_5 = new Class195(Static528.aClass329_3, Static307.aClass269_3, Static479.aBigInteger8, Static282.aBigInteger5);
			}
			if (!Static413.aClass195_5.method4828()) {
				return 0;
			}
			Static510.method2775(0, null);
			Static573.aBoolean707 = !Static537.method7551();
			Static464.aClass176_113 = Static196.method3377(Static573.aBoolean707 ? 34 : 32, false);
			Static212.aClass176_59 = Static196.method3377(33, false);
			Static500.aClass176_119 = Static196.method3377(13, false);
		}
		if (Static141.aClass96_23 == Static129.aClass96_3) {
			Static212.aClass176_59.method3975();
			local10 = Static31.aClass146_Sub1Array1[33].method3521();
			local10 += Static31.aClass146_Sub1Array1[Static573.aBoolean707 ? 34 : 32].method3521();
			local10 += Static31.aClass146_Sub1Array1[13].method3521();
			local10 += Static212.aClass176_59.method4003();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static137.anInt2944 = Static464.aClass176_113.method3976();
			Static146.anInt3109 = Static212.aClass176_59.method3976();
			Static225.method3669(Static464.aClass176_113);
			local51 = Static214.aClass4_Sub19_Sub1_1.anInt3075;
			Static376.aClass302_1 = new Class302(Static438.aClass92_4, Static154.anInt3181, Static212.aClass176_59);
			@Pc(213) int[] local213 = Static376.aClass302_1.method7167(local51);
			@Pc(219) Class16 local219 = new Class16(Static464.aClass176_113, Static500.aClass176_119);
			if (local213.length > 0) {
				Static400.anInterface14Array1 = new Interface14[local213.length];
				for (@Pc(228) int local228 = 0; local228 < Static400.anInterface14Array1.length; local228++) {
					Static400.anInterface14Array1[local228] = new Class123(Static376.aClass302_1.method7168(local213[local228]), local219);
				}
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_4) {
			Static163.method2970(Static464.aClass176_113, Static21.method261(), Static500.aClass176_119);
		}
		if (Static129.aClass96_5 == Static141.aClass96_23) {
			local10 = Static549.method7967();
			local51 = Static229.method3718();
			if (local51 > local10) {
				return local10 * 100 / local51;
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_6) {
			if (Static400.anInterface14Array1 != null && Static400.anInterface14Array1.length > 0) {
				if (Static400.anInterface14Array1[0].method7594() < 100) {
					return 0;
				}
				if (Static400.anInterface14Array1.length > 1 && Static376.aClass302_1.method7171() && Static400.anInterface14Array1[1].method7594() < 100) {
					return 0;
				}
			}
			Static374.method5998(Static440.aClass44_12);
			method1216(Static440.aClass44_12);
			Static285.method5604(1);
		}
		if (Static129.aClass96_7 == Static141.aClass96_23) {
			for (local10 = 0; local10 < 4; local10++) {
				Static86.aClass111Array1[local10] = Static406.method6392(Static119.anInt2717, Static428.anInt8046);
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_8) {
			Static281.aClass176_74 = Static196.method3377(8, false);
			Static347.aClass176_87 = Static196.method3377(0, false);
			Static557.aClass176_27 = Static196.method3377(1, false);
			Static93.aClass176_31 = Static196.method3377(2, false);
			Static231.aClass176_63 = Static196.method3377(3, false);
			Static399.aClass176_103 = Static196.method3377(4, false);
			Static261.aClass176_69 = Static196.method3377(5, true);
			Static55.aClass176_104 = Static196.method3377(6, true);
			Static309.aClass176_81 = Static196.method3377(7, false);
			Static67.aClass176_25 = Static196.method3377(9, false);
			Static212.aClass176_60 = Static196.method3377(10, false);
			Static518.aClass176_127 = Static196.method3377(11, false);
			Static536.aClass176_128 = Static196.method3377(12, false);
			Static112.aClass176_35 = Static196.method3377(14, false);
			Static176.aClass176_48 = Static196.method3377(15, false);
			Static49.aClass176_18 = Static196.method3377(16, false);
			Static79.aClass176_28 = Static196.method3377(17, false);
			Static157.aClass176_43 = Static196.method3377(18, false);
			Static467.aClass176_114 = Static196.method3377(19, false);
			Static34.aClass176_11 = Static196.method3377(20, false);
			Static586.aClass176_132 = Static196.method3377(21, false);
			Static333.aClass176_97 = Static196.method3377(22, false);
			Static12.aClass176_6 = Static196.method3377(23, true);
			Static256.aClass176_67 = Static196.method3377(24, false);
			Static194.aClass176_55 = Static196.method3377(25, false);
			Static502.aClass176_121 = Static196.method3377(26, true);
			Static266.aClass176_71 = Static196.method3377(27, false);
			Static362.aClass176_94 = Static196.method3377(28, true);
			Static137.aClass176_42 = Static196.method3377(29, false);
			Static362.aClass176_93 = Static196.method3377(30, true);
			Static224.aClass176_61 = Static196.method3377(31, true);
		}
		if (Static129.aClass96_9 == Static141.aClass96_23) {
			local10 = 0;
			for (local51 = 0; local51 < 35; local51++) {
				if (Static31.aClass146_Sub1Array1[local51] != null) {
					local10 += Static31.aClass146_Sub1Array1[local51].method3521() * Static490.anIntArray481[local51] / 100;
				}
			}
			if (local10 != 100) {
				if (Static377.anInt7297 < 0) {
					Static377.anInt7297 = local10;
				}
				return (local10 - Static377.anInt7297) * 100 / (100 - Static377.anInt7297);
			}
			Static580.method2691(Static281.aClass176_74);
			Static163.method2970(Static281.aClass176_74, Static21.method261(), Static500.aClass176_119);
		}
		if (Static129.aClass96_10 == Static141.aClass96_23) {
			Static12.method179();
			Static285.method5604(2);
		}
		if (Static141.aClass96_23 == Static129.aClass96_11) {
			Static269.method4521(Static406.aClass354_5, Static362.aClass176_93);
		}
		if (Static141.aClass96_23 == Static129.aClass96_12) {
			local10 = Static551.method7983();
			if (local10 < 100) {
				return local10;
			}
			Static248.method3988(Static362.aClass176_94.method4005(1));
			Static90.method2082(Static362.aClass176_94.method4005(3));
		}
		if (Static129.aClass96_13 == Static141.aClass96_23) {
			if (Static529.anInt9421 != -1 && !Static309.aClass176_81.method3977(Static529.anInt9421, 0)) {
				return 99;
			}
			Static237.anInterface11_8 = new Class315(Static502.aClass176_121, Static67.aClass176_25, Static281.aClass176_74);
			Static484.aClass313_2 = new Class313(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static462.aClass178_1 = new Class178(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static222.aClass243_2 = new Class243(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31, Static281.aClass176_74);
			Static231.aClass87_1 = new Class87(Static438.aClass92_4, Static154.anInt3181, Static79.aClass176_28);
			Static228.aClass189_4 = new Class189(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static407.aClass360_5 = new Class360(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static522.aClass290_6 = new Class290(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31, Static309.aClass176_81);
			Static327.aClass161_1 = new Class161(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static565.aClass188_1 = new Class188(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static204.aClass139_8 = new Class139(Static438.aClass92_4, Static154.anInt3181, true, Static49.aClass176_18, Static309.aClass176_81);
			Static182.aClass142_3 = new Class142(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31, Static281.aClass176_74);
			Static447.aClass237_3 = new Class237(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31, Static281.aClass176_74);
			Static237.aClass31_1 = new Class31(Static438.aClass92_4, Static154.anInt3181, true, Static157.aClass176_43, Static309.aClass176_81);
			Static521.aClass273_2 = new Class273(Static438.aClass92_4, Static154.anInt3181, true, Static484.aClass313_2, Static467.aClass176_114, Static309.aClass176_81);
			Static517.aClass144_1 = new Class144(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static61.aClass48_1 = new Class48(Static438.aClass92_4, Static154.anInt3181, Static34.aClass176_11, Static347.aClass176_87, Static557.aClass176_27);
			Static419.aClass28_1 = new Class28(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static594.aClass170_1 = new Class170(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static569.aClass213_2 = new Class213(Static438.aClass92_4, Static154.anInt3181, Static586.aClass176_132, Static309.aClass176_81);
			Static278.aClass171_1 = new Class171(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static398.aClass207_1 = new Class207(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static323.aClass130_1 = new Class130(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static381.aClass2_4 = new Class2(Static438.aClass92_4, Static154.anInt3181, Static333.aClass176_97);
			Static121.aClass141_1 = new Class141(Static438.aClass92_4, Static154.anInt3181, Static93.aClass176_31);
			Static202.method3423(Static281.aClass176_74, Static231.aClass176_63, Static309.aClass176_81, Static500.aClass176_119);
			Static453.method6971(Static137.aClass176_42);
			Static301.aClass303_1 = new Class303(Static154.anInt3181, Static256.aClass176_67, Static194.aClass176_55);
			Static190.aClass295_1 = new Class295(Static154.anInt3181, Static256.aClass176_67, Static194.aClass176_55, new Class131());
			Static78.method1259();
			Static204.aClass139_8.method3311(!Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000));
			Static45.aClass148_1 = new Class148();
			Static379.method6045();
			Static402.method6329(Static266.aClass176_71);
			Static421.method6591(Static309.aClass176_81, Static237.anInterface11_8);
			@Pc(924) Class76 local924 = new Class76(Static212.aClass176_60.method3972("huffman", ""));
			Static429.method6713(local924);
			try {
				jagmisc.init();
			} catch (@Pc(933) Throwable local933) {
			}
			Static589.aClass151_1 = Static460.method7017();
		}
		if (Static129.aClass96_15 == Static141.aClass96_23) {
			local10 = Static593.method8365(Static281.aClass176_74) + Static335.method5483(true);
			local51 = Static154.method2854() + Static229.method3718();
			if (local51 > local10) {
				return local10 * 100 / local51;
			}
		}
		if (Static129.aClass96_16 == Static141.aClass96_23) {
			Static455.method3081(Static12.aClass176_6, Static228.aClass189_4, Static407.aClass360_5, Static204.aClass139_8, Static182.aClass142_3, Static447.aClass237_3, Static45.aClass148_1);
		}
		if (Static141.aClass96_23 == Static129.aClass96_17) {
			Static225.aBooleanArray11 = new boolean[Static323.aClass130_1.anInt3612];
			Static419.anIntArray414 = new int[Static323.aClass130_1.anInt3612];
			Static53.aStringArray10 = new String[Static398.aClass207_1.anInt6115];
			for (local10 = 0; local10 < Static323.aClass130_1.anInt3612; local10++) {
				if (Static323.aClass130_1.method3225(local10).anInt219 == 0) {
					Static225.aBooleanArray11[local10] = true;
					Static198.anInt3921++;
				}
				Static419.anIntArray414[local10] = -1;
			}
			Static87.method2045();
			Static150.anInt3141 = Static231.aClass176_63.method3998("loginscreen");
			Static469.anInt8688 = Static231.aClass176_63.method3998("lobbyscreen");
			Static261.aClass176_69.method4000(false);
			Static55.aClass176_104.method4000(true);
			Static281.aClass176_74.method4000(true);
			Static500.aClass176_119.method4000(true);
			Static212.aClass176_60.method4000(true);
			Static231.aClass176_63.method4000(true);
			Static463.aBoolean508 = true;
			Static93.aClass176_31.anInt4548 = 2;
			Static79.aClass176_28.anInt4548 = 2;
			Static49.aClass176_18.anInt4548 = 2;
			Static157.aClass176_43.anInt4548 = 2;
			Static467.aClass176_114.anInt4548 = 2;
			Static34.aClass176_11.anInt4548 = 2;
			Static586.aClass176_132.anInt4548 = 2;
		}
		@Pc(1118) Class225 local1118;
		if (Static129.aClass96_18 == Static141.aClass96_23) {
			if (!Static478.method7175(Static150.anInt3141)) {
				return 0;
			}
			for (local10 = 0; local10 < Static343.aClass225ArrayArray1[Static150.anInt3141].length; local10++) {
				local1118 = Static343.aClass225ArrayArray1[Static150.anInt3141][local10];
				if (local1118.anInt6508 == 5 && local1118.anInt6520 != -1) {
					local1118.method5520(Static440.aClass44_12);
				}
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_19) {
			for (local10 = 0; local10 < Static343.aClass225ArrayArray1[Static150.anInt3141].length; local10++) {
				local1118 = Static343.aClass225ArrayArray1[Static150.anInt3141][local10];
				if (local1118.anInt6508 == 5 && local1118.anInt6520 != -1 && local1118.method5520(Static440.aClass44_12) == null && Static581.aBoolean714) {
					return 0;
				}
			}
		}
		if (Static141.aClass96_23 == Static129.aClass96_20) {
			Static553.method8011(true);
		}
		if (Static129.aClass96_21 == Static141.aClass96_23) {
			Static113.aClass282_1.method6816();
			try {
				Static313.aThread4.join();
			} catch (@Pc(1204) InterruptedException local1204) {
				return 0;
			}
			Static464.aClass176_113 = null;
			Static376.aClass302_1 = null;
			Static113.aClass282_1 = null;
			Static400.anInterface14Array1 = null;
			Static313.aThread4 = null;
			Static212.aClass176_59 = null;
			Static317.method8393();
			Static493.aBoolean629 = Static214.aClass4_Sub19_Sub1_1.aBoolean263;
			Static214.aClass4_Sub19_Sub1_1.aBoolean263 = true;
			Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
			if (Static493.aBoolean629) {
				Static547.method7956(0);
			} else {
				Static547.method7956(Static214.aClass4_Sub19_Sub1_1.anInt3063);
			}
			Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
			Static374.method5998(Static440.aClass44_12);
			method1216(Static440.aClass44_12);
			Static164.method2974(Static440.aClass44_12, Static281.aClass176_74);
			Static95.method2111(Static188.aClass78Array10);
		}
		return Static236.method3798();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BILclient!ec;)V")
	public static void method1214(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub4_Sub2_Sub1 arg1) {
		if (arg1.anIntArray459 == null) {
			return;
		}
		@Pc(19) int local19 = arg1.anIntArray459[arg0 + 1];
		if (local19 == arg1.anInt8412) {
			return;
		}
		arg1.anInt8369 = 1;
		arg1.anInt8391 = 0;
		arg1.anInt8412 = local19;
		arg1.anInt8433 = 0;
		arg1.anInt8445 = arg1.anInt8447;
		arg1.anInt8436 = 0;
		if (arg1.anInt8412 != -1) {
			Static301.method5179(Static61.aClass48_1.method1016(arg1.anInt8412), arg1, arg1.anInt8391);
			return;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method1216(@OriginalArg(0) Class44 arg0) {
		Static454.aClass58_13 = Static472.method7095(true, arg0, Static329.anInt6334);
		Static211.aClass114_7 = Static564.method8080(arg0, Static329.anInt6334);
		Static272.aClass58_5 = Static472.method7095(true, arg0, Static273.anInt7288);
		Static238.aClass114_9 = Static564.method8080(arg0, Static273.anInt7288);
		Static552.aClass58_14 = Static472.method7095(true, arg0, Static189.anInt3711);
		Static314.aClass114_11 = Static564.method8080(arg0, Static189.anInt3711);
	}
}
