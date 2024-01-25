import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
	public static int anInt9380 = 0;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "[I")
	public static final int[] anIntArray705 = new int[8];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZILclient!bd;I)V")
	public static void method7710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class4_Sub51 local19 = (Class4_Sub51) Static217.aClass124_22.method3267(); local19 != null; local19 = (Class4_Sub51) Static217.aClass124_22.method3273()) {
			if (arg0 == local19.anInt9594 && local19.anInt9601 == arg1 << 9 && arg3 << 9 == local19.anInt9606 && local19.aClass25_1.anInt605 == arg2.anInt605) {
				if (local19.aClass4_Sub13_Sub2_3 != null) {
					Static430.aClass4_Sub13_Sub1_1.method2274(local19.aClass4_Sub13_Sub2_3);
					local19.aClass4_Sub13_Sub2_3 = null;
				}
				if (local19.aClass4_Sub13_Sub2_4 != null) {
					Static430.aClass4_Sub13_Sub1_1.method2274(local19.aClass4_Sub13_Sub2_4);
					local19.aClass4_Sub13_Sub2_4 = null;
				}
				local19.method8013();
				return;
			}
		}
	}
}
