import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!gga;II)Lclient!kp;")
	public static Class2_Sub39 method5345(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3641(arg1, arg2);
		return local5 == null ? null : new Class2_Sub39(new Class2_Sub8(local5));
	}
}
