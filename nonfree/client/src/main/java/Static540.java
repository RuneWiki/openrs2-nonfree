import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static540 {

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "Lclient!qb;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "F")
	public static float aFloat368;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_19 = new Class212(3, 5);

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "[I")
	public static final int[] anIntArray690 = new int[256];

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Lclient!df;")
	public static final Class5_Sub11 aClass5_Sub11_2 = new Class5_Sub11(0, -1);

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
	public static int anInt9077 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IC)Z")
	public static boolean method7343(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
