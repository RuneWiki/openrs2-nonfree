import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_95 = new Class231(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!oq", name = "Kb", descriptor = "[I")
	public static final int[] anIntArray464 = new int[14];

	@OriginalMember(owner = "client!oq", name = "Pb", descriptor = "I")
	public static int anInt5465 = 0;

	@OriginalMember(owner = "client!oq", name = "Rb", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_72 = new Class208(26, 8);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZI)I")
	public static int method4312(@OriginalArg(2) int arg0) {
		@Pc(14) Class2_Sub12 local14 = Static92.method1397(arg0, false);
		if (local14 == null) {
			return Static106.aClass245_1.method5648(arg0).anInt4234;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray212.length; local26++) {
			if (local14.anIntArray212[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static106.aClass245_1.method5648(arg0).anInt4234 - local14.anIntArray212.length;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!gh;I)V")
	public static void method4316(@OriginalArg(0) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(16) Class2_Sub3 local16 = (Class2_Sub3) Static271.aClass220_24.method5099((long) arg0.anInt7670);
		if (local16 == null) {
			Static238.method3230(arg0.aByte101, null, 0, arg0.anIntArray633[0], arg0.anIntArray632[0], null, arg0);
		} else {
			local16.method337();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method4318(@OriginalArg(0) Class75 arg0) {
		@Pc(5) int local5 = Static281.anInt4448;
		@Pc(7) int local7 = Static168.anInt6340;
		@Pc(9) int local9 = Static204.anInt3495;
		@Pc(11) int local11 = Static407.anInt7040;
		arg0.method5996(local11, local7, -10660793, local5, local9);
		arg0.method5996(16, local7 + 1, -16777216, local5 - -1, local9 - 2);
		arg0.method5993(-16777216, local11 - 19, local7 + 18, local5 + 1, local9 + -2);
		Static143.aClass14_2.method4886(-10660793, -1, Static14.aClass231_7.method5261(Static80.anInt6195), local5 + 3, local7 + 14);
		@Pc(79) int local79 = Static196.aClass126_1.method5366();
		@Pc(83) int local83 = Static196.aClass126_1.method5364();
		@Pc(85) int local85 = 0;
		for (@Pc(90) Class2_Sub35 local90 = (Class2_Sub35) Static93.aClass181_7.method3972(); local90 != null; local90 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			@Pc(104) int local104 = (Static377.anInt6585 - local85 - 1) * 16 + local7 + 31;
			@Pc(106) short local106 = -1;
			if (local5 < local79 && local9 + local5 > local79 && local104 - 13 < local83 && local83 < local104 + 3 && local90.aBoolean413) {
				local106 = -256;
			}
			@Pc(147) int[] local147 = null;
			if (Static315.method4489(local90.anInt5875)) {
				local147 = Static413.aClass271_2.method6193((int) local90.aLong299).anIntArray521;
			} else if (local90.anInt5878 != -1) {
				local147 = Static413.aClass271_2.method6193(local90.anInt5878).anIntArray521;
			} else if (Static188.method5359(local90.anInt5875)) {
				@Pc(187) Class2_Sub34 local187 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local90.aLong299);
				if (local187 != null) {
					@Pc(192) Class11_Sub5_Sub2_Sub2 local192 = local187.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(195) Class82 local195 = local192.aClass82_1;
					if (local195.anIntArray149 != null) {
						local195 = local195.method1888(Static63.aClass120_2);
					}
					if (local195 != null) {
						local147 = local195.anIntArray151;
					}
				}
			} else if (Static459.method6243(local90.anInt5875)) {
				@Pc(229) Class192 local229;
				if (local90.anInt5875 == 1007) {
					local229 = Static249.aClass39_2.method748((int) local90.aLong299);
				} else {
					local229 = Static249.aClass39_2.method748((int) (local90.aLong299 >>> 32 & 0x7FFFFFFFL));
				}
				if (local229.anIntArray462 != null) {
					local229 = local229.method4323(Static63.aClass120_2);
				}
				if (local229 != null) {
					local147 = local229.anIntArray460;
				}
			}
			@Pc(258) String local258 = Static48.method741(local90);
			if (local147 != null) {
				local258 = local258 + Static148.method2251(local147);
			}
			Static143.aClass14_2.method4894(local104, Static112.anIntArray145, local5 + 3, local106, local258, Static243.aClass41Array8);
			local85++;
			if (local90.aBoolean414) {
				Static446.aClass41_19.method6090(local5 + Static9.aClass15_9.method320(local258) + 5, local104 + -12);
			}
		}
		Static449.method6080(Static204.anInt3495, Static168.anInt6340, Static407.anInt7040, Static281.anInt4448);
	}
}
