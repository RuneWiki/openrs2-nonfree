import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
	public static boolean aBoolean763;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_57 = new Class306();

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "[Lclient!aj;")
	public static final Class16[] aClass16Array1 = new Class16[8];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Z")
	public static boolean method8024(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method8025() {
		Static436.method6507();
		Static102.aClass136_43 = null;
		Static443.anInt7473 = 0;
		Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
		Static60.anInt3115 = 0;
		Static80.anInt1302 = 0;
		Static612.aClass136_191 = null;
		Static441.aClass136_148 = null;
		Static86.aClass136_37 = null;
		Static300.method4350();
		Static26.method509();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local30] = null;
		}
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 = null;
		for (@Pc(46) int local46 = 0; local46 < Static108.anInt1716; local46++) {
			@Pc(53) Class14_Sub1_Sub1_Sub3_Sub2 local53 = Static367.aClass5_Sub13Array1[local46].aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (local53 != null) {
				local53.anInt2951 = -1;
			}
		}
		Static338.method5184();
		Static584.anInt9543 = 1;
		Static609.anInt9978 = -1;
		Static394.anInt6873 = -1;
		Static214.method3254(10);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static609.aBooleanArray58[local79] = true;
		}
		Static172.method2651();
		Static357.aLong178 = 0L;
		Static214.aClass5_Sub44_1 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!kf;)V")
	public static void method8026(@OriginalArg(0) Class14_Sub1 arg0) {
		Static480.aClass126_12.H(arg0.anInt9317, arg0.anInt9321 + (arg0.method8004() >> 1), arg0.anInt9315, Static73.anIntArray99);
		arg0.anInt9313 = Static73.anIntArray99[0];
		arg0.anInt9319 = Static73.anIntArray99[1];
		arg0.anInt9320 = Static73.anIntArray99[2];
	}
}
