import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class288 {

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!da;")
	public Class44 aClass44_38 = null;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Lclient!saa;")
	public Class330 aClass330_10 = null;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class288(@OriginalArg(0) Class44 arg0) {
		this.aClass44_38 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!da;Lclient!saa;)V")
	public Class288(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class330 arg1) {
		this.aClass44_38 = arg0;
		this.aClass330_10 = arg1;
	}
}
