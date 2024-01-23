import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Lclient!pl;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
	public static int anInt5019;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "[I")
	public static int[] anIntArray432 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
	public static int anInt5018 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
	public static int anInt5020 = 0;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Lclient!q;")
	private static Class1_Sub2_Sub4_Sub1 method3803() {
		@Pc(9) int local9 = Static233.anIntArray438[0] * Static218.anIntArray382[0];
		@Pc(13) byte[] local13 = Static11.aByteArrayArray1[0];
		@Pc(80) Class1_Sub2_Sub4_Sub1 local80;
		if (Static74.aBooleanArray4[0]) {
			@Pc(32) byte[] local32 = Static147.aByteArrayArray7[0];
			@Pc(35) int[] local35 = new int[local9];
			for (@Pc(37) int local37 = 0; local37 < local9; local37++) {
				local35[local37] = Static102.anIntArray201[local13[local37] & 0xFF] | (local32[local37] & 0xFF) << 24;
			}
			local80 = new Class1_Sub2_Sub4_Sub1_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[0], Static79.anIntArray165[0], Static218.anIntArray382[0], Static233.anIntArray438[0], local35);
		} else {
			@Pc(85) int[] local85 = new int[local9];
			for (@Pc(87) int local87 = 0; local87 < local9; local87++) {
				local85[local87] = Static102.anIntArray201[local13[local87] & 0xFF];
			}
			local80 = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[0], Static79.anIntArray165[0], Static218.anIntArray382[0], Static233.anIntArray438[0], local85);
		}
		Static259.method4155();
		return local80;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public static void method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static171.aClass1_Sub13_Sub1_3.method1825(71);
			Static171.aClass1_Sub13_Sub1_3.method1766(5);
		}
		if (arg0 == 1) {
			Static171.aClass1_Sub13_Sub1_3.method1825(118);
			Static171.aClass1_Sub13_Sub1_3.method1766(19);
		}
		Static171.aClass1_Sub13_Sub1_3.method1796(arg1 + Static64.anInt1786);
		Static171.aClass1_Sub13_Sub1_3.method1766(Static124.aBooleanArray7[82] ? 1 : 0);
		Static171.aClass1_Sub13_Sub1_3.method1807(arg2 + Static29.anInt907);
		Static239.anInt5157 = arg1;
		Static262.anInt5501 = arg2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZILclient!hc;)Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1 method3807(@OriginalArg(0) int arg0, @OriginalArg(3) Class51 arg1) {
		return Static96.method2050(arg1, 0, arg0) ? method3803() : null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static112.aBoolean162 = true;
		Static180.anInt4134 = arg0;
		Static230.anInt5408 = arg1;
		Static134.anInt3303 = arg2;
		Static58.anInt1619 = -1;
		Static266.anInt5559 = -1;
	}
}
