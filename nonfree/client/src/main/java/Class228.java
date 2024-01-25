import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class228 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString84;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class228(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString82 = arg2;
		this.aString83 = arg0;
		this.aString84 = arg1;
	}
}
