import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_8 = new Class174("WTWIP", 3);

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_84 = new Class96("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt5014 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method4099(@OriginalArg(1) Class121 arg0) {
		if (Static119.anInt2296 < 2 && !Static217.aBoolean311 || Static206.aClass229_6 != null) {
			return;
		}
		@Pc(47) String local47;
		if (Static217.aBoolean311 && Static119.anInt2296 < 2) {
			local47 = Static225.aString52 + Static101.aClass96_37.method1935(Static389.anInt7061) + Static363.aString75 + " ->";
		} else if (Static54.aBoolean82 && Static254.aClass10_1.method221(81) && Static119.anInt2296 > 2) {
			local47 = Static329.method4757((Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261.aClass1_261);
		} else {
			@Pc(54) Class1_Sub3 local54 = (Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261;
			local47 = Static329.method4757(local54);
			@Pc(60) int[] local60 = null;
			if (Static192.method3012(local54.anInt227)) {
				local60 = Static388.aClass193_3.method4249((int) local54.aLong15).anIntArray457;
			} else if (local54.anInt224 != -1) {
				local60 = Static388.aClass193_3.method4249(local54.anInt224).anIntArray457;
			} else if (Static430.method5801(local54.anInt227)) {
				@Pc(134) Class47_Sub1_Sub5_Sub1 local134 = Static307.aClass47_Sub1_Sub5_Sub1Array1[(int) local54.aLong15];
				if (local134 != null) {
					@Pc(139) Class196 local139 = local134.aClass196_1;
					if (local139.anIntArray419 != null) {
						local139 = local139.method4412(Static237.aClass80_1);
					}
					if (local139 != null) {
						local60 = local139.anIntArray420;
					}
				}
			} else if (Static112.method1762(local54.anInt227)) {
				@Pc(102) Class29 local102;
				if (local54.anInt227 == 1001) {
					local102 = Static251.aClass207_2.method4977((int) local54.aLong15);
				} else {
					local102 = Static251.aClass207_2.method4977((int) (local54.aLong15 >>> 32 & 0x7FFFFFFFL));
				}
				if (local102.anIntArray36 != null) {
					local102 = local102.method475(Static237.aClass80_1);
				}
				if (local102 != null) {
					local60 = local102.anIntArray34;
				}
			}
			if (local60 != null) {
				local47 = local47 + Static301.method4107(local60);
			}
		}
		if (Static119.anInt2296 > 2) {
			local47 = local47 + "<col=ffffff> / " + (Static119.anInt2296 - 2) + Static440.aClass96_110.method1935(Static389.anInt7061);
		}
		if (Static93.aClass229_2 != null) {
			@Pc(257) Class4 local257 = Static93.aClass229_2.method5377(arg0);
			if (local257 == null) {
				local257 = Static237.aClass4_5;
			}
			local257.method5845(Static93.aClass229_2.anInt6862, local47, Static117.aRandom1, Static296.anInt4966, Static93.aClass229_2.anInt6915, Static275.anIntArray364, Static93.aClass229_2.anInt6905, Static234.anIntArray320, Static378.anInt6794, Static250.anInt4325, Static93.aClass229_2.anInt6895, Static93.aClass229_2.anInt6940, Static93.aClass229_2.anInt6937, Static13.aClass78Array1);
			Static176.method2836(Static234.anIntArray320[1], Static234.anIntArray320[0], Static234.anIntArray320[2], Static234.anIntArray320[3]);
		} else if (Static245.aClass229_7 != null && Static392.aClass169_3 == Static325.aClass169_2) {
			@Pc(237) int local237 = Static237.aClass4_5.method5847(Static275.anIntArray364, Static250.anInt4325, Static117.aRandom1, Static392.anInt7049 + 16, Static13.aClass78Array1, Static357.anInt6540 + 4, local47);
			Static176.method2836(Static392.anInt7049, Static357.anInt6540 + 4, Static126.aClass62_6.method1157(local47) - -local237, 16);
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
	public static int method4100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static102.anIntArray100[arg0 & 0x3] : Static372.anIntArray500[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ti;I)Lclient!al;")
	public static Class9_Sub1 method4101(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class9_Sub1(arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4496(), arg0.method4548());
	}
}
