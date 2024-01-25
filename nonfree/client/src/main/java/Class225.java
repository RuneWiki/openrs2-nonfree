import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class225 {

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class225(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString74 = arg2;
		this.aString73 = arg1;
		this.aString72 = arg0;
	}
}
