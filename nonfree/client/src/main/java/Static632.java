import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
	public static int anInt10466;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public static int anInt10468;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[100];

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
	public static void method8578() {
		for (@Pc(1) int local1 = Static403.anInt10576; local1 < Static247.anInt4367; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static133.anInt2551; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static155.anInt2874; local7++) {
					@Pc(16) Class368 local16 = Static254.aClass368ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class34_Sub1_Sub5 local21 = local16.aClass34_Sub1_Sub5_2;
						@Pc(24) Class34_Sub1_Sub5 local24 = local16.aClass34_Sub1_Sub5_1;
						if (local21 != null && local21.method7841()) {
							Static362.method5241(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7841()) {
								Static362.method5241(local24, local1, local4, local7, 1, 1);
								local24.method7842(0, local21, 0, 0, Static50.aClass95_1, false);
								local24.method7848();
							}
							local21.method7848();
						}
						for (@Pc(68) Class205 local68 = local16.aClass205_4; local68 != null; local68 = local68.aClass205_3) {
							@Pc(72) Class34_Sub1_Sub1 local72 = local68.aClass34_Sub1_Sub1_1;
							if (local72 != null && local72.method7841()) {
								Static362.method5241(local72, local1, local4, local7, local72.aShort97 + 1 - local72.aShort98, local72.aShort96 - local72.aShort99 + 1);
								local72.method7848();
							}
						}
						@Pc(108) Class34_Sub1_Sub2 local108 = local16.aClass34_Sub1_Sub2_1;
						if (local108 != null && local108.method7841()) {
							Static244.method3705(local108, local1, local4, local7);
							local108.method7848();
						}
					}
				}
			}
		}
	}
}
