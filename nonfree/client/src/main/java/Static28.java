import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!cg;")
	public static Class22 aClass22_13;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
	public static int[] anIntArray81 = new int[14];

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static int anInt611 = -1;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString24 = "M";

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	public static void method588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg0 != Static68.anInt1753) {
			Static94.anIntArray163 = new int[arg0];
			for (local10 = 0; local10 < arg0; local10++) {
				Static94.anIntArray163[local10] = (local10 << 12) / arg0;
			}
			Static21.anInt451 = arg0 * 32;
			Static295.anInt5711 = arg0 - 1;
			Static68.anInt1753 = arg0;
		}
		if (Static33.anInt660 == arg1) {
			return;
		}
		if (arg1 == Static68.anInt1753) {
			Static10.anIntArray7 = Static94.anIntArray163;
		} else {
			Static10.anIntArray7 = new int[arg1];
			for (local10 = 0; local10 < arg1; local10++) {
				Static10.anIntArray7[local10] = (local10 << 12) / arg1;
			}
		}
		Static33.anInt660 = arg1;
		Static19.anInt437 = arg1 - 1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([SI)[S")
	public static short[] method590(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static317.method3196(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
