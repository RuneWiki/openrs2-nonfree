import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Lclient!g;")
	public Class9_Sub5 aClass9_Sub5_1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) Class9_Sub5 arg0) {
		this.aClass9_Sub5_1 = arg0;
	}
}
