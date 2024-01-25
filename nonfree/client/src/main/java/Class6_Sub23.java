import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!gia", name = "n", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	private Class6_Sub23() {
	}

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub23(@OriginalArg(0) String arg0) {
		this.aString42 = arg0;
	}
}
