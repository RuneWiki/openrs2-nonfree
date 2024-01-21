import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_80;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_81;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public static int anInt1930 = 500;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt1931 = -1;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_3 = new Class67(5);

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1179 = Static118.method2249("blinken1:");

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static71.anInt1744 <= arg3 && arg3 <= Static23.anInt685) {
			@Pc(15) int local15 = Static100.method1896(Static133.anInt3309, arg0, Static206.anInt4385);
			@Pc(21) int local21 = Static100.method1896(Static133.anInt3309, arg1, Static206.anInt4385);
			Static50.method918(local21, arg3, arg2, local15);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([SI[Lclient!oc;)V")
	public static void method1390(@OriginalArg(0) short[] arg0, @OriginalArg(2) Class65[] arg1) {
		Static40.method693(arg0, arg1.length - 1, arg1, 0);
	}
}
