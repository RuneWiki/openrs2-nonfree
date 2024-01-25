import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!sf;")
	public static Class303 aClass303_3;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[Lclient!wda;")
	public static Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString30 = "";

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt4316 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method3765(@OriginalArg(1) Class14 arg0) {
		if (Static421.anInt7365 < 2 && !Static199.aBoolean458 || Static547.aClass292_14 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static199.aBoolean458 && Static421.anInt7365 < 2) {
			local39 = Static104.aString16 + Static230.aClass156_31.method4065(Static25.anInt769) + Static22.aString33 + " ->";
		} else if (Static159.aBoolean736 && Static365.aClass155_1.method4042(81) && Static421.anInt7365 > 2) {
			local39 = Static55.method1204((Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285.aClass6_285);
		} else {
			@Pc(35) Class6_Sub45 local35 = (Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285;
			local39 = Static55.method1204(local35);
			@Pc(41) int[] local41 = null;
			if (Static189.method3425(local35.anInt8730)) {
				local41 = Static444.aClass322_2.method7141((int) local35.aLong235).anIntArray485;
			} else if (local35.anInt8734 != -1) {
				local41 = Static444.aClass322_2.method7141(local35.anInt8734).anIntArray485;
			} else if (Static280.method4614(local35.anInt8730)) {
				@Pc(127) Class6_Sub34 local127 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local35.aLong235);
				if (local127 != null) {
					@Pc(132) Class4_Sub1_Sub1_Sub1 local132 = local127.aClass4_Sub1_Sub1_Sub1_2;
					@Pc(135) Class273 local135 = local132.aClass273_1;
					if (local135.anIntArray537 != null) {
						local135 = local135.method6159(Static498.aClass101_1);
					}
					if (local135 != null) {
						local41 = local135.anIntArray535;
					}
				}
			} else if (Static357.method5419(local35.anInt8730)) {
				@Pc(96) Class252 local96;
				if (local35.anInt8730 == 1011) {
					local96 = Static412.aClass307_4.method6636((int) local35.aLong235);
				} else {
					local96 = Static412.aClass307_4.method6636((int) (local35.aLong235 >>> 32 & 0x7FFFFFFFL));
				}
				if (local96.anIntArray506 != null) {
					local96 = local96.method5799(Static498.aClass101_1);
				}
				if (local96 != null) {
					local41 = local96.anIntArray508;
				}
			}
			if (local41 != null) {
				local39 = local39 + Static493.method6728(local41);
			}
		}
		if (Static421.anInt7365 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static421.anInt7365 - 2) + Static230.aClass156_24.method4065(Static25.anInt769);
		}
		if (Static302.aClass292_5 != null) {
			@Pc(223) Class92 local223 = Static302.aClass292_5.method6461(arg0);
			if (local223 == null) {
				local223 = Static114.aClass92_4;
			}
			local223.method6400(Static218.anIntArray272, Static302.aClass292_5.anInt7916, Static194.aClass58Array9, Static40.anInt1005, Static111.anInt2159, Static302.aClass292_5.anInt7912, Static38.anIntArray44, Static588.anInt2165, Static302.aClass292_5.anInt7970, Static302.aClass292_5.anInt7938, Static96.aRandom1, Static302.aClass292_5.anInt7963, Static302.aClass292_5.anInt7898, local39);
			Static586.method7778(Static38.anIntArray44[0], Static38.anIntArray44[2], Static38.anIntArray44[3], Static38.anIntArray44[1]);
		} else if (Static206.aClass292_3 != null && Static317.aClass37_3 == Static336.aClass37_4) {
			@Pc(289) int local289 = Static114.aClass92_4.method6403(Static35.anInt1964 + 4, Static194.aClass58Array9, Static96.aRandom1, local39, Static218.anIntArray272, Static111.anInt2159, Static220.anInt4394 + 16);
			Static586.method7778(Static35.anInt1964 + 4, Static555.aClass327_13.method7196(local39) + local289, 16, Static220.anInt4394);
		}
	}
}
