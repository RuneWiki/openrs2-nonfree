import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class213 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString61;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class213(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString61 = arg1;
		this.aString60 = arg0;
		this.aString59 = arg2;
	}
}
