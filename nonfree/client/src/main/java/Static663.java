import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "Z")
	private static boolean aBoolean116;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	private static int anInt1296;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	private static int anInt1297;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "Z")
	private static boolean aBoolean117;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
	private static int anInt1298;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Z")
	private static boolean aBoolean118;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	private static int anInt1299;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	private static int anInt1300;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
	private static boolean aBoolean119;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Z")
	private static boolean aBoolean120;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private static int anInt1301;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
	private static int anInt1302;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	private static int anInt1303;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIII)V")
	public static void method1227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static569.anInt9543 = arg0;
		Static521.anInt8819 = arg1;
		Static635.anInt10332 = arg3;
		Static218.anInt3558 = arg4;
		Static393.anInt7347 = arg2;
		if (Static635.anInt10332 >= 100) {
			@Pc(24) int local24 = Static569.anInt9543 * 512 + 256;
			@Pc(30) int local30 = Static218.anInt3558 * 512 + 256;
			@Pc(39) int local39 = Static380.method5559(local24, Static240.anInt3974, local30, 0) - Static521.anInt8819;
			@Pc(44) int local44 = local24 - Static532.anInt9189;
			@Pc(49) int local49 = local39 - Static132.anInt2186;
			@Pc(54) int local54 = local30 - Static489.anInt8202;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local54 * local54 + local44 * local44));
			Static649.anInt5976 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static159.anInt2475 = (int) (-2607.5945876176133D * Math.atan2((double) local44, (double) local54)) & 0x3FFF;
			if (Static649.anInt5976 < 1024) {
				Static649.anInt5976 = 1024;
			}
			Static313.anInt5549 = 0;
			if (Static649.anInt5976 > 3072) {
				Static649.anInt5976 = 3072;
			}
		}
		Static272.anInt4763 = -1;
		Static651.anInt10529 = -1;
		Static79.anInt1216 = 2;
	}
}
