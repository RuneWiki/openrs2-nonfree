import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!bb;")
	public Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!bb;)V")
	public Class4_Sub2_Sub7(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_1 = arg0;
	}
}
