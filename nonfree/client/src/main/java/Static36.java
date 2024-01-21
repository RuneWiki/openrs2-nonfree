import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_15;

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
	public static int anInt1055;

	@OriginalMember(owner = "client!ge", name = "yb", descriptor = "Lclient!jd;")
	public static Class11 aClass11_48;

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lclient!v;")
	public static Class5_Sub7_Sub4 aClass5_Sub7_Sub4_2;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_488 = Static63.method1251("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[104][104];

	@OriginalMember(owner = "client!ge", name = "vb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_489 = Static63.method1251(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!ge", name = "zb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_490 = Static63.method1251("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ge", name = "Bb", descriptor = "I")
	public static int anInt1058 = 0;

	@OriginalMember(owner = "client!ge", name = "Gb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_491 = aClass45_488;

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_492 = Static63.method1251("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
	public static int anInt1063 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)I")
	public static int method765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class5_Sub6 local17 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg0);
		if (local17 == null) {
			return -1;
		} else if (arg1 >= 0 && local17.anIntArray149.length > arg1) {
			return local17.anIntArray149[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)Z")
	public static boolean method768(@OriginalArg(1) int arg0) {
		if (Static53.aBooleanArray21[arg0]) {
			return true;
		} else if (Static57.aClass29_40.method760(arg0)) {
			@Pc(21) int local21 = Static57.aClass29_40.method737(arg0);
			if (local21 == 0) {
				Static53.aBooleanArray21[arg0] = true;
				return true;
			}
			if (Static19.aClass5_Sub2_Sub8ArrayArray1[arg0] == null) {
				Static19.aClass5_Sub2_Sub8ArrayArray1[arg0] = new Class5_Sub2_Sub8[local21];
			}
			for (@Pc(43) int local43 = 0; local43 < local21; local43++) {
				if (Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local43] == null) {
					@Pc(64) byte[] local64 = Static57.aClass29_40.method733(local43, arg0);
					if (local64 != null) {
						Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local43] = new Class5_Sub2_Sub8();
						Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local43].anInt1262 = local43 + (arg0 << 16);
						if (local64[0] == -1) {
							Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local43].method947(new Class5_Sub9(local64));
						} else {
							Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local43].method945(new Class5_Sub9(local64));
						}
					}
				}
			}
			Static53.aBooleanArray21[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)Lclient!mb;")
	public static Class45 method770() {
		@Pc(7) Class45 local7 = new Class45();
		local7.anInt1925 = 0;
		local7.aByteArray27 = new byte[100];
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
	public static void method774() {
		aClass45_491 = null;
		anIntArrayArray14 = null;
		aClass45_489 = null;
		aClass29_Sub1_15 = null;
		aClass45_492 = null;
		aClass11_48 = null;
		aClass45_488 = null;
		aClass5_Sub7_Sub4_2 = null;
		aClass45_490 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
	public static void method776() {
		if (Static14.anInt426 < 2 && Static16.anInt502 == 0 && !Static13.aBoolean12) {
			return;
		}
		@Pc(52) Class45 local52;
		if (Static16.anInt502 == 1 && Static14.anInt426 < 2) {
			local52 = Static39.method1443(new Class45[] { Static117.aClass45_1345, Static74.aClass45_1047, Static12.aClass45_1357, Static39.aClass45_885 });
		} else if (Static13.aBoolean12 && Static14.anInt426 < 2) {
			local52 = Static39.method1443(new Class45[] { Static31.aClass45_445, Static74.aClass45_1047, Static3.aClass45_32, Static39.aClass45_885 });
		} else {
			local52 = Static35.aClass45Array10[Static14.anInt426 - 1];
		}
		if (Static14.anInt426 > 2) {
			local52 = Static39.method1443(new Class45[] { local52, Static90.aClass45_1059, Static76.method1476(Static14.anInt426 - 2), Static17.aClass45_257 });
		}
		Static8.aClass5_Sub2_Sub6_Sub1_1.method515(local52, 4, 16777215, Static3.anInt94 / 1000);
	}
}
