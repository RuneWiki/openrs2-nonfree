import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class84 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray22;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class84(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray22 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1678(@OriginalArg(0) int arg0) {
		return this.aStringArray22[arg0];
	}

	@OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
