import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method3167() {
		@Pc(8) int local8 = Static164.aByteArrayArray27.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (Static164.aByteArrayArray27[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static128.anInt7164; local28++) {
					if (Static144.anIntArray288[local18] == Static319.anIntArray536[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static319.anIntArray536[Static128.anInt7164] = Static144.anIntArray288[local18];
					local26 = Static128.anInt7164++;
				}
				@Pc(67) Class10_Sub8 local67 = new Class10_Sub8(Static164.aByteArrayArray27[local18]);
				@Pc(69) int local69 = 0;
				while (Static164.aByteArrayArray27[local18].length > local67.anInt2989 && local69 < 511 && Static219.anInt4155 < 1023) {
					@Pc(90) int local90 = local69++ << 6 | local26;
					@Pc(94) int local94 = local67.method2485();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(122) int local122 = (Static144.anIntArray288[local18] >> 8) * 64 + local104 - Static168.anInt3353;
					@Pc(135) int local135 = (Static144.anIntArray288[local18] & 0xFF) * 64 + local108 - Static72.anInt1488;
					@Pc(142) Class222 local142 = Static448.aClass38_4.method866(local67.method2485());
					@Pc(149) Class10_Sub26 local149 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local90);
					if (local149 == null && (local142.aByte82 & 0x1) > 0 && local98 == Static166.anInt3284 && local122 >= 0 && Static2.anInt7 > local122 + local142.anInt6351 && local135 >= 0 && Static17.anInt315 > local135 + local142.anInt6351) {
						@Pc(194) Class24_Sub3_Sub2_Sub1 local194 = new Class24_Sub3_Sub2_Sub1();
						local194.anInt6228 = local90;
						@Pc(202) Class10_Sub26 local202 = new Class10_Sub26(local194);
						Static424.aClass167_33.method3705(local202, (long) local90);
						Static149.aClass10_Sub26Array1[Static134.anInt2764++] = local202;
						Static57.anIntArray91[Static219.anInt4155++] = local90;
						local194.anInt6234 = Static400.anInt6752;
						local194.method2892(local142);
						local194.method4917(local194.aClass222_1.anInt6351);
						local194.anInt6219 = local194.aClass222_1.anInt6358 << 3;
						local194.method4907(true, local194.aClass222_1.aByte84 + 4 << 11 & 0x38F2);
						local194.method2889(true, local122, local194.method4919(), local135, local98);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!gh;IIBIILclient!o;Lclient!ta;)V")
	public static void method3168(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class80 arg5, @OriginalArg(7) Class49 arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static157.anInt3176 == 4) {
			local18 = (int) Static149.aFloat53 & 0x3FFF;
		} else {
			local18 = (int) Static149.aFloat53 + Static419.anInt7040 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg0.anInt2703 / 2, arg0.anInt2682 / 2) + 10;
		@Pc(49) int local49 = arg4 * arg4 + arg3 * arg3;
		if (local40 * local40 < local49) {
			return;
		}
		@Pc(63) int local63 = Class250.anIntArray675[local18];
		@Pc(67) int local67 = Class250.anIntArray674[local18];
		if (Static157.anInt3176 != 4) {
			local63 = local63 * 256 / (Static394.anInt6667 + 256);
			local67 = local67 * 256 / (Static394.anInt6667 + 256);
		}
		@Pc(98) int local98 = arg4 * local67 + arg3 * local63 >> 15;
		@Pc(109) int local109 = arg3 * local67 - local63 * arg4 >> 15;
		arg5.method5562(local98 + arg0.anInt2703 / 2 + arg2 - arg5.RA() / 2, arg0.anInt2682 / 2 + arg1 + -local109 + -(arg5.Q() / 2), arg6, arg2, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public static int method3169() {
		return Static68.anInt1468;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)I")
	public static int method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static121.method2092(arg0 - 1, arg1 + -1) + Static121.method2092(arg0 + 1, arg1 + -1) + Static121.method2092(arg0 - 1, arg1 - -1) + Static121.method2092(arg0 + 1, arg1 + 1);
		@Pc(75) int local75 = Static121.method2092(arg0 - 1, arg1) + Static121.method2092(arg0 + 1, arg1) + Static121.method2092(arg0, arg1 - 1) + Static121.method2092(arg0, arg1 - -1);
		@Pc(80) int local80 = Static121.method2092(arg0, arg1);
		return local75 / 8 + local46 / 16 + local80 / 4;
	}
}
