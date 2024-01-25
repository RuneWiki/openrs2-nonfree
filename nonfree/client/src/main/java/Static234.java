import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
	public static int anInt4271;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BI)I")
	public static int method3743(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!ei;I)Z")
	public static boolean method3744(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method2456(2);
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(106) int local106;
		@Pc(110) int local110;
		@Pc(116) int local116;
		if (local8 == 0) {
			if (arg1.method2456(1) != 0) {
				method3744(arg0, arg1);
			}
			local32 = arg1.method2456(6);
			local37 = arg1.method2456(6);
			@Pc(49) boolean local49 = arg1.method2456(1) == 1;
			if (local49) {
				Static494.anIntArray565[Static136.anInt2909++] = arg0;
			}
			if (Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(72) Class122 local72 = Static44.aClass122Array1[arg0];
			@Pc(80) Class16_Sub1_Sub1_Sub3_Sub2 local80 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[arg0] = new Class16_Sub1_Sub1_Sub3_Sub2();
			local80.anInt8075 = arg0;
			if (Static365.aClass2_Sub17Array1[arg0] != null) {
				local80.method7023(Static365.aClass2_Sub17Array1[arg0]);
			}
			local80.method7000(true, local72.anInt3504);
			local80.anInt8100 = local72.anInt3503;
			local106 = local72.anInt3507;
			local110 = local106 >> 28;
			local116 = local106 >> 14 & 0xFF;
			@Pc(120) int local120 = local106 & 0xFF;
			@Pc(129) int local129 = (local116 << 6) + local32 - Static406.anInt6899;
			@Pc(138) int local138 = local37 + (local120 << 6) - Static338.anInt5885;
			local80.aBoolean592 = local72.aBoolean269;
			local80.aByteArray85[0] = Static645.aByteArray107[arg0];
			local80.aByte109 = local80.aByte108 = (byte) local110;
			if (Static481.method6813(local138, local129)) {
				local80.aByte108++;
			}
			local80.method7017(local129, local138);
			local80.aBoolean591 = false;
			Static44.aClass122Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local32 = arg1.method2456(2);
			local37 = Static44.aClass122Array1[arg0].anInt3507;
			Static44.aClass122Array1[arg0].anInt3507 = ((local32 + (local37 >> 28) & 0x3) << 28) + (local37 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(238) int local238;
			@Pc(243) int local243;
			@Pc(252) int local252;
			if (local8 != 2) {
				local32 = arg1.method2456(18);
				local37 = local32 >> 16;
				local238 = local32 >> 8 & 0xFF;
				local243 = local32 & 0xFF;
				local252 = Static44.aClass122Array1[arg0].anInt3507;
				local106 = local37 + (local252 >> 28) & 0x3;
				local110 = (local252 >> 14) + local238 & 0xFF;
				local116 = local243 + local252 & 0xFF;
				Static44.aClass122Array1[arg0].anInt3507 = (local106 << 28) + (local110 << 14) + local116;
				return false;
			}
			local32 = arg1.method2456(5);
			local37 = local32 >> 3;
			local238 = local32 & 0x7;
			local243 = Static44.aClass122Array1[arg0].anInt3507;
			local252 = (local243 >> 28) + local37 & 0x3;
			local106 = local243 >> 14 & 0xFF;
			local110 = local243 & 0xFF;
			if (local238 == 0) {
				local110--;
				local106--;
			}
			if (local238 == 1) {
				local110--;
			}
			if (local238 == 2) {
				local110--;
				local106++;
			}
			if (local238 == 3) {
				local106--;
			}
			if (local238 == 4) {
				local106++;
			}
			if (local238 == 5) {
				local110++;
				local106--;
			}
			if (local238 == 6) {
				local110++;
			}
			if (local238 == 7) {
				local106++;
				local110++;
			}
			Static44.aClass122Array1[arg0].anInt3507 = local110 + (local106 << 14) + (local252 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	public static void method3745() {
		Static213.method3541(11);
		Static325.method4946();
		System.gc();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IBI)V")
	public static void method3746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static188.method3210(15, 0);
		local13.method925();
		local13.anInt855 = arg0;
		local13.anInt852 = arg1;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Lclient!cs;")
	public static Class2_Sub13 method3747() {
		if (Static371.aClass114_54 == null || Static601.aClass370_1 == null) {
			return null;
		}
		for (@Pc(19) Class2_Sub13 local19 = (Class2_Sub13) Static601.aClass370_1.method8625(); local19 != null; local19 = (Class2_Sub13) Static601.aClass370_1.method8625()) {
			@Pc(26) Class353 local26 = Static371.aClass336_4.method7855(local19.anInt2179);
			if (local26 != null && local26.aBoolean709 && local26.method8340(Static371.anInterface5_2)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	public static void method3749() {
		if (Static335.anInt5866 == 0) {
			return;
		}
		try {
			if (++Static115.anInt2455 > 2000) {
				if (Static341.aClass22_4 != null) {
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
				}
				if (Static480.anInt7772 >= 2) {
					Static284.anInt5164 = -5;
					Static335.anInt5866 = 0;
					return;
				}
				Static381.aClass155_15.method3615();
				Static480.anInt7772++;
				Static115.anInt2455 = 0;
				Static335.anInt5866 = 1;
			}
			if (Static335.anInt5866 == 1) {
				Static175.aClass319_2 = Static381.aClass155_15.method3617(Static265.aClass286_3);
				Static335.anInt5866 = 2;
			}
			if (Static335.anInt5866 == 2) {
				if (Static175.aClass319_2.anInt8562 == 2) {
					throw new IOException();
				}
				if (Static175.aClass319_2.anInt8562 != 1) {
					return;
				}
				Static341.aClass22_4 = Static393.method5805((Socket) Static175.aClass319_2.anObject19);
				Static175.aClass319_2 = null;
				Static255.method4268();
				Static335.anInt5866 = 4;
			}
			if (Static335.anInt5866 == 4) {
				if (!Static341.aClass22_4.method7464(1)) {
					return;
				}
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
				@Pc(109) int local109 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
				Static335.anInt5866 = 0;
				Static284.anInt5164 = local109;
				Static341.aClass22_4.method7460();
				Static341.aClass22_4 = null;
				return;
			}
		} catch (@Pc(120) IOException local120) {
			if (Static341.aClass22_4 != null) {
				Static341.aClass22_4.method7460();
				Static341.aClass22_4 = null;
			}
			if (Static480.anInt7772 >= 2) {
				Static335.anInt5866 = 0;
				Static284.anInt5164 = -4;
			} else {
				Static381.aClass155_15.method3615();
				Static335.anInt5866 = 1;
				Static480.anInt7772++;
				Static115.anInt2455 = 0;
			}
		}
	}
}
