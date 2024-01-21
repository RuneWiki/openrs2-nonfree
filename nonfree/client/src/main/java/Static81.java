import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!r;")
	public static Class70 aClass70_5;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!jb;")
	public static Class40 aClass40_15 = new Class40(4096);

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!pe;")
	private static Class65 aClass65_762 = Static119.method1462("This computers address has been blocked");

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public static int anInt1760 = 1;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_763 = Static119.method1462("<col=40ff00>");

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_764 = aClass65_762;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static int anInt1770 = -1;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_765 = Static119.method1462("l");

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_766 = Static119.method1462("VOLL");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JZ)V")
	public static void method1325(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static2.method65(arg0 - 1L);
			Static2.method65(1L);
		} else {
			Static2.method65(arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1326() {
		aClass65_766 = null;
		aClass65_762 = null;
		aClass40_15 = null;
		aClass65_764 = null;
		aClass70_5 = null;
		aClass65_765 = null;
		aClass65_763 = null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method1327() {
		Static58.aClass8_35.method171();
		Static93.aClass8_44.method171();
		Static40.aClass8_23.method171();
		Static28.aClass8_18.method171();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1328() {
		Static33.anInt761 = 0;
		Static47.anInt1129 = 0;
		Static100.method1647();
		Static57.method1074();
		Static33.method629();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static47.anInt1129; local21++) {
			local27 = Static98.anIntArray290[local21];
			if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local27].anInt1969 != Static10.anInt2951) {
				Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local27].aClass2_Sub1_Sub12_1 = null;
				Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local27] = null;
			}
		}
		if (Static90.anInt1997 != Static66.aClass2_Sub4_Sub1_2.anInt1298) {
			throw new RuntimeException("gnp1 pos:" + Static66.aClass2_Sub4_Sub1_2.anInt1298 + " psize:" + Static90.anInt1997);
		}
		for (local27 = 0; local27 < Static110.anInt2469; local27++) {
			if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static110.anInt2469);
			}
		}
	}
}
