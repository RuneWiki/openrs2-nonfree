import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public static void method527() {
		for (@Pc(6) Class6_Sub4 local6 = (Class6_Sub4) Static466.aClass275_168.method6366(); local6 != null; local6 = (Class6_Sub4) Static466.aClass275_168.method6364()) {
			if (Static208.aClass9ArrayArrayArray3 == null) {
				local6.method7849();
			} else {
				@Pc(32) int local32;
				@Pc(42) Class29_Sub5 local42;
				@Pc(78) Class29_Sub5_Sub2 local78;
				@Pc(210) Class29_Sub2 local210;
				@Pc(165) Class29_Sub3 local165;
				@Pc(102) Class29_Sub1 local102;
				@Pc(184) Class29_Sub3_Sub3 local184;
				@Pc(138) Class29_Sub1_Sub3 local138;
				if (local6.anInt521 <= Static358.anInt6263) {
					local32 = Static242.anIntArray431[local6.anInt515];
					if (local32 == 0) {
						local42 = Static120.method1814(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local42 instanceof Class29_Sub5_Sub2) {
							Static428.method6252(local6.anInt513, local6.anInt527, local6.anInt522);
							local78 = (Class29_Sub5_Sub2) local42;
							if (local78.aClass29_Sub5_3 != null) {
								Static470.method6576(local6.anInt513, local6.anInt527, local6.anInt522, local78.aClass29_Sub5_3, null);
							}
						}
					} else if (local32 == 1) {
						local102 = Static178.method5953(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local102 instanceof Class29_Sub1_Sub3) {
							Static230.method3381(local6.anInt513, local6.anInt527, local6.anInt522);
							local138 = (Class29_Sub1_Sub3) local102;
							if (local138.aClass29_Sub1_3 != null) {
								Static163.method2393(local6.anInt513, local6.anInt527, local6.anInt522, local138.aClass29_Sub1_3, null);
							}
						}
					} else if (local32 == 2) {
						local210 = Static134.method1995(local6.anInt513, local6.anInt527, local6.anInt522, dda.class);
						if (local210 instanceof Class29_Sub2_Sub5) {
							Static23.method302(local6.anInt513, local6.anInt527, local6.anInt522, dda.class);
							@Pc(388) Class29_Sub2_Sub5 local388 = (Class29_Sub2_Sub5) local210;
							if (local388.aClass29_Sub2_2 != null) {
								Static280.method3996(local388.aClass29_Sub2_2, false);
							}
						}
					} else if (local32 == 3) {
						local165 = Static315.method4904(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local165 instanceof Class29_Sub3_Sub3) {
							Static556.method7615(local6.anInt513, local6.anInt527, local6.anInt522);
							local184 = (Class29_Sub3_Sub3) local165;
							if (local184.aClass29_Sub3_2 != null) {
								Static97.method1504(local6.anInt513, local6.anInt527, local6.anInt522, local184.aClass29_Sub3_2);
							}
						}
					}
					local6.method7849();
				} else if (Static358.anInt6263 == local6.anInt519) {
					local32 = Static242.anIntArray431[local6.anInt515];
					if (local32 == 0) {
						local42 = Static120.method1814(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local42 instanceof Class29_Sub5_Sub2) {
							local6.method7849();
						} else if (Static527.method7362(local6.anInt513, local6.anInt527, local6.anInt522) == null) {
							local78 = new Class29_Sub5_Sub2(local6.anInt515, local6.anInt526, local6.anInt516, local6.anInt517, local6.anInt518, local42);
							Static470.method6576(local6.anInt513, local6.anInt527, local6.anInt522, local78, null);
						} else {
							local6.method7849();
						}
					} else if (local32 == 1) {
						local102 = Static178.method5953(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local102 instanceof Class29_Sub1_Sub3) {
							local6.method7849();
						} else if (Static393.method5819(local6.anInt513, local6.anInt527, local6.anInt522) == null) {
							local138 = new Class29_Sub1_Sub3(local6.anInt515, local6.anInt526, local6.anInt516, local6.anInt517, local6.anInt518, local102);
							Static163.method2393(local6.anInt513, local6.anInt527, local6.anInt522, local138, null);
						} else {
							local6.method7849();
						}
					} else if (local32 == 2) {
						local210 = Static134.method1995(local6.anInt513, local6.anInt527, local6.anInt522, dda.class);
						if (local210 instanceof Class29_Sub2_Sub5) {
							local6.method7849();
						} else {
							Static23.method302(local6.anInt513, local6.anInt527, local6.anInt522, dda.class);
							@Pc(239) Class313 local239 = Static260.aClass100_1.method2008(local6.anInt511);
							@Pc(253) int local253;
							@Pc(250) int local250;
							if (local6.anInt526 == 1 || local6.anInt526 == 3) {
								local250 = local239.anInt8478;
								local253 = local239.anInt8463;
							} else {
								local250 = local239.anInt8463;
								local253 = local239.anInt8478;
							}
							@Pc(294) Class29_Sub2_Sub5 local294 = new Class29_Sub2_Sub5(local6.anInt515, local6.anInt526, local6.anInt513, local6.anInt516, local6.anInt517, local6.anInt518, local6.anInt527, local253 + local6.anInt527 - 1, local6.anInt522, local6.anInt522 + local250 - 1, local210);
							Static280.method3996(local294, false);
						}
					} else if (local32 == 3) {
						local165 = Static315.method4904(local6.anInt513, local6.anInt527, local6.anInt522);
						if (local165 instanceof Class29_Sub3_Sub3) {
							local6.method7849();
						} else {
							local184 = new Class29_Sub3_Sub3(local6.anInt516, local6.anInt517, local6.anInt518, local165);
							Static97.method1504(local6.anInt513, local6.anInt527, local6.anInt522, local184);
						}
					}
				}
			}
		}
	}
}
