import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!td;II)Lclient!ke;")
	public static Class36 method1067(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1615(arg1, 0);
		return local5 == null ? null : new Class36(new Class3_Sub11(local5));
	}
}
