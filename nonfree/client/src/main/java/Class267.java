import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class267 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray53;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class267(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray53 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6581(@OriginalArg(1) int arg0) {
		return this.aStringArray53[arg0];
	}
}
