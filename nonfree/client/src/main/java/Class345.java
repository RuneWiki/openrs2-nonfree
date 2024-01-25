import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class345 {

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString111;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class345(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString111 = arg1;
		this.aString110 = arg2;
		this.aString112 = arg0;
	}
}
