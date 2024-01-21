import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!le", name = "Cb", descriptor = "I")
	public static int anInt2918;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Lclient!rf;")
	public static Class70 aClass70_941 = Static49.method1293("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!le", name = "E", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_942 = Static49.method1293("<br>");

	@OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!le", name = "kb", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array15 = new Class70[100];

	@OriginalMember(owner = "client!le", name = "pb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_943 = Static49.method1293("rot:");

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public static void method2151(@OriginalArg(1) int arg0) {
		Static146.method2862();
		Static129.method3394();
		@Pc(22) int local22 = Static86.method1914(arg0).anInt2122;
		if (local22 == 0) {
			return;
		}
		@Pc(32) int local32 = Static133.anIntArray330[arg0];
		if (local22 == 1) {
			Static110.anInt3093 = local32;
			if (Static110.anInt3093 == 1) {
				Static1.method104(0.9F);
			}
			if (Static110.anInt3093 == 2) {
				Static1.method104(0.8F);
			}
			if (Static110.anInt3093 == 3) {
				Static1.method104(0.7F);
			}
			if (Static110.anInt3093 == 4) {
				Static1.method104(0.6F);
			}
			Static182.method3487();
		}
		if (local22 == 3) {
			@Pc(68) short local68 = 0;
			if (local32 == 0) {
				local68 = 255;
			}
			if (local32 == 1) {
				local68 = 192;
			}
			if (local32 == 2) {
				local68 = 128;
			}
			if (local32 == 3) {
				local68 = 64;
			}
			if (local32 == 4) {
				local68 = 0;
			}
			if (Static134.anInt3479 != local68) {
				if (Static134.anInt3479 == 0 && Static96.anInt2801 != -1) {
					Static34.method876(local68, Static124.aClass76_Sub1_12, 0, Static96.anInt2801);
					Static100.aBoolean115 = false;
				} else if (local68 == 0) {
					Static44.method1102();
					Static100.aBoolean115 = false;
				} else {
					Static61.method1468(local68);
				}
				Static134.anInt3479 = local68;
			}
		}
		if (local22 == 6) {
			Static44.anInt1470 = local32;
		}
		if (local22 == 10) {
			if (local32 == 0) {
				Static140.anInt3678 = 127;
			}
			if (local32 == 1) {
				Static140.anInt3678 = 96;
			}
			if (local32 == 2) {
				Static140.anInt3678 = 64;
			}
			if (local32 == 3) {
				Static140.anInt3678 = 32;
			}
			if (local32 == 4) {
				Static140.anInt3678 = 0;
			}
		}
		if (local22 == 4) {
			if (local32 == 0) {
				Static174.anInt4470 = 127;
			}
			if (local32 == 1) {
				Static174.anInt4470 = 96;
			}
			if (local32 == 2) {
				Static174.anInt4470 = 64;
			}
			if (local32 == 3) {
				Static174.anInt4470 = 32;
			}
			if (local32 == 4) {
				Static174.anInt4470 = 0;
			}
		}
		if (local22 == 5) {
			Static154.anInt4063 = local32;
		}
		if (local22 == 9) {
			Static139.anInt3675 = local32;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public static void method2158() {
		aClass70_941 = null;
		aClass70_943 = null;
		aClass70Array15 = null;
		aClass70_942 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BJ)V")
	public static void method2167(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
