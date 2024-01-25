import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!g;II)Lclient!fo;")
	public static Class80 method1856(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1968(arg2, arg1);
		return local5 == null ? null : new Class80(new Class2_Sub24(local5));
	}
}
