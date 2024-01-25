import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class32 {

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray27;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class32(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray27 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method701(@OriginalArg(0) int arg0) {
		return this.aStringArray27[arg0];
	}

	@OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
