import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class256 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class256(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray42 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5720(@OriginalArg(0) int arg0) {
		return this.aStringArray42[arg0];
	}

	@OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
