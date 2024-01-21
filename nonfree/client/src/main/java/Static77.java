import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array11;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public static final int anInt1979 = 50;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[B")
	public static byte[] aByteArray27 = new byte[520];

	@OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
	public static int[] anIntArray261 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
	public static int[] anIntArray262 = new int[500];

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array9 = new Class2_Sub1_Sub9_Sub1[1000];

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	public static int[] anIntArray263 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "A", descriptor = "[I")
	public static int[] anIntArray264 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
	public static int[] anIntArray265 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array12 = new Class80[anInt1979];

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
	public static int[] anIntArray266 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "[I")
	public static int[] anIntArray267 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_767 = Static2.method59("::clientdrop");

	@OriginalMember(owner = "client!na", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[5][5000];

	@OriginalMember(owner = "client!na", name = "S", descriptor = "[I")
	public static int[] anIntArray268 = new int[anInt1979];

	@OriginalMember(owner = "client!na", name = "T", descriptor = "Lclient!wd;")
	public static Class80 aClass80_768 = Static2.method59("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ff;ILclient!ff;Lclient!ff;)V")
	public static void method1196(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static65.aClass11_30 = arg1;
		Static16.aClass11_8 = arg2;
		Static105.aClass11_39 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!re;B)V")
	public static void method1197(@OriginalArg(0) Class63 arg0) {
		Static84.aClass63_1 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!ue;ILjava/awt/Component;)Lclient!ha;")
	public static Class29 method1198(@OriginalArg(1) int arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static35.anInt1167 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class29 local33 = (Class29) Class.forName("Class29_Sub2").getDeclaredConstructor().newInstance();
			local33.anIntArray279 = new int[(Static36.aBoolean74 ? 2 : 1) * 256];
			local33.anInt2099 = arg0;
			local33.method1268(arg3);
			local33.anInt2098 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt2098 > 16384) {
				local33.anInt2098 = 16384;
			}
			local33.method1279(local33.anInt2098);
			if (Static111.anInt2992 > 0 && Static20.aClass66_1 == null) {
				Static20.aClass66_1 = new Class66();
				arg1.method1875(Static111.anInt2992, Static20.aClass66_1);
			}
			if (Static20.aClass66_1 != null) {
				if (Static20.aClass66_1.aClass29Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static20.aClass66_1.aClass29Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(102) Throwable local102) {
			try {
				@Pc(108) Class29_Sub1 local108 = new Class29_Sub1(arg1, arg2);
				local108.anIntArray279 = new int[(Static36.aBoolean74 ? 2 : 1) * 256];
				local108.anInt2099 = arg0;
				local108.method1268(arg3);
				local108.anInt2098 = 16384;
				local108.method1279(local108.anInt2098);
				if (Static111.anInt2992 > 0 && Static20.aClass66_1 == null) {
					Static20.aClass66_1 = new Class66();
					arg1.method1875(Static111.anInt2992, Static20.aClass66_1);
				}
				if (Static20.aClass66_1 != null) {
					if (Static20.aClass66_1.aClass29Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static20.aClass66_1.aClass29Array1[arg2] = local108;
				}
				return local108;
			} catch (@Pc(172) Throwable local172) {
				return new Class29();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	public static void method1199() {
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt2410; local3++) {
			@Pc(9) int local9 = Static16.anIntArray68[local3];
			@Pc(13) Class2_Sub1_Sub1_Sub4_Sub2 local13 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local9];
			@Pc(19) int local19 = Static100.aClass2_Sub17_Sub1_1.method1780();
			if ((local19 & 0x1) != 0) {
				local19 += Static100.aClass2_Sub17_Sub1_1.method1780() << 8;
			}
			Static85.method1263(local9, local13, local19);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static122.method1969(arg4)) {
			Static63.method1072(arg1, arg2, arg5, -1, arg0, 0, arg6, 0, arg3, Static51.aClass2_Sub1_Sub17ArrayArray1[arg4]);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1201() {
		anIntArray265 = null;
		anIntArrayArray26 = null;
		aByteArray27 = null;
		aClass80Array12 = null;
		anIntArray267 = null;
		anIntArray268 = null;
		aClass80Array11 = null;
		anIntArray262 = null;
		aClass80_767 = null;
		aClass80_768 = null;
		anIntArray263 = null;
		aClass2_Sub1_Sub9_Sub1Array9 = null;
		anIntArray261 = null;
		anIntArray264 = null;
		anIntArray266 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub5 local7 = null;
		for (@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) Static90.aClass58_11.method1285(); local17 != null; local17 = (Class2_Sub5) Static90.aClass58_11.method1281()) {
			if (local17.anInt1502 == arg3 && local17.anInt1509 == arg2 && local17.anInt1497 == arg1 && local17.anInt1511 == arg4) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub5();
			local7.anInt1511 = arg4;
			local7.anInt1502 = arg3;
			local7.anInt1497 = arg1;
			local7.anInt1509 = arg2;
			Static111.method1939(local7);
			Static90.aClass58_11.method1294(local7);
		}
		local7.anInt1505 = arg0;
		local7.anInt1512 = arg6;
		local7.anInt1500 = arg7;
		local7.anInt1510 = arg5;
		local7.anInt1504 = arg8;
	}
}
