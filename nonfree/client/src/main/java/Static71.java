import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt2140;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public static int anInt2135 = 0;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_641 = Static170.method3101("Loading fonts )2 ");

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt2137 = 0;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_642 = aClass28_641;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_643 = Static170.method3101("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1651() {
		anIntArray353 = null;
		aFont1 = null;
		aClass28_642 = null;
		aClass28_643 = null;
		aClass28_641 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1652() {
		@Pc(9) Object local9 = Static34.anObject1;
		synchronized (Static34.anObject1) {
			if (Static42.anInt1179 == 0) {
				Static123.aClass68_4.method2525(5, new Class78());
			}
			Static42.anInt1179 = 600;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!gf;IIIII)V")
	public static void method1653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static123.aBoolean153) {
			Static63.anInt1936 = 32;
		} else {
			Static63.anInt1936 = 0;
		}
		Static123.aBoolean153 = false;
		@Pc(136) int local136;
		if (Static136.anInt3480 != 0) {
			if (arg5 <= arg1 && arg1 < arg5 + 16 && arg6 >= arg4 && arg6 < arg4 + 16) {
				arg2.anInt1490 -= 4;
				Static16.method534(arg2);
			} else if (arg5 <= arg1 && arg1 < arg5 + 16 && arg4 + arg3 - 16 <= arg6 && arg6 < arg4 + arg3) {
				arg2.anInt1490 += 4;
				Static16.method534(arg2);
			} else if (arg1 >= arg5 - Static63.anInt1936 && arg1 < Static63.anInt1936 + arg5 + 16 && arg4 + 16 <= arg6 && arg4 + arg3 - 16 > arg6) {
				local136 = (arg3 - 32) * arg3 / arg0;
				if (local136 < 8) {
					local136 = 8;
				}
				@Pc(153) int local153 = arg6 - local136 / 2 - arg4 - 16;
				@Pc(159) int local159 = arg3 - local136 - 32;
				arg2.anInt1490 = local153 * (arg0 - arg3) / local159;
				Static16.method534(arg2);
				Static123.aBoolean153 = true;
			}
		}
		if (Static101.anInt2657 == 0) {
			return;
		}
		local136 = arg2.anInt1457;
		if (arg5 - local136 <= arg1 && arg4 <= arg6 && arg5 + 16 > arg1 && arg6 <= arg3 + arg4) {
			arg2.anInt1490 += Static101.anInt2657 * 45;
			Static16.method534(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[B)V")
	public static void method1654(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg0);
		local8.anInt1948 = arg0.length - 2;
		Static85.anInt2511 = local8.method1510();
		Static59.aByteArrayArray41 = new byte[Static85.anInt2511][];
		Static95.anIntArray452 = new int[Static85.anInt2511];
		Static59.anIntArray293 = new int[Static85.anInt2511];
		Static173.anIntArray690 = new int[Static85.anInt2511];
		Static83.anIntArray394 = new int[Static85.anInt2511];
		local8.anInt1948 = arg0.length - Static85.anInt2511 * 8 - 7;
		Static172.anInt4139 = local8.method1510();
		Static114.anInt2920 = local8.method1510();
		@Pc(60) int local60 = (local8.method1545() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static85.anInt2511; local62++) {
			Static59.anIntArray293[local62] = local8.method1510();
		}
		for (@Pc(80) int local80 = 0; local80 < Static85.anInt2511; local80++) {
			Static173.anIntArray690[local80] = local8.method1510();
		}
		for (@Pc(93) int local93 = 0; local93 < Static85.anInt2511; local93++) {
			Static83.anIntArray394[local93] = local8.method1510();
		}
		for (@Pc(110) int local110 = 0; local110 < Static85.anInt2511; local110++) {
			Static95.anIntArray452[local110] = local8.method1510();
		}
		local8.anInt1948 = arg0.length + 3 - Static85.anInt2511 * 8 - local60 * 3 - 7;
		Static55.anIntArray272 = new int[local60];
		for (@Pc(147) int local147 = 1; local147 < local60; local147++) {
			Static55.anIntArray272[local147] = local8.method1554();
			if (Static55.anIntArray272[local147] == 0) {
				Static55.anIntArray272[local147] = 1;
			}
		}
		local8.anInt1948 = 0;
		for (@Pc(175) int local175 = 0; local175 < Static85.anInt2511; local175++) {
			@Pc(180) int local180 = Static83.anIntArray394[local175];
			@Pc(184) int local184 = Static95.anIntArray452[local175];
			@Pc(188) int local188 = local180 * local184;
			@Pc(191) byte[] local191 = new byte[local188];
			Static59.aByteArrayArray41[local175] = local191;
			@Pc(199) int local199 = local8.method1545();
			@Pc(209) int local209;
			if (local199 == 0) {
				for (local209 = 0; local209 < local188; local209++) {
					local191[local209] = local8.method1508();
				}
			} else if (local199 == 1) {
				for (local209 = 0; local209 < local180; local209++) {
					for (@Pc(212) int local212 = 0; local212 < local184; local212++) {
						local191[local209 + local212 * local180] = local8.method1508();
					}
				}
			}
		}
	}
}
