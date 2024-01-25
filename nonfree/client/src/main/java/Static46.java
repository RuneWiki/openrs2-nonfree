import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!kda;")
	public static Class160 aClass160_11;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_2 = new Class266("", 14);

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "F")
	public static float aFloat55 = 1.0F;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method1411(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static543.method7933(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBILclient!ks;)V")
	public static void method1412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47_Sub2_Sub3_Sub2 arg2) {
		if (arg0 == arg2.anInt5018 && arg0 != -1) {
			@Pc(17) Class280 local17 = Static6.aClass126_1.method3574(arg0);
			@Pc(20) int local20 = local17.anInt8110;
			if (local20 == 1) {
				arg2.anInt5073 = 0;
				arg2.anInt5026 = arg1;
				arg2.anInt5007 = 0;
				arg2.anInt5074 = 1;
				arg2.anInt5063 = 0;
				Static351.method5589(arg2.anInt8189, local17, arg2 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg2.aByte94, arg2.anInt8191, arg2.anInt5007);
			}
			if (local20 == 2) {
				arg2.anInt5073 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5018 == -1 || Static6.aClass126_1.method3574(arg0).anInt8103 >= Static6.aClass126_1.method3574(arg2.anInt5018).anInt8103) {
			arg2.anInt5074 = 1;
			arg2.anInt5073 = 0;
			arg2.anInt5026 = arg1;
			arg2.anInt5007 = 0;
			arg2.anInt5018 = arg0;
			arg2.anInt5080 = arg2.anInt5082;
			arg2.anInt5063 = 0;
			if (arg2.anInt5018 != -1) {
				Static351.method5589(arg2.anInt8189, Static6.aClass126_1.method3574(arg2.anInt5018), Static16.aClass47_Sub2_Sub3_Sub2_1 == arg2, arg2.aByte94, arg2.anInt8191, arg2.anInt5007);
			}
		}
	}
}
