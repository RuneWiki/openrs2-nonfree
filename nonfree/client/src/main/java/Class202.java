import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class202 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray32;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class202(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray32 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5139(@OriginalArg(1) int arg0) {
		return this.aStringArray32[arg0];
	}

	@OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
