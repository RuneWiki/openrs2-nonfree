import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!lg;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_222 = Static158.method3034("OFF");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_226 = Static158.method3034("flash1:");

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!ob;")
	public static Class60 aClass60_223 = aClass60_226;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_224 = Static158.method3034("mn");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array7 = new Class60[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_225 = Static158.method3034("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_227 = aClass60_226;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_228 = aClass60_222;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_229 = aClass60_225;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt988 = 0;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static volatile int anInt993 = -1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_230 = Static158.method3034("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	public static int anInt994 = 1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!pe;Lclient!ob;ILclient!ob;)[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] method765(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(15) int local15 = arg0.method527(arg1);
		@Pc(21) int local21 = arg0.method514(local15, arg2);
		return Static134.method2771(local15, arg0, local21);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method766() {
		@Pc(14) int local14 = Static22.anInt700 * 128 + 64;
		@Pc(20) int local20 = Static70.anInt2137 * 128 + 64;
		@Pc(29) int local29 = Static182.method3393(Static62.anInt1923, local14, local20) - Static164.anInt4089;
		if (Static161.anInt4013 < local14) {
			Static161.anInt4013 += Static94.anInt2816 + Static82.anInt2430 * (local14 - Static161.anInt4013) / 1000;
			if (Static161.anInt4013 > local14) {
				Static161.anInt4013 = local14;
			}
		}
		if (Static161.anInt4013 > local14) {
			Static161.anInt4013 -= Static82.anInt2430 * (Static161.anInt4013 - local14) / 1000 + Static94.anInt2816;
			if (local14 > Static161.anInt4013) {
				Static161.anInt4013 = local14;
			}
		}
		if (local20 > Static166.anInt4103) {
			Static166.anInt4103 += Static94.anInt2816 + Static82.anInt2430 * (local20 - Static166.anInt4103) / 1000;
			if (Static166.anInt4103 > local20) {
				Static166.anInt4103 = local20;
			}
		}
		local14 = Static185.anInt4465 * 128 + 64;
		if (Static166.anInt4103 > local20) {
			Static166.anInt4103 -= Static82.anInt2430 * (Static166.anInt4103 - local20) / 1000 + Static94.anInt2816;
			if (Static166.anInt4103 < local20) {
				Static166.anInt4103 = local20;
			}
		}
		if (Static172.anInt4190 < local29) {
			Static172.anInt4190 += Static94.anInt2816 + (local29 - Static172.anInt4190) * Static82.anInt2430 / 1000;
			if (Static172.anInt4190 > local29) {
				Static172.anInt4190 = local29;
			}
		}
		local20 = Static149.anInt3855 * 128 + 64;
		if (local29 < Static172.anInt4190) {
			Static172.anInt4190 -= Static82.anInt2430 * (Static172.anInt4190 - local29) / 1000 + Static94.anInt2816;
			if (local29 > Static172.anInt4190) {
				Static172.anInt4190 = local29;
			}
		}
		local29 = Static182.method3393(Static62.anInt1923, local14, local20) - Static145.anInt3795;
		@Pc(195) int local195 = local29 - Static172.anInt4190;
		@Pc(199) int local199 = local14 - Static161.anInt4013;
		@Pc(203) int local203 = local20 - Static166.anInt4103;
		@Pc(215) int local215 = (int) Math.sqrt((double) (local199 * local199 + local203 * local203));
		@Pc(226) int local226 = (int) (Math.atan2((double) local195, (double) local215) * 325.949D) & 0x7FF;
		if (local226 < 128) {
			local226 = 128;
		}
		if (local226 > 383) {
			local226 = 383;
		}
		@Pc(251) int local251 = (int) (Math.atan2((double) local199, (double) local203) * -325.949D) & 0x7FF;
		@Pc(256) int local256 = local251 - Static158.anInt4007;
		if (local226 > Static19.anInt3094) {
			Static19.anInt3094 += (local226 - Static19.anInt3094) * Static57.anInt1786 / 1000 + Static112.anInt3133;
			if (local226 < Static19.anInt3094) {
				Static19.anInt3094 = local226;
			}
		}
		if (local256 > 1024) {
			local256 -= 2048;
		}
		if (local256 < -1024) {
			local256 += 2048;
		}
		if (Static19.anInt3094 > local226) {
			Static19.anInt3094 -= Static57.anInt1786 * (Static19.anInt3094 - local226) / 1000 + Static112.anInt3133;
			if (local226 > Static19.anInt3094) {
				Static19.anInt3094 = local226;
			}
		}
		if (local256 > 0) {
			Static158.anInt4007 += Static112.anInt3133 + Static57.anInt1786 * local256 / 1000;
			Static158.anInt4007 &= 0x7FF;
		}
		if (local256 < 0) {
			Static158.anInt4007 -= Static57.anInt1786 * -local256 / 1000 + Static112.anInt3133;
			Static158.anInt4007 &= 0x7FF;
		}
		@Pc(357) int local357 = local251 - Static158.anInt4007;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 < 0 && local256 > 0 || local357 > 0 && local256 < 0) {
			Static158.anInt4007 = local251;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)I")
	public static int method769(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBZ)I")
	public static int method770() {
		return Static64.anInt1969 + Static159.anInt4431;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
	public static int method771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method775() {
		while (true) {
			if (Static139.aClass2_Sub3_Sub1_32.method248(Static168.anInt4121) >= 27) {
				@Pc(26) int local26 = Static139.aClass2_Sub3_Sub1_32.method246(15);
				if (local26 != 32767) {
					@Pc(31) boolean local31 = false;
					if (Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26] == null) {
						Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26] = new Class2_Sub1_Sub1_Sub3_Sub2();
						local31 = true;
					}
					@Pc(47) Class2_Sub1_Sub1_Sub3_Sub2 local47 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
					Static180.anIntArray370[Static174.anInt4255++] = local26;
					local47.anInt3299 = Static20.anInt580;
					@Pc(63) int local63 = Static139.aClass2_Sub3_Sub1_32.method246(5);
					if (local63 > 15) {
						local63 -= 32;
					}
					@Pc(72) int local72 = Static139.aClass2_Sub3_Sub1_32.method246(1);
					@Pc(77) int local77 = Static139.aClass2_Sub3_Sub1_32.method246(1);
					if (local77 == 1) {
						Static113.anIntArray361[Static148.anInt3844++] = local26;
					}
					@Pc(97) int local97 = Static48.anIntArray141[Static139.aClass2_Sub3_Sub1_32.method246(3)];
					if (local31) {
						local47.anInt3255 = local47.anInt3265 = local97;
					}
					@Pc(110) int local110 = Static139.aClass2_Sub3_Sub1_32.method246(5);
					local47.aClass2_Sub1_Sub2_1 = Static50.method1143(Static139.aClass2_Sub3_Sub1_32.method246(14));
					local47.anInt3260 = local47.aClass2_Sub1_Sub2_1.anInt349;
					local47.anInt3278 = local47.aClass2_Sub1_Sub2_1.anInt347;
					if (local47.anInt3260 == 0) {
						local47.anInt3265 = 0;
					}
					local47.anInt3289 = local47.aClass2_Sub1_Sub2_1.anInt342;
					local47.anInt3258 = local47.aClass2_Sub1_Sub2_1.anInt335;
					local47.anInt3252 = local47.aClass2_Sub1_Sub2_1.anInt334;
					if (local110 > 15) {
						local110 -= 32;
					}
					local47.anInt3268 = local47.aClass2_Sub1_Sub2_1.anInt333;
					local47.anInt3296 = local47.aClass2_Sub1_Sub2_1.anInt348;
					local47.anInt3286 = local47.aClass2_Sub1_Sub2_1.anInt343;
					local47.anInt3279 = local47.aClass2_Sub1_Sub2_1.anInt319;
					local47.method2555(local110 + Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], local63 + Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], local72 == 1);
					continue;
				}
			}
			Static139.aClass2_Sub3_Sub1_32.method253();
			return;
		}
	}
}
