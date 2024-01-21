import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!f;II)Lclient!qh;")
	public static Class66 method2241(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method348(arg1, arg2);
		return local5 == null ? null : new Class66(new Class3_Sub12(local5));
	}
}
