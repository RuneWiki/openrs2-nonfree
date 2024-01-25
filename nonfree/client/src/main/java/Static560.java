import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_227 = new Class215(6, 2);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)I")
	public static int method8412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}
}
