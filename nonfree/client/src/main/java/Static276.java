import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
	public static final int[] anIntArray456 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	public static void method4775(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub1_Sub8 local16 = Static155.method2994(arg0, 8);
		local16.method2034();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IC)Z")
	public static boolean method4776(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
