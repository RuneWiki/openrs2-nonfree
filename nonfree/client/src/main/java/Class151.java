import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class151 {

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class151(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray28 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3122(@OriginalArg(1) int arg0) {
		return this.aStringArray28[arg0];
	}

	@OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
