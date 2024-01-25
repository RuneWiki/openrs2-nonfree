import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	private Class6_Sub25() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub25(@OriginalArg(0) String arg0) {
		this.aString28 = arg0;
	}
}
