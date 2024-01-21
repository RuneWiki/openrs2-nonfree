import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt1031;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_736 = Static72.method1077("hel");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_737 = Static72.method1077("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public static int[] anIntArray125 = new int[2000];

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static final int anInt1027 = 50;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_738 = Static72.method1077("backhmid1");

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_739 = Static72.method1077(" ");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public static int anInt1033 = 1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIII)Lclient!u;")
	public static Class74 method731(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		for (@Pc(19) int local19 = arg1 / 10; local19 != 0; local19 /= 10) {
			local15++;
		}
		@Pc(33) int local33 = local15;
		if (arg1 < 0 || arg0) {
			local33 = local15 + 1;
		}
		@Pc(41) byte[] local41 = new byte[local33];
		if (arg1 < 0) {
			local41[0] = 45;
		} else if (arg0) {
			local41[0] = 43;
		}
		for (@Pc(62) int local62 = 0; local62 < local15; local62++) {
			@Pc(68) int local68 = arg1 % 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			arg1 /= 10;
			local41[local33 - local62 - 1] = (byte) (local68 + 48);
		}
		@Pc(104) Class74 local104 = new Class74();
		local104.aByteArray38 = local41;
		local104.anInt2481 = local33;
		return local104;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ve;[Ljava/lang/Object;IILclient!ve;II)V")
	public static void method732(@OriginalArg(0) Class2_Sub2_Sub17 arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub17 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = (Integer) arg1[0];
		@Pc(15) Class2_Sub2_Sub18 local15 = Static81.method1262(local7);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(27) int[] local27 = local15.anIntArray417;
		@Pc(30) int[] local30 = local15.anIntArray415;
		@Pc(32) byte local32 = -1;
		try {
			Static55.anIntArray52 = new int[local15.anInt2897];
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			Static101.aClass74Array15 = new Class74[local15.anInt2895];
			@Pc(79) int local79;
			for (@Pc(51) int local51 = 1; local51 < arg1.length; local51++) {
				if (arg1[local51] instanceof Integer) {
					local79 = (Integer) arg1[local51];
					if (local79 == -2147483647) {
						local79 = arg5;
					}
					if (local79 == -2147483646) {
						local79 = arg2;
					}
					if (local79 == -2147483645) {
						local79 = arg0 == null ? -1 : arg0.anInt2794;
					}
					if (local79 == -2147483644) {
						local79 = arg3;
					}
					if (local79 == -2147483643) {
						local79 = arg0 == null ? -1 : arg0.anInt2782;
					}
					if (local79 == -2147483642) {
						local79 = arg4 == null ? -1 : arg4.anInt2794;
					}
					if (local79 == -2147483641) {
						local79 = arg4 == null ? -1 : arg4.anInt2782;
					}
					Static55.anIntArray52[local43++] = local79;
				} else if (arg1[local51] instanceof Class74) {
					Static101.aClass74Array15[local45++] = (Class74) arg1[local51];
				}
			}
			local79 = 0;
			label1303: while (true) {
				local79++;
				if (local79 > 200000) {
					throw new RuntimeException("slow");
				}
				local24++;
				@Pc(172) int local172 = local30[local24];
				@Pc(732) int local732;
				@Pc(587) int local587;
				@Pc(609) int local609;
				@Pc(727) int local727;
				@Pc(543) Class74 local543;
				if (local172 < 100) {
					if (local172 == 0) {
						Static25.anIntArray69[local20++] = local27[local24];
						continue;
					}
					@Pc(197) int local197;
					if (local172 == 1) {
						local197 = local27[local24];
						Static25.anIntArray69[local20++] = Static88.anIntArray260[local197];
						continue;
					}
					if (local172 == 2) {
						local197 = local27[local24];
						local20--;
						Static88.anIntArray260[local197] = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 3) {
						Static72.aClass74Array10[local22++] = local15.aClass74Array21[local24];
						continue;
					}
					if (local172 == 6) {
						local24 += local27[local24];
						continue;
					}
					if (local172 == 7) {
						local20 -= 2;
						if (Static25.anIntArray69[local20] != Static25.anIntArray69[local20 + 1]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 8) {
						local20 -= 2;
						if (Static25.anIntArray69[local20] == Static25.anIntArray69[local20 + 1]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 9) {
						local20 -= 2;
						if (Static25.anIntArray69[local20 + 1] > Static25.anIntArray69[local20]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 10) {
						local20 -= 2;
						if (Static25.anIntArray69[local20] > Static25.anIntArray69[local20 + 1]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 21) {
						if (Static7.anInt2661 == 0) {
							return;
						}
						@Pc(362) Class52 local362 = Static119.aClass52Array1[--Static7.anInt2661];
						Static101.aClass74Array15 = local362.aClass74Array13;
						Static55.anIntArray52 = local362.anIntArray254;
						local15 = local362.aClass2_Sub2_Sub18_1;
						local24 = local362.anInt1782;
						local30 = local15.anIntArray415;
						local27 = local15.anIntArray417;
						continue;
					}
					if (local172 == 25) {
						local197 = local27[local24];
						Static25.anIntArray69[local20++] = Static116.method1730(local197);
						continue;
					}
					if (local172 == 27) {
						local197 = local27[local24];
						local20--;
						Static78.method1230(local197, Static25.anIntArray69[local20]);
						continue;
					}
					if (local172 == 31) {
						local20 -= 2;
						if (Static25.anIntArray69[local20] <= Static25.anIntArray69[local20 + 1]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 32) {
						local20 -= 2;
						if (Static25.anIntArray69[local20] >= Static25.anIntArray69[local20 + 1]) {
							local24 += local27[local24];
						}
						continue;
					}
					if (local172 == 33) {
						Static25.anIntArray69[local20++] = Static55.anIntArray52[local27[local24]];
						continue;
					}
					@Pc(489) int local489;
					if (local172 == 34) {
						local489 = local27[local24];
						local20--;
						Static55.anIntArray52[local489] = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 35) {
						Static72.aClass74Array10[local22++] = Static101.aClass74Array15[local27[local24]];
						continue;
					}
					if (local172 == 36) {
						local489 = local27[local24];
						local22--;
						Static101.aClass74Array15[local489] = Static72.aClass74Array10[local22];
						continue;
					}
					if (local172 == 37) {
						local197 = local27[local24];
						local22 -= local197;
						local543 = Static70.method1068(local22, Static72.aClass74Array10, local197);
						Static72.aClass74Array10[local22++] = local543;
						continue;
					}
					if (local172 == 38) {
						local20--;
						continue;
					}
					if (local172 == 39) {
						local22--;
						continue;
					}
					if (local172 == 40) {
						local197 = local27[local24];
						@Pc(577) Class2_Sub2_Sub18 local577 = Static81.method1262(local197);
						@Pc(581) int[] local581 = new int[local577.anInt2897];
						@Pc(585) Class74[] local585 = new Class74[local577.anInt2895];
						for (local587 = 0; local587 < local577.anInt2903; local587++) {
							local581[local587] = Static25.anIntArray69[local20 + local587 - local577.anInt2903];
						}
						for (local609 = 0; local609 < local577.anInt2899; local609++) {
							local585[local609] = Static72.aClass74Array10[local609 + local22 - local577.anInt2899];
						}
						local20 -= local577.anInt2903;
						local22 -= local577.anInt2899;
						@Pc(646) Class52 local646 = new Class52();
						local646.anInt1782 = local24;
						local646.anIntArray254 = Static55.anIntArray52;
						local24 = -1;
						local646.aClass2_Sub2_Sub18_1 = local15;
						local15 = local577;
						local646.aClass74Array13 = Static101.aClass74Array15;
						Static119.aClass52Array1[Static7.anInt2661++] = local646;
						local27 = local577.anIntArray417;
						Static101.aClass74Array15 = local585;
						Static55.anIntArray52 = local581;
						local30 = local577.anIntArray415;
						continue;
					}
					if (local172 == 42) {
						Static25.anIntArray69[local20++] = Static65.anIntArray178[local27[local24]];
						continue;
					}
					if (local172 == 43) {
						local489 = local27[local24];
						local20--;
						Static65.anIntArray178[local489] = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 44) {
						local197 = local27[local24] >> 16;
						local727 = local27[local24] & 0xFFFF;
						local20--;
						local732 = Static25.anIntArray69[local20];
						if (local732 >= 0 && local732 <= 5000) {
							Static12.anIntArray39[local197] = local732;
							@Pc(747) byte local747 = -1;
							if (local727 == 105) {
								local747 = 0;
							}
							local587 = 0;
							while (true) {
								if (local587 >= local732) {
									continue label1303;
								}
								Static17.anIntArrayArray5[local197][local587] = local747;
								local587++;
							}
						}
						throw new RuntimeException();
					}
					if (local172 == 45) {
						local20--;
						local727 = Static25.anIntArray69[local20];
						local197 = local27[local24];
						if (local727 >= 0 && Static12.anIntArray39[local197] > local727) {
							Static25.anIntArray69[local20++] = Static17.anIntArrayArray5[local197][local727];
							continue;
						}
						throw new RuntimeException();
					}
					if (local172 == 46) {
						local197 = local27[local24];
						local20 -= 2;
						local727 = Static25.anIntArray69[local20];
						if (local727 >= 0 && Static12.anIntArray39[local197] > local727) {
							Static17.anIntArrayArray5[local197][local727] = Static25.anIntArray69[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(855) boolean local855;
				if (local27[local24] == 1) {
					local855 = true;
				} else {
					local855 = false;
				}
				@Pc(927) Class2_Sub2_Sub17 local927;
				@Pc(954) int local954;
				@Pc(2999) int local2999;
				if (local172 < 1000) {
					if (local172 == 100) {
						local20 -= 3;
						local732 = Static25.anIntArray69[local20 + 1];
						local727 = Static25.anIntArray69[local20];
						local954 = Static25.anIntArray69[local20 + 2];
						if (local732 == 0) {
							throw new RuntimeException();
						}
						@Pc(4437) Class2_Sub2_Sub17 local4437 = Static41.method668(local727);
						if (local4437.aClass2_Sub2_Sub17Array2 == null) {
							local4437.aClass2_Sub2_Sub17Array2 = new Class2_Sub2_Sub17[local954 + 1];
						}
						if (local4437.aClass2_Sub2_Sub17Array2.length <= local954) {
							@Pc(4460) Class2_Sub2_Sub17[] local4460 = new Class2_Sub2_Sub17[local954 + 1];
							for (local2999 = 0; local2999 < local4437.aClass2_Sub2_Sub17Array2.length; local2999++) {
								local4460[local2999] = local4437.aClass2_Sub2_Sub17Array2[local2999];
							}
							local4437.aClass2_Sub2_Sub17Array2 = local4460;
						}
						if (local954 > 0 && local4437.aClass2_Sub2_Sub17Array2[local954 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local954 - 1));
						}
						@Pc(4506) Class2_Sub2_Sub17 local4506 = new Class2_Sub2_Sub17();
						local4506.aBoolean125 = true;
						local4506.anInt2777 = local732;
						local4506.anInt2782 = local954;
						local4506.anInt2803 = local4506.anInt2794 = local4437.anInt2794;
						local4437.aClass2_Sub2_Sub17Array2[local954] = local4506;
						if (local855) {
							Static121.aClass2_Sub2_Sub17_4 = local4506;
						} else {
							Static64.aClass2_Sub2_Sub17_2 = local4506;
						}
						Static31.method575(local4437);
						continue;
					}
					if (local172 == 101) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						@Pc(4556) Class2_Sub2_Sub17 local4556 = Static41.method668(local927.anInt2794);
						local4556.aClass2_Sub2_Sub17Array2[local927.anInt2782] = null;
						Static31.method575(local4556);
						continue;
					}
					if (local172 == 102) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						local927.aClass2_Sub2_Sub17Array2 = null;
						Static31.method575(local927);
						continue;
					}
					if (local172 == 200) {
						local20 -= 2;
						local732 = Static25.anIntArray69[local20 + 1];
						local727 = Static25.anIntArray69[local20];
						@Pc(4606) Class2_Sub2_Sub17 local4606 = Static23.method478(local732, local727);
						if (local4606 != null && local732 != -1) {
							Static25.anIntArray69[local20++] = 1;
							if (local855) {
								Static121.aClass2_Sub2_Sub17_4 = local4606;
							} else {
								Static64.aClass2_Sub2_Sub17_2 = local4606;
							}
							continue;
						}
						Static25.anIntArray69[local20++] = 0;
						continue;
					}
				} else if (local172 >= 1000 && local172 < 1100 || !(local172 < 2000 || local172 >= 2100)) {
					if (local172 < 2000) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
					} else {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						local172 -= 1000;
					}
					Static31.method575(local927);
					if (local172 == 1000) {
						local20 -= 2;
						local927.anInt2780 = Static25.anIntArray69[local20];
						local927.anInt2834 = Static25.anIntArray69[local20 + 1];
						continue;
					}
					if (local172 == 1001) {
						local20 -= 2;
						local927.anInt2810 = Static25.anIntArray69[local20];
						local927.anInt2829 = Static25.anIntArray69[local20 + 1];
						continue;
					}
					if (local172 == 1003) {
						local20--;
						local927.aBoolean122 = Static25.anIntArray69[local20] == 1;
						continue;
					}
				} else if (local172 >= 1100 && local172 < 1200 || !(local172 < 2100 || local172 >= 2200)) {
					if (local172 < 2000) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
					} else {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						local172 -= 1000;
					}
					Static31.method575(local927);
					if (local172 == 1100) {
						local20 -= 2;
						local927.anInt2832 = Static25.anIntArray69[local20];
						if (local927.anInt2832 > local927.anInt2771 - local927.anInt2810) {
							local927.anInt2832 = local927.anInt2771 - local927.anInt2810;
						}
						if (local927.anInt2832 < 0) {
							local927.anInt2832 = 0;
						}
						local927.anInt2836 = Static25.anIntArray69[local20 + 1];
						if (local927.anInt2807 - local927.anInt2829 < local927.anInt2836) {
							local927.anInt2836 = local927.anInt2807 - local927.anInt2829;
						}
						if (local927.anInt2836 < 0) {
							local927.anInt2836 = 0;
						}
						continue;
					}
					if (local172 == 1101) {
						local20--;
						local927.anInt2818 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1102) {
						local20--;
						local927.aBoolean127 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1103) {
						local20--;
						local927.anInt2831 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1104) {
						local20--;
						local927.anInt2798 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1105) {
						local20--;
						local927.anInt2826 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1106) {
						local20--;
						local927.anInt2795 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1107) {
						local20--;
						local927.aBoolean123 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1108) {
						local927.anInt2767 = 1;
						local20--;
						local927.anInt2812 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1109) {
						local20 -= 6;
						local927.anInt2789 = Static25.anIntArray69[local20];
						local927.anInt2801 = Static25.anIntArray69[local20 + 1];
						local927.anInt2824 = Static25.anIntArray69[local20 + 2];
						local927.anInt2793 = Static25.anIntArray69[local20 + 3];
						local927.anInt2783 = Static25.anIntArray69[local20 + 4];
						local927.anInt2825 = Static25.anIntArray69[local20 + 5];
						continue;
					}
					if (local172 == 1110) {
						local20--;
						local927.anInt2811 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1111) {
						local20--;
						local927.aBoolean120 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1112) {
						local22--;
						local927.aClass74_1690 = Static72.aClass74Array10[local22];
						continue;
					}
					if (local172 == 1113) {
						local20--;
						local927.anInt2816 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1114) {
						local20 -= 3;
						local927.anInt2823 = Static25.anIntArray69[local20];
						local927.anInt2833 = Static25.anIntArray69[local20 + 1];
						local927.anInt2791 = Static25.anIntArray69[local20 + 2];
						continue;
					}
					if (local172 == 1115) {
						local20--;
						local927.aBoolean119 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1116) {
						local20--;
						local927.anInt2814 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1117) {
						local20--;
						local927.anInt2800 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1118) {
						local20--;
						local927.aBoolean126 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1119) {
						local20--;
						local927.aBoolean129 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1120) {
						local20 -= 2;
						local927.anInt2771 = Static25.anIntArray69[local20];
						local927.anInt2807 = Static25.anIntArray69[local20 + 1];
						continue;
					}
				} else if (local172 >= 1200 && local172 < 1300 || local172 >= 2200 && local172 < 2300) {
					if (local172 < 2000) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
					} else {
						local172 -= 1000;
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
					}
					Static31.method575(local927);
					if (local172 == 1200) {
						local20 -= 2;
						local954 = Static25.anIntArray69[local20 + 1];
						local732 = Static25.anIntArray69[local20];
						local927.anInt2784 = local954;
						local927.anInt2806 = local732;
						@Pc(968) Class2_Sub2_Sub12 local968 = Static35.method1934(local732);
						local927.anInt2824 = local968.anInt1696;
						local927.anInt2793 = local968.anInt1690;
						local927.anInt2783 = local968.anInt1691;
						local927.anInt2825 = local968.anInt1705;
						local927.anInt2789 = local968.anInt1710;
						local927.anInt2801 = local968.anInt1714;
						if (local927.anInt2810 > 0) {
							local927.anInt2825 = local927.anInt2825 * 32 / local927.anInt2810;
						}
						continue;
					}
					if (local172 == 1201) {
						local927.anInt2767 = 2;
						local20--;
						local927.anInt2812 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1202) {
						local927.anInt2767 = 3;
						local927.anInt2812 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2.method441();
						continue;
					}
				} else if (local172 >= 1300 && local172 < 1400 || local172 >= 2300 && local172 < 2400) {
					if (local172 >= 2000) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						local172 -= 1000;
					} else {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
					}
					if (local172 == 1300) {
						local20--;
						local732 = Static25.anIntArray69[local20] - 1;
						if (local732 >= 0 && local732 <= 9) {
							local22--;
							local927.method1889(Static72.aClass74Array10[local22], local732);
							continue;
						}
						local22--;
						continue;
					}
					if (local172 == 1301) {
						local20 -= 2;
						local732 = Static25.anIntArray69[local20];
						local954 = Static25.anIntArray69[local20 + 1];
						local927.aClass2_Sub2_Sub17_5 = Static23.method478(local954, local732);
						continue;
					}
					if (local172 == 1302) {
						local20--;
						local927.aBoolean130 = Static25.anIntArray69[local20] == 1;
						continue;
					}
					if (local172 == 1303) {
						local20--;
						local927.anInt2770 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1304) {
						local20--;
						local927.anInt2768 = Static25.anIntArray69[local20];
						continue;
					}
					if (local172 == 1305) {
						local22--;
						local927.aClass74_1689 = Static72.aClass74Array10[local22];
						continue;
					}
					if (local172 == 1306) {
						local22--;
						local927.aClass74_1693 = Static72.aClass74Array10[local22];
						continue;
					}
				} else {
					@Pc(1092) Class74 local1092;
					if (local172 >= 1400 && local172 < 1500 || local172 >= 2400 && local172 < 2500) {
						if (local172 < 2000) {
							local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						} else {
							local20--;
							local927 = Static41.method668(Static25.anIntArray69[local20]);
							local172 -= 1000;
						}
						local22--;
						local1092 = Static72.aClass74Array10[local22];
						@Pc(1099) Object[] local1099 = new Object[local1092.method1695() + 1];
						for (local587 = local1099.length - 1; local587 >= 1; local587--) {
							if (local1092.method1703(local587 - 1) == 115) {
								local22--;
								local1099[local587] = Static72.aClass74Array10[local22];
							} else {
								local20--;
								local1099[local587] = Integer.valueOf(Static25.anIntArray69[local20]);
							}
						}
						local20--;
						local609 = Static25.anIntArray69[local20];
						if (local609 == -1) {
							local1099 = null;
						} else {
							local1099[0] = Integer.valueOf(local609);
						}
						local927.aBoolean124 = true;
						if (local172 == 1402) {
							local927.anObjectArray6 = local1099;
						}
						if (local172 == 1408) {
							local927.anObjectArray15 = local1099;
						}
						if (local172 == 1400) {
							local927.anObjectArray4 = local1099;
						}
						if (local172 == 1406) {
							local927.anObjectArray5 = local1099;
						}
						if (local172 == 1412) {
							local927.anObjectArray13 = local1099;
						}
						if (local172 == 1407) {
							local927.anObjectArray18 = local1099;
						}
						if (local172 == 1404) {
							local927.anObjectArray20 = local1099;
						}
						if (local172 == 1415) {
							local927.anObjectArray17 = local1099;
						}
						if (local172 == 1405) {
							local927.anObjectArray21 = local1099;
						}
						if (local172 == 1409) {
							local927.anObjectArray9 = local1099;
						}
						if (local172 == 1413) {
							local927.anObjectArray19 = local1099;
						}
						if (local172 == 1410) {
							local927.anObjectArray10 = local1099;
						}
						if (local172 == 1401) {
							local927.anObjectArray12 = local1099;
						}
						if (local172 == 1403) {
							local927.anObjectArray11 = local1099;
						}
						if (local172 == 1414) {
							local927.anObjectArray8 = local1099;
						}
						if (local172 == 1417) {
							local927.anObjectArray14 = local1099;
						}
						if (local172 == 1411) {
							local927.anObjectArray16 = local1099;
						}
						if (local172 == 1416) {
							local927.anObjectArray7 = local1099;
						}
						continue;
					}
					if (local172 < 1600) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						if (local172 == 1500) {
							Static25.anIntArray69[local20++] = local927.anInt2780;
							continue;
						}
						if (local172 == 1501) {
							Static25.anIntArray69[local20++] = local927.anInt2834;
							continue;
						}
						if (local172 == 1502) {
							Static25.anIntArray69[local20++] = local927.anInt2810;
							continue;
						}
						if (local172 == 1503) {
							Static25.anIntArray69[local20++] = local927.anInt2829;
							continue;
						}
						if (local172 == 1504) {
							Static25.anIntArray69[local20++] = local927.aBoolean122 ? 1 : 0;
							continue;
						}
						if (local172 == 1505) {
							Static25.anIntArray69[local20++] = local927.anInt2803;
							continue;
						}
					} else if (local172 < 1700) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						if (local172 == 1600) {
							Static25.anIntArray69[local20++] = local927.anInt2832;
							continue;
						}
						if (local172 == 1601) {
							Static25.anIntArray69[local20++] = local927.anInt2836;
							continue;
						}
						if (local172 == 1602) {
							Static72.aClass74Array10[local22++] = local927.aClass74_1690;
							continue;
						}
						if (local172 == 1603) {
							Static25.anIntArray69[local20++] = local927.anInt2771;
							continue;
						}
						if (local172 == 1604) {
							Static25.anIntArray69[local20++] = local927.anInt2807;
							continue;
						}
						if (local172 == 1605) {
							Static25.anIntArray69[local20++] = local927.anInt2825;
							continue;
						}
					} else if (local172 < 1800) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						if (local172 == 1700) {
							Static25.anIntArray69[local20++] = local927.anInt2806;
							continue;
						}
						if (local172 == 1701) {
							if (local927.anInt2806 == -1) {
								Static25.anIntArray69[local20++] = 0;
							} else {
								Static25.anIntArray69[local20++] = local927.anInt2784;
							}
							continue;
						}
						if (local172 == 1702) {
							Static25.anIntArray69[local20++] = local927.anInt2782;
							continue;
						}
					} else if (local172 < 1900) {
						local927 = local855 ? Static121.aClass2_Sub2_Sub17_4 : Static64.aClass2_Sub2_Sub17_2;
						if (local172 == 1800) {
							Static25.anIntArray69[local20++] = Static89.method1326(Static19.method429(local927));
							continue;
						}
					} else if (local172 < 2600) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						if (local172 == 2500) {
							Static25.anIntArray69[local20++] = local927.anInt2780;
							continue;
						}
						if (local172 == 2501) {
							Static25.anIntArray69[local20++] = local927.anInt2834;
							continue;
						}
						if (local172 == 2502) {
							Static25.anIntArray69[local20++] = local927.anInt2810;
							continue;
						}
						if (local172 == 2503) {
							Static25.anIntArray69[local20++] = local927.anInt2829;
							continue;
						}
						if (local172 == 2504) {
							Static25.anIntArray69[local20++] = local927.aBoolean122 ? 1 : 0;
							continue;
						}
						if (local172 == 2505) {
							Static25.anIntArray69[local20++] = local927.anInt2803;
							continue;
						}
					} else if (local172 < 2700) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						if (local172 == 2600) {
							Static25.anIntArray69[local20++] = local927.anInt2832;
							continue;
						}
						if (local172 == 2601) {
							Static25.anIntArray69[local20++] = local927.anInt2836;
							continue;
						}
						if (local172 == 2602) {
							Static72.aClass74Array10[local22++] = local927.aClass74_1690;
							continue;
						}
						if (local172 == 2603) {
							Static25.anIntArray69[local20++] = local927.anInt2771;
							continue;
						}
						if (local172 == 2604) {
							Static25.anIntArray69[local20++] = local927.anInt2807;
							continue;
						}
						if (local172 == 2605) {
							Static25.anIntArray69[local20++] = local927.anInt2825;
							continue;
						}
					} else if (local172 < 2800) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						if (local172 == 2700) {
							Static25.anIntArray69[local20++] = local927.anInt2806;
							continue;
						}
						if (local172 == 2701) {
							if (local927.anInt2806 == -1) {
								Static25.anIntArray69[local20++] = 0;
							} else {
								Static25.anIntArray69[local20++] = local927.anInt2784;
							}
							continue;
						}
					} else if (local172 < 2900) {
						local20--;
						local927 = Static41.method668(Static25.anIntArray69[local20]);
						if (local172 == 2800) {
							Static25.anIntArray69[local20++] = Static89.method1326(Static19.method429(local927));
							continue;
						}
					} else if (local172 < 3200) {
						if (local172 == 3100) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							Static67.method1024(0, Static112.aClass74_1543, local543);
							continue;
						}
						if (local172 == 3101) {
							local20 -= 2;
							Static113.method1687(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1, Static25.anIntArray69[local20], Static25.anIntArray69[local20 + 1]);
							continue;
						}
						if (local172 == 3102) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							if (local727 >= 0 && Static16.anIntArray49.length > local727 && Static16.anIntArray49[local727] != -1) {
								Static8.aBoolean11 = true;
								Static42.anInt980 = local727;
								Static116.aBoolean107 = true;
							}
							continue;
						}
						if (local172 == 3103) {
							Static80.method1255();
							continue;
						}
					} else if (local172 < 3300) {
						if (local172 == 3200) {
							local20 -= 3;
							Static48.method795(Static25.anIntArray69[local20], Static25.anIntArray69[local20 + 2], Static25.anIntArray69[local20 + 1]);
							continue;
						}
						if (local172 == 3201) {
							local20--;
							Static63.method1005(Static25.anIntArray69[local20]);
							continue;
						}
						if (local172 == 3202) {
							local20 -= 2;
							Static103.method1587(Static25.anIntArray69[local20 + 1], Static25.anIntArray69[local20]);
							continue;
						}
					} else if (local172 < 3400) {
						if (local172 == 3300) {
							Static25.anIntArray69[local20++] = Static107.anInt2338;
							continue;
						}
						if (local172 == 3301) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static107.method1601(local732, local727);
							continue;
						}
						if (local172 == 3302) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = Static82.method1267(local727, local732);
							continue;
						}
						if (local172 == 3303) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = Static5.method30(local732, local727);
							continue;
						}
						if (local172 == 3304) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static112.method1685(local727).anInt1280;
							continue;
						}
						if (local172 == 3305) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static70.anIntArray193[local727];
							continue;
						}
						if (local172 == 3306) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static102.anIntArray323[local727];
							continue;
						}
						if (local172 == 3307) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static109.anIntArray344[local727];
							continue;
						}
						if (local172 == 3308) {
							local727 = Static117.anInt2529;
							local732 = (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 >> 7) + Static107.anInt2343;
							local954 = Static62.anInt1413 + (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 >> 7);
							Static25.anIntArray69[local20++] = (local727 << 28) - (-(local732 << 14) - local954);
							continue;
						}
						if (local172 == 3309) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 >> 14 & 0x3FFF;
							continue;
						}
						if (local172 == 3310) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 >> 28;
							continue;
						}
						if (local172 == 3311) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 & 0x3FFF;
							continue;
						}
						if (local172 == 3312) {
							Static25.anIntArray69[local20++] = Static1.aBoolean86 ? 1 : 0;
							continue;
						}
						if (local172 == 3313) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20] + 32768;
							Static25.anIntArray69[local20++] = Static107.method1601(local732, local727);
							continue;
						}
						if (local172 == 3314) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20] + 32768;
							Static25.anIntArray69[local20++] = Static82.method1267(local727, local732);
							continue;
						}
						if (local172 == 3315) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20] + 32768;
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = Static5.method30(local732, local727);
							continue;
						}
					} else if (local172 < 3500) {
						if (local172 == 3400) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							@Pc(3253) Class2_Sub2_Sub6 local3253 = Static88.method1312(local727);
							for (local587 = 0; local587 < local3253.anInt814; local587++) {
								if (local3253.anIntArray94[local587] == local732) {
									Static72.aClass74Array10[local22++] = local3253.aClass74Array6[local587];
									local3253 = null;
									break;
								}
							}
							if (local3253 != null) {
								Static72.aClass74Array10[local22++] = local3253.aClass74_607;
							}
							continue;
						}
						if (local172 == 3408) {
							local20 -= 4;
							local727 = Static25.anIntArray69[local20];
							local954 = Static25.anIntArray69[local20 + 2];
							local732 = Static25.anIntArray69[local20 + 1];
							local587 = Static25.anIntArray69[local20 + 3];
							@Pc(3327) Class2_Sub2_Sub6 local3327 = Static88.method1312(local954);
							if (local3327.anInt815 == local727 && local3327.anInt812 == local732) {
								for (local2999 = 0; local2999 < local3327.anInt814; local2999++) {
									if (local3327.anIntArray94[local2999] == local587) {
										if (local732 == 115) {
											Static72.aClass74Array10[local22++] = local3327.aClass74Array6[local2999];
										} else {
											Static25.anIntArray69[local20++] = local3327.anIntArray95[local2999];
										}
										local3327 = null;
										break;
									}
								}
								if (local3327 != null) {
									if (local732 == 115) {
										Static72.aClass74Array10[local22++] = local3327.aClass74_607;
									} else {
										Static25.anIntArray69[local20++] = local3327.anInt818;
									}
								}
								continue;
							}
							if (local732 == 115) {
								Static72.aClass74Array10[local22++] = Static42.aClass74_706;
							} else {
								Static25.anIntArray69[local20++] = 0;
							}
							continue;
						}
					} else if (local172 < 3700) {
						if (local172 == 3600) {
							if (Static54.anInt1325 == 0) {
								Static25.anIntArray69[local20++] = -2;
							} else if (Static54.anInt1325 == 1) {
								Static25.anIntArray69[local20++] = -1;
							} else {
								Static25.anIntArray69[local20++] = Static65.anInt1450;
							}
							continue;
						}
						if (local172 == 3601) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							if (Static54.anInt1325 == 2 && Static65.anInt1450 > local727) {
								Static72.aClass74Array10[local22++] = Static19.aClass74Array2[local727];
								continue;
							}
							Static72.aClass74Array10[local22++] = Static112.aClass74_1543;
							continue;
						}
						if (local172 == 3602) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							if (Static54.anInt1325 == 2 && local727 < Static65.anInt1450) {
								Static25.anIntArray69[local20++] = Static78.anIntArray251[local727];
								continue;
							}
							Static25.anIntArray69[local20++] = 0;
							continue;
						}
						if (local172 == 3603) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							if (Static54.anInt1325 == 2 && local727 < Static65.anInt1450) {
								Static25.anIntArray69[local20++] = Static23.anIntArray67[local727];
								continue;
							}
							Static25.anIntArray69[local20++] = 0;
							continue;
						}
						if (local172 == 3604) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							local20--;
							local732 = Static25.anIntArray69[local20];
							Static106.method1598(local732, local543);
							continue;
						}
					} else if (local172 < 4100) {
						if (local172 == 4000) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 + local732;
							continue;
						}
						if (local172 == 4001) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local727 - local732;
							continue;
						}
						if (local172 == 4002) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 * local732;
							continue;
						}
						if (local172 == 4003) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local727 / local732;
							continue;
						}
						if (local172 == 4004) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = (int) (Math.random() * (double) local727);
							continue;
						}
						if (local172 == 4005) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = (int) ((double) (local727 + 1) * Math.random());
							continue;
						}
						if (local172 == 4006) {
							local20 -= 5;
							local727 = Static25.anIntArray69[local20];
							local954 = Static25.anIntArray69[local20 + 2];
							local587 = Static25.anIntArray69[local20 + 3];
							local609 = Static25.anIntArray69[local20 + 4];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local727 + (local732 - local727) * (-local954 + local609) / (local587 - local954);
							continue;
						}
						if (local172 == 4007) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local732 * local727 / 100 + local727;
							continue;
						}
						if (local172 == 4008) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 | 0x1 << local732;
							continue;
						}
						if (local172 == 4009) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local727 & -(0x1 << local732) - 1;
							continue;
						}
						if (local172 == 4010) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = (local727 & 0x1 << local732) == 0 ? 0 : 1;
							continue;
						}
						if (local172 == 4011) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 % local732;
							continue;
						}
						if (local172 == 4012) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							if (local727 == 0) {
								Static25.anIntArray69[local20++] = 0;
							} else {
								Static25.anIntArray69[local20++] = (int) Math.pow((double) local727, (double) local732);
							}
							continue;
						}
						if (local172 == 4013) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							if (local727 == 0) {
								Static25.anIntArray69[local20++] = 0;
							} else if (local732 == 0) {
								Static25.anIntArray69[local20++] = Integer.MAX_VALUE;
							} else {
								Static25.anIntArray69[local20++] = (int) Math.pow((double) local727, 1.0D / (double) local732);
							}
							continue;
						}
						if (local172 == 4014) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = local727 & local732;
							continue;
						}
						if (local172 == 4015) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							Static25.anIntArray69[local20++] = local727 | local732;
							continue;
						}
					} else if (local172 < 4200) {
						if (local172 == 4100) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							local20--;
							local732 = Static25.anIntArray69[local20];
							Static72.aClass74Array10[local22++] = Static91.method1340(new Class74[] { local543, Static56.method940(local732) });
							continue;
						}
						if (local172 == 4101) {
							local22 -= 2;
							local543 = Static72.aClass74Array10[local22];
							local1092 = Static72.aClass74Array10[local22 + 1];
							Static72.aClass74Array10[local22++] = Static91.method1340(new Class74[] { local543, local1092 });
							continue;
						}
						if (local172 == 4102) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							local20--;
							local732 = Static25.anIntArray69[local20];
							Static72.aClass74Array10[local22++] = Static91.method1340(new Class74[] { local543, Static107.method1602(local732) });
							continue;
						}
						if (local172 == 4103) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							Static72.aClass74Array10[local22++] = local543.method1729();
							continue;
						}
						if (local172 == 4104) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							@Pc(2981) long local2981 = (long) local727 * 86400000L + 1014768000000L;
							Static37.aCalendar2.setTime(new Date(local2981));
							local587 = Static37.aCalendar2.get(5);
							local609 = Static37.aCalendar2.get(2);
							local2999 = Static37.aCalendar2.get(1);
							Static72.aClass74Array10[local22++] = Static91.method1340(new Class74[] { Static56.method940(local587), Static101.aClass74_1458, Static46.aClass74Array7[local609], Static101.aClass74_1458, Static56.method940(local2999) });
							continue;
						}
						if (local172 == 4105) {
							local22 -= 2;
							local1092 = Static72.aClass74Array10[local22 + 1];
							local543 = Static72.aClass74Array10[local22];
							if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2 != null && Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2.aBoolean20) {
								Static72.aClass74Array10[local22++] = local1092;
								continue;
							}
							Static72.aClass74Array10[local22++] = local543;
							continue;
						}
						if (local172 == 4106) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static72.aClass74Array10[local22++] = Static56.method940(local727);
							continue;
						}
						if (local172 == 4107) {
							local22 -= 2;
							Static25.anIntArray69[local20++] = Static72.aClass74Array10[local22].method1731(Static72.aClass74Array10[local22 + 1]);
							continue;
						}
						@Pc(3144) byte[] local3144;
						@Pc(3149) Class2_Sub2_Sub1_Sub3 local3149;
						if (local172 == 4108) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							local20 -= 2;
							local732 = Static25.anIntArray69[local20];
							local954 = Static25.anIntArray69[local20 + 1];
							local3144 = Static3.aClass26_Sub1_3.method1358(0, local954);
							local3149 = new Class2_Sub2_Sub1_Sub3(local3144);
							Static25.anIntArray69[local20++] = local3149.method306(local543, local732);
							continue;
						}
						if (local172 == 4109) {
							local22--;
							local543 = Static72.aClass74Array10[local22];
							local20 -= 2;
							local732 = Static25.anIntArray69[local20];
							local954 = Static25.anIntArray69[local20 + 1];
							local3144 = Static3.aClass26_Sub1_3.method1358(0, local954);
							local3149 = new Class2_Sub2_Sub1_Sub3(local3144);
							Static25.anIntArray69[local20++] = local3149.method318(local543, local732);
							continue;
						}
						if (local172 == 4110) {
							local22 -= 2;
							local543 = Static72.aClass74Array10[local22];
							local1092 = Static72.aClass74Array10[local22 + 1];
							local20--;
							if (Static25.anIntArray69[local20] == 1) {
								Static72.aClass74Array10[local22++] = local543;
							} else {
								Static72.aClass74Array10[local22++] = local1092;
							}
							continue;
						}
					} else if (local172 < 4300) {
						if (local172 == 4200) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static72.aClass74Array10[local22++] = Static35.method1934(local727).aClass74_1184;
							continue;
						}
						@Pc(2618) Class2_Sub2_Sub12 local2618;
						if (local172 == 4201) {
							local20 -= 2;
							local732 = Static25.anIntArray69[local20 + 1];
							local727 = Static25.anIntArray69[local20];
							local2618 = Static35.method1934(local727);
							if (local732 >= 1 && local732 <= 5 && local2618.aClass74Array11[local732 - 1] != null) {
								Static72.aClass74Array10[local22++] = local2618.aClass74Array11[local732 - 1];
								continue;
							}
							Static72.aClass74Array10[local22++] = Static112.aClass74_1543;
							continue;
						}
						if (local172 == 4202) {
							local20 -= 2;
							local727 = Static25.anIntArray69[local20];
							local732 = Static25.anIntArray69[local20 + 1];
							local2618 = Static35.method1934(local727);
							if (local732 >= 1 && local732 <= 5 && local2618.aClass74Array12[local732 - 1] != null) {
								Static72.aClass74Array10[local22++] = local2618.aClass74Array12[local732 - 1];
								continue;
							}
							Static72.aClass74Array10[local22++] = Static112.aClass74_1543;
							continue;
						}
						if (local172 == 4203) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static35.method1934(local727).anInt1728;
							continue;
						}
						if (local172 == 4204) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static35.method1934(local727).anInt1727 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2759) Class2_Sub2_Sub12 local2759;
						if (local172 == 4205) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							local2759 = Static35.method1934(local727);
							if (local2759.anInt1725 == -1 && local2759.anInt1719 >= 0) {
								Static25.anIntArray69[local20++] = local2759.anInt1719;
								continue;
							}
							Static25.anIntArray69[local20++] = local727;
							continue;
						}
						if (local172 == 4206) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							local2759 = Static35.method1934(local727);
							if (local2759.anInt1725 >= 0 && local2759.anInt1719 >= 0) {
								Static25.anIntArray69[local20++] = local2759.anInt1719;
								continue;
							}
							Static25.anIntArray69[local20++] = local727;
							continue;
						}
						if (local172 == 4207) {
							local20--;
							local727 = Static25.anIntArray69[local20];
							Static25.anIntArray69[local20++] = Static35.method1934(local727).aBoolean69 ? 1 : 0;
							continue;
						}
					}
				}
				Static29.method518("CS2 - nosuchop:" + local172, null);
				return;
			}
		} catch (@Pc(4646) Exception local4646) {
			Static29.method518("CS2 - scr:" + local15.aLong96 + " op:" + local32, local4646);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method733() {
		aClass74_739 = null;
		aClass74_736 = null;
		aClass74_738 = null;
		aCRC32_1 = null;
		anIntArray124 = null;
		anIntArray125 = null;
		aClass74_737 = null;
		aByteArrayArrayArray3 = null;
	}
}
