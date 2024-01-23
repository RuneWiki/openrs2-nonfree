import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public static int anInt1531;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array2;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!hh;")
	private static Class50 aClass50_497 = Static186.method3527("Allocating memory");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_498 = aClass50_497;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_499 = Static186.method3527("headicons_pk");

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt1533 = 0;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!mi;")
	public static Class75 aClass75_9 = new Class75();

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!hh;")
	private static Class50 aClass50_500 = Static186.method3527("skill)2");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!hh;")
	public static Class50 aClass50_501 = aClass50_500;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = 2048 - arg0 & 0x7FF;
		@Pc(13) int local13 = 2048 - arg3 & 0x7FF;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = arg4;
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local6 != 0) {
			local38 = Class120.anIntArray491[local6];
			local30 = local38 * -arg4 >> 16;
			local49 = Class120.anIntArray492[local6];
			local32 = local49 * arg4 >> 16;
		}
		if (local13 != 0) {
			local38 = Class120.anIntArray491[local13];
			local28 = local38 * local32 >> 16;
			local49 = Class120.anIntArray492[local13];
			local32 = local49 * local32 >> 16;
		}
		Static32.anInt601 = arg1 - local30;
		Static218.anInt3563 = arg0;
		Static166.anInt3404 = arg3;
		Static137.anInt2804 = arg5 - local32;
		Static159.anInt4227 = arg2 - local28;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIIIZI)V")
	public static void method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg0;
		@Pc(9) int local9 = 0;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg5 - arg2;
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = arg0 * arg0;
		@Pc(37) int local37 = local20 * local20;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg0 << 1;
		@Pc(70) int local70 = local45 + (1 - local61) * local29;
		@Pc(79) int local79 = local33 - (local61 - 1) * local49;
		@Pc(83) int local83 = local25 << 1;
		@Pc(92) int local92 = (1 - local83) * local37 + local53;
		@Pc(100) int local100 = local41 - local57 * (local83 - 1);
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local45 * 3;
		@Pc(120) int local120 = local41 << 2;
		@Pc(124) int local124 = local53 * 3;
		@Pc(130) int local130 = (local83 - 3) * local57;
		@Pc(136) int local136 = (local61 - 3) * local49;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg0 - 1);
		@Pc(146) int local146 = local120;
		@Pc(152) int local152 = (local25 - 1) * local112;
		@Pc(156) int[] local156 = Static139.anIntArrayArray21[arg4];
		Static107.method1641(arg6 - arg5, arg3, local156, arg6 - local20);
		Static107.method1641(arg6 - local20, arg1, local156, arg6 + local20);
		Static107.method1641(arg6 + local20, arg3, local156, arg6 + arg5);
		while (local3 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local15++;
					local79 += local138;
					local138 += local108;
					local70 += local116;
					local116 += local108;
				}
			}
			if (local79 < 0) {
				local79 += local138;
				local70 += local116;
				local116 += local108;
				local138 += local108;
				local15++;
			}
			local79 += -local136;
			local70 += -local144;
			local136 -= local104;
			local144 -= local104;
			@Pc(260) boolean local260 = local3 <= local25;
			if (local260) {
				if (local92 < 0) {
					while (local92 < 0) {
						local100 += local146;
						local146 += local120;
						local92 += local124;
						local9++;
						local124 += local120;
					}
				}
				if (local100 < 0) {
					local92 += local124;
					local100 += local146;
					local9++;
					local124 += local120;
					local146 += local120;
				}
				local100 += -local130;
				local130 -= local112;
				local92 += -local152;
				local152 -= local112;
			}
			local3--;
			@Pc(337) int local337 = arg4 + local3;
			@Pc(342) int local342 = arg4 - local3;
			@Pc(346) int local346 = local15 + arg6;
			@Pc(351) int local351 = arg6 - local15;
			if (local260) {
				@Pc(376) int local376 = arg6 + local9;
				@Pc(381) int local381 = arg6 - local9;
				Static107.method1641(local351, arg3, Static139.anIntArrayArray21[local342], local381);
				Static107.method1641(local381, arg1, Static139.anIntArrayArray21[local342], local376);
				Static107.method1641(local376, arg3, Static139.anIntArrayArray21[local342], local346);
				Static107.method1641(local351, arg3, Static139.anIntArrayArray21[local337], local381);
				Static107.method1641(local381, arg1, Static139.anIntArrayArray21[local337], local376);
				Static107.method1641(local376, arg3, Static139.anIntArrayArray21[local337], local346);
			} else {
				Static107.method1641(local351, arg3, Static139.anIntArrayArray21[local342], local346);
				Static107.method1641(local351, arg3, Static139.anIntArrayArray21[local337], local346);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method1102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
		Static32.aClass1_Sub17_Sub1_1.method2175(145);
		Static32.aClass1_Sub17_Sub1_1.method2175(arg1);
		Static32.aClass1_Sub17_Sub1_1.method2175(arg2);
		Static32.aClass1_Sub17_Sub1_1.method2151(arg3);
		Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		Static12.anInt241 = 0;
		Static151.anInt3156 = -3;
		Static2.anInt52 = 1;
		Static109.anInt2170 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!vg;[B)V")
	public static void method1103(@OriginalArg(0) int arg0, @OriginalArg(2) Class123 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class1_Sub26 local3 = new Class1_Sub26();
		local3.aByteArray56 = arg2;
		local3.anInt4151 = 0;
		local3.aLong173 = arg0;
		local3.aClass123_6 = arg1;
		@Pc(26) Class75 local26 = Static18.aClass75_2;
		synchronized (Static18.aClass75_2) {
			Static18.aClass75_2.method2240(local3);
		}
		Static142.method2344();
	}
}
