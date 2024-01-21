import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_22;

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1491 = Static15.method178("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1492 = Static15.method178("backhmid2");

	@OriginalMember(owner = "client!uc", name = "bb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1493 = Static15.method178("Untersuchen");

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1494 = Static15.method178("scrollbar");

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!uc", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1495 = Static15.method178("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray60 = new int[5][5000];

	@OriginalMember(owner = "client!uc", name = "sb", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!uc", name = "tb", descriptor = "I")
	public static int anInt2625 = 2;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] method1704() {
		@Pc(10) Class1_Sub1_Sub6_Sub1[] local10 = new Class1_Sub1_Sub6_Sub1[Static25.anInt766];
		for (@Pc(12) int local12 = 0; local12 < Static25.anInt766; local12++) {
			@Pc(21) Class1_Sub1_Sub6_Sub1 local21 = local10[local12] = new Class1_Sub1_Sub6_Sub1();
			local21.anInt1333 = Static79.anInt2132;
			local21.anInt1331 = Static13.anInt236;
			local21.anInt1329 = anIntArray355[local12];
			local21.anInt1332 = Static100.anIntArray348[local12];
			local21.anInt1334 = Static113.anIntArray410[local12];
			local21.anInt1330 = Static26.anIntArray119[local12];
			@Pc(53) int local53 = local21.anInt1334 * local21.anInt1330;
			@Pc(57) byte[] local57 = Static105.aByteArrayArray7[local12];
			local21.anIntArray155 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray155[local63] = Static80.anIntArray268[local57[local63] & 0xFF];
			}
		}
		Static90.method1538();
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
	public static void method1707() {
		anIntArrayArray60 = null;
		aClass23_1494 = null;
		aClass23_1491 = null;
		aClass1_Sub1_Sub6_Sub3_22 = null;
		aClass23_1493 = null;
		anIntArray355 = null;
		aClass23_1492 = null;
		aClass23_1495 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)I")
	public static int method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[Lclient!gd;)[Lclient!gd;")
	public static Class23[] method1710(@OriginalArg(1) Class23[] arg0) {
		@Pc(6) Class23[] local6 = new Class23[5];
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			local6[local13] = Static17.method233(new Class23[] { Static19.method274(local13), Static7.aClass23_143 });
			if (arg0 != null && arg0[local13] != null) {
				local6[local13] = Static17.method233(new Class23[] { local6[local13], arg0[local13] });
			}
		}
		return local6;
	}
}
