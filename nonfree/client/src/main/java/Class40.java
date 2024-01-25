import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class40 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class40(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray12 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1063(@OriginalArg(1) int arg0) {
		return this.aStringArray12[arg0];
	}
}
