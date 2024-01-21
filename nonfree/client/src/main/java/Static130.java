import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ff;II)Lclient!kf;")
	public static Class2_Sub7 method1090(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method383(arg2, arg1);
		return local5 == null ? null : new Class2_Sub7(new Class2_Sub17(local5));
	}
}
