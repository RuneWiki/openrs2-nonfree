import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!ofa", name = "L", descriptor = "[Lclient!fq;")
	public static Class34_Sub1[] aClass34_Sub1Array5;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIILclient!f;)V")
	public static void method5911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34_Sub1_Sub4 arg4) {
		@Pc(4) Class368 local4 = Static172.method2744(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9614 = (arg1 << Static571.anInt9216) + Static579.anInt9391;
		arg4.anInt9622 = arg3;
		arg4.anInt9619 = (arg2 << Static571.anInt9216) + Static579.anInt9391;
		local4.aClass34_Sub1_Sub4_1 = arg4;
		@Pc(33) int local33 = Static582.aClass35Array3 == Static368.aClass35Array1 ? 1 : 0;
		if (arg4.method7845()) {
			if (arg4.method7853()) {
				arg4.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local33];
				Static218.aClass34_Sub1Array2[local33] = arg4;
				return;
			}
			arg4.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local33];
			Static368.aClass34_Sub1Array3[local33] = arg4;
			Static182.aBoolean246 = true;
			return;
		}
		arg4.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local33];
		Static392.aClass34_Sub1Array4[local33] = arg4;
	}
}
