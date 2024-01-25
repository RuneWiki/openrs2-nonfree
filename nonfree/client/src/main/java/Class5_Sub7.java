import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public volatile int anInt969 = -1;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub7(@OriginalArg(0) String arg0) {
		this.aString17 = arg0;
	}
}
