import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "Z")
	public static boolean aBoolean74;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_15;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
	public static int[] anIntArray214 = new int[2000];

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_849 = Static38.method736("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "Lclient!vc;")
	private static Class71 aClass71_850 = Static38.method736("Unable to connect)3");

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
	public static int[] anIntArray215 = new int[50];

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
	public static int[] anIntArray216 = new int[200];

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Lclient!vc;")
	public static Class71 aClass71_851 = aClass71_850;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Lclient!vc;")
	public static Class71 aClass71_852 = aClass71_850;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Lclient!vc;")
	public static Class71 aClass71_853 = Static38.method736("auf der Hautpseite)3");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
	public static boolean method1171(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static66.anIntArray191[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 36;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1172() {
		try {
			@Pc(6) Graphics local6 = Static105.aCanvas1.getGraphics();
			Static7.aClass7_14.method697(553, local6, 205);
		} catch (@Pc(25) Exception local25) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public static void method1173() {
		Static72.aClass54_28.method1402();
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
	public static void method1174() {
		aClass71_849 = null;
		anImage4 = null;
		aClass24_Sub1_15 = null;
		anIntArray216 = null;
		aClass71_852 = null;
		anIntArray215 = null;
		aClass71_850 = null;
		aByteArray17 = null;
		aClass71_851 = null;
		anIntArray214 = null;
		aClass2_1 = null;
		aClass71_853 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILclient!qe;III)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(41) int local41;
		if (arg1 < 0 || arg1 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local41 = arg3.method1546();
				if (local41 == 0) {
					return;
				}
				if (local41 == 1) {
					arg3.method1546();
					return;
				}
				if (local41 <= 49) {
					arg3.method1546();
				}
			}
			return;
		}
		Static59.aByteArrayArrayArray2[arg4][arg1][arg0] = 0;
		while (true) {
			local41 = arg3.method1546();
			if (local41 == 0) {
				if (arg4 == 0) {
					Static51.anIntArrayArrayArray3[0][arg1][arg0] = -Static38.method739(arg6 + arg1 + 932731, arg0 + 556238 + arg2) * 8;
					return;
				} else {
					Static51.anIntArrayArrayArray3[arg4][arg1][arg0] = Static51.anIntArrayArrayArray3[arg4 - 1][arg1][arg0] - 240;
					return;
				}
			}
			if (local41 == 1) {
				@Pc(98) int local98 = arg3.method1546();
				if (local98 == 1) {
					local98 = 0;
				}
				if (arg4 != 0) {
					Static51.anIntArrayArrayArray3[arg4][arg1][arg0] = Static51.anIntArrayArrayArray3[arg4 - 1][arg1][arg0] - local98 * 8;
					return;
				}
				Static51.anIntArrayArrayArray3[0][arg1][arg0] = -local98 * 8;
				return;
			}
			if (local41 <= 49) {
				Static81.aByteArrayArrayArray6[arg4][arg1][arg0] = arg3.method1524();
				Static71.aByteArrayArrayArray4[arg4][arg1][arg0] = (byte) ((local41 - 2) / 4);
				Static114.aByteArrayArrayArray7[arg4][arg1][arg0] = (byte) (arg5 + local41 - 2 & 0x3);
			} else if (local41 <= 81) {
				Static59.aByteArrayArrayArray2[arg4][arg1][arg0] = (byte) (local41 - 49);
			} else {
				Static66.aByteArrayArrayArray3[arg4][arg1][arg0] = (byte) (local41 - 81);
			}
		}
	}
}
