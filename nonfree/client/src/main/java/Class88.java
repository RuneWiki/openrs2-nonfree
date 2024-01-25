import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class88 {

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class88(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray13 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method2391(@OriginalArg(0) int arg0) {
		return this.aStringArray13[arg0];
	}
}
