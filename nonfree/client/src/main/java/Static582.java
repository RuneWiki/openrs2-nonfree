import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	public static int anInt9501;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!ria;")
	public static Class303 aClass303_21 = null;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_13 = new Class55(13, 3);

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!jv;")
	public static final Class191 aClass191_6 = new Class191();

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
	public static boolean aBoolean678 = false;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public static void method8065() {
		if (Static249.aFileOutputStream1 != null) {
			try {
				Static249.aFileOutputStream1.close();
			} catch (@Pc(16) IOException local16) {
			}
		}
		Static249.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method8066(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static573.aClass345_35.method7951(Static496.anInt7407) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static573.aClass345_37.method7951(Static496.anInt7407) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!sa;I[[B)V")
	public static void method8068(@OriginalArg(0) Class309_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(20) int[] local20 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(51) int local51;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt8255; local22++) {
			Static113.method2018();
			for (local28 = 0; local28 < Static456.anInt7428 >> 3; local28++) {
				for (local32 = 0; local32 < Static5.anInt112 >> 3; local32++) {
					local42 = Static584.anIntArrayArrayArray18[local22][local28][local32];
					if (local42 != -1) {
						local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean603 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static635.anIntArray728.length; local86++) {
								if (local84 == Static635.anIntArray728[local86] && arg1[local86] != null) {
									@Pc(108) Class2_Sub17 local108 = new Class2_Sub17(arg1[local86]);
									arg0.method7096(local62, local68, local51, Static520.aClass175Array1, local28 * 8, local32 * 8, local108, local22, local74);
									arg0.method7104(Static141.aClass13_27, local20[0] == -1 ? local20 : null, local68, local62, local74, local51, local28 * 8, local22, local32 * 8, local108);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local28 = 0; local28 < arg0.anInt8255; local28++) {
			Static113.method2018();
			for (local32 = 0; local32 < Static456.anInt7428 >> 3; local32++) {
				for (local42 = 0; local42 < Static5.anInt112 >> 3; local42++) {
					local51 = Static584.anIntArrayArrayArray18[local28][local32][local42];
					if (local51 == -1) {
						arg0.method7100(local32 * 8, 8, 8, local42 * 8, local28);
					}
				}
			}
		}
		if (local20[0] != -1) {
			Static593.aClass224_1 = Static302.aClass181_1.method4374(local20[0], Static405.aClass231_1, local20[2], local20[1], local20[3]);
			Static86.anInt2185 = local20[4];
		}
	}
}
