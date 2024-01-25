import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jo;II)Lclient!bh;")
	public static Class33 method1086(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4435(arg2, arg1);
		return local5 == null ? null : new Class33(new Class6_Sub26(local5));
	}
}
