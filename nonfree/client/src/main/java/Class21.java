import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class21 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray2;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class21(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray2 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!bd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method362(@OriginalArg(0) int arg0) {
		return this.aStringArray2[arg0];
	}
}
