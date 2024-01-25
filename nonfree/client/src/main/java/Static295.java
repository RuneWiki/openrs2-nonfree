import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!es;)Lclient!ta;")
	public static Class103_Sub3 method4176(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(7) Class103 local7 = Static488.method6659(arg0);
		@Pc(18) int local18 = arg0.method8850();
		@Pc(22) int local22 = arg0.method8850();
		@Pc(26) int local26 = arg0.method8859();
		return new Class103_Sub3(local7.aClass291_14, local7.aClass125_16, local7.anInt8643, local7.anInt8650, local7.anInt8646, local7.anInt8653, local7.anInt8648, local7.anInt8641, local7.anInt8644, local18, local22, local26);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([Lclient!gda;II)V")
	public static void method4177(@OriginalArg(0) Class3_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class3_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9920;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9920 < local27 + (local29 & 0x1)) {
				@Pc(44) Class3_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4177(arg0, arg1, local10 - 1);
		method4177(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!mh;III)V")
	public static void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 | arg3 << 14 | arg0 << 28);
		@Pc(22) Class4_Sub7 local22 = (Class4_Sub7) Static406.aClass66_28.method1994(local16);
		if (local22 == null) {
			local22 = new Class4_Sub7();
			Static406.aClass66_28.method1985(local22, local16);
			local22.aClass163_8.method3646(arg1);
			return;
		}
		@Pc(49) Class110 local49 = Static532.aClass255_2.method5210(arg1.anInt5595);
		@Pc(52) int local52 = local49.anInt2753;
		if (local49.anInt2797 == 1) {
			local52 *= arg1.anInt5597 + 1;
		}
		for (@Pc(71) Class4_Sub33 local71 = (Class4_Sub33) local22.aClass163_8.method3639(); local71 != null; local71 = (Class4_Sub33) local22.aClass163_8.method3640()) {
			local49 = Static532.aClass255_2.method5210(local71.anInt5595);
			@Pc(82) int local82 = local49.anInt2753;
			if (local49.anInt2797 == 1) {
				local82 *= local71.anInt5597 + 1;
			}
			if (local82 < local52) {
				Static470.method6505(local71, arg1);
				return;
			}
		}
		local22.aClass163_8.method3646(arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	public static void method4179() {
		if (Static332.aString67.toLowerCase().indexOf("microsoft") != -1) {
			Static23.anIntArray45[219] = 42;
			Static23.anIntArray45[190] = 72;
			Static23.anIntArray45[192] = 58;
			Static23.anIntArray45[188] = 71;
			Static23.anIntArray45[191] = 73;
			Static23.anIntArray45[189] = 26;
			Static23.anIntArray45[221] = 43;
			Static23.anIntArray45[187] = 27;
			Static23.anIntArray45[222] = 59;
			Static23.anIntArray45[220] = 74;
			Static23.anIntArray45[186] = 57;
			Static23.anIntArray45[223] = 28;
			return;
		}
		Static23.anIntArray45[47] = 73;
		Static23.anIntArray45[61] = 27;
		Static23.anIntArray45[45] = 26;
		Static23.anIntArray45[46] = 72;
		Static23.anIntArray45[93] = 43;
		Static23.anIntArray45[44] = 71;
		Static23.anIntArray45[59] = 57;
		Static23.anIntArray45[91] = 42;
		Static23.anIntArray45[92] = 74;
		if (Static332.aMethod2 == null) {
			Static23.anIntArray45[222] = 59;
			Static23.anIntArray45[192] = 58;
		} else {
			Static23.anIntArray45[520] = 59;
			Static23.anIntArray45[222] = 58;
			Static23.anIntArray45[192] = 28;
		}
	}
}
