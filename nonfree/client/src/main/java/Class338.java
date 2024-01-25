import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class338 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class338(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString102 = arg2;
		this.aString104 = arg0;
		this.aString103 = arg1;
	}
}
