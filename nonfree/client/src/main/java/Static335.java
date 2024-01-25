import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!uk;")
	public static Class14_Sub47 aClass14_Sub47_1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "J")
	public static volatile long aLong163 = 0L;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_164 = new Class160(113, 0);

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "J")
	public static long aLong164 = 0L;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!pi;ILjava/lang/String;)Lclient!ko;")
	public static Class208 method5158(@OriginalArg(1) Class144_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static381.anIntArray346, 0);
		if (Static381.anIntArray346[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class208(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5159(@OriginalArg(0) Class144 arg0) {
		if (Static638.anInt10454 < 2 && !Static546.aBoolean727 || Static649.aClass299_12 != null) {
			return;
		}
		@Pc(54) String local54;
		if (Static546.aBoolean727 && Static638.anInt10454 < 2) {
			local54 = Static529.aString102 + Static21.aClass21_31.method324(Static26.anInt352) + Static621.aString117 + " ->";
		} else if (Static477.aBoolean585 && Static89.aClass207_3.method5068(81) && Static638.anInt10454 > 2) {
			local54 = Static431.method6456(Static379.aClass14_Sub2_Sub20_3);
		} else {
			@Pc(58) Class14_Sub2_Sub20 local58 = Static379.aClass14_Sub2_Sub20_3;
			if (local58 == null) {
				return;
			}
			local54 = Static431.method6456(local58);
			@Pc(68) int[] local68 = null;
			if (Static291.method7605(local58.anInt10001)) {
				local68 = Static252.aClass56_1.method1052((int) local58.aLong281).anIntArray409;
			} else if (local58.anInt10007 != -1) {
				local68 = Static252.aClass56_1.method1052(local58.anInt10007).anIntArray409;
			} else if (Static621.method8720(local58.anInt10001)) {
				@Pc(111) Class14_Sub44 local111 = (Class14_Sub44) Static100.aClass125_9.method2630((long) (int) local58.aLong281);
				if (local111 != null) {
					@Pc(116) Class4_Sub3_Sub3_Sub3_Sub1 local116 = local111.aClass4_Sub3_Sub3_Sub3_Sub1_2;
					@Pc(119) Class362 local119 = local116.aClass362_1;
					if (local119.lb != null) {
						local119 = local119.method8641(Static188.aClass238_1);
					}
					if (local119 != null) {
						local68 = local119.anIntArray550;
					}
				}
			} else if (Static392.method5967(local58.anInt10001)) {
				@Pc(151) Class128 local151 = Static212.aClass249_4.method6119((int) (local58.aLong281 >>> 32 & 0x7FFFFFFFL));
				if (local151.anIntArray179 != null) {
					local151 = local151.method2685(Static188.aClass238_1);
				}
				if (local151 != null) {
					local68 = local151.anIntArray182;
				}
			}
			if (local68 != null) {
				local54 = local54 + Static355.method5400(local68);
			}
		}
		if (Static638.anInt10454 > 2) {
			local54 = local54 + "<col=ffffff> / " + (Static638.anInt10454 - 2) + Static21.aClass21_24.method324(Static26.anInt352);
		}
		if (Static637.aClass299_11 != null) {
			@Pc(229) Class68 local229 = Static637.aClass299_11.method7431(arg0);
			if (local229 == null) {
				local229 = Static255.aClass68_4;
			}
			local229.method9426(Static399.aClass45Array24, Static637.aClass299_11.anInt8547, Static596.anInt9848, Static637.aClass299_11.anInt8566, Static476.aRandom1, local54, Static399.anInt6980, Static16.anIntArray22, Static637.aClass299_11.anInt8562, Static637.aClass299_11.anInt8605, Static637.aClass299_11.anInt8573, Static423.anIntArray377, Static660.anInt6760, Static637.aClass299_11.anInt8530);
			Static226.method5053(Static423.anIntArray377[1], Static423.anIntArray377[3], Static423.anIntArray377[2], Static423.anIntArray377[0]);
		} else if (Static234.aClass299_5 != null && Static344.aClass80_7 == Static161.aClass80_6) {
			@Pc(296) int local296 = Static255.aClass68_4.method9428(local54, Static16.anInt234 + 16, Static476.aRandom1, Static596.anInt9848, Static399.aClass45Array24, Static16.anIntArray22, Static566.anInt9417 + 4);
			Static226.method5053(Static16.anInt234, 16, Static497.aClass350_9.method8356(local54) + local296, Static566.anInt9417 + 4);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5160(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static118.method1849("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method5162() {
		if (Static611.anInt10060 != -1) {
			Static503.method7576(false, -1, Static611.anInt10060, -1);
			Static611.anInt10060 = -1;
		}
	}
}
