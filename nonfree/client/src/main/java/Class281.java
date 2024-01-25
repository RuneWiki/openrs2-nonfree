import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class281 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!la;")
	public Class35 aClass35_12 = null;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!aga;")
	public Class13 aClass13_12 = null;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class281(@OriginalArg(0) Class35 arg0) {
		this.aClass35_12 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!la;Lclient!aga;)V")
	public Class281(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class13 arg1) {
		this.aClass35_12 = arg0;
		this.aClass13_12 = arg1;
	}
}
