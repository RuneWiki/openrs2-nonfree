import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_16;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static int anInt1736;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_390 = Static199.method3560(":duelstake:");

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
	public static int[] anIntArray293 = new int[2];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt1735 = 0;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_391 = Static199.method3560(":assistreq:");

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[104][104];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!gj;B)V")
	public static void method1343(@OriginalArg(0) Class41 arg0) {
		@Pc(5) Class62 local5 = null;
		try {
			@Pc(10) Class33 local10 = arg0.method1262("runescape");
			while (local10.anInt947 == 0) {
				Static156.method2805(1L);
			}
			if (local10.anInt947 == 1) {
				local5 = (Class62) local10.anObject2;
				@Pc(30) Class2_Sub23 local30 = Static129.method2340();
				local5.method2304(0, local30.anInt2703, local30.aByteArray41);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local5 != null) {
				local5.method2305();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method1344() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static165.aBooleanArray111[local10] = true;
		}
	}
}
