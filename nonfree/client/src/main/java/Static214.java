import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	public static int anInt4544;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public static int anInt4553;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array12;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	public static int anInt4552 = 0;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Lclient!qn;")
	public static final Class2 aClass2_1 = Static208.method3734();

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
	public static int anInt4557 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
	public static void method3960(@OriginalArg(0) int arg0) {
		@Pc(13) Class37 local13 = Static165.aClass37_54;
		synchronized (Static165.aClass37_54) {
			Static165.aClass37_54.method919();
			Static165.aClass37_54 = new Class37(arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method3961(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static220.aBoolean371) {
			try {
				@Pc(18) Class58 local18 = (Class58) Class.forName("Class58_Sub1").getDeclaredConstructor().newInstance();
				local18.method1253(arg0);
				return local18;
			} catch (@Pc(27) Throwable local27) {
				Static220.aBoolean371 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
	public static void method3962() {
		Static62.anInt6674 = 0;
		Static32.anInt565 = 0;
		Static170.method3035();
		Static114.method1824();
		Static161.method2852();
		Static237.method4320();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static32.anInt565; local19++) {
			local25 = Static127.anIntArray259[local19];
			if (Static202.aClass10_Sub1_Sub2_Sub2Array1[local25].anInt4071 != Static282.anInt3516) {
				if (Static202.aClass10_Sub1_Sub2_Sub2Array1[local25].anInt4113 > 0) {
					Static103.method1627(Static202.aClass10_Sub1_Sub2_Sub2Array1[local25]);
				}
				Static202.aClass10_Sub1_Sub2_Sub2Array1[local25] = null;
			}
		}
		if (Static142.aClass1_Sub21_Sub2_1.anInt6611 != Static237.anInt4904) {
			throw new RuntimeException("gpp1 pos:" + Static142.aClass1_Sub21_Sub2_1.anInt6611 + " psize:" + Static237.anInt4904);
		}
		for (local25 = 0; local25 < Static167.anInt3454; local25++) {
			if (Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static167.anInt3454);
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIBII)V")
	public static void method3964(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static136.anInt2695 = arg0;
		Static103.anInt1976 = arg3;
		Static42.anInt1138 = arg5;
		Static231.anInt4824 = arg2;
		Static333.anInt6473 = arg4;
		if (arg1 && Static103.anInt1976 >= 100) {
			Static177.anInt3734 = Static231.anInt4824 * 128 + 64;
			Static4.anInt41 = Static42.anInt1138 * 128 + 64;
			Static117.anInt2244 = Static352.method5834(Static177.anInt3734, Static4.anInt41, Static127.anInt2487) - Static333.anInt6473;
		}
		Static246.anInt5156 = 2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3965(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!lm;)V")
	public static void method3966(@OriginalArg(1) Class134 arg0) {
		Static192.aClass134_91 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([BB)[B")
	public static byte[] method3967(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static361.method1853(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
