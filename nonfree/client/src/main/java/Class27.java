import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class27 {

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class27(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString4 = arg2;
		this.aString5 = arg0;
		this.aString6 = arg1;
	}
}
