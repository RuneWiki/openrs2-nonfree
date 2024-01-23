import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int anInt3765;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "I")
	public static int anInt3779;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!hh;")
	public static Class69 aClass69_22 = new Class69();

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString132 = null;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt3773 = 0;

	@OriginalMember(owner = "client!p", name = "A", descriptor = "I")
	public static int anInt3785 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method2966() {
		if (Static122.anInt2363 != -1) {
			Static6.method146(-1, -1, Static122.anInt2363);
			Static122.anInt2363 = -1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!qm;)V")
	public static void method2968(@OriginalArg(1) Class6_Sub6_Sub2 arg0) {
		@Pc(19) Class1_Sub6 local19 = (Class1_Sub6) Static94.aClass22_10.method633(Static136.method2158(arg0.aString147));
		if (local19 == null) {
			Static280.method4296(null, arg0, Static159.anInt2978, null, arg0.anIntArray519[0], arg0.anIntArray516[0], 0);
		} else {
			local19.method842();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method2969(@OriginalArg(1) Class7 arg0) {
		Static36.aClass48_Sub2Array3 = Static160.method2480(arg0, Static37.anInt2944);
		Static8.anIntArray27 = new int[256];
		@Pc(19) int local19;
		for (local19 = 0; local19 < 3; local19++) {
			@Pc(33) float local33 = (float) (Static26.anIntArray58[local19] >> 16 & 0xFF);
			@Pc(43) int local43 = Static26.anIntArray58[local19 + 1] >> 16 & 0xFF;
			@Pc(52) float local52 = (float) (Static26.anIntArray58[local19] >> 8 & 0xFF);
			@Pc(62) int local62 = Static26.anIntArray58[local19 + 1] >> 8 & 0xFF;
			@Pc(69) float local69 = ((float) local43 - local33) / 64.0F;
			@Pc(77) float local77 = ((float) local62 - local52) / 64.0F;
			@Pc(85) int local85 = Static26.anIntArray58[local19 + 1] & 0xFF;
			@Pc(92) float local92 = (float) (Static26.anIntArray58[local19] & 0xFF);
			@Pc(99) float local99 = ((float) local85 - local92) / 64.0F;
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				Static8.anIntArray27[local101 + local19 * 64] = (int) local92 | (int) local52 << 8 | (int) local33 << 16;
				local33 += local69;
				local92 += local99;
				local52 += local77;
			}
		}
		for (local19 = 192; local19 < 255; local19++) {
			Static8.anIntArray27[local19] = Static26.anIntArray58[3];
		}
		Static253.anIntArray600 = new int[32768];
		Static120.anIntArray285 = new int[32768];
		Static33.method611(null);
		Static295.anIntArray691 = new int[32768];
		Static162.anIntArray367 = new int[32768];
		Static55.aClass1_Sub2_Sub2_Sub1_1 = new Class1_Sub2_Sub2_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Lclient!hn;")
	public static Class1_Sub2_Sub9 method2970(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static255.aClass64_20.method1471((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static146.aClass7_124.method253(arg0, 5);
		local10 = new Class1_Sub2_Sub9();
		if (local21 != null) {
			local10.method1678(new Class1_Sub18(local21));
		}
		Static255.aClass64_20.method1466(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method2974() {
		if (Static147.aClass119ArrayArray1 == null) {
			return;
		}
		@Pc(7) Class119 local7 = new Class119();
		for (@Pc(9) int local9 = 0; local9 < 13; local9++) {
			for (@Pc(16) int local16 = 0; local16 < 13; local16++) {
				Static147.aClass119ArrayArray1[local9][local16] = local7;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 method2975() {
		@Pc(9) byte[] local9 = Static299.aByteArrayArray15[0];
		@Pc(17) int local17 = Static49.anIntArray135[0] * Static113.anIntArray273[0];
		@Pc(67) Class1_Sub2_Sub2_Sub1 local67;
		if (Static235.aBooleanArray21[0]) {
			@Pc(72) int[] local72 = new int[local17];
			@Pc(76) byte[] local76 = Static65.aByteArrayArray4[0];
			for (@Pc(78) int local78 = 0; local78 < local17; local78++) {
				local72[local78] = (local76[local78] & 0xFF) << 24 | Static158.anIntArray366[local9[local78] & 0xFF];
			}
			local67 = new Class1_Sub2_Sub2_Sub1_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], local72);
		} else {
			@Pc(30) int[] local30 = new int[local17];
			for (@Pc(32) int local32 = 0; local32 < local17; local32++) {
				local30[local32] = Static158.anIntArray366[local9[local32] & 0xFF];
			}
			local67 = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], local30);
		}
		Static247.method3867();
		return local67;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I")
	public static int method2976() {
		Static269.anInt5395 = 0;
		return Static79.method2428();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public static void method2977() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static191.aClass1_Sub19ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static191.aClass1_Sub19ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static44.anInt996; local9++) {
					for (local14 = 0; local14 < Static14.anInt369; local14++) {
						Static191.aClass1_Sub19ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static32.aClass1_Sub25ArrayArray1 = null;
		if (Static263.aClass1_Sub19ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static263.aClass1_Sub19ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static44.anInt996; local9++) {
					for (local14 = 0; local14 < Static14.anInt369; local14++) {
						Static263.aClass1_Sub19ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static263.aClass1_Sub25ArrayArray3 = null;
		Static245.anInt1244 = 0;
		if (Static73.aClass114Array1 != null) {
			for (local3 = 0; local3 < Static245.anInt1244; local3++) {
				Static73.aClass114Array1[local3] = null;
			}
		}
		if (Static189.aClass124Array3 != null) {
			for (local3 = 0; local3 < Static289.anInt5737; local3++) {
				Static189.aClass124Array3[local3] = null;
			}
			Static289.anInt5737 = 0;
		}
		if (Static67.aClass124Array1 != null) {
			for (local3 = 0; local3 < Static67.aClass124Array1.length; local3++) {
				Static67.aClass124Array1[local3] = null;
			}
		}
	}
}
