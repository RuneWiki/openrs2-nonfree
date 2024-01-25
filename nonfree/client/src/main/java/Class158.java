import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class158 {

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class158(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray29 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3594(@OriginalArg(0) int arg0) {
		return this.aStringArray29[arg0];
	}

	@OriginalMember(owner = "client!lo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
