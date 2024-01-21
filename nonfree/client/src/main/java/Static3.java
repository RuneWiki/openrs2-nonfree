import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!ke;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!sa;")
	public static Class74 aClass74_1 = new Class74(32);

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_21 = Static146.method2172("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_22 = Static146.method2172("<col=00ff80>");

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!sg;")
	private static Class77 aClass77_23 = Static146.method2172("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_24 = aClass77_23;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 / arg2;
		@Pc(12) int local12 = arg0 / arg2;
		@Pc(22) int local22 = arg2 - 1 & arg1;
		@Pc(28) int local28 = arg0 & arg2 - 1;
		@Pc(33) int local33 = Static81.method1498(local12, local3);
		@Pc(40) int local40 = Static81.method1498(local12, local3 + 1);
		@Pc(47) int local47 = Static81.method1498(local12 + 1, local3);
		@Pc(56) int local56 = Static81.method1498(local12 + 1, local3 + 1);
		@Pc(63) int local63 = Static30.method609(local22, local40, arg2, local33);
		@Pc(70) int local70 = Static30.method609(local22, local56, arg2, local47);
		return Static30.method609(local28, local70, arg2, local63);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method64(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static84.aClass30_2);
		arg0.addMouseMotionListener(Static84.aClass30_2);
		arg0.addFocusListener(Static84.aClass30_2);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)I")
	public static int method65(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 >> 31 & arg0 - 1;
		return local19 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method66() {
		Static54.anInt1469 = -1;
		Static79.anInt2063 = -1;
		Static75.anInt1978 = -1;
		Static18.anInt618 = 0;
		Static68.anInt1871 = -1;
		Static25.anInt731 = 0;
		Static42.anInt1177 = 0;
		Static84.anInt3146 = 0;
		Static124.aClass2_Sub18_Sub1_3.anInt3423 = 0;
		Static136.anInt3295 = 0;
		Static92.anInt2387 = 0;
		Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
		Static166.aBoolean181 = false;
		for (@Pc(35) int local35 = 0; local35 < Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1.length; local35++) {
			if (Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local35] != null) {
				Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local35].anInt4402 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1.length; local57++) {
			if (Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local57] != null) {
				Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local57].anInt4402 = -1;
			}
		}
		Static125.method2161();
		Static123.method2155(30);
		for (@Pc(91) int local91 = 0; local91 < 100; local91++) {
			Static103.aBooleanArray9[local91] = true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method67() {
		for (@Pc(18) Class2_Sub16 local18 = (Class2_Sub16) Static51.aClass10_37.method444(); local18 != null; local18 = (Class2_Sub16) Static51.aClass10_37.method451()) {
			if (local18.anInt2381 > 0) {
				local18.anInt2381--;
			}
			if (local18.anInt2381 != 0) {
				if (local18.anInt2384 > 0) {
					local18.anInt2384--;
				}
				if (local18.anInt2384 == 0 && local18.anInt2376 >= 1 && local18.anInt2386 >= 1 && local18.anInt2376 <= 102 && local18.anInt2386 <= 102 && (local18.anInt2390 < 0 || Static131.method2905(local18.anInt2382, local18.anInt2390))) {
					Static54.method1029(local18.anInt2376, local18.anInt2392, local18.anInt2380, local18.anInt2390, local18.anInt2385, local18.anInt2382, local18.anInt2386);
					local18.anInt2384 = -1;
					if (local18.anInt2389 == local18.anInt2390 && local18.anInt2389 == -1) {
						local18.method3004();
					} else if (local18.anInt2390 == local18.anInt2389 && local18.anInt2391 == local18.anInt2380 && local18.anInt2382 == local18.anInt2378) {
						local18.method3004();
					}
				}
			} else if (local18.anInt2389 < 0 || Static131.method2905(local18.anInt2378, local18.anInt2389)) {
				Static54.method1029(local18.anInt2376, local18.anInt2392, local18.anInt2391, local18.anInt2389, local18.anInt2385, local18.anInt2378, local18.anInt2386);
				local18.method3004();
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ke;Lclient!ke;I)I")
	public static int method70(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method2214(Static125.aClass77_1119, Static39.aClass77_451)) {
			local1++;
		}
		if (arg0.method2214(Static51.aClass77_544, Static39.aClass77_451)) {
			local1++;
		}
		if (arg0.method2214(Static56.aClass77_598, Static39.aClass77_451)) {
			local1++;
		}
		if (arg0.method2214(Static96.aClass77_943, Static39.aClass77_451)) {
			local1++;
		}
		if (arg0.method2214(Static130.aClass77_1157, Static39.aClass77_451)) {
			local1++;
		}
		if (arg0.method2214(Static76.aClass77_800, Static39.aClass77_451)) {
			local1++;
		}
		arg0.method2214(Static123.aClass77_1113, Static39.aClass77_451);
		arg0.method2214(Static13.aClass77_187, Static39.aClass77_451);
		arg0.method2214(Static25.aClass77_311, Static39.aClass77_451);
		arg0.method2214(Static176.aClass77_1527, Static39.aClass77_451);
		arg0.method2214(Static7.aClass77_119, Static39.aClass77_451);
		return local1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method71() {
		aClass77_22 = null;
		aClass43_1 = null;
		aClass77_24 = null;
		aClass77_21 = null;
		aClass74_1 = null;
		aClass77_23 = null;
	}
}
