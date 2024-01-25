import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
	public static int anInt6802;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
	public static int anInt6807;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "Z")
	public static boolean aBoolean544 = false;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_119 = new Class73(87, 7);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IB)Z")
	public static boolean method5687(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
