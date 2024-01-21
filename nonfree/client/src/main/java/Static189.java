import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!uf", name = "fb", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_26;

	@OriginalMember(owner = "client!uf", name = "X", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array27 = new Class92[100];

	@OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1932 = Static187.method3089("lila:");

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array28 = new Class92[1000];

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
	public static int anInt4124 = 0;

	@OriginalMember(owner = "client!uf", name = "jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1934 = Static187.method3089("Members object");

	@OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1933 = aClass92_1934;

	@OriginalMember(owner = "client!uf", name = "db", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
	public static int anInt4125 = 0;

	@OriginalMember(owner = "client!uf", name = "kb", descriptor = "I")
	public static int anInt4128 = 0;

	@OriginalMember(owner = "client!uf", name = "nb", descriptor = "[I")
	public static final int[] anIntArray331 = new int[100];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method3110(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static161.method2533(local18) : local18;
		} else if (arg1 instanceof Class14) {
			@Pc(32) Class14 local32 = (Class14) arg1;
			return local32.method740();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
