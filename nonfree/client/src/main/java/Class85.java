import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class85 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray24;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class85(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray24 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!hc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method2020(@OriginalArg(1) int arg0) {
		return this.aStringArray24[arg0];
	}
}
