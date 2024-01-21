import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!bf;II)Lclient!qb;")
	public static Class54 method1461(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1882(arg1, 0);
		return local5 == null ? null : new Class54(new Class3_Sub6(local5));
	}
}
