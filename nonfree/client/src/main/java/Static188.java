import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ke;II)Lclient!sd;")
	public static Class76 method2449(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2205(arg2, arg1);
		return local5 == null ? null : new Class76(new Class2_Sub18(local5));
	}
}
