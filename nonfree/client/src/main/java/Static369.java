import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mfa", name = "q", descriptor = "Lclient!aj;")
	public static Class15 aClass15_97;

	@OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
	public static int anInt5957;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_136 = new Class180(84, 4);

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_24 = new Class83(16);

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
	public static int anInt5956 = 0;

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_137 = new Class180(90, 16);

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "([[F[[SB)[[S")
	public static short[][] method5386(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg1[local3].length; local7++) {
				arg1[local3][local7] = (short) (int) (arg0[local3][local7] * 16383.0F);
			}
		}
		return arg1;
	}
}
