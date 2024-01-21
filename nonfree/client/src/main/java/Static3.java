import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_27;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1985 = Static187.method3089("Your account is already logged in)3");

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1986 = Static187.method3089("sl_arrows");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1987 = aClass92_1985;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1988 = Static187.method3089("overlay)3dat");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public static void method3254() {
		while (true) {
			if (Static18.aClass1_Sub14_Sub1_2.method3065(Static63.anInt3562) >= 11) {
				@Pc(18) int local18 = Static18.aClass1_Sub14_Sub1_2.method3070(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static47.aClass8_Sub3_Sub1Array1[local18] == null) {
						local25 = true;
						Static47.aClass8_Sub3_Sub1Array1[local18] = new Class8_Sub3_Sub1();
						if (Static101.aClass1_Sub14Array1[local18] != null) {
							Static47.aClass8_Sub3_Sub1Array1[local18].method655(Static101.aClass1_Sub14Array1[local18]);
						}
					}
					Static111.anIntArray181[Static35.anInt992++] = local18;
					@Pc(61) Class8_Sub3_Sub1 local61 = Static47.aClass8_Sub3_Sub1Array1[local18];
					local61.anInt3595 = Static155.anInt2981;
					@Pc(69) int local69 = Static18.aClass1_Sub14_Sub1_2.method3070(5);
					if (local69 > 15) {
						local69 -= 32;
					}
					@Pc(80) int local80 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
					if (local80 == 1) {
						Static111.anIntArray183[Static147.anInt2991++] = local18;
					}
					@Pc(96) int local96 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
					@Pc(103) int local103 = Static41.anIntArray84[Static18.aClass1_Sub14_Sub1_2.method3070(3)];
					if (local25) {
						local61.anInt3577 = local61.anInt3611 = local103;
					}
					@Pc(116) int local116 = Static18.aClass1_Sub14_Sub1_2.method3070(5);
					if (local116 > 15) {
						local116 -= 32;
					}
					local61.method2678(local116 + Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0] - -local69, local96 == 1);
					continue;
				}
			}
			Static18.aClass1_Sub14_Sub1_2.method3072();
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[B")
	public static byte[] method3257(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub3_Sub15 local13 = (Class1_Sub3_Sub15) Static97.aClass47_13.method1281((long) arg0);
		if (local13 == null) {
			@Pc(21) Random local21 = new Random((long) arg0);
			@Pc(24) byte[] local24 = new byte[512];
			for (@Pc(26) int local26 = 0; local26 < 255; local26++) {
				local24[local26] = (byte) local26;
			}
			for (@Pc(39) int local39 = 0; local39 < 255; local39++) {
				@Pc(46) int local46 = 255 - local39;
				@Pc(53) int local53 = Static192.method3141(local46, local21);
				@Pc(57) byte local57 = local24[local53];
				local24[local53] = local24[local46];
				local24[local46] = local24[511 - local39] = local57;
			}
			local13 = new Class1_Sub3_Sub15(local24);
			Static97.aClass47_13.method1273((long) arg0, local13);
		}
		return local13.aByteArray16;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[Lclient!ag;II[BIIII)V")
	public static void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14(arg5);
		while (true) {
			@Pc(16) int local16 = local12.method3047();
			if (local16 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local7 += local16;
			while (true) {
				@Pc(31) int local31 = local12.method3047();
				if (local31 == 0) {
					break;
				}
				local23 += local31 - 1;
				@Pc(46) int local46 = local23 & 0x3F;
				@Pc(52) int local52 = local23 >> 6 & 0x3F;
				@Pc(56) int local56 = local23 >> 12;
				@Pc(60) int local60 = local12.method3010();
				@Pc(64) int local64 = local60 & 0x3;
				@Pc(68) int local68 = local60 >> 2;
				if (local56 == arg7 && arg8 <= local52 && arg8 + 8 > local52 && local46 >= arg0 && arg0 + 8 > local46) {
					@Pc(107) Class1_Sub3_Sub5 local107 = Static154.method2362(local7);
					@Pc(124) int local124 = Static188.method3364(local64, local46 & 0x7, arg1, local107.anInt1399, local107.anInt1408, local52 & 0x7) + arg4;
					@Pc(141) int local141 = Static185.method3000(local46 & 0x7, local52 & 0x7, local64, arg1, local107.anInt1399, local107.anInt1408) + arg3;
					if (local124 > 0 && local141 > 0 && local124 < 103 && local141 < 103) {
						@Pc(161) int local161 = arg6;
						@Pc(163) Class7 local163 = null;
						if ((Static146.aByteArrayArrayArray33[1][local124][local141] & 0x2) == 2) {
							local161 = arg6 - 1;
						}
						if (local161 >= 0) {
							local163 = arg2[local161];
						}
						Static98.method1435(local141, local68, local64 + arg1 & 0x3, local124, true, local7, arg6, local163, arg6, Static111.aBoolean141);
					}
				}
			}
		}
	}
}
