import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!qe;")
	public Class83 aClass83_709;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub16() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class2_Sub16(@OriginalArg(0) Class83 arg0) {
		this.aClass83_709 = arg0;
	}
}
