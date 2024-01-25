import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class52 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!da;")
	public Class50 aClass50_3 = null;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!hia;")
	public Class133 aClass133_13 = null;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class52(@OriginalArg(0) Class50 arg0) {
		this.aClass50_3 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!da;Lclient!hia;)V")
	public Class52(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class133 arg1) {
		this.aClass50_3 = arg0;
		this.aClass133_13 = arg1;
	}
}
