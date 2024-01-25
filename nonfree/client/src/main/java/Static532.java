import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wca", name = "Q", descriptor = "Lclient!cba;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	public static final int anInt8964 = 1338;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
	public static int anInt8970 = 0;

	@OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
	public static int anInt8981 = 0;

	@OriginalMember(owner = "client!wca", name = "O", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_226 = new Class150(17, 9);

	@OriginalMember(owner = "client!wca", name = "P", descriptor = "Lclient!fj;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!fd;B)I")
	public static int method7251(@OriginalArg(0) Class98 arg0) {
		if (arg0 == Static148.aClass98_1) {
			return 7681;
		} else if (arg0 == Static165.aClass98_2) {
			return 8448;
		} else if (Static395.aClass98_5 == arg0) {
			return 34165;
		} else if (Static344.aClass98_4 == arg0) {
			return 260;
		} else if (Static283.aClass98_3 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)V")
	public static void method7259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 6);
		local8.method1327();
		local8.anInt1437 = arg1;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZIIII)V")
	public static void method7260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static300.aClass5_Sub28_Sub1_1.anInt4871 != 0 && arg2 != 0 && Static469.anInt8085 < 50 && arg0 != -1) {
			Static310.aClass217Array1[Static469.anInt8085++] = new Class217((byte) 1, arg0, arg2, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lclient!oh;II)V")
	public static void method7261(@OriginalArg(0) Class220[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class220 local13 = arg0[local7];
			if (local13 != null && local13.anInt6605 == arg1 && !Static68.method1302(local13)) {
				if (local13.anInt6669 == 0) {
					method7261(arg0, local13.anInt6661);
					if (local13.aClass220Array6 != null) {
						method7261(local13.aClass220Array6, local13.anInt6661);
					}
					@Pc(51) Class5_Sub43 local51 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local13.anInt6661);
					if (local51 != null) {
						Static327.method5196(local51.anInt7801);
					}
				}
				if (local13.anInt6669 == 6 && local13.anInt6643 != -1) {
					@Pc(72) Class31 local72 = Static155.aClass76_2.method2152(local13.anInt6643);
					if (local72 != null) {
						local13.anInt6619 += Static168.anInt7198;
						while (local13.anInt6619 > local72.anIntArray68[local13.anInt6649]) {
							local13.anInt6619 -= local72.anIntArray68[local13.anInt6649];
							local13.anInt6649++;
							if (local13.anInt6649 >= local72.anIntArray69.length) {
								local13.anInt6649 -= local72.anInt927;
								if (local13.anInt6649 < 0 || local13.anInt6649 >= local72.anIntArray69.length) {
									local13.anInt6649 = 0;
								}
							}
							local13.anInt6604 = local13.anInt6649 + 1;
							if (local13.anInt6604 >= local72.anIntArray69.length) {
								local13.anInt6604 -= local72.anInt927;
								if (local13.anInt6604 < 0 || local13.anInt6604 >= local72.anIntArray69.length) {
									local13.anInt6604 = -1;
								}
							}
							Static377.method5650(local13);
						}
					}
				}
			}
		}
	}
}
