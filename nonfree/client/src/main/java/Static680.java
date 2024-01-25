import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static680 {

	@OriginalMember(owner = "client!za", name = "m", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_75 = new Class102();

	@OriginalMember(owner = "client!za", name = "j", descriptor = "[I")
	public static final int[] anIntArray624 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ILclient!ec;IIIII)V")
	public static void method9331(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static109.method1569(0, arg2, arg0, arg1.aByte145, arg1.anInt10363, arg1.anInt10355, arg3);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z")
	public static boolean method9332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
