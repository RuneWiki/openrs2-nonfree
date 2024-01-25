import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!is", name = "L", descriptor = "Lclient!dh;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!is", name = "P", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_68 = new Class85(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!is", name = "R", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_33 = new Class109(50);

	@OriginalMember(owner = "client!is", name = "S", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_70 = new Class103();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIB)I")
	public static int method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static322.method546(arg1 - 1, arg0 - 1) + Static322.method546(arg1 - 1, arg0 + 1) + Static322.method546(arg1 + 1, arg0 + -1) + Static322.method546(arg1 + 1, arg0 + 1);
		@Pc(78) int local78 = Static322.method546(arg1, arg0 - 1) + Static322.method546(arg1, arg0 + 1) + Static322.method546(arg1 + -1, arg0) + Static322.method546(arg1 - -1, arg0);
		@Pc(83) int local83 = Static322.method546(arg1, arg0);
		return local49 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)V")
	public static void method2568(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static283.anInt5563 - Static88.anInt1648;
		if (local8 >= 100) {
			Static53.anInt992 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static29.aFloat7;
		if (local19 < Static239.anInt4812 >> 8) {
			local19 = Static239.anInt4812 >> 8;
		}
		if (Static349.aBooleanArray26[4] && local19 < Static274.anIntArray524[4] + 128) {
			local19 = Static274.anIntArray524[4] + 128;
		}
		@Pc(56) int local56 = Static298.anInt1898 + (int) Static164.aFloat24 & 0x3FFF;
		Static178.method3198(local19, local56, (local19 >> 3) * 3 + 600, Static311.anInt3611, Static8.anInt184, Static208.method3804(Static239.anInt4811, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632) - 50, arg0);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static21.anInt466 = (int) ((float) Static276.anInt5738 + (float) (Static21.anInt466 - Static276.anInt5738) * local104);
		Static102.anInt1934 = (int) ((float) (Static102.anInt1934 - Static275.anInt5459) * local104 + (float) Static275.anInt5459);
		Static42.anInt731 = (int) ((float) Static316.anInt4878 + (float) (Static42.anInt731 - Static316.anInt4878) * local104);
		Static271.anInt5301 = (int) ((float) Static19.anInt385 + local104 * (float) (Static271.anInt5301 - Static19.anInt385));
		@Pc(157) int local157 = Static258.anInt5088 - Static252.anInt5004;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static258.anInt5088 = (int) ((float) local157 * local104 + (float) Static252.anInt5004);
		Static258.anInt5088 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method2569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class74 local7 = Static25.method4630(arg1);
		@Pc(10) int local10 = local7.anInt1872;
		@Pc(13) int local13 = local7.anInt1876;
		@Pc(16) int local16 = local7.anInt1873;
		@Pc(23) int local23 = Class5_Sub3_Sub6.anIntArray84[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static157.method2789(local10, arg0 << local13 & local23 | ~local23 & Static251.anIntArray486[local10]);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	public static void method2570() {
		@Pc(5) byte local5 = 0;
		if (Static280.aBoolean452) {
			local5 = 55;
		}
		Static238.method4239(local5);
		Static153.method2740(local5);
		Static146.method2669(local5);
		Static95.method1729(local5);
		Static202.method3714(local5);
		Static350.method5959(local5);
		Static272.method4785(local5);
		Static49.method4429(local5);
		Static192.method3441(local5);
		if (Static278.anInt5495 == 10) {
			Static50.method822(28);
		} else if (Static278.anInt5495 == 30) {
			Static50.method822(25);
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	public static void method2571() {
		@Pc(5) Class109 local5 = Static155.aClass109_36;
		synchronized (Static155.aClass109_36) {
			Static155.aClass109_36.method2850();
		}
		local5 = Static236.aClass109_46;
		synchronized (Static236.aClass109_46) {
			Static236.aClass109_46.method2850();
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V")
	public static void method2572() {
		@Pc(13) Class109 local13 = Static77.aClass109_20;
		synchronized (Static77.aClass109_20) {
			Static77.aClass109_20.method2858();
		}
	}
}
