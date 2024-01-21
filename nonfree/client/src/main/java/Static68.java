import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gd;")
	public static Class27 aClass27_27;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
	public static boolean aBoolean61;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_11;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array6;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!na;")
	private static Class53 aClass53_769 = Static109.method1737("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_767 = aClass53_769;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_768 = Static109.method1737("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static int anInt1724 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt1730 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1175() {
		aClass3_Sub1_Sub5_Sub3Array6 = null;
		anIntArrayArray13 = null;
		aClass27_27 = null;
		aClass62_Sub1_11 = null;
		aClass53_768 = null;
		aClass53_769 = null;
		aClass53_767 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1176() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static72.anInt1820; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static71.anIntArray228[local3];
			}
			@Pc(21) Class3_Sub1_Sub4_Sub1_Sub2 local21 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local13];
			if (local21 != null && local21.anInt1450 > 0) {
				local21.anInt1450--;
				if (local21.anInt1450 == 0) {
					local21.aClass53_662 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static20.anInt693; local13++) {
			@Pc(60) int local60 = Static18.anIntArray49[local13];
			@Pc(64) Class3_Sub1_Sub4_Sub1_Sub1 local64 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local60];
			if (local64 != null && local64.anInt1450 > 0) {
				local64.anInt1450--;
				if (local64.anInt1450 == 0) {
					local64.aClass53_662 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
	public static int method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static115.method1820(arg1 + 45365, arg0 + 91923, 4) + (Static115.method1820(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static115.method1820(arg1, arg0, 1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method1178() {
		for (@Pc(7) int local7 = -1; local7 < Static72.anInt1820; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static71.anIntArray228[local7];
			}
			@Pc(24) Class3_Sub1_Sub4_Sub1_Sub2 local24 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local14];
			if (local24 != null) {
				Static18.method296(1, local24);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1179() {
		Static53.anIntArray273 = null;
		Static103.anIntArray321 = null;
		Static7.aByteArrayArray1 = null;
		Static32.anIntArray117 = null;
		Static32.anIntArray116 = null;
		Static97.anIntArray312 = null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)I")
	public static int method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(27) int local27 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local27;
		}
		return arg1;
	}
}
