import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public static int anInt6572;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "D")
	public static double aDouble19 = -1.0D;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public static int anInt6574 = -1;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V")
	public static void method5514(@OriginalArg(0) int arg0) {
		Static614.anInt10205 = arg0;
		Static565.aClass295_59.method6464();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLclient!lf;)V")
	public static void method5515(@OriginalArg(1) Class95_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static488.anObject14 == null) {
			@Pc(9) Class18_Sub1_Sub2 local9 = new Class18_Sub1_Sub2();
			local16 = local9.method5646();
			Static488.anObject14 = Static360.method5206(local16);
		}
		if (Static117.anObject2 == null) {
			@Pc(27) Class18_Sub2_Sub2 local27 = new Class18_Sub2_Sub2();
			local16 = local27.method8427();
			Static117.anObject2 = Static360.method5206(local16);
		}
		@Pc(42) Class204 local42 = arg0.aClass204_1;
		if (local42.method4645() && Static120.anObject3 == null) {
			local16 = Static677.method9022(16.0F, 0.6F, 0.5F, 4.0F, new Class209_Sub1(419684), 4.0F);
			Static120.anObject3 = Static360.method5206(local16);
		}
	}
}
