import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!ig;")
	public static Class39 aClass39_16;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1710 = 0;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_545 = Static49.method1293("Ausw-=hlen");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
	public static int[] anIntArray172 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!rf;")
	private static Class70 aClass70_548 = Static49.method1293("Loaded fonts");

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_546 = aClass70_548;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_547 = Static49.method1293("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[Lclient!ei;")
	public static Class1_Sub1_Sub4_Sub3[] aClass1_Sub1_Sub4_Sub3Array1 = new Class1_Sub1_Sub4_Sub3[4];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1333() {
		for (@Pc(11) int local11 = -1; local11 < Static104.anInt2960; local11++) {
			@Pc(21) int local21;
			if (local11 == -1) {
				local21 = 2047;
			} else {
				local21 = Static26.anIntArray46[local11];
			}
			@Pc(29) Class1_Sub1_Sub4_Sub2_Sub1 local29 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local21];
			if (local29 != null) {
				Static44.method1096(local29, 1);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILclient!s;Lclient!s;IIJ)V")
	public static void method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub4 arg4, @OriginalArg(5) Class1_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class34 local8 = new Class34();
		local8.aLong59 = arg8;
		local8.anInt2089 = arg1 * 128 + 64;
		local8.anInt2090 = arg2 * 128 + 64;
		local8.anInt2095 = arg3;
		local8.aClass1_Sub1_Sub4_2 = arg4;
		local8.aClass1_Sub1_Sub4_3 = arg5;
		local8.anInt2086 = arg6;
		local8.anInt2091 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static90.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static90.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub17(local42, arg1, arg2);
			}
		}
		Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local8;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lclient!rf;III)Lclient!rf;")
	public static Class70 method1335(@OriginalArg(0) Class70[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[arg2 + local9] == null) {
				arg0[local9 + arg2] = Static126.aClass70_282;
			}
			local7 += arg0[arg2 + local9].anInt3915;
		}
		@Pc(50) byte[] local50 = new byte[local7];
		@Pc(52) int local52 = 0;
		@Pc(62) Class70 local62;
		for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
			local62 = arg0[arg2 + local54];
			Static188.method2304(local62.aByteArray46, 0, local50, local52, local62.anInt3915);
			local52 += local62.anInt3915;
		}
		local62 = new Class70();
		local62.aByteArray46 = local50;
		local62.anInt3915 = local7;
		return local62;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class39 local17 = Static44.method1103(arg2, arg1);
		if (local17 != null && local17.anObjectArray9 != null) {
			@Pc(26) Class1_Sub19 local26 = new Class1_Sub19();
			local26.aClass39_31 = local17;
			local26.anObjectArray27 = local17.anObjectArray9;
			Static60.method1460(local26);
		}
		Static110.anInt3092 = arg1;
		Static167.aBoolean170 = true;
		Static161.anInt4210 = arg2;
		Static104.anInt2954 = arg0;
		Static171.method3407(local17);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method1337() {
		anIntArray173 = null;
		anIntArray174 = null;
		aClass70_545 = null;
		aBigInteger1 = null;
		anIntArray172 = null;
		aClass70_547 = null;
		aClass39_16 = null;
		aClass70_548 = null;
		aClass1_Sub1_Sub4_Sub3Array1 = null;
		aClass70_546 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method1338() {
		for (@Pc(8) int local8 = 0; local8 < Static161.anInt4212; local8++) {
			@Pc(14) int local14 = Static48.anIntArray167[local8];
			@Pc(18) Class1_Sub1_Sub4_Sub2_Sub2 local18 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local14];
			@Pc(22) int local22 = Static98.aClass1_Sub9_Sub1_2.method1234();
			@Pc(33) int local33;
			@Pc(39) int local39;
			if ((local22 & 0x80) != 0) {
				local33 = Static98.aClass1_Sub9_Sub1_2.method1268();
				local39 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local18.method1520(Static47.anInt1654, local39, local33);
			}
			if ((local22 & 0x2) != 0) {
				local18.anInt2050 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local18.anInt2050 == 65535) {
					local18.anInt2050 = -1;
				}
			}
			if ((local22 & 0x8) != 0) {
				local33 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local39 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local18.method1520(Static47.anInt1654, local39, local33);
				local18.anInt2039 = Static47.anInt1654 + 300;
				local18.anInt2002 = Static98.aClass1_Sub9_Sub1_2.method1228();
			}
			if ((local22 & 0x20) != 0) {
				local18.anInt1997 = Static98.aClass1_Sub9_Sub1_2.method1277();
				local18.anInt2023 = Static98.aClass1_Sub9_Sub1_2.method1257();
			}
			if ((local22 & 0x1) != 0) {
				local18.aClass70_631 = Static98.aClass1_Sub9_Sub1_2.method1253();
				local18.anInt1995 = 100;
			}
			if ((local22 & 0x4) != 0) {
				local33 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local33 == 65535) {
					local33 = -1;
				}
				local39 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (local18.anInt2041 == local33 && local33 != -1) {
					@Pc(160) int local160 = Static90.method1962(local33).anInt3856;
					if (local160 == 1) {
						local18.anInt2010 = 0;
						local18.anInt2029 = local39;
						local18.anInt2044 = 0;
						local18.anInt1999 = 0;
					}
					if (local160 == 2) {
						local18.anInt2044 = 0;
					}
				} else if (local33 == -1 || local18.anInt2041 == -1 || Static90.method1962(local33).anInt3862 >= Static90.method1962(local18.anInt2041).anInt3862) {
					local18.anInt2029 = local39;
					local18.anInt1999 = 0;
					local18.anInt2044 = 0;
					local18.anInt2010 = 0;
					local18.anInt2041 = local33;
					local18.anInt2037 = local18.anInt2021;
				}
			}
			if ((local22 & 0x40) != 0) {
				local18.aClass1_Sub1_Sub13_1 = Static41.method1031(Static98.aClass1_Sub9_Sub1_2.method1277());
				local18.anInt2032 = local18.aClass1_Sub1_Sub13_1.anInt3247;
				local18.anInt2024 = local18.aClass1_Sub1_Sub13_1.anInt3241;
				local18.anInt2004 = local18.aClass1_Sub1_Sub13_1.anInt3234;
				local18.anInt2038 = local18.aClass1_Sub1_Sub13_1.anInt3235;
				local18.anInt2043 = local18.aClass1_Sub1_Sub13_1.anInt3244;
				local18.anInt2003 = local18.aClass1_Sub1_Sub13_1.anInt3239;
				local18.anInt2034 = local18.aClass1_Sub1_Sub13_1.anInt3237;
				local18.anInt2031 = local18.aClass1_Sub1_Sub13_1.anInt3253;
				local18.anInt2022 = local18.aClass1_Sub1_Sub13_1.anInt3248;
			}
			if ((local22 & 0x10) != 0) {
				local18.anInt2051 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local33 = Static98.aClass1_Sub9_Sub1_2.method1266();
				local18.anInt2033 = 0;
				local18.anInt2035 = local33 >> 16;
				if (local18.anInt2051 == 65535) {
					local18.anInt2051 = -1;
				}
				local18.anInt2036 = (local33 & 0xFFFF) + Static47.anInt1654;
				local18.anInt2018 = 0;
				if (Static47.anInt1654 < local18.anInt2036) {
					local18.anInt2018 = -1;
				}
			}
		}
	}
}
