import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class242 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray40;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class242(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray40 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method5320(@OriginalArg(1) int arg0) {
		return this.aStringArray40[arg0];
	}
}
