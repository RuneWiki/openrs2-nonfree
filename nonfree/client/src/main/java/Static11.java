import java.awt.Frame;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "Lclient!ph;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!ba", name = "Ab", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ba", name = "oc", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static volatile int anInt253 = 0;

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
	public static int anInt273 = 0;

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_99 = Static187.method3089("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()V")
	public static void method198() {
		@Pc(3) int local3 = Static195.anIntArray344[Static210.anInt4510];
		@Pc(7) Class74[] local7 = Static195.aClass74ArrayArray1[Static210.anInt4510];
		Static36.anInt1021 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class74 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2836 == 1) {
				local27 = local16.anInt2840 + Static62.anInt1472 - Static7.anInt157;
				if (local27 >= 0 && local27 <= Static62.anInt1472 + Static62.anInt1472) {
					local42 = local16.anInt2832 + Static62.anInt1472 - Static83.anInt1829;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2837 + Static62.anInt1472 - Static83.anInt1829;
					if (local53 > Static62.anInt1472 + Static62.anInt1472) {
						local53 = Static62.anInt1472 + Static62.anInt1472;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static188.aBooleanArrayArray32[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static59.anInt1427 - local16.anInt2825;
						if (local85 > 32) {
							local16.anInt2835 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2835 = 2;
							local85 = -local85;
						}
						local16.anInt2834 = (local16.anInt2838 - Static205.anInt4447 << 8) / local85;
						local16.anInt2826 = (local16.anInt2823 - Static205.anInt4447 << 8) / local85;
						local16.anInt2842 = (local16.anInt2839 - Static20.anInt538 << 8) / local85;
						local16.anInt2844 = (local16.anInt2824 - Static20.anInt538 << 8) / local85;
						Static48.aClass74Array1[Static36.anInt1021++] = local16;
					}
				}
			} else if (local16.anInt2836 == 2) {
				local27 = local16.anInt2832 + Static62.anInt1472 - Static83.anInt1829;
				if (local27 >= 0 && local27 <= Static62.anInt1472 + Static62.anInt1472) {
					local42 = local16.anInt2840 + Static62.anInt1472 - Static7.anInt157;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2828 + Static62.anInt1472 - Static7.anInt157;
					if (local53 > Static62.anInt1472 + Static62.anInt1472) {
						local53 = Static62.anInt1472 + Static62.anInt1472;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static188.aBooleanArrayArray32[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static205.anInt4447 - local16.anInt2838;
						if (local85 > 32) {
							local16.anInt2835 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2835 = 4;
							local85 = -local85;
						}
						local16.anInt2843 = (local16.anInt2825 - Static59.anInt1427 << 8) / local85;
						local16.anInt2827 = (local16.anInt2829 - Static59.anInt1427 << 8) / local85;
						local16.anInt2842 = (local16.anInt2839 - Static20.anInt538 << 8) / local85;
						local16.anInt2844 = (local16.anInt2824 - Static20.anInt538 << 8) / local85;
						Static48.aClass74Array1[Static36.anInt1021++] = local16;
					}
				}
			} else if (local16.anInt2836 == 4) {
				local27 = local16.anInt2839 - Static20.anInt538;
				if (local27 > 128) {
					local42 = local16.anInt2832 + Static62.anInt1472 - Static83.anInt1829;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2837 + Static62.anInt1472 - Static83.anInt1829;
					if (local53 > Static62.anInt1472 + Static62.anInt1472) {
						local53 = Static62.anInt1472 + Static62.anInt1472;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2840 + Static62.anInt1472 - Static7.anInt157;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2828 + Static62.anInt1472 - Static7.anInt157;
						if (local85 > Static62.anInt1472 + Static62.anInt1472) {
							local85 = Static62.anInt1472 + Static62.anInt1472;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static188.aBooleanArrayArray32[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2835 = 5;
							local16.anInt2843 = (local16.anInt2825 - Static59.anInt1427 << 8) / local27;
							local16.anInt2827 = (local16.anInt2829 - Static59.anInt1427 << 8) / local27;
							local16.anInt2834 = (local16.anInt2838 - Static205.anInt4447 << 8) / local27;
							local16.anInt2826 = (local16.anInt2823 - Static205.anInt4447 << 8) / local27;
							Static48.aClass74Array1[Static36.anInt1021++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method204() {
		Static191.aClass47_25.method1276();
	}
}
