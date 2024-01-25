import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public volatile int anInt2822 = -1;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub16(@OriginalArg(0) String arg0) {
		this.aString23 = arg0;
	}
}
