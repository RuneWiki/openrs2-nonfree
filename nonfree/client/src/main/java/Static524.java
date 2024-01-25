import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public static int anInt8330;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_219 = new Class381(80, 7);

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Z")
	public static boolean aBoolean552 = true;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!gda;ZLclient!tga;)V")
	public static void method7140(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class349 arg1) {
		Static556.aClass349_4 = arg1;
		Static151.aString21 = "";
		Static111.aClass126_62 = arg0;
		if (Class186.aString53.startsWith("win")) {
			Static151.aString21 = Static151.aString21 + "windows/";
		} else if (Class186.aString53.startsWith("linux")) {
			Static151.aString21 = Static151.aString21 + "linux/";
		} else if (Class186.aString53.startsWith("mac")) {
			Static151.aString21 = Static151.aString21 + "macos/";
		}
		if (Static556.aClass349_4.aBoolean602) {
			Static151.aString21 = Static151.aString21 + "msjava/";
		} else if (Class186.aString54.startsWith("amd64") || Class186.aString54.startsWith("x86_64")) {
			Static151.aString21 = Static151.aString21 + "x86_64/";
		} else if (Class186.aString54.startsWith("i386") || Class186.aString54.startsWith("i486") || Class186.aString54.startsWith("i586") || Class186.aString54.startsWith("x86")) {
			Static151.aString21 = Static151.aString21 + "x86/";
		} else if (Class186.aString54.startsWith("ppc")) {
			Static151.aString21 = Static151.aString21 + "ppc/";
		} else {
			Static151.aString21 = Static151.aString21 + "universal/";
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!vf;ZLjava/lang/String;)Lclient!nl;")
	public static Class255 method7141(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static20.anIntArray29, 0);
		if (Static20.anIntArray29[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class255(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public static void method7142() {
		Static139.anInt2749 = 0;
		@Pc(10) Class5_Sub36_Sub2 local10 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		@Pc(14) int local14 = local10.method7316();
		@Pc(18) int local18 = local10.method7282();
		@Pc(22) int local22 = local10.method7280();
		@Pc(34) boolean local34 = local10.method7330() == 1;
		Static280.method4497();
		Static492.method6897(local22, true);
		@Pc(48) int local48 = (Static4.aClass389_17.anInt10756 - local10.anInt8456) / 16;
		Static387.anIntArrayArray42 = new int[local48][4];
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			for (@Pc(58) int local58 = 0; local58 < 4; local58++) {
				Static387.anIntArrayArray42[local54][local58] = local10.method7268();
			}
		}
		Static61.anIntArray66 = new int[local48];
		Static429.aByteArrayArray16 = new byte[local48][];
		Static56.aByteArrayArray1 = new byte[local48][];
		Static572.anIntArray520 = new int[local48];
		Static135.aByteArrayArray7 = new byte[local48][];
		Static378.aByteArrayArray15 = new byte[local48][];
		Static404.anIntArray406 = new int[local48];
		Static123.anIntArray121 = new int[local48];
		Static75.anIntArray68 = new int[local48];
		Static311.aByteArrayArray14 = null;
		Static547.anIntArray496 = null;
		local48 = 0;
		for (@Pc(134) int local134 = (local18 - (Static271.anInt4910 >> 4)) / 8; local134 <= (local18 + (Static271.anInt4910 >> 4)) / 8; local134++) {
			for (@Pc(149) int local149 = (local14 - (Static613.anInt9909 >> -708137916)) / 8; local149 <= (local14 + (Static613.anInt9909 >> 4)) / 8; local149++) {
				Static75.anIntArray68[local48] = (local134 << 8) + local149;
				Static123.anIntArray121[local48] = Static495.aClass126_12.method3067("m" + local134 + "_" + local149);
				Static404.anIntArray406[local48] = Static495.aClass126_12.method3067("l" + local134 + "_" + local149);
				Static61.anIntArray66[local48] = Static495.aClass126_12.method3067("um" + local134 + "_" + local149);
				Static572.anIntArray520[local48] = Static495.aClass126_12.method3067("ul" + local134 + "_" + local149);
				local48++;
			}
		}
		Static372.method5546(local18, local34, 12, local14);
	}
}
