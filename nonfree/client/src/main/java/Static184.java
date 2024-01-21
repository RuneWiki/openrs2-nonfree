import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!kh;II)Lclient!ng;")
	public static Class57 method1761(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1030(arg2, arg1);
		return local5 == null ? null : new Class57(new Class2_Sub11(local5));
	}
}
