import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public static int anInt1807;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIILclient!aha;)V")
	public static void method1580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15_Sub1_Sub1 arg4) {
		@Pc(4) Class56 local4 = Static262.method4601(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10301 = (arg1 << Static172.anInt4156) + Static180.anInt4229;
		arg4.anInt10297 = arg3;
		arg4.anInt10298 = (arg2 << Static172.anInt4156) + Static180.anInt4229;
		local4.aClass15_Sub1_Sub1_1 = arg4;
		@Pc(33) int local33 = Static34.aClass86Array5 == Static253.aClass86Array4 ? 1 : 0;
		if (arg4.method8320()) {
			if (arg4.method8328()) {
				arg4.aClass15_Sub1_23 = Static351.aClass15_Sub1Array4[local33];
				Static351.aClass15_Sub1Array4[local33] = arg4;
				return;
			}
			arg4.aClass15_Sub1_23 = Static234.aClass15_Sub1Array3[local33];
			Static234.aClass15_Sub1Array3[local33] = arg4;
			Static147.aBoolean271 = true;
			return;
		}
		arg4.aClass15_Sub1_23 = Static16.aClass15_Sub1Array1[local33];
		Static16.aClass15_Sub1Array1[local33] = arg4;
	}
}
