import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public static int anInt936;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "I")
	private static int anInt943;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	private static int anInt945;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public static int anInt920 = 0;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public static int anInt934 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method1019(@OriginalArg(1) Class2_Sub13 arg0) {
		if (!Static29.aBoolean66) {
			arg0.method5945();
			Static117.anInt2590--;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	public static void method1023() {
		if (Static114.aBoolean578) {
			return;
		}
		Static285.aBoolean515 = true;
		if (Static234.aBoolean412) {
			Static331.aFloat43 = (int) Static331.aFloat43 - 17 & 0xFFFFFFF0;
		} else {
			Static100.aFloat37 += (-12.0F - Static100.aFloat37) / 2.0F;
		}
		Static114.aBoolean578 = true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(CI)Z")
	public static boolean method1026(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZZ)V")
	public static void method1029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static223.anInt4280 = arg0;
		Static160.anInt3244 = arg1;
		Static206.anInt4000 = arg2;
		Static163.aClass8ArrayArrayArray2 = new Class8[4][Static223.anInt4280][Static160.anInt3244];
		Static265.aClass73Array44 = new Class73[4];
		if (arg3) {
			Static227.aClass8ArrayArrayArray3 = new Class8[1][Static223.anInt4280][Static160.anInt3244];
			Static126.anIntArrayArray82 = new int[Static223.anInt4280][Static160.anInt3244];
			Static313.aClass73Array39 = new Class73[1];
		} else {
			Static227.aClass8ArrayArrayArray3 = null;
			Static126.anIntArrayArray82 = null;
			Static313.aClass73Array39 = null;
		}
		if (arg4) {
			Static99.anIntArrayArrayArray2 = new int[4][arg0][arg1];
			Static288.aClass2_Sub36_Sub1Array7 = new Class2_Sub36_Sub1[255];
			Static99.aBooleanArray10 = new boolean[255];
			Static350.anInt6740 = 0;
		} else {
			Static99.anIntArrayArrayArray2 = null;
			Static288.aClass2_Sub36_Sub1Array7 = null;
			Static99.aBooleanArray10 = null;
			Static350.anInt6740 = 0;
		}
		Static187.method3377(false);
		Static234.aClass184Array1 = new Class184[500];
		Static69.anInt1500 = 0;
		Static277.aClass184Array2 = new Class184[500];
		Static255.anInt5037 = 0;
		Static26.anIntArrayArrayArray1 = new int[4][Static223.anInt4280 + 1][Static160.anInt3244 + 1];
		Static355.aClass62_Sub1Array3 = new Class62_Sub1[5000];
		Static346.anInt6897 = 0;
		Static207.aBooleanArrayArray25 = new boolean[Static206.anInt4000 + Static206.anInt4000 + 1][Static206.anInt4000 + Static206.anInt4000 + 1];
		Static162.aBooleanArrayArray13 = new boolean[Static206.anInt4000 + Static206.anInt4000 + 2][Static206.anInt4000 + Static206.anInt4000 + 2];
		Static42.aClass101_1 = null;
	}

	@OriginalMember(owner = "client!og", name = "providesignlink", descriptor = "(Lclient!rd;)V")
	private static void method1031(@OriginalArg(0) Class168 arg0) {
		Static177.aClass168_2 = arg0;
		Static125.aClass168_1 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
	public static int method1032(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1035(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static331.aBoolean288) {
			try {
				@Pc(23) Class53 local23 = (Class53) Class.forName("Class53_Sub1").getDeclaredConstructor().newInstance();
				local23.method3197(arg0);
				return local23;
			} catch (@Pc(32) Throwable local32) {
				Static331.aBoolean288 = true;
			}
		}
		return arg0;
	}
}
