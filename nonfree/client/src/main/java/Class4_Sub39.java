import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	public volatile int anInt7503 = -1;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub39(@OriginalArg(0) String arg0) {
		this.aString86 = arg0;
	}
}
