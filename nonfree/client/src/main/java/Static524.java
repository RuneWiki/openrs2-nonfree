import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public static int anInt8993 = -1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public static void method7353(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg0, 7);
		local8.method770();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLjava/lang/String;ILjava/lang/String;ZI)V")
	public static void method7354(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5) {
		Static543.aClass251_150.anInt6998 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg0 != -1) {
			@Pc(26) Class343 local26 = Static112.aClass307_1.method6811(arg0);
			if (local26 == null || arg5 != local26.method7744()) {
				return;
			}
			if (local26.method7744()) {
				local18 = local26.aString118;
			} else {
				local16 = local26.anInt9461;
			}
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static295.aClass256_2.anInt7112; local62++) {
			@Pc(69) Class110 local69 = Static295.aClass256_2.method5924(local62);
			if ((!arg1 || local69.aBoolean179) && local69.anInt2673 == -1 && local69.anInt2617 == -1 && local69.anInt2627 == 0 && local69.aString41.toLowerCase().indexOf(local11) != -1) {
				if (arg0 != -1) {
					if (arg5) {
						if (!arg4.equals(local69.method2198(arg0, local18))) {
							continue;
						}
					} else if (local69.method2201(arg0, local16) != arg3) {
						continue;
					}
				}
				if (local60 >= 250) {
					Static466.aShortArray135 = null;
					Static7.anInt146 = -1;
					return;
				}
				if (local14.length <= local60) {
					@Pc(145) short[] local145 = new short[local14.length * 2];
					for (@Pc(147) int local147 = 0; local147 < local60; local147++) {
						local145[local147] = local14[local147];
					}
					local14 = local145;
				}
				local14[local60++] = (short) local62;
			}
		}
		Static527.anInt9003 = 0;
		Static7.anInt146 = local60;
		Static466.aShortArray135 = local14;
		@Pc(189) String[] local189 = new String[Static7.anInt146];
		for (@Pc(191) int local191 = 0; local191 < Static7.anInt146; local191++) {
			local189[local191] = Static295.aClass256_2.method5924(local14[local191]).aString41;
		}
		Static422.method6199(Static466.aShortArray135, local189);
		Static543.aClass251_150.method5833();
		Static543.aClass251_150.anInt6998 = 2;
	}
}
