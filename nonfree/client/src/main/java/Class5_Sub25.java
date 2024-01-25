import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!go", name = "r", descriptor = "Lclient!ft;")
	public final Class28_Sub1_Sub4_Sub2_Sub1 aClass28_Sub1_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class5_Sub25(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub1 arg0) {
		this.aClass28_Sub1_Sub4_Sub2_Sub1_1 = arg0;
	}
}
