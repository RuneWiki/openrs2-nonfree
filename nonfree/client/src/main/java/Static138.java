import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ef;II)Lclient!qe;")
	public static Class3_Sub19 method1786(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method566(arg1, arg2);
		return local5 == null ? null : new Class3_Sub19(new Class3_Sub11(local5));
	}
}
