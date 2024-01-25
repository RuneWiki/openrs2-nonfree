import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "J")
	public static long aLong221;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_49 = new Class342();

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
	public static int anInt6421 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILclient!vr;Lclient!vr;)V")
	public static void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub3 arg3, @OriginalArg(4) Class9_Sub1_Sub3 arg4) {
		@Pc(4) Class364 local4 = Static309.method4578(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub3_2 = arg3;
		local4.aClass9_Sub1_Sub3_1 = arg4;
		@Pc(22) int local22 = Static477.aClass259Array3 == Static378.aClass259Array2 ? 1 : 0;
		if (!arg3.method9093()) {
			arg3.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local22];
			Static52.aClass9_Sub1Array1[local22] = arg3;
		} else if (arg3.method9084()) {
			arg3.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local22];
			Static120.aClass9_Sub1Array2[local22] = arg3;
		} else {
			arg3.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local22];
			Static356.aClass9_Sub1Array4[local22] = arg3;
			Static632.aBoolean653 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9093()) {
			if (arg4.method9084()) {
				arg4.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local22];
				Static120.aClass9_Sub1Array2[local22] = arg4;
				return;
			}
			arg4.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local22];
			Static356.aClass9_Sub1Array4[local22] = arg4;
			Static632.aBoolean653 = true;
			return;
		}
		arg4.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local22];
		Static52.aClass9_Sub1Array1[local22] = arg4;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BI)V")
	public static void method5565() {
		@Pc(8) Class307 local8 = Static91.aClass307_21;
		synchronized (Static91.aClass307_21) {
			Static91.aClass307_21.method6995(5);
		}
		local8 = Static386.aClass307_61;
		synchronized (Static386.aClass307_61) {
			Static386.aClass307_61.method6995(5);
		}
	}
}
