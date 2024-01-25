import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_60 = new Class218(53, -1);

	@OriginalMember(owner = "client!hn", name = "ob", descriptor = "[Lclient!gu;")
	public static final Class120_Sub1[] aClass120_Sub1Array1 = new Class120_Sub1[37];

	@OriginalMember(owner = "client!hn", name = "Zb", descriptor = "I")
	public static int anInt4987 = -1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBI)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class260 local9 = Static165.aClass260ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static630.anInt10395 = local9.anInt7868;
			Static37.anInt703 = local9.anInt7867;
			Static353.anInt6904 = local9.anInt7872;
		}
		Static572.method8000();
	}
}
