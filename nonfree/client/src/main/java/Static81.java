import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "[[[Lclient!ct;")
	public static Class48[][][] aClass48ArrayArrayArray2;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array3;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public static int anInt1661;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_30 = new Class57("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_6 = new Class68(2, 6);

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "[I")
	public static final int[] anIntArray163 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!dt;ZI)V")
	public static void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) int arg2) {
		if (!Static68.aBoolean81) {
			@Pc(56) String local56;
			for (@Pc(49) int local49 = 9; local49 >= 5; local49--) {
				local56 = Static201.method3145(local49, arg1);
				if (local56 != null) {
					Static90.method1499(1004, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, (long) (local49 + 1), arg1.aString18, true, local56, false, Static180.method2816(local49, arg1));
				}
			}
			local56 = Static350.method5270(arg1);
			if (local56 != null) {
				Static90.method1499(8, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, 0L, arg1.aString18, true, local56, false, arg1.anInt1497);
			}
			for (@Pc(117) int local117 = 4; local117 >= 0; local117--) {
				@Pc(124) String local124 = Static201.method3145(local117, arg1);
				if (local124 != null) {
					Static90.method1499(11, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, (long) (local117 + 1), arg1.aString18, true, local124, false, Static180.method2816(local117, arg1));
				}
			}
			if (Static48.method915(arg1).method5606()) {
				if (arg1.aString22 == null) {
					Static90.method1499(2, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, 0L, "", true, Static192.aClass57_59.method1122(Static66.anInt1307), false, -1);
				} else {
					Static90.method1499(2, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, 0L, "", true, arg1.aString22, false, -1);
				}
			}
		} else if (Static48.method915(arg1).method5600() && (Static122.anInt2309 & 0x20) != 0) {
			Static90.method1499(12, arg1.anInt1549, arg1.anInt1510, arg1.anInt1500, 0L, Static356.aString8 + " -> " + arg1.aString18, true, Static208.aString38, false, Static158.anInt2845);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method1342(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static392.method5713(0, arg1.length - 1, arg0, arg1);
	}
}
