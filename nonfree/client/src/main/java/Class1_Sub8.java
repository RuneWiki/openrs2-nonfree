import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!oc;")
	public Class65 aClass65_1073;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class1_Sub8() {
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!oc;)V")
	public Class1_Sub8(@OriginalArg(0) Class65 arg0) {
		this.aClass65_1073 = arg0;
	}
}
