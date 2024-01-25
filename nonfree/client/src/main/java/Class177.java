import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class177 {

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class177(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString47 = arg0;
		this.aString45 = arg2;
		this.aString46 = arg1;
	}
}
