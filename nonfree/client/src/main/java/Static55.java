import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lclient!bf;")
	public static Class11 aClass11_32;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	public static int anInt1442 = 0;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array11 = new Class5[1000];

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_15 = new Class9(10);

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Lclient!ae;")
	public static Class5 aClass5_723 = Static56.method972("@whi@ )4 ");

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
	public static void method946() {
		try {
			@Pc(6) Graphics local6 = Static62.aCanvas1.getGraphics();
			Static95.aClass2_20.method1322(local6, 0, 4);
			Static93.aClass2_18.method1322(local6, 0, 357);
			Static83.aClass2_15.method1322(local6, 722, 4);
			Static12.aClass2_1.method1322(local6, 743, 205);
			Static70.aClass2_14.method1322(local6, 0, 0);
			Static105.aClass2_23.method1322(local6, 516, 4);
			Static38.aClass2_8.method1322(local6, 516, 205);
			Static102.aClass2_21.method1322(local6, 496, 357);
			Static92.aClass2_17.method1322(local6, 0, 338);
		} catch (@Pc(62) Exception local62) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method947() {
		for (@Pc(6) Class3_Sub11 local6 = (Class3_Sub11) Static17.aClass51_3.method1316(); local6 != null; local6 = (Class3_Sub11) Static17.aClass51_3.method1310()) {
			if (local6.anInt2273 > 0) {
				local6.anInt2273--;
			}
			if (local6.anInt2273 != 0) {
				if (local6.anInt2287 > 0) {
					local6.anInt2287--;
				}
				if (local6.anInt2287 == 0 && local6.anInt2278 >= 1 && local6.anInt2285 >= 1 && local6.anInt2278 <= 102 && local6.anInt2285 <= 102 && (local6.anInt2276 < 0 || Static78.method1275(local6.anInt2274, local6.anInt2276))) {
					Static93.method1558(local6.anInt2279, local6.anInt2275, local6.anInt2282, local6.anInt2285, local6.anInt2276, local6.anInt2274, local6.anInt2278);
					local6.anInt2287 = -1;
					if (local6.anInt2276 == local6.anInt2281 && local6.anInt2281 == -1) {
						local6.method1966();
					} else if (local6.anInt2276 == local6.anInt2281 && local6.anInt2282 == local6.anInt2271 && local6.anInt2272 == local6.anInt2274) {
						local6.method1966();
					}
				}
			} else if (local6.anInt2281 < 0 || Static78.method1275(local6.anInt2272, local6.anInt2281)) {
				Static93.method1558(local6.anInt2279, local6.anInt2275, local6.anInt2271, local6.anInt2285, local6.anInt2281, local6.anInt2272, local6.anInt2278);
				local6.method1966();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ[BI)V")
	public static void method949(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (Static93.aClass25_1 == null) {
			return;
		}
		if (Static42.anInt1188 >= 0) {
			Static92.anInt2363 = arg3;
			if (Static42.anInt1188 == 0) {
				Static78.anInt1964 = 1;
			} else {
				@Pc(38) int local38 = Static68.method995(Static42.anInt1188);
				@Pc(42) int local42 = local38 - Static109.anInt2872;
				Static78.anInt1964 = (local42 + 3600) / arg3;
				if (Static78.anInt1964 < 1) {
					Static78.anInt1964 = 1;
				}
			}
			Static44.aByteArray8 = arg2;
			Static112.anInt2928 = arg0;
			Static52.aBoolean66 = arg1;
		} else if (Static78.anInt1964 == 0) {
			Static78.method1270(arg0, arg1, arg2);
		} else {
			Static52.aBoolean66 = arg1;
			Static44.aByteArray8 = arg2;
			Static112.anInt2928 = arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public static void method950(@OriginalArg(1) int arg0) {
		if (!Static18.method406(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub17[] local14 = Static31.aClass3_Sub1_Sub17ArrayArray3[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class3_Sub1_Sub17 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt2647 = 0;
				local27.anInt2588 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public static void method951() {
		@Pc(7) Class39 local7 = Static2.aClass39_1;
		synchronized (Static2.aClass39_1) {
			Static65.anInt2448 = Static36.anInt2764;
			@Pc(15) int local15;
			if (Static22.anInt705 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static14.aBooleanArray25[local15] = false;
				}
				Static22.anInt705 = Static76.anInt2556;
			} else {
				while (Static22.anInt705 != Static76.anInt2556) {
					local15 = Static75.anIntArray223[Static76.anInt2556];
					Static76.anInt2556 = Static76.anInt2556 + 1 & 0x7F;
					if (local15 >= 0) {
						Static14.aBooleanArray25[local15] = true;
					} else {
						Static14.aBooleanArray25[~local15] = false;
					}
				}
			}
			Static36.anInt2764 = Static68.anInt1563;
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public static void method953() {
		Static115.aClass2_27.method1318();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method954() {
		aClass5_723 = null;
		aClass5Array11 = null;
		aClass9_15 = null;
		aClass11_32 = null;
	}
}
