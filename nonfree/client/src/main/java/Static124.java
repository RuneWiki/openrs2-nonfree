import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "[Lclient!s;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!hs;")
	public static final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V")
	public static void method2238(@OriginalArg(1) int arg0) {
		Static520.anInt8395 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!ria;II)V")
	public static void method2239(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte103 == 0) {
			arg1.anInt7923 = arg1.anInt7953;
		} else if (arg1.aByte103 == 1) {
			arg1.anInt7923 = (arg2 - arg1.anInt7914) / 2 + arg1.anInt7953;
		} else if (arg1.aByte103 == 2) {
			arg1.anInt7923 = arg2 - arg1.anInt7914 - arg1.anInt7953;
		} else if (arg1.aByte103 == 3) {
			arg1.anInt7923 = arg1.anInt7953 * arg2 >> 14;
		} else if (arg1.aByte103 == 4) {
			arg1.anInt7923 = (arg2 - arg1.anInt7914) / 2 + (arg1.anInt7953 * arg2 >> 14);
		} else {
			arg1.anInt7923 = arg2 - (arg1.anInt7953 * arg2 >> 14) - arg1.anInt7914;
		}
		if (arg1.aByte105 == 0) {
			arg1.anInt7955 = arg1.anInt7926;
		} else if (arg1.aByte105 == 1) {
			arg1.anInt7955 = (arg0 - arg1.anInt7971) / 2 + arg1.anInt7926;
		} else if (arg1.aByte105 == 2) {
			arg1.anInt7955 = arg0 - arg1.anInt7926 - arg1.anInt7971;
		} else if (arg1.aByte105 == 3) {
			arg1.anInt7955 = arg0 * arg1.anInt7926 >> 14;
		} else if (arg1.aByte105 == 4) {
			arg1.anInt7955 = (arg0 - arg1.anInt7971) / 2 + (arg0 * arg1.anInt7926 >> 14);
		} else {
			arg1.anInt7955 = arg0 - arg1.anInt7971 - (arg1.anInt7926 * arg0 >> 14);
		}
		if (!Static179.aBoolean273 || Static79.method1734(arg1).anInt3087 == 0 && arg1.anInt7935 != 0) {
			return;
		}
		if (arg1.anInt7955 < 0) {
			arg1.anInt7955 = 0;
		} else if (arg0 < arg1.anInt7955 + arg1.anInt7971) {
			arg1.anInt7955 = arg0 - arg1.anInt7971;
		}
		if (arg1.anInt7923 < 0) {
			arg1.anInt7923 = 0;
		} else if (arg2 < arg1.anInt7923 + arg1.anInt7914) {
			arg1.anInt7923 = arg2 - arg1.anInt7914;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!sl;)Lclient!jg;")
	public static Class179 method2241(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(14) int local14 = arg0.method2859();
		@Pc(21) Class97 local21 = Static562.method7867()[arg0.method2859()];
		@Pc(28) Class252 local28 = Static186.method3192()[arg0.method2859()];
		@Pc(32) int local32 = arg0.method2836();
		@Pc(36) int local36 = arg0.method2836();
		@Pc(40) int local40 = arg0.method2825();
		@Pc(44) int local44 = arg0.method2825();
		@Pc(48) int local48 = arg0.method2881();
		@Pc(52) int local52 = arg0.method2881();
		@Pc(56) int local56 = arg0.method2881();
		@Pc(65) boolean local65 = arg0.method2859() == 1;
		return new Class179(local14, local21, local28, local32, local36, local40, local44, local48, local52, local56, local65);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BILclient!ria;)I")
	public static int method2243(@OriginalArg(1) int arg0, @OriginalArg(2) Class303 arg1) {
		if (!Static79.method1734(arg1).method2649(arg0) && arg1.anObjectArray15 == null) {
			return -1;
		} else if (arg1.anIntArray577 == null || arg1.anIntArray577.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray577[arg0];
		}
	}
}
