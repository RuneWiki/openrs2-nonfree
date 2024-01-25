import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_69 = new Class73();

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "[I")
	public static int[] anIntArray644 = new int[2];

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_135 = new Class45(89, -1);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method7159(@OriginalArg(0) Class42 arg0) {
		if (Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != Static8.anInt119 && (Static120.aClass37ArrayArrayArray1 != null && Static192.method3673(Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99, arg0))) {
			Static8.anInt119 = Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method7161(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			if (arg0 == arg1.charAt(local20)) {
				local7++;
			}
		}
		return local7;
	}
}
