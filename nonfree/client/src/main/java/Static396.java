import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nia", name = "J", descriptor = "Lclient!bp;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!nia", name = "D", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
	public static final int anInt6780 = -1;

	@OriginalMember(owner = "client!nia", name = "H", descriptor = "Lclient!eu;")
	public static final Class114 aClass114_13 = new Class114(3);

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIILclient!qa;Lclient!qa;)V")
	public static void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub1_Sub4 arg3, @OriginalArg(4) Class8_Sub1_Sub4 arg4) {
		@Pc(4) Class174 local4 = Static545.method7957(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub1_Sub4_2 = arg3;
		local4.aClass8_Sub1_Sub4_1 = arg4;
		@Pc(22) int local22 = Static242.aClass22Array3 == Static134.aClass22Array1 ? 1 : 0;
		if (!arg3.method8906((byte) 27)) {
			arg3.aClass8_Sub1_23 = Static654.aClass8_Sub1Array5[local22];
			Static654.aClass8_Sub1Array5[local22] = arg3;
		} else if (arg3.method8897(false)) {
			arg3.aClass8_Sub1_23 = Static607.aClass8_Sub1Array4[local22];
			Static607.aClass8_Sub1Array4[local22] = arg3;
		} else {
			arg3.aClass8_Sub1_23 = Static494.aClass8_Sub1Array3[local22];
			Static494.aClass8_Sub1Array3[local22] = arg3;
			Static554.aBoolean714 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8906((byte) 27)) {
			if (arg4.method8897(false)) {
				arg4.aClass8_Sub1_23 = Static607.aClass8_Sub1Array4[local22];
				Static607.aClass8_Sub1Array4[local22] = arg4;
				return;
			}
			arg4.aClass8_Sub1_23 = Static494.aClass8_Sub1Array3[local22];
			Static494.aClass8_Sub1Array3[local22] = arg4;
			Static554.aBoolean714 = true;
			return;
		}
		arg4.aClass8_Sub1_23 = Static654.aClass8_Sub1Array5[local22];
		Static654.aClass8_Sub1Array5[local22] = arg4;
	}
}
