import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
	public static int anInt4980;

	@OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
	public static int anInt4981;

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_144 = new Class194(72, 0);

	@OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
	public static int anInt4976 = 0;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)I")
	public static int method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
