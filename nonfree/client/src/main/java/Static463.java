import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_16 = new Class74(1, 3);

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "Lclient!wq;")
	public static Class394 aClass394_6 = null;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_70 = new Class187(70, 3);

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
	public static final int[] anIntArray448 = new int[1000];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!su;BLclient!su;)V")
	public static void method6854(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		if (arg0.aClass5_Sub2_66 != null) {
			arg0.method8569();
		}
		arg0.aClass5_Sub2_67 = arg1;
		arg0.aClass5_Sub2_66 = arg1.aClass5_Sub2_66;
		arg0.aClass5_Sub2_66.aClass5_Sub2_67 = arg0;
		arg0.aClass5_Sub2_67.aClass5_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	public static void method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(5, (long) arg1);
		local13.method2438();
		local13.anInt2749 = arg0;
	}
}
