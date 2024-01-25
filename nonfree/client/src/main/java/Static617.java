import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
	public static int anInt10026;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Lclient!eq;")
	public static Class97 aClass97_151;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
	public static void method8391() {
		if (Static330.anInt4375 < 0) {
			return;
		}
		@Pc(12) long local12 = Static438.method6517();
		Static330.anInt4375 = (int) ((long) Static330.anInt4375 + Static176.aLong105 - local12);
		if (Static330.anInt4375 <= 0) {
			Static345.aFloat154 = Static560.aClass121_2.aFloat100;
			Static353.aClass22_4 = Static560.aClass121_2.aClass22_2;
			Static578.anInt9537 = Static560.aClass121_2.anInt3720;
			Static41.aFloat24 = Static560.aClass121_2.aFloat99;
			Static3.aFloat1 = Static560.aClass121_2.aFloat103;
			Static467.aFloat209 = Static560.aClass121_2.aFloat98;
			Static121.anInt2897 = Static560.aClass121_2.anInt3718;
			Static442.aFloat194 = Static560.aClass121_2.aFloat101;
			Static183.anInt4030 = Static560.aClass121_2.anInt3713;
			Static330.anInt4375 = -1;
			Static267.aFloat190 = Static560.aClass121_2.aFloat102;
		} else {
			@Pc(65) int local65 = (Static330.anInt4375 << 8) / Static305.anInt5645;
			@Pc(69) int local69 = 255 - local65;
			@Pc(74) float local74 = (float) local65 / 255.0F;
			@Pc(78) float local78 = 1.0F - local74;
			Static183.anInt4030 = (local69 * (Static560.aClass121_2.anInt3713 & 0xFF00FF) + (Static144.anInt3308 & 0xFF00FF) * local65 & 0xFF00FF00) + ((Static560.aClass121_2.anInt3713 & 0xFF00) * local69 + local65 * (Static144.anInt3308 & 0xFF00) & 0xFF0000) >>> 8;
			Static267.aFloat190 = Static149.aFloat218 + (Static560.aClass121_2.aFloat102 - Static149.aFloat218) * local78;
			Static3.aFloat1 = (Static560.aClass121_2.aFloat103 - Static356.aFloat156) * local78 + Static356.aFloat156;
			Static442.aFloat194 = (Static560.aClass121_2.aFloat101 - Static222.aFloat215) * local78 + Static222.aFloat215;
			Static41.aFloat24 = Static441.aFloat193 + local78 * (Static560.aClass121_2.aFloat99 - Static441.aFloat193);
			Static578.anInt9537 = Static560.aClass121_2.anInt3720 * local69 + Static472.anInt8096 * local65 >> 8;
			Static121.anInt2897 = (local65 * (Static412.anInt7550 & 0xFF00) + (Static560.aClass121_2.anInt3718 & 0xFF00) * local69 & 0xFF0000) + (local69 * (Static560.aClass121_2.anInt3718 & 0xFF00FF) + local65 * (Static412.anInt7550 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static345.aFloat154 = local78 * (Static560.aClass121_2.aFloat100 - Static619.aFloat223) + Static619.aFloat223;
			Static467.aFloat209 = Static531.aFloat216 + local78 * (Static560.aClass121_2.aFloat98 - Static531.aFloat216);
			if (Static560.aClass121_2.aClass22_2 != Static57.aClass22_1) {
				Static353.aClass22_4 = Static555.aClass87_14.method7923(Static57.aClass22_1, Static560.aClass121_2.aClass22_2, local78, Static353.aClass22_4);
			}
		}
		Static176.aLong105 = local12;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)V")
	public static void method8392() {
		if (!Static354.aBoolean483) {
			Static354.aBoolean483 = true;
			Static620.aBoolean745 = true;
			Static293.aFloat128 += (12.0F - Static293.aFloat128) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(JILclient!ha;)V")
	public static void method8393(@OriginalArg(0) long arg0, @OriginalArg(2) Class87 arg1) {
		Static620.anInt10087 = Static561.anInt9276;
		Static586.anInt9638 = 0;
		Static565.anInt9337 = 0;
		Static561.anInt9276 = 0;
		@Pc(18) long local18 = Static438.method6517();
		for (@Pc(23) Class11_Sub4 local23 = (Class11_Sub4) Static458.aClass143_7.method3536(); local23 != null; local23 = (Class11_Sub4) Static458.aClass143_7.method3528()) {
			if (local23.method2627(arg1, arg0)) {
				Static586.anInt9638++;
			}
		}
		if (Static525.aBoolean649 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static458.aClass143_7.method3535() + ", running: " + Static586.anInt9638);
			System.out.println("Emitters: " + Static565.anInt9337 + " Particles: " + Static561.anInt9276 + ". Time taken: " + (Static438.method6517() - local18) + "ms");
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!ak;I)I")
	public static int method8394(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt548;
		@Pc(10) Class165 local10 = arg0.method2761();
		if (arg0.anInt3253 == -1 || arg0.aBoolean275) {
			local6 = arg0.anInt570;
		} else if (local10.anInt4881 == arg0.anInt3253 || local10.anInt4914 == arg0.anInt3253 || local10.anInt4905 == arg0.anInt3253 || local10.anInt4875 == arg0.anInt3253) {
			local6 = arg0.anInt544;
		} else if (arg0.anInt3253 == local10.anInt4899 || local10.anInt4916 == arg0.anInt3253 || arg0.anInt3253 == local10.anInt4902 || arg0.anInt3253 == local10.anInt4910) {
			local6 = arg0.anInt540;
		}
		return local6;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(Z)V")
	public static void method8395() {
		Static250.aClass222_32.method5469();
		Static81.aClass175_3.method4283();
		Static627.aClass175_13.method4283();
	}
}
