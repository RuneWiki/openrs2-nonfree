import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bg;II)Lclient!mh;")
	public static Class53 method1807(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2049(arg2, arg1);
		return local5 == null ? null : new Class53(new Class2_Sub13(local5));
	}
}
