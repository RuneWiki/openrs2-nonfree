import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class110 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!uq;")
	public Class334 aClass334_5 = null;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!la;")
	public Class64 aClass64_5 = null;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class110(@OriginalArg(0) Class64 arg0) {
		this.aClass64_5 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!la;Lclient!uq;)V")
	public Class110(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class334 arg1) {
		this.aClass334_5 = arg1;
		this.aClass64_5 = arg0;
	}
}
