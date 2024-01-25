import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public volatile int anInt1312 = -1;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub6(@OriginalArg(0) String arg0) {
		this.aString15 = arg0;
	}
}
