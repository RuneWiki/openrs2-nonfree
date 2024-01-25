import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!fi;")
	public static Class74 aClass74_9 = new Class74();

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!pe;)V")
	public static void method1631(@OriginalArg(1) Class89 arg0) {
		@Pc(7) int local7 = Static279.anInt6648;
		@Pc(9) int local9 = Static263.anInt5172;
		@Pc(11) int local11 = Static220.anInt4389;
		@Pc(13) int local13 = Static343.anInt6507;
		arg0.method5477(local9, local7, local13, local11, -10660793);
		arg0.method5477(local9 + 1, local7 + 1, 16, local11 - 2, -16777216);
		arg0.method5454(local7 + 1, local9 + 18, -16777216, local13 - 19, local11 + -2);
		Static149.aClass94_19.method5692(local7 + 3, -10660793, Static254.aString312, local9 + 14, -1);
		@Pc(71) int local71 = Static240.anInt6396;
		@Pc(73) int local73 = Static100.anInt2436;
		@Pc(75) int local75 = 0;
		for (@Pc(83) Class7_Sub32 local83 = (Class7_Sub32) Static76.aClass74_8.method1793(); local83 != null; local83 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			@Pc(99) int local99 = local9 + (Static33.anInt735 - local75 - 1) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local71 > local7 && local71 < local11 + local7 && local99 - 13 < local73 && local73 < local99 + 3) {
				local101 = -256;
			}
			@Pc(127) int[] local127 = null;
			if (Static342.method5546(local83.anInt5229)) {
				local127 = Static17.method4472((int) local83.aLong169).anIntArray552;
			} else if (Static259.method4349(local83.anInt5229)) {
				@Pc(174) Class22_Sub2_Sub1_Sub2 local174 = Static69.aClass22_Sub2_Sub1_Sub2Array1[(int) local83.aLong169];
				if (local174 != null) {
					local127 = local174.aClass174_1.anIntArray669;
				}
			} else if (Static43.method933(local83.anInt5229)) {
				if (local83.anInt5229 == 1009) {
					local127 = Static245.method4227((int) local83.aLong169).anIntArray480;
				} else {
					local127 = Static245.method4227((int) (local83.aLong169 >>> 32 & 0x7FFFFFFFL)).anIntArray480;
				}
			}
			@Pc(194) String local194 = Static24.method422(local83);
			if (local127 != null) {
				local194 = local194 + Static132.method2666(local127);
			}
			Static149.aClass94_19.method5689(Static214.aClass52Array12, local194, local101, local99, local7 + 3, Static130.anIntArray376, 0);
			local75++;
		}
		Static262.method4381(Static343.anInt6507, Static220.anInt4389, Static279.anInt6648, Static263.anInt5172);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method1632() {
		Static214.aClass7_Sub8_Sub2_3.method3114();
		Static129.anInt2826 = 1;
		Static98.aClass180_12 = null;
	}
}
