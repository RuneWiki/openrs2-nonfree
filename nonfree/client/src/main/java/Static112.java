import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "Z")
	public static boolean aBoolean97;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lclient!qf;")
	public static Class77 aClass77_12;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
	public static int anInt2527;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_996 = Static120.method1824("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_997 = Static120.method1824("null");

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
	public static final int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_998 = Static120.method1824("::rect_debug");

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
	public static int anInt2525 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)Lclient!ph;")
	public static Class3_Sub20 method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class3_Sub20 local3 = new Class3_Sub20();
		local3.anInt2996 = arg1;
		local3.anInt2999 = arg0;
		Static28.aClass54_4.method1494((long) arg2, local3);
		Static69.method1031(arg1);
		Static196.method2820(arg1);
		@Pc(34) Class77 local34 = Static92.method2208(arg2);
		if (local34 != null) {
			Static186.method3014(local34);
		}
		if (Static83.aClass77_4 != null) {
			Static186.method3014(Static83.aClass77_4);
			Static83.aClass77_4 = null;
		}
		Static148.aBoolean134 = false;
		Static173.anInt3892 = 0;
		Static89.method1311(Static191.anInt4389, Static58.anInt1293, Static46.anInt1056, Static27.anInt4466);
		if (Static121.anInt2651 != -1) {
			Static29.method491(Static121.anInt2651, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I")
	public static int method1743(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
