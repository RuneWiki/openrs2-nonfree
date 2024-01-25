import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z")
	public static boolean method6304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static504.method7376(arg0, arg1) || Static79.method1488(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	public static void method6305() {
		Static545.method7697(Static56.aClass14_Sub22_5.aClass21_Sub3_1.method964());
		@Pc(21) int local21 = (Static329.anInt6225 >> 3) + (Static233.anInt4273 >> 12);
		Static586.anInt10060 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 = 0;
		@Pc(34) int local34 = (Static74.anInt1618 >> 12) + (Static202.anInt3755 >> 3);
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2442(8, 8);
		Static513.aByteArrayArray41 = new byte[18][];
		Static166.anIntArray272 = new int[18];
		Static521.anIntArray667 = new int[18];
		Static332.anIntArray455 = new int[18];
		Static66.anIntArray112 = new int[18];
		Static662.anIntArray817 = new int[18];
		Static659.anIntArrayArray61 = new int[18][4];
		Static78.aByteArrayArray13 = new byte[18][];
		Static78.aByteArrayArray14 = new byte[18][];
		Static582.aByteArrayArray49 = new byte[18][];
		Static71.aByteArrayArray11 = new byte[18][];
		Static384.anIntArray516 = new int[18];
		@Pc(86) int local86 = 0;
		@Pc(106) int local106;
		for (@Pc(95) int local95 = (local21 - (Static26.anInt462 >> 4)) / 8; local95 <= (local21 + (Static26.anInt462 >> 4)) / 8; local95++) {
			for (local106 = (local34 - (Static445.anInt6140 >> 4)) / 8; local106 <= ((Static445.anInt6140 >> 4) + local34) / 8; local106++) {
				@Pc(115) int local115 = (local95 << 8) + local106;
				Static332.anIntArray455[local86] = local115;
				Static66.anIntArray112[local86] = Static227.aClass386_126.method9213("m" + local95 + "_" + local106);
				Static521.anIntArray667[local86] = Static227.aClass386_126.method9213("l" + local95 + "_" + local106);
				Static384.anIntArray516[local86] = Static227.aClass386_126.method9213("n" + local95 + "_" + local106);
				Static166.anIntArray272[local86] = Static227.aClass386_126.method9213("um" + local95 + "_" + local106);
				Static662.anIntArray817[local86] = Static227.aClass386_126.method9213("ul" + local95 + "_" + local106);
				if (Static384.anIntArray516[local86] == -1) {
					Static66.anIntArray112[local86] = -1;
					Static521.anIntArray667[local86] = -1;
					Static166.anIntArray272[local86] = -1;
					Static662.anIntArray817[local86] = -1;
				}
				local86++;
			}
		}
		for (local106 = local86; local106 < Static384.anIntArray516.length; local106++) {
			Static384.anIntArray516[local106] = -1;
			Static66.anIntArray112[local106] = -1;
			Static521.anIntArray667[local106] = -1;
			Static166.anIntArray272[local106] = -1;
			Static662.anIntArray817[local106] = -1;
		}
		@Pc(283) byte local283;
		if (Static430.anInt7691 == 3) {
			local283 = 4;
		} else {
			local283 = 8;
		}
		Static540.method8404(false, local21, local283, local34);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	public static void method6306() {
		@Pc(5) int local5 = 0;
		if (Static56.aClass14_Sub22_5.aClass21_Sub18_1.method5561() == 1) {
			local5 = 55;
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9104() == 0) {
			local5 |= 0x40;
		}
		Static473.method6861(local5);
		Static511.aClass13_2.method78(local5);
		Static175.aClass247_2.method5958(local5);
		Static63.aClass37_1.method976(local5);
		Static556.aClass216_2.method5272(local5);
		Static556.method7805(local5);
		Static304.method4465(local5);
		Static171.method2775(local5);
		Static420.method6223(local5);
		Static107.method1893();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	public static void method6307(@OriginalArg(0) boolean arg0) {
		Static299.method4404();
		if (!Static177.method2836(Static430.anInt7691)) {
			return;
		}
		Static287.anInt4907++;
		if (Static287.anInt4907 < 50 && !arg0) {
			return;
		}
		Static287.anInt4907 = 0;
		if (!Static91.aBoolean169 && Static258.aClass97_2 != null) {
			@Pc(41) Class14_Sub19 local41 = Static286.method4081(Static205.aClass394_1, Static269.aClass100_143);
			Static576.method8234(local41);
			try {
				Static363.method47();
			} catch (@Pc(48) IOException local48) {
				Static91.aBoolean169 = true;
			}
		}
		Static299.method4404();
	}
}
