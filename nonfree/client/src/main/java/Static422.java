import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_9 = new Class153(2, 2);

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "S")
	public static short aShort94 = 1;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_135 = new Class73(97, -1);

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
	public static final int[] anIntArray532 = new int[4096];

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_81 = new Class136(8);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!rr;IIB)V")
	public static void method6089(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte94 == 0) {
			arg0.anInt7883 = arg0.anInt7920;
		} else if (arg0.aByte94 == 1) {
			arg0.anInt7883 = arg0.anInt7920 + (arg2 - arg0.anInt7963) / 2;
		} else if (arg0.aByte94 == 2) {
			arg0.anInt7883 = arg2 - arg0.anInt7920 - arg0.anInt7963;
		} else if (arg0.aByte94 == 3) {
			arg0.anInt7883 = arg2 * arg0.anInt7920 >> 14;
		} else if (arg0.aByte94 == 4) {
			arg0.anInt7883 = (arg0.anInt7920 * arg2 >> 14) + (arg2 - arg0.anInt7963) / 2;
		} else {
			arg0.anInt7883 = arg2 - arg0.anInt7963 - (arg2 * arg0.anInt7920 >> 14);
		}
		if (arg0.aByte96 == 0) {
			arg0.anInt7923 = arg0.anInt7960;
		} else if (arg0.aByte96 == 1) {
			arg0.anInt7923 = (arg1 - arg0.anInt7912) / 2 + arg0.anInt7960;
		} else if (arg0.aByte96 == 2) {
			arg0.anInt7923 = arg1 - arg0.anInt7960 - arg0.anInt7912;
		} else if (arg0.aByte96 == 3) {
			arg0.anInt7923 = arg0.anInt7960 * arg1 >> 14;
		} else if (arg0.aByte96 == 4) {
			arg0.anInt7923 = (arg1 * arg0.anInt7960 >> 14) + (arg1 - arg0.anInt7912) / 2;
		} else {
			arg0.anInt7923 = arg1 - (arg0.anInt7960 * arg1 >> 14) - arg0.anInt7912;
		}
		if (!Static226.aBoolean321) {
			return;
		}
		if (Static67.method1354(arg0).anInt317 == 0 && arg0.lb != 0) {
			return;
		}
		if (arg0.anInt7923 < 0) {
			arg0.anInt7923 = 0;
		} else if (arg1 < arg0.anInt7912 + arg0.anInt7923) {
			arg0.anInt7923 = arg1 - arg0.anInt7912;
		}
		if (arg0.anInt7883 < 0) {
			arg0.anInt7883 = 0;
			return;
		}
		if (arg2 < arg0.anInt7963 + arg0.anInt7883) {
			arg0.anInt7883 = arg2 - arg0.anInt7963;
			return;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI)Z")
	public static boolean method6090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	public static void method6091() {
		@Pc(15) int local15 = Static140.aClass6_Sub48_Sub1_1.method7391(Static560.anInt9242);
		if (local15 == 0) {
			Static273.aByteArrayArrayArray19 = null;
			Static37.method2539(0);
		} else if (local15 == 1) {
			Static150.method2875((byte) 0);
			Static37.method2539(512);
			if (Static154.aByteArrayArrayArray4 != null) {
				Static424.method6103();
			}
		} else {
			Static150.method2875((byte) (Static534.anInt8855 - 4 & 0xFF));
			Static37.method2539(2);
		}
		Static500.anInt8331 = Static97.anInt1863;
	}
}
