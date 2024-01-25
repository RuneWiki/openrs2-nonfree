import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
	public static int anInt3634;

	@OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
	public static int anInt3635;

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
	public static int anInt3632 = 0;

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "Lclient!sk;")
	public static final Class309 aClass309_8 = new Class309();

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_5 = new Class158(6, 0, 4, 2);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)I")
	public static int method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * arg0 + (arg2 & 0x7F) * local17 >> 7;
		@Pc(45) int local45 = arg0 * (arg1 & 0x380) + (arg2 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = local17 * (arg2 & 0xFC00) + arg0 * (arg1 & 0xFC00) >> 7;
		return local64 & 0xFC00 | local45 & 0x380 | local31 & 0x7F;
	}
}
