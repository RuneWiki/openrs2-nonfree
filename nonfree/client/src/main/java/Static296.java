import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
	public static int anInt5398;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Lclient!ol;")
	public static final Class2_Sub8 aClass2_Sub8_5 = new Class2_Sub8(1350);

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[128][128];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!gga;I)Lclient!mq;")
	public static Class71 method4890(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class71 local15 = (Class71) Static631.aClass22_66.method462((long) arg1);
		if (local15 == null) {
			if (Static451.aBoolean607) {
				local15 = Static607.aClass101_15.method8063(Static676.method1689(arg0, arg1), true);
			} else {
				local15 = Static71.method1304(arg0.method3610(arg1));
			}
			Static631.aClass22_66.method470((long) arg1, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V")
	public static void method4895(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(8, (long) arg0);
		local9.method2489();
	}
}
