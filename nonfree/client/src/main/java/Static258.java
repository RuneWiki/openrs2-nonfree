import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
	public static int anInt1131;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "[Lclient!ui;")
	public static Class36[] aClass36Array2;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
	private static int anInt1135;

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
	private static int anInt1136;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_42 = new Class21(64);

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
	public static int method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!qi", name = "providesignlink", descriptor = "(Lclient!gt;)V")
	private static void method1060(@OriginalArg(0) Class75 arg0) {
		Static227.aClass75_5 = arg0;
		Static33.aClass75_1 = arg0;
	}
}
