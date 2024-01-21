import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	public static int anInt2740;

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_21;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1739 = Static69.method1153("Enter message to send to ");

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1740 = Static69.method1153("purple:");

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1741 = Static69.method1153("No reply from loginserver)3");

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1742 = Static69.method1153("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1743 = Static69.method1153("Loading title screen )2 ");

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1744 = aClass64_1740;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
	public static int anInt2742 = 0;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1750 = Static69.method1153("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1745 = aClass64_1750;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1746 = aClass64_1743;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1747 = aClass64_1739;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1749 = aClass64_1741;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1751 = Static69.method1153(": ");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIB)I")
	public static int method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local16 < 0 || local12 < 0 || local16 > 103 || local12 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg0;
		if (arg0 < 3 && (Static18.aByteArrayArrayArray2[1][local16][local12] & 0x2) == 2) {
			local38 = arg0 + 1;
		}
		@Pc(61) int local61 = arg2 & 0x7F;
		@Pc(65) int local65 = arg1 & 0x7F;
		@Pc(93) int local93 = Static102.anIntArrayArrayArray5[local38][local16][local12] * (128 - local65) + local65 * Static102.anIntArrayArrayArray5[local38][local16 + 1][local12] >> 7;
		@Pc(124) int local124 = Static102.anIntArrayArrayArray5[local38][local16 + 1][local12 + 1] * local65 + (128 - local65) * Static102.anIntArrayArrayArray5[local38][local16][local12 + 1] >> 7;
		return local124 * local61 + local93 * (128 - local61) >> 7;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lclient!nc;IIIIII[B)V")
	public static void method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg1 + local3 > 0 && arg1 + local3 < 103 && arg6 + local7 > 0 && arg6 + local7 < 103) {
					arg2[arg7].anIntArrayArray22[arg1 + local3][arg6 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Class1_Sub6 local79 = new Class1_Sub6(arg8);
		for (@Pc(86) int local86 = 0; local86 < 4; local86++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					if (local86 == arg0 && local90 >= arg3 && arg3 + 8 > local90 && arg4 <= local94 && arg4 + 8 > local94) {
						Static104.method1700(arg5, arg1 + Static8.method221(local94 & 0x7, arg5, local90 & 0x7), 0, local79, 0, Static38.method683(local90 & 0x7, local94 & 0x7, arg5) + arg6, arg7);
					} else {
						Static104.method1700(0, -1, 0, local79, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
	public static void method1998() {
		aClass64_1742 = null;
		aClass64_1741 = null;
		aClass64_1749 = null;
		aClass64_1747 = null;
		aClass64_1750 = null;
		aClass41_Sub1_21 = null;
		aClass64_1744 = null;
		aClass64_1743 = null;
		aClass64_1751 = null;
		aClass64_1745 = null;
		aClass64_1740 = null;
		aClass64_1746 = null;
		aClass64_1739 = null;
	}
}
