import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Lclient!ac;")
	public static Class3 aClass3_5;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
	public static int[] anIntArray130 = new int[200];

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_487 = Static14.method2017("lila:");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_488 = Static14.method2017("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!h", name = "v", descriptor = "I")
	public static int anInt952 = 2;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_489 = Static14.method2017("@whi@");

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!kc;")
	public static Class36 aClass36_490 = Static14.method2017("Handel akzeptieren");

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lclient!sd;")
	public static Class2_Sub1_Sub16 method733(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub16 local10 = (Class2_Sub1_Sub16) Static8.aClass22_1.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static50.aClass3_13.method928(arg0, 16);
		local10 = new Class2_Sub1_Sub16();
		if (local20 != null) {
			local10.method1807(new Class2_Sub12(local20));
		}
		Static8.aClass22_1.method712(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bf;IBLclient!je;)V")
	public static void method734(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class8 local5 = Static45.aClass8_3;
		synchronized (Static45.aClass8_3) {
			for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Static45.aClass8_3.method175(); local18 != null; local18 = (Class2_Sub5) Static45.aClass8_3.method173()) {
				if (local18.aLong89 == (long) arg1 && local18.aClass10_1 == arg0 && local18.anInt814 == 0) {
					local3 = local18.aByteArray8;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(72) byte[] local72 = arg0.method224(arg1);
			arg2.method952(local72, arg1, true, arg0);
		} else {
			arg2.method952(local3, arg1, true, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ[B)V")
	public static void method735(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		if (Static41.aClass29_1 == null) {
			return;
		}
		if (Static79.anInt2048 >= 0) {
			Static41.aClass29_1.method1933();
			Static38.anInt969 = 20;
			Static17.aByteArray4 = null;
			Static99.anInt2032 = 0;
			Static79.anInt2048 = -1;
		}
		if (arg2 == null) {
			return;
		}
		if (Static38.anInt969 > 0) {
			Static41.aClass29_1.method1934(arg0);
			Static38.anInt969 = 0;
		}
		Static79.anInt2048 = arg0;
		Static41.aClass29_1.method1935(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
	public static void method736(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = Static6.aClass2_Sub1_Sub1_Sub3_2.anIntArray224;
		@Pc(16) int local16 = local13.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local13[local18] = 0;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		for (@Pc(30) int local30 = 1; local30 < 103; local30++) {
			local43 = 4 * 512 * (103 - local30) + 24628;
			for (local45 = 1; local45 < 103; local45++) {
				if ((Static16.aByteArrayArrayArray3[arg0][local45][local30] & 0x18) == 0) {
					Static85.aClass61_1.method1728(local13, local43, arg0, local45, local30);
				}
				if (arg0 < 3 && (Static16.aByteArrayArrayArray3[arg0 + 1][local45][local30] & 0x8) != 0) {
					Static85.aClass61_1.method1728(local13, local43, arg0 + 1, local45, local30);
				}
				local43 += 4;
			}
		}
		Static6.aClass2_Sub1_Sub1_Sub3_2.method1245();
		local45 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local43 = (int) (Math.random() * 20.0D) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
		@Pc(157) int local157;
		for (@Pc(153) int local153 = 1; local153 < 103; local153++) {
			for (local157 = 1; local157 < 103; local157++) {
				if ((Static16.aByteArrayArrayArray3[arg0][local157][local153] & 0x18) == 0) {
					Static29.method622(local43, arg0, local45, local153, local157);
				}
				if (arg0 < 3 && (Static16.aByteArrayArrayArray3[arg0 + 1][local157][local153] & 0x8) != 0) {
					Static29.method622(local43, arg0 + 1, local45, local153, local157);
				}
			}
		}
		Static23.anInt588 = 0;
		for (local157 = 0; local157 < 104; local157++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static85.aClass61_1.method1713(Static92.anInt2412, local157, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(245) int local245 = Static2.method2072(local232).anInt2292;
					if (local245 >= 0) {
						@Pc(252) int local252 = local157;
						@Pc(254) int local254 = local224;
						if (local245 != 22 && local245 != 29 && local245 != 34 && local245 != 36 && local245 != 46 && local245 != 47 && local245 != 48) {
							@Pc(290) int[][] local290 = Static11.aClass4Array1[Static92.anInt2412].anIntArrayArray3;
							for (@Pc(292) int local292 = 0; local292 < 10; local292++) {
								@Pc(299) int local299 = (int) (Math.random() * 4.0D);
								if (local299 == 0 && local252 > 0 && local157 - 3 < local252 && (local290[local252 - 1][local254] & 0x1280108) == 0) {
									local252--;
								}
								if (local299 == 1 && local252 < 103 && local252 < local157 + 3 && (local290[local252 + 1][local254] & 0x1280180) == 0) {
									local252++;
								}
								if (local299 == 2 && local254 > 0 && local224 - 3 < local254 && (local290[local252][local254 - 1] & 0x1280102) == 0) {
									local254--;
								}
								if (local299 == 3 && local254 < 103 && local254 < local224 + 3 && (local290[local252][local254 + 1] & 0x1280120) == 0) {
									local254++;
								}
							}
						}
						Static45.aClass2_Sub1_Sub1_Sub3Array16[Static23.anInt588] = Static57.aClass2_Sub1_Sub1_Sub3Array19[local245];
						Static91.anIntArray280[Static23.anInt588] = local252;
						Static112.anIntArray348[Static23.anInt588] = local254;
						Static23.anInt588++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ[BI)Lclient!kc;")
	public static Class36 method737(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class36 local7 = new Class36();
		local7.aByteArray9 = new byte[arg2];
		local7.anInt1442 = 0;
		for (@Pc(16) int local16 = arg0; local16 < arg0 + arg2; local16++) {
			if (arg1[local16] != 0) {
				local7.aByteArray9[local7.anInt1442++] = arg1[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method738(@OriginalArg(1) Class3 arg0) {
		Static50.aClass3_13 = arg0;
		Static97.anInt2572 = Static50.aClass3_13.method946(16);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public static void method739() {
		if (Static77.aClass9_1 != null) {
			@Pc(12) Class9 local12 = Static77.aClass9_1;
			synchronized (Static77.aClass9_1) {
				Static77.aClass9_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method740() {
		aClass36_490 = null;
		aClass36_487 = null;
		aClass3_5 = null;
		anIntArray131 = null;
		aClass36_489 = null;
		anIntArray132 = null;
		aClass36_488 = null;
		anIntArray130 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method741() {
		Static81.aClass22_28.method716();
	}
}
