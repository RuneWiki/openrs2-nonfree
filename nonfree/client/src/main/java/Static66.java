import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray30;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static final int anInt8593 = 50;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "[I")
	public static final int[] anIntArray621 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray160 = new String[anInt8593];

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public static final int anInt8594 = Static233.method3626(1600);

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "[I")
	public static final int[] anIntArray622 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
	public static final int[] anIntArray623 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
	public static final int[] anIntArray624 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
	public static final int[] anIntArray625 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "[I")
	public static final int[] anIntArray626 = new int[anInt8593];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!r;)V")
	public static void method7180(@OriginalArg(1) Class100 arg0) {
		arg0.da(0, 0, Static140.anInt2937, 350);
		arg0.J(0, 0, Static140.anInt2937, 350, Static90.anInt1946 << 24 | 0x332277, 1);
		@Pc(35) int local35 = 350 / Static539.anInt8821;
		@Pc(46) int local46;
		if (Static583.anInt9519 > 0) {
			local46 = 346 - Static539.anInt8821 - 4;
			@Pc(56) int local56 = local35 * local46 / (local35 + Static583.anInt9519 - 1);
			@Pc(58) int local58 = 4;
			if (Static583.anInt9519 > 1) {
				local58 = (local46 - local56) * (-Static70.anInt1594 + Static583.anInt9519 + -1) / (Static583.anInt9519 - 1) + 4;
			}
			arg0.J(Static140.anInt2937 - 16, local58, 12, local56, Static90.anInt1946 << 24 | 0x332277, 2);
			for (@Pc(95) int local95 = Static70.anInt1594; Static70.anInt1594 + local35 > local95 && local95 < Static583.anInt9519; local95++) {
				@Pc(104) String[] local104 = Static568.method7710(Static77.aStringArray189[local95], '\b');
				@Pc(111) int local111 = (Static140.anInt2937 - 24) / local104.length;
				for (@Pc(113) int local113 = 0; local113 < local104.length; local113++) {
					@Pc(122) int local122 = local111 * local113 + 8;
					arg0.da(local122, 0, local111 + local122 - 8, 350);
					Static412.aClass29_2.method7111(-1, local122, Static341.method5174(local104[local113]), -16777216, 350 - Static539.anInt8821 * (local95 - Static70.anInt1594) - Static124.anInt2403 - Static355.aClass294_8.anInt8124 - 2);
				}
			}
		}
		Static45.aClass29_3.method7117(Static140.anInt2937 - 25, 330, "Build: 621", -1, -16777216);
		arg0.da(0, 0, Static140.anInt2937, 350);
		arg0.method6232(350 - Static124.anInt2403, 0, Static140.anInt2937, -1);
		Static419.aClass29_13.method7111(-1, 10, "--> " + Static341.method5174(Static163.aString22), -16777216, 350 - Static83.aClass294_6.anInt8124 - 1);
		if (!Static523.aBoolean664) {
			return;
		}
		local46 = -1;
		if (Static412.anInt575 % 30 > 15) {
			local46 = 16777215;
		}
		arg0.method6189(Static83.aClass294_6.method6718("--> " + Static341.method5174(Static163.aString22).substring(0, Static428.anInt7331)) + 10, local46, 12, 350 - Static83.aClass294_6.anInt8124 - 11);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method7184(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static145.method2414(-1, arg0, arg1, -1);
	}
}
