import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	public static int anInt2622;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[I")
	public static int[] anIntArray396;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
	public static int[] anIntArray395 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!af;")
	private static Class5 aClass5_1243 = Static45.method1937("Loaded update list");

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1244 = aClass5_1243;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_1245 = Static45.method1937("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!re", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_1246 = aClass5_1245;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_1247 = Static45.method1937("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method1825() {
		aClass5_1244 = null;
		aClass5_1243 = null;
		anIntArray395 = null;
		aClass5_1245 = null;
		anIntArray396 = null;
		aClass5_1246 = null;
		aClass5_1247 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1826(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub20 local4 = new Class1_Sub20(arg0);
		@Pc(12) int local12 = local4.method2053();
		@Pc(21) int local21 = local4.method2094();
		if (local21 < 0 || Static52.anInt1263 != 0 && Static52.anInt1263 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(86) byte[] local86 = new byte[local21];
			local4.method2077(local21, local86);
			return local86;
		} else {
			@Pc(45) int local45 = local4.method2094();
			if (local45 < 0 || Static52.anInt1263 != 0 && Static52.anInt1263 < local45) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local45];
			if (local12 == 1) {
				Static110.method1899(local62, local45, arg0, local21);
			} else {
				Static28.aClass25_1.method781(local62, local4);
			}
			return local62;
		}
	}
}
