import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class11 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class11(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString3 = arg2;
		this.aString5 = arg0;
		this.aString4 = arg1;
	}
}
