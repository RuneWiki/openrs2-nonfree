import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_209 = new Class184(49, 0);

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_210 = new Class184(46, 2);

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_196 = new Class92(70, 0);

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_197 = new Class92(46, 7);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!dn;II)Lclient!ov;")
	public static Class179 method4742(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1391(arg1);
		return local8 == null ? null : new Class179(local8);
	}
}
