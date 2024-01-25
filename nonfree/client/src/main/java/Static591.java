import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lclient!ju;")
	public static Class2_Sub8[] aClass2_Sub8Array1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "F")
	public static float aFloat182 = 0.0F;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
	public static boolean aBoolean691 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ib;BII)V")
	public static void method8149(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray302[0];
		@Pc(15) int local15 = arg1.anIntArray301[0];
		if (local10 < 0 || Static491.anInt9856 <= local10 || local15 < 0 || local15 >= Static393.anInt6574 || (arg2 < 0 || Static491.anInt9856 <= arg2 || arg0 < 0 || Static393.anInt6574 <= arg0)) {
			return;
		}
		@Pc(86) int local86 = Static526.method7374(local10, arg0, 0, Static521.anIntArray573, local15, arg1.method4326(), 0, 0, arg2, -4, Static83.aClass324Array1[arg1.aByte140], true, 0, Static459.anIntArray519);
		if (local86 >= 1 && local86 <= 3) {
			for (@Pc(100) int local100 = 0; local100 < local86 - 1; local100++) {
				arg1.method3513(Static459.anIntArray519[local100], Static521.anIntArray573[local100], (byte) 2);
			}
		}
	}
}
