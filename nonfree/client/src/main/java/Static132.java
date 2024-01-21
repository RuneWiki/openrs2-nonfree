import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt2942;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	public static int anInt2949;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public static final int[] anIntArray239 = new int[128];

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_886 = Static81.method1507("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_887 = Static81.method1507("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!dj;")
	public static Class24 aClass24_888 = aClass24_887;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)I")
	public static int method2261(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBLclient!dj;)V")
	public static void method2262(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(19) int local19 = Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1261(arg1, 250);
		@Pc(30) int local30 = Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1255(arg1, 250) * 13;
		Static90.method3482(6, 6, local19 + 4 + 4, local30 + 4 + 4, 0);
		Static90.method3490(6, 6, local19 + 4 + 4, local30 + 4 + 4, 16777215);
		Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1248(arg1, 10, 10, local19, local30, 16777215, -1, 1, 1, 0);
		Static39.method726(local30 + 8, 6, 6, local19 + 4 + 4);
		if (!arg0) {
			Static110.method1906(local19, local30, 10, 10);
			return;
		}
		@Pc(106) Canvas local106 = Static8.aCanvas1;
		try {
			@Pc(109) Graphics local109 = local106.getGraphics();
			Static25.aClass7_1.method1186(local109);
		} catch (@Pc(117) Exception local117) {
			local106.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method2264() {
		if (!Static178.aBoolean185) {
			return;
		}
		@Pc(16) Class98 local16 = Static87.method1589(Static30.anInt777, Static38.anInt1025);
		if (local16 != null && local16.anObjectArray19 != null) {
			@Pc(25) Class1_Sub16 local25 = new Class1_Sub16();
			local25.aClass98_13 = local16;
			local25.anObjectArray1 = local16.anObjectArray19;
			Static131.method2258(local25);
		}
		Static178.aBoolean185 = false;
		Static199.method2199(local16);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2265(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static173.method2983(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local44 >= local41);
			return Static184.method3195(local44, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method2266() {
		Static36.aClass86_13.method2817();
		Static143.aClass46_6.method1587();
		Static111.aClass86_40.method2817();
	}
}
