import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "Lclient!qr;")
	public final Class20_Sub1_Sub5 aClass20_Sub1_Sub5_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qr;)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) Class20_Sub1_Sub5 arg0) {
		this.aClass20_Sub1_Sub5_1 = arg0;
	}
}
