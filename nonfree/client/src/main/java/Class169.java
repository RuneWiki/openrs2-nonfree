import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class169 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray56;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class169(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray56 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3680(@OriginalArg(0) int arg0) {
		return this.aStringArray56[arg0];
	}
}
