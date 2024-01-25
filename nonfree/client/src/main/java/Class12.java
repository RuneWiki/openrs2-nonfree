import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class12 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class12(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString4 = arg0;
		this.aString5 = arg2;
		this.aString3 = arg1;
	}
}
