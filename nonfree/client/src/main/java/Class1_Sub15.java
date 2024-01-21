import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!dd;")
	public Class13 aClass13_1026;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class1_Sub15() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!dd;)V")
	public Class1_Sub15(@OriginalArg(0) Class13 arg0) {
		this.aClass13_1026 = arg0;
	}
}
