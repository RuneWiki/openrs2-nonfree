import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "Lclient!f;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "Lclient!ak;")
	public static Class7 aClass7_12;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	public static int anInt139 = 0;

	@OriginalMember(owner = "client!ab", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString2 = "Loaded update list";

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
	public static volatile int anInt141 = 0;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString3 = "Connecting to update server";

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)V")
	public static void method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 * Static259.anInt5233 >> 8;
		if (arg1 == -1 && !Static295.aBoolean448) {
			Static120.method1889();
		} else if (arg1 != -1 && (Static4.anInt146 != arg1 || !Static138.method2189()) && local16 != 0 && !Static295.aBoolean448) {
			Static185.method2790(local16, Static67.aClass7_68, arg1);
		}
		Static4.anInt146 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method105(@OriginalArg(0) Class99 arg0) {
		Static235.aClass99_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method106(@OriginalArg(1) Class7 arg0) {
		Static4.aClass7_13 = arg0;
		Static292.anInt5804 = Static4.aClass7_13.method265(16);
	}
}
