import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt8062;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt8063;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[Lclient!qd;")
	public static Class265[] aClass265Array2;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!tda;")
	public static final Class315 aClass315_11 = new Class315(0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method6643() {
		for (@Pc(1) int local1 = Static526.anInt8653; local1 < Static89.anInt8689; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static496.anInt8369; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static357.anInt6390; local7++) {
					@Pc(16) Class346 local16 = Static389.aClass346ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class6_Sub1_Sub3 local21 = local16.aClass6_Sub1_Sub3_2;
						@Pc(24) Class6_Sub1_Sub3 local24 = local16.aClass6_Sub1_Sub3_1;
						if (local21 != null && local21.method7330()) {
							Static589.method7960(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7330()) {
								Static589.method7960(local24, local1, local4, local7, 1, 1);
								local24.method7325(false, 0, Static356.aClass100_8, local21, 0, 0);
								local24.method7322();
							}
							local21.method7322();
						}
						for (@Pc(68) Class153 local68 = local16.aClass153_3; local68 != null; local68 = local68.aClass153_1) {
							@Pc(72) Class6_Sub1_Sub1 local72 = local68.aClass6_Sub1_Sub1_1;
							if (local72 != null && local72.method7330()) {
								Static589.method7960(local72, local1, local4, local7, local72.aShort86 + 1 - local72.aShort85, local72.aShort84 - local72.aShort83 + 1);
								local72.method7322();
							}
						}
						@Pc(108) Class6_Sub1_Sub2 local108 = local16.aClass6_Sub1_Sub2_1;
						if (local108 != null && local108.method7330()) {
							Static404.method5909(local108, local1, local4, local7);
							local108.method7322();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Z")
	public static boolean method6645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static508.method7043(arg1, arg0) || Static379.method5606(arg0, arg1);
	}
}
