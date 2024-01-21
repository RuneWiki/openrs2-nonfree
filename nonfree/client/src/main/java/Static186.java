import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ah;II)Lclient!hg;")
	public static Class3_Sub9 method1410(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1021(arg1, arg2);
		return local5 == null ? null : new Class3_Sub9(new Class3_Sub8(local5));
	}
}
