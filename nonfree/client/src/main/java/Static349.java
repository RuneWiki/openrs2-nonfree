import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public static int anInt6922 = -50;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public static int anInt6923 = 2;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray65 = new String[100];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
	public static void method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static127.aFloat34 < Static127.aFloat33) {
			Static127.aFloat34 = (float) ((double) Static127.aFloat34 + (double) Static127.aFloat34 / 30.0D);
			if (Static127.aFloat33 < Static127.aFloat34) {
				Static127.aFloat34 = Static127.aFloat33;
			}
			Static19.method675();
			Static127.anInt1561 = (int) Static127.aFloat34 >> 1;
			Static127.aByteArrayArrayArray5 = Static283.method5093(Static127.anInt1561);
		} else if (Static127.aFloat33 < Static127.aFloat34) {
			Static127.aFloat34 = (float) ((double) Static127.aFloat34 - (double) Static127.aFloat34 / 30.0D);
			if (Static127.aFloat34 < Static127.aFloat33) {
				Static127.aFloat34 = Static127.aFloat33;
			}
			Static19.method675();
			Static127.anInt1561 = (int) Static127.aFloat34 >> 1;
			Static127.aByteArrayArrayArray5 = Static283.method5093(Static127.anInt1561);
		}
		if (Static2.anInt62 != -1 && Static120.anInt2601 != -1) {
			@Pc(84) int local84 = Static2.anInt62 - Static210.anInt4066;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(100) int local100 = Static120.anInt2601 - Static109.anInt2412;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static210.anInt4066 += local84;
			Static109.anInt2412 -= -local100;
			if (local84 == 0 && local100 == 0) {
				Static120.anInt2601 = -1;
				Static2.anInt62 = -1;
			}
			Static19.method675();
		}
		if (Static104.anInt5551 <= 0) {
			Static52.anInt1119 = -1;
			Static20.anInt434 = -1;
		} else {
			Static203.anInt3379--;
			if (Static203.anInt3379 == 0) {
				Static203.anInt3379 = 100;
				Static104.anInt5551--;
			}
		}
		if (!Static126.aBoolean237 || Static56.aClass216_19 == null) {
			return;
		}
		for (@Pc(165) Class2_Sub38 local165 = (Class2_Sub38) Static56.aClass216_19.method5992(); local165 != null; local165 = (Class2_Sub38) Static56.aClass216_19.method6000()) {
			@Pc(175) Class120 local175 = Static278.method5042(local165.aClass2_Sub31_1.anInt4062);
			if (Static61.anInt1330 == 0 && local165.method5162(arg0, arg1)) {
				if (local175.aStringArray30 != null) {
					if (local175.aStringArray30[4] != null) {
						Static53.method1208(local175.anInt3637, local175.aString31, -1, local175.aStringArray30[4], (long) local165.aClass2_Sub31_1.anInt4062, 0, 1002);
					}
					if (local175.aStringArray30[3] != null) {
						Static53.method1208(local175.anInt3637, local175.aString31, -1, local175.aStringArray30[3], (long) local165.aClass2_Sub31_1.anInt4062, 0, 1012);
					}
					if (local175.aStringArray30[2] != null) {
						Static53.method1208(local175.anInt3637, local175.aString31, -1, local175.aStringArray30[2], (long) local165.aClass2_Sub31_1.anInt4062, 0, 1011);
					}
					if (local175.aStringArray30[1] != null) {
						Static53.method1208(local175.anInt3637, local175.aString31, -1, local175.aStringArray30[1], (long) local165.aClass2_Sub31_1.anInt4062, 0, 1004);
					}
					if (local175.aStringArray30[0] != null) {
						Static53.method1208(local175.anInt3637, local175.aString31, -1, local175.aStringArray30[0], (long) local165.aClass2_Sub31_1.anInt4062, 0, 1007);
					}
				}
				if (!local165.aClass2_Sub31_1.aBoolean363) {
					local165.aClass2_Sub31_1.aBoolean363 = true;
					Static72.method1649(15, local165.aClass2_Sub31_1.anInt4062, local175.anInt3637);
				}
				if (local165.aClass2_Sub31_1.aBoolean363) {
					Static72.method1649(17, local165.aClass2_Sub31_1.anInt4062, local175.anInt3637);
				}
			} else if (local165.aClass2_Sub31_1.aBoolean363) {
				local165.aClass2_Sub31_1.aBoolean363 = false;
				Static72.method1649(16, local165.aClass2_Sub31_1.anInt4062, local175.anInt3637);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void method5958() {
		if (Static331.aFloat43 < 1024.0F) {
			Static331.aFloat43 = 1024.0F;
		}
		while (Static92.aFloat28 >= 16384.0F) {
			Static92.aFloat28 -= 16384.0F;
		}
		if (Static331.aFloat43 > 3072.0F) {
			Static331.aFloat43 = 3072.0F;
		}
		while (Static92.aFloat28 < 0.0F) {
			Static92.aFloat28 += 16384.0F;
		}
		@Pc(49) int local49 = Static321.anInt6465 >> 7;
		@Pc(53) int local53 = Static97.anInt6858 >> 7;
		@Pc(59) int local59 = Static138.method2745(Static182.anInt3603, Static321.anInt6465, Static97.anInt6858);
		@Pc(61) int local61 = 0;
		@Pc(83) int local83;
		if (local49 > 3 && local53 > 3 && local49 < 100 && local53 < 100) {
			for (local83 = local49 - 4; local83 <= local49 + 4; local83++) {
				for (@Pc(89) int local89 = local53 - 4; local89 <= local53 + 4; local89++) {
					@Pc(93) int local93 = Static182.anInt3603;
					if (local93 < 3 && Static222.method3911(local89, local83)) {
						local93++;
					}
					@Pc(106) int local106 = 0;
					if (Static104.aByteArrayArrayArray10 != null && Static104.aByteArrayArrayArray10[local93] != null) {
						local106 = (Static104.aByteArrayArrayArray10[local93][local83][local89] & 0xFF) * 8;
					}
					@Pc(136) int local136 = local59 + local106 - Static301.aClass73Array31[local93].method4931(local83, local89);
					if (local136 > local61) {
						local61 = local136;
					}
				}
			}
		}
		local83 = local61 * 1536;
		if (local83 > 786432) {
			local83 = 786432;
		}
		if (local83 < 262144) {
			local83 = 262144;
		}
		if (local83 > Static152.anInt3112) {
			Static152.anInt3112 += (local83 - Static152.anInt3112) / 24;
		} else if (Static152.anInt3112 > local83) {
			Static152.anInt3112 += (local83 - Static152.anInt3112) / 80;
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	public static void method5959() {
		Static350.aBoolean593 = true;
	}
}
