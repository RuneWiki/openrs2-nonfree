import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!uf", name = "T", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
	public static final int anInt4294 = 50;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "[I")
	public static final int[] anIntArray368 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "X", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1226 = Static81.method1507("Service unavailable)3");

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1225 = aClass24_1226;

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "Lclient!ua;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "[I")
	public static final int[] anIntArray369 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
	public static final int[] anIntArray370 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "Y", descriptor = "[I")
	public static final int[] anIntArray371 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "Z", descriptor = "[I")
	public static final int[] anIntArray372 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1227 = Static81.method1507("loc)3dat");

	@OriginalMember(owner = "client!uf", name = "cb", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array26 = new Class24[anInt4294];

	@OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
	public static int anInt4295 = 0;

	@OriginalMember(owner = "client!uf", name = "eb", descriptor = "[I")
	public static final int[] anIntArray373 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
	public static int anInt4296 = 0;

	@OriginalMember(owner = "client!uf", name = "gb", descriptor = "[I")
	public static final int[] anIntArray374 = new int[anInt4294];

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)Lclient!hf;")
	public static Class1_Sub2_Sub10 method3296(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static101.aClass86_35.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static37.aClass69_8.method2208(28, arg0);
		local10 = new Class1_Sub2_Sub10();
		if (local20 != null) {
			local10.method1414(new Class1_Sub7(local20));
		}
		Static101.aClass86_35.method2821(local10, (long) arg0);
		return local10;
	}
}
