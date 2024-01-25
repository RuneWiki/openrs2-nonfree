import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!hh;II)Lclient!rv;")
	public static Class215 method5099(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2349(arg1, arg2);
		return local5 == null ? null : new Class215(new Class1_Sub14(local5));
	}
}
