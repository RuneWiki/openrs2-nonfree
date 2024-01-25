import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	public static int anInt5982;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!iq;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_157 = new Class140(4);

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public static int anInt5979 = 0;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString237 = "shake:";

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[B")
	public static byte[] method5232(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub5 local12 = (Class1_Sub1_Sub5) Static50.aClass156_5.method4258((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static263.method4610(local23, local47);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class1_Sub1_Sub5(local17);
			Static50.aClass156_5.method4256(local12, (long) arg0);
		}
		return local12.aByteArray18;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!vk;I)V")
	public static void method5234(@OriginalArg(0) Class1_Sub41 arg0) {
		if (arg0 == null || arg0 == Static175.aClass195_36.aClass1_207) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt6347;
		@Pc(18) int local18 = arg0.anInt6340;
		@Pc(21) int local21 = arg0.anInt6339;
		@Pc(25) int local25 = (int) arg0.aLong206;
		@Pc(28) long local28 = arg0.aLong206;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(53) Class177 local53;
		@Pc(73) int local73;
		if (local21 == 36) {
			Static248.aClass1_Sub7_Sub1_2.method728(242);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			local53 = Static140.method2694(local18);
			if (local53.anIntArrayArray53 != null && local53.anIntArrayArray53[0][0] == 5) {
				local73 = local53.anIntArrayArray53[0][1];
				if (Static197.anIntArray793[local73] != local53.anIntArray662[0]) {
					Static197.anIntArray793[local73] = local53.anIntArray662[0];
					Static314.method5305(local73);
				}
			}
		}
		if (local21 == 15) {
			Static248.aClass1_Sub7_Sub1_2.method728(62);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3104(Static90.anInt1762);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static99.anInt1953);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 40) {
			Static248.aClass1_Sub7_Sub1_2.method728(242);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			local53 = Static140.method2694(local18);
			if (local53.anIntArrayArray53 != null && local53.anIntArrayArray53[0][0] == 5) {
				local73 = local53.anIntArrayArray53[0][1];
				Static197.anIntArray793[local73] = 1 - Static197.anIntArray793[local73];
				Static314.method5305(local73);
			}
		}
		if (local21 == 5) {
			Static291.method4953(local18, local15);
		}
		@Pc(202) Class5_Sub3_Sub3_Sub2 local202;
		if (local21 == 49) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(135);
				Static248.aClass1_Sub7_Sub1_2.method3142(local25);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 16) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static180.anInt3754 = 2;
				Static121.anInt2356 = Static179.anInt3690;
				Static131.anInt2568 = Static178.anInt3687;
				Static286.anInt5554 = 0;
				Static248.aClass1_Sub7_Sub1_2.method728(127);
				Static248.aClass1_Sub7_Sub1_2.method3142(Static67.anInt1733);
				Static248.aClass1_Sub7_Sub1_2.method3140(local25);
				Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3142(Static114.anInt2289);
				Static248.aClass1_Sub7_Sub1_2.method3119(Static84.anInt1651);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 23) {
			Static121.anInt2356 = Static179.anInt3690;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static286.anInt5554 = 0;
			Static248.aClass1_Sub7_Sub1_2.method728(119);
			Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3119(Static84.anInt1651);
			Static248.aClass1_Sub7_Sub1_2.method3142(Static114.anInt2289);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static67.anInt1733);
			Static248.aClass1_Sub7_Sub1_2.method3140(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static248.aClass1_Sub7_Sub1_2.method3140(local15 + Static182.anInt3775);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static161.anInt3315 + local18);
			Static63.method1324(local28, local15, local18);
		}
		@Pc(423) Class5_Sub3_Sub3_Sub1 local423;
		if (local21 == 59) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static286.anInt5554 = 0;
				Static121.anInt2356 = Static179.anInt3690;
				Static131.anInt2568 = Static178.anInt3687;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(73);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3150(local25);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 1010) {
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static180.anInt3754 = 2;
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				@Pc(508) Class122 local508 = local202.aClass122_1;
				if (local508.anIntArray451 != null) {
					local508 = local508.method3573();
				}
				if (local508 != null) {
					Static248.aClass1_Sub7_Sub1_2.method728(109);
					Static248.aClass1_Sub7_Sub1_2.method3128(local508.anInt3815);
				}
			}
		}
		if (local21 == 1008) {
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static131.anInt2568 = Static178.anInt3687;
			Static180.anInt3754 = 2;
			Static248.aClass1_Sub7_Sub1_2.method728(68);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
		}
		if (local21 == 1004) {
			local53 = Static140.method2694(local18);
			if (local53 == null || local53.anIntArray667[local15] < 100000) {
				Static248.aClass1_Sub7_Sub1_2.method728(9);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
			} else {
				Static88.method1697(local53.anIntArray667[local15] + " x " + Static241.method4285(local25).aString74);
			}
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 34) {
			Static121.anInt2356 = Static179.anInt3690;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static286.anInt5554 = 0;
			Static248.aClass1_Sub7_Sub1_2.method728(2);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15 + Static182.anInt3775);
			Static248.aClass1_Sub7_Sub1_2.method3150(Static161.anInt3315 + local18);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
			Static6.method240(local15, local18);
		}
		if (local21 == 30) {
			Static248.aClass1_Sub7_Sub1_2.method728(105);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 20) {
			Static248.aClass1_Sub7_Sub1_2.method728(180);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3140(local15);
			Static248.aClass1_Sub7_Sub1_2.method3142(local25);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 60) {
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static248.aClass1_Sub7_Sub1_2.method728(43);
			Static248.aClass1_Sub7_Sub1_2.method3140(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static248.aClass1_Sub7_Sub1_2.method3150(Static182.anInt3775 + local15);
			Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static161.anInt3315 + local18);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 32) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static180.anInt3754 = 2;
				Static286.anInt5554 = 0;
				Static121.anInt2356 = Static179.anInt3690;
				Static131.anInt2568 = Static178.anInt3687;
				Static248.aClass1_Sub7_Sub1_2.method728(195);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 3) {
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static180.anInt3754 = 1;
			Static131.anInt2568 = Static178.anInt3687;
			Static248.aClass1_Sub7_Sub1_2.method728(39);
			Static248.aClass1_Sub7_Sub1_2.method3140(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3104(Static90.anInt1762);
			Static248.aClass1_Sub7_Sub1_2.method3150(Static99.anInt1953);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15 + Static182.anInt3775);
			Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, 1, -4, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, 1, local15, local18);
		}
		if (local21 == 22) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static131.anInt2568 = Static178.anInt3687;
				Static180.anInt3754 = 2;
				Static286.anInt5554 = 0;
				Static121.anInt2356 = Static179.anInt3690;
				Static248.aClass1_Sub7_Sub1_2.method728(176);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 43) {
			Static149.method2393();
			local53 = Static140.method2694(local18);
			Static84.anInt1651 = local18;
			Static114.anInt2289 = local15;
			Static67.anInt1733 = local25;
			Static243.anInt4739 = 1;
			Static133.method2517(local53);
			Static285.aString222 = "<col=ff9040>" + Static241.method4285(local25).aString74 + "<col=ffffff>";
			if (Static285.aString222 == null) {
				Static285.aString222 = "null";
			}
			return;
		}
		if (local21 == 41) {
			Static248.aClass1_Sub7_Sub1_2.method728(243);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3142(local25);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 46) {
			Static248.aClass1_Sub7_Sub1_2.method728(142);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static67.anInt1733);
			Static248.aClass1_Sub7_Sub1_2.method3104(Static84.anInt1651);
			Static248.aClass1_Sub7_Sub1_2.method3142(local15);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static114.anInt2289);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 48) {
			Static286.anInt5554 = 0;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static248.aClass1_Sub7_Sub1_2.method728(238);
			Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3128(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static248.aClass1_Sub7_Sub1_2.method3140(Static161.anInt3315 + local18);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15 + Static182.anInt3775);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 1002) {
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static180.anInt3754 = 2;
			Static248.aClass1_Sub7_Sub1_2.method728(9);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
		}
		if (local21 == 21) {
			local53 = Static140.method2694(local18);
			@Pc(1205) boolean local1205 = true;
			if (local53.anInt5204 > 0) {
				local1205 = Static176.method3460(local53);
			}
			if (local1205) {
				Static248.aClass1_Sub7_Sub1_2.method728(242);
				Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			}
		}
		if (local21 == 6) {
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static131.anInt2568 = Static178.anInt3687;
			Static180.anInt3754 = 2;
			Static248.aClass1_Sub7_Sub1_2.method728(235);
			Static248.aClass1_Sub7_Sub1_2.method3142(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3142(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3142(local15 + Static182.anInt3775);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 1) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static180.anInt3754 = 2;
				Static121.anInt2356 = Static179.anInt3690;
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static248.aClass1_Sub7_Sub1_2.method728(65);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 19 || local21 == 1001) {
			Static259.method4567(local15, local18, local25, arg0.aString253);
		}
		if (local21 == 2) {
			Static248.aClass1_Sub7_Sub1_2.method728(188);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3142(local25);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 13) {
			local53 = Static323.method5412(local18, local15);
			if (local53 != null) {
				Static149.method2393();
				@Pc(1420) Class1_Sub35 local1420 = Static47.method1096(local53);
				Static280.method4825(local18, local1420.anInt5510, local53.anInt5229, local53.anInt5234, local15, local1420.method4898());
				Static243.anInt4739 = 0;
				Static21.aString15 = Static280.method4827(local53);
				if (Static21.aString15 == null) {
					Static21.aString15 = "Null";
				}
				if (local53.aBoolean445) {
					Static144.aString113 = local53.aString211 + "<col=ffffff>";
					return;
				}
				Static144.aString113 = "<col=00ff00>" + local53.aString206 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 31) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(82);
				Static248.aClass1_Sub7_Sub1_2.method3142(Static99.anInt1953);
				Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3140(local25);
				Static248.aClass1_Sub7_Sub1_2.method3104(Static90.anInt1762);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 45) {
			Static248.aClass1_Sub7_Sub1_2.method728(93);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
			Static248.aClass1_Sub7_Sub1_2.method3140(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 12) {
			if (Static180.anInt3759 > 0 && Static220.aBooleanArray24[82] && Static220.aBooleanArray24[81]) {
				Static263.method4607(Static161.anInt3315 + local18, Static182.anInt3775 - -local15, Static285.anInt5511);
			} else {
				Static131.anInt2568 = Static178.anInt3687;
				Static286.anInt5554 = 0;
				Static180.anInt3754 = 1;
				Static121.anInt2356 = Static179.anInt3690;
				Static248.aClass1_Sub7_Sub1_2.method728(94);
				Static248.aClass1_Sub7_Sub1_2.method3128(local15 + Static182.anInt3775);
				Static248.aClass1_Sub7_Sub1_2.method3150(local18 + Static161.anInt3315);
			}
		}
		if (local21 == 25) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(240);
				Static248.aClass1_Sub7_Sub1_2.method3142(local25);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 1007 || local21 == 1009 || local21 == 1012 || local21 == 1005 || local21 == 1011) {
			Static67.method1689(local21, local25, local15);
		}
		if (local21 == 42) {
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static248.aClass1_Sub7_Sub1_2.method728(64);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static182.anInt3775 + local15);
			Static248.aClass1_Sub7_Sub1_2.method3142(Static161.anInt3315 + local18);
			Static248.aClass1_Sub7_Sub1_2.method3150(local25);
			Static6.method240(local15, local18);
		}
		if (local21 == 11) {
			if (Static180.anInt3759 > 0 && Static220.aBooleanArray24[82] && Static220.aBooleanArray24[81]) {
				Static263.method4607(local18 + Static161.anInt3315, local15 + Static182.anInt3775, Static285.anInt5511);
			} else {
				Static230.method4154(local18, local15, local25);
				if (local25 == 1) {
					Static248.aClass1_Sub7_Sub1_2.method3108(-1);
					Static248.aClass1_Sub7_Sub1_2.method3108(-1);
					Static248.aClass1_Sub7_Sub1_2.method3128((int) Static304.aFloat110);
					Static248.aClass1_Sub7_Sub1_2.method3108(57);
					Static248.aClass1_Sub7_Sub1_2.method3108(Static277.anInt6206);
					Static248.aClass1_Sub7_Sub1_2.method3108(Static311.anInt5996);
					Static248.aClass1_Sub7_Sub1_2.method3108(89);
					Static248.aClass1_Sub7_Sub1_2.method3128(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050);
					Static248.aClass1_Sub7_Sub1_2.method3128(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047);
					Static248.aClass1_Sub7_Sub1_2.method3108(63);
				} else {
					Static180.anInt3754 = 1;
					Static121.anInt2356 = Static179.anInt3690;
					Static286.anInt5554 = 0;
					Static131.anInt2568 = Static178.anInt3687;
				}
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, 1, -4, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, 1, local15, local18);
			}
		}
		if (local21 == 58 && Static297.aClass177_20 == null) {
			Static312.method5690(local18, local15);
			Static297.aClass177_20 = Static323.method5412(local18, local15);
			Static133.method2517(Static297.aClass177_20);
		}
		if (local21 == 17) {
			Static248.aClass1_Sub7_Sub1_2.method728(51);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 28) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static131.anInt2568 = Static178.anInt3687;
				Static286.anInt5554 = 0;
				Static248.aClass1_Sub7_Sub1_2.method728(206);
				Static248.aClass1_Sub7_Sub1_2.method3140(local25);
				Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 51) {
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static248.aClass1_Sub7_Sub1_2.method728(116);
			Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static182.anInt3775 + local15);
			Static248.aClass1_Sub7_Sub1_2.method3140((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static248.aClass1_Sub7_Sub1_2.method3150(Static161.anInt3315 + local18);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 7) {
			Static248.aClass1_Sub7_Sub1_2.method728(207);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3140(local15);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 26) {
			Static248.aClass1_Sub7_Sub1_2.method728(227);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 29) {
			Static131.anInt2568 = Static178.anInt3687;
			Static180.anInt3754 = 2;
			Static286.anInt5554 = 0;
			Static121.anInt2356 = Static179.anInt3690;
			Static248.aClass1_Sub7_Sub1_2.method728(189);
			Static248.aClass1_Sub7_Sub1_2.method3142(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static99.anInt1953);
			Static248.aClass1_Sub7_Sub1_2.method3098(Static90.anInt1762);
			Static248.aClass1_Sub7_Sub1_2.method3140((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static182.anInt3775 + local15);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 4) {
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static248.aClass1_Sub7_Sub1_2.method728(30);
			Static248.aClass1_Sub7_Sub1_2.method3150(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15 + Static182.anInt3775);
			Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
			Static6.method240(local15, local18);
		}
		if (local21 == 57) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static286.anInt5554 = 0;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(237);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 47) {
			Static121.anInt2356 = Static179.anInt3690;
			Static131.anInt2568 = Static178.anInt3687;
			Static180.anInt3754 = 2;
			Static286.anInt5554 = 0;
			Static248.aClass1_Sub7_Sub1_2.method728(87);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static248.aClass1_Sub7_Sub1_2.method3150(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3142(Static182.anInt3775 + local15);
			Static6.method240(local15, local18);
		}
		if (local21 == 24) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static286.anInt5554 = 0;
				Static248.aClass1_Sub7_Sub1_2.method728(203);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 44) {
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static180.anInt3754 = 2;
			Static286.anInt5554 = 0;
			Static248.aClass1_Sub7_Sub1_2.method728(59);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15 + Static182.anInt3775);
			Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3140(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3150(Static99.anInt1953);
			Static248.aClass1_Sub7_Sub1_2.method3128(local25);
			Static248.aClass1_Sub7_Sub1_2.method3104(Static90.anInt1762);
			Static6.method240(local15, local18);
		}
		if (local21 == 35) {
			Static180.anInt3754 = 2;
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static248.aClass1_Sub7_Sub1_2.method728(163);
			Static248.aClass1_Sub7_Sub1_2.method3142(Static114.anInt2289);
			Static248.aClass1_Sub7_Sub1_2.method3140(Static67.anInt1733);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3098(Static84.anInt1651);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static182.anInt3775 + local15);
			Static248.aClass1_Sub7_Sub1_2.method3142(local25);
			Static248.aClass1_Sub7_Sub1_2.method3142(Static161.anInt3315 + local18);
			Static6.method240(local15, local18);
		}
		if (local21 == 14) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static286.anInt5554 = 0;
				Static248.aClass1_Sub7_Sub1_2.method728(54);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3142(local25);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 38) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static180.anInt3754 = 2;
				Static121.anInt2356 = Static179.anInt3690;
				Static248.aClass1_Sub7_Sub1_2.method728(151);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3140(Static114.anInt2289);
				Static248.aClass1_Sub7_Sub1_2.method3150(local25);
				Static248.aClass1_Sub7_Sub1_2.method3150(Static67.anInt1733);
				Static248.aClass1_Sub7_Sub1_2.method3089(Static84.anInt1651);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 10) {
			Static180.anInt3754 = 2;
			Static286.anInt5554 = 0;
			Static131.anInt2568 = Static178.anInt3687;
			Static121.anInt2356 = Static179.anInt3690;
			Static248.aClass1_Sub7_Sub1_2.method728(173);
			Static248.aClass1_Sub7_Sub1_2.method3150(local18 + Static161.anInt3315);
			Static248.aClass1_Sub7_Sub1_2.method3150(local25);
			Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3128(Static182.anInt3775 + local15);
			Static6.method240(local15, local18);
		}
		if (local21 == 33) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static121.anInt2356 = Static179.anInt3690;
				Static180.anInt3754 = 2;
				Static286.anInt5554 = 0;
				Static131.anInt2568 = Static178.anInt3687;
				Static248.aClass1_Sub7_Sub1_2.method728(140);
				Static248.aClass1_Sub7_Sub1_2.method3142(local25);
				Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 18) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static286.anInt5554 = 0;
				Static121.anInt2356 = Static179.anInt3690;
				Static131.anInt2568 = Static178.anInt3687;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(249);
				Static248.aClass1_Sub7_Sub1_2.method3140(Static99.anInt1953);
				Static248.aClass1_Sub7_Sub1_2.method3104(Static90.anInt1762);
				Static248.aClass1_Sub7_Sub1_2.method3142(local25);
				Static248.aClass1_Sub7_Sub1_2.method3105(Static220.aBooleanArray24[82] ? 1 : 0);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 50) {
			local202 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local25];
			if (local202 != null) {
				Static286.anInt5554 = 0;
				Static121.anInt2356 = Static179.anInt3690;
				Static131.anInt2568 = Static178.anInt3687;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(154);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3128(local25);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local202.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local202.method4541(), local202.anIntArray638[0], local202.anIntArray637[0]);
			}
		}
		if (local21 == 39) {
			Static323.method5410(false);
		}
		if (local21 == 37) {
			Static248.aClass1_Sub7_Sub1_2.method728(1);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3150(local25);
			Static248.aClass1_Sub7_Sub1_2.method3140(local15);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (local21 == 8) {
			local423 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local25];
			if (local423 != null) {
				Static131.anInt2568 = Static178.anInt3687;
				Static121.anInt2356 = Static179.anInt3690;
				Static286.anInt5554 = 0;
				Static180.anInt3754 = 2;
				Static248.aClass1_Sub7_Sub1_2.method728(129);
				Static248.aClass1_Sub7_Sub1_2.method3116(Static220.aBooleanArray24[82] ? 1 : 0);
				Static248.aClass1_Sub7_Sub1_2.method3150(local25);
				Static222.method4055(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], 0, true, local423.method4541(), -2, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], 0, local423.method4541(), local423.anIntArray638[0], local423.anIntArray637[0]);
			}
		}
		if (local21 == 1006) {
			Static121.anInt2356 = Static179.anInt3690;
			Static286.anInt5554 = 0;
			Static131.anInt2568 = Static178.anInt3687;
			Static180.anInt3754 = 2;
			Static248.aClass1_Sub7_Sub1_2.method728(100);
			Static248.aClass1_Sub7_Sub1_2.method3128(local15 + Static182.anInt3775);
			Static248.aClass1_Sub7_Sub1_2.method3096(Static220.aBooleanArray24[82] ? 1 : 0);
			Static248.aClass1_Sub7_Sub1_2.method3140(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static248.aClass1_Sub7_Sub1_2.method3142(Static161.anInt3315 + local18);
			Static63.method1324(local28, local15, local18);
		}
		if (local21 == 9) {
			Static248.aClass1_Sub7_Sub1_2.method728(226);
			Static248.aClass1_Sub7_Sub1_2.method3098(local18);
			Static248.aClass1_Sub7_Sub1_2.method3150(local15);
			Static248.aClass1_Sub7_Sub1_2.method3140(local25);
			Static255.anInt4994 = 0;
			Static309.aClass177_21 = Static140.method2694(local18);
			Static171.anInt3577 = local15;
		}
		if (Static243.anInt4739 != 0) {
			Static243.anInt4739 = 0;
			Static133.method2517(Static140.method2694(Static84.anInt1651));
		}
		if (Static89.aBoolean156) {
			Static149.method2393();
		}
		if (Static309.aClass177_21 != null && Static255.anInt4994 == 0) {
			Static133.method2517(Static309.aClass177_21);
		}
	}
}
