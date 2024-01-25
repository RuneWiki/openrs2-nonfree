import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!wo;")
	public static Class216 aClass216_99;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	public static int anInt6808;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public static int anInt6802 = 0;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_10 = new Class92(64);

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "F")
	public static float aFloat79 = 0.0F;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method5682(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!na;)Z")
	public static boolean method5684(@OriginalArg(1) Class139 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean390) {
			return false;
		} else if (!arg0.method3810()) {
			return false;
		} else if (Static238.aClass197_23.method5157((long) arg0.anInt4238) == null) {
			return Static218.aClass197_21.method5157((long) arg0.anInt4246) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)I")
	public static int method5685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return local11 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}
