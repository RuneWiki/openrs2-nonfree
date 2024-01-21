import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kf", name = "Cb", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!kf", name = "Ob", descriptor = "Lclient!ud;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!kf", name = "Pb", descriptor = "I")
	public static int anInt1691;

	@OriginalMember(owner = "client!kf", name = "Qb", descriptor = "Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 aClass4_Sub4_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kf", name = "zb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_597 = Static121.method2047("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!kf", name = "Kb", descriptor = "Lclient!mf;")
	public static Class48 aClass48_38 = new Class48(100);

	@OriginalMember(owner = "client!kf", name = "Rb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_598 = Static121.method2047("Hidden)2");

	@OriginalMember(owner = "client!kf", name = "Sb", descriptor = "I")
	public static int anInt1692 = 2;

	@OriginalMember(owner = "client!kf", name = "Tb", descriptor = "[I")
	public static int[] anIntArray168 = new int[2000];

	@OriginalMember(owner = "client!kf", name = "Ub", descriptor = "I")
	public static int anInt1693 = 0;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "(B)V")
	public static void method1257() {
		aClass4_Sub4_Sub3_Sub1_3 = null;
		aClass48_38 = null;
		aClass53_1 = null;
		anIntArray168 = null;
		aClass60_598 = null;
		aClass60_597 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)I")
	public static int method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static95.aByteArrayArrayArray5[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static95.aByteArrayArrayArray5[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIILclient!ib;)V")
	public static void method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub4_Sub3_Sub2 arg4) {
		@Pc(12) int local12 = arg1 * arg1 + arg2 * arg2;
		if (local12 <= 4225 || local12 >= 90000) {
			Static85.method1495(arg4, arg3, arg2, arg1, arg0);
			return;
		}
		@Pc(39) int local39 = Static129.anInt3002 + Static52.anInt1339 & 0x7FF;
		@Pc(43) int local43 = Class4_Sub4_Sub3_Sub3.anIntArray217[local39];
		@Pc(47) int local47 = Class4_Sub4_Sub3_Sub3.anIntArray214[local39];
		@Pc(55) int local55 = local47 * 256 / (Static17.anInt453 + 256);
		@Pc(63) int local63 = local43 * 256 / (Static17.anInt453 + 256);
		@Pc(73) int local73 = local63 * arg1 + arg2 * local55 >> 16;
		@Pc(84) int local84 = local63 * arg2 - arg1 * local55 >> 16;
		@Pc(90) double local90 = Math.atan2((double) local73, (double) local84);
		@Pc(96) int local96 = (int) (Math.sin(local90) * 63.0D);
		@Pc(102) int local102 = (int) (Math.cos(local90) * 57.0D);
		Static31.aClass4_Sub4_Sub3_Sub2_2.method896(local96 + arg3 + 94 + 4 - 10, -local102 + 83 + arg0 + -20, local90);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
	public static void method1267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static64.anInt1714 != 0 && arg1 != -1) {
			Static105.method1824(0, Static23.aClass40_Sub1_7, arg1, Static64.anInt1714);
			Static103.aBoolean61 = true;
		}
	}
}
