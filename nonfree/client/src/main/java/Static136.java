import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1142 = Static170.method3101("::fpsoff");

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
	public static int anInt3477 = 0;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1143 = Static170.method3101("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
	public static int anInt3480 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method2667(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(32) int local32 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public static void method2668() {
		aLongArray5 = null;
		aClass28_1143 = null;
		aClass28_1142 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[Lclient!gf;I)V")
	public static void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) Class33[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(13) Class33 local13 = arg1[local8];
			if (local13 != null && local13.anInt1488 == arg0 && (!local13.aBoolean90 || !Static61.method1440(local13))) {
				if (local13.anInt1522 == 0) {
					if (!local13.aBoolean90 && Static61.method1440(local13) && local13 != Static57.aClass33_9) {
						continue;
					}
					method2669(local13.anInt1471, arg1);
					if (local13.aClass33Array2 != null) {
						method2669(local13.anInt1471, local13.aClass33Array2);
					}
					@Pc(64) Class3_Sub7 local64 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local13.anInt1471);
					if (local64 != null) {
						Static94.method2074(local64.anInt1548);
					}
				}
				if (local13.anInt1522 == 6) {
					@Pc(91) int local91;
					if (local13.anInt1523 != -1 || local13.anInt1495 != -1) {
						@Pc(86) boolean local86 = Static113.method2278(local13);
						if (local86) {
							local91 = local13.anInt1495;
						} else {
							local91 = local13.anInt1523;
						}
						if (local91 != -1) {
							@Pc(102) Class3_Sub2_Sub4 local102 = Static21.method594(local91);
							local13.anInt1485 += Static165.anInt3991;
							while (local13.anInt1485 > local102.anIntArray139[local13.anInt1467]) {
								local13.anInt1485 -= local102.anIntArray139[local13.anInt1467];
								local13.anInt1467++;
								if (local102.anIntArray142.length <= local13.anInt1467) {
									local13.anInt1467 -= local102.anInt533;
									if (local13.anInt1467 < 0 || local13.anInt1467 >= local102.anIntArray142.length) {
										local13.anInt1467 = 0;
									}
								}
								Static16.method534(local13);
							}
						}
					}
					if (local13.anInt1468 != 0 && !local13.aBoolean90) {
						@Pc(183) int local183 = local13.anInt1468 >> 16;
						local91 = local13.anInt1468 << 16 >> 16;
						@Pc(194) int local194 = local183 * Static165.anInt3991;
						local13.anInt1474 = local194 + local13.anInt1474 & 0x7FF;
						local91 *= Static165.anInt3991;
						local13.anInt1508 = local13.anInt1508 + local91 & 0x7FF;
						Static16.method534(local13);
					}
				}
			}
		}
	}
}
