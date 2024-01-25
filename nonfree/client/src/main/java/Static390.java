import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_19 = new Class222(0, 2, 2, 1);

	@OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
	public static int anInt7009 = 0;

	@OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
	public static final int anInt7014 = 4;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)I")
	public static int method5401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(18) int local18 = 128 - arg1;
		@Pc(32) int local32 = (arg2 & 0x7F) * arg1 + (arg0 & 0x7F) * local18 >> 7;
		@Pc(46) int local46 = arg1 * (arg2 & 0x380) + (arg0 & 0x380) * local18 >> 7;
		@Pc(60) int local60 = arg1 * (arg2 & 0xFC00) + local18 * (arg0 & 0xFC00) >> 7;
		return local60 & 0xFC00 | local46 & 0x380 | local32 & 0x7F;
	}
}
