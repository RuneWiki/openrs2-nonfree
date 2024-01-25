import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
	public static int anInt2827;

	@OriginalMember(owner = "client!fia", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!fia", name = "t", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!fia", name = "u", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(III)Z")
	public static boolean method2366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static403.method5468(arg1, arg0) || Static520.method7260(arg1, arg0);
	}

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z")
	public static boolean method2369() {
		if (Static432.aClass2_Sub2_Sub11_2 == null) {
			return false;
		} else {
			if (Static432.aClass2_Sub2_Sub11_2.anInt4369 >= 2000) {
				Static432.aClass2_Sub2_Sub11_2.anInt4369 -= 2000;
			}
			return Static432.aClass2_Sub2_Sub11_2.anInt4369 == 1002;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V")
	public static void method2370(@OriginalArg(0) int arg0) {
		if (arg0 == Static324.anInt5145) {
			return;
		}
		if (arg0 == 13) {
			if (Static435.aString32 == null) {
				Static295.method4070(Static91.aString17, Static500.anInt8131, Static34.aString8);
			} else {
				Static325.method4374(Static500.anInt8131);
			}
		}
		if (arg0 != 13 && Static120.aClass121_1 != null) {
			Static120.aClass121_1.method2936();
			Static120.aClass121_1 = null;
		}
		if (arg0 == 3) {
			Static518.method7243(Static38.anInt777 != Static261.anInt4094);
		}
		if (arg0 == 7) {
			Static637.method8580(Static38.anInt777 != Static380.anInt5918);
		}
		if (arg0 == 5) {
			if (Static435.aString32 == null) {
				Static187.method2724(Static91.aString17, Static34.aString8);
			} else {
				Static546.method7542();
			}
		} else if (arg0 == 6) {
			if (Static435.aString32 == null) {
				Static295.method4070(Static91.aString17, Static500.anInt8131, Static34.aString8);
			} else {
				Static325.method4374(Static500.anInt8131);
			}
		} else if (arg0 == 9) {
			if (Static435.aString32 == null) {
				Static295.method4070(Static91.aString17, Static500.anInt8131, Static34.aString8);
			} else {
				Static325.method4374(Static500.anInt8131);
			}
		} else if (arg0 == 12) {
			if (Static435.aString32 == null) {
				Static187.method2724(Static91.aString17, Static34.aString8);
			} else {
				Static546.method7542();
			}
		}
		if (Static466.method6313(Static324.anInt5145)) {
			Static576.aClass380_128.anInt10336 = 2;
			Static39.aClass380_14.anInt10336 = 2;
			Static247.aClass380_64.anInt10336 = 2;
			Static531.aClass380_119.anInt10336 = 2;
			Static194.aClass380_126.anInt10336 = 2;
			Static3.aClass380_135.anInt10336 = 2;
			Static438.aClass380_102.anInt10336 = 2;
		}
		if (Static466.method6313(arg0)) {
			Static205.anInt6316 = 1;
			Static483.anInt7695 = 0;
			Static380.anInt5922 = 0;
			Static275.anInt4390 = 0;
			Static250.anInt4004 = 1;
			Static393.method5366(true);
			Static576.aClass380_128.anInt10336 = 1;
			Static39.aClass380_14.anInt10336 = 1;
			Static247.aClass380_64.anInt10336 = 1;
			Static531.aClass380_119.anInt10336 = 1;
			Static194.aClass380_126.anInt10336 = 1;
			Static3.aClass380_135.anInt10336 = 1;
			Static438.aClass380_102.anInt10336 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static626.method8392();
		}
		@Pc(218) boolean local218 = arg0 == 2 || Static602.method8118(arg0) || Static155.method2317(arg0);
		@Pc(235) boolean local235 = Static324.anInt5145 == 2 || Static602.method8118(Static324.anInt5145) || Static155.method2317(Static324.anInt5145);
		if (local218 != local235) {
			if (local218) {
				Static489.anInt1781 = Static363.anInt5741;
				if (Static234.aClass2_Sub5_48.aClass6_Sub22_1.method7291() == 0) {
					Static506.method6919();
				} else {
					Static213.method2960(Static234.aClass2_Sub5_48.aClass6_Sub22_1.method7291(), Static363.anInt5741, Static539.aClass380_121);
					Static151.method2243();
				}
				Static301.aClass104_3.method2228(false);
			} else {
				Static506.method6919();
				Static301.aClass104_3.method2228(true);
			}
		}
		if (Static466.method6313(arg0) || arg0 == 13) {
			Static192.aClass95_4.method6986();
		}
		Static324.anInt5145 = arg0;
	}
}
