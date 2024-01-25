import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class57 {

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray6;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class57(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray6 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1122(@OriginalArg(1) int arg0) {
		return this.aStringArray6[arg0];
	}
}
