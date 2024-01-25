import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Lclient!fk;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIILclient!pn;I)Z")
	public static boolean method1053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub2_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (!Static480.aBoolean590 || !Static70.aBoolean94) {
			return false;
		} else if (Static560.anInt9310 < 100) {
			return false;
		} else if (Static348.method5647(arg3, arg1, arg0)) {
			@Pc(28) int local28 = arg0 << Static485.anInt8241;
			@Pc(32) int local32 = arg3 << Static485.anInt8241;
			@Pc(42) int local42 = Static637.aClass91Array4[arg1].method7724(arg3, arg0) - 1;
			@Pc(49) int local49 = local42 + arg2.method8613();
			if (arg2.aShort83 == 1) {
				if (!Static556.method7897(local49, local28, local32 + Static188.anInt3555, local28, local42, local32, local28, local49, local32)) {
					return false;
				} else if (Static556.method7897(local42, local28, Static188.anInt3555 + local32, local28, local42, local32, local28, local49, local32 + Static188.anInt3555)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 2) {
				if (!Static556.method7897(local49, Static188.anInt3555 + local28, local32 - -Static188.anInt3555, local28, local42, local32 + Static188.anInt3555, local28, local49, local32 + Static188.anInt3555)) {
					return false;
				} else if (Static556.method7897(local49, Static188.anInt3555 + local28, local32 - -Static188.anInt3555, local28, local42, local32 + Static188.anInt3555, local28 - -Static188.anInt3555, local42, Static188.anInt3555 + local32)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 4) {
				if (!Static556.method7897(local49, local28 + Static188.anInt3555, local32 + Static188.anInt3555, local28 + Static188.anInt3555, local42, local32, local28 + Static188.anInt3555, local49, local32)) {
					return false;
				} else if (Static556.method7897(local42, Static188.anInt3555 + local28, local32 - -Static188.anInt3555, Static188.anInt3555 + local28, local42, local32, local28 + Static188.anInt3555, local49, Static188.anInt3555 + local32)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 8) {
				if (!Static556.method7897(local49, local28 + Static188.anInt3555, local32, local28, local42, local32, local28, local49, local32)) {
					return false;
				} else if (Static556.method7897(local49, local28 + Static188.anInt3555, local32, local28, local42, local32, local28 + Static188.anInt3555, local42, local32)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 16) {
				if (Static141.method2404(Static493.anInt8365, local49, Static493.anInt8365 + local32, Static493.anInt8365, local42, local28)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 32) {
				if (Static141.method2404(Static493.anInt8365, local49, local32 + Static493.anInt8365, Static493.anInt8365, local42, local28 + Static493.anInt8365)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 == 64) {
				if (Static141.method2404(Static493.anInt8365, local49, local32, Static493.anInt8365, local42, Static493.anInt8365 + local28)) {
					Static608.anInt9802++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort83 != 128) {
				return true;
			} else if (Static141.method2404(Static493.anInt8365, local49, local32, Static493.anInt8365, local42, local28)) {
				Static608.anInt9802++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;B)V")
	public static void method1054(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static253.aBoolean363 = arg1;
		Static265.aString40 = arg0;
		Static465.aString71 = arg2;
		if (!Static253.aBoolean363 && (Static265.aString40.equals("") || Static465.aString71.equals(""))) {
			Static191.method3070(3);
			return;
		}
		if (Static201.anInt3739 != 1) {
			Static607.anInt9800 = 0;
			Static167.anInt3261 = -1;
		}
		Static303.aBoolean610 = false;
		Static191.method3070(-3);
		Static268.anInt5233 = 0;
		Static312.anInt6050 = 0;
		Static71.anInt1424 = 1;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method1055(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		if (!Static480.aBoolean590 || !Static70.aBoolean94) {
			Static292.anInt5626 = 0;
			return;
		}
		if (Static377.aBoolean496) {
			Static225.aLong114 = Static471.aClass166_1.method6646();
		}
		Static419.anInt7336 = 0;
		Static74.anInt1446 = 0;
		Static608.anInt9802 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static381.anInt6906 = (int) ((float) local27[2] / 3.0F);
		Static104.anInt2078 = (int) ((float) local27[3] / 3.0F);
		arg1.method6156(Static309.anIntArray324);
		if (Static196.anInt3665 != (int) ((float) Static309.anIntArray324[0] / 3.0F) || (int) ((float) Static309.anIntArray324[1] / 3.0F) != Static157.anInt3195) {
			Static157.anInt3195 = (int) ((float) Static309.anIntArray324[1] / 3.0F);
			Static196.anInt3665 = (int) ((float) Static309.anIntArray324[0] / 3.0F);
			Static443.anIntArray463 = new int[Static157.anInt3195 * Static196.anInt3665];
			Static344.anInt6333 = Static157.anInt3195 >> 1;
			Static270.anInt5275 = Static196.anInt3665 >> 1;
		}
		Static526.aClass31_38 = arg1.method6174();
		Static292.anInt5626 = 0;
		for (@Pc(104) int local104 = 0; local104 < Static414.anInt7270; local104++) {
			Static247.method4168(arg0, arg1, Static382.aClass153Array3[local104]);
		}
		for (@Pc(127) int local127 = 0; local127 < Static576.anInt9431; local127++) {
			Static247.method4168(arg0, arg1, Static473.aClass153Array4[local127]);
		}
		for (@Pc(146) int local146 = 0; local146 < Static23.anInt340; local146++) {
			Static247.method4168(arg0, arg1, Static129.aClass153Array1[local146]);
		}
		Static560.anInt9310 = 0;
		if (Static292.anInt5626 > 0) {
			@Pc(169) int local169 = Static443.anIntArray463.length;
			@Pc(176) int local176 = local169 - local169 & 0x7;
			@Pc(178) int local178 = 0;
			while (local176 > local178) {
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
			}
			while (local169 > local178) {
				Static443.anIntArray463[local178++] = Integer.MAX_VALUE;
			}
			Static438.anInt7599 = 1;
			for (@Pc(241) int local241 = 0; local241 < Static292.anInt5626; local241++) {
				@Pc(247) Class153 local247 = Static291.aClass153Array2[local241];
				Static497.method5024(local247.aShortArray46[0], local247.aShortArray44[0], local247.aShortArray44[3], local247.aShortArray45[1], local247.aShortArray44[1], local247.aShortArray45[0], local247.aShortArray46[3], local247.aShortArray45[3], local247.aShortArray46[1]);
				Static497.method5024(local247.aShortArray46[1], local247.aShortArray44[1], local247.aShortArray44[3], local247.aShortArray45[2], local247.aShortArray44[2], local247.aShortArray45[1], local247.aShortArray46[3], local247.aShortArray45[3], local247.aShortArray46[2]);
			}
			Static438.anInt7599 = 2;
		}
		if (Static377.aBoolean496) {
			Static330.aLong163 = Static471.aClass166_1.method6646() - Static225.aLong114;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method1056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
