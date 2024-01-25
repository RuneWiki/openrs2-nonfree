import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString247 = "K";

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString248 = "Loaded client variable data";

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString249 = "";

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!dp;ZLclient!dp;B)V")
	public static void method5025(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		Static205.aBoolean420 = true;
		Static262.aClass53_119 = arg0;
		Static121.aClass53_138 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBIII)V")
	public static void method5027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class6_Sub39 local6 = (Class6_Sub39) Static264.aClass211_31.method5594(); local6 != null; local6 = (Class6_Sub39) Static264.aClass211_31.method5582()) {
			Static1.method33(arg1, arg0, arg3, local6, arg2);
		}
		for (@Pc(36) Class6_Sub39 local36 = (Class6_Sub39) Static113.aClass211_17.method5594(); local36 != null; local36 = (Class6_Sub39) Static113.aClass211_17.method5582()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class128 local45 = local36.aClass44_Sub4_Sub4_Sub2_1.method4716();
			if (local36.aClass44_Sub4_Sub4_Sub2_1.aBoolean358) {
				local40 = 0;
			} else if (local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 == local45.anInt3379 || local45.anInt3393 == local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 || local45.anInt3410 == local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 || local45.anInt3395 == local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116) {
				local40 = 2;
			} else if (local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 == local45.anInt3400 || local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 == local45.anInt3411 || local45.anInt3383 == local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 || local36.aClass44_Sub4_Sub4_Sub2_1.anInt5116 == local45.anInt3374) {
				local40 = 3;
			}
			if (local40 != local36.anInt5868) {
				@Pc(132) int local132 = Static178.method3319(local36.aClass44_Sub4_Sub4_Sub2_1);
				if (local132 != local36.anInt5873) {
					if (local36.aClass6_Sub12_Sub4_3 != null) {
						Static241.aClass6_Sub12_Sub3_6.method4902(local36.aClass6_Sub12_Sub4_3);
						local36.aClass6_Sub12_Sub4_3 = null;
					}
					local36.anInt5873 = local132;
				}
				local36.anInt5868 = local40;
			}
			local36.anInt5876 = local36.aClass44_Sub4_Sub4_Sub2_1.anInt6340;
			local36.anInt5877 = local36.aClass44_Sub4_Sub4_Sub2_1.anInt6340 + local36.aClass44_Sub4_Sub4_Sub2_1.method4714() * 64;
			local36.anInt5888 = local36.aClass44_Sub4_Sub4_Sub2_1.anInt6339;
			local36.anInt5881 = local36.aClass44_Sub4_Sub4_Sub2_1.anInt6339 + local36.aClass44_Sub4_Sub4_Sub2_1.method4714() * 64;
			Static1.method33(arg1, arg0, arg3, local36, arg2);
		}
		for (@Pc(207) Class6_Sub39 local207 = (Class6_Sub39) Static225.aClass108_26.method2903(); local207 != null; local207 = (Class6_Sub39) Static225.aClass108_26.method2905()) {
			@Pc(211) byte local211 = 1;
			@Pc(216) Class128 local216 = local207.aClass44_Sub4_Sub4_Sub1_2.method4716();
			if (local207.aClass44_Sub4_Sub4_Sub1_2.aBoolean358) {
				local211 = 0;
			} else if (local216.anInt3379 == local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 || local216.anInt3393 == local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 || local216.anInt3410 == local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 || local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 == local216.anInt3395) {
				local211 = 2;
			} else if (local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 == local216.anInt3400 || local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 == local216.anInt3411 || local216.anInt3383 == local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 || local207.aClass44_Sub4_Sub4_Sub1_2.anInt5116 == local216.anInt3374) {
				local211 = 3;
			}
			if (local211 != local207.anInt5868) {
				@Pc(295) int local295 = Static241.method5339(local207.aClass44_Sub4_Sub4_Sub1_2);
				if (local207.anInt5873 != local295) {
					if (local207.aClass6_Sub12_Sub4_3 != null) {
						Static241.aClass6_Sub12_Sub3_6.method4902(local207.aClass6_Sub12_Sub4_3);
						local207.aClass6_Sub12_Sub4_3 = null;
					}
					local207.anInt5873 = local295;
				}
				local207.anInt5868 = local211;
			}
			local207.anInt5876 = local207.aClass44_Sub4_Sub4_Sub1_2.anInt6340;
			local207.anInt5877 = local207.aClass44_Sub4_Sub4_Sub1_2.anInt6340 + local207.aClass44_Sub4_Sub4_Sub1_2.method4714() * 64;
			local207.anInt5888 = local207.aClass44_Sub4_Sub4_Sub1_2.anInt6339;
			local207.anInt5881 = local207.aClass44_Sub4_Sub4_Sub1_2.anInt6339 + local207.aClass44_Sub4_Sub4_Sub1_2.method4714() * 64;
			Static1.method33(arg1, arg0, arg3, local207, arg2);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)V")
	public static void method5028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static325.method5422(local35, true);
	}
}
