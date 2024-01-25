import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "[I")
	public static int[] anIntArray373;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_123 = new Class21(4);

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[128][128];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method4180() {
		Static194.aClass42_33.method1542();
		for (@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) Static317.aClass42_43.method1543(); local13 != null; local13 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			if (local13.anInt2822 < 1000) {
				local13.method6045();
				Static194.aClass42_33.method1549(local13);
			}
		}
		Static194.aClass42_33.method1553(Static317.aClass42_43);
		if (Static243.aClass112_15 != null || Static313.anInt6023 > 0) {
			return;
		}
		@Pc(52) int local52 = -1;
		if (Static189.aClass1_Sub8_1 != null) {
			local52 = Static189.aClass1_Sub8_1.method598();
		}
		if (!Static217.aBoolean322) {
			if (Static254.anInt5167 >= 0) {
				local52 = Static254.anInt5167;
			}
			Static254.anInt5167 = -1;
			if (local52 == 0 && (Static349.anInt6554 == 1 && Static224.anInt4512 > 2 || Static186.method3504())) {
				local52 = 2;
			}
			if (local52 == 2 && Static224.anInt4512 > 0) {
				if (Static189.aClass1_Sub8_1 == null) {
					Static132.method2714(Static320.anInt4363, Static331.anInt6243);
				} else {
					Static132.method2714(Static189.aClass1_Sub8_1.method596(), Static189.aClass1_Sub8_1.method593());
				}
			}
			if (local52 != 0 || Static224.anInt4512 <= 0) {
				return;
			}
			Static9.method294();
			return;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local52 == -1) {
			local67 = Static164.aClass142_1.method4911();
			local71 = Static164.aClass142_1.method4915();
			if (local67 < Static35.anInt920 - 10 || local67 > Static182.anInt3706 + Static35.anInt920 + 10 || Static361.anInt6937 - 10 > local71 || local71 > Static208.anInt4100 + Static361.anInt6937 + 10) {
				Static217.aBoolean322 = false;
				Static128.method5289(Static361.anInt6937, Static35.anInt920, Static208.anInt4100, Static182.anInt3706);
			}
		}
		if (local52 != 0) {
			return;
		}
		local67 = Static35.anInt920;
		local71 = Static361.anInt6937;
		@Pc(122) int local122 = Static182.anInt3706;
		@Pc(126) int local126 = Static189.aClass1_Sub8_1.method593();
		@Pc(130) int local130 = Static189.aClass1_Sub8_1.method596();
		@Pc(132) int local132 = -1;
		@Pc(151) int local151;
		for (@Pc(134) int local134 = 0; local134 < Static224.anInt4512; local134++) {
			if (Static171.aBoolean246) {
				local151 = local71 + (Static224.anInt4512 + -1 - local134) * 16 + 33;
				if (local67 < local126 && local67 + local122 > local126 && local151 - 13 < local130 && local130 < local151 + 4) {
					local132 = local134;
				}
			} else {
				local151 = local71 + (-local134 + -1 + Static224.anInt4512) * 16 + 31;
				if (local67 < local126 && local126 < local67 + local122 && local151 - 13 < local130 && local151 + 3 > local130) {
					local132 = local134;
				}
			}
		}
		if (local132 != -1) {
			local151 = 0;
			@Pc(250) Class50 local250 = new Class50(Static317.aClass42_43);
			for (@Pc(255) Class1_Sub22 local255 = (Class1_Sub22) local250.method1690(); local255 != null; local255 = (Class1_Sub22) local250.method1691()) {
				if (local151 == local132) {
					Static102.method6044(local255);
				}
				local151++;
			}
		}
		Static217.aBoolean322 = false;
		Static128.method5289(Static361.anInt6937, Static35.anInt920, Static208.anInt4100, Static182.anInt3706);
		return;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIII)I")
	public static int method4182(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub26 local8 = Static65.method5281(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray256.length) {
			return local8.anIntArray256[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lclient!td;")
	public static Class194 method4184(@OriginalArg(1) int arg0) {
		@Pc(19) Class194 local19 = (Class194) Static27.aClass21_25.method854((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static311.aClass30_84.method1161(arg0, 36);
		local19 = new Class194();
		local19.anInt5827 = arg0;
		if (local29 != null) {
			local19.method5258(new Class1_Sub7(local29));
		}
		local19.method5260();
		Static27.aClass21_25.method843(local19, (long) arg0);
		return local19;
	}
}
