import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_21 = new Class144(18, 15);

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "[I")
	public static final int[] anIntArray151 = new int[50];

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Z")
	public static boolean aBoolean163 = true;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public static void method2294() {
		if (Static461.method6259(Static98.anInt2140) || Static14.method502(Static98.anInt2140)) {
			Static588.method7596(Static263.anInt4101 >> 12, Static558.anInt8546, Static305.anInt4908 >> 12);
		} else {
			@Pc(18) int local18 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] >> 3;
			@Pc(25) int local25 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] >> 3;
			if (local18 >= 0 && local18 < Static497.anInt7926 >> 3 && local25 >= 0 && Static646.anInt9979 >> 3 > local25) {
				Static588.method7596(local25, Static558.anInt8546, local18);
			} else {
				Static588.method7596(Static646.anInt9979 >> 4, 0, Static497.anInt7926 >> 4);
			}
		}
		Static91.method1927();
		Static92.method1942();
		Static395.method5345();
		Static609.method7805();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)B")
	public static byte method2296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
