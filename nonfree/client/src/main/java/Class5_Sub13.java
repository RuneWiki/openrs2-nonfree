import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class5_Sub13() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub13(@OriginalArg(0) String arg0) {
		this.aString11 = arg0;
	}
}
