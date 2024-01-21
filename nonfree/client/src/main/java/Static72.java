import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt1641;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_821 = Static45.method1937("<col=00ff00>");

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_45 = null;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!af;")
	private static Class5 aClass5_823 = Static45.method1937("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_822 = aClass5_823;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1231() {
		aClass5_823 = null;
		anIntArray277 = null;
		aClass5_821 = null;
		aClass5_822 = null;
		aClass1_Sub17_45 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BIIII[Lclient!md;III)V")
	public static void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class49[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg0 > 0 && local7 + arg0 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
					arg6[arg4].anIntArrayArray58[local7 + arg0][arg2 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class1_Sub20 local82 = new Class1_Sub20(arg1);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (local84 == arg5 && local88 >= arg3 && arg3 + 8 > local88 && local92 >= arg8 && arg8 + 8 > local92) {
						Static65.method1185(0, arg7, local82, arg0 + Static59.method1061(local92 & 0x7, arg7, local88 & 0x7), 0, Static108.method1885(local92 & 0x7, local88 & 0x7, arg7) + arg2, arg4);
					} else {
						Static65.method1185(0, 0, local82, -1, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Lclient!af;")
	public static Class5 method1233(@OriginalArg(0) int arg0) {
		return Static75.aClass5Array12[arg0].method215() <= 0 ? Static124.aClass5Array24[arg0] : Static100.method1696(new Class5[] { Static124.aClass5Array24[arg0], Static121.aClass5_1384, Static75.aClass5Array12[arg0] });
	}
}
