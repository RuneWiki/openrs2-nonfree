import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	public static int anInt527;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_20 = new Class107(92, 12);

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_21 = new Class107(48, 5);

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZII)I")
	public static int method509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub14 local8 = Static48.method871(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray146.length) {
			return local8.anIntArray146[arg2];
		} else {
			return -1;
		}
	}
}
