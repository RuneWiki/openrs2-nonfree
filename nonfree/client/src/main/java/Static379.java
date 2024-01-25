import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public static int anInt6764 = 999999;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!mc;)Lclient!bp;")
	public static Class10_Sub1 method5643(@OriginalArg(1) Class5_Sub41 arg0) {
		@Pc(7) Class10 local7 = Static223.method3495(arg0);
		@Pc(11) int local11 = arg0.method7804();
		@Pc(15) int local15 = arg0.method7804();
		@Pc(27) int local27 = arg0.method7860();
		return new Class10_Sub1(local7.aClass275_17, local7.aClass81_17, local7.anInt10597, local7.anInt10602, local7.anInt10594, local7.anInt10595, local7.anInt10598, local7.anInt10601, local7.anInt10596, local11, local15, local27);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
	public static void method5644() {
		for (@Pc(1) int local1 = Static128.anInt2605; local1 < Static219.anInt4088; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static216.anInt4042; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static233.anInt4238; local7++) {
					@Pc(16) Class226 local16 = Static635.aClass226ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class28_Sub1_Sub5 local21 = local16.aClass28_Sub1_Sub5_2;
						@Pc(24) Class28_Sub1_Sub5 local24 = local16.aClass28_Sub1_Sub5_1;
						if (local21 != null && local21.method8973()) {
							Static125.method2267(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8973()) {
								Static125.method2267(local24, local1, local4, local7, 1, 1);
								local24.method8969(false, 0, local21, Static10.aClass65_1, 0, 0);
								local24.method8960();
							}
							local21.method8960();
						}
						for (@Pc(68) Class41 local68 = local16.aClass41_3; local68 != null; local68 = local68.aClass41_2) {
							@Pc(72) Class28_Sub1_Sub4 local72 = local68.aClass28_Sub1_Sub4_1;
							if (local72 != null && local72.method8973()) {
								Static125.method2267(local72, local1, local4, local7, local72.aShort122 + 1 - local72.aShort124, local72.aShort123 - local72.aShort121 + 1);
								local72.method8960();
							}
						}
						@Pc(108) Class28_Sub1_Sub2 local108 = local16.aClass28_Sub1_Sub2_1;
						if (local108 != null && local108.method8973()) {
							Static495.method7100(local108, local1, local4, local7);
							local108.method8960();
						}
					}
				}
			}
		}
	}
}
