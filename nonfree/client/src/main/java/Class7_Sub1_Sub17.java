import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class7_Sub1_Sub17 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!nr;")
	public final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!nr;)V")
	public Class7_Sub1_Sub17(@OriginalArg(0) Class22_Sub2_Sub2 arg0) {
		this.aClass22_Sub2_Sub2_1 = arg0;
	}
}
