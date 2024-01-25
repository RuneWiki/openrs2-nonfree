import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public static void method6618() {
		if (Static301.anInt4797 == 0) {
			return;
		}
		try {
			if (++Static361.anInt6379 > 2000) {
				if (Static487.aClass30_2 != null) {
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
				}
				if (Static621.anInt10073 >= 2) {
					Static301.anInt4797 = 0;
					Static45.anInt744 = -5;
					return;
				}
				Static398.aClass109_3.method2382();
				Static361.anInt6379 = 0;
				Static621.anInt10073++;
				Static301.anInt4797 = 1;
			}
			if (Static301.anInt4797 == 1) {
				Static26.aClass330_1 = Static398.aClass109_3.method2383(Static214.aClass192_1);
				Static301.anInt4797 = 2;
			}
			if (Static301.anInt4797 == 2) {
				if (Static26.aClass330_1.anInt9132 == 2) {
					throw new IOException();
				}
				if (Static26.aClass330_1.anInt9132 != 1) {
					return;
				}
				Static487.aClass30_2 = Static159.method2412((Socket) Static26.aClass330_1.anObject19);
				Static26.aClass330_1 = null;
				Static483.method6971();
				Static301.anInt4797 = 4;
			}
			if (Static301.anInt4797 == 4 && Static487.aClass30_2.method669(1)) {
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
				@Pc(116) int local116 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
				Static45.anInt744 = local116;
				Static301.anInt4797 = 0;
				Static487.aClass30_2.method671();
				Static487.aClass30_2 = null;
			}
		} catch (@Pc(127) IOException local127) {
			if (Static487.aClass30_2 != null) {
				Static487.aClass30_2.method671();
				Static487.aClass30_2 = null;
			}
			if (Static621.anInt10073 >= 2) {
				Static301.anInt4797 = 0;
				Static45.anInt744 = -4;
			} else {
				Static398.aClass109_3.method2382();
				Static621.anInt10073++;
				Static301.anInt4797 = 1;
				Static361.anInt6379 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public static void method6619(@OriginalArg(1) int arg0) {
		Static200.anIntArray291 = new int[arg0];
		Static352.anIntArray488 = new int[arg0];
		Static606.anIntArray803 = new int[arg0];
		Static368.anIntArray509 = new int[arg0];
		Static131.anIntArray174 = new int[arg0];
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ee;Z)Lclient!hc;")
	public static Class135 method6620(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method8623();
		return new Class135(local7);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIB)V")
	public static void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg2; local7++) {
			Static260.method3979(arg3, arg4, Static267.anIntArrayArray20[local7], arg0);
		}
	}
}
