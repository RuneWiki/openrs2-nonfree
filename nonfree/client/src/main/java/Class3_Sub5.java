import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!oc;")
	public Class70 aClass70_281;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class3_Sub5() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!oc;)V")
	public Class3_Sub5(@OriginalArg(0) Class70 arg0) {
		this.aClass70_281 = arg0;
	}
}
