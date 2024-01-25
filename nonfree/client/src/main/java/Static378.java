import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public static int anInt6475;

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Lclient!el;")
	public static final Class109 aClass109_132 = new Class109(17, -1);

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "Lclient!el;")
	public static final Class109 aClass109_133 = new Class109(62, -2);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	public static void method5531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 17);
		local9.method2687();
		local9.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method5532() {
		@Pc(8) int local8 = Static494.aByteArrayArray27.length;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			if (Static494.aByteArrayArray27[local19] != null) {
				@Pc(29) int local29 = -1;
				for (@Pc(31) int local31 = 0; local31 < Static421.anInt7295; local31++) {
					if (Static514.anIntArray503[local31] == Static672.anIntArray621[local19]) {
						local29 = local31;
						break;
					}
				}
				if (local29 == -1) {
					Static514.anIntArray503[Static421.anInt7295] = Static672.anIntArray621[local19];
					local29 = Static421.anInt7295++;
				}
				@Pc(79) Class5_Sub23 local79 = new Class5_Sub23(Static494.aByteArrayArray27[local19]);
				@Pc(81) int local81 = 0;
				while (local79.anInt9869 < Static494.aByteArrayArray27[local19].length && local81 < 511 && Static247.anInt4256 < 1023) {
					@Pc(106) int local106 = local81++ << 6 | local29;
					@Pc(110) int local110 = local79.method8519();
					@Pc(114) int local114 = local110 >> 14;
					@Pc(120) int local120 = local110 >> 7 & 0x3F;
					@Pc(124) int local124 = local110 & 0x3F;
					@Pc(137) int local137 = local120 + (Static672.anIntArray621[local19] >> 8) * 64 - Static622.anInt10188;
					@Pc(149) int local149 = local124 + (Static672.anIntArray621[local19] & 0xFF) * 64 - Static668.anInt10683;
					@Pc(156) Class227 local156 = Static325.aClass231_1.method5363(local79.method8519(), 2);
					@Pc(163) Class5_Sub35 local163 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local106, 1);
					if (local163 == null && (local156.aByte90 & 0x1) > 0 && Static559.anInt9430 == local114 && local137 >= 0 && Static544.anInt9261 > local156.anInt6248 + local137 && local149 >= 0 && Static282.anInt4887 > local149 + local156.anInt6248) {
						@Pc(215) Class8_Sub1_Sub3_Sub2_Sub2 local215 = new Class8_Sub1_Sub3_Sub2_Sub2();
						local215.anInt6994 = local106;
						@Pc(223) Class5_Sub35 local223 = new Class5_Sub35(local215);
						Static623.aClass291_43.method6984((long) local106, local223);
						Static85.aClass5_Sub35Array1[Static230.anInt3776++] = local223;
						Static671.anIntArray620[Static247.anInt4256++] = local106;
						local215.anInt7040 = Static44.anInt740;
						local215.method6004(local156);
						local215.method5987(local215.aClass227_1.anInt6248);
						local215.anInt7020 = local215.aClass227_1.anInt6262 << 3;
						local215.method5995(local215.aClass227_1.aByte83 + 4 << 11 & 0x3A26, true);
						local215.method6012(local149, true, local137, local215.method5993(), local114);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V")
	public static void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.anInt3315 = arg1;
		Static539.anInt9220 = arg0;
		if (Static659.anInt10597 == 0) {
			Static370.anInt10370 = Static174.anInt2965 * 2 + Static116.anInt3315;
			Static227.anInt3689 = Static539.anInt9220 + Static242.anInt4086 * 2;
		} else if (Static659.anInt10597 == 1) {
			Static171.anInt2921 = Static116.anInt3315 / Static625.anInt10198 + Static53.anInt841 + 2;
			Static3.anInt23 = Static649.anInt5978 + Static539.anInt9220 / Static324.anInt10471 + 2;
			Static370.anInt10370 = Static625.anInt10198 * Static171.anInt2921;
			Static227.anInt3689 = Static324.anInt10471 * Static3.anInt23;
			Static174.anInt2965 = Static370.anInt10370 - Static116.anInt3315 >> 1;
			Static242.anInt4086 = Static227.anInt3689 - Static539.anInt9220 >> 1;
		} else if (Static659.anInt10597 == 2) {
			Static227.anInt3689 = Static539.anInt9220;
			Static370.anInt10370 = Static116.anInt3315;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLclient!mca;Ljava/lang/Object;)V")
	public static void method5535(@OriginalArg(1) Class230 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static351.method5279(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(55) Exception local55) {
		}
	}
}
