import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
	public static int anInt6735 = 0;

	@OriginalMember(owner = "client!vea", name = "A", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_10 = new Class108(7, 2);

	@OriginalMember(owner = "client!vea", name = "K", descriptor = "I")
	public static int anInt6745 = 0;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5642(@OriginalArg(1) String arg0) {
		return Static551.method7077(arg0, caa.class);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5645(@OriginalArg(0) Class95 arg0) {
		if (Static166.anInt3037 < 2 && !Static47.aBoolean59 || Static264.aClass265_8 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static47.aBoolean59 && Static166.anInt3037 < 2) {
			local36 = Static36.aString12 + Static114.aClass84_32.method1729(Static654.anInt10668) + Static225.aString51 + " ->";
		} else if (Static84.aBoolean109 && Static413.aClass154_1.method5014(81) && Static166.anInt3037 > 2) {
			local36 = Static262.method3910(Static562.aClass3_Sub5_Sub18_7);
		} else {
			@Pc(52) Class3_Sub5_Sub18 local52 = Static562.aClass3_Sub5_Sub18_7;
			if (local52 == null) {
				return;
			}
			local36 = Static262.method3910(local52);
			@Pc(61) int[] local61 = null;
			if (Static413.method5631(local52.anInt9217)) {
				local61 = Static117.aClass197_2.method4518((int) local52.aLong259).anIntArray16;
			} else if (local52.anInt9210 != -1) {
				local61 = Static117.aClass197_2.method4518(local52.anInt9210).anIntArray16;
			} else if (Static475.method6321(local52.anInt9217)) {
				@Pc(92) Class3_Sub52 local92 = (Class3_Sub52) Static105.aClass333_11.method7489((long) (int) local52.aLong259);
				if (local92 != null) {
					@Pc(97) Class34_Sub1_Sub1_Sub2_Sub2 local97 = local92.aClass34_Sub1_Sub1_Sub2_Sub2_2;
					@Pc(100) Class261 local100 = local97.aClass261_1;
					if (local100.anIntArray364 != null) {
						local100 = local100.method5772(Static210.aClass262_1);
					}
					if (local100 != null) {
						local61 = local100.anIntArray367;
					}
				}
			} else if (Static210.method3123(local52.anInt9217)) {
				@Pc(136) Class216 local136;
				if (local52.anInt9217 == 1012) {
					local136 = Static466.aClass340_6.method7665((int) local52.aLong259);
				} else {
					local136 = Static466.aClass340_6.method7665((int) (local52.aLong259 >>> 32 & 0x7FFFFFFFL));
				}
				if (local136.anIntArray325 != null) {
					local136 = local136.method5043(Static210.aClass262_1);
				}
				if (local136 != null) {
					local61 = local136.anIntArray326;
				}
			}
			if (local61 != null) {
				local36 = local36 + Static483.method6386(local61);
			}
		}
		if (Static166.anInt3037 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static166.anInt3037 - 2) + Static114.aClass84_25.method1729(Static654.anInt10668);
		}
		if (Static45.aClass265_3 != null) {
			@Pc(222) Class67 local222 = Static45.aClass265_3.method5909(arg0);
			if (local222 == null) {
				local222 = Static293.aClass67_14;
			}
			local222.method7679(Static45.aClass265_3.anInt6999, Static6.anIntArray9, Static572.anInt9223, Static179.anInt9624, Static594.aRandom1, Static575.anInt9259, Static454.anIntArray397, Static470.aClass6Array11, Static45.aClass265_3.anInt7051, Static45.aClass265_3.anInt6997, local36, Static45.aClass265_3.anInt7049, Static45.aClass265_3.anInt7013, Static45.aClass265_3.anInt7024);
			Static499.method6547(Static6.anIntArray9[3], Static6.anIntArray9[0], Static6.anIntArray9[2], Static6.anIntArray9[1]);
		} else if (Static275.aClass265_9 != null && Static227.aClass203_4 == Static342.aClass203_6) {
			@Pc(287) int local287 = Static293.aClass67_14.method7678(local36, Static454.anIntArray397, Static25.anInt621 + 4, Static575.anInt9259, Static594.aRandom1, Static470.aClass6Array11, Static392.anInt6521 + 16);
			Static499.method6547(16, Static25.anInt621 + 4, local287 + Static281.aClass91_7.method1849(local36), Static392.anInt6521);
		}
	}
}
