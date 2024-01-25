import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!en;")
	public static final Class84 aClass84_4 = new Class84("", 12);

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_25 = new Class207(5);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ct;)V")
	public static void method4007(@OriginalArg(0) Class49 arg0) {
		if (Static356.anInt6520 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub24 local6 = arg0.aClass1_Sub24_1;
		Static31.aClass49Array1[Static356.anInt6520] = arg0;
		Static328.aBooleanArray27[Static356.anInt6520] = false;
		Static356.anInt6520++;
		@Pc(21) int local21 = arg0.anInt1425;
		if (arg0.aBoolean90) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt1425;
		if (arg0.aBoolean89) {
			local29 = Static119.anInt2474 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7608() + Static513.anInt8858 - local6.method7610() >> Static166.anInt7796;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7608() + local6.method7610() - Static513.anInt8858 >> Static166.anInt7796;
			if (local73 >= Static191.anInt3757) {
				local73 = Static191.anInt3757 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray10[local41++];
				@Pc(105) int local105 = (local6.method7609() + Static513.anInt8858 - local6.method7610() >> Static166.anInt7796) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static327.anInt5993) {
					local113 = Static327.anInt5993 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static121.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static121.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static356.anInt6520;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static121.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static356.anInt6520 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static121.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static356.anInt6520 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static121.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static356.anInt6520 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method4010() {
		@Pc(5) int local5;
		if (Static136.aClass333Array1 != null) {
			for (local5 = 0; local5 < Static165.anInt3162; local5++) {
				Static136.aClass333Array1[local5] = null;
			}
			Static136.aClass333Array1 = null;
		}
		if (Static288.aClass333Array4 != null) {
			for (local5 = 0; local5 < Static102.anInt1774; local5++) {
				Static288.aClass333Array4[local5] = null;
			}
			Static288.aClass333Array4 = null;
		}
		if (Static369.aClass333Array8 != null) {
			for (local5 = 0; local5 < Static91.anInt8332; local5++) {
				Static369.aClass333Array8[local5] = null;
			}
			Static369.aClass333Array8 = null;
		}
		Static429.anIntArray461 = null;
		Static262.anIntArrayArrayArray14 = null;
		Static198.anInt3804 = -1;
		Static312.anInt5723 = -1;
		Static412.aClass333Array6 = null;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method4012() {
		if (Static78.aClass76_4 != null) {
			Static78.aClass76_4.method2511();
		}
		if (Static53.aClass76_14 != null) {
			Static53.aClass76_14.method2511();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIILclient!cba;)V")
	public static void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub1_Sub2 arg4) {
		@Pc(4) Class360 local4 = Static570.method7679(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8902 = (arg1 << Static166.anInt7796) + Static513.anInt8858;
		arg4.anInt8908 = arg3;
		arg4.anInt8906 = (arg2 << Static166.anInt7796) + Static513.anInt8858;
		if (local4.aClass11_Sub1_Sub4_1 != null) {
			arg4.anInt8908 -= local4.aClass11_Sub1_Sub4_1.aShort109;
		}
		local4.aClass11_Sub1_Sub2_1 = arg4;
		@Pc(44) int local44 = Static310.aClass129Array5 == Static150.aClass129Array4 ? 1 : 0;
		if (arg4.method7209()) {
			if (arg4.method7217()) {
				Static267.aClass11_Sub1ArrayArray2[local44][Static512.anIntArray540[local44]++] = arg4;
				return;
			}
			Static319.aClass11_Sub1ArrayArray3[local44][Static420.anIntArray440[local44]++] = arg4;
			return;
		}
		Static176.aClass11_Sub1ArrayArray1[local44][anIntArray276[local44]++] = arg4;
	}
}
