import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
	public static int anInt9239;

	@OriginalMember(owner = "client!tu", name = "gb", descriptor = "Lclient!pt;")
	public static Class275 aClass275_1;

	@OriginalMember(owner = "client!tu", name = "Y", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_81 = new Class181(17, 7);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7887(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += (long) (local27 - 64);
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += (long) (local27 + 1 - 97);
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += (long) (local27 + 27 - 48);
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([FI[III[FIIIIII[I)V")
	public static void method7889(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11) {
		@Pc(11) int local11 = arg4 + arg6 * arg8;
		@Pc(17) int local17 = arg10 + arg9 * arg7;
		@Pc(29) int local29 = arg8 - arg1;
		@Pc(34) int local34 = arg9 - arg1;
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg11 == null) {
			for (local38 = 0; local38 < arg3; local38++) {
				local45 = local11 + arg1;
				while (local45 > local11) {
					arg0[local17++] = arg5[local11++];
				}
				local17 += local34;
				local11 += local29;
			}
		} else if (arg5 == null) {
			for (local38 = 0; local38 < arg3; local38++) {
				local45 = local11 + arg1;
				while (local45 > local11) {
					arg2[local17++] = arg11[local11++];
				}
				local17 += local34;
				local11 += local29;
			}
		} else {
			for (local38 = 0; local38 < arg3; local38++) {
				local45 = local11 + arg1;
				while (local45 > local11) {
					arg2[local17] = arg11[local11];
					arg0[local17++] = arg5[local11++];
				}
				local11 += local29;
				local17 += local34;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(III)I")
	public static int method7890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}
