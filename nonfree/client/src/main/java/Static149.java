import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Lclient!cn;")
	public static Class73 aClass73_7 = null;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "F")
	public static float aFloat23 = 0.0F;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILclient!dr;)V")
	public static void method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub1_Sub1 arg3) {
		@Pc(4) Class174 local4 = Static545.method7957(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub1_Sub1_1 = arg3;
		@Pc(19) int local19 = Static242.aClass22Array3 == Static134.aClass22Array1 ? 1 : 0;
		if (arg3.method8906((byte) 27)) {
			if (arg3.method8897(false)) {
				arg3.aClass8_Sub1_23 = Static607.aClass8_Sub1Array4[local19];
				Static607.aClass8_Sub1Array4[local19] = arg3;
				return;
			}
			arg3.aClass8_Sub1_23 = Static494.aClass8_Sub1Array3[local19];
			Static494.aClass8_Sub1Array3[local19] = arg3;
			Static554.aBoolean714 = true;
			return;
		}
		arg3.aClass8_Sub1_23 = Static654.aClass8_Sub1Array5[local19];
		Static654.aClass8_Sub1Array5[local19] = arg3;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III[B)I")
	public static int method2109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(16) int local16 = arg1; local16 < arg0; local16++) {
			local7 = Class5_Sub2_Sub5.anIntArray136[(local7 ^ arg2[local16]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
