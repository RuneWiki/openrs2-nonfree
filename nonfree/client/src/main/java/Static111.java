import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "Lclient!rs;")
	public static Class174 aClass174_3;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_46 = new Class93("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public static int anInt2471 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!tq;ZII)Lclient!tr;")
	public static Class192 method2400(@OriginalArg(0) Class191 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5459(arg1, 0);
		return local9 == null ? null : new Class192(local9);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ae;Z)V")
	public static void method2401(@OriginalArg(0) Class4 arg0) {
		if (Static117.anInt2590 < 2 && !Static262.aBoolean479 || Static285.aClass146_14 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static262.aBoolean479 && Static117.anInt2590 < 2) {
			local39 = Static165.aString29 + Static321.aClass93_112.method2819(Static21.anInt455) + Static149.aString25 + " ->";
		} else if (Static296.aBoolean536 && Static92.aClass97_2.method5672(81) && Static117.anInt2590 > 2) {
			local39 = Static269.method4875((Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249.aClass2_249);
		} else {
			@Pc(68) Class2_Sub13 local68 = (Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249;
			local39 = Static269.method4875(local68);
			@Pc(74) int[] local74 = null;
			if (Static56.method1308(local68.anInt1317)) {
				local74 = Static282.method5080((int) local68.aLong38).anIntArray506;
			} else if (Static69.method1569(local68.anInt1317)) {
				@Pc(119) Class62_Sub1_Sub2_Sub1 local119 = Static37.aClass62_Sub1_Sub2_Sub1Array1[(int) local68.aLong38];
				if (local119 != null) {
					local74 = local119.aClass186_1.anIntArray431;
				}
			} else if (Static104.method4926(local68.anInt1317)) {
				if (local68.anInt1317 == 1009) {
					local74 = Static234.method4051((int) local68.aLong38).anIntArray258;
				} else {
					local74 = Static234.method4051((int) (local68.aLong38 >>> 32 & 0x7FFFFFFFL)).anIntArray258;
				}
			}
			if (local74 != null) {
				local39 = local39 + Static184.method3328(local74);
			}
		}
		if (Static117.anInt2590 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static117.anInt2590 - 2) + Static90.aClass93_99.method2819(Static21.anInt455);
		}
		if (Static343.aClass146_17 != null) {
			@Pc(212) Class37 local212 = Static343.aClass146_17.method4039(arg0);
			if (local212 == null) {
				local212 = Static56.aClass37_1;
			}
			local212.method5256(Static343.aClass146_17.anInt4414, Static8.anIntArray7, Static343.aClass146_17.anInt4468, Static188.anInt4005, Static36.aClass31Array1, Static343.aClass146_17.anInt4490, Static20.anInt438, Static343.aClass146_17.anInt4431, Static343.aClass146_17.anInt4480, Static32.anIntArray40, local39, Static343.aClass146_17.anInt4465, Static316.anInt6393, Static11.aRandom1);
			Static152.method2935(Static8.anIntArray7[3], Static8.anIntArray7[0], Static8.anIntArray7[1], Static8.anIntArray7[2]);
		} else if (Static74.aClass146_2 != null && Static41.anInt830 == 0) {
			@Pc(193) int local193 = Static56.aClass37_1.method5247(Static275.anInt5618 + 16, Static316.anInt6393, Static11.aRandom1, Static36.aClass31Array1, Static272.anInt5537 + 4, local39, Static32.anIntArray40);
			Static152.method2935(16, Static272.anInt5537 + 4, Static275.anInt5618, Static289.aClass188_8.method5318(local39) + local193);
			return;
		}
	}
}
