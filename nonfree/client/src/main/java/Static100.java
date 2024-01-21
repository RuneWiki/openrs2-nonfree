import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 aClass5_Sub2_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!bd;")
	public static Class10 aClass10_5;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array7;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!ef;")
	public static Class20 aClass20_10 = new Class20(4096);

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt2584 = 0;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_774 = Static129.method2060("AUS");

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!r;")
	public static Class61 aClass61_775 = Static129.method2060("Registrierter Benutzer");

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_776 = Static129.method2060("<col=40ff00>");

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
	public static int anInt2607 = 0;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
	public static int[] anIntArray328 = new int[25];

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_777 = Static129.method2060("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_778 = Static129.method2060("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_779 = Static129.method2060("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public static void method1677(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub15 local12 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray296.length; local17++) {
				local12.anIntArray296[local17] = -1;
				local12.anIntArray297[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ff;)V")
	public static void method1678(@OriginalArg(1) Class26 arg0) {
		Static60.aClass26_7 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1679() {
		aBooleanArray13 = null;
		aClass61_778 = null;
		aClass61_777 = null;
		aClass61_779 = null;
		aClass61_776 = null;
		aClass10_5 = null;
		aClass5_Sub2_Sub1_Sub4Array7 = null;
		aClass61_774 = null;
		aClass5_Sub2_Sub1_Sub1_Sub1_4 = null;
		aClass61_775 = null;
		aClass20_10 = null;
		anIntArray328 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method1680(@OriginalArg(1) Class5_Sub2_Sub2_Sub3 arg0) {
		arg0.aBoolean101 = false;
		@Pc(18) Class5_Sub2_Sub17 local18;
		if (arg0.anInt2916 != -1) {
			local18 = Static106.method1769(arg0.anInt2916);
			if (local18 == null || local18.anIntArray391 == null) {
				arg0.anInt2916 = -1;
			} else {
				arg0.anInt2931++;
				if (arg0.anInt2882 < local18.anIntArray391.length && arg0.anInt2931 > local18.anIntArray396[arg0.anInt2882]) {
					arg0.anInt2931 = 1;
					arg0.anInt2882++;
					Static29.method630(arg0.anInt2912, local18, arg0.anInt2882, arg0.anInt2875);
				}
				if (arg0.anInt2882 >= local18.anIntArray391.length) {
					arg0.anInt2882 = 0;
					arg0.anInt2931 = 0;
					Static29.method630(arg0.anInt2912, local18, arg0.anInt2882, arg0.anInt2875);
				}
			}
		}
		if (arg0.anInt2893 != -1 && arg0.anInt2902 <= Static58.anInt1422) {
			if (arg0.anInt2932 < 0) {
				arg0.anInt2932 = 0;
			}
			@Pc(123) int local123 = Static1.method2(arg0.anInt2893).anInt1213;
			if (local123 == -1) {
				arg0.anInt2893 = -1;
			} else {
				@Pc(130) Class5_Sub2_Sub17 local130 = Static106.method1769(local123);
				if (local130 == null || local130.anIntArray391 == null) {
					arg0.anInt2893 = -1;
				} else {
					arg0.anInt2896++;
					if (local130.anIntArray391.length > arg0.anInt2932 && local130.anIntArray396[arg0.anInt2932] < arg0.anInt2896) {
						arg0.anInt2932++;
						arg0.anInt2896 = 1;
						Static29.method630(arg0.anInt2912, local130, arg0.anInt2932, arg0.anInt2875);
					}
					if (local130.anIntArray391.length <= arg0.anInt2932 && (arg0.anInt2932 < 0 || arg0.anInt2932 >= local130.anIntArray391.length)) {
						arg0.anInt2893 = -1;
					}
				}
			}
		}
		if (arg0.anInt2903 != -1 && arg0.anInt2904 <= 1) {
			local18 = Static106.method1769(arg0.anInt2903);
			if (local18.anInt3232 == 1 && arg0.anInt2876 > 0 && arg0.anInt2911 <= Static58.anInt1422 && Static58.anInt1422 > arg0.anInt2905) {
				arg0.anInt2904 = 1;
				return;
			}
		}
		if (arg0.anInt2903 != -1 && arg0.anInt2904 == 0) {
			local18 = Static106.method1769(arg0.anInt2903);
			if (local18 == null || local18.anIntArray391 == null) {
				arg0.anInt2903 = -1;
			} else {
				arg0.anInt2926++;
				if (local18.anIntArray391.length > arg0.anInt2880 && arg0.anInt2926 > local18.anIntArray396[arg0.anInt2880]) {
					arg0.anInt2880++;
					arg0.anInt2926 = 1;
					Static29.method630(arg0.anInt2912, local18, arg0.anInt2880, arg0.anInt2875);
				}
				if (arg0.anInt2880 >= local18.anIntArray391.length) {
					arg0.anInt2880 -= local18.anInt3228;
					arg0.anInt2897++;
					if (local18.anInt3242 <= arg0.anInt2897) {
						arg0.anInt2903 = -1;
					} else if (arg0.anInt2880 >= 0 && local18.anIntArray391.length > arg0.anInt2880) {
						Static29.method630(arg0.anInt2912, local18, arg0.anInt2880, arg0.anInt2875);
					} else {
						arg0.anInt2903 = -1;
					}
				}
				arg0.aBoolean101 = local18.aBoolean117;
			}
		}
		if (arg0.anInt2904 > 0) {
			arg0.anInt2904--;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Z")
	public static boolean method1681() {
		@Pc(10) Class44 local10 = Static127.aClass44_1;
		synchronized (Static127.aClass44_1) {
			if (Static105.anInt3354 == Static96.anInt2501) {
				return false;
			} else {
				Static104.anInt2711 = Static58.anIntArray211[Static96.anInt2501];
				Static88.anInt3385 = Static40.anIntArray175[Static96.anInt2501];
				Static96.anInt2501 = Static96.anInt2501 + 1 & 0x7F;
				return true;
			}
		}
	}
}
