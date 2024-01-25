import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class174 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray31;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class174(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray31 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!of", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4208(@OriginalArg(1) int arg0) {
		return this.aStringArray31[arg0];
	}
}
