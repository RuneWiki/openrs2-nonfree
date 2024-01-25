import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
	public volatile int anInt4727 = -1;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub26(@OriginalArg(0) String arg0) {
		this.aString48 = arg0;
	}
}
