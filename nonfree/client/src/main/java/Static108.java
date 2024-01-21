import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1053 = Static32.method683("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1050 = aClass49_1053;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1051 = Static32.method683("null");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1052 = Static32.method683("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)J")
	public static synchronized long method1828() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static53.aLong49 > local5) {
			Static127.aLong115 += Static53.aLong49 - local5;
		}
		Static53.aLong49 = local5;
		return local5 + Static127.aLong115;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIILclient!ka;IZJ)Z")
	public static boolean method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub2_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static91.anInt1931 || local4 >= Static59.anInt1256) {
					return false;
				}
				@Pc(25) Class2_Sub1 local25 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt15 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class22 local49 = new Class22();
		local49.aLong41 = arg11;
		local49.anInt994 = arg0;
		local49.anInt995 = arg5;
		local49.anInt985 = arg6;
		local49.anInt993 = arg7;
		local49.aClass2_Sub2_Sub3_6 = arg8;
		local49.anInt998 = arg9;
		local49.anInt1000 = arg1;
		local49.anInt988 = arg2;
		local49.anInt983 = arg1 + arg3 - 1;
		local49.anInt999 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static72.aClass2_Sub1ArrayArrayArray1[local124][local92][local95] == null) {
						Static72.aClass2_Sub1ArrayArrayArray1[local124][local92][local95] = new Class2_Sub1(local124, local92, local95);
					}
				}
				@Pc(157) Class2_Sub1 local157 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][local92][local95];
				local157.aClass22Array1[local157.anInt15] = local49;
				local157.anIntArray2[local157.anInt15] = local98;
				local157.anInt20 |= local98;
				local157.anInt15++;
			}
		}
		if (arg10) {
			Static107.aClass22Array3[Static168.anInt3668++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/util/Random;Z)I")
	public static int method1830(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static5.method95(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(47) int local47;
			do {
				local47 = arg1.nextInt();
			} while (local47 >= local44);
			return Static4.method52(arg0, local47);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Lclient!rd;")
	public static Class2_Sub2_Sub13 method1831(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub13 local15 = (Class2_Sub2_Sub13) Static90.aClass74_58.method2345((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static61.aClass11_53.method2049(arg0, 14);
		local15 = new Class2_Sub2_Sub13();
		if (local25 != null) {
			local15.method2360(new Class2_Sub13(local25));
		}
		Static90.aClass74_58.method2341((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1832() {
		anIntArray213 = null;
		aClass2_Sub2_Sub2_Sub2Array7 = null;
		aClass49_1051 = null;
		aClass49_1052 = null;
		aClass49_1050 = null;
		aClass49_1053 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1833() {
		Static171.aBoolean156 = false;
		Static159.aBoolean148 = false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public static void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg3);
		if (local12 == null) {
			local12 = new Class2_Sub19();
			Static70.aClass25_6.method838((long) arg3, local12);
		}
		if (local12.anIntArray200.length <= arg0) {
			@Pc(39) int[] local39 = new int[arg0 + 1];
			@Pc(44) int[] local44 = new int[arg0 + 1];
			for (@Pc(46) int local46 = 0; local46 < local12.anIntArray200.length; local46++) {
				local39[local46] = local12.anIntArray200[local46];
				local44[local46] = local12.anIntArray199[local46];
			}
			for (@Pc(76) int local76 = local12.anIntArray200.length; local76 < arg0; local76++) {
				local39[local76] = -1;
				local44[local76] = 0;
			}
			local12.anIntArray200 = local39;
			local12.anIntArray199 = local44;
		}
		local12.anIntArray200[arg0] = arg2;
		local12.anIntArray199[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BI[Lclient!lb;)V")
	public static void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) Class48[] arg3) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class2_Sub13 local16 = new Class2_Sub13(arg2);
		while (true) {
			@Pc(20) int local20 = local16.method2959();
			if (local20 == 0) {
				return;
			}
			local11 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local16.method2924();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(52) int local52 = local31 >> 6 & 0x3F;
				@Pc(56) int local56 = local31 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local16.method2962();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(76) int local76 = arg0 + local52;
				@Pc(81) int local81 = local56 + arg1;
				if (local76 > 0 && local81 > 0 && local76 < 103 && local81 < 103) {
					@Pc(100) int local100 = local60;
					if ((Static81.aByteArrayArrayArray2[1][local76][local81] & 0x2) == 2) {
						local100 = local60 - 1;
					}
					@Pc(114) Class48 local114 = null;
					if (local100 >= 0) {
						local114 = arg3[local100];
					}
					Static178.method2904(local60, local11, local72, local68, local114, local76, local81);
				}
			}
		}
	}
}
