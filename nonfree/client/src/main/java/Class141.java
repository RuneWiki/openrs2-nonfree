import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class141 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!ed;")
	public Class82 aClass82_5 = null;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!ta;")
	public Class73 aClass73_2 = null;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class141(@OriginalArg(0) Class73 arg0) {
		this.aClass73_2 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ta;Lclient!ed;)V")
	public Class141(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass73_2 = arg0;
		this.aClass82_5 = arg1;
	}
}
