import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt2455;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZII)V", line = 10)
	public static void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Class2_Sub40.anInt6819 && arg2 <= Class2_Sub20.anInt2951) {
			@Pc(19) int local19 = Static24.method861(Class25_Sub1.anInt675, arg0, Class61.anInt1835);
			@Pc(25) int local25 = Static24.method861(Class25_Sub1.anInt675, arg3, Class61.anInt1835);
			Static223.method4182(arg2, arg1, local25, local19);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZBI)V", line = 30)
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static207.method3917(arg1)) {
			Static339.method6106(arg2, arg0, -1, Static25.aClass161ArrayArray1[arg1], arg3);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lclient!gg;", line = 72)
	public static Class2_Sub2_Sub7 method2439() {
		@Pc(16) Class2_Sub2_Sub7 local16 = (Class2_Sub2_Sub7) Class2_Sub3_Sub36.aClass246_10.method6338();
		if (local16 != null) {
			local16.method6469();
			local16.method6144();
			return local16;
		}
		do {
			local16 = (Class2_Sub2_Sub7) Class146.aClass246_4.method6338();
			if (local16 == null) {
				return null;
			}
			if (local16.method2310() > Static190.method3686()) {
				return null;
			}
			local16.method6469();
			local16.method6144();
		} while ((local16.aLong215 & Long.MIN_VALUE) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBI)V", line = 113)
	public static void method2440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static293.method5414(11, arg2);
		local13.method2313();
		local13.anInt2287 = arg1;
		local13.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V", line = 130)
	public static void method2441(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub2_Sub7 local17 = Static293.method5414(16, arg0);
		local17.method2314();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 144)
	public static void method2442() {
		if (!Static330.method5935()) {
			return;
		}
		if (Static117.aStringArray65 == null) {
			Static139.method2711();
		}
		Static290.anIntArray388 = new int[100];
		InputStream_Sub1.anInt3789 = 0;
		Static328.anIntArray450 = new int[100];
		Static114.anIntArray156 = new int[100];
		Static114.anIntArray157 = new int[100];
		Class11_Sub1_Sub2.aBoolean24 = true;
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static114.anIntArray157[local35] = (int) ((double) Static231.anInt4656 * Math.random()) << 4;
			Static114.anIntArray156[local35] = (int) (Math.random() * 350.0D) << 4;
			Static328.anIntArray450[local35] = (int) (Math.random() * 102.0D) + 51;
			Static290.anIntArray388[local35] = (int) (Math.random() * 48.0D) + 8;
		}
		try {
			Static22.aClipboard1 = Static135.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(84) Exception local84) {
		}
	}
}
