import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public final class Class14 {

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class14(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString2 = arg2;
		this.aString4 = arg1;
		this.aString3 = arg0;
	}
}
