import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public static int anInt2378;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public static int anInt2381;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_6 = new Class159(12, 2);

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public static final int anInt2382 = 2;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)Z")
	public static boolean method2051(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
