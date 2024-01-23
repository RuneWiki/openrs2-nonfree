import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Lclient!pk;")
	public static Class132 aClass132_3;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!gd;")
	public static Class61 aClass61_1 = new Class61(16);

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString5 = "flash1:";

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString6 = null;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public static int anInt46 = 0;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Allocated memory";

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lclient!nn;")
	public static Class13_Sub1 method34() {
		Static49.anInt1081 = 0;
		return Static35.method557();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = Static96.anIntArray135[Static262.method3966(arg2, arg1)];
		if (arg0 > 0) {
			@Pc(29) int local29 = Static96.anInterface4_1.method1258(arg0 & 0xFFFF);
			@Pc(45) int local45;
			@Pc(66) int local66;
			if (local29 != 0) {
				if (arg1 < 0) {
					local45 = 0;
				} else if (arg1 <= 127) {
					local45 = arg1 * 131586;
				} else {
					local45 = 16777215;
				}
				if (local29 == 256) {
					local17 = local45;
				} else {
					local66 = 256 - local29;
					local17 = ((local17 & 0xFF00) * local66 + local29 * (local45 & 0xFF00) & 0xFF0000) + (local66 * (local17 & 0xFF00FF) + (local45 & 0xFF00FF) * local29 & 0xFF00FF00) >> 8;
				}
			}
			local45 = Static96.anInterface4_1.method1261(arg0 & 0xFFFF);
			if (local45 != 0) {
				local45 += 256;
				local66 = (local17 >> 8 & 0xFF) * local45;
				@Pc(126) int local126 = (local17 >> 16 & 0xFF) * local45;
				if (local66 > 65535) {
					local66 = 65535;
				}
				if (local126 > 65535) {
					local126 = 65535;
				}
				@Pc(146) int local146 = (local17 & 0xFF) * local45;
				if (local146 > 65535) {
					local146 = 65535;
				}
				local17 = (local66 & 0xFF00) + (local126 << 8 & 0xFF0048) + (local146 >> 8);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method39() {
		Static243.aClass61_47.method1381(5);
	}
}
