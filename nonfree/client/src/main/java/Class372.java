import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class372 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString115;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString113;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class372(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString114 = arg2;
		this.aString115 = arg0;
		this.aString113 = arg1;
	}
}
