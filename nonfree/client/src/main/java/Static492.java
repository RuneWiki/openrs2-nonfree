import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
	public static int anInt838 = 0;

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
	public static final int[] anIntArray41 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "[I")
	public static int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
	public static void method742() {
		for (@Pc(6) Class3_Sub15 local6 = (Class3_Sub15) Static484.aClass333_30.method7490(); local6 != null; local6 = (Class3_Sub15) Static484.aClass333_30.method7487()) {
			Static344.method5009(local6.anInt2738);
		}
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
	public static void method747() {
		for (@Pc(7) int local7 = 0; local7 < Static315.aByteArrayArrayArray13.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static315.aByteArrayArrayArray13[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static315.aByteArrayArrayArray13[0][0].length; local15++) {
					Static315.aByteArrayArrayArray13[local7][local11][local15] = 0;
				}
			}
		}
	}
}
