import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_121 = new Class186(24, 3);

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public static int anInt6607 = 0;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[Lclient!np;")
	public static final Class180[] aClass180Array1 = new Class180[6];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(CB)C")
	public static char method5449(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method5450() {
		Static261.anInt4478 = 0;
		@Pc(18) boolean local18 = Static55.aClass6_Sub15_Sub1_1.method3086() == 1;
		@Pc(22) int local22 = Static55.aClass6_Sub15_Sub1_1.method3101();
		@Pc(26) int local26 = Static55.aClass6_Sub15_Sub1_1.method3126();
		@Pc(30) int local30 = Static55.aClass6_Sub15_Sub1_1.method3111();
		Static145.method2423(local30);
		@Pc(41) int local41 = (Static337.anInt5664 - Static55.aClass6_Sub15_Sub1_1.anInt3487) / 16;
		Static58.anIntArrayArray8 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static58.anIntArrayArray8[local47][local51] = Static55.aClass6_Sub15_Sub1_1.method3109();
			}
		}
		Static325.aByteArrayArray30 = new byte[local41][];
		Static100.anIntArray40 = new int[local41];
		Static369.anIntArray540 = new int[local41];
		Static27.aByteArrayArray5 = null;
		Static183.anIntArray518 = new int[local41];
		Static247.anIntArray381 = new int[local41];
		Static37.aByteArrayArray48 = new byte[local41][];
		Static53.anIntArray94 = null;
		Static175.anIntArray282 = new int[local41];
		Static121.aByteArrayArray17 = new byte[local41][];
		Static439.aByteArrayArray47 = new byte[local41][];
		local41 = 0;
		for (local51 = (local22 - (Static84.anInt1632 >> 4)) / 8; local51 <= (local22 + (Static84.anInt1632 >> 4)) / 8; local51++) {
			for (@Pc(121) int local121 = (local26 - (Static261.anInt4480 >> 4)) / 8; local121 <= ((Static261.anInt4480 >> 4) + local26) / 8; local121++) {
				Static175.anIntArray282[local41] = (local51 << 8) + local121;
				Static100.anIntArray40[local41] = Static118.aClass158_26.method3677("m" + local51 + "_" + local121);
				Static183.anIntArray518[local41] = Static118.aClass158_26.method3677("l" + local51 + "_" + local121);
				Static369.anIntArray540[local41] = Static118.aClass158_26.method3677("um" + local51 + "_" + local121);
				Static247.anIntArray381[local41] = Static118.aClass158_26.method3677("ul" + local51 + "_" + local121);
				local41++;
			}
		}
		Static358.method5049(local18, local26, false, local22);
	}
}
