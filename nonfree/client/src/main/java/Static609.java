import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!bi;II)Lclient!qba;")
	public static Class277 method6077(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method667(arg1, arg2);
		return local5 == null ? null : new Class277(new Class4_Sub9(local5));
	}
}
