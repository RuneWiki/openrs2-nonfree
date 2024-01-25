import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
	public volatile int anInt1412 = -1;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub7(@OriginalArg(0) String arg0) {
		this.aString5 = arg0;
	}
}
