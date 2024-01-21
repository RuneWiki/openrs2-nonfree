import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!vc;")
	public static Class3_Sub10_Sub4 aClass3_Sub10_Sub4_2;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	public static int anInt2798;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "Lclient!je;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_1384 = Static109.method1737("backright1");

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[I")
	public static int[] anIntArray404 = new int[50];

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_1385 = Static109.method1737(" @whi@(X");

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!na;")
	public static Class53 aClass53_1386 = Static109.method1737("@red@");

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
	public static int[] anIntArray405 = new int[200];

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Z")
	public static final boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_1387 = Static109.method1737("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method1919() {
		aClass53_1387 = null;
		aClass53_1385 = null;
		aClass3_Sub10_Sub4_2 = null;
		aClass53_1386 = null;
		aByteArrayArray9 = null;
		aClass39_1 = null;
		anIntArray404 = null;
		aClass53_1384 = null;
		anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIILclient!ob;II)V")
	public static void method1920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub7 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15;
		if (arg0 < 0 || arg0 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local15 = arg5.method647();
				if (local15 == 0) {
					break;
				}
				if (local15 == 1) {
					arg5.method647();
					break;
				}
				if (local15 <= 49) {
					arg5.method647();
				}
			}
			return;
		}
		Static37.aByteArrayArrayArray17[arg4][arg0][arg6] = 0;
		while (true) {
			local15 = arg5.method647();
			if (local15 == 0) {
				if (arg4 == 0) {
					Static107.anIntArrayArrayArray7[0][arg0][arg6] = -Static68.method1177(arg6 + arg1 + 556238, arg0 + 932731 + arg2) * 8;
				} else {
					Static107.anIntArrayArrayArray7[arg4][arg0][arg6] = Static107.anIntArrayArrayArray7[arg4 - 1][arg0][arg6] - 240;
				}
				break;
			}
			if (local15 == 1) {
				@Pc(114) int local114 = arg5.method647();
				if (local114 == 1) {
					local114 = 0;
				}
				if (arg4 == 0) {
					Static107.anIntArrayArrayArray7[0][arg0][arg6] = -local114 * 8;
				} else {
					Static107.anIntArrayArrayArray7[arg4][arg0][arg6] = Static107.anIntArrayArrayArray7[arg4 - 1][arg0][arg6] - local114 * 8;
				}
				break;
			}
			if (local15 <= 49) {
				Static107.aByteArrayArrayArray18[arg4][arg0][arg6] = arg5.method624();
				Static104.aByteArrayArrayArray19[arg4][arg0][arg6] = (byte) ((local15 - 2) / 4);
				Static40.aByteArrayArrayArray9[arg4][arg0][arg6] = (byte) (local15 + arg3 - 2 & 0x3);
			} else if (local15 <= 81) {
				Static37.aByteArrayArrayArray17[arg4][arg0][arg6] = (byte) (local15 - 49);
			} else {
				Static70.aByteArrayArrayArray15[arg4][arg0][arg6] = (byte) (local15 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!we;Lclient!we;BZ)V")
	public static void method1921(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) boolean arg2) {
		Static123.aClass62_27 = arg1;
		Static107.aClass62_24 = arg0;
		Static44.aBoolean46 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)I")
	public static int method1922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg3;
			arg3 = local12;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg5;
		} else {
			return arg2;
		}
	}
}
