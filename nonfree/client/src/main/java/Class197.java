import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class197 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!la;")
	public Class117 aClass117_2 = null;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!daa;")
	public Class58 aClass58_9 = null;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class197(@OriginalArg(0) Class117 arg0) {
		this.aClass117_2 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!la;Lclient!daa;)V")
	public Class197(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_9 = arg1;
		this.aClass117_2 = arg0;
	}
}
