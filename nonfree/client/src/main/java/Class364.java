import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class364 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString105;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class364(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString104 = arg0;
		this.aString105 = arg2;
		this.aString103 = arg1;
	}
}
