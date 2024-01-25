import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_24 = new Class131(17, 2);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!ht;)V")
	public static void method622(@OriginalArg(1) Class109_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static202.anObject6 == null) {
			@Pc(9) Class30_Sub2_Sub1 local9 = new Class30_Sub2_Sub1();
			local16 = local9.method4073();
			Static202.anObject6 = Static268.method4067(local16);
		}
		if (Static294.anObject9 == null) {
			@Pc(27) Class30_Sub1_Sub1 local27 = new Class30_Sub1_Sub1();
			local16 = local27.method1648();
			Static294.anObject9 = Static268.method4067(local16);
		}
		@Pc(46) Class86 local46 = arg0.aClass86_1;
		if (local46.method1704() && Static439.anObject11 == null) {
			local16 = Static447.method5987(4.0F, new Class17_Sub1(419684), 16.0F, 4.0F, 0.6F, 0.5F);
			Static439.anObject11 = Static268.method4067(local16);
		}
	}
}
