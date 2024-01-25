import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class5_Sub33 extends Class5 {

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	private Class5_Sub33() {
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub33(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString58 = arg0;
	}
}
