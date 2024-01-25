import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[Lclient!sq;")
	public static final Class2_Sub43[] aClass2_Sub43Array1 = new Class2_Sub43[1024];

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static volatile int anInt777 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ep;III[I[I)Lclient!fb;")
	public static Class1_Sub2 method620(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(23) int local23 = local12 * arg1 + arg4[local12];
			for (@Pc(25) int local25 = 0; local25 < arg3[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class1_Sub2(arg0, arg1, arg2, local10);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method622(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub21 local17 = (Class2_Sub21) Static242.aClass118_21.method2595((long) arg0);
		if (local17 != null) {
			@Pc(24) Class2_Sub7_Sub3 local24 = local17.aClass209_Sub1_1.method4359();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass209_Sub1_1.method4364();
				if ((double) local24.method5529() <= local31 && (double) local24.method5526() >= local31) {
					return local24.method5528();
				}
			}
		}
		return null;
	}
}
