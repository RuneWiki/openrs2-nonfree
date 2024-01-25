import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!ft;")
	public static final Class107 aClass107_1 = new Class107();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!av;BLclient!kj;I)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) Class1_Sub17_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if ((arg0 & 0x4000) != 0) {
			local17 = Static445.anInt7791;
			local21 = arg2.method4480();
			local25 = arg2.method4442();
			arg1.method7823(local17, local25, local21);
		}
		if ((arg0 & 0x40000) != 0) {
			local17 = arg2.method4449();
			@Pc(45) int[] local45 = new int[local17];
			@Pc(48) int[] local48 = new int[local17];
			@Pc(51) int[] local51 = new int[local17];
			for (@Pc(53) int local53 = 0; local53 < local17; local53++) {
				@Pc(59) int local59 = arg2.method4461();
				if (local59 == 65535) {
					local59 = -1;
				}
				local45[local53] = local59;
				local48[local53] = arg2.method4467();
				local51[local53] = arg2.method4502();
			}
			Static117.method2273(arg1, local45, local48, local51);
		}
		if ((arg0 & 0x1) != 0) {
			Static358.aByteArray85[arg3] = arg2.method4485();
		}
		if ((arg0 & 0x8000) != 0) {
			arg1.anInt8962 = arg2.method4468();
			arg1.anInt8981 = arg2.method4501();
			arg1.anInt9031 = arg2.method4482();
			arg1.anInt8956 = arg2.method4482();
			arg1.anInt8978 = arg2.method4461() + Static445.anInt7791;
			arg1.anInt8975 = arg2.method4494() + Static445.anInt7791;
			arg1.anInt8971 = arg2.method4442();
			arg1.anInt9037 = 0;
			if (arg1.aBoolean53) {
				arg1.anInt9035 = 0;
				arg1.anInt8962 += arg1.anInt658;
				arg1.anInt8981 += arg1.anInt652;
				arg1.anInt8956 += arg1.anInt652;
				arg1.anInt9031 += arg1.anInt658;
			} else {
				arg1.anInt9031 += arg1.anIntArray780[0];
				arg1.anInt8956 += arg1.anIntArray781[0];
				arg1.anInt8981 += arg1.anIntArray781[0];
				arg1.anInt8962 += arg1.anIntArray780[0];
				arg1.anInt9035 = 1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			local17 = arg2.method4472();
			local21 = arg2.method4487();
			local25 = arg2.method4487();
			@Pc(249) int local249 = arg2.anInt4872;
			@Pc(260) boolean local260 = (local17 & 0x8000) != 0;
			if (arg1.aString13 != null && arg1.aClass225_1 != null) {
				@Pc(268) boolean local268 = false;
				if (local21 <= 1) {
					if (!local260 && (Static498.aBoolean656 && !Static353.aBoolean479 || Static394.aBoolean512)) {
						local268 = true;
					} else if (Static505.method5588(arg1.aString13)) {
						local268 = true;
					}
				}
				if (!local268 && Static280.anInt5322 == 0) {
					Static306.aClass1_Sub17_6.anInt4872 = 0;
					arg2.method4505(Static306.aClass1_Sub17_6.aByteArray58, local25);
					Static306.aClass1_Sub17_6.anInt4872 = 0;
					@Pc(312) int local312 = -1;
					@Pc(320) String local320;
					if (local260) {
						local17 &= 0x7FFF;
						@Pc(332) Class115 local332 = Static279.method2788(Static306.aClass1_Sub17_6);
						local312 = local332.anInt3092;
						local320 = local332.aClass1_Sub2_Sub11_1.method5424(Static306.aClass1_Sub17_6);
					} else {
						local320 = Static22.method606(Static229.method4131(Static306.aClass1_Sub17_6));
					}
					arg1.aString205 = local320.trim();
					arg1.anInt9008 = 150;
					arg1.anInt9021 = local17 >> 8;
					arg1.anInt9010 = local17 & 0xFF;
					@Pc(374) int local374;
					if (local21 == 1 || local21 == 2) {
						local374 = local260 ? 17 : 1;
					} else {
						local374 = local260 ? 17 : 2;
					}
					if (local21 == 2) {
						Static313.method5432(local320, 0, null, "<img=1>" + arg1.method724(), local374, "<img=1>" + arg1.method725(), local312);
					} else if (local21 == 1) {
						Static313.method5432(local320, 0, null, "<img=0>" + arg1.method724(), local374, "<img=0>" + arg1.method725(), local312);
					} else {
						Static313.method5432(local320, 0, null, arg1.method724(), local374, arg1.method725(), local312);
					}
				}
			}
			arg2.anInt4872 = local25 + local249;
		}
		if ((arg0 & 0x2000) != 0) {
			arg1.aBoolean54 = arg2.method4442() == 1;
		}
		if ((arg0 & 0x10000) != 0) {
			local17 = arg2.method4472();
			local21 = arg2.method4444();
			if (local17 == 65535) {
				local17 = -1;
			}
			local25 = arg2.method4487();
			arg1.method7814(local25, true, local21, local17);
		}
		if ((arg0 & 0x80) != 0) {
			local17 = arg2.method4494();
			if (local17 == 65535) {
				local17 = -1;
			}
			arg1.anInt9034 = local17;
		}
		if ((arg0 & 0x10) != 0) {
			local17 = arg2.method4472();
			if (local17 == 65535) {
				local17 = -1;
			}
			local21 = arg2.method4449();
			Static399.method6375(arg1, local21, local17);
		}
		if ((arg0 & 0x200) != 0) {
			arg1.aString205 = arg2.method4491();
			if (arg1.aString205.charAt(0) == '~') {
				arg1.aString205 = arg1.aString205.substring(1);
				Static229.method4129(arg1.aString205, 2, arg1.method724(), 0, arg1.method725());
			} else if (Static107.aClass20_Sub1_Sub1_Sub1_1 == arg1) {
				Static229.method4129(arg1.aString205, 2, arg1.method724(), 0, arg1.method725());
			}
			arg1.anInt9010 = 0;
			arg1.anInt9008 = 150;
			arg1.anInt9021 = 0;
		}
		if ((arg0 & 0x40) != 0) {
			local17 = arg2.method4480();
			local21 = arg2.method4449();
			arg1.method7823(Static445.anInt7791, local21, local17);
			arg1.anInt8982 = Static445.anInt7791 + 300;
			arg1.anInt8996 = arg2.method4442();
		}
		if ((arg0 & 0x100) != 0) {
			local11 = arg2.method4482();
		}
		if ((arg0 & 0x800) != 0) {
			local17 = arg2.method4494();
			arg1.anInt8986 = arg2.method4487();
			arg1.anInt9016 = arg2.method4487();
			arg1.aBoolean676 = (local17 & 0x8000) != 0;
			arg1.anInt8995 = local17 & 0x7FFF;
			arg1.anInt8989 = arg1.anInt8986 + arg1.anInt8995 + Static445.anInt7791;
		}
		if ((arg0 & 0x400) != 0) {
			local17 = arg2.method4494();
			if (local17 == 65535) {
				local17 = -1;
			}
			local21 = arg2.method4471();
			local25 = arg2.method4449();
			arg1.method7814(local25, false, local21, local17);
		}
		if ((arg0 & 0x4) != 0) {
			local17 = arg2.method4442();
			@Pc(758) byte[] local758 = new byte[local17];
			@Pc(763) Class1_Sub17 local763 = new Class1_Sub17(local758);
			arg2.method4475(local17, local758);
			Static316.aClass1_Sub17Array1[arg3] = local763;
			arg1.method723(local763);
		}
		if ((arg0 & 0x20) != 0) {
			arg1.anInt657 = arg2.method4502();
			if (arg1.anInt9035 == 0) {
				arg1.method7820(arg1.anInt657);
				arg1.anInt657 = -1;
			}
		}
		if ((arg0 & 0x20000) != 0) {
			arg1.aByte110 = arg2.method4485();
			arg1.aByte112 = arg2.method4501();
			arg1.aByte111 = arg2.method4485();
			arg1.aByte109 = (byte) arg2.method4467();
			arg1.anInt8990 = Static445.anInt7791 + arg2.method4472();
			arg1.anInt9007 = Static445.anInt7791 + arg2.method4494();
		}
		if (!arg1.aBoolean53) {
			return;
		}
		if (local11 == 127) {
			arg1.method729(arg1.anInt658, arg1.anInt652);
			return;
		}
		@Pc(864) byte local864;
		if (local11 == -1) {
			local864 = Static358.aByteArray85[arg3];
		} else {
			local864 = local11;
		}
		arg1.method727(arg1.anInt652, local864, arg1.anInt658);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method2882() {
		if (Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876) || Static322.anInt6113 == Static514.anInt9103) {
			Static217.method4008(Static455.aClass4_11);
			if (Static322.anInt6113 != Static256.anInt5005) {
				Static441.method6824();
			}
		} else {
			Static164.method2938(Static388.anInt6883, Static225.anInt4357, 10, false);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!qa;ILclient!et;)V")
	public static void method2883(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class91 arg1) {
		@Pc(31) boolean local31 = Static181.aClass316_1.method8103(arg1.anInt2434, arg1.anInt2391, arg0, arg1.anInt2428 | 0xFF000000, arg1.anInt2451, arg1.anInt2408, arg1.aBoolean195 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null) == null;
		if (local31) {
			Static317.aClass295_35.method7533(new Class1_Sub31(arg1.anInt2391, arg1.anInt2434, arg1.anInt2408, arg1.anInt2428 | 0xFF000000, arg1.anInt2451, arg1.aBoolean195));
			Static243.method4316(arg1);
		}
	}
}
