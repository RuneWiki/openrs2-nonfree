import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sfa", name = "cb", descriptor = "I")
	public static int anInt8691;

	@OriginalMember(owner = "client!sfa", name = "ab", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZZLjava/lang/String;IILjava/lang/String;I)V")
	public static void method7502(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static509.aClass343_220.anInt9505 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(30) Class108 local30 = Static220.aClass214_2.method5419(arg5);
			if (local30 == null || local30.method2736() != arg1) {
				return;
			}
			if (local30.method2736()) {
				local18 = local30.aString23;
			} else {
				local16 = local30.anInt3158;
			}
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static298.aClass132_1.anInt3568; local62++) {
			@Pc(69) Class259 local69 = Static298.aClass132_1.method3062(local62);
			if ((!arg0 || local69.aBoolean526) && local69.anInt7377 == -1 && local69.anInt7334 == -1 && local69.anInt7369 == 0 && local69.aString63.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg1) {
						if (!arg4.equals(local69.method6460(arg5, local18))) {
							continue;
						}
					} else if (local69.method6450(local16, arg5) != arg3) {
						continue;
					}
				}
				if (local60 >= 250) {
					Static306.aShortArray49 = null;
					Static439.anInt9345 = -1;
					return;
				}
				if (local60 >= local14.length) {
					@Pc(149) short[] local149 = new short[local14.length * 2];
					for (@Pc(151) int local151 = 0; local151 < local60; local151++) {
						local149[local151] = local14[local151];
					}
					local14 = local149;
				}
				local14[local60++] = (short) local62;
			}
		}
		Static439.anInt9345 = local60;
		Static306.aShortArray49 = local14;
		Static497.anInt5760 = 0;
		@Pc(189) String[] local189 = new String[Static439.anInt9345];
		for (@Pc(191) int local191 = 0; local191 < Static439.anInt9345; local191++) {
			local189[local191] = Static298.aClass132_1.method3062(local14[local191]).aString63;
		}
		Static141.method2406(Static306.aShortArray49, local189);
		Static509.aClass343_220.method8154();
		Static509.aClass343_220.anInt9505 = 2;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V")
	public static void method7503() {
		Static572.method8040(Static603.anInt9778);
	}
}
