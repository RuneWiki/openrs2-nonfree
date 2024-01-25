import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public static int anInt6505;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_88;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_120 = new Class73(4, 4);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!xa;BIIILclient!fa;Lclient!rr;)V")
	public static void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) Class292 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Static346.anInt6215 == 4) {
			local21 = (int) Static428.aFloat160 & 0x3FFF;
		} else {
			local21 = (int) Static428.aFloat160 + Static185.anInt3860 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg6.anInt7963 / 2, arg6.anInt7912 / 2) + 10;
		@Pc(48) int local48 = arg0 * arg0 + arg2 * arg2;
		if (local40 * local40 < local48) {
			return;
		}
		@Pc(58) int local58 = Class6_Sub2_Sub7.anIntArray178[local21];
		@Pc(62) int local62 = Class6_Sub2_Sub7.anIntArray177[local21];
		if (Static346.anInt6215 != 4) {
			local62 = local62 * 256 / (Static291.anInt5446 + 256);
			local58 = local58 * 256 / (Static291.anInt5446 + 256);
		}
		@Pc(92) int local92 = local58 * arg2 + arg0 * local62 >> 14;
		@Pc(103) int local103 = arg2 * local62 - arg0 * local58 >> 14;
		arg1.method7662(arg4 + arg6.anInt7963 / 2 + local92 - arg1.AA() / 2, -local103 + arg6.anInt7912 / 2 + arg3 + -(arg1.a() / 2), arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method5526() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static567.aBooleanArray41[local7] = false;
		}
		Static157.anInt3353 = -1;
		Static91.anInt1774 = -1;
		Static397.anInt6953 = 0;
		Static346.anInt6215 = 1;
		Static340.anInt6138 = 0;
	}
}
