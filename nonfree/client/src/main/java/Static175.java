import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
	public static int anInt3692 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public static void method3221() {
		Static587.aBoolean734 = false;
		Static586.method7778(Static574.anInt9422, Static363.anInt6354, Static144.anInt3166, Static397.anInt6954);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBI)Z")
	public static boolean method3222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!ji;)Ljava/lang/String;")
	public static String method3223(@OriginalArg(1) Class6_Sub21 arg0) {
		return Static480.method6622(arg0);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ji;Z)Lclient!oaa;")
	public static Class230 method3224(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(12) int local12 = arg0.method6003();
		@Pc(19) Class319 local19 = Static4.method161()[arg0.method6069()];
		@Pc(30) Class247 local30 = Static179.method6311()[arg0.method6069()];
		@Pc(34) int local34 = arg0.method6058();
		@Pc(38) int local38 = arg0.method6058();
		return new Class230(local12, local19, local30, local34, local38);
	}
}
