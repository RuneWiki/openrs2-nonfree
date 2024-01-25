import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class17 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class17(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString7 = arg0;
		this.aString8 = arg1;
		this.aString9 = arg2;
	}
}
