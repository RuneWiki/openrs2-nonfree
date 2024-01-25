import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!aq", name = "bb", descriptor = "I")
	public static int anInt502;

	@OriginalMember(owner = "client!aq", name = "cb", descriptor = "Lclient!sl;")
	public static Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!da;Lclient!ha;IZLclient!jl;Ljava/lang/String;)V")
	public static void method603(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class183 arg3, @OriginalArg(5) String arg4) {
		@Pc(16) boolean local16 = !Static110.aBoolean191 || Static224.method3611();
		if (!local16) {
			return;
		}
		@Pc(38) int local38;
		@Pc(47) int local47;
		if (Static110.aBoolean191 && local16) {
			@Pc(25) Class183 local25 = Static307.aClass183_8;
			@Pc(31) Class37 local31 = arg1.method8136(local25, Static121.aClass139Array1);
			local38 = local25.method4452(250, (Class31[]) null, arg4);
			local47 = local25.method4456((Class31[]) null, arg4, 250, local25.anInt5073);
			@Pc(50) int local50 = Static221.aClass139_3.anInt3984;
			@Pc(54) int local54 = local50 + 4;
			local47 += local54 * 2;
			local38 += local54 * 2;
			if (Static136.anInt2908 > local47) {
				local47 = Static136.anInt2908;
			}
			if (Static339.anInt5961 > local38) {
				local38 = Static339.anInt5961;
			}
			@Pc(88) int local88 = Static480.aClass97_13.method2304(local38, Static143.anInt2998) + Static404.anInt6891;
			@Pc(97) int local97 = Static116.aClass252_3.method6014(local47, Static478.anInt7732) + Static519.anInt8389;
			if (Static148.aBoolean241) {
				local88 += Static100.method1939();
				local97 += Static260.method4303();
			}
			arg1.method8141(Static513.aClass139_7, false).method8808(local88 + Static274.aClass139_4.anInt3984, local97 + Static274.aClass139_4.anInt3983, local38 - Static274.aClass139_4.anInt3984 * 2, -(Static274.aClass139_4.anInt3983 * 2) + local47, 1, 0, 0);
			arg1.method8141(Static274.aClass139_4, true).method8793(local88, local97);
			Static274.aClass139_4.method3459();
			arg1.method8141(Static274.aClass139_4, true).method8793(local88 + local38 - local50, local97);
			Static274.aClass139_4.method3449();
			arg1.method8141(Static274.aClass139_4, true).method8793(local88 + local38 - local50, local97 - -local47 + -local50);
			Static274.aClass139_4.method3459();
			arg1.method8141(Static274.aClass139_4, true).method8793(local88, local97 + local47 - local50);
			Static274.aClass139_4.method3449();
			arg1.method8141(Static221.aClass139_3, true).method8810(local88, Static274.aClass139_4.anInt3983 + local97, local50, local47 - Static274.aClass139_4.anInt3983 * 2);
			Static221.aClass139_3.method3453();
			arg1.method8141(Static221.aClass139_3, true).method8810(local88 + Static274.aClass139_4.anInt3984, local97, local38 - Static274.aClass139_4.anInt3984 * 2, local50);
			Static221.aClass139_3.method3453();
			arg1.method8141(Static221.aClass139_3, true).method8810(local38 + local88 - local50, Static274.aClass139_4.anInt3983 + local97, local50, local47 - Static274.aClass139_4.anInt3983 * 2);
			Static221.aClass139_3.method3453();
			arg1.method8141(Static221.aClass139_3, true).method8810(Static274.aClass139_4.anInt3984 + local88, local97 + local47 + -local50, local38 - Static274.aClass139_4.anInt3984 * 2, local50);
			Static221.aClass139_3.method3453();
			local31.method6078(1, local97 + local54, Static470.anInt7590 | 0xFF000000, local54 + local88, -(local54 * 2) + local38, 0, 1, (int[]) null, local47 - local54 * 2, -1, 0, 0, (Class1) null, arg4, (Class31[]) null);
			Static437.method6296(local97, local38, local47, local88);
		} else {
			local38 = arg3.method4452(250, (Class31[]) null, arg4);
			local47 = arg3.method4450((Class31[]) null, 250, arg4) * 13;
			arg1.aa(6, 6, local38 + 4 + 4, local47 + 4 + 4, -16777216, 0);
			arg1.method8104(6, 6, local38 + 4 + 4, local47 + 4 + 4, -1, 0);
			arg0.method6078(1, 10, -1, 10, local38, 0, 1, (int[]) null, local47, -1, 0, 0, (Class1) null, arg4, (Class31[]) null);
			Static437.method6296(6, local38 + 4 + 4, local47 + 4 + 4, 6);
		}
		if (!arg2) {
			return;
		}
		try {
			if (Static148.aBoolean241) {
				Static601.method8464();
			} else {
				arg1.method8129();
			}
		} catch (@Pc(446) Exception_Sub1 local446) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public static void method604() {
		@Pc(13) int local13 = Static502.aByteArrayArray26.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static502.aByteArrayArray26[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static177.anInt3581; local25++) {
					if (Static637.anIntArray682[local25] == Static635.anIntArray728[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static637.anIntArray682[Static177.anInt3581] = Static635.anIntArray728[local15];
					local23 = Static177.anInt3581++;
				}
				@Pc(69) Class2_Sub17 local69 = new Class2_Sub17(Static502.aByteArrayArray26[local15]);
				@Pc(71) int local71 = 0;
				while (local69.anInt3378 < Static502.aByteArrayArray26[local15].length && local71 < 511 && Static317.anInt5602 < 1023) {
					@Pc(92) int local92 = local23 | local71++ << 6;
					@Pc(96) int local96 = local69.method2825();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = (Static635.anIntArray728[local15] >> 8) * 64 + local106 - Static406.anInt6899;
					@Pc(136) int local136 = local110 + (Static635.anIntArray728[local15] & 0xFF) * 64 - Static338.anInt5885;
					@Pc(143) Class113 local143 = Static137.aClass366_1.method8551(local69.method2825());
					@Pc(150) Class2_Sub32 local150 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local92);
					if (local150 == null && (local143.aByte57 & 0x1) > 0 && local100 == Static245.anInt4753 && local123 >= 0 && Static456.anInt7428 > local123 + local143.anInt3238 && local136 >= 0 && Static5.anInt112 > local136 + local143.anInt3238) {
						@Pc(189) Class16_Sub1_Sub1_Sub3_Sub1 local189 = new Class16_Sub1_Sub1_Sub3_Sub1();
						local189.anInt8075 = local92;
						@Pc(197) Class2_Sub32 local197 = new Class2_Sub32(local189);
						Static514.aClass323_32.method7477(local197, (long) local92);
						Static480.aClass2_Sub32Array1[Static608.anInt10053++] = local197;
						Static363.anIntArray409[Static317.anInt5602++] = local92;
						local189.anInt8110 = Static389.anInt6694;
						local189.method1409(local143);
						local189.method7005(local189.aClass113_1.anInt3238);
						local189.anInt8130 = local189.aClass113_1.anInt3233 << 3;
						local189.method7000(true, local189.aClass113_1.aByte62 + 4 << 11 & 0x3C29);
						local189.method1410(local189.method6999(), true, local123, local100, local136);
					}
				}
			}
		}
	}
}
