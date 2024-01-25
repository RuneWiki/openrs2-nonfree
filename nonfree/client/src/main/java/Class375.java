import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class375 implements Interface26 {

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Lclient!la;")
	private final Class207 aClass207_131;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class375(@OriginalArg(0) Class207 arg0) {
		this.aClass207_131 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
	@Override
	public int method8918() {
		return this.aClass207_131.method4689() ? 100 : this.aClass207_131.method4694();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Lclient!oi;")
	@Override
	public Class258 method8919() {
		return Static403.aClass258_1;
	}
}
