import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class53 {

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class53(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString10 = arg0;
		this.aString12 = arg1;
		this.aString11 = arg2;
	}
}
