import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class96 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class96(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray16 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1935(@OriginalArg(1) int arg0) {
		return this.aStringArray16[arg0];
	}
}
