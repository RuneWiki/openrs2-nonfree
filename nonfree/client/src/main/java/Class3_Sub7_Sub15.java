import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Lclient!ia;")
	public final Class5_Sub4_Sub3 aClass5_Sub4_Sub3_1;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class3_Sub7_Sub15(@OriginalArg(0) Class5_Sub4_Sub3 arg0) {
		this.aClass5_Sub4_Sub3_1 = arg0;
	}
}
