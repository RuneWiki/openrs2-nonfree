import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public static int anInt3428;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public static int anInt3419 = 0;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt3420 = 0;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Z")
	public static boolean aBoolean277 = true;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
	public static int[] anIntArray262 = new int[500];

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
	public static int[] anIntArray263 = new int[32];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)Lclient!pa;")
	public static Class132_Sub1 method2818(@OriginalArg(1) int arg0) {
		return Static145.aBoolean256 && arg0 >= Static12.anInt317 && Static106.anInt2316 >= arg0 ? Static234.aClass132_Sub1Array1[arg0 - Static12.anInt317] : null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2823(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static210.aStringArray21.length; local7++) {
			if (Static210.aStringArray21[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lclient!hm;")
	public static Class72 method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class72 local14 = local7.aClass72_1;
			local7.aClass72_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static void method2825() {
		Static40.aClass2_Sub3_Sub12_2 = null;
		Static21.aClass2_Sub3_Sub12_1 = null;
		Static41.aClass2_Sub3_Sub12_3 = null;
		Static142.aClass2_Sub3_Sub12_4 = null;
	}
}
