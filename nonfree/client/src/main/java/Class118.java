import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class118 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!mj;")
	public Class202 aClass202_8 = null;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!ta;")
	public Class82 aClass82_2 = null;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class118(@OriginalArg(0) Class82 arg0) {
		this.aClass82_2 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ta;Lclient!mj;)V")
	public Class118(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class202 arg1) {
		this.aClass202_8 = arg1;
		this.aClass82_2 = arg0;
	}
}
