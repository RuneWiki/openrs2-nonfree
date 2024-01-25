import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class134 {

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class134(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray19 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method2720(@OriginalArg(0) int arg0) {
		return this.aStringArray19[arg0];
	}

	@OriginalMember(owner = "client!kc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
