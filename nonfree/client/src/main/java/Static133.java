import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "[[[Lclient!kf;")
	public static Class2_Sub14[][][] aClass2_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
	public static long aLong114;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public static int anInt3089;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1822 = Static107.method1838("No response from server)3");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray280 = new int[128];

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
	public static int[] anIntArray281 = new int[500];

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1823 = aClass28_1822;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method2114() {
		anIntArray280 = null;
		aClass2_Sub14ArrayArrayArray1 = null;
		aClass28_1822 = null;
		anIntArray281 = null;
		aClass28_1823 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
	public static void method2119(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static38.anInt1022 >= 100 && Static13.anInt588 != 1 || Static38.anInt1022 >= 200) {
			Static93.method1632(0, Static136.aClass28_1828, Static64.aClass28_984);
			return;
		}
		@Pc(33) Class28 local33 = Static83.method1479(arg0).method1115();
		for (@Pc(35) int local35 = 0; local35 < Static38.anInt1022; local35++) {
			if (arg0 == Static77.aLongArray7[local35]) {
				Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { local33, Static98.aClass28_1426 }));
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static92.anInt2333; local70++) {
			if (Static11.aLongArray3[local70] == arg0) {
				Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { Static120.aClass28_1679, local33, Static130.aClass28_1793 }));
				return;
			}
		}
		if (local33.method1107(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953)) {
			Static93.method1632(0, Static136.aClass28_1828, Static130.aClass28_1786);
			return;
		}
		Static127.aClass28Array43[Static38.anInt1022] = local33;
		Static77.aLongArray7[Static38.anInt1022] = arg0;
		Static112.anIntArray261[Static38.anInt1022] = 0;
		Static177.anIntArray363[Static38.anInt1022] = 0;
		Static38.anInt1022++;
		Static30.anInt928 = Static70.anInt1853;
		Static128.aClass2_Sub2_Sub1_2.method1711(114);
		Static128.aClass2_Sub2_Sub1_2.method1666(arg0);
	}
}
