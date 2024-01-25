import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!qh;")
	public final Class11_Sub1_Sub1_Sub3_Sub2 aClass11_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class1_Sub33(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub2 arg0) {
		this.aClass11_Sub1_Sub1_Sub3_Sub2_2 = arg0;
	}
}
