import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!dn;II)Lclient!qaa;")
	public static Class233 method6179(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1888(arg2, arg1);
		return local5 == null ? null : new Class233(new Class1_Sub17(local5));
	}
}
