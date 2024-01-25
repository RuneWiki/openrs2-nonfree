import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "n", descriptor = "J")
	public static long aLong14;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
	public static final int[] anIntArray33 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public static void method314() {
		if (!Static186.method3618()) {
			return;
		}
		if (Static204.aStringArray29 == null) {
			Static181.method3545();
		}
		Static152.anIntArray351 = new int[100];
		Static89.aBooleanArray6 = new boolean[100];
		Static149.aBoolean224 = true;
		Static79.anIntArray426 = new int[100];
		Static177.anIntArray430 = new int[100];
		Static29.anInt762 = 0;
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			Static177.anIntArray430[local28] = (int) ((double) Static11.anInt5389 * Math.random());
			Static79.anIntArray426[local28] = (int) (Math.random() * 350.0D);
			Static152.anIntArray351[local28] = (int) (Math.random() * 102.0D);
			Static89.aBooleanArray6[local28] = Math.random() < 0.5D;
		}
		try {
			Static43.aClipboard3 = Static242.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(72) Exception local72) {
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V")
	public static void method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static115.anInt2304 == 0 || arg2 == 0 || Static46.anInt1004 >= 50 || arg1 == -1) {
			return;
		}
		Static252.anIntArray630[Static46.anInt1004] = arg1;
		Static23.anIntArray78[Static46.anInt1004] = arg2;
		Static148.anIntArray636[Static46.anInt1004] = arg3;
		Static103.aClass81Array1[Static46.anInt1004] = null;
		Static134.anIntArray313[Static46.anInt1004] = 0;
		Static131.anIntArray308[Static46.anInt1004] = arg0;
		Static46.anInt1004++;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method316(@OriginalArg(1) int arg0) {
		Static202.anInt4094 = -1;
		Static215.anInt4248 = -1;
		Static90.anInt1760 = arg0;
		Static346.method5645();
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V")
	public static void method318() {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static51.aClass195_44.method5029(); local10 != null; local10 = (Class1_Sub21) Static51.aClass195_44.method5021()) {
			if (local10.anInt3645 == -1) {
				local10.anInt3638 = 0;
				Static294.method5053(local10);
			} else {
				local10.method5710();
			}
		}
	}
}
