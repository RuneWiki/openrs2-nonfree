import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class239 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class239(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString56 = arg2;
		this.aString57 = arg0;
		this.aString58 = arg1;
	}
}
