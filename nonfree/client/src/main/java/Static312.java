import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "Lclient!jb;")
	public static final Class165 aClass165_3 = new Class165();

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "Lclient!vu;")
	public static final Class349 aClass349_8 = new Class349();

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!io;I)Lclient!lm;")
	public static Class1_Sub1 method4781(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method4393();
		@Pc(20) int local20 = arg0.method4393();
		@Pc(24) Class1_Sub1 local24 = Static479.method6720(local20);
		local24.anInt9545 = arg0.method4393();
		@Pc(33) int local33 = arg0.method4393();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method4393();
			local24.method7881(local41, arg0);
		}
		local24.method7885();
		return local24;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBII)I")
	public static int method4783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = local17 * (arg0 & 0x7F) + (arg2 & 0x7F) * arg1 >> 7;
		@Pc(50) int local50 = local17 * (arg0 & 0x380) + (arg2 & 0x380) * arg1 >> 7;
		@Pc(64) int local64 = local17 * (arg0 & 0xFC00) + (arg2 & 0xFC00) * arg1 >> 7;
		return local31 & 0x7F | local64 & 0xFC00 | local50 & 0x380;
	}
}
