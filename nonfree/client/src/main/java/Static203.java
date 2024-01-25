import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public static int anInt4356;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	public static int anInt4358;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "[I")
	public static final int[] anIntArray280 = new int[1];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!iaa;I)Lclient!sv;")
	public static Class292 method3793(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(15) int local15 = arg0.method4999();
		return new Class292(local15);
	}
}
