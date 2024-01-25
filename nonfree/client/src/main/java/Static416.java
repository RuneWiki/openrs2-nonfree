import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_12 = new Class158(43, -1);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method1069(@OriginalArg(0) Class5 arg0) {
		for (@Pc(1) int local1 = Static392.anInt7211; local1 < Static399.anInt7385; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static126.anInt2626; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static108.anInt2385; local7++) {
					@Pc(16) Class290 local16 = Static279.aClass290ArrayArrayArray7[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class6_Sub2 local21 = local16.aClass6_Sub2_2;
						@Pc(24) Class6_Sub2 local24 = local16.aClass6_Sub2_3;
						if (local21 != null && local21.method7743()) {
							Static173.method3295(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7743()) {
								Static173.method3295(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7749(0, 0, local21, arg0, false, 0);
								local24.method7752();
							}
							local21.method7752();
						}
						for (@Pc(70) Class98 local70 = local16.aClass98_3; local70 != null; local70 = local70.aClass98_1) {
							@Pc(74) Class6_Sub1 local74 = local70.aClass6_Sub1_1;
							if (local74 != null && local74.method7743()) {
								Static173.method3295(arg0, local74, local1, local4, local7, local74.aShort122 + 1 - local74.aShort123, local74.aShort121 - local74.aShort120 + 1);
								local74.method7752();
							}
						}
						@Pc(111) Class6_Sub3 local111 = local16.aClass6_Sub3_2;
						if (local111 != null && local111.method7743()) {
							Static92.method1830(arg0, local111, local1, local4, local7);
							local111.method7752();
						}
					}
				}
			}
		}
	}
}
