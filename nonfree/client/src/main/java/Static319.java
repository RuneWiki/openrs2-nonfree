import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt4968;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "[[[Lclient!vt;")
	public static Class258[][][] aClass258ArrayArrayArray3;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	public static int anInt4969 = 1;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([Ljava/lang/String;I[SII)V")
	public static void method3934(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg1) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) String local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) short local35 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg1; local47++) {
			if (local21 == null || arg0[local47] != null && (local47 & 0x1) > arg0[local47].compareTo(local21)) {
				@Pc(68) String local68 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local68;
				@Pc(82) short local82 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local82;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg2[arg1] = arg2[local17];
		arg2[local17] = local35;
		method3934(arg0, local17 - 1, arg2, arg3);
		method3934(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILclient!ed;)V")
	public static void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub5 arg4) {
		@Pc(4) Class258 local4 = Static121.method1714(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1588 = (arg1 << Static419.anInt6980) + Static301.anInt4709;
		arg4.anInt1589 = arg3;
		arg4.anInt1590 = (arg2 << Static419.anInt6980) + Static301.anInt4709;
		for (@Pc(28) Class122 local28 = local4.aClass122_3; local28 != null; local28 = local28.aClass122_1) {
			if (local28.aClass2_Sub1_1.aBoolean505) {
				@Pc(38) int local38 = local28.aClass2_Sub1_1.method6031();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1589 += local8;
			arg4.aBoolean109 = true;
		} else if (local4.aClass2_Sub3_2 != null) {
			arg4.anInt1589 -= local4.aClass2_Sub3_2.aShort99;
		}
		local4.aClass2_Sub5_1 = arg4;
	}
}
