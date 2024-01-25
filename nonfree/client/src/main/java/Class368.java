import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class368 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString109;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString108;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class368(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString107 = arg1;
		this.aString109 = arg2;
		this.aString108 = arg0;
	}
}
