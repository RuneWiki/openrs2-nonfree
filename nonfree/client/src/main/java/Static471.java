import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_19 = new Class298(4);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_15 = new Class298(1);

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_12 = new Class298(1);

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_13 = new Class298(2);

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_14 = new Class298(4);

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_16 = new Class298(2);

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_17 = new Class298(4);

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!rt;")
	public static final Class298 aClass298_18 = new Class298(2);

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
	public static final int[] anIntArray498 = new int[1000];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!sp;)V")
	public static void method6501(@OriginalArg(1) Class41_Sub2_Sub1_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt9506 - Static506.anInt8251;
		@Pc(21) int local21 = arg0.anInt9492 * 512 + arg0.method7858() * 256;
		@Pc(35) int local35 = arg0.anInt9453 * 512 + arg0.method7858() * 256;
		arg0.anInt9442 += (local35 - arg0.anInt9442) / local9;
		arg0.anInt9533 = 0;
		arg0.anInt9444 += (local21 - arg0.anInt9444) / local9;
		if (arg0.anInt9524 == 0) {
			arg0.method7865(8192);
		}
		if (arg0.anInt9524 == 1) {
			arg0.method7865(12288);
		}
		if (arg0.anInt9524 == 2) {
			arg0.method7865(0);
		}
		if (arg0.anInt9524 == 3) {
			arg0.method7865(4096);
		}
	}
}
