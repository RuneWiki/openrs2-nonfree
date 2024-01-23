import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!lc;")
	public static Class98 aClass98_32;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public static int anInt1044;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	public static int anInt1043 = 255;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)I")
	public static int method861(@OriginalArg(0) boolean arg0) {
		@Pc(13) long local13 = Static133.method2163();
		for (@Pc(27) Class4_Sub33 local27 = arg0 ? (Class4_Sub33) Static140.aClass97_12.method2363() : (Class4_Sub33) Static140.aClass97_12.method2367(); local27 != null; local27 = (Class4_Sub33) Static140.aClass97_12.method2367()) {
			if ((local27.aLong196 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local27.aLong196 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local27.aLong200;
					Static221.anIntArray393[local53] = Static136.anIntArray250[local53];
					local27.method4391();
					return local53;
				}
				local27.method4391();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	public static void method862() {
		aClass98_32 = null;
		aString30 = null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZII[[II)I")
	public static int method863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(34) int local34 = arg3[arg0 + 1][arg2] * arg1 + arg3[arg0][arg2] * (128 - arg1) >> 7;
		@Pc(66) int local66 = arg3[arg0][arg2 + 1] * (128 - arg1) + arg3[arg0 + 1][arg2 + 1] * arg1 >> 7;
		return local66 * arg4 + (128 - arg4) * local34 >> 7;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public static void method864() {
		if (Static61.aClass64ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class64 local8 = new Class64();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(15) int local15 = 0; local15 < 13; local15++) {
				Static61.aClass64ArrayArray1[local10][local15] = local8;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
	public static void method865() {
		for (@Pc(3) int local3 = 0; local3 < Static84.anInt1709; local3++) {
			@Pc(14) int local14 = Static97.anIntArray219[local3];
			@Pc(18) Class12_Sub3_Sub1 local18 = Static100.aClass12_Sub3_Sub1Array1[local14];
			@Pc(22) int local22 = Static101.aClass4_Sub17_Sub1_4.method1874();
			if ((local22 & 0x8) != 0) {
				local22 += Static101.aClass4_Sub17_Sub1_4.method1874() << 8;
			}
			@Pc(43) int local43;
			@Pc(47) int local47;
			if ((local22 & 0x80) != 0) {
				local43 = Static101.aClass4_Sub17_Sub1_4.method1896();
				local47 = Static101.aClass4_Sub17_Sub1_4.method1865();
				if (local43 == 65535) {
					local43 = -1;
				}
				Static1.method8(local18, local43, local47);
			}
			if ((local22 & 0x200) != 0) {
				local18.anInt4156 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local18.anInt4147 = Static101.aClass4_Sub17_Sub1_4.method1837();
			}
			if ((local22 & 0x1) != 0) {
				local43 = Static101.aClass4_Sub17_Sub1_4.method1872();
				local47 = Static101.aClass4_Sub17_Sub1_4.method1882();
				local18.method3364(local43, local47, Static104.anInt2226);
			}
			if ((local22 & 0x40) != 0) {
				local18.aString130 = Static101.aClass4_Sub17_Sub1_4.method1841();
				local18.anInt4180 = 100;
			}
			if ((local22 & 0x10) != 0) {
				local18.anInt4184 = Static101.aClass4_Sub17_Sub1_4.method1896();
				if (local18.anInt4184 == 65535) {
					local18.anInt4184 = -1;
				}
			}
			if ((local22 & 0x4) != 0) {
				local43 = Static101.aClass4_Sub17_Sub1_4.method1882();
				local47 = Static101.aClass4_Sub17_Sub1_4.method1874();
				local18.method3364(local43, local47, Static104.anInt2226);
				local18.anInt4186 = Static104.anInt2226 + 300;
				local18.anInt4166 = Static101.aClass4_Sub17_Sub1_4.method1882();
			}
			if ((local22 & 0x20) != 0) {
				if (local18.aClass175_1.method4134()) {
					Static280.method4227(local18);
				}
				local18.method1562(Static262.method3970(Static101.aClass4_Sub17_Sub1_4.method1851()));
				local18.method3362(local18.aClass175_1.anInt5217);
				local18.anInt4126 = local18.aClass175_1.anInt5218;
				local18.anInt4115 = local18.aClass175_1.anInt5219;
				if (local18.aClass175_1.method4134()) {
					Static54.method872(local18.anIntArray379[0], null, local18, 0, local18.anIntArray376[0], null, Static210.anInt4103);
				}
			}
			if ((local22 & 0x2) != 0) {
				local43 = Static101.aClass4_Sub17_Sub1_4.method1896();
				local47 = Static101.aClass4_Sub17_Sub1_4.method1889();
				if (local43 == 65535) {
					local43 = -1;
				}
				@Pc(248) boolean local248 = true;
				if (local43 != -1 && local18.anInt4125 != -1 && Static296.method1376(Static262.method3973(local43).anInt3816).anInt4358 < Static296.method1376(Static262.method3973(local18.anInt4125).anInt3816).anInt4358) {
					local248 = false;
				}
				if (local248) {
					local18.anInt4125 = local43;
					local18.anInt4188 = 0;
					local18.anInt4154 = 0;
					local18.anInt4158 = 1;
					local18.anInt4187 = local47 >> 16;
					local18.anInt4144 = (local47 & 0xFFFF) + Static104.anInt2226;
					if (local18.anInt4144 > Static104.anInt2226) {
						local18.anInt4188 = -1;
					}
					if (local18.anInt4125 != -1 && local18.anInt4144 == Static104.anInt2226) {
						@Pc(328) int local328 = Static262.method3973(local18.anInt4125).anInt3816;
						if (local328 != -1) {
							@Pc(337) Class141 local337 = Static296.method1376(local328);
							if (local337 != null && local337.anIntArray390 != null) {
								Static11.method188(false, local337, local18.anInt4141, local18.anInt4113, 0);
							}
						}
					}
				}
			}
			if ((local22 & 0x100) != 0) {
				local43 = Static101.aClass4_Sub17_Sub1_4.method1874();
				@Pc(362) int[] local362 = new int[local43];
				@Pc(365) int[] local365 = new int[local43];
				@Pc(368) int[] local368 = new int[local43];
				for (@Pc(370) int local370 = 0; local370 < local43; local370++) {
					@Pc(377) int local377 = Static101.aClass4_Sub17_Sub1_4.method1896();
					if (local377 == 65535) {
						local377 = -1;
					}
					local362[local370] = local377;
					local368[local370] = Static101.aClass4_Sub17_Sub1_4.method1874();
					local365[local370] = Static101.aClass4_Sub17_Sub1_4.method1868();
				}
				Static213.method3412(local362, local365, local368, local18);
			}
		}
	}
}
