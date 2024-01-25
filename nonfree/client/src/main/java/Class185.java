import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class185 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!da;")
	public Class38 aClass38_8 = null;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!ie;")
	public Class158 aClass158_8 = null;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class185(@OriginalArg(0) Class38 arg0) {
		this.aClass38_8 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!da;Lclient!ie;)V")
	public Class185(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class158 arg1) {
		this.aClass38_8 = arg0;
		this.aClass158_8 = arg1;
	}
}
