import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!in;II)Lclient!ck;")
	public static Class61 method2140(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4564(arg1, arg2);
		return local5 == null ? null : new Class61(new Class2_Sub11(local5));
	}
}
