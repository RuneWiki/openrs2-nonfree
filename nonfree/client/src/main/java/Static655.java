import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!cb;")
	public static Class50 aClass50_185;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!mfa;")
	public static Class5_Sub36 aClass5_Sub36_29;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
	public static int[] anIntArray596;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public static final int anInt10287 = Static187.method2726(1600);

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[I")
	public static int[] anIntArray597 = new int[2];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V")
	public static void method8585(@OriginalArg(1) int arg0) {
		Static250.anInt4004 = arg0;
		@Pc(11) Class265 local11 = Static360.aClass265_36;
		synchronized (Static360.aClass265_36) {
			Static360.aClass265_36.method6568();
		}
		local11 = Static168.aClass265_9;
		synchronized (Static168.aClass265_9) {
			Static168.aClass265_9.method6568();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public static void method8586() {
		Static362.method5334(Static202.anInt3256);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!wq;II)V")
	public static void method8587(@OriginalArg(1) Class394 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Class41_Sub1_Sub4_Sub2.lb = arg0;
		Static271.anInt4279 = arg1;
		Static465.anInt8114 = arg2;
	}
}
