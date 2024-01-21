import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!ab;")
	public static Class3 aClass3_13;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt1647;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!wd;")
	public static Class97 aClass97_8;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public static int anInt1649;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_12 = new Class47(128);

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_681 = Static187.method3089("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_679 = aClass92_681;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_683 = Static187.method3089("wave2:");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_680 = aClass92_683;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!vd;")
	public static Class92 aClass92_682 = aClass92_683;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	public static int anInt1650 = -1;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "I")
	public static int anInt1651 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1121() {
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) Static49.aClass20_3.method467(); local8 != null; local8 = (Class1_Sub19) Static49.aClass20_3.method468()) {
			if (local8.aClass1_Sub12_Sub4_3 != null) {
				Static16.aClass1_Sub12_Sub2_2.method1612(local8.aClass1_Sub12_Sub4_3);
				local8.aClass1_Sub12_Sub4_3 = null;
			}
			if (local8.aClass1_Sub12_Sub4_2 != null) {
				Static16.aClass1_Sub12_Sub2_2.method1612(local8.aClass1_Sub12_Sub4_2);
				local8.aClass1_Sub12_Sub4_2 = null;
			}
		}
		Static49.aClass20_3.method469();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[III)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 - 1;
		@Pc(6) int local6 = local3 - 7;
		arg0--;
		while (arg0 < local6) {
			@Pc(15) int local15 = arg0 + 1;
			arg2[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg1;
			arg0 = local45 + 1;
			arg2[arg0] = arg1;
		}
		while (local3 > arg0) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}
}
