import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_9 = new Class237(11, 16);

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
	public static int anInt3453 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ob;)V")
	public static void method2984(@OriginalArg(1) Class179 arg0) {
		Static92.aClass1_Sub5_Sub1_1.method317(arg0.method4060());
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V")
	public static void method2986(@OriginalArg(1) int arg0) {
		Static86.anInt1856 = arg0;
		@Pc(12) Class134 local12 = Static321.aClass134_43;
		synchronized (Static321.aClass134_43) {
			Static321.aClass134_43.method3272();
		}
		local12 = Static384.aClass134_49;
		synchronized (Static384.aClass134_49) {
			Static384.aClass134_49.method3272();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
	public static void method2987(@OriginalArg(0) int arg0) {
		if (arg0 == Static342.anInt5771) {
			return;
		}
		if (Static342.anInt5771 == 0) {
			Static47.method863();
		}
		if (arg0 == 12) {
			Static50.method892(Static338.aString57, Static134.anInt2694, Static450.aString71);
		}
		if (arg0 != 12 && Static139.aClass229_2 != null) {
			Static139.aClass229_2.method5204();
			Static139.aClass229_2 = null;
		}
		if (arg0 == 2) {
			Static286.method4164(Static407.anInt6564 != Static247.anInt7107);
		}
		if (arg0 == 6) {
			Static29.method3634(Static291.anInt5089 != Static407.anInt6564);
		}
		if (arg0 == 4) {
			Static328.method4656(Static450.aString71, Static338.aString57);
		} else if (arg0 == 5) {
			Static50.method892(Static338.aString57, Static134.anInt2694, Static450.aString71);
		} else if (arg0 == 8) {
			Static50.method892(Static338.aString57, Static134.anInt2694, Static450.aString71);
		} else if (arg0 == 11) {
			Static328.method4656(Static450.aString71, Static338.aString57);
		}
		if (Static139.method2336(Static342.anInt5771)) {
			Static94.aClass246_56.anInt6592 = 2;
			Static444.aClass246_219.anInt6592 = 2;
			Static95.aClass246_59.anInt6592 = 2;
			Static154.aClass246_206.anInt6592 = 2;
			Static113.aClass246_73.anInt6592 = 2;
			Static166.aClass246_94.anInt6592 = 2;
			Static408.aClass246_209.anInt6592 = 2;
		}
		if (Static139.method2336(arg0)) {
			Static378.anInt4252 = 0;
			Static407.anInt6565 = 0;
			Static163.anInt3039 = 1;
			Static69.anInt1587 = 1;
			Static361.anInt5958 = 0;
			Static127.method2242(true);
			Static94.aClass246_56.anInt6592 = 1;
			Static444.aClass246_219.anInt6592 = 1;
			Static95.aClass246_59.anInt6592 = 1;
			Static154.aClass246_206.anInt6592 = 1;
			Static113.aClass246_73.anInt6592 = 1;
			Static166.aClass246_94.anInt6592 = 1;
			Static408.aClass246_209.anInt6592 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static123.method2221();
		}
		if (arg0 == 1) {
			Static7.method163(Static345.aClass246_187, Static415.aClass39_11);
		} else {
			Static380.method5143();
		}
		@Pc(204) boolean local204 = arg0 == 1 || Static323.method4607(arg0) || Static85.method1601(arg0);
		@Pc(219) boolean local219 = Static342.anInt5771 == 1 || Static323.method4607(Static342.anInt5771) || Static85.method1601(Static342.anInt5771);
		if (local204 != local219) {
			if (local204) {
				Static105.anInt2176 = Static412.anInt6646;
				if (Static38.aClass135_Sub1_1.anInt5109 == 0) {
					Static148.method2441();
				} else {
					Static22.method528(Static38.aClass135_Sub1_1.anInt5109, Static412.anInt6646, Static312.aClass246_168);
				}
				Static365.aClass195_2.method4444(false);
			} else {
				Static148.method2441();
				Static365.aClass195_2.method4444(true);
			}
		}
		if (Static139.method2336(arg0) || arg0 == 12) {
			Static415.aClass39_11.method4565();
		}
		Static342.anInt5771 = arg0;
	}
}
