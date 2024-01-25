import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class245 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class245(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString52 = arg1;
		this.aString53 = arg2;
		this.aString51 = arg0;
	}
}
