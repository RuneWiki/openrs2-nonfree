import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class3_Sub3_Sub19 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "Lclient!ii;")
	public final Class9_Sub1_Sub1_Sub4 aClass9_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ii;)V")
	public Class3_Sub3_Sub19(@OriginalArg(0) Class9_Sub1_Sub1_Sub4 arg0) {
		this.aClass9_Sub1_Sub1_Sub4_1 = arg0;
	}
}
