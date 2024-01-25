import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	private Class2_Sub3() {
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub3(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
	}
}
