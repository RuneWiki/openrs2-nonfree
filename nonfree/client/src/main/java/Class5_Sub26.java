import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!dc;")
	public Class20 aClass20_1432;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class5_Sub26() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class5_Sub26(@OriginalArg(0) Class20 arg0) {
		this.aClass20_1432 = arg0;
	}
}
