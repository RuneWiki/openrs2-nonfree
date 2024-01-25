import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public static int anInt10685;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "J")
	public static long aLong293;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public static int anInt10686 = -1;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "Lclient!de;")
	public static final Class70 aClass70_5 = new Class70();

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString114 = null;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_183 = new Class44(65, 6);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method8914() {
		Static74.anInt1617 = 0;
		@Pc(11) int local11 = Static481.aClass14_Sub29_Sub1_2.method5888();
		@Pc(15) int local15 = Static481.aClass14_Sub29_Sub1_2.method5840();
		@Pc(19) int local19 = Static481.aClass14_Sub29_Sub1_2.method5876();
		@Pc(28) boolean local28 = Static481.aClass14_Sub29_Sub1_2.method5866() == 1;
		Static138.method2197();
		Static545.method7697(local11);
		@Pc(40) int local40 = (Static638.anInt10676 - Static481.aClass14_Sub29_Sub1_2.anInt7264) / 16;
		Static659.anIntArrayArray61 = new int[local40][4];
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static659.anIntArrayArray61[local46][local50] = Static481.aClass14_Sub29_Sub1_2.method5878();
			}
		}
		Static78.aByteArrayArray13 = new byte[local40][];
		Static582.aByteArrayArray49 = new byte[local40][];
		Static513.aByteArrayArray41 = new byte[local40][];
		Static662.anIntArray817 = new int[local40];
		Static71.aByteArrayArray11 = null;
		Static384.anIntArray516 = null;
		Static78.aByteArrayArray14 = new byte[local40][];
		Static66.anIntArray112 = new int[local40];
		Static521.anIntArray667 = new int[local40];
		Static332.anIntArray455 = new int[local40];
		Static166.anIntArray272 = new int[local40];
		local40 = 0;
		for (local50 = (local15 - (Static26.anInt462 >> 4)) / 8; local50 <= (local15 + (Static26.anInt462 >> 4)) / 8; local50++) {
			for (@Pc(123) int local123 = (local19 - (Static445.anInt6140 >> 4)) / 8; local123 <= (local19 + (Static445.anInt6140 >> 4)) / 8; local123++) {
				Static332.anIntArray455[local40] = (local50 << 8) + local123;
				Static66.anIntArray112[local40] = Static227.aClass386_126.method9213("m" + local50 + "_" + local123);
				Static521.anIntArray667[local40] = Static227.aClass386_126.method9213("l" + local50 + "_" + local123);
				Static166.anIntArray272[local40] = Static227.aClass386_126.method9213("um" + local50 + "_" + local123);
				Static662.anIntArray817[local40] = Static227.aClass386_126.method9213("ul" + local50 + "_" + local123);
				local40++;
			}
		}
		Static540.method8404(local28, local15, 11, local19);
	}
}
