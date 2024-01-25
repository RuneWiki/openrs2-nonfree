import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class175 {

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray122;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class175(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray122 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4201(@OriginalArg(0) int arg0) {
		return this.aStringArray122[arg0];
	}

	@OriginalMember(owner = "client!oi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
