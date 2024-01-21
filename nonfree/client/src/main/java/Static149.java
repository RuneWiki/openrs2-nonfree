import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "Z")
	public static boolean aBoolean131;

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "[[Lclient!vg;")
	public static Class85[][] aClass85ArrayArray1;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1435 = Static32.method683(" <col=ffffff>");

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "[S")
	public static short[] aShortArray33 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method2451() {
		@Pc(9) int local9 = Static116.anInt2428 * 128 + 64;
		@Pc(15) int local15 = Static12.anInt221 * 128 + 64;
		@Pc(24) int local24 = Static18.method346(local9, Static66.anInt1396, local15) - Static79.anInt4043;
		if (local15 > Static35.anInt894) {
			Static35.anInt894 += (local15 - Static35.anInt894) * Static30.anInt745 / 1000 + Static165.anInt3583;
			if (Static35.anInt894 > local15) {
				Static35.anInt894 = local15;
			}
		}
		if (local9 > Static101.anInt2150) {
			Static101.anInt2150 += Static30.anInt745 * (local9 - Static101.anInt2150) / 1000 + Static165.anInt3583;
			if (local9 < Static101.anInt2150) {
				Static101.anInt2150 = local9;
			}
		}
		if (local24 > Static110.anInt2302) {
			Static110.anInt2302 += (local24 - Static110.anInt2302) * Static30.anInt745 / 1000 + Static165.anInt3583;
			if (local24 < Static110.anInt2302) {
				Static110.anInt2302 = local24;
			}
		}
		if (local15 < Static35.anInt894) {
			Static35.anInt894 -= Static30.anInt745 * (Static35.anInt894 - local15) / 1000 + Static165.anInt3583;
			if (Static35.anInt894 < local15) {
				Static35.anInt894 = local15;
			}
		}
		if (Static101.anInt2150 > local9) {
			Static101.anInt2150 -= Static165.anInt3583 + Static30.anInt745 * (Static101.anInt2150 - local9) / 1000;
			if (Static101.anInt2150 < local9) {
				Static101.anInt2150 = local9;
			}
		}
		if (local24 < Static110.anInt2302) {
			Static110.anInt2302 -= Static165.anInt3583 + Static30.anInt745 * (Static110.anInt2302 - local24) / 1000;
			if (Static110.anInt2302 < local24) {
				Static110.anInt2302 = local24;
			}
		}
		local15 = Static107.anInt2244 * 128 + 64;
		local9 = Static146.anInt3098 * 128 + 64;
		local24 = Static18.method346(local9, Static66.anInt1396, local15) - Static20.anInt446;
		@Pc(199) int local199 = local24 - Static110.anInt2302;
		@Pc(203) int local203 = local9 - Static101.anInt2150;
		@Pc(207) int local207 = local15 - Static35.anInt894;
		@Pc(218) int local218 = (int) Math.sqrt((double) (local203 * local203 + local207 * local207));
		@Pc(229) int local229 = (int) (Math.atan2((double) local199, (double) local218) * 325.949D) & 0x7FF;
		@Pc(240) int local240 = (int) (-325.949D * Math.atan2((double) local207, (double) local203)) & 0x7FF;
		if (local229 < 128) {
			local229 = 128;
		}
		@Pc(250) int local250 = local240 - Static127.anInt2754;
		if (local250 > 1024) {
			local250 -= 2048;
		}
		if (local229 > 383) {
			local229 = 383;
		}
		if (local250 < -1024) {
			local250 += 2048;
		}
		if (local229 > Static66.anInt1389) {
			Static66.anInt1389 += (local229 - Static66.anInt1389) * Static138.anInt2939 / 1000 + Static160.anInt3501;
			if (Static66.anInt1389 > local229) {
				Static66.anInt1389 = local229;
			}
		}
		if (local250 > 0) {
			Static127.anInt2754 += Static160.anInt3501 + local250 * Static138.anInt2939 / 1000;
			Static127.anInt2754 &= 0x7FF;
		}
		if (local250 < 0) {
			Static127.anInt2754 -= Static160.anInt3501 + -local250 * Static138.anInt2939 / 1000;
			Static127.anInt2754 &= 0x7FF;
		}
		@Pc(342) int local342 = local240 - Static127.anInt2754;
		if (local229 < Static66.anInt1389) {
			Static66.anInt1389 -= Static160.anInt3501 + (Static66.anInt1389 - local229) * Static138.anInt2939 / 1000;
			if (Static66.anInt1389 < local229) {
				Static66.anInt1389 = local229;
			}
		}
		if (local342 > 1024) {
			local342 -= 2048;
		}
		if (local342 < -1024) {
			local342 += 2048;
		}
		if (local342 < 0 && local250 > 0 || local342 > 0 && local250 < 0) {
			Static127.anInt2754 = local240;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method2452() {
		aShortArray33 = null;
		aClass49_1435 = null;
		aClass85ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIILclient!ka;J)V")
	public static void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub3 arg4, @OriginalArg(5) long arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class26 local6 = new Class26();
		local6.aClass2_Sub2_Sub3_7 = arg4;
		local6.anInt1064 = arg1 * 128 + 64;
		local6.anInt1063 = arg2 * 128 + 64;
		local6.anInt1061 = arg3;
		local6.aLong44 = arg5;
		if (Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub1(arg0, arg1, arg2);
		}
		Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local6;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ja;ZLclient!lf;)I")
	public static int method2455(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(2) int local2 = arg0.anInt3940;
		arg0.method2950(arg1.anInt2058);
		arg0.anInt3940 += Static18.aClass3_1.method50(0, arg0.aByteArray49, arg0.anInt3940, arg1.aByteArray28, arg1.anInt2058);
		return arg0.anInt3940 - local2;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)Lclient!lf;")
	public static Class49 method2458(@OriginalArg(2) int arg0) {
		return Static146.method2398(true, arg0);
	}
}
