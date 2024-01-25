import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!jo;II)Lclient!ao;")
	public static Class6_Sub3 method667(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4435(arg2, arg1);
		return local5 == null ? null : new Class6_Sub3(new Class6_Sub26(local5));
	}
}
