import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!oe;II)Lclient!cd;")
	public static Class2_Sub6 method380(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3197(arg2, arg1);
		return local5 == null ? null : new Class2_Sub6(new Class2_Sub23(local5));
	}
}
