import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	public static int anInt2318 = 2;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "J")
	public static volatile long aLong67 = 0L;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString86 = "Walk here";

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method2274(@OriginalArg(1) Class143 arg0) {
		Static49.aClass143_35 = arg0;
		Static355.anInt6754 = Static49.aClass143_35.method3732(15);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method2275() {
		if (Static323.anInt971 < 0) {
			return;
		}
		@Pc(14) long local14 = Static168.method3300();
		Static323.anInt971 = (int) ((long) Static323.anInt971 + Static137.aLong87 - local14);
		if (Static323.anInt971 <= 0) {
			Static206.aFloat147 = Static221.aClass188_1.aFloat112;
			Static181.aClass67_2 = Static221.aClass188_1.aClass67_4;
			Static347.aFloat146 = Static221.aClass188_1.aFloat111;
			Static39.anInt977 = Static221.aClass188_1.anInt5708;
			Static323.anInt971 = -1;
			Static348.aFloat101 = Static221.aClass188_1.aFloat114;
			Static179.anInt3692 = Static221.aClass188_1.anInt5703;
			Static123.aFloat136 = Static221.aClass188_1.aFloat109;
			Static28.aFloat13 = Static221.aClass188_1.aFloat110;
			Static215.aFloat84 = Static221.aClass188_1.aFloat113;
			Static236.anInt174 = Static221.aClass188_1.anInt5696;
		} else {
			@Pc(65) int local65 = (Static323.anInt971 << 8) / Static309.anInt5890;
			@Pc(70) int local70 = 255 - local65;
			@Pc(75) float local75 = (float) local65 / 255.0F;
			Static236.anInt174 = ((Static221.aClass188_1.anInt5696 & 0xFF00FF) * local70 + local65 * (Static72.anInt1757 & 0xFF00FF) & 0xFF00FF00) + ((Static221.aClass188_1.anInt5696 & 0xFF00) * local70 + (Static72.anInt1757 & 0xFF00) * local65 & 0xFF0000) >>> 8;
			@Pc(112) float local112 = 1.0F - local75;
			Static28.aFloat13 = Static282.aFloat102 + (Static221.aClass188_1.aFloat110 - Static282.aFloat102) * local112;
			Static348.aFloat101 = (Static221.aClass188_1.aFloat114 - Static308.aFloat90) * local112 + Static308.aFloat90;
			Static179.anInt3692 = Static221.aClass188_1.anInt5703 * local70 + local65 * Static258.anInt4907 >> 8;
			Static123.aFloat136 = Static312.aFloat137 + (Static221.aClass188_1.aFloat109 - Static312.aFloat137) * local112;
			Static215.aFloat84 = (Static221.aClass188_1.aFloat113 - Static220.aFloat88) * local112 + Static220.aFloat88;
			Static206.aFloat147 = Static203.aFloat140 + local112 * (Static221.aClass188_1.aFloat112 - Static203.aFloat140);
			Static347.aFloat146 = Static71.aFloat106 + local112 * (Static221.aClass188_1.aFloat111 - Static71.aFloat106);
			Static39.anInt977 = ((Static221.aClass188_1.anInt5708 & 0xFF00FF) * local70 + local65 * (Static164.anInt3453 & 0xFF00FF) & 0xFF00FF00) + (local65 * (Static164.anInt3453 & 0xFF00) + (Static221.aClass188_1.anInt5708 & 0xFF00) * local70 & 0xFF0000) >>> 8;
			if (Static221.aClass188_1.aClass67_4 != Static190.aClass67_3) {
				Static181.aClass67_2 = Static262.aClass46_7.method5109(Static190.aClass67_3, Static221.aClass188_1.aClass67_4, local112, Static181.aClass67_2);
			}
		}
		Static137.aLong87 = local14;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	public static void method2276() {
		Static164.aClass14_Sub4_Sub2_3.method2557(128);
		Static164.aClass14_Sub4_Sub2_3.method2538(Static237.method4149());
		Static164.aClass14_Sub4_Sub2_3.method2509(Static294.anInt5659);
		Static164.aClass14_Sub4_Sub2_3.method2509(Static46.anInt1173);
		Static164.aClass14_Sub4_Sub2_3.method2538(Static217.anInt4358);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	public static void method2278(@OriginalArg(1) int arg0) {
		@Pc(1) Class14_Sub2_Sub2 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class114 local8 = Static18.aClass114Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static180.anInt3712; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static233.anInt4556; local15++) {
						local1 = local8.method3613(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class114 local41 = Static18.aClass114Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method3610(local15, local12) - local41.method3610(local15, local12);
									@Pc(67) int local67 = local8.method3610(local15 + 1, local12) - local41.method3610(local15 + 1, local12);
									@Pc(85) int local85 = local8.method3610(local15 + 1, local12 + 1) - local41.method3610(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method3610(local15, local12 + 1) - local41.method3610(local15, local12 + 1);
									local41.method3602(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I")
	public static int method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static238.anIntArrayArray77 == null ? 0 : Static238.anIntArrayArray77[arg0][arg1] >>> 21 & 0x7F8;
	}
}
