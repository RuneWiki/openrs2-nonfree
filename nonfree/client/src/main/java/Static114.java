import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!og", name = "fb", descriptor = "Lclient!gg;")
	public static Class26 aClass26_6;

	@OriginalMember(owner = "client!og", name = "wb", descriptor = "Lclient!fd;")
	public static Class21 aClass21_5;

	@OriginalMember(owner = "client!og", name = "Ab", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array5;

	@OriginalMember(owner = "client!og", name = "ub", descriptor = "Lclient!pg;")
	public static Class59 aClass59_45 = new Class59();

	@OriginalMember(owner = "client!og", name = "vb", descriptor = "Lclient!da;")
	public static Class14 aClass14_6 = new Class14(4096);

	@OriginalMember(owner = "client!og", name = "xb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_833 = Static8.method128("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!og", name = "yb", descriptor = "[I")
	public static int[] anIntArray288 = new int[500];

	@OriginalMember(owner = "client!og", name = "zb", descriptor = "I")
	public static int anInt3306 = 0;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Lclient!ac;")
	public static Class1_Sub1_Sub2 method2302() {
		if (Static8.aClass1_Sub1_Sub2_1 == null) {
			Static8.aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2();
		}
		return Static8.aClass1_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JB)V")
	public static void method2304(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static103.method2146(arg0 - 1L);
			Static103.method2146(1L);
		} else {
			Static103.method2146(arg0);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!m;Lclient!m;)V")
	public static void method2305(@OriginalArg(1) Class1_Sub1_Sub8_Sub2_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub8_Sub2_Sub1 arg1) {
		if (Static4.aClass1_Sub1_Sub8_Sub3Array1 == null) {
			Static4.aClass1_Sub1_Sub8_Sub3Array1 = Static74.method1573(Static144.aClass18_1019, Static163.aClass18_1152, Static127.aClass16_Sub1_41);
		}
		if (Static80.aClass1_Sub1_Sub8_Sub1Array4 == null) {
			Static80.aClass1_Sub1_Sub8_Sub1Array4 = Static101.method2130(Static127.aClass16_Sub1_41, Static163.aClass18_1152, Static159.aClass18_1128);
		}
		if (Static106.aClass1_Sub1_Sub8_Sub1Array6 == null) {
			Static106.aClass1_Sub1_Sub8_Sub1Array6 = Static101.method2130(Static127.aClass16_Sub1_41, Static163.aClass18_1152, Static102.aClass18_769);
		}
		if (Static126.aClass1_Sub1_Sub8_Sub1Array8 == null) {
			Static126.aClass1_Sub1_Sub8_Sub1Array8 = Static101.method2130(Static127.aClass16_Sub1_41, Static163.aClass18_1152, Static53.aClass18_426);
		}
		Static63.method1990(0, 23, 765, 480, 0);
		Static63.method1995(0, 0, 125, 23, 12425273, 9135624);
		Static63.method1995(125, 0, 640, 23, 5197647, 2697513);
		arg0.method2015(Static76.aClass18_566, 62, 15, 0, -1);
		if (Static126.aClass1_Sub1_Sub8_Sub1Array8 != null) {
			Static126.aClass1_Sub1_Sub8_Sub1Array8[1].method919(140, 1);
			arg1.method2016(Static127.aClass18_917, 152, 10, 16777215, -1);
			Static126.aClass1_Sub1_Sub8_Sub1Array8[0].method919(140, 12);
			arg1.method2016(Static177.aClass18_1223, 152, 21, 16777215, -1);
		}
		if (Static106.aClass1_Sub1_Sub8_Sub1Array6 != null) {
			if (Static175.anIntArray427[0] == 0 && Static65.anIntArray167[0] == 0) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[2].method919(280, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[0].method919(280, 4);
			}
			if (Static175.anIntArray427[0] == 0 && Static65.anIntArray167[0] == 1) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[3].method919(295, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[1].method919(295, 4);
			}
			arg0.method2016(Static12.aClass18_1208, 312, 17, 16777215, -1);
			if (Static175.anIntArray427[0] == 1 && Static65.anIntArray167[0] == 0) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[2].method919(390, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[0].method919(390, 4);
			}
			if (Static175.anIntArray427[0] == 1 && Static65.anIntArray167[0] == 1) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[3].method919(405, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[1].method919(405, 4);
			}
			arg0.method2016(Static148.aClass18_1046, 422, 17, 16777215, -1);
			if (Static175.anIntArray427[0] == 2 && Static65.anIntArray167[0] == 0) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[2].method919(500, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[0].method919(500, 4);
			}
			if (Static175.anIntArray427[0] == 2 && Static65.anIntArray167[0] == 1) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[3].method919(515, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[1].method919(515, 4);
			}
			arg0.method2016(Static132.aClass18_949, 532, 17, 16777215, -1);
			if (Static175.anIntArray427[0] == 3 && Static65.anIntArray167[0] == 0) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[2].method919(610, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[0].method919(610, 4);
			}
			if (Static175.anIntArray427[0] == 3 && Static65.anIntArray167[0] == 1) {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[3].method919(625, 4);
			} else {
				Static106.aClass1_Sub1_Sub8_Sub1Array6[1].method919(625, 4);
			}
			arg0.method2016(Static11.aClass18_119, 642, 17, 16777215, -1);
		}
		Static63.method1990(708, 4, 50, 16, 0);
		arg1.method2015(Static129.aClass18_928, 733, 16, 16777215, -1);
		Static94.anInt2918 = -1;
		if (Static4.aClass1_Sub1_Sub8_Sub3Array1 == null) {
			return;
		}
		@Pc(384) int local384 = 8;
		@Pc(390) int local390 = 24;
		@Pc(392) int local392;
		@Pc(394) int local394;
		do {
			local392 = local390;
			local394 = local384;
			if (local390 * (local384 - 1) >= Static98.anInt3023) {
				local384--;
			}
			if (local384 * (local390 - 1) >= Static98.anInt3023) {
				local390--;
			}
			if (Static98.anInt3023 <= (local390 - 1) * local384) {
				local390--;
			}
		} while (local392 != local390 || local394 != local384);
		local392 = (765 - local384 * 88) / (local384 - -1);
		if (local392 > 5) {
			local392 = 5;
		}
		local394 = (480 - local390 * 19) / (local390 + 1);
		if (local394 > 5) {
			local394 = 5;
		}
		@Pc(488) int local488 = (480 - local390 * 19 - (local390 - 1) * local394) / 2;
		@Pc(492) int local492 = local488 + 23;
		@Pc(507) int local507 = (765 - (local384 - 1) * local392 - local384 * 88) / 2;
		@Pc(509) int local509 = local507;
		@Pc(511) int local511 = 0;
		for (@Pc(513) int local513 = 0; local513 < Static98.anInt3023; local513++) {
			@Pc(519) Class57 local519 = Static43.aClass57Array1[local513];
			@Pc(524) Class18 local524 = Static132.method2564(local519.anInt3379);
			@Pc(526) boolean local526 = true;
			if (local519.anInt3379 == -1) {
				local526 = false;
				local524 = Static59.aClass18_212;
			} else if (local519.anInt3379 > 1980) {
				local524 = Static178.aClass18_1228;
				local526 = false;
			}
			if (local509 <= Static154.anInt4252 && Static9.anInt293 >= local492 && local509 + 88 > Static154.anInt4252 && Static9.anInt293 < local492 + 19 && local526) {
				Static94.anInt2918 = local513;
				Static4.aClass1_Sub1_Sub8_Sub3Array1[local519.aBoolean148 ? 1 : 0].method1643(local509, local492);
			} else {
				Static4.aClass1_Sub1_Sub8_Sub3Array1[local519.aBoolean148 ? 1 : 0].method1658(local509, local492);
			}
			if (Static80.aClass1_Sub1_Sub8_Sub1Array4 != null) {
				Static80.aClass1_Sub1_Sub8_Sub1Array4[local519.anInt3377 + (local519.aBoolean148 ? 8 : 0)].method919(local509 + 29, local492);
			}
			arg0.method2015(Static132.method2564(local519.anInt3376), local509 + 15, local492 - -9 + 5, 0, -1);
			arg1.method2015(local524, local509 + 60, local492 + 5 + 9, 268435455, -1);
			local492 += local394 + 19;
			local511++;
			if (local511 >= local390) {
				local492 = local488 + 23;
				local509 += local392 + 88;
				local511 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!dd;ILclient!dd;)I")
	public static int method2306(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2253(Static118.aClass18_853, Static163.aClass18_1152)) {
			local5++;
		}
		if (arg1.method2253(Static111.aClass18_819, Static163.aClass18_1152)) {
			local5++;
		}
		if (arg1.method2253(Static10.aClass18_111, Static163.aClass18_1152)) {
			local5++;
		}
		if (arg1.method2253(Static108.aClass18_813, Static163.aClass18_1152)) {
			local5++;
		}
		if (arg1.method2253(Static73.aClass18_461, Static163.aClass18_1152)) {
			local5++;
		}
		if (arg1.method2253(Static118.aClass18_854, Static163.aClass18_1152)) {
			local5++;
		}
		arg1.method2253(Static144.aClass18_1019, Static163.aClass18_1152);
		arg1.method2253(Static159.aClass18_1128, Static163.aClass18_1152);
		arg1.method2253(Static102.aClass18_769, Static163.aClass18_1152);
		arg1.method2253(Static53.aClass18_426, Static163.aClass18_1152);
		arg1.method2253(Static71.aClass18_529, Static163.aClass18_1152);
		return local5;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
	public static void method2307() {
		aClass59_45 = null;
		aClass21_5 = null;
		aClass14_6 = null;
		aClass1_Sub1_Sub8_Sub3Array5 = null;
		aClass18_833 = null;
		aClass26_6 = null;
		anIntArray288 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lclient!dc;")
	public static Class1_Sub1_Sub7 method2308(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub7 local12 = (Class1_Sub1_Sub7) Static36.aClass66_6.method2599((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static164.aClass16_Sub1_50.method2254(0, arg0);
		if (local27 == null) {
			return null;
		}
		local12 = new Class1_Sub1_Sub7();
		@Pc(40) Class1_Sub6 local40 = new Class1_Sub6(local27);
		local40.anInt839 = local40.aByteArray3.length - 12;
		@Pc(51) int local51 = local40.method499();
		@Pc(53) int local53 = 0;
		local12.anInt910 = local40.method546();
		local12.anInt911 = local40.method546();
		local12.anInt914 = local40.method546();
		local12.anInt912 = local40.method546();
		local40.anInt839 = 0;
		local12.aClass18_232 = local40.method521();
		local12.aClass18Array5 = new Class18[local51];
		local12.anIntArray55 = new int[local51];
		local12.anIntArray56 = new int[local51];
		while (local40.aByteArray3.length - 12 > local40.anInt839) {
			@Pc(99) int local99 = local40.method546();
			if (local99 == 3) {
				local12.aClass18Array5[local53] = local40.method510();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray55[local53] = local40.method544();
			} else {
				local12.anIntArray55[local53] = local40.method499();
			}
			local12.anIntArray56[local53++] = local99;
		}
		Static36.aClass66_6.method2597((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!c;Z)V")
	public static void method2310(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0) {
		arg0.anInt3578 = 0;
		@Pc(14) int local14 = arg0.anInt3563 - Static41.anInt1322;
		if (arg0.anInt3574 == 0) {
			arg0.anInt3590 = 1024;
		}
		@Pc(33) int local33 = arg0.anInt3591 * 64 + arg0.anInt3592 * 128;
		arg0.anInt3579 += (local33 - arg0.anInt3579) / local14;
		@Pc(59) int local59 = arg0.anInt3591 * 64 + arg0.anInt3555 * 128;
		if (arg0.anInt3574 == 1) {
			arg0.anInt3590 = 1536;
		}
		arg0.anInt3558 += (local59 - arg0.anInt3558) / local14;
		if (arg0.anInt3574 == 2) {
			arg0.anInt3590 = 0;
		}
		if (arg0.anInt3574 == 3) {
			arg0.anInt3590 = 512;
		}
	}
}
