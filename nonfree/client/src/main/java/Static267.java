import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[I")
	public static final int[] anIntArray240 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZZII)V")
	public static void method4303(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static108.aClass207_25.anInt5242 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(26) Class16 local26 = Static302.aClass291_1.method6836(arg5);
			if (local26 == null || arg3 != local26.method234()) {
				return;
			}
			if (local26.method234()) {
				local18 = local26.aString1;
			} else {
				local16 = local26.anInt256;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static643.aClass275_2.anInt7494; local55++) {
			@Pc(62) Class255 local62 = Static643.aClass275_2.method6641(local55);
			if ((!arg2 || local62.aBoolean464) && local62.anInt6558 == -1 && local62.anInt6526 == -1 && local62.anInt6545 == 0 && local62.aString73.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg3) {
						if (!arg1.equals(local62.method5849(arg5, local18))) {
							continue;
						}
					} else if (local62.method5854(arg5, local16) != arg4) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static521.anInt8974 = -1;
					Static385.aShortArray98 = null;
					return;
				}
				if (local53 >= local14.length) {
					@Pc(138) short[] local138 = new short[local14.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local53; local140++) {
						local138[local140] = local14[local140];
					}
					local14 = local138;
				}
				local14[local53++] = (short) local55;
			}
		}
		Static316.anInt5386 = 0;
		Static521.anInt8974 = local53;
		Static385.aShortArray98 = local14;
		@Pc(178) String[] local178 = new String[Static521.anInt8974];
		for (@Pc(180) int local180 = 0; local180 < Static521.anInt8974; local180++) {
			local178[local180] = Static643.aClass275_2.method6641(local14[local180]).aString73;
		}
		Static352.method5259(local178, Static385.aShortArray98);
		Static108.aClass207_25.method4668();
		Static108.aClass207_25.anInt5242 = 2;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!ofa;)Lclient!gs;")
	public static Class56_Sub2 method4305(@OriginalArg(1) Class5_Sub22 arg0) {
		return new Class56_Sub2(arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5931(), arg0.method5931(), arg0.method5966());
	}
}
