import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBII)V")
	public static void method4827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static16.method8199(true, local40, false);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!wq;I)V")
	public static void method4828(@OriginalArg(0) Class394 arg0) {
		if (!Static386.aBoolean482) {
			return;
		}
		if (arg0.anObjectArray14 != null) {
			@Pc(22) Class394 local22 = Static622.method7590(Static537.anInt10359, Static404.anInt6945);
			if (local22 != null) {
				@Pc(28) Class5_Sub28 local28 = new Class5_Sub28();
				local28.aClass394_2 = arg0;
				local28.anObjectArray2 = arg0.anObjectArray14;
				local28.aClass394_3 = local22;
				Static497.method7205(local28);
			}
		}
		@Pc(45) Class5_Sub16 local45 = Static455.method6717(Static96.aClass187_28, Static16.aClass332_8);
		local45.aClass5_Sub15_Sub2_1.method3679(arg0.anInt10490);
		local45.aClass5_Sub15_Sub2_1.method3656(arg0.anInt10502);
		local45.aClass5_Sub15_Sub2_1.method3656(Static537.anInt10359);
		local45.aClass5_Sub15_Sub2_1.method3696(arg0.anInt10469);
		local45.aClass5_Sub15_Sub2_1.method3660(Static669.anInt10434);
		local45.aClass5_Sub15_Sub2_1.method3664(Static404.anInt6945);
		Static479.method7038(local45);
	}
}
