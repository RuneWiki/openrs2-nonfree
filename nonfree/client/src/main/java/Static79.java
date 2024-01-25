import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
	public static final int anInt1988 = 4096;

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
	public static final int anInt1993 = 4096;

	@OriginalMember(owner = "client!dm", name = "gb", descriptor = "I")
	public static final int anInt1996 = Static256.method1622(2200);

	@OriginalMember(owner = "client!dm", name = "Pb", descriptor = "I")
	public static int anInt1999 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!hj;[Lclient!dm;)Lclient!dm;")
	public static Class17_Sub2 method1476(@OriginalArg(0) Class106_Sub1 arg0, @OriginalArg(1) Class17_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class17_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class17_Sub2(arg0, arg1);
		}
	}
}
