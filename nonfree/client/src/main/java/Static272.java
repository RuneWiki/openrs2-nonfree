import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_33 = new Class210();

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	public static int anInt4881 = 1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!fc;ZLjava/lang/String;)Lclient!nf;")
	public static Class159 method4277(@OriginalArg(1) Class71 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(17) int local17 = arg0.method1568(arg2);
		if (local17 == -1) {
			return new Class159(0);
		}
		@Pc(31) int[] local31 = arg0.method1552(local17);
		@Pc(37) Class159 local37 = new Class159(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt4270 > local39) {
				@Pc(55) Class2_Sub13 local55 = new Class2_Sub13(arg0.method1555(local17, local31[local41++]));
				@Pc(59) int local59 = local55.method4239();
				@Pc(63) int local63 = local55.method4245();
				@Pc(67) int local67 = local55.method4240();
				if (!arg1 && local67 == 1) {
					local37.anInt4270--;
				} else {
					local37.anIntArray519[local39] = local59;
					local37.anIntArray520[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIILclient!km;)V")
	public static void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class82 arg4) {
		arg4.method4477(arg1, arg0, arg1 + arg2, arg3 + arg0);
		arg4.method4486(arg3, arg2, arg1, -16777216, arg0);
		if (Static74.anInt4012 < 100) {
			return;
		}
		@Pc(40) float local40 = (float) Static302.anInt389 / (float) Static302.anInt393;
		@Pc(42) int local42 = arg2;
		@Pc(44) int local44 = arg3;
		if (local40 < 1.0F) {
			local44 = (int) ((float) arg2 * local40);
		} else {
			local42 = (int) ((float) arg3 / local40);
		}
		@Pc(70) int local70 = arg0 + (arg3 - local44) / 2;
		@Pc(79) int local79 = arg1 + (arg2 - local42) / 2;
		if (Static384.aClass5_17 == null || Static384.aClass5_17.method5002() != arg2 || arg3 != Static384.aClass5_17.method4999()) {
			Static302.method471(Static302.anInt396, Static302.anInt389 + Static302.anInt387, Static302.anInt393 + Static302.anInt396, Static302.anInt387, local79, local70, local42 + local79, local44 + local70);
			Static302.method474(arg4);
			Static384.aClass5_17 = arg4.method4501(local79, local70, local42, local44, false);
		}
		Static384.aClass5_17.method5004(local79, local70);
		@Pc(130) int local130 = local42 * Static134.anInt2482 / Static302.anInt393;
		@Pc(136) int local136 = local44 * Static92.anInt1721 / Static302.anInt389;
		@Pc(145) int local145 = local79 + local42 * Static363.anInt5935 / Static302.anInt393;
		@Pc(158) int local158 = local44 + local70 - local44 * Static86.anInt5376 / Static302.anInt389 - local136;
		@Pc(160) int local160 = -1996554240;
		if (Static209.aClass48_2 == Static77.aClass48_1) {
			local160 = -1996488705;
		}
		arg4.method4482(local145, local158, local130, local136, local160, 1);
		arg4.method4552(local145, local158, local130, local136, local160, 0);
		if (Static276.anInt4916 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static269.anInt4775 <= 50) {
			local195 = Static269.anInt4775 * 5;
		} else {
			local195 = (100 - Static269.anInt4775) * 5;
		}
		for (@Pc(208) Class2_Sub20 local208 = (Class2_Sub20) Static302.aClass210_4.method5035(); local208 != null; local208 = (Class2_Sub20) Static302.aClass210_4.method5037()) {
			@Pc(216) Class80 local216 = Static302.aClass211_2.method5049(local208.anInt3000);
			if (Static376.method5643(local216)) {
				@Pc(245) int local245;
				@Pc(257) int local257;
				if (local208.anInt3000 == Static10.anInt307) {
					local245 = local79 + local208.anInt2998 * local42 / Static302.anInt393;
					local257 = (Static302.anInt389 - local208.anInt3001) * local44 / Static302.anInt389 + local70;
					arg4.method4486(4, 4, local245 - 2, local195 << 24 | 0xFFFF00, local257 - 2);
				} else if (Static358.anInt6273 != -1 && Static358.anInt6273 == local216.anInt2039) {
					local245 = local79 + local208.anInt2998 * local42 / Static302.anInt393;
					local257 = local70 + local44 * (Static302.anInt389 - local208.anInt3001) / Static302.anInt389;
					arg4.method4486(4, 4, local245 - 2, local195 << 24 | 0xFFFF00, local257 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)S")
	public static short method4279(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(41) int local41 = local19 + local37;
		@Pc(55) int local55;
		if (local41 == 0) {
			local55 = local37 << 1;
		} else {
			local55 = (local37 << 8) / local41;
		}
		return (short) (local55 >> 4 << 7 | local9 << 10 | local41);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4280(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static19.method552(Static286.aClass41_156);
		Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg1) + 1);
		Static39.aClass2_Sub13_Sub2_4.method4230(arg1);
		Static39.aClass2_Sub13_Sub2_4.method4236(arg0);
	}
}
