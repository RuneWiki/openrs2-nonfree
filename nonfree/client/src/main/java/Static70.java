import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
	public static int[] anIntArray136 = new int[5];

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
	public static boolean aBoolean83 = true;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!ul;")
	public static Class172 aClass172_12 = new Class172(100);

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!cg;Z)V")
	public static void method1194(@OriginalArg(0) Class22 arg0) {
		Static174.aClass22_62 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V")
	public static void method1195(@OriginalArg(0) boolean arg0) {
		Static132.aBoolean168 = arg0;
		Static78.aBoolean93 = !Static162.method2605();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	public static int method1196(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return ~local43 & arg0;
	}
}
