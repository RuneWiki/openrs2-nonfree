import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_94 = new Class240(65, 7);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!cm;)V")
	public static void method7016(@OriginalArg(1) Class34_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(19) Class3_Sub30 local19 = (Class3_Sub30) Static588.aClass333_42.method7489((long) arg0.anInt9671);
		if (local19 == null) {
			Static266.method3928(0, arg0.aByte132, (Class216) null, arg0.anIntArray529[0], (Class34_Sub1_Sub1_Sub2_Sub2) null, arg0.anIntArray528[0], arg0);
		} else {
			local19.method4116();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I")
	public static int method7018(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
