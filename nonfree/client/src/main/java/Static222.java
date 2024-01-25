import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_118 = new Class151("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!sq;Z)Z")
	public static boolean method2947(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static202.aClass163Array2 == Static164.aClass163Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5096();
		if (arg0.aShort85 < 0 || arg0.aShort88 < 0 || arg0.aShort87 >= Static362.anInt6113 || arg0.aShort86 >= Static195.anInt3127) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort85; local34 <= arg0.aShort87; local34++) {
			for (local38 = arg0.aShort88; local38 <= arg0.aShort86; local38++) {
				@Pc(45) Class82 local45 = Static15.method238(arg0.aByte89, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort85) {
						local49++;
					}
					if (local34 < arg0.aShort87) {
						local49 += 4;
					}
					if (local38 > arg0.aShort88) {
						local49 += 8;
					}
					if (local38 < arg0.aShort86) {
						local49 += 2;
					}
					@Pc(74) Class146 local74 = Static43.method4054(local49, arg0);
					@Pc(77) Class146 local77 = local45.aClass146_1;
					if (local77 == null) {
						local45.aClass146_1 = local74;
					} else {
						while (local77.aClass146_3 != null) {
							local77 = local77.aClass146_3;
						}
						local77.aClass146_3 = local74;
					}
					local45.aByte21 = (byte) (local45.aByte21 | local49);
					if (local6 && (Static223.anIntArrayArray91[local34][local38] & 0xFF000000) != 0) {
						local8 = Static223.anIntArrayArray91[local34][local38];
						local10 = Static106.aByteArrayArray14[local34][local38];
						local12 = Static132.aByteArrayArray16[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort85; local38 <= arg0.aShort87; local38++) {
				for (@Pc(150) int local150 = arg0.aShort88; local150 <= arg0.aShort86; local150++) {
					if ((Static223.anIntArrayArray91[local38][local150] & 0xFF000000) == 0) {
						Static223.anIntArrayArray91[local38][local150] = local8;
						Static106.aByteArrayArray14[local38][local150] = local10;
						Static132.aByteArrayArray16[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static183.aClass20_Sub3Array5[Static253.anInt4090++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!jd;IIIII)V")
	public static void method2948(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5076 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static112.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class71 local35 = Static280.aClass71Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5076; local37++) {
							if (arg0.aClass1_Sub24Array3[local37] == local35.aClass1_Sub24_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub24Array3[arg0.anInt5076++] = local35.aClass1_Sub24_1;
						if (arg0.anInt5076 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5076; local7 < 4; local7++) {
			arg0.aClass1_Sub24Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!vg;I)I")
	public static int method2951(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1) {
		if (!Static52.method804(arg1).method1721(arg0) && arg1.anObjectArray27 == null) {
			return -1;
		} else if (arg1.anIntArray465 == null || arg0 >= arg1.anIntArray465.length) {
			return -1;
		} else {
			return arg1.anIntArray465[arg0];
		}
	}
}
