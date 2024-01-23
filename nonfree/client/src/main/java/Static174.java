import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[Lclient!mh;")
	public static Class114[] aClass114Array2;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt3204 = 1;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Cancel";

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt3207 = 0;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
	public static int[] anIntArray383 = new int[100];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)I")
	public static int method2633(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)I")
	public static int method2634(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ak;Z)V")
	public static void method2636(@OriginalArg(0) Class7 arg0) {
		Static57.aClass7_50 = arg0;
	}
}
