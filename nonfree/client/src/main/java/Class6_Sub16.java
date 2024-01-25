import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	private Class6_Sub16() {
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub16(@OriginalArg(0) String arg0) {
		this.aString22 = arg0;
	}
}
