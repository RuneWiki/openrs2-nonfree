import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!wu;II)Lclient!eh;")
	public static Class88 method1810(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8620(arg1, arg2);
		return local5 == null ? null : new Class88(new Class2_Sub22(local5));
	}
}
