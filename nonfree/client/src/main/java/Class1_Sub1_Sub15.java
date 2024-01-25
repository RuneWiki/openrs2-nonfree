import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Lclient!kc;")
	public final Class30_Sub1_Sub2 aClass30_Sub1_Sub2_1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!kc;)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class30_Sub1_Sub2 arg0) {
		this.aClass30_Sub1_Sub2_1 = arg0;
	}
}
