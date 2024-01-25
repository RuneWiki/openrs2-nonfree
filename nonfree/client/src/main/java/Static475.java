import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("c093db9182b20ba3e47bff31c546b69e06894a224531c266dda313beb654610b7f967c84f1a222c21bfa4bf57391b245dfa8e9a37731dc0a0492f50a7b5cd15b", 16);

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	public static int anInt7604 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method6407() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static296.aClass25Array1[local7] = null;
		}
		Static176.anInt3101 = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!vs;)V")
	public static void method6409(@OriginalArg(0) Class367 arg0) {
		if (Static389.anInt6119 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub24 local6 = arg0.aClass2_Sub24_3;
		Static90.aClass367Array1[Static389.anInt6119] = arg0;
		Static182.aBooleanArray159[Static389.anInt6119] = false;
		Static389.anInt6119++;
		@Pc(21) int local21 = arg0.anInt9858;
		if (arg0.aBoolean723) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9858;
		if (arg0.aBoolean724) {
			local29 = Static10.anInt139 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6301() + Static427.anInt6729 - local6.method6302() >> Static609.anInt9827;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6301() + local6.method6302() - Static427.anInt6729 >> Static609.anInt9827;
			if (local73 >= Class13_Sub1_Sub4_Sub1.lb) {
				local73 = Class13_Sub1_Sub4_Sub1.lb - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray145[local41++];
				@Pc(105) int local105 = (local6.method6299() + Static427.anInt6729 - local6.method6302() >> Static609.anInt9827) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static322.anInt5120) {
					local113 = Static322.anInt5120 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static478.aLongArrayArrayArray4[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static478.aLongArrayArrayArray4[local38][local126][local82] = local135 | (long) Static389.anInt6119;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static478.aLongArrayArrayArray4[local38][local126][local82] = local135 | (long) Static389.anInt6119 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static478.aLongArrayArrayArray4[local38][local126][local82] = local135 | (long) Static389.anInt6119 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static478.aLongArrayArrayArray4[local38][local126][local82] = local135 | (long) Static389.anInt6119 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!am;Z)V")
	public static void method6410(@OriginalArg(0) Class13_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(15) Class2_Sub33 local15 = (Class2_Sub33) Static164.aClass109_27.method2325(); local15 != null; local15 = (Class2_Sub33) Static164.aClass109_27.method2318()) {
			if (local15.aClass13_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				if (local15.aClass2_Sub13_Sub2_3 != null) {
					Static586.aClass2_Sub13_Sub4_2.method7226(local15.aClass2_Sub13_Sub2_3);
					local15.aClass2_Sub13_Sub2_3 = null;
				}
				local15.method8653();
				return;
			}
		}
	}
}
