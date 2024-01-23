import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "Lclient!kg;")
	public Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!kg;)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class5_Sub4 arg0) {
		this.aClass5_Sub4_1 = arg0;
	}
}
