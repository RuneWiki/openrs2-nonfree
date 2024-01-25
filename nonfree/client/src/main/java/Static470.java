import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_268 = new Class123(98, 7);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public static int method6421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = local22 + Math.random() * (local15 - local22);
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZBI)Lclient!qi;")
	public static Class3_Sub44 method6424(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub44) Static269.aClass297_22.method6531(local12);
	}
}
