import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "J")
	public static long aLong80 = 0L;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!tf;)Lclient!ho;")
	public static Class134 method2843(@OriginalArg(1) int arg0, @OriginalArg(2) Class322 arg1) {
		@Pc(13) byte[] local13 = arg1.method6807(arg0);
		return local13 == null ? null : new Class134(local13);
	}
}
