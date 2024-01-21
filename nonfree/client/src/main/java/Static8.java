import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!tg;")
	private static Class81 aClass81_85 = Static120.method2057(" from your ignore list first)3");

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_81 = aClass81_85;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_82 = Static120.method2057("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_83 = Static120.method2057("scrollen:");

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_84 = Static120.method2057("<br>(X");

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_86 = Static120.method2057("<col=ffff00>*V");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!de;I)V")
	public static void method127(@OriginalArg(0) Class1_Sub2_Sub1_Sub3 arg0) {
		arg0.anInt3062 = 0;
		if (arg0.anInt3016 == 0) {
			arg0.anInt3049 = 1024;
		}
		@Pc(28) int local28 = arg0.anInt3021 * 128 + arg0.anInt3051 * 64;
		@Pc(34) int local34 = arg0.anInt3029 - Static142.anInt3104;
		arg0.anInt3040 += (local28 - arg0.anInt3040) / local34;
		@Pc(56) int local56 = arg0.anInt3051 * 64 + arg0.anInt3063 * 128;
		if (arg0.anInt3016 == 1) {
			arg0.anInt3049 = 1536;
		}
		if (arg0.anInt3016 == 2) {
			arg0.anInt3049 = 0;
		}
		if (arg0.anInt3016 == 3) {
			arg0.anInt3049 = 512;
		}
		arg0.anInt3026 += (local56 - arg0.anInt3026) / local34;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method128() {
		aClass81_84 = null;
		aClass81_86 = null;
		aClass81_81 = null;
		aClass81_82 = null;
		aClass81_85 = null;
		aClass81_83 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(JI)V")
	public static void method129(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static9.anInt178; local18++) {
			if (arg0 == Static90.aLongArray4[local18]) {
				Static9.anInt178--;
				for (@Pc(36) int local36 = local18; local36 < Static9.anInt178; local36++) {
					Static90.aLongArray4[local36] = Static90.aLongArray4[local36 + 1];
					Static105.aClass81Array8[local36] = Static105.aClass81Array8[local36 + 1];
				}
				Static140.anInt3066 = Static121.anInt2701;
				Static104.aClass1_Sub8_Sub1_2.method366(77);
				Static104.aClass1_Sub8_Sub1_2.method355(arg0);
				return;
			}
		}
	}
}
