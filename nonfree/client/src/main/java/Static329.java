import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "Lclient!nl;")
	public static Class171 aClass171_85;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!tq;")
	public static Interface9 anInterface9_6;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
	public static final int[] anIntArray1148 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[B")
	public static final byte[] aByteArray105 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_89 = new Class32("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
	public static int method4853(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V")
	public static void method4858(@OriginalArg(0) long arg0) {
		if (Static64.aClass251ArrayArrayArray1 != null) {
			if (Static79.anInt4624 == 1 || Static79.anInt4624 == 5) {
				Static244.method3907(arg0);
			} else if (Static79.anInt4624 == 4) {
				Static143.method2680(arg0);
			}
		}
		Static284.method4322(Static111.aClass63_3, (long) Static253.anInt4469);
		if (Static234.anInt4158 != -1) {
			Static319.method4719(Static234.anInt4158);
		}
		for (@Pc(39) int local39 = 0; local39 < Static86.anInt1651; local39++) {
			if (Static331.aBooleanArray30[local39]) {
				Static51.aBooleanArray7[local39] = true;
			}
			Static135.aBooleanArray19[local39] = Static331.aBooleanArray30[local39];
			Static331.aBooleanArray30[local39] = false;
		}
		Static207.anInt4908 = Static253.anInt4469;
		if (Static111.aClass63_3.method2032()) {
			Static140.aBoolean211 = true;
		}
		if (Static234.anInt4158 != -1) {
			Static86.anInt1651 = 0;
			Static140.method2660();
		}
		Static111.aClass63_3.method1967();
		Static144.method2700(Static111.aClass63_3);
		@Pc(85) int local85 = Static84.method1289();
		if (local85 == -1) {
			local85 = Static143.anInt2866;
		}
		Static68.method1081(local85);
		Static303.method4468(Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, Static64.anInt1278);
		Static64.anInt1278 = 0;
	}
}
