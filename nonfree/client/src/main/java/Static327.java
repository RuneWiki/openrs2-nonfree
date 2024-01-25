import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt5831;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	public static int anInt5848;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "I")
	public static int anInt5853 = 0;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)V")
	public static void method4974(@OriginalArg(1) int arg0) {
		Static411.anInt7153 = arg0;
		Static405.aClass391_35.method9276(0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILclient!mia;)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub5 arg4) {
		@Pc(4) Class174 local4 = Static545.method7957(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10355 = (arg1 << Static611.anInt10115) + Static349.anInt6143;
		arg4.anInt10357 = arg3;
		arg4.anInt10363 = (arg2 << Static611.anInt10115) + Static349.anInt6143;
		local4.aClass8_Sub1_Sub5_1 = arg4;
		@Pc(36) int local36 = Static242.aClass22Array3 == Static134.aClass22Array1 ? 1 : 0;
		if (arg4.method8906((byte) 27)) {
			if (arg4.method8897(false)) {
				arg4.aClass8_Sub1_23 = Static607.aClass8_Sub1Array4[local36];
				Static607.aClass8_Sub1Array4[local36] = arg4;
				return;
			}
			arg4.aClass8_Sub1_23 = Static494.aClass8_Sub1Array3[local36];
			Static494.aClass8_Sub1Array3[local36] = arg4;
			Static554.aBoolean714 = true;
			return;
		}
		arg4.aClass8_Sub1_23 = Static654.aClass8_Sub1Array5[local36];
		Static654.aClass8_Sub1Array5[local36] = arg4;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(BI)I")
	public static int method4992(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
