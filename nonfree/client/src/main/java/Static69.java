import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	public static final int anInt1451 = 4096;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
	public static final int anInt1454 = 4096;

	@OriginalMember(owner = "client!de", name = "bc", descriptor = "I")
	public static final int anInt1460 = Static278.method4208(2200);

	@OriginalMember(owner = "client!de", name = "oc", descriptor = "I")
	public static int anInt1461 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!lo;[Lclient!de;)Lclient!de;")
	public static Class39_Sub1 method1356(@OriginalArg(0) Class28_Sub2 arg0, @OriginalArg(1) Class39_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class39_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class39_Sub1(arg0, arg1);
		}
	}
}
