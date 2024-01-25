import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static final int anInt8397 = 1403;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!dfa;I)V")
	public static void method6942(@OriginalArg(0) Class3_Sub15_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2438();
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static385.anInt10557; local12++) {
			local18 = Static493.anIntArray555[local12];
			if ((Static250.aByteArray60[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static250.aByteArray60[local18] = (byte) (Static250.aByteArray60[local18] | 0x2);
				} else {
					local43 = arg0.method2432(1);
					if (local43 == 0) {
						local7 = Static351.method5760(arg0);
						Static250.aByteArray60[local18] = (byte) (Static250.aByteArray60[local18] | 0x2);
					} else {
						Static473.method7009(arg0, local18);
					}
				}
			}
		}
		arg0.method2440();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2438();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static385.anInt10557; local18++) {
			local43 = Static493.anIntArray555[local18];
			if ((Static250.aByteArray60[local43] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static250.aByteArray60[local43] = (byte) (Static250.aByteArray60[local43] | 0x2);
				} else {
					local124 = arg0.method2432(1);
					if (local124 == 0) {
						local7 = Static351.method5760(arg0);
						Static250.aByteArray60[local43] = (byte) (Static250.aByteArray60[local43] | 0x2);
					} else {
						Static473.method7009(arg0, local43);
					}
				}
			}
		}
		arg0.method2440();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2438();
		@Pc(201) int local201;
		for (local43 = 0; local43 < Static403.anInt4307; local43++) {
			local124 = Static39.anIntArray46[local43];
			if ((Static250.aByteArray60[local124] & 0x1) != 0) {
				if (local7 > 0) {
					Static250.aByteArray60[local124] = (byte) (Static250.aByteArray60[local124] | 0x2);
					local7--;
				} else {
					local201 = arg0.method2432(1);
					if (local201 == 0) {
						local7 = Static351.method5760(arg0);
						Static250.aByteArray60[local124] = (byte) (Static250.aByteArray60[local124] | 0x2);
					} else if (Static630.method8539(arg0, local124)) {
						Static250.aByteArray60[local124] = (byte) (Static250.aByteArray60[local124] | 0x2);
					}
				}
			}
		}
		arg0.method2440();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2438();
		@Pc(268) int local268;
		for (local201 = 0; local201 < Static403.anInt4307; local201++) {
			local268 = Static39.anIntArray46[local201];
			if ((Static250.aByteArray60[local268] & 0x1) == 0) {
				if (local7 > 0) {
					Static250.aByteArray60[local268] = (byte) (Static250.aByteArray60[local268] | 0x2);
					local7--;
				} else {
					@Pc(296) int local296 = arg0.method2432(1);
					if (local296 == 0) {
						local7 = Static351.method5760(arg0);
						Static250.aByteArray60[local268] = (byte) (Static250.aByteArray60[local268] | 0x2);
					} else if (Static630.method8539(arg0, local268)) {
						Static250.aByteArray60[local268] = (byte) (Static250.aByteArray60[local268] | 0x2);
					}
				}
			}
		}
		arg0.method2440();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static403.anInt4307 = 0;
		Static385.anInt10557 = 0;
		for (local268 = 1; local268 < 2048; local268++) {
			Static250.aByteArray60[local268] = (byte) (Static250.aByteArray60[local268] >> 1);
			@Pc(364) Class2_Sub3_Sub1_Sub2_Sub2 local364 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local268];
			if (local364 == null) {
				Static39.anIntArray46[Static403.anInt4307++] = local268;
			} else {
				Static493.anIntArray555[Static385.anInt10557++] = local268;
			}
		}
	}
}
