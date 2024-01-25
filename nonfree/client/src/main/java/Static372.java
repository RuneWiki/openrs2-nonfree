import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!iq;II)Lclient!ml;")
	public static Class135 method3857(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2756(arg1, arg2);
		return local5 == null ? null : new Class135(new Class2_Sub12(local5));
	}
}
