import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
	public static int anInt5988;

	@OriginalMember(owner = "client!ada", name = "B", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!ada", name = "E", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "Lclient!em;")
	public static final Class83 aClass83_123 = new Class83(96, 4);

	@OriginalMember(owner = "client!ada", name = "z", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[1000][];

	@OriginalMember(owner = "client!ada", name = "A", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_72 = new Class208(42, -1);

	@OriginalMember(owner = "client!ada", name = "D", descriptor = "[I")
	public static final int[] anIntArray356 = new int[8];

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)V")
	public static void method4849() {
		if (Static180.aFrame5 != null) {
			return;
		}
		@Pc(15) int local15 = Static273.anInt1189;
		@Pc(17) int local17 = Static465.anInt8056;
		@Pc(24) int local24 = anInt5988 - Static349.anInt6422 - local15;
		@Pc(31) int local31 = Static65.anInt1195 - local17 - Static594.anInt9806;
		if (local15 <= 0 && local24 <= 0 && local17 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static73.aFrame1 != null) {
				local43 = Static73.aFrame1;
			} else if (Static433.anApplet2 == null) {
				local43 = Static149.anApplet_Sub1_1;
			} else {
				local43 = Static433.anApplet2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static73.aFrame1 == local43) {
				@Pc(63) Insets local63 = Static73.aFrame1.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local43.getGraphics();
			local72.setColor(Color.black);
			if (local15 > 0) {
				local72.fillRect(local55, local57, local15, Static65.anInt1195);
			}
			if (local17 > 0) {
				local72.fillRect(local55, local57, anInt5988, local17);
			}
			if (local24 > 0) {
				local72.fillRect(local55 + anInt5988 - local24, local57, local24, Static65.anInt1195);
			}
			if (local31 > 0) {
				local72.fillRect(local55, local57 + Static65.anInt1195 - local31, anInt5988, local31);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V")
	public static void method4850() {
		@Pc(9) int[] local9 = new int[Static230.aClass225_1.anInt6004];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static230.aClass225_1.anInt6004; local13++) {
			@Pc(20) Class222 local20 = Static230.aClass225_1.method4857(local13);
			if (local20.anInt5923 >= 0 || local20.anInt5926 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static414.anIntArray465 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static414.anIntArray465[local52] = local9[local52];
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII)V")
	public static void method4851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class358[] local7 = Static243.aClass358Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class358 local15 = local7[local9];
			if (local15 != null && local15.anInt9530 == 2) {
				Static504.method7067(local15.anInt9532, local15.anInt9539, local15.anInt9531 * 2, local15.anInt9534, arg1 >> 1, arg3 >> 1);
				if (Static70.anIntArray59[0] > -1 && Static518.anInt9331 % 20 < 10) {
					Static99.aClass5Array6[local15.anInt9538].method7795(Static70.anIntArray59[0] + arg2 - 12, arg0 + -28 + Static70.anIntArray59[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB[BI)Ljava/lang/String;")
	public static String method4852(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(28) int local28 = arg1[arg2 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(45) char local45 = Static309.aCharArray7[local28 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local28 = local45;
				}
				local13[local15++] = (char) local28;
			}
		}
		return new String(local13, 0, local15);
	}
}
