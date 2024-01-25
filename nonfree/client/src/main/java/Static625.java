import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!gca;B)I")
	public static int method9289(@OriginalArg(0) Class118 arg0) {
		if (Static44.aClass118_1 == arg0) {
			return 5890;
		} else if (Static312.aClass118_3 == arg0) {
			return 34167;
		} else if (Static175.aClass118_2 == arg0) {
			return 34168;
		} else if (Static660.aClass118_5 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FIFF)I")
	public static int method9290(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(16) float local16 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(25) float local25 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(34) float local34 = arg1 < 0.0F ? -arg1 : arg1;
		if (local16 < local25 && local25 > local34) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local34 > local16 && local25 < local34) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method9291(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
