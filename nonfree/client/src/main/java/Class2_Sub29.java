import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	private Class2_Sub29() {
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub29(@OriginalArg(0) String arg0) {
		this.aString63 = arg0;
	}
}
