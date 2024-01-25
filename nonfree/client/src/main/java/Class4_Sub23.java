import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public volatile int anInt4495 = -1;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub23(@OriginalArg(0) String arg0) {
		this.aString34 = arg0;
	}
}
