import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
	public static int anInt5879 = 0;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_29 = new Class62(16);

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_79 = new Class376(76, 15);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
	public static void method4934(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub54 local15 = (Class3_Sub54) Static623.aClass62_45.method1682((long) arg0);
		if (local15 != null) {
			local15.aBoolean751 = !local15.aBoolean751;
			local15.aClass133_Sub1_1.method2961(local15.aBoolean751);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([II[J)V")
	public static void method4936(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static186.method3008(arg1.length - 1, 0, arg0, arg1);
	}
}
