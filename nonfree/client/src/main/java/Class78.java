import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class78 {

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString29;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class78(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString28 = arg2;
		this.aString29 = arg0;
		this.aString27 = arg1;
	}
}
