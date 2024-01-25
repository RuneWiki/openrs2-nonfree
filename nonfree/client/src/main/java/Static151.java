import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	public static final int anInt2887 = 4096;

	@OriginalMember(owner = "client!hl", name = "ob", descriptor = "I")
	public static final int anInt2893 = Static317.method4489(2200);

	@OriginalMember(owner = "client!hl", name = "oc", descriptor = "I")
	public static final int anInt2900 = 4096;

	@OriginalMember(owner = "client!hl", name = "yc", descriptor = "I")
	public static int anInt2902 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!cj;[Lclient!hl;)Lclient!hl;")
	public static Class105_Sub1 method2486(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) Class105_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class105_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class105_Sub1(arg0, arg1);
		}
	}
}
