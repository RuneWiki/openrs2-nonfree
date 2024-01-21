import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!pb;II)Lclient!he;")
	public static Class28 method872(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1243(0, arg1);
		return local5 == null ? null : new Class28(new Class6_Sub1(local5));
	}
}
