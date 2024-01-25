import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "Lclient!aj;")
	public static Class15 aClass15_131;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(CIB)I")
	public static int method7314(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)Z")
	public static boolean method7315() {
		if (Static406.anInt6454 == 3) {
			return Static260.anInt4398 == 0 && Static433.anInt8266 == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method7316(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static684.method5324(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)I")
	public static int method7317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)[I")
	public static int[] method7318() {
		return new int[] { Static35.anInt818, Static540.anInt8898, Static75.anInt1398 };
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)J")
	public static synchronized long method7320() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static442.aLong222 > local5) {
			Static129.aLong84 += Static442.aLong222 - local5;
		}
		Static442.aLong222 = local5;
		return local5 + Static129.aLong84;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(Z)V")
	public static void method7321(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static15.aClass164ArrayArrayArray5 = Static275.aClass164ArrayArrayArray2;
			Static121.aClass21Array2 = Static108.aClass21Array1;
		} else {
			Static15.aClass164ArrayArrayArray5 = Static334.aClass164ArrayArrayArray3;
			Static121.aClass21Array2 = Static582.aClass21Array3;
		}
		Static183.anInt3720 = Static15.aClass164ArrayArrayArray5.length;
	}
}
