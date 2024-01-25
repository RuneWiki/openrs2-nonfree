import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_38 = new Class61(62, 7);

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static final int anInt3574 = 0;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public static int anInt3575 = 0;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "S")
	public static short aShort54 = 32767;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
	public static final int[] anIntArray353 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)B")
	public static byte method3179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method3180() {
		if (Static189.aClass4_Sub2_Sub1_1.method7667(Static403.anInt6994) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static523.anInt8897 - 4 & 0xFF);
		@Pc(23) int local23 = Static523.anInt8897 % Static38.anInt740;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static38.anInt741; local29++) {
				Static567.aByteArrayArrayArray21[local25][local23][local29] = local19;
			}
		}
		if (Static320.anInt5748 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static8.anIntArray700[local29] = -1000000;
			Static269.anIntArray445[local29] = 1000000;
			Static242.anIntArray425[local29] = 0;
			Static277.anIntArray450[local29] = 1000000;
			Static83.anIntArray721[local29] = 0;
		}
		@Pc(91) int local91 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
		@Pc(94) int local94 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
		@Pc(107) int local107;
		if (Static555.anInt9335 != 1 && Static380.anInt6749 == -1) {
			local107 = Static160.method3164(Static473.anInt7978, Static320.anInt5748, Static563.anInt9436);
			if (local107 - Static569.anInt4616 < 3200 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][Static473.anInt7978 >> 9][Static563.anInt9436 >> 9] & 0x4) != 0) {
				Static389.method5711(Static309.aClass100ArrayArrayArray2, 1, Static563.anInt9436 >> 9, false, Static473.anInt7978 >> 9);
				return;
			}
			return;
		}
		if (Static555.anInt9335 != 1) {
			local91 = Static380.anInt6749;
			local94 = Static140.anInt3147;
		}
		if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local91 >> 9][local94 >> 9] & 0x4) != 0) {
			Static389.method5711(Static309.aClass100ArrayArrayArray2, 0, local94 >> 9, false, local91 >> 9);
		}
		if (Static348.anInt6087 >= 2560) {
			return;
		}
		local107 = Static473.anInt7978 >> 9;
		@Pc(190) int local190 = Static563.anInt9436 >> 9;
		@Pc(194) int local194 = local91 >> 9;
		@Pc(198) int local198 = local94 >> 9;
		@Pc(205) int local205;
		if (local107 >= local194) {
			local205 = local107 - local194;
		} else {
			local205 = local194 - local107;
		}
		@Pc(222) int local222;
		if (local198 <= local190) {
			local222 = local190 - local198;
		} else {
			local222 = local198 - local190;
		}
		if (local205 == 0 && local222 == 0 || local205 <= -Static38.anInt740 || Static38.anInt740 <= local205 || local222 <= -Static38.anInt741 || Static38.anInt741 <= local222) {
			Static473.method6593(null, "RC: " + local107 + "," + local190 + " " + local194 + "," + local198 + " " + Static373.anInt6695 + "," + Static6.anInt97);
			return;
		}
		@Pc(302) int local302;
		@Pc(304) int local304;
		if (local205 > local222) {
			local302 = local222 * 65536 / local205;
			local304 = 32768;
			while (local107 != local194) {
				if (local194 > local107) {
					local107++;
				} else if (local194 < local107) {
					local107--;
				}
				if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local107][local190] & 0x4) != 0) {
					Static389.method5711(Static309.aClass100ArrayArrayArray2, 1, local190, false, local107);
					return;
				}
				local304 += local302;
				if (local304 >= 65536) {
					if (local190 < local198) {
						local190++;
					} else if (local198 < local190) {
						local190--;
					}
					local304 -= 65536;
					if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local107][local190] & 0x4) != 0) {
						Static389.method5711(Static309.aClass100ArrayArrayArray2, 1, local190, false, local107);
						return;
					}
				}
			}
			return;
		}
		local302 = local205 * 65536 / local222;
		local304 = 32768;
		while (local198 != local190) {
			if (local190 < local198) {
				local190++;
			} else if (local190 > local198) {
				local190--;
			}
			if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local107][local190] & 0x4) != 0) {
				Static389.method5711(Static309.aClass100ArrayArrayArray2, 1, local190, false, local107);
				return;
			}
			local304 += local302;
			if (local304 >= 65536) {
				if (local107 < local194) {
					local107++;
				} else if (local194 < local107) {
					local107--;
				}
				local304 -= 65536;
				if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local107][local190] & 0x4) != 0) {
					Static389.method5711(Static309.aClass100ArrayArrayArray2, 1, local190, false, local107);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method3182(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 < 10) {
				local50[local58] = (char) (local76 + 48);
			} else {
				local50[local58] = (char) (local76 + 87);
			}
		}
		return new String(local50);
	}
}
