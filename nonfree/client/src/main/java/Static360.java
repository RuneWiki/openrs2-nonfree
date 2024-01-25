import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ir;II)Lclient!hg;")
	public static Class3_Sub23 method2045(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2319(arg1, arg2);
		return local5 == null ? null : new Class3_Sub23(new Class3_Sub4(local5));
	}
}
