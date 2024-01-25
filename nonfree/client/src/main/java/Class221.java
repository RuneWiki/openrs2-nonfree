import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class221 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class221(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray39 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5229(@OriginalArg(1) int arg0) {
		return this.aStringArray39[arg0];
	}

	@OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
