import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	private Class2_Sub12() {
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub12(@OriginalArg(0) String arg0) {
		this.aString18 = arg0;
	}
}
