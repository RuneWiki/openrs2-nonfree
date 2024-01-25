import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!nl;II)Lclient!ju;")
	public static Class130 method3010(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3745(arg1, arg2);
		return local5 == null ? null : new Class130(new Class2_Sub16(local5));
	}
}
