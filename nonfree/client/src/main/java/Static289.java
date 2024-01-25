import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
	public static int anInt4927 = 0;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[6][];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method4549(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static549.method7862(local13) : local13;
		} else if (arg0 instanceof Class159) {
			@Pc(27) Class159 local27 = (Class159) arg0;
			return local27.method4166();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4553(@OriginalArg(0) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static82.aBoolean134) {
			local7 = Static31.method748();
			local9 = Static147.method2738();
		}
		@Pc(23) int local23 = local7 + Static600.anInt9624;
		@Pc(27) int local27 = local9 + Static436.anInt6913;
		@Pc(29) int local29 = Static368.anInt5940;
		@Pc(33) int local33 = Static627.anInt10020 - 3;
		Static617.method8709(local9 + Static436.anInt6913, Static368.anInt5940, Static627.anInt10020, Static600.anInt9624 + local7, arg0, Static601.aClass346_26.method8440(Static609.anInt9834));
		@Pc(61) int local61 = Static22.aClass16_2.method5885() + local7;
		@Pc(67) int local67 = local9 + Static22.aClass16_2.method5887();
		@Pc(71) int local71;
		@Pc(78) Class3_Sub11_Sub8 local78;
		@Pc(90) int local90;
		@Pc(193) int local193;
		@Pc(269) Class3_Sub11_Sub14 local269;
		@Pc(180) Class3_Sub11_Sub14 local180;
		if (Static439.aBoolean510) {
			local71 = 0;
			for (local78 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local78 != null; local78 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
				local90 = local71 * 16 + local27 + 13 + 20;
				if (local7 + Static600.anInt9624 < local61 && Static600.anInt9624 + local7 + Static368.anInt5940 > local61 && local90 - 13 < local67 && local90 + 4 > local67 && (local78.anInt3796 > 1 || ((Class3_Sub11_Sub14) local78.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67).aBoolean478)) {
					arg0.aa(local7 + Static600.anInt9624, local90 + -12, Static368.anInt5940, 16, 255 - Static14.anInt142 << 24 | Static534.anInt8816, 1);
				}
				local71++;
			}
			if (Static142.aClass3_Sub11_Sub8_1 != null) {
				Static617.method8709(Static544.anInt8963, Static159.anInt3122, Static673.anInt10857, Static451.anInt7467, arg0, Static142.aClass3_Sub11_Sub8_1.aString31);
				local71 = 0;
				for (local180 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1842(); local180 != null; local180 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1844()) {
					local193 = Static544.anInt8963 + local71 * 16 + 13 + 20;
					if (local61 > Static451.anInt7467 && local61 < Static159.anInt3122 + Static451.anInt7467 && local193 - 13 < local67 && local193 + 4 > local67 && local180.aBoolean478) {
						arg0.aa(Static451.anInt7467, local193 - 12, Static159.anInt3122, 16, 255 - Static14.anInt142 << 24 | Static534.anInt8816, 1);
					}
					local71++;
				}
				Static483.method7015(Static159.anInt3122, Static673.anInt10857, Static544.anInt8963, Static451.anInt7467, arg0);
			}
		} else {
			local71 = 0;
			for (local269 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local269 != null; local269 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				local90 = (Static450.anInt7444 - local71 - 1) * 16 + local27 + 33;
				if (Static600.anInt9624 + local7 < local61 && local61 < Static368.anInt5940 + Static600.anInt9624 + local7 && local90 - 13 < local67 && local90 + 4 > local67 && local269.aBoolean478) {
					arg0.aa(local7 + Static600.anInt9624, local90 + -12, Static368.anInt5940, 16, Static534.anInt8816 | 255 - Static14.anInt142 << 24, 1);
				}
				local71++;
			}
		}
		Static483.method7015(Static368.anInt5940, Static627.anInt10020, Static436.anInt6913 + local9, local7 + Static600.anInt9624, arg0);
		if (Static439.aBoolean510) {
			local71 = 0;
			for (local78 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local78 != null; local78 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
				local90 = local71 * 16 + local9 + Static436.anInt6913 + 20 + 13;
				local71++;
				if (local78.anInt3796 == 1) {
					Static1.method5541(Static368.anInt5940, local90, local67, local9 + Static436.anInt6913, arg0, (Class3_Sub11_Sub14) local78.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67, local61, Static158.anInt926 | 0xFF000000, local7 + Static600.anInt9624, Static175.anInt3464 | 0xFF000000, Static627.anInt10020);
				} else {
					Static323.method4164(local67, local9 + Static436.anInt6913, arg0, local7 + Static600.anInt9624, Static158.anInt926 | 0xFF000000, Static175.anInt3464 | 0xFF000000, Static368.anInt5940, Static627.anInt10020, local61, local78, local90);
				}
			}
			if (Static142.aClass3_Sub11_Sub8_1 != null) {
				local71 = 0;
				for (local180 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1842(); local180 != null; local180 = (Class3_Sub11_Sub14) Static142.aClass3_Sub11_Sub8_1.aClass74_4.method1844()) {
					local193 = local71 * 16 + Static544.anInt8963 + 13 + 20;
					Static1.method5541(Static159.anInt3122, local193, local67, Static544.anInt8963, arg0, local180, local61, Static158.anInt926 | 0xFF000000, Static451.anInt7467, Static175.anInt3464 | 0xFF000000, Static673.anInt10857);
					local71++;
				}
				Static41.method1054(Static673.anInt10857, Static159.anInt3122, Static544.anInt8963, Static451.anInt7467);
			}
		} else {
			local71 = 0;
			for (local269 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local269 != null; local269 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				local90 = local27 + (-local71 + -1 + Static450.anInt7444) * 16 + 13 + 20;
				local71++;
				Static1.method5541(local29, local90, local67, local27, arg0, local269, local61, Static158.anInt926 | 0xFF000000, local23, Static175.anInt3464 | 0xFF000000, local33);
			}
		}
		Static41.method1054(Static627.anInt10020, Static368.anInt5940, local9 + Static436.anInt6913, Static600.anInt9624 + local7);
	}
}
