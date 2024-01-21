import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_50;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_639 = Static56.method972("Fallen lassen");

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_640 = Static56.method972("mapmarker");

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_641 = Static56.method972("mapscene");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
	public static int[] anIntArray154 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt1325 = 0;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lclient!vb;")
	public static Class11_Sub1[] aClass11_Sub1Array1 = new Class11_Sub1[256];

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array9 = new Class5[500];

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Z")
	public static boolean method875(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static52.anIntArray162[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 31;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!bf;)V")
	public static void method876(@OriginalArg(1) Class11 arg0) {
		Static92.aClass11_58 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method877() {
		aClass5_640 = null;
		aClass11_Sub1_50 = null;
		aClass5_639 = null;
		anIntArray154 = null;
		aClass5Array9 = null;
		anIntArrayArray12 = null;
		aClass11_Sub1Array1 = null;
		aClass5_641 = null;
		aByteArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	public static int method878() {
		@Pc(3) int local3 = 3;
		if (Static70.anInt1827 < 310) {
			@Pc(21) int local21 = Static89.anInt2280 >> 7;
			@Pc(25) int local25 = Static60.anInt2989 >> 7;
			@Pc(30) int local30 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 >> 7;
			if ((Static93.aByteArrayArrayArray5[Static12.anInt480][local21][local25] & 0x4) != 0) {
				local3 = Static12.anInt480;
			}
			@Pc(47) int local47 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 >> 7;
			@Pc(55) int local55;
			if (local25 < local30) {
				local55 = local30 - local25;
			} else {
				local55 = local25 - local30;
			}
			@Pc(72) int local72;
			if (local47 > local21) {
				local72 = local47 - local21;
			} else {
				local72 = local21 - local47;
			}
			@Pc(87) int local87;
			@Pc(89) int local89;
			if (local55 >= local72) {
				local87 = local72 * 65536 / local55;
				local89 = 32768;
				while (local25 != local30) {
					if (local30 > local25) {
						local25++;
					} else if (local30 < local25) {
						local25--;
					}
					local89 += local87;
					if ((Static93.aByteArrayArrayArray5[Static12.anInt480][local21][local25] & 0x4) != 0) {
						local3 = Static12.anInt480;
					}
					if (local89 >= 65536) {
						if (local47 > local21) {
							local21++;
						} else if (local21 > local47) {
							local21--;
						}
						local89 -= 65536;
						if ((Static93.aByteArrayArrayArray5[Static12.anInt480][local21][local25] & 0x4) != 0) {
							local3 = Static12.anInt480;
						}
					}
				}
			} else {
				local87 = local55 * 65536 / local72;
				local89 = 32768;
				while (local47 != local21) {
					if (local47 > local21) {
						local21++;
					} else if (local47 < local21) {
						local21--;
					}
					if ((Static93.aByteArrayArrayArray5[Static12.anInt480][local21][local25] & 0x4) != 0) {
						local3 = Static12.anInt480;
					}
					local89 += local87;
					if (local89 >= 65536) {
						local89 -= 65536;
						if (local25 < local30) {
							local25++;
						} else if (local30 < local25) {
							local25--;
						}
						if ((Static93.aByteArrayArrayArray5[Static12.anInt480][local21][local25] & 0x4) != 0) {
							local3 = Static12.anInt480;
						}
					}
				}
			}
		}
		if ((Static93.aByteArrayArrayArray5[Static12.anInt480][Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 >> 7][Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 >> 7] & 0x4) != 0) {
			local3 = Static12.anInt480;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public static void method879() {
		for (@Pc(10) Class3_Sub11 local10 = (Class3_Sub11) Static17.aClass51_3.method1316(); local10 != null; local10 = (Class3_Sub11) Static17.aClass51_3.method1310()) {
			if (local10.anInt2273 == -1) {
				local10.anInt2287 = 0;
				Static110.method1918(local10);
			} else {
				local10.method1966();
			}
		}
	}
}
