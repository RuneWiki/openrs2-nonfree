import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "R", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!br", name = "eb", descriptor = "I")
	public static int anInt590;

	@OriginalMember(owner = "client!br", name = "Q", descriptor = "I")
	public static int anInt582 = -2;

	@OriginalMember(owner = "client!br", name = "S", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_18 = new Class119(64);

	@OriginalMember(owner = "client!br", name = "Y", descriptor = "Z")
	public static boolean aBoolean70 = true;

	@OriginalMember(owner = "client!br", name = "bb", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!br", name = "cb", descriptor = "I")
	public static int anInt589 = 0;

	@OriginalMember(owner = "client!br", name = "db", descriptor = "[I")
	public static final int[] anIntArray41 = new int[8];

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
	public static void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class146 local8 = Static86.method1928(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray17 != null) {
			@Pc(18) Class2_Sub44 local18 = new Class2_Sub44();
			local18.anObjectArray35 = local8.anObjectArray17;
			local18.anInt6909 = arg0;
			local18.aString66 = arg2;
			local18.aClass146_18 = local8;
			Static72.method1646(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4440 > 0) {
			local35 = Static185.method3329(local8);
		}
		if (!local35 || !Static43.method1056(local8).method708(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static74.aClass2_Sub10_Sub1_2.method2049(9);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 2) {
			Static74.aClass2_Sub10_Sub1_2.method2049(231);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 3) {
			Static74.aClass2_Sub10_Sub1_2.method2049(246);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 4) {
			Static74.aClass2_Sub10_Sub1_2.method2049(5);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 5) {
			Static74.aClass2_Sub10_Sub1_2.method2049(153);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 6) {
			Static74.aClass2_Sub10_Sub1_2.method2049(144);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 7) {
			Static74.aClass2_Sub10_Sub1_2.method2049(145);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 8) {
			Static74.aClass2_Sub10_Sub1_2.method2049(88);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 9) {
			Static74.aClass2_Sub10_Sub1_2.method2049(60);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
		if (arg0 == 10) {
			Static74.aClass2_Sub10_Sub1_2.method2049(104);
			Static196.method3529(arg3, arg1, local8.anInt4478);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	public static void method795(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(14, arg0);
		local8.method5539();
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V")
	public static void method796() {
		if (Static114.aBoolean579) {
			Static304.aClass31_123 = null;
			Static114.aBoolean579 = false;
			Static26.aClass31_16 = null;
		}
	}
}
