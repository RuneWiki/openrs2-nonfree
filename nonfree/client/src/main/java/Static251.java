import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_54 = new Class215(4, -1);

	@OriginalMember(owner = "client!mp", name = "X", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!mp", name = "ab", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mp", name = "cb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[50][];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBII)I")
	public static int method3636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method3639() {
		if (Static125.aClass11_5 != null) {
			Static125.aClass11_5.method138();
			Static125.aClass11_5 = null;
		}
		Static409.method5485();
		Static85.method1541();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static175.aClass213Array1[local17].method4851();
		}
		Static33.method633(false);
		System.gc();
		Static397.method724();
		Static436.aBoolean666 = false;
		Static62.anInt1117 = -1;
		Static388.method5094(true);
		Static448.anInt7307 = 0;
		Static453.anInt7373 = 0;
		Static169.anInt3265 = 0;
		Static180.anInt3453 = 0;
		Static86.anInt1771 = 0;
		for (@Pc(64) int local64 = 0; local64 < Static306.aClass38Array1.length; local64++) {
			Static306.aClass38Array1[local64] = null;
		}
		Static106.method1983();
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static267.aClass16_Sub1_Sub5_Sub1Array1[local83] = null;
		}
		Static12.anInt163 = 0;
		for (@Pc(97) int local97 = 0; local97 < 32768; local97++) {
			Static143.aClass16_Sub1_Sub5_Sub2Array1[local97] = null;
		}
		Static440.aClass102_40.method2699();
		Static54.method913();
		Static183.anInt3512 = 0;
		Static257.aClass114_1.method2829();
		Static67.method1277();
		Static242.method3557();
		Static374.method4994(true);
		try {
			Static458.method2593(Static206.aClass66_4.anApplet1, "loggedout");
		} catch (@Pc(136) Throwable local136) {
		}
		Static178.aClass4_Sub42_2 = null;
		Static419.aLong212 = 0L;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII[I)V")
	public static void method3640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg0 < local11) {
			@Pc(15) int local15 = arg0 + 1;
			arg3[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			arg0 = local45 + 1;
			arg3[arg0] = arg1;
		}
		while (local7 > arg0) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}
}
