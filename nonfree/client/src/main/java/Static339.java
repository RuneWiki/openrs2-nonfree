import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mha", name = "M", descriptor = "I")
	private static int anInt2259;

	@OriginalMember(owner = "client!mha", name = "N", descriptor = "I")
	private static int anInt2260;

	@OriginalMember(owner = "client!mha", name = "O", descriptor = "I")
	private static int anInt2261;

	@OriginalMember(owner = "client!mha", name = "P", descriptor = "I")
	private static int anInt2262;

	@OriginalMember(owner = "client!mha", name = "Q", descriptor = "Z")
	private static boolean aBoolean156;

	@OriginalMember(owner = "client!mha", name = "R", descriptor = "Z")
	private static boolean aBoolean157;

	@OriginalMember(owner = "client!mha", name = "S", descriptor = "Z")
	private static boolean aBoolean158;

	@OriginalMember(owner = "client!mha", name = "T", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!mha", name = "U", descriptor = "Z")
	private static boolean aBoolean160;

	@OriginalMember(owner = "client!mha", name = "V", descriptor = "Z")
	private static boolean aBoolean161;

	@OriginalMember(owner = "client!mha", name = "W", descriptor = "Z")
	private static boolean aBoolean162;

	@OriginalMember(owner = "client!mha", name = "X", descriptor = "I")
	private static int anInt2263;

	@OriginalMember(owner = "client!mha", name = "Y", descriptor = "Z")
	private static boolean aBoolean163;

	@OriginalMember(owner = "client!mha", name = "Z", descriptor = "I")
	private static int anInt2264;

	@OriginalMember(owner = "client!mha", name = "ab", descriptor = "Z")
	private static boolean aBoolean164;

	@OriginalMember(owner = "client!mha", name = "bb", descriptor = "I")
	private static int anInt2265;

	@OriginalMember(owner = "client!mha", name = "cb", descriptor = "Z")
	private static boolean aBoolean165;

	@OriginalMember(owner = "client!mha", name = "db", descriptor = "I")
	private static int anInt2266;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)V")
	public static void method1902(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class319[] local3 = Static447.aClass319Array3;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class319 local11 = local3[local5];
			if (local11 != null && local11.anInt9116 == 2) {
				Static10.method133(arg3 >> 1, arg1 >> 1, local11.anInt9122, local11.anInt9125 * 2, local11.anInt9121, local11.anInt9115);
				if (Static390.anIntArray410[0] > -1 && Static435.anInt8192 % 20 < 10) {
					@Pc(56) Class21 local56 = Static152.aClass21Array7[local11.anInt9123];
					@Pc(64) int local64 = Static390.anIntArray410[0] + arg0 - 12;
					@Pc(73) int local73 = arg2 + Static390.anIntArray410[1] - 28;
					local56.method5796(local64, local73);
					Static460.method6945(local73, local56.method5785() + local73, local64, local64 + local56.method5779());
				}
			}
		}
	}
}
