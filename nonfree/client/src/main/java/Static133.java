import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!wga;")
	public static final Class371 aClass371_2 = new Class371();

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!us;")
	public static final Class344 aClass344_34 = new Class344(62, 3);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)I")
	public static int method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}
}
