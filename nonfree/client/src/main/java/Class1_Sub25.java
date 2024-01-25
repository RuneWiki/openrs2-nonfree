import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	private Class1_Sub25() {
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub25(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}
}
