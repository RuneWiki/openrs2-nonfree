import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
	public static int anInt4189;

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "Lclient!taa;")
	public static Class314 aClass314_1;

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
	public static int anInt4193 = 100;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB)Z")
	public static boolean method3641(@OriginalArg(0) int arg0) {
		return arg0 == 44 || arg0 == 16 || arg0 == 1003 || arg0 == 47 || arg0 == 15;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILclient!rg;)Lclient!hba;")
	public static Class124 method3647(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(11) int local11 = arg0.method8571();
		return new Class124(local11);
	}
}
