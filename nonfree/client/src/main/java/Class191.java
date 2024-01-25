import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class191 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!il;")
	public Class146 aClass146_5 = null;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Lclient!ta;")
	public Class56 aClass56_3 = null;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class191(@OriginalArg(0) Class56 arg0) {
		this.aClass56_3 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ta;Lclient!il;)V")
	public Class191(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class146 arg1) {
		this.aClass56_3 = arg0;
		this.aClass146_5 = arg1;
	}
}
