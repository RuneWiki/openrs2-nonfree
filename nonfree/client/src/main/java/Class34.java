import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class34 {

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray14;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class34(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray14 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1285(@OriginalArg(0) int arg0) {
		return this.aStringArray14[arg0];
	}
}
