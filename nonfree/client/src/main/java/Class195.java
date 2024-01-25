import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class195 {

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!rc;")
	public Class298 aClass298_6 = null;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!da;")
	public Class6 aClass6_9 = null;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class195(@OriginalArg(0) Class6 arg0) {
		this.aClass6_9 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!da;Lclient!rc;)V")
	public Class195(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class298 arg1) {
		this.aClass298_6 = arg1;
		this.aClass6_9 = arg0;
	}
}
