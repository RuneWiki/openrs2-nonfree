import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public static int anInt4715;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!ci;")
	public static Class38 aClass38_51;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray89;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IC)Z")
	public static boolean method4019(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4020(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static170.method2991(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lclient!ib;")
	public static Class11_Sub1 method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub1_2 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!iu;I)I")
	public static int method4022(@OriginalArg(0) Class4_Sub20_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method3245(2);
		@Pc(25) int local25;
		if (local10 == 0) {
			local25 = 0;
		} else if (local10 == 1) {
			local25 = arg0.method3245(5);
		} else if (local10 == 2) {
			local25 = arg0.method3245(8);
		} else {
			local25 = arg0.method3245(11);
		}
		return local25;
	}
}
