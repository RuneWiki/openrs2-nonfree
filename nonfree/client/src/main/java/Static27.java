import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ch", name = "Cb", descriptor = "Lclient!nb;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_2;

	@OriginalMember(owner = "client!ch", name = "Eb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ch", name = "Fb", descriptor = "Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 aClass2_Sub2_Sub17_Sub1_2;

	@OriginalMember(owner = "client!ch", name = "rb", descriptor = "Lclient!nc;")
	public static Class63 aClass63_4 = new Class63(512);

	@OriginalMember(owner = "client!ch", name = "sb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_450 = Static181.method2795("Loading fonts )2 ");

	@OriginalMember(owner = "client!ch", name = "ub", descriptor = "Lclient!qe;")
	public static Class83 aClass83_451 = aClass83_450;

	@OriginalMember(owner = "client!ch", name = "zb", descriptor = "I")
	public static int anInt1416 = 0;

	@OriginalMember(owner = "client!ch", name = "Ab", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_452 = Static181.method2795("Connection lost)3");

	@OriginalMember(owner = "client!ch", name = "Bb", descriptor = "I")
	public static int anInt1417 = 500;

	@OriginalMember(owner = "client!ch", name = "Db", descriptor = "Lclient!qe;")
	public static Class83 aClass83_453 = aClass83_452;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!qe;Lclient!eh;Lclient!qe;B)Lclient!nb;")
	public static Class2_Sub2_Sub17 method1104(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class83 arg2) {
		@Pc(9) int local9 = arg1.method870(arg0);
		@Pc(19) int local19 = arg1.method875(local9, arg2);
		return Static60.method1675(local9, arg1, local19);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
	public static int method1106(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!kf;Z)V")
	public static void method1107(@OriginalArg(0) Class55 arg0) {
		Static161.aClass55_2 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	public static void method1108() {
		for (@Pc(10) Class2_Sub2_Sub12 local10 = (Class2_Sub2_Sub12) Static67.aClass19_6.method691(); local10 != null; local10 = (Class2_Sub2_Sub12) Static67.aClass19_6.method686()) {
			@Pc(17) Class24_Sub6 local17 = local10.aClass24_Sub6_1;
			if (local17.anInt3842 != Static43.anInt1126 || local17.aBoolean179) {
				local10.method3254();
			} else if (Static13.anInt386 >= local17.anInt3838) {
				local17.method2907(Static57.anInt1427);
				if (local17.aBoolean179) {
					local10.method3254();
				} else {
					Static98.method1682(local17.anInt3842, local17.anInt3824, local17.anInt3835, local17.anInt3825, 60, local17, 0, -1L, false);
				}
			}
		}
	}
}
