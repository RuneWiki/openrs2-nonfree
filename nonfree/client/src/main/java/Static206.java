import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!pe;II)Lclient!ui;")
	public static Class2_Sub22 method3404(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method521(arg2, arg1);
		return local5 == null ? null : new Class2_Sub22(new Class2_Sub3(local5));
	}
}
