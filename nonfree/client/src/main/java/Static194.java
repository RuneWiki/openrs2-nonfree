import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ag;II)Lclient!ua;")
	public static Class83 method2882(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2243(arg1, arg2);
		return local5 == null ? null : new Class83(new Class1_Sub8(local5));
	}
}
