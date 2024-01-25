import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public volatile int anInt930 = -1;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub12(@OriginalArg(0) String arg0) {
		this.aString3 = arg0;
	}
}
