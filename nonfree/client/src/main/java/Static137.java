import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public static int anInt3221;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array10;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!ica;)V")
	public static void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class47_Sub2_Sub3_Sub1 arg2) {
		if (arg2.anInt5018 == arg1 && arg1 != -1) {
			@Pc(15) Class280 local15 = Static6.aClass126_1.method3574(arg1);
			@Pc(18) int local18 = local15.anInt8110;
			if (local18 == 1) {
				arg2.anInt5026 = arg0;
				arg2.anInt5074 = 1;
				arg2.anInt5007 = 0;
				arg2.anInt5063 = 0;
				arg2.anInt5073 = 0;
				Static351.method5589(arg2.anInt8189, local15, false, arg2.aByte94, arg2.anInt8191, arg2.anInt5007);
			}
			if (local18 == 2) {
				arg2.anInt5073 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt5018 == -1 || Static6.aClass126_1.method3574(arg1).anInt8103 >= Static6.aClass126_1.method3574(arg2.anInt5018).anInt8103) {
			arg2.anInt5080 = arg2.anInt5082;
			arg2.anInt5063 = 0;
			arg2.anInt5018 = arg1;
			arg2.anInt5007 = 0;
			arg2.anInt5026 = arg0;
			arg2.anInt5073 = 0;
			arg2.anInt5074 = 1;
			if (arg2.anInt5018 != -1) {
				Static351.method5589(arg2.anInt8189, Static6.aClass126_1.method3574(arg2.anInt5018), false, arg2.aByte94, arg2.anInt8191, arg2.anInt5007);
			}
		}
	}
}
