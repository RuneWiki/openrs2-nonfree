import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_16 = new Class68(4);

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z")
	public static boolean method2677() {
		@Pc(8) Class4_Sub39 local8 = (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261;
		if (local8 == null || local8 == Static206.aClass183_28.aClass4_207) {
			return false;
		} else {
			if (local8.anInt5699 >= 2000) {
				local8.anInt5699 -= 2000;
			}
			return local8.anInt5699 == 1002;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I")
	public static int method2678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!iv;B)Lclient!oc;")
	public static Class4_Sub6 method2680(@OriginalArg(0) Class4_Sub12 arg0) {
		arg0.method2490();
		@Pc(21) int local21 = arg0.method2490();
		@Pc(25) Class4_Sub6 local25 = Static11.method122(local21);
		local25.anInt7106 = arg0.method2490();
		@Pc(34) int local34 = arg0.method2490();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method2490();
			local25.method5518(local42, arg0);
		}
		local25.method5509();
		return local25;
	}
}
