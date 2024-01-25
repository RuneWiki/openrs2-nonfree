import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!qr;")
	public final Class13_Sub1_Sub1_Sub3 aClass13_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qr;)V")
	public Class2_Sub2_Sub20(@OriginalArg(0) Class13_Sub1_Sub1_Sub3 arg0) {
		this.aClass13_Sub1_Sub1_Sub3_1 = arg0;
	}
}
