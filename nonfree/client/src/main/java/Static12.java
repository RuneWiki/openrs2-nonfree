import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_18;

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
	public static int anInt356;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "Lclient!bl;")
	public static Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "Lclient!db;")
	public static Class31 aClass31_2 = new Class31(5);

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString14 = "flash1:";

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method240(@OriginalArg(1) String arg0) {
		if (Static166.aClass50_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < Static166.aClass50_2.anInt1409; local23++) {
			if (Static189.method2839(Static115.method1775(" ", "<br>", Static166.aClass50_2.aStringArray6[local23]), arg0)) {
				return local23;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
	public static void method262() {
		Static247.method3872(Static207.anInt4118);
		@Pc(25) int local25 = (Static68.anInt4743 >> 10) + (Static158.anInt2961 >> 3);
		@Pc(35) int local35 = (Static224.anInt4695 >> 3) + (Static182.anInt3398 >> 10);
		Static177.anIntArray389 = new int[18];
		Static201.anIntArray455 = new int[18];
		Static268.anIntArrayArray44 = new int[18][4];
		Static255.aByteArrayArray12 = new byte[18][];
		Static201.anIntArray456 = new int[18];
		Static156.anIntArray227 = new int[18];
		Static163.anIntArray531 = new int[18];
		Static242.aByteArrayArray11 = new byte[18][];
		Static291.aByteArrayArray14 = new byte[18][];
		Static30.aByteArrayArray3 = new byte[18][];
		Static19.aByteArrayArray2 = new byte[18][];
		Static190.anIntArray426 = new int[18];
		@Pc(80) int local80 = 0;
		@Pc(86) int local86;
		for (local86 = (local35 - 6) / 8; local86 <= (local35 + 6) / 8; local86++) {
			for (@Pc(103) int local103 = (local25 - 6) / 8; local103 <= (local25 + 6) / 8; local103++) {
				@Pc(116) int local116 = local103 + (local86 << 8);
				Static177.anIntArray389[local80] = local116;
				Static156.anIntArray227[local80] = Static216.aClass7_178.method264("m" + local86 + "_" + local103);
				Static163.anIntArray531[local80] = Static216.aClass7_178.method264("l" + local86 + "_" + local103);
				Static190.anIntArray426[local80] = Static216.aClass7_178.method264("n" + local86 + "_" + local103);
				Static201.anIntArray456[local80] = Static216.aClass7_178.method264("um" + local86 + "_" + local103);
				Static201.anIntArray455[local80] = Static216.aClass7_178.method264("ul" + local86 + "_" + local103);
				if (Static190.anIntArray426[local80] == -1) {
					Static156.anIntArray227[local80] = -1;
					Static163.anIntArray531[local80] = -1;
					Static201.anIntArray456[local80] = -1;
					Static201.anIntArray455[local80] = -1;
				}
				local80++;
			}
		}
		for (local86 = local80; local86 < Static190.anIntArray426.length; local86++) {
			Static190.anIntArray426[local86] = -1;
			Static156.anIntArray227[local86] = -1;
			Static163.anIntArray531[local86] = -1;
			Static201.anIntArray456[local86] = -1;
			Static201.anIntArray455[local86] = -1;
		}
		Static210.method3348(true, 8, 0, local25, local35, 8, false);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Lclient!rg;")
	public static Class48_Sub2 method268() {
		@Pc(21) Class48_Sub2 local21 = new Class48_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], Static299.aByteArrayArray15[0], Static158.anIntArray366);
		Static247.method3867();
		return local21;
	}
}
