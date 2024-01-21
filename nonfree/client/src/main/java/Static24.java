import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!wd;")
	private static Class80 aClass80_327 = Static2.method59("Please try using a different world)3");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_312 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!wd;")
	private static Class80 aClass80_313 = Static2.method59("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!wd;")
	private static Class80 aClass80_324 = Static2.method59("Drop");

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_314 = aClass80_324;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_315 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_316 = Static2.method59("Spieler");

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_317 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Z")
	public static final boolean aBoolean64 = false;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_318 = aClass80_313;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!wd;")
	private static Class80 aClass80_326 = Static2.method59(" is already on your ignore list");

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_319 = aClass80_326;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public static int anInt977 = 0;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!wd;")
	public static Class80 aClass80_320 = Static2.method59("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "Lclient!wd;")
	public static Class80 aClass80_321 = Static2.method59("Standort");

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Lclient!wd;")
	public static Class80 aClass80_322 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!wd;")
	public static Class80 aClass80_323 = Static2.method59("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!wd;")
	public static Class80 aClass80_325 = Static2.method59("Registrierter Benutzer");

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Lclient!wd;")
	public static Class80 aClass80_328 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_329 = aClass80_327;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method512() {
		aClass80_327 = null;
		aClass80_318 = null;
		aClass80_316 = null;
		aClass80_328 = null;
		aClass80_319 = null;
		aClass80_320 = null;
		aClass80_324 = null;
		aClass80_326 = null;
		aClass80_321 = null;
		aClass80_325 = null;
		aClass80_323 = null;
		aClass80_322 = null;
		aClass80_317 = null;
		aClass80_312 = null;
		aClass80_314 = null;
		aClass80_313 = null;
		aClass80_329 = null;
		aClass80_315 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	public static int method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg1;
		if (arg1 < 3 && (Static108.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
			local30 = arg1 + 1;
		}
		@Pc(51) int local51 = arg0 & 0x7F;
		@Pc(55) int local55 = arg2 & 0x7F;
		@Pc(83) int local83 = Static100.anIntArrayArrayArray5[local30][local3][local7] * (128 - local51) + local51 * Static100.anIntArrayArrayArray5[local30][local3 + 1][local7] >> 7;
		@Pc(115) int local115 = (128 - local51) * Static100.anIntArrayArrayArray5[local30][local3][local7 - -1] + Static100.anIntArrayArrayArray5[local30][local3 + 1][local7 + 1] * local51 >> 7;
		return local83 * (128 - local55) + local55 * local115 >> 7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/awt/Color;Lclient!wd;)V")
	public static void method514(@OriginalArg(0) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Class80 arg2) {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas2.getGraphics();
			if (Static2.aFont1 == null) {
				Static2.aFont1 = new Font("Helvetica", 1, 13);
				Static110.aFontMetrics1 = Static119.aCanvas2.getFontMetrics(Static2.aFont1);
			}
			if (Static82.aBoolean236) {
				Static82.aBoolean236 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static106.anInt2842, Static55.anInt1311);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static66.anImage4 == null) {
					Static66.anImage4 = Static119.aCanvas2.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static66.anImage4.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg0 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local47.setFont(Static2.aFont1);
				local47.setColor(Color.white);
				arg2.method2020((304 - arg2.method2030(Static110.aFontMetrics1)) / 2, local47, 22);
				local2.drawImage(Static66.anImage4, Static106.anInt2842 / 2 - 152, Static55.anInt1311 / 2 + -18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static55.anInt1311 / 2 - 18;
				@Pc(141) int local141 = Static106.anInt2842 / 2 - 152;
				local2.setColor(arg1);
				local2.drawRect(local141, local135, 303, 33);
				local2.fillRect(local141 + 2, local135 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local141 + 1, local135 + 1, 301, 31);
				local2.fillRect(local141 + arg0 * 3 + 2, local135 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static2.aFont1);
				local2.setColor(Color.white);
				arg2.method2020((304 - arg2.method2030(Static110.aFontMetrics1)) / 2 + local141, local2, local135 + 22);
			}
		} catch (@Pc(223) Exception local223) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!se;I)V")
	public static void method515(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		if (arg0.anInt2335 == 0) {
			return;
		}
		@Pc(45) int local45;
		@Pc(38) int local38;
		if (arg0.anInt2319 != -1 && arg0.anInt2319 < 32768) {
			@Pc(29) Class2_Sub1_Sub1_Sub4_Sub1 local29 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[arg0.anInt2319];
			if (local29 != null) {
				local38 = arg0.anInt2324 - local29.anInt2324;
				local45 = arg0.anInt2370 - local29.anInt2370;
				if (local45 != 0 || local38 != 0) {
					arg0.anInt2375 = (int) (Math.atan2((double) local45, (double) local38) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt2319 >= 32768) {
			local75 = arg0.anInt2319 - 32768;
			if (local75 == Static28.anInt2311) {
				local75 = 2047;
			}
			@Pc(84) Class2_Sub1_Sub1_Sub4_Sub2 local84 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local75];
			if (local84 != null) {
				local38 = arg0.anInt2370 - local84.anInt2370;
				@Pc(99) int local99 = arg0.anInt2324 - local84.anInt2324;
				if (local38 != 0 || local99 != 0) {
					arg0.anInt2375 = (int) (Math.atan2((double) local38, (double) local99) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2348 != 0 || arg0.anInt2368 != 0) && (arg0.anInt2382 == 0 || arg0.anInt2336 > 0)) {
			local75 = arg0.anInt2370 - (arg0.anInt2348 - Static57.anInt1736 - Static57.anInt1736) * 64;
			local45 = arg0.anInt2324 - (arg0.anInt2368 - Static66.anInt1860 - Static66.anInt1860) * 64;
			if (local75 != 0 || local45 != 0) {
				arg0.anInt2375 = (int) (Math.atan2((double) local75, (double) local45) * 325.949D) & 0x7FF;
			}
			arg0.anInt2348 = 0;
			arg0.anInt2368 = 0;
		}
		local75 = arg0.anInt2375 - arg0.anInt2347 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt2373 = 0;
			return;
		}
		arg0.anInt2373++;
		@Pc(223) boolean local223;
		if (local75 <= 1024) {
			arg0.anInt2347 += arg0.anInt2335;
			local223 = true;
			if (local75 < arg0.anInt2335 || 2048 - arg0.anInt2335 < local75) {
				arg0.anInt2347 = arg0.anInt2375;
				local223 = false;
			}
			if (arg0.anInt2352 == arg0.anInt2351 && (arg0.anInt2373 > 25 || local223)) {
				if (arg0.anInt2329 == -1) {
					arg0.anInt2351 = arg0.anInt2318;
				} else {
					arg0.anInt2351 = arg0.anInt2329;
				}
			}
		} else {
			arg0.anInt2347 -= arg0.anInt2335;
			local223 = true;
			if (local75 < arg0.anInt2335 || 2048 - arg0.anInt2335 < local75) {
				arg0.anInt2347 = arg0.anInt2375;
				local223 = false;
			}
			if (arg0.anInt2352 == arg0.anInt2351 && (arg0.anInt2373 > 25 || local223)) {
				if (arg0.anInt2330 == -1) {
					arg0.anInt2351 = arg0.anInt2318;
				} else {
					arg0.anInt2351 = arg0.anInt2330;
				}
			}
		}
		arg0.anInt2347 &= 0x7FF;
	}
}
