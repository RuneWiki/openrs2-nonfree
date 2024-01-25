import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "J")
	public static long aLong304 = 0L;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!ika;)Lclient!in;")
	public static Class104_Sub2 method7809(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(7) Class104 local7 = Static707.method9440(arg0);
		@Pc(20) int local20 = arg0.method2028(-14795);
		@Pc(24) int local24 = arg0.method2028(-14795);
		@Pc(28) int local28 = arg0.method2028(-14795);
		@Pc(32) int local32 = arg0.method2028(-14795);
		@Pc(36) int local36 = arg0.method2028(-14795);
		@Pc(40) int local40 = arg0.method2028(-14795);
		return new Class104_Sub2(local7.aClass223_11, local7.aClass352_11, local7.anInt8368, local7.anInt8366, local7.anInt8371, local7.anInt8367, local7.anInt8375, local7.anInt8365, local7.anInt8370, local20, local24, local28, local32, local36, local40);
	}
}
