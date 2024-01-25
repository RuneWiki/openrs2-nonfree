import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class14_Sub3_Sub10 extends Class14_Sub3 {

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "Lclient!jr;")
	public final Class12_Sub2_Sub2_Sub4 aClass12_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class14_Sub3_Sub10(@OriginalArg(0) Class12_Sub2_Sub2_Sub4 arg0) {
		this.aClass12_Sub2_Sub2_Sub4_1 = arg0;
	}
}
