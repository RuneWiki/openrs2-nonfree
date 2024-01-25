import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!tfa;")
	public final Class41_Sub1_Sub1_Sub5 aClass41_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!tfa;)V")
	public Class5_Sub2_Sub16(@OriginalArg(0) Class41_Sub1_Sub1_Sub5 arg0) {
		this.aClass41_Sub1_Sub1_Sub5_1 = arg0;
	}
}
