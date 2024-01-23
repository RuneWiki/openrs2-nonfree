import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public static int anInt1320;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!hh;")
	private static Class50 aClass50_482 = Static186.method3527("Loading fonts )2 ");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_481 = aClass50_482;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt1323 = 0;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	public static int anInt1324 = 2;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt1325 = -1;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method1016() {
		Static10.aClass84_9.method2577(5);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)[Lclient!rh;")
	public static Class78_Sub1[] method1017() {
		@Pc(4) Class78_Sub1[] local4 = new Class78_Sub1[anInt1320];
		for (@Pc(15) int local15 = 0; local15 < anInt1320; local15++) {
			local4[local15] = new Class78_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local15], Static228.anIntArray507[local15], Static8.anIntArray20[local15], Static101.anIntArray191[local15], Static191.aByteArrayArray11[local15], Static78.anIntArray127);
		}
		Static216.method3375();
		return local4;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
	public static void method1018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static66.anIntArray108[arg0] = arg1;
		@Pc(19) Class1_Sub18 local19 = (Class1_Sub18) Static4.aClass90_1.method2819((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub18(4611686018427387905L);
			Static4.aClass90_1.method2817(local19, (long) arg0);
		} else if (local19.aLong109 != 4611686018427387905L) {
			local19.aLong109 = Static179.method2941() + 500L | 0x4000000000000000L;
		}
	}
}
