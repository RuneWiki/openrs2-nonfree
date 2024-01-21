import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!kc;II)Lclient!ca;")
	public static Class10 method235(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method338(arg1, 0);
		return local5 == null ? null : new Class10(new Class2_Sub6(local5));
	}
}
