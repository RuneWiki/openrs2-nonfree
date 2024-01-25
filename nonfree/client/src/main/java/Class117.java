import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class117 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray24;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class117(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray24 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method2684(@OriginalArg(1) int arg0) {
		return this.aStringArray24[arg0];
	}

	@OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
