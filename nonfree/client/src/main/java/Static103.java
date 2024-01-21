import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_32;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_942 = Static177.method3050("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_10 = new Class11();

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_943 = Static177.method3050("::errortest");

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public static int anInt2609 = -1;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
	public static int anInt2611 = 0;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_944 = Static177.method3050("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
	public static void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg0; local11 <= arg0 + arg2; local11++) {
			for (@Pc(15) int local15 = arg1; local15 <= arg3 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static27.aByteArrayArrayArray1[0][local15][local11] = 127;
					if (arg1 == local15 && local15 > 0) {
						Static112.anIntArrayArrayArray42[0][local15][local11] = Static112.anIntArrayArrayArray42[0][local15 - 1][local11];
					}
					if (local15 == arg3 + arg1 && local15 < 103) {
						Static112.anIntArrayArrayArray42[0][local15][local11] = Static112.anIntArrayArrayArray42[0][local15 + 1][local11];
					}
					if (local11 == arg0 && local11 > 0) {
						Static112.anIntArrayArrayArray42[0][local15][local11] = Static112.anIntArrayArrayArray42[0][local15][local11 - 1];
					}
					if (arg0 + arg2 == local11 && local11 < 103) {
						Static112.anIntArrayArrayArray42[0][local15][local11] = Static112.anIntArrayArrayArray42[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method1969(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub16 local12 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray245.length; local21++) {
				local12.anIntArray245[local21] = -1;
				local12.anIntArray244[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)I")
	public static int method1970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
