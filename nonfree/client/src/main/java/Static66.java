import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_40;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "I")
	public static int anInt1860;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!wd;")
	private static Class80 aClass80_704 = Static2.method59("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!wd;")
	private static Class80 aClass80_705 = Static2.method59("Loading title screen )2 ");

	@OriginalMember(owner = "client!la", name = "z", descriptor = "I")
	public static int anInt1859 = 0;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!wd;")
	public static Class80 aClass80_706 = aClass80_705;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!wd;")
	public static Class80 aClass80_707 = Static2.method59("backright2");

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
	public static int[] anIntArray234 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!la", name = "J", descriptor = "Lclient!wd;")
	public static Class80 aClass80_708 = Static2.method59("mapedge");

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!wd;")
	public static Class80 aClass80_709 = aClass80_704;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!va;)V")
	public static void method1106(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		@Pc(8) int local8 = arg0.anInt3022 >> 16;
		if (Static57.anInt1737 == local8 || Static28.anInt2316 == local8) {
			Static37.aBoolean77 = true;
		}
		if (local8 == Static97.anInt2559 || Static39.anIntArray89[Static23.anInt875] == local8) {
			Static70.aBoolean131 = true;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1107() {
		if (Static18.aBoolean51 && Static90.anInt2213 != Static16.anInt444) {
			Static92.method1398(Static16.anInt444, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], Static119.anInt1677, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0], Static78.anInt1997);
		} else if (Static16.anInt444 != Static95.anInt2428) {
			Static95.anInt2428 = Static16.anInt444;
			Static61.method1059(Static16.anInt444);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	public static void method1108() {
		anIntArray234 = null;
		aClass2_Sub1_Sub9_Sub3_40 = null;
		aClass80_704 = null;
		anImage4 = null;
		aClass80_708 = null;
		aClass80_706 = null;
		aClass80_707 = null;
		aClass80_705 = null;
		aClass80_709 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method1109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public static boolean method1110(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
