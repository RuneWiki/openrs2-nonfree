import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class93 {

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray24;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class93(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray24 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method2819(@OriginalArg(1) int arg0) {
		return this.aStringArray24[arg0];
	}

	@OriginalMember(owner = "client!iq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
