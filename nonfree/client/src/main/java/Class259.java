import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class259 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "Lclient!da;")
	public Class34 aClass34_9 = null;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "Lclient!mv;")
	public Class213 aClass213_13 = null;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class259(@OriginalArg(0) Class34 arg0) {
		this.aClass34_9 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!da;Lclient!mv;)V")
	public Class259(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class213 arg1) {
		this.aClass213_13 = arg1;
		this.aClass34_9 = arg0;
	}
}
