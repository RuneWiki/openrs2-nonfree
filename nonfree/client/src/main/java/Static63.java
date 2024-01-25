import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt1294;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[200];

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString46 = "yellow:";

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lclient!ua;")
	public static Class5_Sub5 method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub5_2;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
	public static void method1014() {
		@Pc(5) Class198 local5 = Static62.aClass198_17;
		synchronized (Static62.aClass198_17) {
			Static62.aClass198_17.method5236();
		}
		local5 = Static190.aClass198_34;
		synchronized (Static190.aClass198_34) {
			Static190.aClass198_34.method5236();
		}
		@Pc(31) Class214 local31 = Static196.aClass214_1;
		synchronized (Static196.aClass214_1) {
			Static196.aClass214_1.method5654();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZC)Z")
	public static boolean method1015(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public static void method1016() {
		Static283.anInt4489 = 0;
		Static244.anInt4836 = 0;
		Static57.method948();
		Static336.method5512();
		Static321.method5273();
		Static123.method2163();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static244.anInt4836; local27++) {
			local33 = Static263.anIntArray427[local27];
			if (Static254.aClass5_Sub4_Sub4_Sub1Array1[local33].anInt4921 != Static51.anInt1101) {
				if (Static254.aClass5_Sub4_Sub4_Sub1Array1[local33].anInt3416 > 0) {
					Static240.method4141(Static254.aClass5_Sub4_Sub4_Sub1Array1[local33]);
				}
				Static254.aClass5_Sub4_Sub4_Sub1Array1[local33] = null;
			}
		}
		if (Static20.aClass3_Sub4_Sub2_1.anInt4268 != Static306.anInt6046) {
			throw new RuntimeException("gpp1 pos:" + Static20.aClass3_Sub4_Sub2_1.anInt4268 + " psize:" + Static306.anInt6046);
		}
		for (local33 = 0; local33 < Static170.anInt6275; local33++) {
			if (Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static170.anInt6275);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Z")
	public static boolean method1017() {
		if (Static341.aBoolean445) {
			try {
				if ((Boolean) Static361.method2055("showingVideoAd", Static353.aClass42_5.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
