import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	public volatile int anInt7574 = -1;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub42(@OriginalArg(0) String arg0) {
		this.aString82 = arg0;
	}
}
