import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ra;II)Lclient!u;")
	public static Class196 method5324(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4584(arg1, arg2);
		return local5 == null ? null : new Class196(new Class5_Sub1(local5));
	}
}
