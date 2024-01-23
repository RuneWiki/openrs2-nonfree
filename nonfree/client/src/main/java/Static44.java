import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!pk;")
	public static Class132 aClass132_15;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "[B")
	public static byte[] aByteArray6 = new byte[520];

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "[Lclient!aj;")
	public static Class8_Sub2[] aClass8_Sub2Array1 = new Class8_Sub2[2048];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)V")
	public static void method711(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static30.anInt728; local21++) {
			if (Static213.aLongArray11[local21] == arg0) {
				Static30.anInt728--;
				for (@Pc(49) int local49 = local21; local49 < Static30.anInt728; local49++) {
					Static213.aLongArray11[local49] = Static213.aLongArray11[local49 + 1];
					Static48.aStringArray17[local49] = Static48.aStringArray17[local49 + 1];
					Static145.aBooleanArray13[local49] = Static145.aBooleanArray13[local49 + 1];
				}
				Static295.anInt3737 = Static157.anInt5706;
				Static66.aClass8_Sub2_Sub1_4.method2398(65);
				Static66.aClass8_Sub2_Sub1_4.method2378(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method712() {
		try {
			if (Static283.anInt5551 == 1) {
				@Pc(12) int local12 = Static231.aClass8_Sub8_Sub2_3.method2138();
				if (local12 > 0 && Static231.aClass8_Sub8_Sub2_3.method2145()) {
					local12 -= Static50.anInt1118;
					if (local12 < 0) {
						local12 = 0;
					}
					Static231.aClass8_Sub8_Sub2_3.method2121(local12);
					return;
				}
				Static231.aClass8_Sub8_Sub2_3.method2134();
				Static231.aClass8_Sub8_Sub2_3.method2112();
				if (Static240.aClass132_82 == null) {
					Static283.anInt5551 = 0;
				} else {
					Static283.anInt5551 = 2;
				}
				Static200.aClass8_Sub4_2 = null;
				Static179.aClass93_1 = null;
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static231.aClass8_Sub8_Sub2_3.method2134();
			Static283.anInt5551 = 0;
			Static240.aClass132_82 = null;
			Static179.aClass93_1 = null;
			Static200.aClass8_Sub4_2 = null;
		}
	}
}
