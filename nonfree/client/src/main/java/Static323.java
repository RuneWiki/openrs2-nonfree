import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!th;II)Lclient!sg;")
	public static Class1_Sub26 method3869(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4058(arg2, arg1);
		return local5 == null ? null : new Class1_Sub26(new Class1_Sub14(local5));
	}
}
