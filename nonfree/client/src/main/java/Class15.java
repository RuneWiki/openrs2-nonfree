import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class15 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class15(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray1 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method180(@OriginalArg(1) int arg0) {
		return this.aStringArray1[arg0];
	}

	@OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
