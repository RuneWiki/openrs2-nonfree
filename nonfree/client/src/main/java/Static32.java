import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!pe;")
	public static Class5_Sub18 aClass5_Sub18_1;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
	public static int anInt958;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_290 = Static129.method2060("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
	public static int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public static int anInt954 = 0;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_291 = Static129.method2060("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_292 = Static129.method2060("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method645() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method646() {
		while (true) {
			@Pc(9) Class58 local9 = Static55.aClass58_30;
			@Pc(16) Class5_Sub9 local16;
			synchronized (Static55.aClass58_30) {
				local16 = (Class5_Sub9) Static133.aClass58_76.method1670();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass26_Sub1_5.method1051(local16.aClass40_1, local16.aByteArray18, (int) local16.aLong100, false);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public static void method648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class58 local15 = Static77.aClass58ArrayArrayArray1[Static93.anInt2428][arg1][arg0];
		if (local15 == null) {
			Static61.aClass81_1.method2107(Static93.anInt2428, arg1, arg0);
			return;
		}
		@Pc(25) Class5_Sub2_Sub2_Sub4 local25 = null;
		@Pc(27) int local27 = -99999999;
		@Pc(32) Class5_Sub2_Sub2_Sub4 local32;
		for (local32 = (Class5_Sub2_Sub2_Sub4) local15.method1669(); local32 != null; local32 = (Class5_Sub2_Sub2_Sub4) local15.method1664()) {
			@Pc(40) Class5_Sub2_Sub11 local40 = Static111.method1830(local32.anInt1911);
			@Pc(43) int local43 = local40.anInt1953;
			if (local40.anInt1940 == 1) {
				local43 *= local32.anInt1902 + 1;
			}
			if (local43 > local27) {
				local27 = local43;
				local25 = local32;
			}
		}
		if (local25 == null) {
			Static61.aClass81_1.method2107(Static93.anInt2428, arg1, arg0);
			return;
		}
		local15.method1674(local25);
		@Pc(84) Class5_Sub2_Sub2_Sub4 local84 = null;
		@Pc(86) Class5_Sub2_Sub2_Sub4 local86 = null;
		local32 = (Class5_Sub2_Sub2_Sub4) local15.method1669();
		@Pc(101) int local101 = (arg0 << 7) + (arg1 + 1610612736);
		while (local32 != null) {
			if (local32.anInt1911 != local25.anInt1911) {
				if (local86 == null) {
					local86 = local32;
				}
				if (local86.anInt1911 != local32.anInt1911 && local84 == null) {
					local84 = local32;
				}
			}
			local32 = (Class5_Sub2_Sub2_Sub4) local15.method1664();
		}
		Static61.aClass81_1.method2075(Static93.anInt2428, arg1, arg0, Static42.method757(Static93.anInt2428, arg1 * 128 + 64, arg0 * 128 + 64), local25, local101, local86, local84);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method650() {
		anIntArray153 = null;
		aClass5_Sub2_Sub1_Sub4_3 = null;
		aClass61_290 = null;
		aClass61_291 = null;
		aClass61_292 = null;
		anIntArray152 = null;
		anIntArray154 = null;
		anIntArray155 = null;
		aClass5_Sub18_1 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!r;ZB)V")
	public static void method651(@OriginalArg(0) Class61 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1.method552(arg0, 250);
		@Pc(27) int local27 = Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1.method567(arg0, 250) * 13;
		Static46.method2001(6, 6, local15 + 8, local27 + 8, 0);
		Static46.method2006(6, 6, local15 + 4 + 4, local27 + 8, 16777215);
		Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1.method561(arg0, 10, 10, local15, local27, 16777215, -1, 1, 1, 0);
		Static103.method1744(6, local15 + 8, local27 + 4 + 4, 6);
		if (!arg1) {
			Static53.method979(10, local27, 10, local15);
			return;
		}
		try {
			@Pc(117) Graphics local117 = Static4.aCanvas2.getGraphics();
			Static11.aClass36_1.method1765(local117);
		} catch (@Pc(127) Exception local127) {
			Static4.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method652() {
		Static1.aClass29_1.method765();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!ea;I)V")
	public static void method654(@OriginalArg(1) Class5_Sub2_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2911 > Static58.anInt1422) {
			Static90.method1581(arg0);
		} else if (Static58.anInt1422 <= arg0.anInt2905) {
			Static112.method1864(arg0);
		} else {
			Static9.method184(arg0);
		}
		if (arg0.anInt2912 < 128 || arg0.anInt2875 < 128 || arg0.anInt2912 >= 13184 || arg0.anInt2875 >= 13184) {
			arg0.anInt2905 = 0;
			arg0.anInt2903 = -1;
			arg0.anInt2912 = arg0.anInt2892 * 64 + arg0.anIntArray346[0] * 128;
			arg0.anInt2911 = 0;
			arg0.anInt2893 = -1;
			arg0.anInt2875 = arg0.anInt2892 * 64 + arg0.anIntArray350[0] * 128;
			arg0.method1862();
		}
		if (arg0 == Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10 && (arg0.anInt2912 < 1536 || arg0.anInt2875 < 1536 || arg0.anInt2912 >= 11776 || arg0.anInt2875 >= 11776)) {
			arg0.anInt2893 = -1;
			arg0.anInt2905 = 0;
			arg0.anInt2875 = arg0.anInt2892 * 64 + arg0.anIntArray350[0] * 128;
			arg0.anInt2903 = -1;
			arg0.anInt2911 = 0;
			arg0.anInt2912 = arg0.anInt2892 * 64 + arg0.anIntArray346[0] * 128;
			arg0.method1862();
		}
		Static41.method1515(arg0);
		Static100.method1680(arg0);
	}
}
