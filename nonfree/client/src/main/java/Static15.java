import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_104 = Static120.method1824("Take");

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_103 = aClass80_104;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt327 = 0;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
	public static final int[] anIntArray55 = new int[25];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!bc;B)Z")
	public static boolean method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2) {
		@Pc(9) byte[] local9 = arg2.method60(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static71.method1065(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
	public static int method246(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void method247() {
		Static169.aClass5_15.method146();
	}
}
