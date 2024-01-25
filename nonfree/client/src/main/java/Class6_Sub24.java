import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Ljava/lang/String;")
	public String aString137;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class6_Sub24() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub24(@OriginalArg(0) String arg0) {
		this.aString137 = arg0;
	}
}
