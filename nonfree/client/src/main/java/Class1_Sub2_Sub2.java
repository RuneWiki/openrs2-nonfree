import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!md;")
	public Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class5_Sub4 arg0) {
		this.aClass5_Sub4_1 = arg0;
	}
}
