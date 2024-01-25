import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class346 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!la;")
	public Class63 aClass63_12 = null;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!ufa;")
	public Class328 aClass328_12 = null;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class346(@OriginalArg(0) Class63 arg0) {
		this.aClass63_12 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!la;Lclient!ufa;)V")
	public Class346(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class328 arg1) {
		this.aClass63_12 = arg0;
		this.aClass328_12 = arg1;
	}
}
