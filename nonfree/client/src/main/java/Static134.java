import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!efa", name = "O", descriptor = "I")
	private static int anInt1999;

	@OriginalMember(owner = "client!efa", name = "P", descriptor = "I")
	private static int anInt2000;

	@OriginalMember(owner = "client!efa", name = "Q", descriptor = "Z")
	private static boolean aBoolean185;

	@OriginalMember(owner = "client!efa", name = "R", descriptor = "Z")
	private static boolean aBoolean186;

	@OriginalMember(owner = "client!efa", name = "S", descriptor = "Z")
	private static boolean aBoolean187;

	@OriginalMember(owner = "client!efa", name = "T", descriptor = "Z")
	private static boolean aBoolean188;

	@OriginalMember(owner = "client!efa", name = "U", descriptor = "I")
	private static int anInt2001;

	@OriginalMember(owner = "client!efa", name = "V", descriptor = "I")
	private static int anInt2002;

	@OriginalMember(owner = "client!efa", name = "W", descriptor = "I")
	private static int anInt2003;

	@OriginalMember(owner = "client!efa", name = "X", descriptor = "Z")
	private static boolean aBoolean189;

	@OriginalMember(owner = "client!efa", name = "Y", descriptor = "Z")
	private static boolean aBoolean190;

	@OriginalMember(owner = "client!efa", name = "Z", descriptor = "I")
	private static int anInt2004;

	@OriginalMember(owner = "client!efa", name = "ab", descriptor = "Z")
	private static boolean aBoolean191;

	@OriginalMember(owner = "client!efa", name = "bb", descriptor = "Z")
	private static boolean aBoolean192;

	@OriginalMember(owner = "client!efa", name = "cb", descriptor = "Z")
	private static boolean aBoolean193;

	@OriginalMember(owner = "client!efa", name = "db", descriptor = "Z")
	private static boolean aBoolean194;

	@OriginalMember(owner = "client!efa", name = "eb", descriptor = "I")
	private static int anInt2005;

	@OriginalMember(owner = "client!efa", name = "fb", descriptor = "I")
	private static int anInt2006;

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
	public static int anInt1984 = 0;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)V")
	public static void method1803() {
		Static458.anInt7773 = 0;
		@Pc(12) int local12 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9) + Static153.anInt3147;
		@Pc(19) int local19 = Static201.anInt3839 + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static458.anInt7773 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static458.anInt7773 = 1;
		}
		if (Static458.anInt7773 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static458.anInt7773 = 0;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Z")
	public static boolean method1808(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
