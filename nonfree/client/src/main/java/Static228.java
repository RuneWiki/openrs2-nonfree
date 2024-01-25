import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!om", name = "m", descriptor = "[I")
	public static int[] anIntArray570;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public static void method4134() {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			Static313.aBooleanArray30[local13] = true;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method4135(@OriginalArg(1) Class165 arg0) {
		Static195.anInt3974 = arg0.method4502("p11_full");
		Static186.anInt3864 = arg0.method4502("p12_full");
		Static135.anInt2701 = arg0.method4502("b12_full");
		Static174.anInt3617 = arg0.method4502("hitmarks");
		Static210.anInt4173 = arg0.method4502("hitbar_default");
		Static29.anInt758 = arg0.method4502("timerbar_default");
		Static334.anInt6369 = arg0.method4502("headicons_pk");
		Static47.anInt1080 = arg0.method4502("headicons_prayer");
		Static61.anInt1328 = arg0.method4502("hint_headicons");
		Static268.anInt5165 = arg0.method4502("hint_mapmarkers");
		Static332.anInt6363 = arg0.method4502("mapflag");
		Static24.anInt672 = arg0.method4502("cross");
		Static223.anInt4417 = arg0.method4502("mapdots");
		Static282.anInt5483 = arg0.method4502("scrollbar");
		Static127.anInt2488 = arg0.method4502("name_icons");
		Static209.anInt4161 = arg0.method4502("floorshadows");
		Static117.anInt2324 = arg0.method4502("compass");
		Static35.anInt878 = arg0.method4502("hint_mapedge");
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIB)V")
	public static void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static180.anInt3754 == 1) {
			Static227.aClass90Array11[Static286.anInt5554 / 100].method5454(Static121.anInt2356 - 8, Static131.anInt2568 + -8);
		}
		if (Static180.anInt3754 == 2) {
			Static227.aClass90Array11[Static286.anInt5554 / 100 + 4].method5454(Static121.anInt2356 - 8, Static131.anInt2568 + -8);
		}
		Static252.method4471();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)I")
	public static int method4138(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
