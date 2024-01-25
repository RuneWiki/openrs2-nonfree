import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!df;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_23 = new Class106("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public static int anInt578 = 0;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Z")
	public static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_24 = new Class106("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg3; local7++) {
			for (@Pc(14) int local14 = arg4; local14 <= arg1; local14++) {
				if (Static344.anIntArrayArray50[local7][local14] == arg0 && Static281.anIntArrayArray60[local7][local14] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Lclient!lk;")
	public static Class1_Sub4_Sub17 method609() {
		@Pc(13) Class1_Sub4_Sub17 local13 = (Class1_Sub4_Sub17) Static158.aClass89_3.method2718();
		if (local13 != null) {
			local13.method6045();
			local13.method5714();
			return local13;
		}
		do {
			local13 = (Class1_Sub4_Sub17) Static239.aClass89_6.method2718();
			if (local13 == null) {
				return null;
			}
			if (local13.method3482() > Static183.method3462()) {
				return null;
			}
			local13.method6045();
			local13.method5714();
		} while ((local13.aLong211 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!td;Lclient!eg;Lclient!fp;)V")
	public static void method610(@OriginalArg(1) Class194 arg0, @OriginalArg(2) Class1_Sub17 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(10) Class4 local10 = arg0.method5265(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5962();
		if (local16 < local10.method5952()) {
			local16 = local10.method5952();
		}
		@Pc(32) int local32 = arg1.anInt1644;
		@Pc(35) int local35 = arg1.anInt1643;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(83) int local83;
		if (arg0.aString51 != null) {
			local37 = Static315.aClass80_15.method2540(null, null, Static160.aStringArray15, arg0.aString51);
			for (local60 = 0; local60 < local37; local60++) {
				@Pc(66) String local66 = Static160.aStringArray15[local60];
				if (local37 - 1 > local60) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local83 = Static21.aClass174_3.method4794(local66);
				if (local83 > local39) {
					local39 = local83;
				}
			}
			local46 = Static21.aClass174_3.method4791() * local37 + Static21.aClass174_3.method4795() / 2;
		}
		local60 = arg1.anInt1644 + local16 / 2;
		if (Static269.anInt3325 + local16 > local32) {
			local32 = Static269.anInt3325;
			local60 = Static269.anInt3325 + local16 / 2 + local39 / 2 + 5 + 10;
		} else if (local32 > Static269.anInt3323 - local16) {
			local32 = Static269.anInt3323 - local16;
			local60 = Static269.anInt3323 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		@Pc(173) int local173 = arg1.anInt1643;
		if (local35 < local16 + Static269.anInt3317) {
			local173 = local16 / 2 + Static269.anInt3317 + 10;
			local35 = Static269.anInt3317;
		} else if (Static269.anInt3319 - local16 < local35) {
			local173 = Static269.anInt3319 - local46 - local16 / 2 - 10;
			local35 = Static269.anInt3319 - local16;
		}
		local83 = (int) (Math.atan2((double) (local32 - arg1.anInt1644), (double) (local35 - arg1.anInt1643)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5967((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local83);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg0.aString51 != null) {
			local265 = local173;
			local263 = local60 - local39 / 2 - 5;
			local267 = local263 + local39 + 10;
			local269 = Static21.aClass174_3.method4791() * local37 + local173 + 3;
			if (arg0.anInt5835 != 0) {
				arg2.method4639(local173, local263, local269 - local173, arg0.anInt5835, local267 - local263);
			}
			if (arg0.anInt5838 != 0) {
				arg2.method4577(local269 - local173, local263, arg0.anInt5838, local267 - local263, local173);
			}
			for (@Pc(342) int local342 = 0; local342 < local37; local342++) {
				@Pc(348) String local348 = Static160.aStringArray15[local342];
				if (local37 - 1 > local342) {
					local348 = local348.substring(0, local348.length() - 4);
				}
				Static21.aClass174_3.method4790(arg2, local348, local60, local173, arg0.anInt5843);
				local173 += Static21.aClass174_3.method4791();
			}
		}
		if (arg0.anInt5823 == -1 && arg0.aString51 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(399) Class1_Sub32 local399 = new Class1_Sub32(arg1);
		local399.anInt4651 = local16 + local32;
		local399.anInt4648 = local32 - local16;
		local399.anInt4644 = local16 + local35;
		local399.anInt4650 = local269;
		local399.anInt4645 = local267;
		local399.anInt4640 = local35 - local16;
		local399.anInt4642 = local265;
		local399.anInt4639 = local263;
		Static164.aClass42_22.method1549(local399);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(CZ)Z")
	public static boolean method611(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
	public static int method612(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0xB3333333) + (local9 & 0x33333333);
		@Pc(37) int local37 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
	public static void method613() {
		if (Static359.aBoolean505) {
			Static214.aClass4_16 = null;
			Static355.aClass4_25 = null;
			Static359.aBoolean505 = false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public static void method614() {
		if (Static108.aClass121_3 == null) {
			return;
		}
		if (Static108.aClass121_3.anInt3693 == 1) {
			Static108.aClass121_3 = null;
			return;
		}
		if (Static108.aClass121_3.anInt3693 == 2) {
			Static149.method2881(Static39.aString4, 2, Static107.aClass75_2);
			Static108.aClass121_3 = null;
			return;
		}
	}
}
