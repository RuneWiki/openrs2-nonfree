import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!pe;II)Lclient!qr;")
	public static Class273 method6869(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6401(arg1, arg2);
		return local5 == null ? null : new Class273(new Class3_Sub7(local5));
	}
}
