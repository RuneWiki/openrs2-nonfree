import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_42 = new Class254(29, 8);

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V")
	public static void method1759() {
		Static417.anInt7328 = 0;
		Static136.anInt2492 = -1;
		Static326.anInt5983 = -1;
		Static57.anInt866 = -1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1760(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static459.method1552(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!hh;II)Lclient!ds;")
	public static Class62 method1761(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2346(arg1);
		return local13 == null ? null : new Class62(local13);
	}
}
