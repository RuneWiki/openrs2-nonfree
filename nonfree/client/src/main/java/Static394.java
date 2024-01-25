import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt6583;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!fo;")
	public static Class82 aClass82_90;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[S")
	public static short[] aShortArray102;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_53 = new Class102(32);

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	public static int anInt6582 = 0;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	public static int anInt6584 = -1;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
	public static final int[] anIntArray439 = new int[1000];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILclient!pj;Lclient!pj;)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub1 arg3, @OriginalArg(4) Class25_Sub1 arg4) {
		@Pc(4) Class169 local4 = Static175.method2473(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub1_2 = arg3;
			local4.aClass25_Sub1_3 = arg4;
		}
	}
}
