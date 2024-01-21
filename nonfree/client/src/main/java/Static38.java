import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "Lclient!cf;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	public static int anInt1095;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!v;")
	private static Class76 aClass76_463 = Static134.method2017("Loading title screen )2 ");

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_462 = aClass76_463;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!ua;")
	public static Class72 aClass72_16 = new Class72(20);

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
	public static int anInt1092 = 0;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "Lclient!v;")
	private static Class76 aClass76_467 = Static134.method2017("flash2:");

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_464 = aClass76_467;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_465 = Static134.method2017("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_466 = aClass76_467;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	public static int anInt1093 = 0;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!v;")
	public static Class76 aClass76_468 = Static134.method2017("mn");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)Lclient!fa;")
	public static Class4_Sub4_Sub4 method735(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub4 local10 = (Class4_Sub4_Sub4) Static75.aClass72_20.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static82.aClass17_26.method290(16, arg0);
		local10 = new Class4_Sub4_Sub4();
		if (local20 != null) {
			local10.method446(new Class4_Sub10(local20));
		}
		Static75.aClass72_20.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method736() {
		aByteArrayArray3 = null;
		aClass76_462 = null;
		aClass76_465 = null;
		aClass76_466 = null;
		aClass76_464 = null;
		aClass76_468 = null;
		aClass72_16 = null;
		aClass76_463 = null;
		aClass76_467 = null;
		aClass14_1 = null;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method737() {
		Static75.aClass72_20.method1786();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
	public static boolean method738(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)I")
	public static int method739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static62.aByteArrayArrayArray4[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static62.aByteArrayArrayArray4[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
