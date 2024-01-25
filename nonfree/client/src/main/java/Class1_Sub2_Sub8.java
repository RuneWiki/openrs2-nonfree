import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Lclient!pb;")
	public final Class26_Sub2_Sub5 aClass26_Sub2_Sub5_1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!pb;)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class26_Sub2_Sub5 arg0) {
		this.aClass26_Sub2_Sub5_1 = arg0;
	}
}
