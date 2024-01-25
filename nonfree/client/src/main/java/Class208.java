import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class208 {

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString62;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class208(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString64 = arg2;
		this.aString63 = arg1;
		this.aString62 = arg0;
	}
}
