import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!jha", name = "n", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "()V")
	private Class3_Sub30() {
	}

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub30(@OriginalArg(0) String arg0) {
		this.aString89 = arg0;
	}
}
