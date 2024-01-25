import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!ma;")
	public static Class233 aClass233_6;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt8193;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public static int anInt8196;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!cq;")
	public static final Class65 aClass65_15 = new Class65();

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt8194 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIII)J")
	public static long method6898(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static635.aCalendar3.clear();
		Static635.aCalendar3.set(arg0, arg1, arg2, 12, 0, 0);
		return Static635.aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6902(@OriginalArg(1) Class16 arg0) {
		if (Static37.anInt1104 < 2 && !Static329.aBoolean166 || Static503.aClass208_9 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static329.aBoolean166 && Static37.anInt1104 < 2) {
			local36 = Static46.aString12 + Static569.aClass335_33.method7694(Static319.anInt5939) + Static542.aString107 + " ->";
		} else if (Static381.aBoolean509 && Static530.aClass284_1.method7637(81) && Static37.anInt1104 > 2) {
			local36 = Static435.method6378(Static614.aClass3_Sub6_Sub16_4);
		} else {
			@Pc(58) Class3_Sub6_Sub16 local58 = Static614.aClass3_Sub6_Sub16_4;
			if (local58 == null) {
				return;
			}
			local36 = Static435.method6378(local58);
			@Pc(67) int[] local67 = null;
			if (Static315.method4940(local58.anInt7069)) {
				local67 = Static237.aClass371_2.method8305((int) local58.aLong202).anIntArray253;
			} else if (local58.anInt7070 != -1) {
				local67 = Static237.aClass371_2.method8305(local58.anInt7070).anIntArray253;
			} else if (Static156.method4836(local58.anInt7069)) {
				@Pc(153) Class3_Sub11 local153 = (Class3_Sub11) Static500.aClass62_40.method1682((long) (int) local58.aLong202);
				if (local153 != null) {
					@Pc(158) Class23_Sub2_Sub1_Sub2_Sub2 local158 = local153.aClass23_Sub2_Sub1_Sub2_Sub2_1;
					@Pc(161) Class5 local161 = local158.aClass5_1;
					if (local161.anIntArray1 != null) {
						local161 = local161.method56(Static592.aClass47_2);
					}
					if (local161 != null) {
						local67 = local161.anIntArray2;
					}
				}
			} else if (Static340.method5163(local58.anInt7069)) {
				@Pc(118) Class178 local118;
				if (local58.anInt7069 == 1007) {
					local118 = Static349.aClass374_2.method8357((int) local58.aLong202);
				} else {
					local118 = Static349.aClass374_2.method8357((int) (local58.aLong202 >>> 32 & 0x7FFFFFFFL));
				}
				if (local118.anIntArray313 != null) {
					local118 = local118.method4012(Static592.aClass47_2);
				}
				if (local118 != null) {
					local67 = local118.anIntArray316;
				}
			}
			if (local67 != null) {
				local36 = local36 + Static228.method2115(local67);
			}
		}
		if (Static37.anInt1104 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static37.anInt1104 - 2) + Static569.aClass335_26.method7694(Static319.anInt5939);
		}
		if (Static328.aClass208_7 != null) {
			@Pc(258) Class69 local258 = Static328.aClass208_7.method4726(arg0);
			if (local258 == null) {
				local258 = Static243.aClass69_5;
			}
			local258.method7454(Static328.aClass208_7.anInt5638, Static328.aClass208_7.anInt5609, Static359.aClass102Array17, local36, Static503.anInt8455, Static394.anIntArray426, Static9.anInt101, Static328.aClass208_7.anInt5665, Static328.aClass208_7.anInt5630, Static27.anInt793, Static328.aClass208_7.anInt5600, Static442.anIntArray463, Static611.aRandom1, Static328.aClass208_7.anInt5639);
			Static471.method8502(Static394.anIntArray426[0], Static394.anIntArray426[1], Static394.anIntArray426[2], Static394.anIntArray426[3]);
		} else if (Static247.aClass208_3 != null && Static102.aClass181_38 == Static341.aClass181_93) {
			@Pc(239) int local239 = Static243.aClass69_5.method7453(Static359.aClass102Array17, Static446.anInt7707 + 16, Static442.anIntArray463, Static611.aRandom1, local36, Static422.anInt7120 + 4, Static9.anInt101);
			Static471.method8502(Static422.anInt7120 + 4, Static446.anInt7707, local239 + Static17.aClass202_1.method4632(local36), 16);
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!fca;I)Ljava/lang/String;")
	public static String method6903(@OriginalArg(1) Class3_Sub17 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4841();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local7];
			arg0.lb += Static255.aClass332_1.method7673(0, local23, local7, arg0.aByteArray59, arg0.lb);
			return Static351.method5274(local23, local7, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
