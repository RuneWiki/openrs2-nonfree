import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Lclient!r;")
	public static final Class200 aClass200_1 = Static118.method1900();

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBC)I")
	public static int method197(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ)V")
	public static void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(12, arg0);
		local13.method3219();
		local13.anInt3670 = arg1;
	}
}
