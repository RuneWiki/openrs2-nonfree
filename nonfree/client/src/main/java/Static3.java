import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "[B")
	public static byte[] aByteArray3;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public static int anInt122;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!qk;")
	public static Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "F")
	public static float aFloat1 = 0.0F;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!in;")
	public static Class71 aClass71_1 = null;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method136(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static124.method2171(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static151.method4451(local7);
			local7 = Static101.method1899(local7, "%3a", ":");
			local7 = Static101.method1899(local7, "%40", "@");
			local7 = Static101.method1899(local7, "%26", "&");
			local7 = Static101.method1899(local7, "%23", "#");
			if (Static203.aClass175_3.anApplet1 == null) {
				return;
			}
			@Pc(113) Class116 local113 = Static203.aClass175_3.method4328(new URL(Static203.aClass175_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static172.anInt3655 + "&u=" + Static189.aLong146 + "&v1=" + Static288.aString323 + "&v2=" + Static288.aString326 + "&e=" + local7));
			while (local113.anInt3812 == 0) {
				Static48.method934(1L);
			}
			if (local113.anInt3812 == 1) {
				@Pc(130) DataInputStream local130 = (DataInputStream) local113.anObject5;
				local130.read();
				local130.close();
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method137() {
		Static296.aClass135_41.method3317();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!km;)V")
	public static void method138(@OriginalArg(1) Class91 arg0) {
		Static215.anInt4271 = arg0.method2504("titlebg");
		Static200.anInt4064 = arg0.method2504("logo");
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method140() {
		Static250.aClass135_32.method3324();
		Static115.aClass135_12.method3324();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
	public static void method141(@OriginalArg(0) int arg0) {
		Static14.anIntArray33 = new int[arg0];
		Static18.anIntArray42 = new int[arg0];
		Static232.anIntArray405 = new int[arg0];
		Static100.anIntArray212 = new int[arg0];
		Static125.anIntArray258 = new int[arg0];
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method145() {
		if (Static185.aClass71_16 != null || Static84.aClass71_11 != null) {
			return;
		}
		@Pc(16) int local16 = Static123.anInt2804;
		@Pc(94) int local94;
		@Pc(100) int local100;
		if (!Static14.aBoolean23) {
			if (local16 == 1 && Static134.anInt2945 > 0) {
				@Pc(36) short local36 = Static61.aShortArray23[Static134.anInt2945 - 1];
				if (local36 == 23 || local36 == 1 || local36 == 41 || local36 == 33 || local36 == 22 || local36 == 17 || local36 == 24 || local36 == 44 || local36 == 25 || local36 == 21 || local36 == 28 || local36 == 1003) {
					local94 = Static219.anIntArray387[Static134.anInt2945 - 1];
					local100 = Static164.anIntArray311[Static134.anInt2945 - 1];
					@Pc(104) Class71 local104 = Static56.method1058(local100);
					@Pc(107) Class1_Sub15 local107 = Static36.method769(local104);
					if (local107.method1373() || local107.method1369()) {
						Static166.aBoolean262 = false;
						Static190.anInt3912 = 0;
						if (Static185.aClass71_16 != null) {
							Static160.method2779(Static185.aClass71_16);
						}
						Static185.aClass71_16 = Static56.method1058(local100);
						Static258.anInt5075 = Static249.anInt4936;
						Static242.anInt4793 = local94;
						Static191.anInt3931 = Static40.anInt1015;
						Static160.method2779(Static185.aClass71_16);
						return;
					}
				}
			}
			if (local16 == 1 && (Static1.anInt4243 == 1 && Static134.anInt2945 > 2 || Static102.method1910(Static134.anInt2945 - 1))) {
				local16 = 2;
			}
			if (local16 == 2 && Static134.anInt2945 > 0 || Static30.anInt3296 == 1) {
				Static270.method4085();
			}
			if (local16 == 1 && Static134.anInt2945 > 0 || Static30.anInt3296 == 2) {
				Static193.method3192();
			}
			return;
		}
		@Pc(193) int local193;
		if (local16 != 1) {
			local193 = Static224.anInt4445;
			local94 = Static8.anInt226;
			if (Static279.anInt5379 - 10 > local193 || Static116.anInt5594 + Static279.anInt5379 + 10 < local193 || local94 < Static88.anInt1955 - 10 || Static276.anInt2924 + Static88.anInt1955 + 10 < local94) {
				Static14.aBoolean23 = false;
				Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
			}
		}
		if (local16 != 1) {
			return;
		}
		local193 = Static279.anInt5379;
		local100 = Static116.anInt5594;
		@Pc(248) int local248 = Static249.anInt4936;
		@Pc(250) int local250 = -1;
		local94 = Static88.anInt1955;
		@Pc(254) int local254 = Static40.anInt1015;
		for (@Pc(256) int local256 = 0; local256 < Static134.anInt2945; local256++) {
			@Pc(278) int local278;
			if (Static221.aBoolean340) {
				local278 = (Static134.anInt2945 - local256 - 1) * 15 + local94 + 33;
				if (local193 < local248 && local193 + local100 > local248 && local278 - 13 < local254 && local278 + 3 > local254) {
					local250 = local256;
				}
			} else {
				local278 = local94 + (Static134.anInt2945 - local256 - 1) * 15 + 31;
				if (local248 > local193 && local100 + local193 > local248 && local278 - 13 < local254 && local254 < local278 + 3) {
					local250 = local256;
				}
			}
		}
		if (local250 != -1) {
			Static225.method3547(local250);
		}
		Static14.aBoolean23 = false;
		Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
	}
}
