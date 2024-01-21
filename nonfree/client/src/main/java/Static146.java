import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array11;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1998 = Static118.method2249("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1999 = Static118.method2249("Loaded update list");

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2000 = aClass65_1999;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2001 = Static118.method2249("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2002 = Static118.method2249("blinken2:");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!w;)V")
	public static void method2641(@OriginalArg(1) Class6_Sub4 arg0) {
		arg0.anInt3946 = arg0.anInt3954;
		if (arg0.anInt3951 == 0) {
			arg0.anInt3955 = 0;
			return;
		}
		if (arg0.anInt3945 != -1 && arg0.anInt3956 == 0) {
			@Pc(30) Class1_Sub2_Sub14 local30 = Static173.method2924(arg0.anInt3945);
			if (arg0.anInt3953 > 0 && local30.anInt2508 == 0) {
				arg0.anInt3955++;
				return;
			}
			if (arg0.anInt3953 <= 0 && local30.anInt2491 == 0) {
				arg0.anInt3955++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.anInt3934;
		@Pc(71) int local71 = arg0.anInt3976;
		@Pc(86) int local86 = arg0.anIntArray451[arg0.anInt3951 - 1] * 128 + arg0.anInt3959 * 64;
		@Pc(101) int local101 = arg0.anInt3959 * 64 + arg0.anIntArray455[arg0.anInt3951 - 1] * 128;
		if (local86 - local68 > 256 || local86 - local68 < -256 || local101 - local71 > 256 || local101 - local71 < -256) {
			arg0.anInt3934 = local86;
			arg0.anInt3976 = local101;
			return;
		}
		if (local68 < local86) {
			if (local71 < local101) {
				arg0.anInt3965 = 1280;
			} else if (local101 >= local71) {
				arg0.anInt3965 = 1536;
			} else {
				arg0.anInt3965 = 1792;
			}
		} else if (local68 <= local86) {
			if (local101 > local71) {
				arg0.anInt3965 = 1024;
			} else if (local71 > local101) {
				arg0.anInt3965 = 0;
			}
		} else if (local101 > local71) {
			arg0.anInt3965 = 768;
		} else if (local71 > local101) {
			arg0.anInt3965 = 256;
		} else {
			arg0.anInt3965 = 512;
		}
		@Pc(215) int local215 = arg0.anInt3965 - arg0.anInt3971 & 0x7FF;
		@Pc(218) int local218 = arg0.anInt3932;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		if (local215 >= -256 && local215 <= 256) {
			local218 = arg0.anInt3972;
		} else if (local215 >= 256 && local215 < 768) {
			local218 = arg0.anInt3969;
		} else if (local215 >= -768 && local215 <= -256) {
			local218 = arg0.anInt3938;
		}
		@Pc(266) int local266 = 4;
		if (local218 == -1) {
			local218 = arg0.anInt3972;
		}
		arg0.anInt3946 = local218;
		@Pc(277) boolean local277 = true;
		if (arg0 instanceof Class6_Sub4_Sub2) {
			local277 = ((Class6_Sub4_Sub2) arg0).aClass1_Sub2_Sub11_1.aBoolean65;
		}
		if (local277) {
			if (arg0.anInt3971 != arg0.anInt3965 && arg0.anInt3928 == -1 && arg0.anInt3939 != 0) {
				local266 = 2;
			}
			if (arg0.anInt3951 > 2) {
				local266 = 6;
			}
			if (arg0.anInt3951 > 3) {
				local266 = 8;
			}
			if (arg0.anInt3955 > 0 && arg0.anInt3951 > 1) {
				arg0.anInt3955--;
				local266 = 8;
			}
		} else {
			if (arg0.anInt3951 > 1) {
				local266 = 6;
			}
			if (arg0.anInt3951 > 2) {
				local266 = 8;
			}
			if (arg0.anInt3955 > 0 && arg0.anInt3951 > 1) {
				local266 = 8;
				arg0.anInt3955--;
			}
		}
		if (arg0.aBooleanArray17[arg0.anInt3951 - 1]) {
			local266 <<= 0x1;
		}
		if (local86 > local68) {
			arg0.anInt3934 += local266;
			if (arg0.anInt3934 > local86) {
				arg0.anInt3934 = local86;
			}
		} else if (local68 > local86) {
			arg0.anInt3934 -= local266;
			if (local86 > arg0.anInt3934) {
				arg0.anInt3934 = local86;
			}
		}
		if (local71 < local101) {
			arg0.anInt3976 += local266;
			if (local101 < arg0.anInt3976) {
				arg0.anInt3976 = local101;
			}
		} else if (local101 < local71) {
			arg0.anInt3976 -= local266;
			if (local101 > arg0.anInt3976) {
				arg0.anInt3976 = local101;
			}
		}
		if (local266 >= 8 && arg0.anInt3946 == arg0.anInt3972 && arg0.anInt3927 != -1) {
			arg0.anInt3946 = arg0.anInt3927;
		}
		if (local86 == arg0.anInt3934 && arg0.anInt3976 == local101) {
			if (arg0.anInt3953 > 0) {
				arg0.anInt3953--;
			}
			arg0.anInt3951--;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public static void method2643(@OriginalArg(1) int arg0) {
		Static136.method2573();
		Static93.method1768();
		@Pc(8) int local8 = Static207.method3284(arg0).anInt960;
		if (local8 == 0) {
			return;
		}
		@Pc(22) int local22 = Static135.anIntArray379[arg0];
		if (local8 == 1) {
			Static43.anInt1113 = local22;
			if (Static43.anInt1113 == 1) {
				Static56.method1027(0.9F);
			}
			if (Static43.anInt1113 == 2) {
				Static56.method1027(0.8F);
			}
			if (Static43.anInt1113 == 3) {
				Static56.method1027(0.7F);
			}
			if (Static43.anInt1113 == 4) {
				Static56.method1027(0.6F);
			}
			Static21.method396();
		}
		if (local8 == 3) {
			@Pc(56) short local56 = 0;
			if (local22 == 0) {
				local56 = 255;
			}
			if (local22 == 1) {
				local56 = 192;
			}
			if (local22 == 2) {
				local56 = 128;
			}
			if (local22 == 3) {
				local56 = 64;
			}
			if (local22 == 4) {
				local56 = 0;
			}
			if (local56 != Static135.anInt3352) {
				if (Static135.anInt3352 == 0 && Static12.anInt306 != -1) {
					Static165.method2842(Static16.aClass60_Sub1_15, local56, Static12.anInt306);
					Static128.aBoolean132 = false;
				} else if (local56 == 0) {
					Static1.method3302();
					Static128.aBoolean132 = false;
				} else {
					Static92.method1760(local56);
				}
				Static135.anInt3352 = local56;
			}
		}
		if (local8 == 4) {
			if (local22 == 0) {
				Static7.anInt172 = 127;
			}
			if (local22 == 1) {
				Static7.anInt172 = 96;
			}
			if (local22 == 2) {
				Static7.anInt172 = 64;
			}
			if (local22 == 3) {
				Static7.anInt172 = 32;
			}
			if (local22 == 4) {
				Static7.anInt172 = 0;
			}
		}
		if (local8 == 10) {
			if (local22 == 0) {
				Static53.anInt1436 = 127;
			}
			if (local22 == 1) {
				Static53.anInt1436 = 96;
			}
			if (local22 == 2) {
				Static53.anInt1436 = 64;
			}
			if (local22 == 3) {
				Static53.anInt1436 = 32;
			}
			if (local22 == 4) {
				Static53.anInt1436 = 0;
			}
		}
		if (local8 == 9) {
			Static116.anInt2834 = local22;
		}
		if (local8 == 5) {
			Static201.anInt3942 = local22;
		}
		if (local8 == 6) {
			Static128.anInt3157 = local22;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public static void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class91 local7 = Static27.aClass91ArrayArrayArray1[Static207.anInt4425][arg0][arg1];
		if (local7 == null) {
			Static95.method1802(Static207.anInt4425, arg0, arg1);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class1_Sub2_Sub18 local22 = null;
		@Pc(27) Class1_Sub2_Sub18 local27;
		for (local27 = (Class1_Sub2_Sub18) local7.method3148(); local27 != null; local27 = (Class1_Sub2_Sub18) local7.method3150()) {
			@Pc(36) Class1_Sub2_Sub2 local36 = Static40.method700(local27.aClass6_Sub7_1.anInt3630);
			@Pc(39) int local39 = local36.anInt285;
			if (local36.anInt321 == 1) {
				local39 *= local27.aClass6_Sub7_1.anInt3626 + 1;
			}
			if (local39 > local20) {
				local20 = local39;
				local22 = local27;
			}
		}
		if (local22 == null) {
			Static95.method1802(Static207.anInt4425, arg0, arg1);
			return;
		}
		@Pc(83) Class6_Sub7 local83 = null;
		@Pc(85) Class6_Sub7 local85 = null;
		local7.method3146(local22);
		for (local27 = (Class1_Sub2_Sub18) local7.method3148(); local27 != null; local27 = (Class1_Sub2_Sub18) local7.method3150()) {
			@Pc(100) Class6_Sub7 local100 = local27.aClass6_Sub7_1;
			if (local22.aClass6_Sub7_1.anInt3630 != local100.anInt3630) {
				if (local83 == null) {
					local83 = local100;
				}
				if (local83.anInt3630 != local100.anInt3630 && local85 == null) {
					local85 = local100;
				}
			}
		}
		@Pc(139) long local139 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static178.method3024(Static207.anInt4425, arg0, arg1, Static171.method2896(arg0 * 128 + 64, Static207.anInt4425, arg1 * 128 + 64), local22.aClass6_Sub7_1, local139, local83, local85);
	}
}
