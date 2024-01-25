import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
	public static final int[] anIntArray724 = new int[14];

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
	public static final int[] anIntArray725 = new int[1];

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_13 = new Class312("", 16);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!rl;II)V")
	public static void method8701(@OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static650.method2272(local6, 0, local6.length, arg2);
		Static554.method7824(arg0, arg1, local6);
	}
}
