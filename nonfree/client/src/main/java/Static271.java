import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray52;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt5843;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public static int anInt5844;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!ao;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[Lclient!c;")
	public static Class25_Sub1_Sub1[] aClass25_Sub1_Sub1Array1 = new Class25_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString191 = "K";

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public static int anInt5848 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZIII)V")
	public static void method4537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static71.anInt1771 == 1) {
			Static222.aClass1_Sub2_Sub14Array16[Static152.anInt3537 / 100].method2727(Static88.anInt2054 - 8, Static90.anInt2099 + -8);
		}
		if (Static71.anInt1771 == 2) {
			Static222.aClass1_Sub2_Sub14Array16[Static152.anInt3537 / 100 + 4].method2727(Static88.anInt2054 - 8, Static90.anInt2099 + -8);
		}
		Static104.method830();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!hh;IZ)V")
	public static void method4538(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.anInt2230;
		@Pc(12) int local12 = (int) arg0.aLong201;
		arg0.method4742();
		if (arg1) {
			Static206.method3662(local8);
		}
		Static145.method2768(local8);
		@Pc(36) Class116 local36 = Static115.method1897(local12);
		if (local36 != null) {
			Static189.method3378(local36);
		}
		@Pc(44) int local44 = Static111.anInt2398;
		@Pc(46) int local46;
		for (local46 = 0; local46 < local44; local46++) {
			if (Static102.method1690(Static213.aShortArray71[local46])) {
				Static100.method4465(local46);
			}
		}
		if (Static111.anInt2398 == 1) {
			Static218.aBoolean267 = false;
			Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
		} else {
			Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
			local46 = Static156.aClass1_Sub2_Sub16_3.method3966(Static141.aString94);
			for (@Pc(77) int local77 = 0; local77 < Static111.anInt2398; local77++) {
				@Pc(86) int local86 = Static156.aClass1_Sub2_Sub16_3.method3966(Static254.method4242(local77));
				if (local86 > local46) {
					local46 = local86;
				}
			}
			Static66.anInt3695 = Static111.anInt2398 * 15 + (Static236.aBoolean285 ? 26 : 22);
			Static82.anInt1976 = local46 + 8;
		}
		if (Static194.anInt4389 != -1) {
			Static55.method1116(Static194.anInt4389, 1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public static void method4540() {
		Static80.aClass155_12.method4362();
		Static146.aClass155_29.method4362();
	}
}
