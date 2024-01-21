import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "Lclient!vb;")
	public static Class82 aClass82_7;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_159 = Static120.method2057("Stufe)2");

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
	public static int anInt476 = -1;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Lclient!tg;")
	public static Class81 aClass81_160 = Static120.method2057("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "[I")
	public static int[] anIntArray19 = new int[128];

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "Lclient!h;")
	public static Class30 aClass30_4 = new Class30();

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
	public static void method388() {
		aClass81_159 = null;
		aClass30_4 = null;
		anIntArray19 = null;
		aClass81_160 = null;
		aClass82_7 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)Z")
	public static boolean method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static112.method1974(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static112.method1963(local10 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local14 + 1) && Static112.method1963(local10 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static112.method1963(local10 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static112.method1963(local10 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
