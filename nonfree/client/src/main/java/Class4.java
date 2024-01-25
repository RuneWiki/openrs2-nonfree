import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class4 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class4(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString4 = arg2;
		this.aString3 = arg1;
		this.aString5 = arg0;
	}
}
