import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class8_Sub5_Sub9 extends Class8_Sub5 {

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "Lclient!tca;")
	public final Class15_Sub1_Sub2_Sub5 aClass15_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!tca;)V")
	public Class8_Sub5_Sub9(@OriginalArg(0) Class15_Sub1_Sub2_Sub5 arg0) {
		this.aClass15_Sub1_Sub2_Sub5_1 = arg0;
	}
}
