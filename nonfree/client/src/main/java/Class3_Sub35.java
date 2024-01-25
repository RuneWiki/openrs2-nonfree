import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!np", name = "m", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub35(@OriginalArg(0) String arg0) {
		this.aString52 = arg0;
	}
}
