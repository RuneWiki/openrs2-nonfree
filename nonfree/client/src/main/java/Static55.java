import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!q;")
	public static Class62 aClass62_16;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!jb;")
	public static Class33 aClass33_19 = new Class33(64);

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public static int anInt1502 = 0;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_734 = Static108.method1915("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_735 = Static108.method1915("Handel akzeptieren");

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array15 = new Class39[1000];

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
	public static int[] anIntArray213 = new int[5];

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_736 = Static108.method1915("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!q;Lclient!q;ILclient!q;)V")
	public static void method997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		Static67.aClass62_20 = arg2;
		Static28.aClass62_30 = arg0;
		Static73.aClass62_22 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!mf;)V")
	public static void method998(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anInt2478 == 0) {
			return;
		}
		@Pc(49) int local49;
		@Pc(42) int local42;
		if (arg0.anInt2510 != -1 && arg0.anInt2510 < 32768) {
			@Pc(33) Class1_Sub1_Sub2_Sub1_Sub1 local33 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt2510];
			if (local33 != null) {
				local42 = arg0.anInt2508 - local33.anInt2508;
				local49 = arg0.anInt2521 - local33.anInt2521;
				if (local49 != 0 || local42 != 0) {
					arg0.anInt2533 = (int) (Math.atan2((double) local49, (double) local42) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(79) int local79;
		if (arg0.anInt2510 >= 32768) {
			local79 = arg0.anInt2510 - 32768;
			if (local79 == Static69.anInt1770) {
				local79 = 2047;
			}
			@Pc(88) Class1_Sub1_Sub2_Sub1_Sub2 local88 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local79];
			if (local88 != null) {
				local42 = arg0.anInt2521 - local88.anInt2521;
				@Pc(103) int local103 = arg0.anInt2508 - local88.anInt2508;
				if (local42 != 0 || local103 != 0) {
					arg0.anInt2533 = (int) (Math.atan2((double) local42, (double) local103) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2530 != 0 || arg0.anInt2479 != 0) && (arg0.anInt2527 == 0 || arg0.anInt2489 > 0)) {
			local79 = arg0.anInt2521 - (arg0.anInt2530 - Static71.anInt1795 - Static71.anInt1795) * 64;
			local49 = arg0.anInt2508 - (arg0.anInt2479 - Static103.anInt2610 - Static103.anInt2610) * 64;
			if (local79 != 0 || local49 != 0) {
				arg0.anInt2533 = (int) (Math.atan2((double) local79, (double) local49) * 325.949D) & 0x7FF;
			}
			arg0.anInt2530 = 0;
			arg0.anInt2479 = 0;
		}
		local79 = arg0.anInt2533 - arg0.anInt2509 & 0x7FF;
		if (local79 == 0) {
			arg0.anInt2507 = 0;
			return;
		}
		arg0.anInt2507++;
		@Pc(230) boolean local230;
		if (local79 <= 1024) {
			arg0.anInt2509 += arg0.anInt2478;
			local230 = true;
			if (arg0.anInt2478 > local79 || 2048 - arg0.anInt2478 < local79) {
				local230 = false;
				arg0.anInt2509 = arg0.anInt2533;
			}
			if (arg0.anInt2495 == arg0.anInt2503 && (arg0.anInt2507 > 25 || local230)) {
				if (arg0.anInt2487 == -1) {
					arg0.anInt2495 = arg0.anInt2520;
				} else {
					arg0.anInt2495 = arg0.anInt2487;
				}
			}
		} else {
			arg0.anInt2509 -= arg0.anInt2478;
			local230 = true;
			if (local79 < arg0.anInt2478 || local79 > 2048 - arg0.anInt2478) {
				local230 = false;
				arg0.anInt2509 = arg0.anInt2533;
			}
			if (arg0.anInt2495 == arg0.anInt2503 && (arg0.anInt2507 > 25 || local230)) {
				if (arg0.anInt2491 == -1) {
					arg0.anInt2495 = arg0.anInt2520;
				} else {
					arg0.anInt2495 = arg0.anInt2491;
				}
			}
		}
		arg0.anInt2509 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
	public static void method1006() {
		aClass33_19 = null;
		aClass39_736 = null;
		aClass62_16 = null;
		aClass39Array15 = null;
		aClass39_735 = null;
		aByteArrayArrayArray5 = null;
		aClass39_734 = null;
		anIntArray213 = null;
	}
}
