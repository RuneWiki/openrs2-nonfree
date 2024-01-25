import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	private Class2_Sub19() {
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub19(@OriginalArg(0) String arg0) {
		this.aString21 = arg0;
	}
}
