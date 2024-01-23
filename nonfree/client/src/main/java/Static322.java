import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!rn;II)Lclient!oo;")
	public static Class3_Sub23 method3445(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4121(arg1, arg2);
		return local5 == null ? null : new Class3_Sub23(new Class3_Sub26(local5));
	}
}
