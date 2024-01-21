import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!rb;II)Lclient!n;")
	public static Class39 method1233(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1867(0, arg1);
		return local5 == null ? null : new Class39(new Class1_Sub5(local5));
	}
}
