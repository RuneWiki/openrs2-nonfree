import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
	public static boolean aBoolean749 = false;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public static int anInt10382 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!wt;")
	public static Class6 method8972(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class6_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class6) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class6_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public static void method8973() {
		for (@Pc(1) int local1 = Static601.anInt10526; local1 < Static60.anInt1169; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static585.anInt10170; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static202.anInt4238; local7++) {
					@Pc(16) Class291 local16 = Static193.aClass291ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class15_Sub3_Sub4 local21 = local16.aClass15_Sub3_Sub4_1;
						@Pc(24) Class15_Sub3_Sub4 local24 = local16.aClass15_Sub3_Sub4_2;
						if (local21 != null && local21.method9439()) {
							Static669.method9746(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9439()) {
								Static669.method9746(local24, local1, local4, local7, 1, 1);
								local24.method9426(0, 0, Static64.aClass101_1, local21, false, 0);
								local24.method9429();
							}
							local21.method9429();
						}
						for (@Pc(68) Class27 local68 = local16.aClass27_3; local68 != null; local68 = local68.aClass27_1) {
							@Pc(72) Class15_Sub3_Sub3 local72 = local68.aClass15_Sub3_Sub3_1;
							if (local72 != null && local72.method9439()) {
								Static669.method9746(local72, local1, local4, local7, local72.aShort63 + 1 - local72.aShort62, local72.aShort65 - local72.aShort64 + 1);
								local72.method9429();
							}
						}
						@Pc(108) Class15_Sub3_Sub5 local108 = local16.aClass15_Sub3_Sub5_1;
						if (local108 != null && local108.method9439()) {
							Static524.method8167(local108, local1, local4, local7);
							local108.method9429();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public static void method8974() {
		@Pc(10) int local10 = Static230.aClass2_Sub54_15.aClass4_Sub17_1.method6114();
		if (local10 == 0) {
			Static516.aByteArrayArrayArray18 = null;
			Static105.method1888(0);
		} else if (local10 == 1) {
			Static385.method6486((byte) 0);
			Static105.method1888(512);
			if (Static96.aByteArrayArrayArray10 != null) {
				Static578.method6238();
			}
		} else {
			Static385.method6486((byte) (Static125.anInt2441 - 4 & 0xFF));
			Static105.method1888(2);
		}
		Static340.anInt6393 = Static547.anInt9550;
	}
}
