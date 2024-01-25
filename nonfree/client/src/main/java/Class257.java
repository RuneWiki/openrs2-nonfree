import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class257 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class257(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString58 = arg1;
		this.aString57 = arg0;
		this.aString56 = arg2;
	}
}
