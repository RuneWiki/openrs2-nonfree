import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	public static int anInt4320 = 0;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	public static int anInt4330 = 0;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
	public static int anInt4333 = 0;

	@OriginalMember(owner = "client!qn", name = "X", descriptor = "[I")
	public static int[] anIntArray486 = new int[50];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!af;IBZLclient!af;)I")
	public static int method3702(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class4_Sub1 arg3) {
		if (arg1 == 1) {
			@Pc(15) int local15 = arg0.anInt197;
			@Pc(18) int local18 = arg3.anInt197;
			if (!arg2) {
				if (local18 == -1) {
					local18 = 2001;
				}
				if (local15 == -1) {
					local15 = 2001;
				}
			}
			return local15 - local18;
		} else if (arg1 == 2) {
			return Static27.method501(arg3.method108().aString158, arg0.method108().aString158, Static114.anInt2343);
		} else if (arg1 == 3) {
			if (arg0.aString5.equals("-")) {
				if (arg3.aString5.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString5.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static27.method501(arg3.aString5, arg0.aString5, Static114.anInt2343);
			}
		} else if (arg1 == 4) {
			return arg0.method96() ? (arg3.method96() ? 0 : 1) : (arg3.method96() ? -1 : 0);
		} else if (arg1 == 5) {
			return arg0.method100() ? (arg3.method100() ? 0 : 1) : (arg3.method100() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.method97() ? (arg3.method97() ? 0 : 1) : arg3.method97() ? -1 : 0;
		} else if (arg1 == 7) {
			return arg0.method101() ? (arg3.method101() ? 0 : 1) : arg3.method101() ? -1 : 0;
		} else {
			return arg0.anInt208 - arg3.anInt208;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass39_1 != null && local7.aClass39_1.aLong48 == arg3) {
			return true;
		} else if (local7.aClass18_1 != null && local7.aClass18_1.aLong21 == arg3) {
			return true;
		} else if (local7.aClass124_1 != null && local7.aClass124_1.aLong143 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2573; local46++) {
				if (local7.aClass45Array2[local46].aLong56 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)Lclient!me;")
	public static Class1_Sub5_Sub9_Sub2 method3706(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub5_Sub9_Sub2 local18 = new Class1_Sub5_Sub9_Sub2(arg0, Static192.anIntArray398, Static173.anIntArray353, Static69.anIntArray119, Static206.anIntArray419, Static25.aByteArrayArray19);
			Static176.method3009();
			return local18;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(ZI)V")
	public static void method3709(@OriginalArg(1) int arg0) {
		Static54.anInt1167 = arg0;
		Static55.anInt1176 = -1;
		Static272.anInt5001 = -1;
		Static94.method1798();
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V")
	public static void method3715() {
		@Pc(8) int local8 = Static110.aByteArrayArray7.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static110.aByteArrayArray7[local15] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < Static230.anInt4305; local27++) {
					if (Static135.anIntArray209[local15] == Static293.anIntArray580[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static293.anIntArray580[Static230.anInt4305] = Static135.anIntArray209[local15];
					local25 = Static230.anInt4305++;
				}
				@Pc(71) Class1_Sub13 local71 = new Class1_Sub13(Static110.aByteArrayArray7[local15]);
				@Pc(73) int local73 = 0;
				while (local71.anInt2018 < Static110.aByteArrayArray7[local15].length && local73 < 511 && Static1.anInt48 < 1023) {
					@Pc(99) int local99 = local25 | local73++ << 6;
					@Pc(103) int local103 = local71.method1879();
					@Pc(107) int local107 = local103 >> 14;
					@Pc(113) int local113 = local103 >> 7 & 0x3F;
					@Pc(126) int local126 = local113 + (Static135.anIntArray209[local15] >> 8) * 64 - Static38.anInt714;
					@Pc(130) int local130 = local103 & 0x3F;
					@Pc(144) int local144 = (Static135.anIntArray209[local15] & 0xFF) * 64 + local130 - Static135.anInt2659;
					@Pc(150) Class183 local150 = Static275.method4210(local71.method1879());
					if (Static138.aClass11_Sub4_Sub2Array2[local99] == null && (local150.aByte20 & 0x1) > 0 && local107 == Static247.anInt1590 && local126 >= 0 && local126 + local150.anInt5436 < 104 && local144 >= 0 && local150.anInt5436 + local144 < 104) {
						Static138.aClass11_Sub4_Sub2Array2[local99] = new Class11_Sub4_Sub2();
						@Pc(201) Class11_Sub4_Sub2 local201 = Static138.aClass11_Sub4_Sub2Array2[local99];
						Static288.anIntArray572[Static1.anInt48++] = local99;
						local201.anInt3822 = Static167.anInt637;
						local201.method3365(local150);
						local201.method3352(local201.aClass183_1.anInt5436);
						local201.anInt3853 = local201.anInt3852 = Static54.anIntArray92[local201.aClass183_1.aByte22];
						local201.anInt3813 = local201.aClass183_1.anInt5442;
						if (local201.anInt3813 == 0) {
							local201.anInt3852 = 0;
						}
						local201.anInt3803 = local201.aClass183_1.anInt5425;
						local201.method3355(local144, true, local126, local201.method3347());
					}
				}
			}
		}
	}
}
