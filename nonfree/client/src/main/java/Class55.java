import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class55 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray7;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class55(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray7 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method1205(@OriginalArg(0) int arg0) {
		return this.aStringArray7[arg0];
	}

	@OriginalMember(owner = "client!dp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
