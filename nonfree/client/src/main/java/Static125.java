import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!sd;I)Lclient!ba;")
	public static Class8 method83(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method745(arg1);
		return local4 == null ? null : new Class8(new Class5_Sub9(local4));
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!sd;II)Lclient!ba;")
	public static Class8 method84(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method733(0, arg1);
		return local5 == null ? null : new Class8(new Class5_Sub9(local5));
	}
}
