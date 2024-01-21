import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!pb;")
	public static Class31 aClass31_22;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!pb;")
	public static Class31 aClass31_23;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!pa;")
	public static Class47 aClass47_17;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static volatile int anInt1433 = 0;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt1434 = 0;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!mc;")
	private static Class42 aClass42_774 = Static23.method501("Trade)4compete");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!mc;")
	private static Class42 aClass42_775 = Static23.method501("Please try again)3");

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_776 = Static23.method501("Titelbild geladen)3");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_777 = aClass42_775;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public static int anInt1442 = 0;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_778 = aClass42_774;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_779 = Static23.method501("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_780 = Static23.method501("Weiter");

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_781 = Static23.method501("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ka;IIIIIII)V")
	public static void method1004(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(37) int local37;
		if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local37 = arg0.method1186();
				if (local37 == 0) {
					return;
				}
				if (local37 == 1) {
					arg0.method1186();
					return;
				}
				if (local37 <= 49) {
					arg0.method1186();
				}
			}
			return;
		}
		Static61.aByteArrayArrayArray7[arg6][arg1][arg4] = 0;
		while (true) {
			local37 = arg0.method1186();
			if (local37 == 0) {
				if (arg6 == 0) {
					Static10.anIntArrayArrayArray1[0][arg1][arg4] = -Static13.method320(arg4 + arg2 + 556238, arg3 + 932731 + arg1) * 8;
					return;
				} else {
					Static10.anIntArrayArrayArray1[arg6][arg1][arg4] = Static10.anIntArrayArrayArray1[arg6 - 1][arg1][arg4] - 240;
					return;
				}
			}
			if (local37 == 1) {
				@Pc(99) int local99 = arg0.method1186();
				if (local99 == 1) {
					local99 = 0;
				}
				if (arg6 == 0) {
					Static10.anIntArrayArrayArray1[0][arg1][arg4] = -local99 * 8;
					return;
				}
				Static10.anIntArrayArrayArray1[arg6][arg1][arg4] = Static10.anIntArrayArrayArray1[arg6 - 1][arg1][arg4] - local99 * 8;
				return;
			}
			if (local37 <= 49) {
				Static20.aByteArrayArrayArray2[arg6][arg1][arg4] = arg0.method1209();
				Static28.aByteArrayArrayArray4[arg6][arg1][arg4] = (byte) ((local37 - 2) / 4);
				Static6.aByteArrayArrayArray1[arg6][arg1][arg4] = (byte) (arg5 + local37 - 2 & 0x3);
			} else if (local37 <= 81) {
				Static61.aByteArrayArrayArray7[arg6][arg1][arg4] = (byte) (local37 - 49);
			} else {
				Static69.aByteArrayArrayArray8[arg6][arg1][arg4] = (byte) (local37 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1005() {
		try {
			@Pc(11) Graphics local11 = Static89.aCanvas1.getGraphics();
			Static47.aClass31_35.method993(553, local11, 205);
		} catch (@Pc(19) Exception local19) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1006() {
		aClass42_777 = null;
		aClass31_23 = null;
		anIntArray217 = null;
		aClass42_776 = null;
		aClass47_17 = null;
		aClass42_781 = null;
		aClass31_22 = null;
		aClass42_779 = null;
		aClass42_780 = null;
		aClass42_774 = null;
		aClass1_Sub1_Sub1_Sub1_4 = null;
		aClass42_775 = null;
		aClass42_778 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZI)I")
	public static int method1007() {
		return Static9.anInt253 + Static37.anInt909;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)I")
	public static int method1008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILclient!ja;)Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 method1009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		return Static67.method1153(arg0, arg2, arg1) ? Static91.method1660() : null;
	}
}
