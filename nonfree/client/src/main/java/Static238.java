import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public static int anInt5978 = 0;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
	public static int[] anIntArray590 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public static int method4689(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 6 & 0x3;
		@Pc(18) int local18 = arg0 & 0x3F;
		if (local18 == 18) {
			if (local14 == 0) {
				return 1;
			}
			if (local14 == 1) {
				return 2;
			}
			if (local14 == 2) {
				return 4;
			}
			if (local14 == 3) {
				return 8;
			}
		} else if (local18 == 19 || local18 == 21) {
			if (local14 == 0) {
				return 16;
			}
			if (local14 == 1) {
				return 32;
			}
			if (local14 == 2) {
				return 64;
			}
			if (local14 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 <= 3) {
			return local8 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
		} else {
			return "<col=80ff00>";
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BB)Lclient!cj;")
	public static Class2_Sub8_Sub3 method4691(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub8_Sub3 local9 = new Class2_Sub8_Sub3();
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg0);
		local14.anInt2789 = local14.aByteArray17.length - 2;
		@Pc(25) int local25 = local14.method2130();
		@Pc(36) int local36 = local14.aByteArray17.length - local25 - 2 - 12;
		local14.anInt2789 = local36;
		@Pc(43) int local43 = local14.method2145();
		local9.anInt976 = local14.method2130();
		local9.anInt978 = local14.method2130();
		local9.anInt979 = local14.method2130();
		local9.anInt973 = local14.method2130();
		@Pc(75) int local75 = local14.method2146();
		@Pc(86) int local86;
		@Pc(97) int local97;
		if (local75 > 0) {
			local9.aClass101Array1 = new Class101[local75];
			for (local86 = 0; local86 < local75; local86++) {
				local97 = local14.method2130();
				@Pc(104) Class101 local104 = new Class101(Static305.method4628(local97));
				local9.aClass101Array1[local86] = local104;
				while (local97-- > 0) {
					@Pc(119) int local119 = local14.method2145();
					@Pc(123) int local123 = local14.method2145();
					local104.method2860(new Class2_Sub25(local123), (long) local119);
				}
			}
		}
		local14.anInt2789 = 0;
		local9.aString43 = local14.method2177();
		local9.anIntArray88 = new int[local43];
		local9.aStringArray5 = new String[local43];
		local86 = 0;
		local9.anIntArray87 = new int[local43];
		while (local14.anInt2789 < local36) {
			local97 = local14.method2130();
			if (local97 == 3) {
				local9.aStringArray5[local86] = local14.method2158().intern();
			} else if (local97 >= 100 || local97 == 21 || local97 == 38 || local97 == 39) {
				local9.anIntArray87[local86] = local14.method2146();
			} else {
				local9.anIntArray87[local86] = local14.method2145();
			}
			local9.anIntArray88[local86++] = local97;
		}
		return local9;
	}
}
