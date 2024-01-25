import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_181 = new Class136(75, 3);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!uu;III)Lclient!ju;")
	public static Class124 method5469(@OriginalArg(0) Class250 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method5806(arg1, 0);
		return local14 == null ? null : new Class124(local14);
	}
}
