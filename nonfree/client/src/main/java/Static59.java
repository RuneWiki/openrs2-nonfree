import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!eia;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_16 = new Class218(12, 7);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method1278(@OriginalArg(1) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(23) char local23 = arg0.charAt(local10);
			if (local23 >= 'A' && local23 <= 'Z') {
				local5 += (long) (local23 + 1 - 65);
			} else if (local23 >= 'a' && local23 <= 'z') {
				local5 += (long) (local23 - 96);
			} else if (local23 >= '0' && local23 <= '9') {
				local5 += (long) (local23 + 27 - 48);
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	public static int method1279() {
		return Static41.anInt961;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1280(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static684.method5324(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZBJ)Ljava/lang/String;")
	public static String method1282(@OriginalArg(0) int arg0, @OriginalArg(3) long arg1) {
		Static659.method9126(arg1);
		@Pc(17) Calendar local17 = Static379.aCalendar19;
		@Pc(21) int local21 = local17.get(5);
		@Pc(27) int local27 = local17.get(2) + 1;
		@Pc(36) int local36 = local17.get(1);
		@Pc(40) int local40 = local17.get(11);
		@Pc(44) int local44 = local17.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local36 % 100 / 10 + local36 % 10 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10;
	}
}
