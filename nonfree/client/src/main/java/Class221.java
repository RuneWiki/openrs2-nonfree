import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class221 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!eb;")
	public Class91 aClass91_9 = null;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!da;")
	public Class67 aClass67_7 = null;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class221(@OriginalArg(0) Class67 arg0) {
		this.aClass67_7 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!da;Lclient!eb;)V")
	public Class221(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class91 arg1) {
		this.aClass91_9 = arg1;
		this.aClass67_7 = arg0;
	}
}
