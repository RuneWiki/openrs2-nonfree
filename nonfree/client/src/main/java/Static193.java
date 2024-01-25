import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[200];

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_58 = new Class2(5, 4);

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_73 = new Class55("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)V")
	public static void method2784(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 + Static31.anInt520;
		@Pc(16) int local16 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 + Static436.anInt7299;
		if (Static335.anInt5453 - local11 < -500 || Static335.anInt5453 - local11 > 500 || Static87.anInt1714 - local16 < -500 || Static87.anInt1714 - local16 > 500) {
			Static87.anInt1714 = local16;
			Static335.anInt5453 = local11;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local11 != Static335.anInt5453) {
			local57 = local11 - Static335.anInt5453;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local57 < local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local65 < local57) {
				local65 = local57;
			}
			Static335.anInt5453 += local65;
		}
		if (local16 != Static87.anInt1714) {
			local57 = local16 - Static87.anInt1714;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local57 > local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local57 < local65) {
				local65 = local57;
			}
			Static87.anInt1714 += local65;
		}
		if (!Static130.aClass153_Sub1_1.aBoolean337) {
			Static97.aFloat52 += Static218.aFloat108 * (float) arg0 / 6.0F;
			Static67.aFloat36 += (float) arg0 * Static323.aFloat154 / 6.0F;
		}
		Static10.method94();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method2787(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static233.anInt5382 = arg0;
		Static267.anInt4536 = 2;
		Static451.method5736(arg2, arg1);
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
	public static void method2788() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static69.aBooleanArray2[local7] = true;
		}
	}
}
