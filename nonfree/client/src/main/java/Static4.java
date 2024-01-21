import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array1;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ob;")
	public static Class60 aClass60_33 = null;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_36 = Static158.method3034("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_34 = aClass60_36;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
	public static final int[] anIntArray5 = new int[128];

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_35 = null;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_37 = Static158.method3034("hint_mapedge");

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_38 = Static158.method3034(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_39 = Static158.method3034("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method69() {
		if (Static50.anInt1552 > 0) {
			Static33.method826();
		} else {
			Static139.method2831(40);
			Static105.aClass66_34 = Static29.aClass66_10;
			Static29.aClass66_10 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kc;IIILclient!ra;II)V")
	public static void method70(@OriginalArg(0) Class2_Sub1_Sub7_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class72 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = Static88.anInt2591 + Static188.anInt4484 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg3.anInt3878 / 2, arg3.anInt3871 / 2) + 10;
		@Pc(37) int local37 = arg2 * arg2 + arg5 * arg5;
		if (local24 * local24 < local37) {
			return;
		}
		@Pc(47) int local47 = Class2_Sub1_Sub7_Sub1.anIntArray133[local12];
		@Pc(51) int local51 = Class2_Sub1_Sub7_Sub1.anIntArray129[local12];
		@Pc(59) int local59 = local47 * 256 / (Static105.anInt3614 + 256);
		@Pc(67) int local67 = local51 * 256 / (Static105.anInt3614 + 256);
		@Pc(78) int local78 = local67 * arg2 - arg5 * local59 >> 16;
		@Pc(88) int local88 = local67 * arg5 + local59 * arg2 >> 16;
		arg0.method2134(arg3.anInt3878 / 2 + arg1 + local88 - arg0.anInt2696 / 2, -(arg0.anInt2692 / 2) + -local78 + arg3.anInt3871 / 2 + arg4, arg3.anIntArray433, arg3.anIntArray434);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZLclient!pe;II)V")
	public static void method71(@OriginalArg(1) int arg0, @OriginalArg(3) Class13 arg1, @OriginalArg(5) int arg2) {
		Static163.anInt4052 = arg0;
		Static179.anInt4363 = 1;
		Static53.anInt1661 = arg2;
		Static52.anInt1623 = 0;
		Static108.aClass13_24 = arg1;
		Static165.aBoolean161 = false;
		Static22.anInt704 = 10000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)I")
	public static int method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(22) int local22 = Static60.method1398(local17, local7);
		@Pc(28) int local28 = arg0 - 1 & arg2;
		@Pc(35) int local35 = Static60.method1398(local17, local7 + 1);
		@Pc(42) int local42 = Static60.method1398(local17 + 1, local7);
		@Pc(56) int local56 = Static60.method1398(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static176.method3301(local35, local13, arg0, local22);
		@Pc(70) int local70 = Static176.method3301(local56, local13, arg0, local42);
		return Static176.method3301(local70, local28, arg0, local63);
	}
}
