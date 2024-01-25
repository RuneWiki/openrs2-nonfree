import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!oh;II)Lclient!uia;")
	public static Class8_Sub47 method7990(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6314(arg1, arg2);
		return local5 == null ? null : new Class8_Sub47(new Class8_Sub8(local5));
	}
}
