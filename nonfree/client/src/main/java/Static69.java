import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_512 = Static38.method685("");

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt1736 = 0;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ai;")
	private static Class6 aClass6_513 = Static38.method685("Walk here");

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!ai;")
	private static Class6 aClass6_514 = Static38.method685(" more options");

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_515 = aClass6_513;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_516 = aClass6_514;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method1102() {
		aClass6_512 = null;
		aClass6_515 = null;
		aClass6_513 = null;
		aClass6_516 = null;
		aClass6_514 = null;
		anIntArray117 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1103(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static89.anInt2259 > 0) {
			local16 = Static105.aByteArrayArray5[--Static89.anInt2259];
			Static105.aByteArrayArray5[Static89.anInt2259] = null;
			return local16;
		} else if (arg0 == 5000 && Static61.anInt1525 > 0) {
			local16 = Static23.aByteArrayArray2[--Static61.anInt1525];
			Static23.aByteArrayArray2[Static61.anInt1525] = null;
			return local16;
		} else if (arg0 == 30000 && Static8.anInt158 > 0) {
			local16 = Static41.aByteArrayArray3[--Static8.anInt158];
			Static41.aByteArrayArray3[Static8.anInt158] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!c;II)Lclient!lf;")
	public static Class2_Sub15 method1104(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1586(arg1);
		return local4 == null ? null : new Class2_Sub15(local4);
	}
}
