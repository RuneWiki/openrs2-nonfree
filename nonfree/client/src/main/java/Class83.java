import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class83 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray10;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class83(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray10 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2267(@OriginalArg(1) int arg0) {
		return this.aStringArray10[arg0];
	}

	@OriginalMember(owner = "client!gk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
