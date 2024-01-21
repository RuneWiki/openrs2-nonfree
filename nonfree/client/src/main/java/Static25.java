import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt1097;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	public static int anInt1103;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt1109;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt1108 = 0;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt1112 = -1;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
	public static int[] anIntArray123 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!lc;")
	public static Class31 aClass31_364 = Static56.method1206("chatback");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method754() {
		@Pc(14) int local14 = anInt1103 + (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7);
		Static68.anInt2207 = 0;
		@Pc(23) int local23 = Static47.anInt1730 + (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 >> 7);
		if (local14 >= 3053 && local14 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static68.anInt2207 = 1;
		}
		if (local14 >= 3072 && local14 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static68.anInt2207 = 1;
		}
		if (Static68.anInt2207 == 1 && local14 >= 3139 && local14 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static68.anInt2207 = 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!pd;)Lclient!lc;")
	public static Class31 method755(@OriginalArg(1) Class2_Sub6 arg0) {
		return Static33.method869(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method756() {
		anIntArray122 = null;
		anIntArray123 = null;
		aClass31_364 = null;
	}
}
