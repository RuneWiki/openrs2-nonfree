import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
	public static int anInt4841;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt4825 = 2;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "[S")
	public static short[] aShortArray69 = new short[256];

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_42 = new Class352(64);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public static boolean method4315(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
	public static boolean method4317(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
	public static int method4319(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public static void method4320() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static527.aBooleanArray18[local7] = false;
		}
		Static55.anInt1260 = 0;
		Static286.anInt4563 = -1;
		Static77.anInt1632 = -1;
		Static259.anInt4200 = 1;
		Static608.anInt9348 = 0;
		Static558.anInt8603 = -1;
		Static75.anInt1621 = -1;
	}
}
