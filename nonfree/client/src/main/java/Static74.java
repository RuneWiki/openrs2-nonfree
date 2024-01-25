import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!fs;")
	public static Class76 aClass76_20;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_72 = new Class22(35, -2);

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_5 = new Class98(8, 0, 4, 1);

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public static int anInt1528 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BIII)I")
	public static int method1361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(18) int local18 = 128 - arg0;
		@Pc(32) int local32 = arg0 * (arg2 & 0x7F) + local18 * (arg1 & 0x7F) >> 7;
		@Pc(46) int local46 = arg0 * (arg2 & 0x380) + local18 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = local18 * (arg1 & 0xFC00) + (arg2 & 0xFC00) * arg0 >> 7;
		return local60 & 0xFC00 | local46 & 0x380 | local32 & 0x7F;
	}
}
