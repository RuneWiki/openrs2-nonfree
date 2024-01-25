import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_45 = new Class218(32);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z")
	public static boolean method9458() {
		return Static535.anInt8486 > 0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public static void method9459() {
		@Pc(16) byte[] local16;
		if (Static558.anObject13 == null) {
			@Pc(9) Class105_Sub1_Sub2 local9 = new Class105_Sub1_Sub2();
			local16 = local9.method4737();
			Static558.anObject13 = Static195.method2764(local16);
		}
		if (Static161.anObject3 == null) {
			@Pc(27) Class105_Sub2_Sub2 local27 = new Class105_Sub2_Sub2();
			local16 = local27.method8384();
			Static161.anObject3 = Static195.method2764(local16);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public static void method9460() {
		if (!Static157.aBoolean264) {
			Static157.aBoolean264 = true;
			Static176.aBoolean298 = true;
			Static357.aFloat91 += (12.0F - Static357.aFloat91) / 2.0F;
		}
	}
}
