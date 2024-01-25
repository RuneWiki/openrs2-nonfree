import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_10 = new Class185(39, 8);

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_11 = new Class185(32, 0);

	@OriginalMember(owner = "client!bba", name = "x", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_11 = new Class73(103, 7);

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
	public static volatile int anInt830 = -1;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z")
	public static boolean method772(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static406.method6371(arg1, arg0) || Static190.method3512(arg1, arg0);
	}
}
