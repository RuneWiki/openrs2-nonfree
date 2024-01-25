import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public final class Class147 {

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!hka", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class147(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString55 = arg2;
		this.aString56 = arg1;
		this.aString57 = arg0;
	}
}
