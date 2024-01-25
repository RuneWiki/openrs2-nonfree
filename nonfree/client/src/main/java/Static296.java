import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_109 = new Class239(108, 10);

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
	public static int anInt5459 = 0;

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "S")
	public static short aShort113 = 256;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!uf;Lclient!dda;)V")
	public static void method4687(@OriginalArg(1) Class283 arg0, @OriginalArg(2) Class53 arg1) {
		Static349.aClass283_4 = arg0;
		Static438.aString162 = "";
		Static142.aClass53_43 = arg1;
		if (Static482.aString187.startsWith("win")) {
			Static438.aString162 = Static438.aString162 + "windows/";
		} else if (Static482.aString187.startsWith("linux")) {
			Static438.aString162 = Static438.aString162 + "linux/";
		} else if (Static482.aString187.startsWith("mac")) {
			Static438.aString162 = Static438.aString162 + "macos/";
		}
		if (Static482.anInt8574 == 2) {
			Static438.aString162 = Static438.aString162 + "msjava/";
		} else if (Static482.aString182.startsWith("amd64") || Static482.aString182.startsWith("x86_64")) {
			Static438.aString162 = Static438.aString162 + "x86_64/";
		} else if (Static482.aString182.startsWith("i386") || Static482.aString182.startsWith("i486") || Static482.aString182.startsWith("i586") || Static482.aString182.startsWith("x86")) {
			Static438.aString162 = Static438.aString162 + "x86/";
		} else if (Static482.aString182.startsWith("ppc")) {
			Static438.aString162 = Static438.aString162 + "ppc/";
		} else {
			Static438.aString162 = Static438.aString162 + "universal/";
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIIII)V")
	public static void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static47.method857(arg0);
		@Pc(10) int local10 = 0;
		@Pc(22) int local22 = arg0 - arg5;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(28) int local28 = arg0;
		@Pc(31) int local31 = -arg0;
		@Pc(33) int local33 = local22;
		@Pc(36) int local36 = -local22;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static130.anIntArrayArray89[arg3];
		@Pc(49) int local49 = arg4 - local22;
		@Pc(53) int local53 = local22 + arg4;
		Static403.method6377(arg2, local44, local49, arg4 - arg0);
		Static403.method6377(arg1, local44, local53, local49);
		Static403.method6377(arg2, local44, arg4 + arg0, local53);
		while (local28 > local10) {
			local40 += 2;
			local38 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				Static155.anIntArray340[local33] = local10;
				local33--;
				local36 -= local33 << 1;
			}
			local10++;
			@Pc(124) int[] local124;
			@Pc(130) int[] local130;
			@Pc(134) int local134;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (local31 >= 0) {
				local28--;
				if (local22 > local28) {
					local124 = Static130.anIntArrayArray89[local28 + arg3];
					local130 = Static130.anIntArrayArray89[arg3 - local28];
					local134 = Static155.anIntArray340[local28];
					local138 = arg4 + local10;
					local142 = arg4 - local10;
					local146 = local134 + arg4;
					local151 = arg4 - local134;
					Static403.method6377(arg2, local124, local151, local142);
					Static403.method6377(arg1, local124, local146, local151);
					Static403.method6377(arg2, local124, local138, local146);
					Static403.method6377(arg2, local130, local151, local142);
					Static403.method6377(arg1, local130, local146, local151);
					Static403.method6377(arg2, local130, local138, local146);
				} else {
					local124 = Static130.anIntArrayArray89[local28 + arg3];
					local130 = Static130.anIntArrayArray89[arg3 - local28];
					local134 = local10 + arg4;
					local138 = arg4 - local10;
					Static403.method6377(arg2, local124, local134, local138);
					Static403.method6377(arg2, local130, local134, local138);
				}
				local31 -= local28 << 1;
			}
			local124 = Static130.anIntArrayArray89[local10 + arg3];
			local130 = Static130.anIntArrayArray89[arg3 - local10];
			local134 = local28 + arg4;
			local138 = arg4 - local28;
			if (local22 > local10) {
				local142 = local10 > local33 ? Static155.anIntArray340[local10] : local33;
				local146 = local142 + arg4;
				local151 = arg4 - local142;
				Static403.method6377(arg2, local124, local151, local138);
				Static403.method6377(arg1, local124, local146, local151);
				Static403.method6377(arg2, local124, local134, local146);
				Static403.method6377(arg2, local130, local151, local138);
				Static403.method6377(arg1, local130, local146, local151);
				Static403.method6377(arg2, local130, local134, local146);
			} else {
				Static403.method6377(arg2, local124, local134, local138);
				Static403.method6377(arg2, local130, local134, local138);
			}
		}
	}
}
