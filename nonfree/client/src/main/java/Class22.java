import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class22 {

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString13;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class22(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString12 = arg2;
		this.aString11 = arg0;
		this.aString13 = arg1;
	}
}
