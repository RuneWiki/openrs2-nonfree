import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "[Lclient!kf;")
	public static Class23_Sub1[] aClass23_Sub1Array2;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_24 = new Class225(15, 0, 1, 0);

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "[I")
	public static final int[] anIntArray670 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
	public static final int anInt9058 = 0;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
	public static int method7461(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public static boolean method7462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static542.anInt9614; local1++) {
			@Pc(6) Class103 local6 = Static79.aClass103Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3121 == 1) {
				local15 = local6.anInt3135 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3120 + (local6.anInt3125 * local15 >> 8);
					local37 = local6.anInt3136 + (local6.anInt3130 * local15 >> 8);
					local47 = local6.anInt3141 + (local6.anInt3140 * local15 >> 8);
					local57 = local6.anInt3132 + (local6.anInt3134 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3121 == 2) {
				local15 = arg0 - local6.anInt3135;
				if (local15 > 0) {
					local27 = local6.anInt3120 + (local6.anInt3125 * local15 >> 8);
					local37 = local6.anInt3136 + (local6.anInt3130 * local15 >> 8);
					local47 = local6.anInt3141 + (local6.anInt3140 * local15 >> 8);
					local57 = local6.anInt3132 + (local6.anInt3134 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3121 == 3) {
				local15 = local6.anInt3120 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3135 + (local6.anInt3128 * local15 >> 8);
					local37 = local6.anInt3124 + (local6.anInt3137 * local15 >> 8);
					local47 = local6.anInt3141 + (local6.anInt3140 * local15 >> 8);
					local57 = local6.anInt3132 + (local6.anInt3134 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3121 == 4) {
				local15 = arg2 - local6.anInt3120;
				if (local15 > 0) {
					local27 = local6.anInt3135 + (local6.anInt3128 * local15 >> 8);
					local37 = local6.anInt3124 + (local6.anInt3137 * local15 >> 8);
					local47 = local6.anInt3141 + (local6.anInt3140 * local15 >> 8);
					local57 = local6.anInt3132 + (local6.anInt3134 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3121 == 5) {
				local15 = arg1 - local6.anInt3141;
				if (local15 > 0) {
					local27 = local6.anInt3135 + (local6.anInt3128 * local15 >> 8);
					local37 = local6.anInt3124 + (local6.anInt3137 * local15 >> 8);
					local47 = local6.anInt3120 + (local6.anInt3125 * local15 >> 8);
					local57 = local6.anInt3136 + (local6.anInt3130 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public static void method7463() {
		Static419.aClass84_21 = null;
		Static519.aClass84Array15 = null;
		Static406.aClass84_20 = null;
		Static294.aClass84_14 = null;
		Static387.aClass84_18 = null;
		Static482.aClass84_23 = null;
		Static466.aClass84_22 = null;
		Static401.aClass84_19 = null;
		Static294.aClass84_15 = null;
	}
}
