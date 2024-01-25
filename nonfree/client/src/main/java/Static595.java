import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
	public static int anInt10420;

	@OriginalMember(owner = "client!wt", name = "H", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_10 = new Class103(7, 2);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZII)I")
	public static int method8403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIB)I")
	public static int method8404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static298.anIntArray373[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)V")
	public static void method8405(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static318.aBooleanArray27[arg0]) {
			Static543.aClass254_130.method6415(arg0);
			Static108.aClass305ArrayArray1[arg0] = null;
			Static571.aClass305ArrayArray2[arg0] = null;
			Static318.aBooleanArray27[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method8406(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static309.anInt6172 = 9;
		Static480.anInt8971 = 0x1 << Static309.anInt6172;
		Static377.anInt7321 = Static480.anInt8971 >> 1;
		Static238.anInt9921 = (int) Math.sqrt((double) (Static377.anInt7321 * Static377.anInt7321 + Static377.anInt7321 * Static377.anInt7321));
		Static364.anInt7221 = Static480.anInt8971 >> 2;
		Static274.anInt5817 = Static480.anInt8971;
		Static223.anInt4520 = arg0;
		Static416.anInt10065 = arg1;
		Static403.anInt7929 = arg2;
		Static422.aClass125ArrayArrayArray2 = new Class125[4][Static223.anInt4520][Static416.anInt10065];
		Static381.aClass4Array2 = new Class4[4];
		if (arg3) {
			Static343.anIntArrayArray58 = new int[Static223.anInt4520][Static416.anInt10065];
			Static67.aByteArrayArray32 = new byte[Static223.anInt4520][Static416.anInt10065];
			Static171.aShortArrayArray6 = new short[Static223.anInt4520][Static416.anInt10065];
			Static191.aClass125ArrayArrayArray1 = new Class125[1][Static223.anInt4520][Static416.anInt10065];
			Static495.aClass4Array4 = new Class4[1];
		} else {
			Static343.anIntArrayArray58 = null;
			Static67.aByteArrayArray32 = null;
			Static171.aShortArrayArray6 = null;
			Static191.aClass125ArrayArrayArray1 = null;
			Static495.aClass4Array4 = null;
		}
		if (arg4) {
			Static272.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static464.aClass212Array1 = new Class212[65535];
			Static395.aBooleanArray16 = new boolean[65535];
			Static464.anInt8684 = 0;
		} else {
			Static272.aLongArrayArrayArray1 = null;
			Static464.aClass212Array1 = null;
			Static395.aBooleanArray16 = null;
			Static464.anInt8684 = 0;
		}
		Static571.method8173(false);
		Static189.aClass38Array2 = new Class38[1000];
		Static141.anInt3256 = 0;
		Static133.aClass38Array1 = new Class38[1000];
		Static200.anInt3899 = 0;
		Static39.anIntArrayArrayArray1 = new int[4][Static223.anInt4520 + 1][Static416.anInt10065 + 1];
		Static377.aClass2_Sub2Array2 = new Class2_Sub2[5000];
		Static7.anInt303 = 0;
		Static331.aBooleanArrayArray3 = new boolean[Static403.anInt7929 + Static403.anInt7929 + 1][Static403.anInt7929 + Static403.anInt7929 + 1];
		Static281.aBooleanArrayArray2 = new boolean[Static403.anInt7929 + Static403.anInt7929 + 2][Static403.anInt7929 + Static403.anInt7929 + 2];
		Static415.aClass89_1 = null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLclient!pe;I)Lclient!dga;")
	public static Class3_Sub4_Sub7 method8407(@OriginalArg(0) int arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub7 local14 = new Class3_Sub7(arg1.method6401(arg0, arg2));
		@Pc(49) Class3_Sub4_Sub7 local49 = new Class3_Sub4_Sub7(arg2, local14.method6536(), local14.method6536(), local14.method6497(), local14.method6497(), local14.method6538() == 1, local14.method6538(), local14.method6538());
		@Pc(53) int local53 = local14.method6538();
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local49.aClass183_9.method4792(new Class3_Sub5(local14.method6538(), local14.method6535(), local14.method6535(), local14.method6535(), local14.method6535(), local14.method6535(), local14.method6535(), local14.method6535(), local14.method6535()));
		}
		local49.method2061();
		return local49;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLclient!oi;)V")
	public static void method8408(@OriginalArg(1) Class3_Sub40 arg0) {
		if (!Static256.aBoolean474) {
			arg0.method8412();
			Static309.anInt6170--;
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IIII)Z")
	public static boolean method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static232.method3980(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static309.anInt6172;
			@Pc(14) int local14 = arg2 << Static309.anInt6172;
			return Static557.method1639(local10 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static557.method1639(local10 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static557.method1639(local10 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static480.anInt8971 - 1) && Static557.method1639(local10 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static480.anInt8971 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(B)V")
	public static void method8411() {
		if (Static75.anInt1880 == 3) {
			Static168.method3104(4);
		} else if (Static75.anInt1880 == 7) {
			Static168.method3104(8);
		} else if (Static75.anInt1880 == 10) {
			Static168.method3104(11);
		}
	}
}
