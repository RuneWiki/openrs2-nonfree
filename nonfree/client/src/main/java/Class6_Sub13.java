import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class6_Sub13() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub13(@OriginalArg(0) String arg0) {
		this.aString13 = arg0;
	}
}
