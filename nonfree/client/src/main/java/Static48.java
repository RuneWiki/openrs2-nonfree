import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ib", name = "Sc", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!ib", name = "hd", descriptor = "I")
	public static int anInt1549;

	@OriginalMember(owner = "client!ib", name = "jd", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!ib", name = "Pc", descriptor = "Lclient!qf;")
	private static Class60 aClass60_662 = Static59.method1195("wave2:");

	@OriginalMember(owner = "client!ib", name = "Tc", descriptor = "I")
	public static int anInt1544 = 0;

	@OriginalMember(owner = "client!ib", name = "Uc", descriptor = "Lclient!eb;")
	public static Class17 aClass17_25 = new Class17(500);

	@OriginalMember(owner = "client!ib", name = "Xc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_663 = aClass60_662;

	@OriginalMember(owner = "client!ib", name = "Yc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_664 = aClass60_662;

	@OriginalMember(owner = "client!ib", name = "ad", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!ib", name = "ed", descriptor = "Lclient!qf;")
	private static Class60 aClass60_668 = Static59.method1195("Enter object name");

	@OriginalMember(owner = "client!ib", name = "bd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_665 = aClass60_668;

	@OriginalMember(owner = "client!ib", name = "cd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_666 = Static59.method1195("null");

	@OriginalMember(owner = "client!ib", name = "kd", descriptor = "Lclient!qf;")
	private static Class60 aClass60_672 = Static59.method1195("wave:");

	@OriginalMember(owner = "client!ib", name = "dd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_667 = aClass60_672;

	@OriginalMember(owner = "client!ib", name = "fd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_669 = Static59.method1195("Konfig geladen)3");

	@OriginalMember(owner = "client!ib", name = "gd", descriptor = "Lclient!qf;")
	public static Class60 aClass60_670 = Static59.method1195(")4l");

	@OriginalMember(owner = "client!ib", name = "id", descriptor = "Lclient!qf;")
	public static Class60 aClass60_671 = aClass60_672;

	@OriginalMember(owner = "client!ib", name = "ld", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!ib", name = "md", descriptor = "Lclient!qf;")
	public static Class60 aClass60_673 = Static59.method1195("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)V")
	public static void method1025() {
		aClass17_25 = null;
		aClass60_670 = null;
		aClass60_672 = null;
		aByteArrayArray11 = null;
		aClass60_664 = null;
		aClass60_669 = null;
		aClass60_667 = null;
		aClass60_668 = null;
		aClass60_671 = null;
		aClass60_663 = null;
		aClass60_662 = null;
		aClass60_673 = null;
		aClass60_665 = null;
		aClass60_666 = null;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(I)V")
	public static void method1026() {
		@Pc(15) int local15 = Static125.anInt3381;
		@Pc(17) int local17 = Static119.anInt3240;
		@Pc(19) int local19 = Static45.anInt1441;
		@Pc(21) int local21 = Static71.anInt1516;
		Static40.method1893(local15, local17, local19, local21, 6116423);
		Static40.method1893(local15 + 1, local17 + 1, local19 - 2, 16, 0);
		Static40.method1884(local15 + 1, local17 + 18, local19 - 2, local21 - 19, 0);
		Static123.aClass3_Sub1_Sub2_Sub2_4.method847(Static118.aClass60_1345, local15 + 3, local17 + 14, 6116423, -1);
		@Pc(68) int local68 = Static12.anInt374;
		@Pc(70) int local70 = Static122.anInt720;
		if (Static19.anInt3405 == 0) {
			local68 -= 4;
			local70 -= 4;
		}
		if (Static19.anInt3405 == 1) {
			local68 -= 205;
			local70 -= 553;
		}
		if (Static19.anInt3405 == 2) {
			local68 -= 357;
			local70 -= 17;
		}
		for (@Pc(86) int local86 = 0; local86 < Static22.anInt872; local86++) {
			@Pc(90) int local90 = 16777215;
			@Pc(103) int local103 = local17 + (-local86 + (Static22.anInt872 - 1)) * 15 + 31;
			if (local15 < local70 && local70 < local19 + local15 && local68 > local103 - 13 && local68 < local103 + 3) {
				local90 = 16776960;
			}
			Static123.aClass3_Sub1_Sub2_Sub2_4.method847(Static68.aClass60Array12[local86], local15 + 3, local103, local90, 0);
		}
	}
}
