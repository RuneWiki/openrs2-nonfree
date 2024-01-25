import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString55;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!tl;")
	public static final Class11_Sub38 aClass11_Sub38_1 = new Class11_Sub38(0, 0);

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt5588 = -1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt5589 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBI)V")
	public static void method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		@Pc(30) int local30 = Static61.method917(Static280.anInt212, arg3 + arg2, Static346.anInt6607);
		@Pc(39) int local39 = Static61.method917(Static280.anInt212, arg3 - arg2, Static346.anInt6607);
		Static224.method5303(Static73.anIntArrayArray6[arg1], local30, arg0, local39);
		while (local9 > local7) {
			local22 += 2;
			local20 += local22;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(97) int local97;
			@Pc(106) int local106;
			if (local20 > 0) {
				local9--;
				local20 -= local9 << 1;
				local71 = arg1 - local9;
				local75 = local9 + arg1;
				if (local75 >= Static240.anInt4829 && local71 <= Static166.anInt3315) {
					local97 = Static61.method917(Static280.anInt212, local7 + arg3, Static346.anInt6607);
					local106 = Static61.method917(Static280.anInt212, arg3 - local7, Static346.anInt6607);
					if (Static166.anInt3315 >= local75) {
						Static224.method5303(Static73.anIntArrayArray6[local75], local97, arg0, local106);
					}
					if (Static240.anInt4829 <= local71) {
						Static224.method5303(Static73.anIntArrayArray6[local71], local97, arg0, local106);
					}
				}
			}
			local7++;
			local71 = arg1 - local7;
			local75 = local7 + arg1;
			if (local75 >= Static240.anInt4829 && local71 <= Static166.anInt3315) {
				local97 = Static61.method917(Static280.anInt212, local9 + arg3, Static346.anInt6607);
				local106 = Static61.method917(Static280.anInt212, arg3 - local9, Static346.anInt6607);
				if (Static166.anInt3315 >= local75) {
					Static224.method5303(Static73.anIntArrayArray6[local75], local97, arg0, local106);
				}
				if (Static240.anInt4829 <= local71) {
					Static224.method5303(Static73.anIntArrayArray6[local71], local97, arg0, local106);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method4709() {
		@Pc(8) int local8 = Static82.aByteArrayArray13.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static82.aByteArrayArray13[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static330.anInt6353; local25++) {
					if (Static157.anIntArray201[local15] == Static315.anIntArray507[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static315.anIntArray507[Static330.anInt6353] = Static157.anIntArray201[local15];
					local23 = Static330.anInt6353++;
				}
				@Pc(64) Class11_Sub25 local64 = new Class11_Sub25(Static82.aByteArrayArray13[local15]);
				@Pc(66) int local66 = 0;
				while (local64.anInt6076 < Static82.aByteArrayArray13[local15].length && local66 < 511 && Static141.anInt2601 < 1023) {
					@Pc(85) int local85 = local23 | local66++ << 6;
					@Pc(89) int local89 = local64.method5187();
					@Pc(93) int local93 = local89 >> 14;
					@Pc(99) int local99 = local89 >> 7 & 0x3F;
					@Pc(103) int local103 = local89 & 0x3F;
					@Pc(116) int local116 = local99 + (Static157.anIntArray201[local15] >> 8) * 64 - Static182.anInt3662;
					@Pc(129) int local129 = (Static157.anIntArray201[local15] & 0xFF) * 64 + local103 - Static169.anInt6312;
					@Pc(135) Class82 local135 = Static156.method2516(local64.method5187());
					if (Static356.aClass67_Sub3_Sub3_Sub1Array1[local85] == null && (local135.aByte13 & 0x1) > 0 && Static141.anInt2602 == local93 && local116 >= 0 && local116 + local135.anInt1871 < Static24.anInt454 && local129 >= 0 && Static240.anInt4832 > local129 + local135.anInt1871) {
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local85] = new Class67_Sub3_Sub3_Sub1();
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local85].anInt5038 = local85;
						@Pc(191) Class67_Sub3_Sub3_Sub1 local191 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local85];
						Static4.anIntArray4[Static141.anInt2601++] = local85;
						local191.anInt5010 = Static293.anInt5807;
						local191.method2677(local135);
						local191.method4367(local191.aClass82_1.anInt1871);
						local191.anInt5055 = local191.aClass82_1.anInt1866 << 3;
						if (local191.anInt5055 == 0) {
							local191.method4371(0);
						} else {
							local191.method4371(local191.aClass82_1.aByte12 + 4 << 11 & 0x3BB8);
						}
						local191.method4376(local116, local93, local191.method4368(), true, local129);
					}
				}
			}
		}
	}
}
