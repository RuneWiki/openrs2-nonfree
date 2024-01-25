import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_33 = new Class185(0, 8);

	@OriginalMember(owner = "client!f", name = "H", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!gg;III)V")
	public static void method2837(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class186 local12;
		if (arg2 < Static623.anInt10485) {
			local12 = Static26.aClass186ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass9_Sub4_Sub3_1 != null && local12.aClass9_Sub4_Sub3_1.method8417()) {
				arg0.method8416(local12.aClass9_Sub4_Sub3_1, true, Static190.anInt4138, Static472.aClass5_14, 0, 0);
			}
		}
		if (arg3 < Static623.anInt10485) {
			local12 = Static26.aClass186ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub4_Sub3_1 != null && local12.aClass9_Sub4_Sub3_1.method8417()) {
				arg0.method8416(local12.aClass9_Sub4_Sub3_1, true, 0, Static472.aClass5_14, 0, Static190.anInt4138);
			}
		}
		if (arg2 < Static623.anInt10485 && arg3 < Static142.anInt3372) {
			local12 = Static26.aClass186ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub4_Sub3_1 != null && local12.aClass9_Sub4_Sub3_1.method8417()) {
				arg0.method8416(local12.aClass9_Sub4_Sub3_1, true, Static190.anInt4138, Static472.aClass5_14, 0, Static190.anInt4138);
			}
		}
		if (arg2 < Static623.anInt10485 && arg3 > 0) {
			local12 = Static26.aClass186ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass9_Sub4_Sub3_1 != null && local12.aClass9_Sub4_Sub3_1.method8417()) {
				arg0.method8416(local12.aClass9_Sub4_Sub3_1, true, Static190.anInt4138, Static472.aClass5_14, 0, -Static190.anInt4138);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
	public static boolean method2838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Lclient!eda;")
	public static Class6_Sub17 method2840() {
		@Pc(6) Class6_Sub17 local6 = Static504.method7272();
		local6.aClass185_30 = null;
		local6.anInt3091 = 0;
		local6.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ov;)V")
	public static void method2842(@OriginalArg(1) Class6_Sub36 arg0) {
		if (Static26.aClass186ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface22 local8 = null;
		if (arg0.anInt7726 == 0) {
			local8 = (Interface22) Static37.method1328(arg0.anInt7724, arg0.anInt7720, arg0.anInt7721);
		}
		if (arg0.anInt7726 == 1) {
			local8 = (Interface22) Static181.method3396(arg0.anInt7724, arg0.anInt7720, arg0.anInt7721);
		}
		if (arg0.anInt7726 == 2) {
			local8 = (Interface22) Static173.method3262(arg0.anInt7724, arg0.anInt7720, arg0.anInt7721, rl.class);
		}
		if (arg0.anInt7726 == 3) {
			local8 = (Interface22) Static446.method6808(arg0.anInt7724, arg0.anInt7720, arg0.anInt7721);
		}
		if (local8 == null) {
			arg0.anInt7729 = 0;
			arg0.anInt7727 = -1;
			arg0.anInt7723 = 0;
		} else {
			arg0.anInt7727 = local8.method8436();
			arg0.anInt7723 = local8.method8435();
			arg0.anInt7729 = local8.method8438();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2845(@OriginalArg(0) Class5 arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (Static238.aBoolean425) {
			local12 = Static352.method5739();
			local14 = Static573.method7997();
		}
		Static2.method4203(Static30.anInt820, local14 + Static189.anInt4113, arg0, Static498.anInt8705, Static76.anInt2536 + local12);
		Static537.aClass34_12.method8598(Static189.anInt4113 + local14 + 14, Static536.aClass316_26.method7577(Static638.anInt10709), -10660793, -1, local12 + Static76.anInt2536 + 3);
		@Pc(62) int local62 = Static6.aClass96_1.method8026() + local12;
		@Pc(68) int local68 = Static6.aClass96_1.method8019() + local14;
		@Pc(72) int local72;
		@Pc(89) int local89;
		if (Static437.aBoolean633) {
			local72 = 0;
			for (@Pc(77) Class6_Sub5_Sub11 local77 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local77 != null; local77 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
				local89 = local72 * 16 + Static189.anInt4113 + local14 + 31;
				local72++;
				if (local77.anInt3423 == 1) {
					Static240.method4375(Static30.anInt820, (Class6_Sub5_Sub9) local77.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66, -256, Static498.anInt8705, local89, local14 + Static189.anInt4113, local62, arg0, local68, -1, Static76.anInt2536 + local12);
				} else {
					Static553.method7738(local77, -1, local62, Static30.anInt820, local68, local12 + Static76.anInt2536, arg0, local89, -256, Static498.anInt8705, local14 + Static189.anInt4113);
				}
			}
			if (Static535.aClass6_Sub5_Sub11_1 != null) {
				Static2.method4203(Static626.anInt10528, Static303.anInt6146, arg0, Static9.anInt525, Static497.anInt8646);
				Static537.aClass34_12.method8598(Static303.anInt6146 + 14, Static535.aClass6_Sub5_Sub11_1.aString28, -10660793, -1, Static497.anInt8646 + 3);
				local72 = 0;
				for (@Pc(176) Class6_Sub5_Sub9 local176 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6055(); local176 != null; local176 = (Class6_Sub5_Sub9) Static535.aClass6_Sub5_Sub11_1.aClass231_2.method6050()) {
					@Pc(186) int local186 = local72 * 16 + Static303.anInt6146 + 31;
					Static240.method4375(Static626.anInt10528, local176, -256, Static9.anInt525, local186, Static303.anInt6146, local62, arg0, local68, -1, Static497.anInt8646);
					local72++;
				}
				Static602.method8319(Static626.anInt10528, Static497.anInt8646, Static9.anInt525, Static303.anInt6146);
			}
		} else {
			local72 = 0;
			for (@Pc(225) Class6_Sub5_Sub9 local225 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local225 != null; local225 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				local89 = local14 + Static189.anInt4113 + (-local72 + -1 + Static611.anInt10324) * 16 + 31;
				Static240.method4375(Static30.anInt820, local225, -256, Static498.anInt8705, local89, Static189.anInt4113 + local14, local62, arg0, local68, -1, Static76.anInt2536 + local12);
				local72++;
			}
		}
		Static602.method8319(Static30.anInt820, local12 + Static76.anInt2536, Static498.anInt8705, local14 + Static189.anInt4113);
	}
}
