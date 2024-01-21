import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!h", name = "w", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array5;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Lclient!ua;")
	public static Class87 aClass87_2;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	public static int anInt1572;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_587 = Static177.method3050("(U4");

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_594 = Static177.method3050("green:");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!jd;")
	public static Class46 aClass46_588 = aClass46_594;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_589 = Static177.method3050("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_590 = Static177.method3050("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "Z")
	public static volatile boolean aBoolean72 = false;

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_591 = Static177.method3050("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_592 = aClass46_594;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_593 = aClass46_591;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public static void method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class4_Sub7 local28 = Static28.aClass4_Sub7ArrayArrayArray1[local9][arg0][arg1] = Static28.aClass4_Sub7ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1033--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1040; local38++) {
					@Pc(44) Class86 local44 = local28.aClass86Array1[local38];
					if ((local44.aLong129 >> 29 & 0x3L) == 2L && local44.anInt3583 == arg0 && local44.anInt3581 == arg1) {
						local44.anInt3582--;
					}
				}
			}
		}
		if (Static28.aClass4_Sub7ArrayArrayArray1[0][arg0][arg1] == null) {
			Static28.aClass4_Sub7ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub7(0, arg0, arg1);
		}
		Static28.aClass4_Sub7ArrayArrayArray1[0][arg0][arg1].aClass4_Sub7_1 = local7;
		Static28.aClass4_Sub7ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	public static void method1242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = Static132.method2334(arg2, arg1);
		if (local8 != null && local8.anObjectArray26 != null) {
			@Pc(17) Class4_Sub21 local17 = new Class4_Sub21();
			local17.aClass1_40 = local8;
			local17.anObjectArray28 = local8.anObjectArray26;
			Static2.method18(local17);
		}
		Static86.aBoolean97 = true;
		Static106.anInt2649 = arg2;
		Static124.anInt2981 = arg1;
		Static38.anInt1000 = arg0;
		Static3.method21(local8);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(II)I")
	public static int method1250(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILclient!nh;)Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 method1267(@OriginalArg(2) int arg0, @OriginalArg(3) Class62 arg1) {
		return Static141.method2417(arg1, 0, arg0) ? Static56.method2456() : null;
	}
}
