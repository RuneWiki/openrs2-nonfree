import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
	public static int anInt7931;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
	public static int anInt7940;

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
	public static int anInt7943;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)I")
	public static int method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(50) int local50 = Static198.method3444(4, arg0 + 45365, arg1 + 91923) + (Static198.method3444(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static198.method3444(1, arg0, arg1) + -128 >> 2) - 128;
		local50 = (int) ((double) local50 * 0.3D) + 35;
		if (local50 < 10) {
			local50 = 10;
		} else if (local50 > 60) {
			local50 = 60;
		}
		return local50;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method6253(@OriginalArg(0) Class31 arg0) {
		@Pc(7) int local7 = Static89.anInt2311;
		@Pc(9) int local9 = Static111.anInt2680;
		@Pc(11) int local11 = Static240.anInt4751;
		@Pc(15) int local15 = Static126.anInt2888 - 3;
		if (Static172.aClass73_14 == null || Static227.aClass73_16 == null) {
			if (Static194.aClass284_60.method6347(Static448.anInt10224) && Static194.aClass284_60.method6347(Static27.anInt302)) {
				Static172.aClass73_14 = arg0.method8086(Static607.method8163(Static194.aClass284_60, Static448.anInt10224, 0), true);
				@Pc(61) Class365 local61 = Static607.method8163(Static194.aClass284_60, Static27.anInt302, 0);
				Static227.aClass73_16 = arg0.method8086(local61, true);
				local61.method8157();
				Static127.aClass73_8 = arg0.method8086(local61, true);
			} else {
				arg0.J(local7, local9, local11, 20, Static551.anInt9636 | 255 - Static404.anInt7297 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static172.aClass73_14 != null && Static227.aClass73_16 != null) {
			local88 = (local11 - Static227.aClass73_16.E() * 2) / Static172.aClass73_14.E();
			for (local90 = 0; local90 < local88; local90++) {
				Static172.aClass73_14.method7957(Static227.aClass73_16.E() + local7 + local90 * Static172.aClass73_14.E(), local9);
			}
			Static227.aClass73_16.method7957(local7, local9);
			Static127.aClass73_8.method7957(local7 + local11 - Static127.aClass73_8.E(), local9);
		}
		Static465.aClass63_10.method6881(Static573.aClass350_28.method7730(Static201.anInt4321), -1, local7 + 3, Static155.anInt3521 | 0xFF000000, local9 + 14);
		arg0.J(local7, local9 + 20, local11, local15 - 20, -Static404.anInt7297 + 255 << 24 | Static551.anInt9636, 1);
		local88 = Static234.aClass54_4.method7306();
		local90 = Static234.aClass54_4.method7315();
		@Pc(175) int local175 = 0;
		@Pc(202) int local202;
		for (@Pc(184) Class3_Sub13 local184 = (Class3_Sub13) Static260.aClass244_40.method5572(); local184 != null; local184 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			local202 = local9 + (Static161.anInt3613 - local175 + -1) * 16 + 33;
			local175++;
			if (local7 < local88 && local7 + local11 > local88 && local90 > local202 - 13 && local90 < local202 + 4 && local184.aBoolean173) {
				arg0.J(local7, local202 - 12, local11, 16, 255 - Static78.anInt4061 << 24 | Static435.anInt7685, 1);
			}
		}
		if ((Static51.aClass73_33 == null || Static492.aClass73_38 == null || Static355.aClass73_34 == null) && Static194.aClass284_60.method6347(Static322.anInt5884) && Static194.aClass284_60.method6347(Static72.anInt1991) && Static194.aClass284_60.method6347(Static551.anInt9633)) {
			@Pc(279) Class365 local279 = Static607.method8163(Static194.aClass284_60, Static72.anInt1991, 0);
			Static492.aClass73_38 = arg0.method8086(local279, true);
			local279.method8157();
			Static118.aClass73_7 = arg0.method8086(local279, true);
			Static51.aClass73_33 = arg0.method8086(Static607.method8163(Static194.aClass284_60, Static322.anInt5884, 0), true);
			@Pc(304) Class365 local304 = Static607.method8163(Static194.aClass284_60, Static551.anInt9633, 0);
			Static355.aClass73_34 = arg0.method8086(local304, true);
			local304.method8157();
			Static115.aClass73_5 = arg0.method8086(local304, true);
		}
		@Pc(370) int local370;
		@Pc(335) int local335;
		if (Static51.aClass73_33 != null && Static492.aClass73_38 != null && Static355.aClass73_34 != null) {
			local202 = (local11 - Static355.aClass73_34.E() * 2) / Static51.aClass73_33.E();
			for (local335 = 0; local335 < local202; local335++) {
				Static51.aClass73_33.method7957(local7 + Static355.aClass73_34.E() + local335 * Static51.aClass73_33.E(), local9 - -local15 - Static51.aClass73_33.u());
			}
			local370 = (local15 - Static355.aClass73_34.u() - 20) / Static492.aClass73_38.u();
			for (@Pc(372) int local372 = 0; local372 < local370; local372++) {
				Static492.aClass73_38.method7957(local7, local9 + Static492.aClass73_38.u() * local372 + 20);
				Static118.aClass73_7.method7957(local11 + local7 - Static118.aClass73_7.E(), Static492.aClass73_38.u() * local372 + local9 - -20);
			}
			Static355.aClass73_34.method7957(local7, local15 + local9 - Static355.aClass73_34.u());
			Static115.aClass73_5.method7957(local11 + local7 - Static355.aClass73_34.E(), local15 + local9 + -Static355.aClass73_34.u());
		}
		local175 = 0;
		for (@Pc(440) Class3_Sub13 local440 = (Class3_Sub13) Static260.aClass244_40.method5572(); local440 != null; local440 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			local335 = local9 + (Static161.anInt3613 - local175 - 1) * 16 + 33;
			local370 = Static155.anInt3521 | 0xFF000000;
			if (local7 < local88 && local88 < local7 + local11 && local335 - 13 < local90 && local90 < local335 + 4 && local440.aBoolean173) {
				local370 = Static487.anInt8411 | 0xFF000000;
			}
			@Pc(498) int[] local498 = null;
			if (Static549.method7512(local440.anInt2364)) {
				local498 = Static272.aClass121_2.method3327((int) local440.aLong42).anIntArray199;
			} else if (local440.anInt2365 != -1) {
				local498 = Static272.aClass121_2.method3327(local440.anInt2365).anIntArray199;
			} else if (Static55.method6551(local440.anInt2364)) {
				@Pc(531) Class3_Sub39 local531 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local440.aLong42);
				if (local531 != null) {
					@Pc(536) Class25_Sub2_Sub2_Sub5_Sub2 local536 = local531.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					@Pc(539) Class213 local539 = local536.aClass213_1;
					if (local539.anIntArray345 != null) {
						local539 = local539.method4998(Static206.aClass143_3);
					}
					if (local539 != null) {
						local498 = local539.anIntArray347;
					}
				}
			} else if (Static343.method5003(local440.anInt2364)) {
				@Pc(573) Class194 local573;
				if (local440.anInt2364 == 1002) {
					local573 = Static536.aClass146_4.method3721((int) local440.aLong42);
				} else {
					local573 = Static536.aClass146_4.method3721((int) (local440.aLong42 >>> 32 & 0x7FFFFFFFL));
				}
				if (local573.anIntArray286 != null) {
					local573 = local573.method4696(Static206.aClass143_3);
				}
				if (local573 != null) {
					local498 = local573.anIntArray284;
				}
			}
			@Pc(610) String local610 = Static585.method7963(local440);
			if (local498 != null) {
				local610 = local610 + Static291.method4365(local498);
			}
			Static465.aClass63_10.method6877(local610, local370, local335, Static147.aClass73Array5, local7 + 3, Static93.anIntArray79);
			if (local440.aBoolean172) {
				Static34.aClass73_9.method7957(Static35.aClass328_1.method7371(local610) + local7 + 5, local335 - 12);
			}
			local175++;
		}
		Static303.method4583(Static111.anInt2680, Static240.anInt4751, Static126.anInt2888, Static89.anInt2311);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6255(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BC)Z")
	public static boolean method6256(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)Z")
	public static boolean method6260(@OriginalArg(1) int arg0) {
		return arg0 == 12 || arg0 == 5 || arg0 == 1006 || arg0 == 58 || arg0 == 57;
	}
}
