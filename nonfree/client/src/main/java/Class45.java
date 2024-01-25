import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class45 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray4;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class45(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray4 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!cea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1474(@OriginalArg(0) int arg0) {
		return this.aStringArray4[arg0];
	}
}
