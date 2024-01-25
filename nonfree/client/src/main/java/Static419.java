import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	public static int anInt7311;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "Lclient!h;")
	public static final Class114 aClass114_141 = new Class114("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!hm;B)I")
	public static int method6229(@OriginalArg(0) Class122 arg0) {
		if (arg0 == Static197.aClass122_2) {
			return 5890;
		} else if (Static43.aClass122_1 == arg0) {
			return 34167;
		} else if (arg0 == Static426.aClass122_4) {
			return 34168;
		} else if (arg0 == Static349.aClass122_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	public static void method6232() {
		@Pc(8) Class1_Sub41 local8 = (Class1_Sub41) Static407.aClass38_54.method1419();
		@Pc(19) boolean local19 = Static279.aClass309_6 != null || Static372.anInt6577 > 0;
		if (local19) {
			Static497.anInt8450 = 1;
		}
		if (Static179.aBoolean243 && Static126.aClass60_1.method5384(81) && Static267.anInt5167 > 2) {
			if (local19) {
				Static478.aClass1_Sub50_3 = (Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284.aClass1_284;
			} else {
				Static538.method7882((Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284.aClass1_284, local8.method7870(), local8.method7866());
			}
		} else if (local19) {
			Static478.aClass1_Sub50_3 = (Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284;
		} else {
			Static538.method7882((Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284, local8.method7870(), local8.method7866());
		}
	}
}
