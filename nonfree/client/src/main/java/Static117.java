import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!qj;")
	public static Class165 aClass165_45;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt2324;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
	public static int[] anIntArray286 = new int[2];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method2113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static35.anInt880; local1++) {
			@Pc(6) Class210 local6 = Static69.aClass210Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6293 == 1) {
				local15 = local6.anInt6292 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6282 + (local6.anInt6280 * local15 >> 8);
					local37 = local6.anInt6294 + (local6.anInt6287 * local15 >> 8);
					local47 = local6.anInt6295 + (local6.anInt6278 * local15 >> 8);
					local57 = local6.anInt6286 + (local6.anInt6290 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6293 == 2) {
				local15 = arg0 - local6.anInt6292;
				if (local15 > 0) {
					local27 = local6.anInt6282 + (local6.anInt6280 * local15 >> 8);
					local37 = local6.anInt6294 + (local6.anInt6287 * local15 >> 8);
					local47 = local6.anInt6295 + (local6.anInt6278 * local15 >> 8);
					local57 = local6.anInt6286 + (local6.anInt6290 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6293 == 3) {
				local15 = local6.anInt6282 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6284 + (local6.anInt6283 * local15 >> 8);
					local47 = local6.anInt6295 + (local6.anInt6278 * local15 >> 8);
					local57 = local6.anInt6286 + (local6.anInt6290 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6293 == 4) {
				local15 = arg2 - local6.anInt6282;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6284 + (local6.anInt6283 * local15 >> 8);
					local47 = local6.anInt6295 + (local6.anInt6278 * local15 >> 8);
					local57 = local6.anInt6286 + (local6.anInt6290 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6293 == 5) {
				local15 = arg1 - local6.anInt6295;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6284 + (local6.anInt6283 * local15 >> 8);
					local47 = local6.anInt6282 + (local6.anInt6280 * local15 >> 8);
					local57 = local6.anInt6294 + (local6.anInt6287 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BB)[B")
	public static byte[] method2114(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static367.method5383(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V")
	public static void method2117() {
		@Pc(5) Class140 local5 = Static338.aClass140_174;
		synchronized (Static338.aClass140_174) {
			Static338.aClass140_174.method3813();
		}
	}
}
