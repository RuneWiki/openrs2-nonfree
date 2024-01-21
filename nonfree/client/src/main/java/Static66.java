import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Z")
	public static boolean aBoolean58;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!lb;")
	public static Class45 aClass45_12 = new Class45();

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_633 = Static41.method597("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_634 = Static41.method597("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_635 = Static41.method597("runes");

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_636 = Static41.method597("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	public static volatile int anInt1658 = -1;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_637 = aClass60_634;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	public static int anInt1661 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static69.anInt1722 == 1) {
			Static122.aClass4_Sub3_Sub6_Sub3Array11[anInt1659 / 100].method1632(Static24.anInt833 - 8, Static115.anInt2693 + -8);
		}
		if (Static69.anInt1722 == 2) {
			Static122.aClass4_Sub3_Sub6_Sub3Array11[anInt1659 / 100 + 4].method1632(Static24.anInt833 - 8, Static115.anInt2693 + -8);
		}
		Static76.method1245();
		if (!Static133.aBoolean129) {
			return;
		}
		@Pc(49) int local49 = arg3 + 507;
		@Pc(53) int local53 = arg1 + 20;
		Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6.method1200(Static12.method1761(new Class60[] { Static108.aClass60_1001, Static65.method1051(Static107.anInt2530) }), local49, local53, 16776960, -1);
		@Pc(74) int local74 = local53 + 15;
		@Pc(76) int local76 = 16776960;
		@Pc(78) Runtime local78 = Runtime.getRuntime();
		@Pc(87) int local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
		if (local87 > 32768 && Static8.aBoolean3) {
			local76 = 16711680;
		}
		if (local87 > 65536 && !Static8.aBoolean3) {
			local76 = 16711680;
		}
		Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6.method1200(Static12.method1761(new Class60[] { Static10.aClass60_102, Static65.method1051(local87), Static125.aClass60_1110 }), local49, local74, local76, -1);
		local53 = local74 + 15;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static void method1071() {
		aClass60_634 = null;
		aClass60_633 = null;
		aClass45_12 = null;
		aByteArrayArrayArray4 = null;
		aClass60_637 = null;
		aClass60_636 = null;
		aClass60_635 = null;
	}
}
