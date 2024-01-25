import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_118 = new Class194(42, -1);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!fi;)V")
	public static void method5808(@OriginalArg(1) Class76 arg0) {
		if (arg0.anInt2107 != Static49.anInt897) {
			return;
		}
		if (Static220.aClass2_Sub1_Sub3_Sub2_1.aString65 == null) {
			arg0.anInt2053 = 0;
			arg0.anInt2129 = 0;
			return;
		}
		arg0.anInt2093 = 150;
		arg0.anInt2117 = (int) (Math.sin((double) Static85.anInt1536 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2134 = 5;
		arg0.anInt2053 = Static43.anInt5302;
		arg0.anInt2129 = Static278.method3460(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65);
		arg0.anInt2064 = 0;
		arg0.anInt2050 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6145;
		arg0.anInt2051 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6160;
		arg0.anInt2084 = Static220.aClass2_Sub1_Sub3_Sub2_1.lb;
	}
}
