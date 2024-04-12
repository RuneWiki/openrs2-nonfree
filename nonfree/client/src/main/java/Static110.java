import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ud;II)Lclient!oc;", line = 4)
	public static Class43 method1214(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method68(0, arg1);
		return local5 == null ? null : new Class43(new Class2_Sub3(local5));
	}
}
