import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!im", name = "K", descriptor = "Lclient!dk;")
	public static Class54 aClass54_50;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	public static int anInt3016;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method2447(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static464.method1964(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2449(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static263.anInt3675 = 1;
		Static220.anInt3626 = -1;
		Static26.method370(arg0, arg1);
	}
}
