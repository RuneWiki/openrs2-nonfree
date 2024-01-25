import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class231 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray63;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class231(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray63 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5261(@OriginalArg(1) int arg0) {
		return this.aStringArray63[arg0];
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
