import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class279 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!ll;")
	public Class198 aClass198_10 = null;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!la;")
	public Class45 aClass45_8 = null;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class279(@OriginalArg(0) Class45 arg0) {
		this.aClass45_8 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!la;Lclient!ll;)V")
	public Class279(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass45_8 = arg0;
		this.aClass198_10 = arg1;
	}
}
