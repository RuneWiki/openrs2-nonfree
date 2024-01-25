import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_33 = new Class254(52, 12);

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I")
	public static int method1325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static431.anIntArray568[arg1 & 0x3] : Static113.anIntArray200[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!iaa;ILclient!pe;I)V")
	public static void method1327(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub8 local9 = new Class6_Sub8();
		local9.anInt1405 = arg0.method4966();
		local9.anInt1407 = arg0.method5000();
		local9.aClass280Array1 = new Class280[local9.anInt1405];
		local9.aClass280Array2 = new Class280[local9.anInt1405];
		local9.anIntArray91 = new int[local9.anInt1405];
		local9.anIntArray93 = new int[local9.anInt1405];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1405][][];
		local9.anIntArray92 = new int[local9.anInt1405];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt1405; local58++) {
			try {
				@Pc(64) int local64 = arg0.method4966();
				@Pc(83) String local83;
				@Pc(89) String local89;
				@Pc(91) int local91;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local83 = arg0.method4941();
					local89 = arg0.method4941();
					local91 = 0;
					if (local64 == 1) {
						local91 = arg0.method5000();
					}
					local9.anIntArray93[local58] = local64;
					local9.anIntArray92[local58] = local91;
					local9.aClass280Array2[local58] = arg1.method6129(Static418.method1815(local83), local89);
				} else if (local64 == 3 || local64 == 4) {
					local83 = arg0.method4941();
					local89 = arg0.method4941();
					local91 = arg0.method4966();
					@Pc(144) String[] local144 = new String[local91];
					for (@Pc(146) int local146 = 0; local146 < local91; local146++) {
						local144[local146] = arg0.method4941();
					}
					@Pc(161) byte[][] local161 = new byte[local91][];
					@Pc(174) int local174;
					if (local64 == 3) {
						for (@Pc(168) int local168 = 0; local168 < local91; local168++) {
							local174 = arg0.method5000();
							local161[local168] = new byte[local174];
							arg0.method4977(local174, local161[local168]);
						}
					}
					local9.anIntArray93[local58] = local64;
					@Pc(205) Class[] local205 = new Class[local91];
					for (local174 = 0; local174 < local91; local174++) {
						local205[local174] = Static418.method1815(local144[local174]);
					}
					local9.aClass280Array1[local58] = arg1.method6140(local205, local89, Static418.method1815(local83));
					local9.aByteArrayArrayArray3[local58] = local161;
				}
			} catch (@Pc(240) ClassNotFoundException local240) {
				local9.anIntArray91[local58] = -1;
			} catch (@Pc(247) SecurityException local247) {
				local9.anIntArray91[local58] = -2;
			} catch (@Pc(254) NullPointerException local254) {
				local9.anIntArray91[local58] = -3;
			} catch (@Pc(261) Exception local261) {
				local9.anIntArray91[local58] = -4;
			} catch (@Pc(268) Throwable local268) {
				local9.anIntArray91[local58] = -5;
			}
		}
		Static405.aClass211_61.method5173(local9);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ag;BII)V")
	public static void method1328(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt7387 == arg2 && arg2 != -1) {
			@Pc(80) Class16 local80 = Static114.aClass156_2.method4101(arg2);
			@Pc(83) int local83 = local80.anInt581;
			if (local83 == 1) {
				arg0.anInt7401 = arg1;
				arg0.anInt7414 = 0;
				arg0.anInt7368 = 0;
				arg0.anInt7361 = 0;
				arg0.anInt7371 = 1;
				Static360.method5794(arg0.anInt7347, local80, arg0.anInt7351, arg0.aByte77, arg0.anInt7361, false);
			}
			if (local83 == 2) {
				arg0.anInt7368 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt7387 == -1 || Static114.aClass156_2.method4101(arg2).anInt582 >= Static114.aClass156_2.method4101(arg0.anInt7387).anInt582) {
			arg0.anInt7361 = 0;
			arg0.anInt7414 = 0;
			arg0.anInt7387 = arg2;
			arg0.anInt7435 = arg0.anInt7432;
			arg0.anInt7371 = 1;
			arg0.anInt7401 = arg1;
			arg0.anInt7368 = 0;
			if (arg0.anInt7387 != -1) {
				Static360.method5794(arg0.anInt7347, Static114.aClass156_2.method4101(arg0.anInt7387), arg0.anInt7351, arg0.aByte77, arg0.anInt7361, false);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZ)C")
	public static char method1329(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(38) char local38 = Static454.aCharArray8[local7 - 128];
			if (local38 == '\u0000') {
				local38 = '?';
			}
			local7 = local38;
		}
		return (char) local7;
	}
}
