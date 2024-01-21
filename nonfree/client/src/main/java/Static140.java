import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!na;II)Lclient!kd;")
	public static Class44 method1081(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1666(arg2, arg1);
		return local5 == null ? null : new Class44(new Class2_Sub4(local5));
	}
}
