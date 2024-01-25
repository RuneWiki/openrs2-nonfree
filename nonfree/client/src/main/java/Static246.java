import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_130 = new Class151("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "Lclient!go;")
	public static final Class97 aClass97_7 = new Class97(15, 0, 1, 0);

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lclient!wo;")
	public static Class20_Sub4 method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub4_1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)Z")
	public static boolean method3213(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)Z")
	public static boolean method3215() {
		try {
			if (Static356.anInt5885 == 2) {
				if (Static400.aClass1_Sub43_5 == null) {
					Static400.aClass1_Sub43_5 = Static463.method5186(Static436.aClass113_131, Static218.anInt5620, Static81.anInt1504);
					if (Static400.aClass1_Sub43_5 == null) {
						return false;
					}
				}
				if (Static205.aClass219_1 == null) {
					Static205.aClass219_1 = new Class219(Static284.aClass113_88, Static394.aClass113_123);
				}
				if (Static312.aClass1_Sub9_Sub4_3.method4616(Static205.aClass219_1, Static16.aClass113_66, Static400.aClass1_Sub43_5)) {
					Static312.aClass1_Sub9_Sub4_3.method4620();
					Static312.aClass1_Sub9_Sub4_3.method4605(Static156.anInt2618);
					Static312.aClass1_Sub9_Sub4_3.method4600(Static400.aClass1_Sub43_5, Static402.aBoolean534);
					Static356.anInt5885 = 0;
					Static400.aClass1_Sub43_5 = null;
					Static205.aClass219_1 = null;
					Static436.aClass113_131 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static312.aClass1_Sub9_Sub4_3.method4607();
			Static400.aClass1_Sub43_5 = null;
			Static205.aClass219_1 = null;
			Static356.anInt5885 = 0;
			Static436.aClass113_131 = null;
		}
		return false;
	}
}
