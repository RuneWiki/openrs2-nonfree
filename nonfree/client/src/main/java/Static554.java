import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!kr;II)Lclient!jt;")
	public static Class159 method4066(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4339(arg1, arg2);
		return local5 == null ? null : new Class159(new Class1_Sub6(local5));
	}
}
