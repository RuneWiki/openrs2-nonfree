import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Lclient!nb;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_5;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_138;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "Lclient!eh;")
	public static Class28 aClass28_139;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "Lclient!eh;")
	public static Class28 aClass28_140;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Lclient!fg;")
	public static final Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public static int anInt2924 = -1;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_863 = Static181.method2795("auf der Hautpseite)3");

	@OriginalMember(owner = "client!og", name = "G", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	public static int anInt2938 = 2;

	@OriginalMember(owner = "client!og", name = "V", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_864 = Static181.method2795("shake:");

	@OriginalMember(owner = "client!og", name = "X", descriptor = "Lclient!qe;")
	public static Class83 aClass83_865 = aClass83_864;

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_866 = aClass83_864;

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
	public static int anInt2942 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ae;I)I")
	public static int method2242(@OriginalArg(0) Class5 arg0) {
		@Pc(13) Class2_Sub10 local13 = (Class2_Sub10) Static27.aClass63_4.method2110((long) arg0.anInt131 + ((long) arg0.anInt159 << 32));
		return local13 == null ? arg0.anInt143 : local13.anInt974;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Lclient!ei;")
	public static Class2_Sub2_Sub7 method2244() {
		if (Static152.aClass2_Sub2_Sub7_1 == null) {
			Static152.aClass2_Sub2_Sub7_1 = new Class2_Sub2_Sub7();
		}
		return Static152.aClass2_Sub2_Sub7_1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lclient!fe;")
	public static Class2_Sub2_Sub10 method2245(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub10 local15 = (Class2_Sub2_Sub10) Static155.aClass86_43.method2643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static60.method1678(Static92.aClass28_94, arg0, aClass28_138);
		if (local15 != null) {
			Static155.aClass86_43.method2647(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B[B)V")
	public static void method2246(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		@Pc(14) int local14 = local10.method269();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) Class2_Sub7 local22 = new Class2_Sub7();
			@Pc(26) Class83 local26 = local10.method259();
			local22.anInt617 = local10.method269();
			local22.anInt618 = local10.method269();
			local22.anInt621 = local10.method260();
			local22.aClass83_144 = local26.method2387();
			local22.aClass83Array13 = local26.method2405(47);
			Static118.aClass19_12.method684(local22);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Z")
	public static boolean method2248(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
