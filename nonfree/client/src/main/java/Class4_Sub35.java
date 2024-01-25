import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class4_Sub35 extends Class4 {

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	public volatile int anInt5053 = -1;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub35(@OriginalArg(0) String arg0) {
		this.aString56 = arg0;
	}
}
