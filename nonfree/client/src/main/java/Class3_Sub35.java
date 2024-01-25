import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub35(@OriginalArg(0) String arg0) {
		this.aString45 = arg0;
	}
}
