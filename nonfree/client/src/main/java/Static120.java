import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ac;II)Lclient!b;")
	public static Class7 method150(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method928(0, arg1);
		return local5 == null ? null : new Class7(new Class2_Sub12(local5));
	}
}
