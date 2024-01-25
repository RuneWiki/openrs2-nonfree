import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class91 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class91(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString15 = arg2;
		this.aString17 = arg1;
		this.aString16 = arg0;
	}
}
