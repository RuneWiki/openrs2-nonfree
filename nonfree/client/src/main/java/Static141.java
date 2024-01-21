import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!s", name = "X", descriptor = "I")
	public static int anInt3613;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1202 = Static170.method3101("Checking for updates )2 ");

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1203 = aClass28_1202;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	public static volatile int anInt3621 = 0;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "[I")
	public static int[] anIntArray608 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
	public static int anInt3626 = 10;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method2764() {
		aClass28_1202 = null;
		anIntArray608 = null;
		aClass28_1203 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BZ)V")
	public static void method2765(@OriginalArg(1) boolean arg0) {
		Static110.method2233();
		Static95.anInt2630++;
		if (Static95.anInt2630 < 50 && !arg0) {
			return;
		}
		Static95.anInt2630 = 0;
		if (Static161.aBoolean186 || Static52.aClass38_1 == null) {
			return;
		}
		Static51.aClass3_Sub8_Sub1_2.method1559(219);
		try {
			Static52.aClass38_1.method1633(Static51.aClass3_Sub8_Sub1_2.anInt1948, Static51.aClass3_Sub8_Sub1_2.aByteArray19);
			Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
		} catch (@Pc(40) IOException local40) {
			Static161.aBoolean186 = true;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
	public static void method2766(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static51.aClass3_Sub8_Sub1_2.method1559(140);
			Static51.aClass3_Sub8_Sub1_2.method1541(arg0);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIIII)V")
	public static void method2767(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class89 local13 = local7.aClass89_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4281;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class27 local58 = local7.aClass27_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1103;
		@Pc(67) int local67 = local58.anInt1102;
		@Pc(70) int local70 = local58.anInt1101;
		@Pc(73) int local73 = local58.anInt1100;
		@Pc(77) int[] local77 = Static135.anIntArrayArray25[local23];
		@Pc(81) int[] local81 = Static65.anIntArrayArray20[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
