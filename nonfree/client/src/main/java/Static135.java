import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ea;II)Lclient!ae;")
	public static Song method53(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method597(arg1, arg2);
		return local5 == null ? null : new Song(new Packet(local5));
	}
}
