import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString9 = "skill: ";

	@OriginalMember(owner = "client!ap", name = "eb", descriptor = "I")
	public static int anInt334 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIB)I")
	public static int method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static7.aClass41Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static48.anInt1107 - 1 < local11 || local15 > Static337.anInt6402 - 1) {
			return 0;
		}
		@Pc(40) int local40 = arg2;
		if (arg2 < 3 && (Static183.aByteArrayArrayArray7[1][local11][local15] & 0x2) != 0) {
			local40 = arg2 + 1;
		}
		return Static7.aClass41Array1[local40].method5433(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
	public static void method363(@OriginalArg(1) int arg0) {
		Static23.anInt530 = 100;
		Static177.anInt3677 = 3;
		Static239.anInt4658 = arg0;
		Static327.anInt6270 = -1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B[B)Z")
	public static boolean method366(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method3141();
		if (local12 != 1) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method3141() == 1;
		if (local31) {
			Static110.method2055(local8);
		}
		Static288.method5431(local8);
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
	public static void method370(@OriginalArg(1) boolean arg0) {
		Static54.method3231(Static100.anInt2086, Static320.anInt6140, Static11.anInt5389, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
	public static int method375(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
