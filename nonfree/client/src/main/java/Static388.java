import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZ)V")
	public static void method6231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 0) {
			Static582.method8233(false);
		} else {
			Static454.anInt8017 = Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025();
			Static441.method6865(true, 0);
		}
		Static414.anInt7569 = arg0;
		Static624.anInt10064 = arg2;
		Static513.aBoolean632 = arg3;
		Static110.method2800(arg1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!al;IB)V")
	public static void method6232(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		if (Static609.aBoolean712) {
			arg1 = 0;
			Static609.aBoolean712 = false;
		}
		if (Static2.aClass16_1 != null && Static2.aClass16_1.method908(arg0)) {
			return;
		}
		Static2.aClass16_1 = arg0;
		Static222.aLong120 = Static374.method6036();
		Static423.anInt7643 = arg1;
		Static153.anInt3027 = arg1;
		if (Static153.anInt3027 == 0) {
			Static240.method8606();
			return;
		}
		Static63.aFloat62 = Static291.aFloat105;
		Static303.aFloat108 = Static427.aFloat180;
		Static644.aFloat214 = Static485.aFloat186;
		Static401.aFloat164 = Static448.aFloat183;
		Static341.anInt9028 = Static199.anInt3921;
		Static76.aFloat65 = Static386.aFloat161;
		Static556.anInt9295 = Static527.anInt8993;
		Static128.aClass205_2 = Static594.aClass205_4;
		Static431.anInt7785 = Static271.anInt4937;
		Static537.aFloat201 = Static436.aFloat181;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIZ[Lclient!qk;I)V")
	public static void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class279[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(17) Class279 local17 = arg3[local11];
			if (local17 != null && arg0 == local17.anInt8203) {
				Static452.method2910(local17, arg2, arg4, arg1);
				Static180.method3117(local17, arg4, arg2);
				if (local17.anInt8136 > local17.anInt8219 - local17.anInt8153) {
					local17.anInt8136 = local17.anInt8219 - local17.anInt8153;
				}
				if (local17.anInt8136 < 0) {
					local17.anInt8136 = 0;
				}
				if (local17.anInt8131 - local17.anInt8141 < local17.anInt8130) {
					local17.anInt8130 = local17.anInt8131 - local17.anInt8141;
				}
				if (local17.anInt8130 < 0) {
					local17.anInt8130 = 0;
				}
				if (local17.anInt8204 == 0) {
					Static5.method3192(local17, arg1);
				}
			}
		}
	}
}
