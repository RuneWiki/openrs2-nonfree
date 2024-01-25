import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!aga;")
	public static final Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!pc;)V")
	public static void method4291(@OriginalArg(0) Class265 arg0) {
		if (Static486.anInt8045 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub15 local6 = arg0.aClass3_Sub15_2;
		Static541.aClass265Array1[Static486.anInt8045] = arg0;
		Static648.aBooleanArray55[Static486.anInt8045] = false;
		Static486.anInt8045++;
		@Pc(21) int local21 = arg0.anInt7434;
		if (arg0.aBoolean552) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt7434;
		if (arg0.aBoolean551) {
			local29 = Static183.anInt3720 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8383() + Static597.anInt9602 - local6.method8378() >> Static391.anInt10262;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8383() + local6.method8378() - Static597.anInt9602 >> Static391.anInt10262;
			if (local73 >= Static602.anInt9668) {
				local73 = Static602.anInt9668 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray109[local41++];
				@Pc(105) int local105 = (local6.method8384() + Static597.anInt9602 - local6.method8378() >> Static391.anInt10262) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static146.anInt2951) {
					local113 = Static146.anInt2951 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static234.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static234.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static486.anInt8045;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static234.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static486.anInt8045 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static234.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static486.anInt8045 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static234.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static486.anInt8045 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZJ)Ljava/lang/String;")
	public static String method4293(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static125.method2359(arg1);
		@Pc(15) int local15 = Static379.aCalendar20.get(5);
		@Pc(19) int local19 = Static379.aCalendar20.get(2);
		@Pc(23) int local23 = Static379.aCalendar20.get(1);
		return arg0 == 3 ? Static257.method4212(arg1, arg0) : Integer.toString(local15 / 10) + local15 % 10 + "-" + Static141.aStringArrayArray52[arg0][local19] + "-" + local23;
	}
}
