import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!nw;")
	public final Class8_Sub1_Sub3_Sub2_Sub2 aClass8_Sub1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!nw;)V")
	public Class5_Sub35(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub2 arg0) {
		this.aClass8_Sub1_Sub3_Sub2_Sub2_2 = arg0;
	}
}
