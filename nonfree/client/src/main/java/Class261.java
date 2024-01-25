import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class261 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString88;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class261(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString88 = arg2;
		this.aString87 = arg0;
		this.aString89 = arg1;
	}
}
