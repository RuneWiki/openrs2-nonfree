import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class27 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!ta;")
	public Class111 aClass111_1 = null;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!sga;")
	public Class297 aClass297_5 = null;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class27(@OriginalArg(0) Class111 arg0) {
		this.aClass111_1 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ta;Lclient!sga;)V")
	public Class27(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class297 arg1) {
		this.aClass297_5 = arg1;
		this.aClass111_1 = arg0;
	}
}
