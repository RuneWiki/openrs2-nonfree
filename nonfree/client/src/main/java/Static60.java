import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lclient!u;")
	public static Class76 aClass76_53;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!rf;")
	public static Class70 aClass70_601 = Static49.method1293("gelb:");

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_602 = Static49.method1293(":assistreq:");

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "Lclient!rf;")
	private static Class70 aClass70_604 = Static49.method1293("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!rf;")
	public static Class70 aClass70_603 = aClass70_604;

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method1459() {
		Static171.aClass25_24.method1300();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!me;)V")
	public static void method1460(@OriginalArg(1) Class1_Sub19 arg0) {
		Static163.method3269(200000, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZI)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static142.anIntArrayArrayArray8[arg1][local7 + arg2][arg0 + local11] = 0;
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static142.anIntArrayArrayArray8[arg1][arg2][arg0 + local11] = Static142.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 + local11];
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static142.anIntArrayArrayArray8[arg1][arg2 + local11][arg0] = Static142.anIntArrayArrayArray8[arg1][arg2 + local11][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static142.anIntArrayArrayArray8[arg1][arg2 - 1][arg0] != 0) {
			Static142.anIntArrayArrayArray8[arg1][arg2][arg0] = Static142.anIntArrayArrayArray8[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static142.anIntArrayArrayArray8[arg1][arg2][arg0 - 1] != 0) {
			Static142.anIntArrayArrayArray8[arg1][arg2][arg0] = Static142.anIntArrayArrayArray8[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static142.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static142.anIntArrayArrayArray8[arg1][arg2][arg0] = Static142.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method1462() {
		aClass70_601 = null;
		aByteArrayArrayArray4 = null;
		aClass76_53 = null;
		aClass70_602 = null;
		aClass1_Sub1_Sub1_Sub4_7 = null;
		aClass70_603 = null;
		aClass70_604 = null;
	}
}
