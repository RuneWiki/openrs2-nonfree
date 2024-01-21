import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt3453;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	public static int[] anIntArray389 = new int[50];

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!lf;")
	public static Class43 aClass43_2 = new Class43();

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
	public static int[] anIntArray390 = new int[32768];

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1429 = Static59.method1195("Walk here");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1428 = aClass60_1429;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1430 = Static59.method1195("Accept challenge");

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1431 = Static59.method1195("To");

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1432 = aClass60_1431;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1433 = aClass60_1430;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2289(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static52.method1123(local18) : local18;
		} else if (arg1 instanceof Class31) {
			@Pc(32) Class31 local32 = (Class31) arg1;
			return local32.method1033();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!md;B)V")
	public static void method2290(@OriginalArg(0) Class3_Sub1_Sub1_Sub3 arg0) {
		arg0.aBoolean48 = false;
		@Pc(18) Class3_Sub1_Sub14 local18;
		if (arg0.anInt1486 != -1) {
			local18 = Static109.method2054(arg0.anInt1486);
			if (local18 == null || local18.anIntArray243 == null) {
				arg0.anInt1486 = -1;
			} else {
				arg0.anInt1517++;
				if (arg0.anInt1485 < local18.anIntArray243.length && arg0.anInt1517 > local18.anIntArray247[arg0.anInt1485]) {
					arg0.anInt1517 = 1;
					arg0.anInt1485++;
					Static124.method2146(local18, arg0.anInt1485, arg0.anInt1524, arg0.anInt1494);
				}
				if (arg0.anInt1485 >= local18.anIntArray243.length) {
					arg0.anInt1517 = 0;
					arg0.anInt1485 = 0;
					Static124.method2146(local18, arg0.anInt1485, arg0.anInt1524, arg0.anInt1494);
				}
			}
		}
		if (arg0.anInt1536 != -1 && Static34.anInt1183 >= arg0.anInt1504) {
			if (arg0.anInt1495 < 0) {
				arg0.anInt1495 = 0;
			}
			@Pc(130) int local130 = Static105.method2024(arg0.anInt1536).anInt1593;
			if (local130 == -1) {
				arg0.anInt1536 = -1;
			} else {
				@Pc(137) Class3_Sub1_Sub14 local137 = Static109.method2054(local130);
				if (local137 == null || local137.anIntArray243 == null) {
					arg0.anInt1536 = -1;
				} else {
					arg0.anInt1507++;
					if (arg0.anInt1495 < local137.anIntArray243.length && arg0.anInt1507 > local137.anIntArray247[arg0.anInt1495]) {
						arg0.anInt1507 = 1;
						arg0.anInt1495++;
						Static124.method2146(local137, arg0.anInt1495, arg0.anInt1524, arg0.anInt1494);
					}
					if (local137.anIntArray243.length <= arg0.anInt1495 && (arg0.anInt1495 < 0 || arg0.anInt1495 >= local137.anIntArray243.length)) {
						arg0.anInt1536 = -1;
					}
				}
			}
		}
		if (arg0.anInt1538 != -1 && arg0.anInt1521 <= 1) {
			local18 = Static109.method2054(arg0.anInt1538);
			if (local18.anInt2476 == 1 && arg0.anInt1491 > 0 && Static34.anInt1183 >= arg0.anInt1535 && Static34.anInt1183 > arg0.anInt1506) {
				arg0.anInt1521 = 1;
				return;
			}
		}
		if (arg0.anInt1538 != -1 && arg0.anInt1521 == 0) {
			local18 = Static109.method2054(arg0.anInt1538);
			if (local18 == null || local18.anIntArray243 == null) {
				arg0.anInt1538 = -1;
			} else {
				arg0.anInt1537++;
				if (local18.anIntArray243.length > arg0.anInt1489 && local18.anIntArray247[arg0.anInt1489] < arg0.anInt1537) {
					arg0.anInt1537 = 1;
					arg0.anInt1489++;
					Static124.method2146(local18, arg0.anInt1489, arg0.anInt1524, arg0.anInt1494);
				}
				if (arg0.anInt1489 >= local18.anIntArray243.length) {
					arg0.anInt1533++;
					arg0.anInt1489 -= local18.anInt2478;
					if (local18.anInt2482 <= arg0.anInt1533) {
						arg0.anInt1538 = -1;
					} else if (arg0.anInt1489 >= 0 && arg0.anInt1489 < local18.anIntArray243.length) {
						Static124.method2146(local18, arg0.anInt1489, arg0.anInt1524, arg0.anInt1494);
					} else {
						arg0.anInt1538 = -1;
					}
				}
				arg0.aBoolean48 = local18.aBoolean89;
			}
		}
		if (arg0.anInt1521 > 0) {
			arg0.anInt1521--;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2291() {
		aClass60_1431 = null;
		aClass60_1429 = null;
		anIntArray390 = null;
		aClass60_1432 = null;
		aClass43_2 = null;
		aClass60_1430 = null;
		aClass60_1433 = null;
		aClass60_1428 = null;
		anIntArray389 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2292(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static97.aClass81_1);
		arg0.removeFocusListener(Static97.aClass81_1);
		Static36.anInt1210 = -1;
	}
}
