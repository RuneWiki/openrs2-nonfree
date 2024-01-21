import java.awt.Font;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "Lclient!sa;")
	public static Class67 aClass67_2 = new Class67(50);

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Lclient!mb;")
	private static Class45 aClass45_161 = Static63.method1251("Unable to find ");

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!mb;")
	public static Class45 aClass45_160 = aClass45_161;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[I")
	public static int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!c", name = "L", descriptor = "J")
	public static long aLong24 = 0L;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!mb;")
	public static Class45 aClass45_162 = Static63.method1251("leuchten3:");

	@OriginalMember(owner = "client!c", name = "O", descriptor = "Lclient!mb;")
	public static Class45 aClass45_163 = Static63.method1251("blaugr-Un:");

	@OriginalMember(owner = "client!c", name = "P", descriptor = "Lclient!mb;")
	private static Class45 aClass45_164 = Static63.method1251("Prepared visibility map");

	@OriginalMember(owner = "client!c", name = "R", descriptor = "Lclient!mb;")
	private static Class45 aClass45_165 = Static63.method1251("Invalid username or password)3");

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_166 = Static63.method1251("m");

	@OriginalMember(owner = "client!c", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_167 = Static63.method1251("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!c", name = "U", descriptor = "Lclient!mb;")
	public static Class45 aClass45_168 = aClass45_164;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Lclient!mb;")
	public static Class45 aClass45_169 = aClass45_165;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)Lclient!mb;")
	public static Class45 method217(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(40) byte[] local40 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(43) long local43 = arg0;
				arg0 /= 37L;
				local25--;
				local40[local25] = Static78.aByteArray30[(int) (local43 - arg0 * 37L)];
			}
			@Pc(70) Class45 local70 = new Class45();
			local70.aByteArray27 = local40;
			local70.anInt1925 = local40.length;
			return local70;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method218() {
		Static27.method613(Static101.anInt1036);
		if (Static38.anInt1088 != -1) {
			Static27.method613(Static38.anInt1088);
		}
		Static90.anInt2533 = 0;
		Static42.aClass11_39.method2152();
		Static38.anIntArray176 = Static86.method1661(Static38.anIntArray176);
		Static118.method1865();
		Static52.method2151(503, 765, 0, Static101.anInt1036);
		if (Static38.anInt1088 != -1) {
			Static52.method2151(503, 765, 0, Static38.anInt1088);
		}
		if (Static2.aBoolean2) {
			Static14.method271();
		} else {
			Static37.method788();
			Static36.method776();
		}
		try {
			@Pc(65) Graphics local65 = Static75.aCanvas1.getGraphics();
			Static42.aClass11_39.method2148(local65, 0, 0);
		} catch (@Pc(73) Exception local73) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method219() {
		anIntArray46 = null;
		aClass45_164 = null;
		aClass45_167 = null;
		aClass67_2 = null;
		aClass45_162 = null;
		aClass45_163 = null;
		aClass45_160 = null;
		aClass45_166 = null;
		aFont1 = null;
		aClass45_168 = null;
		aClass45_165 = null;
		aClass45_169 = null;
		aClass45_161 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method220() {
		for (@Pc(7) int local7 = 0; local7 < Static79.anInt2240; local7++) {
			@Pc(13) int local13 = Static104.anIntArray425[local7];
			@Pc(17) Class5_Sub2_Sub4_Sub3_Sub2 local17 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static70.aClass5_Sub9_Sub1_3.method1408();
			@Pc(32) int local32;
			@Pc(36) int local36;
			if ((local21 & 0x80) != 0) {
				local32 = Static70.aClass5_Sub9_Sub1_3.method1446();
				local36 = Static70.aClass5_Sub9_Sub1_3.method1401();
				local17.method1621(local36, Static3.anInt94, local32);
				local17.anInt2402 = Static3.anInt94 + 300;
				local17.anInt2408 = Static70.aClass5_Sub9_Sub1_3.method1401();
				local17.anInt2418 = Static70.aClass5_Sub9_Sub1_3.method1401();
			}
			if ((local21 & 0x2) != 0) {
				local17.aClass45_1014 = Static70.aClass5_Sub9_Sub1_3.method1448();
				local17.anInt2395 = 100;
			}
			if ((local21 & 0x40) != 0) {
				local17.anInt2434 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local32 = Static70.aClass5_Sub9_Sub1_3.method1434();
				local17.anInt2432 = local32 >> 16;
				local17.anInt2439 = 0;
				if (local17.anInt2434 == 65535) {
					local17.anInt2434 = -1;
				}
				local17.anInt2414 = 0;
				local17.anInt2386 = Static3.anInt94 + (local32 & 0xFFFF);
				if (local17.anInt2386 > Static3.anInt94) {
					local17.anInt2414 = -1;
				}
			}
			if ((local21 & 0x4) != 0) {
				local32 = Static70.aClass5_Sub9_Sub1_3.method1418();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static70.aClass5_Sub9_Sub1_3.method1400();
				if (local32 == local17.anInt2436 && local32 != -1) {
					@Pc(162) int local162 = Static63.method1252(local32).anInt1664;
					if (local162 == 1) {
						local17.anInt2387 = local36;
						local17.anInt2420 = 0;
						local17.anInt2390 = 0;
						local17.anInt2424 = 0;
					}
					if (local162 == 2) {
						local17.anInt2424 = 0;
					}
				} else if (local32 == -1 || local17.anInt2436 == -1 || Static63.method1252(local32).anInt1674 >= Static63.method1252(local17.anInt2436).anInt1674) {
					local17.anInt2436 = local32;
					local17.anInt2387 = local36;
					local17.anInt2420 = 0;
					local17.anInt2390 = 0;
					local17.anInt2405 = local17.anInt2433;
					local17.anInt2424 = 0;
				}
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt2411 = Static70.aClass5_Sub9_Sub1_3.method1452();
				if (local17.anInt2411 == 65535) {
					local17.anInt2411 = -1;
				}
			}
			if ((local21 & 0x1) != 0) {
				local17.aClass5_Sub2_Sub17_1 = Static63.method1254(Static70.aClass5_Sub9_Sub1_3.method1418());
				local17.anInt2415 = local17.aClass5_Sub2_Sub17_1.anInt3082;
				local17.anInt2412 = local17.aClass5_Sub2_Sub17_1.anInt3072;
				local17.anInt2426 = local17.aClass5_Sub2_Sub17_1.anInt3059;
				local17.anInt2437 = local17.aClass5_Sub2_Sub17_1.anInt3073;
				local17.anInt2413 = local17.aClass5_Sub2_Sub17_1.anInt3060;
				local17.anInt2435 = local17.aClass5_Sub2_Sub17_1.anInt3076;
				local17.anInt2440 = local17.aClass5_Sub2_Sub17_1.anInt3057;
				local17.anInt2380 = local17.aClass5_Sub2_Sub17_1.anInt3063;
				local17.anInt2421 = local17.aClass5_Sub2_Sub17_1.anInt3068;
			}
			if ((local21 & 0x10) != 0) {
				local32 = Static70.aClass5_Sub9_Sub1_3.method1400();
				local36 = Static70.aClass5_Sub9_Sub1_3.method1446();
				local17.method1621(local36, Static3.anInt94, local32);
				local17.anInt2402 = Static3.anInt94 + 300;
				local17.anInt2408 = Static70.aClass5_Sub9_Sub1_3.method1401();
				local17.anInt2418 = Static70.aClass5_Sub9_Sub1_3.method1446();
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt2384 = Static70.aClass5_Sub9_Sub1_3.method1435();
				local17.anInt2430 = Static70.aClass5_Sub9_Sub1_3.method1435();
			}
		}
	}
}
