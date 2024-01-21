import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt1582 = 0;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
	public static boolean aBoolean84 = true;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_570 = Static56.method1206("@yel@*V");

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_571 = Static56.method1206("It(Ws a ");

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_572 = Static56.method1206("l");

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public static int anInt1586 = -1;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_573 = Static56.method1206("Connecting to update server");

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[1000][];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!kc;IBI)Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 method1055(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static85.method1563(arg1, arg0, arg2) ? Static91.method1543() : null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method1056() {
		aClass31_573 = null;
		aByteArrayArray8 = null;
		aClass2_Sub1_Sub3_Sub2Array5 = null;
		anImage4 = null;
		anObject2 = null;
		aClass31_572 = null;
		aClass31_571 = null;
		aClass31_570 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)I")
	public static int method1057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg2;
		if (arg2 < 3 && (Static34.aByteArrayArrayArray17[1][local11][local15] & 0x2) == 2) {
			local34 = arg2 + 1;
		}
		@Pc(53) int local53 = arg0 & 0x7F;
		@Pc(57) int local57 = arg1 & 0x7F;
		@Pc(88) int local88 = (128 - local53) * Static16.anIntArrayArrayArray1[local34][local11][local15 + 1] + local53 * Static16.anIntArrayArrayArray1[local34][local11 + 1][local15 + 1] >> 7;
		@Pc(115) int local115 = local53 * Static16.anIntArrayArrayArray1[local34][local11 + 1][local15] + (128 - local53) * Static16.anIntArrayArrayArray1[local34][local11][local15] >> 7;
		return local57 * local88 + (128 - local57) * local115 >> 7;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZII)I")
	public static int method1058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static99.method1685(arg1 + 45365, arg0 + 91923, 4) + (Static99.method1685(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static99.method1685(arg1, arg0, 1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
