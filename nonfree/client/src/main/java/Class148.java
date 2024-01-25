import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class148 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString32;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class148(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString30 = arg2;
		this.aString31 = arg1;
		this.aString32 = arg0;
	}
}
