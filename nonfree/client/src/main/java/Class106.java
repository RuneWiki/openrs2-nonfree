import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class106 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class106(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString27 = arg2;
		this.aString28 = arg1;
		this.aString26 = arg0;
	}
}
