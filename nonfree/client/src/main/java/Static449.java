import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Lclient!qi;")
	public static Class207 aClass207_11;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "[I")
	public static int[] anIntArray638;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "[I")
	public static final int[] anIntArray635 = new int[4096];

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_19 = new Class175(13, 7);

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!ia;")
	public static final Class6_Sub15_Sub1 aClass6_Sub15_Sub1_2 = new Class6_Sub15_Sub1(5000);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public static void method5972() {
		Static234.aClass220_34.method4999();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public static void method5974(@OriginalArg(0) int arg0) {
		Static306.anInt3568 = arg0;
		@Pc(7) Class220 local7 = Static131.aClass220_15;
		synchronized (Static131.aClass220_15) {
			Static131.aClass220_15.method4999();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Lclient!jt;")
	public static Class6_Sub1_Sub12 method5975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub1_Sub12 local20 = (Class6_Sub1_Sub12) Static394.aClass137_34.method3175((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class6_Sub1_Sub12(arg1, arg0);
			Static394.aClass137_34.method3179(local20.aLong217, local20);
		}
		return local20;
	}
}
