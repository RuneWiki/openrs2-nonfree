import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ul;II)Lclient!a;")
	public static Class1_Sub1 method13(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5477(arg1, arg2);
		return local5 == null ? null : new Class1_Sub1(new Class1_Sub5(local5));
	}
}
