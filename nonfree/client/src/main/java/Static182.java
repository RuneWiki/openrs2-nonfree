import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
	public static int anInt3397;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)J")
	public static long method2992() {
		return Static258.aClass212_1.method7749();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!od;III)V")
	public static void method2995(@OriginalArg(0) Class3_Sub6_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static362.aClass193_32.aClass3_155 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7071;
		@Pc(18) int local18 = arg0.anInt7066;
		@Pc(21) int local21 = arg0.anInt7069;
		@Pc(25) int local25 = (int) arg0.aLong202;
		@Pc(28) long local28 = arg0.aLong202;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(52) Class3_Sub44 local52;
		if (local21 == 30) {
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			Static426.anInt7218 = 0;
			local52 = Static275.method5689(Static620.aClass376_147, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4886(local18 + Static347.anInt7851);
			local52.aClass3_Sub17_Sub2_3.method4886(local15 + Static417.anInt7047);
			local52.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4885(local25);
			Static616.method8089(local52);
			Static647.method8475(local18, local15);
		}
		@Pc(109) Class23_Sub2_Sub1_Sub2_Sub2 local109;
		@Pc(122) Class3_Sub44 local122;
		@Pc(100) Class3_Sub11 local100;
		if (local21 == 58) {
			local100 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local100 != null) {
				local109 = local100.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static523.anInt5721 = arg2;
				Static426.anInt7218 = 0;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				local122 = Static275.method5689(Static512.aClass376_123, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4876(local25);
				local122.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local122);
				Static628.method8288(0, local109.method8625(), true, local109.anIntArray659[0], local109.method8625(), local109.anIntArray660[0], -2, 0);
			}
		}
		@Pc(172) Class23_Sub2_Sub1_Sub2_Sub1 local172;
		@Pc(191) Class3_Sub44 local191;
		if (local21 == 51) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static426.anInt7218 = 0;
				local191 = Static275.method5689(Static358.aClass376_92, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4840(local25);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 59) {
			Static426.anInt7218 = 0;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			local52 = Static275.method5689(Static365.aClass376_56, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4840(Static347.anInt7851 + local18);
			local52.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4885((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local52.aClass3_Sub17_Sub2_3.method4876(local15 + Static417.anInt7047);
			Static616.method8089(local52);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 13) {
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			Static426.anInt7218 = 0;
			local52 = Static275.method5689(Static314.aClass376_79, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4886(local15 + Static417.anInt7047);
			local52.aClass3_Sub17_Sub2_3.method4885(local25);
			local52.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4833(Static395.anInt6819);
			local52.aClass3_Sub17_Sub2_3.method4876(Static452.anInt7746);
			local52.aClass3_Sub17_Sub2_3.method4885(Static169.anInt3050);
			local52.aClass3_Sub17_Sub2_3.method4876(Static347.anInt7851 + local18);
			Static616.method8089(local52);
			Static647.method8475(local18, local15);
		}
		if (local21 == 49) {
			Static426.anInt7218 = 0;
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			local52 = Static275.method5689(Static395.aClass376_98, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4840(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local52.aClass3_Sub17_Sub2_3.method4876(local18 + Static347.anInt7851);
			local52.aClass3_Sub17_Sub2_3.method4885(Static169.anInt3050);
			local52.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4854(Static395.anInt6819);
			local52.aClass3_Sub17_Sub2_3.method4840(local15 + Static417.anInt7047);
			local52.aClass3_Sub17_Sub2_3.method4840(Static452.anInt7746);
			Static616.method8089(local52);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 57) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static426.anInt7218 = 0;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				local191 = Static275.method5689(Static247.aClass376_64, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4849(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4885(local25);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 19) {
			Static426.anInt7218 = 0;
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			local52 = Static275.method5689(Static74.aClass376_21, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4876(Static347.anInt7851 + local18);
			local52.aClass3_Sub17_Sub2_3.method4876(local25);
			local52.aClass3_Sub17_Sub2_3.method4876(local15 + Static417.anInt7047);
			Static616.method8089(local52);
			Static647.method8475(local18, local15);
		}
		if (local21 == 4) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static426.anInt7218 = 0;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				local191 = Static275.method5689(Static532.aClass376_125, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4885(local25);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 12) {
			Static240.anInt4543 = arg1;
			Static426.anInt7218 = 0;
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			local52 = Static275.method5689(Static68.aClass376_17, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4840(local18 + Static347.anInt7851);
			local52.aClass3_Sub17_Sub2_3.method4886(Static417.anInt7047 + local15);
			local52.aClass3_Sub17_Sub2_3.method4840((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static616.method8089(local52);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 23 || local21 == 1001) {
			Static261.method4118(local18, local15, arg0.aString97, local25);
		}
		if (local21 == 1010) {
			Static405.anInt6914 = 2;
			Static426.anInt7218 = 0;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			local52 = Static275.method5689(Static369.aClass376_26, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4849(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4885(local18 + Static347.anInt7851);
			local52.aClass3_Sub17_Sub2_3.method4885(local15 + Static417.anInt7047);
			local52.aClass3_Sub17_Sub2_3.method4876(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static616.method8089(local52);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 8) {
			@Pc(797) Class208 local797 = Static108.method2085(local15, local18);
			if (local797 != null) {
				Static61.method1523();
				@Pc(804) Class3_Sub1 local804 = Static82.method1754(local797);
				Static433.method6368(local804.anInt22, local804.method40(), local797);
				Static46.aString12 = Static630.method8308(local797);
				Static542.aString107 = local797.aString70 + "<col=ffffff>";
				if (Static46.aString12 == null) {
					Static46.aString12 = "Null";
				}
			}
			return;
		}
		if (local21 == 20) {
			Static405.anInt6914 = 1;
			Static240.anInt4543 = arg1;
			Static426.anInt7218 = 0;
			Static523.anInt5721 = arg2;
			local52 = Static275.method5689(Static13.aClass376_2, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4885(Static417.anInt7047 + local15);
			local52.aClass3_Sub17_Sub2_3.method4840(Static347.anInt7851 + local18);
			local52.aClass3_Sub17_Sub2_3.method4871(Static395.anInt6819);
			local52.aClass3_Sub17_Sub2_3.method4886(Static169.anInt3050);
			local52.aClass3_Sub17_Sub2_3.method4876(Static452.anInt7746);
			Static616.method8089(local52);
			Static628.method8288(0, 1, true, local15, 1, local18, -4, 0);
		}
		if (local21 == 47) {
			Static523.anInt5721 = arg2;
			Static426.anInt7218 = 0;
			Static405.anInt6914 = 2;
			Static240.anInt4543 = arg1;
			local52 = Static275.method5689(Static435.aClass376_104, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4885(Static347.anInt7851 + local18);
			local52.aClass3_Sub17_Sub2_3.method4840(local25);
			local52.aClass3_Sub17_Sub2_3.method4876(local15 + Static417.anInt7047);
			local52.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
			Static616.method8089(local52);
			Static647.method8475(local18, local15);
		}
		if (local21 == 25) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				local191 = Static275.method5689(Static254.aClass376_67, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4886(local25);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		@Pc(1067) Class3_Sub44 local1067;
		if (local21 == 1009) {
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			Static426.anInt7218 = 0;
			local100 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local100 != null) {
				local109 = local100.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				@Pc(1048) Class5 local1048 = local109.aClass5_1;
				if (local1048.anIntArray1 != null) {
					local1048 = local1048.method56(Static592.aClass47_2);
				}
				if (local1048 != null) {
					local1067 = Static275.method5689(Static525.aClass376_124, Static540.aClass282_4);
					local1067.aClass3_Sub17_Sub2_3.method4876(local1048.anInt74);
					Static616.method8089(local1067);
				}
			}
		}
		if (local21 == 3) {
			local100 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local100 != null) {
				Static426.anInt7218 = 0;
				local109 = local100.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				local122 = Static275.method5689(Static434.aClass376_103, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4886(local25);
				local122.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local122);
				Static628.method8288(0, local109.method8625(), true, local109.anIntArray659[0], local109.method8625(), local109.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 9) {
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static426.anInt7218 = 0;
			Static240.anInt4543 = arg1;
			local52 = Static275.method5689(Static405.aClass376_99, Static540.aClass282_4);
			local52.aClass3_Sub17_Sub2_3.method4876(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10180);
			local52.aClass3_Sub17_Sub2_3.method4886(Static452.anInt7746);
			local52.aClass3_Sub17_Sub2_3.method4885(Static169.anInt3050);
			local52.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local52.aClass3_Sub17_Sub2_3.method4887(Static395.anInt6819);
			Static616.method8089(local52);
		}
		if (local21 == 22) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static523.anInt5721 = arg2;
				Static405.anInt6914 = 2;
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				local191 = Static275.method5689(Static673.aClass376_110, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4885(local25);
				local191.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 60) {
			local100 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local100 != null) {
				Static405.anInt6914 = 2;
				local109 = local100.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static426.anInt7218 = 0;
				Static240.anInt4543 = arg1;
				Static523.anInt5721 = arg2;
				local122 = Static275.method5689(Static253.aClass376_65, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local122.aClass3_Sub17_Sub2_3.method4876(local25);
				Static616.method8089(local122);
				Static628.method8288(0, local109.method8625(), true, local109.anIntArray659[0], local109.method8625(), local109.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 17) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static426.anInt7218 = 0;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				local191 = Static275.method5689(Static405.aClass376_99, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4876(local25);
				local191.aClass3_Sub17_Sub2_3.method4886(Static452.anInt7746);
				local191.aClass3_Sub17_Sub2_3.method4885(Static169.anInt3050);
				local191.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4887(Static395.anInt6819);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 44) {
			local172 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local172 != null) {
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				local191 = Static275.method5689(Static582.aClass376_133, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local191.aClass3_Sub17_Sub2_3.method4876(local25);
				Static616.method8089(local191);
				Static628.method8288(0, local172.method8625(), true, local172.anIntArray659[0], local172.method8625(), local172.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 11) {
			Static426.anInt7218 = 0;
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static240.anInt4543 = arg1;
			local191 = Static275.method5689(Static99.aClass376_29, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4840(local18 + Static347.anInt7851);
			local191.aClass3_Sub17_Sub2_3.method4840(local15 + Static417.anInt7047);
			local191.aClass3_Sub17_Sub2_3.method4885(local25);
			local191.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
			Static616.method8089(local191);
			Static647.method8475(local18, local15);
		}
		if (local21 == 2) {
			@Pc(1582) Class208 local1582 = Static108.method2085(local15, local18);
			if (local1582 != null) {
				Static272.method4336(local1582);
			}
		}
		@Pc(1604) Class23_Sub2_Sub1_Sub2_Sub2 local1604;
		@Pc(1599) Class3_Sub11 local1599;
		if (local21 == 52) {
			local1599 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local1599 != null) {
				local1604 = local1599.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static405.anInt6914 = 2;
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				Static523.anInt5721 = arg2;
				local1067 = Static275.method5689(Static79.aClass376_23, Static540.aClass282_4);
				local1067.aClass3_Sub17_Sub2_3.method4840(local25);
				local1067.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local1067);
				Static628.method8288(0, local1604.method8625(), true, local1604.anIntArray659[0], local1604.method8625(), local1604.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 1007) {
			Static426.anInt7218 = 0;
			Static523.anInt5721 = arg2;
			Static405.anInt6914 = 2;
			Static240.anInt4543 = arg1;
			local191 = Static275.method5689(Static425.aClass376_101, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4876(local25);
			Static616.method8089(local191);
		}
		@Pc(1699) Class23_Sub2_Sub1_Sub2_Sub1 local1699;
		if (local21 == 15) {
			local1699 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local1699 != null) {
				Static426.anInt7218 = 0;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				local122 = Static275.method5689(Static332.aClass376_86, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4849(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local122.aClass3_Sub17_Sub2_3.method4885(local25);
				Static616.method8089(local122);
				Static628.method8288(0, local1699.method8625(), true, local1699.anIntArray659[0], local1699.method8625(), local1699.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 16) {
			if (Static13.anInt164 > 0 && Static530.aClass284_1.method7637(82) && Static530.aClass284_1.method7637(81)) {
				Static106.method2058(Static417.anInt7047 + local15, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, local18 + Static347.anInt7851);
			} else {
				local191 = Static625.method8254(local18, local25, local15);
				if (local25 == 1) {
					local191.aClass3_Sub17_Sub2_3.method4849(-1);
					local191.aClass3_Sub17_Sub2_3.method4849(-1);
					local191.aClass3_Sub17_Sub2_3.method4876((int) Static204.aFloat82);
					local191.aClass3_Sub17_Sub2_3.method4849(57);
					local191.aClass3_Sub17_Sub2_3.method4849(Static56.anInt1426);
					local191.aClass3_Sub17_Sub2_3.method4849(Static433.anInt7606);
					local191.aClass3_Sub17_Sub2_3.method4849(89);
					local191.aClass3_Sub17_Sub2_3.method4876(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108);
					local191.aClass3_Sub17_Sub2_3.method4876(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109);
					local191.aClass3_Sub17_Sub2_3.method4849(63);
				} else {
					Static405.anInt6914 = 1;
					Static426.anInt7218 = 0;
					Static240.anInt4543 = arg1;
					Static523.anInt5721 = arg2;
				}
				Static616.method8089(local191);
				Static628.method8288(0, 1, true, local15, 1, local18, -4, 0);
			}
		}
		if (local21 == 21) {
			Static523.anInt5721 = arg2;
			Static426.anInt7218 = 0;
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			local191 = Static275.method5689(Static36.aClass376_145, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4885(local18 + Static347.anInt7851);
			local191.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local191.aClass3_Sub17_Sub2_3.method4840(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local191.aClass3_Sub17_Sub2_3.method4886(Static417.anInt7047 + local15);
			Static616.method8089(local191);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 10) {
			local1699 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local1699 != null) {
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static426.anInt7218 = 0;
				Static240.anInt4543 = arg1;
				local122 = Static275.method5689(Static330.aClass376_84, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4885(local25);
				local122.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local122);
				Static628.method8288(0, local1699.method8625(), true, local1699.anIntArray659[0], local1699.method8625(), local1699.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 18) {
			local1699 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local1699 != null) {
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				local122 = Static275.method5689(Static347.aClass376_111, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local122.aClass3_Sub17_Sub2_3.method4885(local25);
				Static616.method8089(local122);
				Static628.method8288(0, local1699.method8625(), true, local1699.anIntArray659[0], local1699.method8625(), local1699.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 53) {
			Static426.anInt7218 = 0;
			Static240.anInt4543 = arg1;
			Static523.anInt5721 = arg2;
			Static405.anInt6914 = 2;
			local191 = Static275.method5689(Static179.aClass376_50, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4840(local18 + Static347.anInt7851);
			local191.aClass3_Sub17_Sub2_3.method4875(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local191.aClass3_Sub17_Sub2_3.method4876(Static417.anInt7047 + local15);
			local191.aClass3_Sub17_Sub2_3.method4886((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static616.method8089(local191);
			Static184.method2997(local18, local28, local15);
		}
		if (local21 == 6 && Static339.aClass208_8 == null) {
			Static495.method7040(local15, local18);
			Static339.aClass208_8 = Static108.method2085(local15, local18);
			Static374.method5525(Static339.aClass208_8);
		}
		if (local21 == 50) {
			if (Static13.anInt164 > 0 && Static530.aClass284_1.method7637(82) && Static530.aClass284_1.method7637(81)) {
				Static106.method2058(Static417.anInt7047 + local15, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, local18 + Static347.anInt7851);
			} else {
				Static426.anInt7218 = 0;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 1;
				local191 = Static275.method5689(Static508.aClass376_121, Static540.aClass282_4);
				local191.aClass3_Sub17_Sub2_3.method4885(local18 + Static347.anInt7851);
				local191.aClass3_Sub17_Sub2_3.method4886(local15 + Static417.anInt7047);
				Static616.method8089(local191);
			}
		}
		if (local21 == 5) {
			local1599 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local1599 != null) {
				Static240.anInt4543 = arg1;
				Static523.anInt5721 = arg2;
				Static426.anInt7218 = 0;
				local1604 = local1599.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static405.anInt6914 = 2;
				local1067 = Static275.method5689(Static533.aClass376_126, Static540.aClass282_4);
				local1067.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local1067.aClass3_Sub17_Sub2_3.method4876(local25);
				Static616.method8089(local1067);
				Static628.method8288(0, local1604.method8625(), true, local1604.anIntArray659[0], local1604.method8625(), local1604.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 48) {
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			Static523.anInt5721 = arg2;
			Static426.anInt7218 = 0;
			local191 = Static275.method5689(Static235.aClass376_63, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4885(local18 + Static347.anInt7851);
			local191.aClass3_Sub17_Sub2_3.method4835(Static530.aClass284_1.method7637(82) ? 1 : 0);
			local191.aClass3_Sub17_Sub2_3.method4886(local15 + Static417.anInt7047);
			local191.aClass3_Sub17_Sub2_3.method4885(local25);
			Static616.method8089(local191);
			Static647.method8475(local18, local15);
		}
		if (local21 == 1011 || local21 == 1012 || local21 == 1003 || local21 == 1006 || local21 == 1008) {
			Static160.method2733(local15, local25, local21);
		}
		if (local21 == 46) {
			local1699 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local25];
			if (local1699 != null) {
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static240.anInt4543 = arg1;
				Static426.anInt7218 = 0;
				local122 = Static275.method5689(Static17.aClass376_4, Static540.aClass282_4);
				local122.aClass3_Sub17_Sub2_3.method4886(local25);
				local122.aClass3_Sub17_Sub2_3.method4895(Static530.aClass284_1.method7637(82) ? 1 : 0);
				Static616.method8089(local122);
				Static628.method8288(0, local1699.method8625(), true, local1699.anIntArray659[0], local1699.method8625(), local1699.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 45) {
			local1599 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local25);
			if (local1599 != null) {
				local1604 = local1599.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static240.anInt4543 = arg1;
				Static405.anInt6914 = 2;
				Static523.anInt5721 = arg2;
				Static426.anInt7218 = 0;
				local1067 = Static275.method5689(Static447.aClass376_105, Static540.aClass282_4);
				local1067.aClass3_Sub17_Sub2_3.method4849(Static530.aClass284_1.method7637(82) ? 1 : 0);
				local1067.aClass3_Sub17_Sub2_3.method4840(local25);
				local1067.aClass3_Sub17_Sub2_3.method4854(Static395.anInt6819);
				local1067.aClass3_Sub17_Sub2_3.method4876(Static169.anInt3050);
				local1067.aClass3_Sub17_Sub2_3.method4876(Static452.anInt7746);
				Static616.method8089(local1067);
				Static628.method8288(0, local1604.method8625(), true, local1604.anIntArray659[0], local1604.method8625(), local1604.anIntArray660[0], -2, 0);
			}
		}
		if (local21 == 1002) {
			Static240.anInt4543 = arg1;
			Static405.anInt6914 = 2;
			Static426.anInt7218 = 0;
			Static523.anInt5721 = arg2;
			local191 = Static275.method5689(Static262.aClass376_69, Static540.aClass282_4);
			local191.aClass3_Sub17_Sub2_3.method4876(local25);
			Static616.method8089(local191);
		}
		if (Static329.aBoolean166) {
			Static61.method1523();
		}
		if (Static261.aClass208_4 != null && Static291.anInt5385 == 0) {
			Static374.method5525(Static261.aClass208_4);
		}
	}
}
