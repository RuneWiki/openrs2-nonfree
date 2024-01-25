import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!uq;II)Lclient!lj;")
	public static Class210 method4984(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8368(arg1, arg2);
		return local5 == null ? null : new Class210(new Class3_Sub4(local5));
	}
}
