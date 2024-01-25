import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "[Lclient!rca;")
	public static Class296[] aClass296Array2;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lclient!ng;")
	public static Class12_Sub9 method7391() {
		@Pc(13) Class12_Sub9 local13 = (Class12_Sub9) Static453.aClass376_6.method9010();
		if (local13 == null) {
			return new Class12_Sub9();
		} else {
			Static647.anInt10815--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public static void method7392(@OriginalArg(0) boolean arg0) {
		Static345.aClass26_5.method6447(Static117.aClass137_46.method7872());
		@Pc(10) int[] local10 = Static117.aClass137_46.Y();
		Static382.anInt7017 = local10[3];
		Static92.anInt2035 = local10[1];
		Static207.anInt3881 = local10[0];
		Static674.anInt11178 = local10[2];
		if (arg0) {
			Static117.aClass137_46.DA(Static30.anInt777, Static628.anInt10563, Static92.anInt2034, Static510.anInt8986);
			Static317.method5009(Static440.aDouble20);
		} else {
			Static117.aClass137_46.DA(Static172.anInt3366, Static184.anInt3521, Static149.anInt6796, Static606.anInt10222);
			Static317.method5009(Static651.aDouble24);
		}
	}
}
