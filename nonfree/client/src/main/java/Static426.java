import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!ql", name = "yb", descriptor = "I")
	public static int anInt7573;

	@OriginalMember(owner = "client!ql", name = "Bb", descriptor = "I")
	public static int anInt7575;

	@OriginalMember(owner = "client!ql", name = "zb", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_95 = new Class316(53, -1);

	@OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)V")
	public static void method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static267.aByteArrayArrayArray8 = new byte[4][arg0][arg1];
	}
}
