import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class221 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!bq;")
	public Class31 aClass31_7 = null;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "Lclient!da;")
	public Class56 aClass56_12 = null;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class221(@OriginalArg(0) Class56 arg0) {
		this.aClass56_12 = arg0;
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!da;Lclient!bq;)V")
	public Class221(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class31 arg1) {
		this.aClass31_7 = arg1;
		this.aClass56_12 = arg0;
	}
}
