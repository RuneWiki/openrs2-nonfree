import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
	public static int anInt4258 = 0;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "[Lclient!wj;")
	public static final Class389[] aClass389Array1 = new Class389[4];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void method3785(@OriginalArg(0) Class34 arg0) {
		Static450.aClass34_94 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static499.method6774(local7.aClass3_Sub1_Sub3_1);
		Static499.method6774(local7.aClass3_Sub1_Sub3_2);
		if (local7.aClass3_Sub1_Sub3_1 != null) {
			local7.aClass3_Sub1_Sub3_1 = null;
		}
		if (local7.aClass3_Sub1_Sub3_2 != null) {
			local7.aClass3_Sub1_Sub3_2 = null;
		}
	}
}
