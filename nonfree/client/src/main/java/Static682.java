import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!uq;II)Lclient!k;")
	public static Class3_Sub32 method4331(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8368(arg1, arg2);
		return local5 == null ? null : new Class3_Sub32(new Class3_Sub4(local5));
	}
}
