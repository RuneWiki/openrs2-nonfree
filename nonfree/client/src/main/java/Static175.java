import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray23;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
	public static int anInt3624;

	@OriginalMember(owner = "client!mn", name = "S", descriptor = "Lclient!ph;")
	public static Class138 aClass138_49;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Loaded defaults";

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
	public static int anInt3623 = -1;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
	public static int anInt3628 = -1;

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
	public static int anInt3635 = 0;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
	public static int anInt3637 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)Z")
	public static boolean method2922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static108.aBoolean161) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static313.aClass146ArrayArray1[local21] == null || Static313.aClass146ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(44) Class146 local44 = Static313.aClass146ArrayArray1[local21][local25];
		@Pc(52) int local52;
		if (arg1 == -1 && local44.anInt4370 == 0) {
			for (local52 = 0; local52 < Static316.anInt5941; local52++) {
				if (Static241.aShortArray76[local52] == 49 || Static241.aShortArray76[local52] == 1004 || Static241.aShortArray76[local52] == 37 || Static241.aShortArray76[local52] == 19 || Static241.aShortArray76[local52] == 47) {
					for (@Pc(155) Class146 local155 = Static259.method3908(Static44.anIntArray74[local52]); local155 != null; local155 = Static287.method4257(local155)) {
						if (local44.anInt4355 == local155.anInt4355) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < Static316.anInt5941; local52++) {
				if (arg1 == Static159.anIntArray270[local52] && local44.anInt4355 == Static44.anIntArray74[local52] && (Static241.aShortArray76[local52] == 49 || Static241.aShortArray76[local52] == 1004 || Static241.aShortArray76[local52] == 37 || Static241.aShortArray76[local52] == 19 || Static241.aShortArray76[local52] == 47)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public static void method2924() {
		for (@Pc(7) int local7 = 0; local7 < Static17.anInt300; local7++) {
			@Pc(19) int local19 = Static158.anIntArray179[local7];
			@Pc(23) Class22_Sub3_Sub2 local23 = Static195.aClass22_Sub3_Sub2Array1[local19];
			@Pc(27) int local27 = Static237.aClass1_Sub14_Sub1_7.method2595();
			if ((local27 & 0x10) != 0) {
				local27 += Static237.aClass1_Sub14_Sub1_7.method2595() << 8;
			}
			Static61.method1025(local27, local23, local19);
		}
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V")
	public static void method2925() {
		Static232.aBoolean256 = true;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)Lclient!in;")
	public static Class1_Sub1_Sub3 method2926() {
		@Pc(13) int local13 = Static134.anIntArray220[0] * Static255.anIntArray450[0];
		@Pc(16) int[] local16 = new int[local13];
		@Pc(20) byte[] local20 = Static255.aByteArrayArray15[0];
		for (@Pc(28) int local28 = 0; local28 < local13; local28++) {
			local16[local28] = Static40.anIntArray59[local20[local28] & 0xFF];
		}
		@Pc(65) Class1_Sub1_Sub3 local65;
		if (Static291.aBoolean404) {
			local65 = new Class1_Sub1_Sub3_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], local16);
		} else {
			local65 = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], local16);
		}
		Static295.method4395();
		return local65;
	}
}
