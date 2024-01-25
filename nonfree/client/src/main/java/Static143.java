import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
	public static final int[] anIntArray147 = new int[32];

	@OriginalMember(owner = "client!el", name = "t", descriptor = "F")
	public static float aFloat45 = 0.25F;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method2339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class3_Sub5_Sub20 local18 = Static447.method6065((long) arg0, 6);
		local18.method8832();
		local18.anInt10754 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method2343(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static50.method961(0, arg0, arg1, arg1.length - 1);
	}
}
