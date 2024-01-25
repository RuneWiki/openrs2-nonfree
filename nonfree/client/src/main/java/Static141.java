import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_22 = new Class361();

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!pfa;)Lclient!ub;")
	public static Class327 method2763(@OriginalArg(0) int arg0, @OriginalArg(3) Class251 arg1) {
		@Pc(11) byte[] local11 = arg1.method5772(0, arg0);
		return local11 == null ? null : new Class327(local11);
	}
}
