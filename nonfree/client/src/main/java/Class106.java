import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class106 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class106(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray13 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2927(@OriginalArg(1) int arg0) {
		return this.aStringArray13[arg0];
	}
}
