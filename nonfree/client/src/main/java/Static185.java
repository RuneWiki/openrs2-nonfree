import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
	public static int anInt3576 = 0;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIB)I")
	public static int method3135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3136(@OriginalArg(1) String arg0) {
		if (!Static479.aBoolean594) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static103.anInt992;
		@Pc(18) int[] local18 = Static523.anIntArray682;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(28) Class15_Sub2_Sub1_Sub1 local28 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local18[local20]];
			if (local28 != null && local28 != Static35.aClass15_Sub2_Sub1_Sub1_1 && local28.aString18 != null && local28.aString18.equalsIgnoreCase(arg0)) {
				Static415.method5995(Static159.aClass236_30);
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				Static164.aClass5_Sub3_Sub1_2.method4181(Static383.anInt7004);
				Static164.aClass5_Sub3_Sub1_2.method4184(Static207.anInt3882);
				Static164.aClass5_Sub3_Sub1_2.method4200(local18[local20]);
				Static164.aClass5_Sub3_Sub1_2.method4224(Static496.anInt8516);
				local10 = true;
				Static534.method7283(local28.anIntArray307[0], 0, -2, 0, local28.anIntArray306[0], local28.method4035(), true, local28.method4035());
				break;
			}
		}
		if (!local10) {
			Static340.method5291(Static161.aClass40_51.method1063(Static194.anInt3737) + arg0);
		}
		if (Static479.aBoolean594) {
			Static187.method3151();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!co;B)Lclient!os;")
	public static Class52_Sub3 method3137(@OriginalArg(0) Class5_Sub3 arg0) {
		return new Class52_Sub3(arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4182(), arg0.method4220());
	}
}
