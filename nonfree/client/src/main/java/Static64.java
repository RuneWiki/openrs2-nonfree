import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array3;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mn;I)V")
	public static void method1249(@OriginalArg(0) Class115 arg0) {
		@Pc(8) int local8 = arg0.anInt3544;
		if (local8 == 324) {
			if (Static39.anInt936 == -1) {
				Static262.anInt6201 = arg0.anInt3466;
				Static39.anInt936 = arg0.anInt3537;
			}
			if (Static127.aClass126_1.aBoolean335) {
				arg0.anInt3537 = Static39.anInt936;
			} else {
				arg0.anInt3537 = Static262.anInt6201;
			}
		} else if (local8 == 325) {
			if (Static39.anInt936 == -1) {
				Static262.anInt6201 = arg0.anInt3466;
				Static39.anInt936 = arg0.anInt3537;
			}
			if (Static127.aClass126_1.aBoolean335) {
				arg0.anInt3537 = Static262.anInt6201;
			} else {
				arg0.anInt3537 = Static39.anInt936;
			}
		} else if (local8 == 327) {
			arg0.anInt3557 = 150;
			arg0.anInt3480 = (int) (Math.sin((double) Static148.anInt3168 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3483 = 5;
			arg0.anInt3465 = -1;
		} else if (local8 == 328) {
			if (Static111.aClass36_Sub3_Sub2_1.aString249 == null) {
				arg0.anInt3465 = 0;
			} else {
				arg0.anInt3557 = 150;
				arg0.anInt3480 = (int) (Math.sin((double) Static148.anInt3168 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3483 = 5;
				arg0.anInt3465 = ((int) Static61.method2447(Static111.aClass36_Sub3_Sub2_1.aString249) << 11) + 2047;
				arg0.anInt3490 = Static111.aClass36_Sub3_Sub2_1.anInt5138;
				arg0.anInt3507 = Static111.aClass36_Sub3_Sub2_1.anInt5078;
				arg0.anInt3478 = 0;
				arg0.anInt3474 = Static111.aClass36_Sub3_Sub2_1.anInt5119;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!jd;BLclient!jd;)V")
	public static void method1250(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Class84 arg1) {
		Static8.aClass84_5 = arg1;
		Static36.aClass84_16 = arg0;
	}
}
