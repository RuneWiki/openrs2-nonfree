import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array2;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 aClass4_Sub4_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public static int anInt846;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
	public static int anInt849;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	public static int anInt850;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 aClass4_Sub4_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!qc;")
	private static Class60 aClass60_346 = Static121.method2047("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_340 = aClass60_346;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_341 = Static121.method2047(": ");

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_342 = Static121.method2047("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_343 = Static121.method2047("gelb:");

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!qc;")
	private static Class60 aClass60_348 = Static121.method2047("Loaded textures");

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_344 = aClass60_348;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	public static int anInt847 = 0;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_345 = Static121.method2047("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_347 = Static121.method2047("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public static boolean method594(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method595() {
		aClass4_Sub4_Sub3_Sub1Array2 = null;
		aClass60_346 = null;
		aClass60_341 = null;
		aClass60_344 = null;
		aClass60_348 = null;
		aFontMetrics1 = null;
		aClass4_Sub4_Sub3_Sub1_2 = null;
		aClass4_Sub4_Sub3_Sub2_2 = null;
		aClass60_340 = null;
		aClass60_343 = null;
		aClass60_345 = null;
		aClass60_342 = null;
		aClass60_347 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method596() {
		Static38.aClass8_1.method2117();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static122.aLongArray14[local6] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static115.aLongArray11[local22] = 0L;
		}
		Static101.anInt2466 = 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IJ)V")
	public static void method597(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!wa;)V")
	public static void method598(@OriginalArg(1) Class4_Sub4_Sub1_Sub2 arg0) {
		arg0.aBoolean112 = false;
		@Pc(18) Class4_Sub4_Sub14 local18;
		if (arg0.anInt2632 != -1) {
			local18 = Static127.method2102(arg0.anInt2632);
			if (local18 == null || local18.anIntArray295 == null) {
				arg0.anInt2632 = -1;
			} else {
				arg0.anInt2624++;
				if (arg0.anInt2629 < local18.anIntArray295.length && arg0.anInt2624 > local18.anIntArray294[arg0.anInt2629]) {
					arg0.anInt2629++;
					arg0.anInt2624 = 1;
					Static61.method1121(local18, arg0.anInt2620, arg0.anInt2601, arg0.anInt2629);
				}
				if (arg0.anInt2629 >= local18.anIntArray295.length) {
					arg0.anInt2624 = 0;
					arg0.anInt2629 = 0;
					Static61.method1121(local18, arg0.anInt2620, arg0.anInt2601, arg0.anInt2629);
				}
			}
		}
		if (arg0.anInt2630 != -1 && arg0.anInt2610 <= Static81.anInt1944) {
			if (arg0.anInt2617 < 0) {
				arg0.anInt2617 = 0;
			}
			@Pc(119) int local119 = Static92.method1610(arg0.anInt2630).anInt1231;
			if (local119 == -1) {
				arg0.anInt2630 = -1;
			} else {
				@Pc(126) Class4_Sub4_Sub14 local126 = Static127.method2102(local119);
				if (local126 == null || local126.anIntArray295 == null) {
					arg0.anInt2630 = -1;
				} else {
					arg0.anInt2608++;
					if (arg0.anInt2617 < local126.anIntArray295.length && arg0.anInt2608 > local126.anIntArray294[arg0.anInt2617]) {
						arg0.anInt2608 = 1;
						arg0.anInt2617++;
						Static61.method1121(local126, arg0.anInt2620, arg0.anInt2601, arg0.anInt2617);
					}
					if (local126.anIntArray295.length <= arg0.anInt2617 && (arg0.anInt2617 < 0 || local126.anIntArray295.length <= arg0.anInt2617)) {
						arg0.anInt2630 = -1;
					}
				}
			}
		}
		if (arg0.anInt2633 != -1 && arg0.anInt2645 <= 1) {
			local18 = Static127.method2102(arg0.anInt2633);
			if (local18.anInt2709 == 1 && arg0.anInt2599 > 0 && arg0.anInt2597 <= Static81.anInt1944 && arg0.anInt2618 < Static81.anInt1944) {
				arg0.anInt2645 = 1;
				return;
			}
		}
		if (arg0.anInt2633 != -1 && arg0.anInt2645 == 0) {
			local18 = Static127.method2102(arg0.anInt2633);
			if (local18 == null || local18.anIntArray295 == null) {
				arg0.anInt2633 = -1;
			} else {
				arg0.anInt2639++;
				if (arg0.anInt2595 < local18.anIntArray295.length && local18.anIntArray294[arg0.anInt2595] < arg0.anInt2639) {
					arg0.anInt2639 = 1;
					arg0.anInt2595++;
					Static61.method1121(local18, arg0.anInt2620, arg0.anInt2601, arg0.anInt2595);
				}
				if (arg0.anInt2595 >= local18.anIntArray295.length) {
					arg0.anInt2626++;
					arg0.anInt2595 -= local18.anInt2710;
					if (arg0.anInt2626 >= local18.anInt2716) {
						arg0.anInt2633 = -1;
					} else if (arg0.anInt2595 >= 0 && arg0.anInt2595 < local18.anIntArray295.length) {
						Static61.method1121(local18, arg0.anInt2620, arg0.anInt2601, arg0.anInt2595);
					} else {
						arg0.anInt2633 = -1;
					}
				}
				arg0.aBoolean112 = local18.aBoolean116;
			}
		}
		if (arg0.anInt2645 > 0) {
			arg0.anInt2645--;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method599() {
		Static59.aClass4_Sub2_Sub2_2.method553();
		Static30.anInt836 = 1;
		Static82.aClass40_59 = null;
	}
}
